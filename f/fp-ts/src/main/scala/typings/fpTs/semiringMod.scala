package typings.fpTs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object semiringMod {
  
  @JSImport("fp-ts/lib/Semiring", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getFunctionSemiring[A, B](S: Semiring[B]): Semiring[js.Function1[/* a */ A, B]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFunctionSemiring")(S.asInstanceOf[js.Any]).asInstanceOf[Semiring[js.Function1[/* a */ A, B]]]
  
  trait Semiring[A] extends StObject {
    
    def add(x: A, y: A): A
    
    def mul(x: A, y: A): A
    
    val one: A
    
    val zero: A
  }
  object Semiring {
    
    @scala.inline
    def apply[A](add: (A, A) => A, mul: (A, A) => A, one: A, zero: A): Semiring[A] = {
      val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), mul = js.Any.fromFunction2(mul), one = one.asInstanceOf[js.Any], zero = zero.asInstanceOf[js.Any])
      __obj.asInstanceOf[Semiring[A]]
    }
    
    @scala.inline
    implicit class SemiringMutableBuilder[Self <: Semiring[?], A] (val x: Self & Semiring[A]) extends AnyVal {
      
      @scala.inline
      def setAdd(value: (A, A) => A): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
      
      @scala.inline
      def setMul(value: (A, A) => A): Self = StObject.set(x, "mul", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOne(value: A): Self = StObject.set(x, "one", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZero(value: A): Self = StObject.set(x, "zero", value.asInstanceOf[js.Any])
    }
  }
}
