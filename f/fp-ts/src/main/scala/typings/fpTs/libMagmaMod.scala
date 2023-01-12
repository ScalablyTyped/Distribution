package typings.fpTs

import typings.fpTs.libEndomorphismMod.Endomorphism
import typings.fpTs.libPredicateMod.Predicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMagmaMod {
  
  @JSImport("fp-ts/lib/Magma", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatAll[A](M: Magma[A]): js.Function1[/* startWith */ A, js.Function1[/* as */ js.Array[A], A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("concatAll")(M.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* startWith */ A, js.Function1[/* as */ js.Array[A], A]]]
  
  inline def endo[A](f: Endomorphism[A]): js.Function1[/* M */ Magma[A], Magma[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("endo")(f.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* M */ Magma[A], Magma[A]]]
  
  inline def filterFirst[A](predicate: Predicate[A]): js.Function1[/* M */ Magma[A], Magma[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterFirst")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* M */ Magma[A], Magma[A]]]
  
  inline def filterSecond[A](predicate: Predicate[A]): js.Function1[/* M */ Magma[A], Magma[A]] = ^.asInstanceOf[js.Dynamic].applyDynamic("filterSecond")(predicate.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* M */ Magma[A], Magma[A]]]
  
  inline def reverse[A](M: Magma[A]): Magma[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(M.asInstanceOf[js.Any]).asInstanceOf[Magma[A]]
  
  trait Magma[A] extends StObject {
    
    def concat(x: A, y: A): A
  }
  object Magma {
    
    inline def apply[A](concat: (A, A) => A): Magma[A] = {
      val __obj = js.Dynamic.literal(concat = js.Any.fromFunction2(concat))
      __obj.asInstanceOf[Magma[A]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Magma[?], A] (val x: Self & Magma[A]) extends AnyVal {
      
      inline def setConcat(value: (A, A) => A): Self = StObject.set(x, "concat", js.Any.fromFunction2(value))
    }
  }
}
