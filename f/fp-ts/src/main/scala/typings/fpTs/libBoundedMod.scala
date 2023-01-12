package typings.fpTs

import typings.fpTs.libOrdMod.Ord_
import typings.fpTs.libOrderingMod.Ordering
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libBoundedMod {
  
  @JSImport("fp-ts/lib/Bounded", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("fp-ts/lib/Bounded", "boundedNumber")
  @js.native
  val boundedNumber: Bounded[Double] = js.native
  
  inline def clamp[A](B: Bounded[A]): js.Function1[/* a */ A, A] = ^.asInstanceOf[js.Dynamic].applyDynamic("clamp")(B.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* a */ A, A]]
  
  inline def reverse[A](B: Bounded[A]): Bounded[A] = ^.asInstanceOf[js.Dynamic].applyDynamic("reverse")(B.asInstanceOf[js.Any]).asInstanceOf[Bounded[A]]
  
  trait Bounded[A]
    extends StObject
       with Ord_[A] {
    
    val bottom: A
    
    val top: A
  }
  object Bounded {
    
    inline def apply[A](bottom: A, compare: (A, A) => Ordering, equals_ : (A, A) => Boolean, top: A): Bounded[A] = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], compare = js.Any.fromFunction2(compare), top = top.asInstanceOf[js.Any])
      __obj.updateDynamic("equals")(js.Any.fromFunction2(equals_))
      __obj.asInstanceOf[Bounded[A]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bounded[?], A] (val x: Self & Bounded[A]) extends AnyVal {
      
      inline def setBottom(value: A): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setTop(value: A): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
