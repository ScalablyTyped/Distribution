package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WindowScrollController
  extends StObject
     with ScrollController
object WindowScrollController {
  
  inline def apply(
    canScrollDown: () => Boolean,
    canScrollHorizontally: () => Boolean,
    canScrollLeft: () => Boolean,
    canScrollRight: () => Boolean,
    canScrollUp: () => Boolean,
    canScrollVertically: () => Boolean,
    getClientHeight: () => Double,
    getClientWidth: () => Double,
    getMaxScrollLeft: () => Double,
    getMaxScrollTop: () => Double,
    getScrollHeight: () => Double,
    getScrollLeft: () => Double,
    getScrollTop: () => Double,
    getScrollWidth: () => Double,
    setScrollLeft: Double => Unit,
    setScrollTop: Double => Unit
  ): WindowScrollController = {
    val __obj = js.Dynamic.literal(canScrollDown = js.Any.fromFunction0(canScrollDown), canScrollHorizontally = js.Any.fromFunction0(canScrollHorizontally), canScrollLeft = js.Any.fromFunction0(canScrollLeft), canScrollRight = js.Any.fromFunction0(canScrollRight), canScrollUp = js.Any.fromFunction0(canScrollUp), canScrollVertically = js.Any.fromFunction0(canScrollVertically), getClientHeight = js.Any.fromFunction0(getClientHeight), getClientWidth = js.Any.fromFunction0(getClientWidth), getMaxScrollLeft = js.Any.fromFunction0(getMaxScrollLeft), getMaxScrollTop = js.Any.fromFunction0(getMaxScrollTop), getScrollHeight = js.Any.fromFunction0(getScrollHeight), getScrollLeft = js.Any.fromFunction0(getScrollLeft), getScrollTop = js.Any.fromFunction0(getScrollTop), getScrollWidth = js.Any.fromFunction0(getScrollWidth), setScrollLeft = js.Any.fromFunction1(setScrollLeft), setScrollTop = js.Any.fromFunction1(setScrollTop))
    __obj.asInstanceOf[WindowScrollController]
  }
}
