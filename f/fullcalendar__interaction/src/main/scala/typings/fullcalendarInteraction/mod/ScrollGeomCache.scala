package typings.fullcalendarInteraction.mod

import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScrollController * / any */ trait ScrollGeomCache extends StObject {
  
  /* protected */ var clientHeight: Double
  
  var clientRect: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rect */ Any
  
  /* protected */ var clientWidth: Double
  
  def computeClientRect(): Any
  
  def destroy(): Unit
  
  /* protected */ var doesListening: Boolean
  
  def getClientHeight(): Double
  
  def getClientWidth(): Double
  
  def getEventTarget(): EventTarget
  
  def getScrollHeight(): Double
  
  def getScrollLeft(): Double
  
  def getScrollTop(): Double
  
  def getScrollWidth(): Double
  
  def handleScroll(): Unit
  
  def handleScrollChange(): Unit
  
  var origScrollLeft: Double
  
  var origScrollTop: Double
  
  /* protected */ var scrollController: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScrollController */ Any
  
  /* protected */ var scrollHeight: Double
  
  /* protected */ var scrollLeft: Double
  
  /* protected */ var scrollTop: Double
  
  /* protected */ var scrollWidth: Double
  
  def setScrollLeft(top: Double): Unit
  
  def setScrollTop(top: Double): Unit
}
object ScrollGeomCache {
  
  inline def apply(
    clientHeight: Double,
    clientRect: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rect */ Any,
    clientWidth: Double,
    computeClientRect: () => Any,
    destroy: () => Unit,
    doesListening: Boolean,
    getClientHeight: () => Double,
    getClientWidth: () => Double,
    getEventTarget: () => EventTarget,
    getScrollHeight: () => Double,
    getScrollLeft: () => Double,
    getScrollTop: () => Double,
    getScrollWidth: () => Double,
    handleScroll: () => Unit,
    handleScrollChange: () => Unit,
    origScrollLeft: Double,
    origScrollTop: Double,
    scrollController: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScrollController */ Any,
    scrollHeight: Double,
    scrollLeft: Double,
    scrollTop: Double,
    scrollWidth: Double,
    setScrollLeft: Double => Unit,
    setScrollTop: Double => Unit
  ): ScrollGeomCache = {
    val __obj = js.Dynamic.literal(clientHeight = clientHeight.asInstanceOf[js.Any], clientRect = clientRect.asInstanceOf[js.Any], clientWidth = clientWidth.asInstanceOf[js.Any], computeClientRect = js.Any.fromFunction0(computeClientRect), destroy = js.Any.fromFunction0(destroy), doesListening = doesListening.asInstanceOf[js.Any], getClientHeight = js.Any.fromFunction0(getClientHeight), getClientWidth = js.Any.fromFunction0(getClientWidth), getEventTarget = js.Any.fromFunction0(getEventTarget), getScrollHeight = js.Any.fromFunction0(getScrollHeight), getScrollLeft = js.Any.fromFunction0(getScrollLeft), getScrollTop = js.Any.fromFunction0(getScrollTop), getScrollWidth = js.Any.fromFunction0(getScrollWidth), handleScroll = js.Any.fromFunction0(handleScroll), handleScrollChange = js.Any.fromFunction0(handleScrollChange), origScrollLeft = origScrollLeft.asInstanceOf[js.Any], origScrollTop = origScrollTop.asInstanceOf[js.Any], scrollController = scrollController.asInstanceOf[js.Any], scrollHeight = scrollHeight.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any], scrollWidth = scrollWidth.asInstanceOf[js.Any], setScrollLeft = js.Any.fromFunction1(setScrollLeft), setScrollTop = js.Any.fromFunction1(setScrollTop))
    __obj.asInstanceOf[ScrollGeomCache]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScrollGeomCache] (val x: Self) extends AnyVal {
    
    inline def setClientHeight(value: Double): Self = StObject.set(x, "clientHeight", value.asInstanceOf[js.Any])
    
    inline def setClientRect(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Rect */ Any
    ): Self = StObject.set(x, "clientRect", value.asInstanceOf[js.Any])
    
    inline def setClientWidth(value: Double): Self = StObject.set(x, "clientWidth", value.asInstanceOf[js.Any])
    
    inline def setComputeClientRect(value: () => Any): Self = StObject.set(x, "computeClientRect", js.Any.fromFunction0(value))
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDoesListening(value: Boolean): Self = StObject.set(x, "doesListening", value.asInstanceOf[js.Any])
    
    inline def setGetClientHeight(value: () => Double): Self = StObject.set(x, "getClientHeight", js.Any.fromFunction0(value))
    
    inline def setGetClientWidth(value: () => Double): Self = StObject.set(x, "getClientWidth", js.Any.fromFunction0(value))
    
    inline def setGetEventTarget(value: () => EventTarget): Self = StObject.set(x, "getEventTarget", js.Any.fromFunction0(value))
    
    inline def setGetScrollHeight(value: () => Double): Self = StObject.set(x, "getScrollHeight", js.Any.fromFunction0(value))
    
    inline def setGetScrollLeft(value: () => Double): Self = StObject.set(x, "getScrollLeft", js.Any.fromFunction0(value))
    
    inline def setGetScrollTop(value: () => Double): Self = StObject.set(x, "getScrollTop", js.Any.fromFunction0(value))
    
    inline def setGetScrollWidth(value: () => Double): Self = StObject.set(x, "getScrollWidth", js.Any.fromFunction0(value))
    
    inline def setHandleScroll(value: () => Unit): Self = StObject.set(x, "handleScroll", js.Any.fromFunction0(value))
    
    inline def setHandleScrollChange(value: () => Unit): Self = StObject.set(x, "handleScrollChange", js.Any.fromFunction0(value))
    
    inline def setOrigScrollLeft(value: Double): Self = StObject.set(x, "origScrollLeft", value.asInstanceOf[js.Any])
    
    inline def setOrigScrollTop(value: Double): Self = StObject.set(x, "origScrollTop", value.asInstanceOf[js.Any])
    
    inline def setScrollController(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ScrollController */ Any
    ): Self = StObject.set(x, "scrollController", value.asInstanceOf[js.Any])
    
    inline def setScrollHeight(value: Double): Self = StObject.set(x, "scrollHeight", value.asInstanceOf[js.Any])
    
    inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    
    inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    
    inline def setScrollWidth(value: Double): Self = StObject.set(x, "scrollWidth", value.asInstanceOf[js.Any])
    
    inline def setSetScrollLeft(value: Double => Unit): Self = StObject.set(x, "setScrollLeft", js.Any.fromFunction1(value))
    
    inline def setSetScrollTop(value: Double => Unit): Self = StObject.set(x, "setScrollTop", js.Any.fromFunction1(value))
  }
}
