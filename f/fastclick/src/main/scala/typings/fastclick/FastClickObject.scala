package typings.fastclick

import typings.std.Element
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FastClickObject extends StObject {
  
  def destroy(): Unit
  
  def determineEventType(targetElement: js.Any): String
  
  def findControl(labelElement: js.Any): js.Any
  
  def focus(targetElement: js.Any): Unit
  
  def getTargetElementFromEventTarget(eventTarget: EventTarget): js.Any
  
  var lastTouchIdentifier: Double
  
  var layer: Element
  
  def needsClick(target: js.Any): Boolean
  
  def needsFocus(target: js.Any): Boolean
  
  var tapDelay: Double
  
  var targetElement: js.Any
  
  var touchBoundary: Double
  
  var touchStartX: Double
  
  var touchStartY: Double
  
  var trackingClick: Boolean
  
  var trackingClickStart: Double
}
object FastClickObject {
  
  inline def apply(
    destroy: () => Unit,
    determineEventType: js.Any => String,
    findControl: js.Any => js.Any,
    focus: js.Any => Unit,
    getTargetElementFromEventTarget: EventTarget => js.Any,
    lastTouchIdentifier: Double,
    layer: Element,
    needsClick: js.Any => Boolean,
    needsFocus: js.Any => Boolean,
    tapDelay: Double,
    targetElement: js.Any,
    touchBoundary: Double,
    touchStartX: Double,
    touchStartY: Double,
    trackingClick: Boolean,
    trackingClickStart: Double
  ): FastClickObject = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), determineEventType = js.Any.fromFunction1(determineEventType), findControl = js.Any.fromFunction1(findControl), focus = js.Any.fromFunction1(focus), getTargetElementFromEventTarget = js.Any.fromFunction1(getTargetElementFromEventTarget), lastTouchIdentifier = lastTouchIdentifier.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], needsClick = js.Any.fromFunction1(needsClick), needsFocus = js.Any.fromFunction1(needsFocus), tapDelay = tapDelay.asInstanceOf[js.Any], targetElement = targetElement.asInstanceOf[js.Any], touchBoundary = touchBoundary.asInstanceOf[js.Any], touchStartX = touchStartX.asInstanceOf[js.Any], touchStartY = touchStartY.asInstanceOf[js.Any], trackingClick = trackingClick.asInstanceOf[js.Any], trackingClickStart = trackingClickStart.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastClickObject]
  }
  
  extension [Self <: FastClickObject](x: Self) {
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setDetermineEventType(value: js.Any => String): Self = StObject.set(x, "determineEventType", js.Any.fromFunction1(value))
    
    inline def setFindControl(value: js.Any => js.Any): Self = StObject.set(x, "findControl", js.Any.fromFunction1(value))
    
    inline def setFocus(value: js.Any => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
    
    inline def setGetTargetElementFromEventTarget(value: EventTarget => js.Any): Self = StObject.set(x, "getTargetElementFromEventTarget", js.Any.fromFunction1(value))
    
    inline def setLastTouchIdentifier(value: Double): Self = StObject.set(x, "lastTouchIdentifier", value.asInstanceOf[js.Any])
    
    inline def setLayer(value: Element): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setNeedsClick(value: js.Any => Boolean): Self = StObject.set(x, "needsClick", js.Any.fromFunction1(value))
    
    inline def setNeedsFocus(value: js.Any => Boolean): Self = StObject.set(x, "needsFocus", js.Any.fromFunction1(value))
    
    inline def setTapDelay(value: Double): Self = StObject.set(x, "tapDelay", value.asInstanceOf[js.Any])
    
    inline def setTargetElement(value: js.Any): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
    
    inline def setTouchBoundary(value: Double): Self = StObject.set(x, "touchBoundary", value.asInstanceOf[js.Any])
    
    inline def setTouchStartX(value: Double): Self = StObject.set(x, "touchStartX", value.asInstanceOf[js.Any])
    
    inline def setTouchStartY(value: Double): Self = StObject.set(x, "touchStartY", value.asInstanceOf[js.Any])
    
    inline def setTrackingClick(value: Boolean): Self = StObject.set(x, "trackingClick", value.asInstanceOf[js.Any])
    
    inline def setTrackingClickStart(value: Double): Self = StObject.set(x, "trackingClickStart", value.asInstanceOf[js.Any])
  }
}
