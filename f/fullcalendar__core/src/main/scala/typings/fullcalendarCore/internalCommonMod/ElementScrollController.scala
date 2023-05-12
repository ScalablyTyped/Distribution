package typings.fullcalendarCore.internalCommonMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementScrollController
  extends StObject
     with ScrollController {
  
  var el: HTMLElement
}
object ElementScrollController {
  
  inline def apply(
    canScrollDown: () => Boolean,
    canScrollHorizontally: () => Boolean,
    canScrollLeft: () => Boolean,
    canScrollRight: () => Boolean,
    canScrollUp: () => Boolean,
    canScrollVertically: () => Boolean,
    el: HTMLElement,
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
  ): ElementScrollController = {
    val __obj = js.Dynamic.literal(canScrollDown = js.Any.fromFunction0(canScrollDown), canScrollHorizontally = js.Any.fromFunction0(canScrollHorizontally), canScrollLeft = js.Any.fromFunction0(canScrollLeft), canScrollRight = js.Any.fromFunction0(canScrollRight), canScrollUp = js.Any.fromFunction0(canScrollUp), canScrollVertically = js.Any.fromFunction0(canScrollVertically), el = el.asInstanceOf[js.Any], getClientHeight = js.Any.fromFunction0(getClientHeight), getClientWidth = js.Any.fromFunction0(getClientWidth), getMaxScrollLeft = js.Any.fromFunction0(getMaxScrollLeft), getMaxScrollTop = js.Any.fromFunction0(getMaxScrollTop), getScrollHeight = js.Any.fromFunction0(getScrollHeight), getScrollLeft = js.Any.fromFunction0(getScrollLeft), getScrollTop = js.Any.fromFunction0(getScrollTop), getScrollWidth = js.Any.fromFunction0(getScrollWidth), setScrollLeft = js.Any.fromFunction1(setScrollLeft), setScrollTop = js.Any.fromFunction1(setScrollTop))
    __obj.asInstanceOf[ElementScrollController]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElementScrollController] (val x: Self) extends AnyVal {
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
  }
}
