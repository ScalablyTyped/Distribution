package typings.fpTs

import typings.fpTs.libBoundedDistributiveLatticeMod.BoundedDistributiveLattice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHeytingAlgebraMod {
  
  trait HeytingAlgebra[A]
    extends StObject
       with BoundedDistributiveLattice[A] {
    
    def implies(x: A, y: A): A
    
    def not(x: A): A
  }
  object HeytingAlgebra {
    
    inline def apply[A](implies: (A, A) => A, join: (A, A) => A, meet: (A, A) => A, not: A => A, one: A, zero: A): HeytingAlgebra[A] = {
      val __obj = js.Dynamic.literal(implies = js.Any.fromFunction2(implies), join = js.Any.fromFunction2(join), meet = js.Any.fromFunction2(meet), not = js.Any.fromFunction1(not), one = one.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeytingAlgebra[A]]
    }
    
    extension [Self <: HeytingAlgebra[?], A](x: Self & HeytingAlgebra[A]) {
      
      inline def setImplies(value: (A, A) => A): Self = StObject.set(x, "implies", js.Any.fromFunction2(value))
      
      inline def setNot(value: A => A): Self = StObject.set(x, "not", js.Any.fromFunction1(value))
    }
  }
}
