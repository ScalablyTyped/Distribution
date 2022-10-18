package typings.fpTs

import typings.fpTs.libMonoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGroupMod {
  
  trait Group[A]
    extends StObject
       with Monoid[A] {
    
    def inverse(a: A): A
  }
  object Group {
    
    inline def apply[A](concat: (A, A) => A, empty: A, inverse: A => A): Group[A] = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction2(concat), empty = empty.asInstanceOf[js.Any], inverse = js.Any.fromFunction1(inverse))
      __obj.asInstanceOf[Group[A]]
    }
    
    extension [Self <: Group[?], A](x: Self & Group[A]) {
      
      inline def setInverse(value: A => A): Self = StObject.set(x, "inverse", js.Any.fromFunction1(value))
    }
  }
}
