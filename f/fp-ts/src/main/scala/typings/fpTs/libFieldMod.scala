package typings.fpTs

import typings.fpTs.libEqMod.Eq
import typings.fpTs.libRingMod.Ring
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFieldMod {
  
  @JSImport("fp-ts/lib/Field", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Field", "fieldNumber")
  @js.native
  val fieldNumber: Field[Double] = js.native
  
  inline def gcd[A](E: Eq[A], field: Field[A]): js.Function2[/* x */ A, /* y */ A, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("gcd")(E.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* x */ A, /* y */ A, A]]
  
  inline def lcm[A](E: Eq[A], F: Field[A]): js.Function2[/* x */ A, /* y */ A, A] = (^.asInstanceOf[js.Dynamic].applyDynamic("lcm")(E.asInstanceOf[js.Any], F.asInstanceOf[js.Any])).asInstanceOf[js.Function2[/* x */ A, /* y */ A, A]]
  
  trait Field[A]
    extends StObject
       with Ring[A] {
    
    def degree(a: A): Double
    
    def div(x: A, y: A): A
    
    def mod(x: A, y: A): A
  }
  object Field {
    
    inline def apply[A](
      add: (A, A) => A,
      degree: A => Double,
      div: (A, A) => A,
      mod: (A, A) => A,
      mul: (A, A) => A,
      one: A,
      sub: (A, A) => A,
      zero: A
    ): Field[A] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), degree = js.Any.fromFunction1(degree), div = js.Any.fromFunction2(div), mod = js.Any.fromFunction2(mod), mul = js.Any.fromFunction2(mul), one = one.asInstanceOf[js.Any], sub = js.Any.fromFunction2(sub), zero = zero.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field[A]]
    }
    
    extension [Self <: Field[?], A](x: Self & Field[A]) {
      
      inline def setDegree(value: A => Double): Self = StObject.set(x, "degree", js.Any.fromFunction1(value))
      
      inline def setDiv(value: (A, A) => A): Self = StObject.set(x, "div", js.Any.fromFunction2(value))
      
      inline def setMod(value: (A, A) => A): Self = StObject.set(x, "mod", js.Any.fromFunction2(value))
    }
  }
}
