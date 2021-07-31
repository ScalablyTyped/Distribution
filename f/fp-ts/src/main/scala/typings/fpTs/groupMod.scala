package typings.fpTs

import typings.fpTs.monoidMod.Monoid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object groupMod {
  
  trait Group[A]
    extends StObject
       with Monoid[A] {
    
    def inverse(a: A): A
  }
  object Group {
    
    @scala.inline
    def apply[A](concat: (A, A) => A, empty: A, inverse: A => A): Group[A] = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction2(concat), empty = empty.asInstanceOf[js.Any], inverse = js.Any.fromFunction1(inverse))
      __obj.asInstanceOf[Group[A]]
    }
    
    @scala.inline
    implicit class GroupMutableBuilder[Self <: Group[?], A] (val x: Self & Group[A]) extends AnyVal {
      
      @scala.inline
      def setInverse(value: A => A): Self = StObject.set(x, "inverse", js.Any.fromFunction1(value))
    }
  }
}
