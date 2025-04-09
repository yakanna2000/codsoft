import java.util.*;

import javax.crypto.interfaces.DHKey;
public class amstrong {
    public static void main(String[] args)
    {
       int n,c,r,sum=0;
       Scanner am=new Scanner(System.in);
       System.out.println("enter the num");
       n=am.nextInt();
       c=n;
       while(n>0)
       {
          r=n%10;
          sum=sum+(r*r*r);
          n=n/10;
       }
       if(c==sum)
       {
        System.out.println("amstrong");
       }
       else{
        System.out.println("not amstrong");
       }
    }
}
