package typings.fpTs

import typings.fpTs.ordMod.Ord_
import typings.fpTs.orderingMod.Ordering
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boundedMod {
  
  @JSImport("fp-ts/lib/Bounded", "boundedNumber")
  @js.native
  val boundedNumber: Bounded[Double] = js.native
  
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
    
    extension [Self <: Bounded[?], A](x: Self & Bounded[A]) {
      
      inline def setBottom(value: A): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setTop(value: A): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
