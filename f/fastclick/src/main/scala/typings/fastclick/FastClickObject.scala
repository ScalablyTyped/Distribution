package typings.fastclick

import typings.std.Element
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastClickObject extends StObject {
  
  def destroy(): Unit
  
  def determineEventType(targetElement: Any): String
  
  def findControl(labelElement: Any): Any
  
  def focus(targetElement: Any): Unit
  
  def getTargetElementFromEventTarget(eventTarget: EventTarget): Any
  
  var lastTouchIdentifier: Double
  
  var layer: Element
  
  def needsClick(target: Any): Boolean
  
  def needsFocus(target: Any): Boolean
  
  var tapDelay: Double
  
  var targetElement: Any
  
  var touchBoundary: Double
  
  var touchStartX: Double
  
  var touchStartY: Double
  
  var trackingClick: Boolean
  
  var trackingClickStart: Double
}
object FastClickObject {
  
  inline def apply(
    destroy: () => Unit,
    determineEventType: Any => String,
    findControl: Any => Any,
    focus: Any => Unit,
    getTargetElementFromEventTarget: EventTarget => Any,
    lastTouchIdentifier: Double,
    layer: Element,
    needsClick: Any => Boolean,
    needsFocus: Any => Boolean,
    tapDelay: Double,
    targetElement: Any,
    touchBoundary: Double,
    touchStartX: Double,
    touchStartY: Double,
    trackingClick: Boolean,
    trackingClickStart: Double
  ): FastClickObject = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), determineEventType = js.Any.fromFunction1(determineEventType), findControl = js.Any.fromFunction1(findControl), focus = js.Any.fromFunction1(focus), getTargetElementFromEventTarget = js.Any.fromFunction1(getTargetElementFromEventTarget), lastTouchIdentifier = lastTouchIdentifier.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], needsClick = js.Any.fromFunction1(needsClick), needsFocus = js.Any.fromFunction1(needsFocus), tapDelay = tapDelay.asInstanceOf[js.Any], targetElement = targetElement.asInstanceOf[js.Any], touchBoundary = touchBoundary.asInstanceOf[js.Any], touchStartX = touchStartX.asInstanceOf[js.Any], touchStartY = touchStartY.asInstanceOf[js.Any], trackingClick = trackingClick.asInstanceOf[js.Any], trackingClickStart = trackingClickStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastClickObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FastClickObject] (val x: Self) extends AnyVal {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDetermineEventType(value: Any => String): Self = StObject.set(x, "determineEventType", js.Any.fromFunction1(value))
    
    inline def setFindControl(value: Any => Any): Self = StObject.set(x, "findControl", js.Any.fromFunction1(value))
    
    inline def setFocus(value: Any => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
    
    inline def setGetTargetElementFromEventTarget(value: EventTarget => Any): Self = StObject.set(x, "getTargetElementFromEventTarget", js.Any.fromFunction1(value))
    
    inline def setLastTouchIdentifier(value: Double): Self = StObject.set(x, "lastTouchIdentifier", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: Element): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setNeedsClick(value: Any => Boolean): Self = StObject.set(x, "needsClick", js.Any.fromFunction1(value))
    
    inline def setNeedsFocus(value: Any => Boolean): Self = StObject.set(x, "needsFocus", js.Any.fromFunction1(value))
    
    inline def setTapDelay(value: Double): Self = StObject.set(x, "tapDelay", value.asInstanceOf[js.Any])
    
    inline def setTargetElement(value: Any): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
    
    inline def setTouchBoundary(value: Double): Self = StObject.set(x, "touchBoundary", value.asInstanceOf[js.Any])
    
    inline def setTouchStartX(value: Double): Self = StObject.set(x, "touchStartX", value.asInstanceOf[js.Any])
    
    inline def setTouchStartY(value: Double): Self = StObject.set(x, "touchStartY", value.asInstanceOf[js.Any])
    
    inline def setTrackingClick(value: Boolean): Self = StObject.set(x, "trackingClick", value.asInstanceOf[js.Any])
    
    inline def setTrackingClickStart(value: Double): Self = StObject.set(x, "trackingClickStart", value.asInstanceOf[js.Any])
  }
}
