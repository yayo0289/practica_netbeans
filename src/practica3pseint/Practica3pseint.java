/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3pseint;

/**
 *
 * @author yayoh
 */
import java.util.Scanner;
public class Practica3pseint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("grado que desea convertir:     1.-F a C     2.-C a F");
        int g=sc.nextInt();
        if(g==1){
            System.out.println("ingresa grado F:");
            float f=sc.nextFloat();
            float c;
            c=(f-32)+5/9;
            System.out.println("la temperatura en grados C es:"+c);    
        }
        else if(g==2){
            System.out.println("ingres ala temperatura C: ");
            float c=sc.nextFloat();
            float f;
            f=(c*9/5)+32;
            System.out.println("la temperatura en grados F es: "+f);
            
        }
        

    }
    
}
