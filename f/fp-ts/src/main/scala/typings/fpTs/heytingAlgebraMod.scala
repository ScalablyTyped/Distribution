package typings.fpTs

import typings.fpTs.boundedDistributiveLatticeMod.BoundedDistributiveLattice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heytingAlgebraMod {
  
  trait HeytingAlgebra[A]
    extends StObject
       with BoundedDistributiveLattice[A] {
    
    def implies(x: A, y: A): A
    
    def not(x: A): A
  }
  object HeytingAlgebra {
    
    @scala.inline
    def apply[A](implies: (A, A) => A, join: (A, A) => A, meet: (A, A) => A, not: A => A, one: A, zero: A): HeytingAlgebra[A] = {
      val __obj = js.Dynamic.literal(implies = js.Any.fromFunction2(implies), join = js.Any.fromFunction2(join), meet = js.Any.fromFunction2(meet), not = js.Any.fromFunction1(not), one = one.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeytingAlgebra[A]]
    }
    
    @scala.inline
    implicit class HeytingAlgebraMutableBuilder[Self <: HeytingAlgebra[?], A] (val x: Self & HeytingAlgebra[A]) extends AnyVal {
      
      @scala.inline
      def setImplies(value: (A, A) => A): Self = StObject.set(x, "implies", js.Any.fromFunction2(value))
      
      @scala.inline
      def setNot(value: A => A): Self = StObject.set(x, "not", js.Any.fromFunction1(value))
    }
  }
}
