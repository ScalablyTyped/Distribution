package typings.fpTs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object magmaMod {
  
  trait Magma[A] extends StObject {
    
    def concat(x: A, y: A): A
  }
  object Magma {
    
    @scala.inline
    def apply[A](concat: (A, A) => A): Magma[A] = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction2(concat))
      __obj.asInstanceOf[Magma[A]]
    }
    
    @scala.inline
    implicit class MagmaMutableBuilder[Self <: Magma[?], A] (val x: Self & Magma[A]) extends AnyVal {
      
      @scala.inline
      def setConcat(value: (A, A) => A): Self = StObject.set(x, "concat", js.Any.fromFunction2(value))
    }
  }
}
