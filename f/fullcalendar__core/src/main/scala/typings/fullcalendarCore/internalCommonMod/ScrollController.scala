package typings.fullcalendarCore.internalCommonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScrollController extends StObject {
  
  def canScrollDown(): Boolean
  
  def canScrollHorizontally(): Boolean
  
  def canScrollLeft(): Boolean
  
  def canScrollRight(): Boolean
  
  def canScrollUp(): Boolean
  
  def canScrollVertically(): Boolean
  
  def getClientHeight(): Double
  
  def getClientWidth(): Double
  
  def getMaxScrollLeft(): Double
  
  def getMaxScrollTop(): Double
  
  def getScrollHeight(): Double
  
  def getScrollLeft(): Double
  
  def getScrollTop(): Double
  
  def getScrollWidth(): Double
  
  def setScrollLeft(left: Double): Unit
  
  def setScrollTop(top: Double): Unit
}
object ScrollController {
  
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
  ): ScrollController = {
    val __obj = js.Dynamic.literal(canScrollDown = js.Any.fromFunction0(canScrollDown), canScrollHorizontally = js.Any.fromFunction0(canScrollHorizontally), canScrollLeft = js.Any.fromFunction0(canScrollLeft), canScrollRight = js.Any.fromFunction0(canScrollRight), canScrollUp = js.Any.fromFunction0(canScrollUp), canScrollVertically = js.Any.fromFunction0(canScrollVertically), getClientHeight = js.Any.fromFunction0(getClientHeight), getClientWidth = js.Any.fromFunction0(getClientWidth), getMaxScrollLeft = js.Any.fromFunction0(getMaxScrollLeft), getMaxScrollTop = js.Any.fromFunction0(getMaxScrollTop), getScrollHeight = js.Any.fromFunction0(getScrollHeight), getScrollLeft = js.Any.fromFunction0(getScrollLeft), getScrollTop = js.Any.fromFunction0(getScrollTop), getScrollWidth = js.Any.fromFunction0(getScrollWidth), setScrollLeft = js.Any.fromFunction1(setScrollLeft), setScrollTop = js.Any.fromFunction1(setScrollTop))
    __obj.asInstanceOf[ScrollController]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollController] (val x: Self) extends AnyVal {
    
    inline def setCanScrollDown(value: () => Boolean): Self = StObject.set(x, "canScrollDown", js.Any.fromFunction0(value))
    
    inline def setCanScrollHorizontally(value: () => Boolean): Self = StObject.set(x, "canScrollHorizontally", js.Any.fromFunction0(value))
    
    inline def setCanScrollLeft(value: () => Boolean): Self = StObject.set(x, "canScrollLeft", js.Any.fromFunction0(value))
    
    inline def setCanScrollRight(value: () => Boolean): Self = StObject.set(x, "canScrollRight", js.Any.fromFunction0(value))
    
    inline def setCanScrollUp(value: () => Boolean): Self = StObject.set(x, "canScrollUp", js.Any.fromFunction0(value))
    
    inline def setCanScrollVertically(value: () => Boolean): Self = StObject.set(x, "canScrollVertically", js.Any.fromFunction0(value))
    
    inline def setGetClientHeight(value: () => Double): Self = StObject.set(x, "getClientHeight", js.Any.fromFunction0(value))
    
    inline def setGetClientWidth(value: () => Double): Self = StObject.set(x, "getClientWidth", js.Any.fromFunction0(value))
    
    inline def setGetMaxScrollLeft(value: () => Double): Self = StObject.set(x, "getMaxScrollLeft", js.Any.fromFunction0(value))
    
    inline def setGetMaxScrollTop(value: () => Double): Self = StObject.set(x, "getMaxScrollTop", js.Any.fromFunction0(value))
    
    inline def setGetScrollHeight(value: () => Double): Self = StObject.set(x, "getScrollHeight", js.Any.fromFunction0(value))
    
    inline def setGetScrollLeft(value: () => Double): Self = StObject.set(x, "getScrollLeft", js.Any.fromFunction0(value))
    
    inline def setGetScrollTop(value: () => Double): Self = StObject.set(x, "getScrollTop", js.Any.fromFunction0(value))
    
    inline def setGetScrollWidth(value: () => Double): Self = StObject.set(x, "getScrollWidth", js.Any.fromFunction0(value))
    
    inline def setSetScrollLeft(value: Double => Unit): Self = StObject.set(x, "setScrollLeft", js.Any.fromFunction1(value))
    
    inline def setSetScrollTop(value: Double => Unit): Self = StObject.set(x, "setScrollTop", js.Any.fromFunction1(value))
  }
}
