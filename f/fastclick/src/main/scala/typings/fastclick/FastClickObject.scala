package typings.fastclick

import typings.std.Element
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FastClickObject extends StObject {
  
  def destroy(): Unit = js.native
  
  def determineEventType(targetElement: js.Any): String = js.native
  
  def findControl(labelElement: js.Any): js.Any = js.native
  
  def focus(targetElement: js.Any): Unit = js.native
  
  def getTargetElementFromEventTarget(eventTarget: EventTarget): js.Any = js.native
  
  var lastTouchIdentifier: Double = js.native
  
  var layer: Element = js.native
  
  def needsClick(target: js.Any): Boolean = js.native
  
  def needsFocus(target: js.Any): Boolean = js.native
  
  var tapDelay: Double = js.native
  
  var targetElement: js.Any = js.native
  
  var touchBoundary: Double = js.native
  
  var touchStartX: Double = js.native
  
  var touchStartY: Double = js.native
  
  var trackingClick: Boolean = js.native
  
  var trackingClickStart: Double = js.native
}
object FastClickObject {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class FastClickObjectMutableBuilder[Self <: FastClickObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDetermineEventType(value: js.Any => String): Self = StObject.set(x, "determineEventType", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindControl(value: js.Any => js.Any): Self = StObject.set(x, "findControl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFocus(value: js.Any => Unit): Self = StObject.set(x, "focus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTargetElementFromEventTarget(value: EventTarget => js.Any): Self = StObject.set(x, "getTargetElementFromEventTarget", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLastTouchIdentifier(value: Double): Self = StObject.set(x, "lastTouchIdentifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayer(value: Element): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedsClick(value: js.Any => Boolean): Self = StObject.set(x, "needsClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setNeedsFocus(value: js.Any => Boolean): Self = StObject.set(x, "needsFocus", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTapDelay(value: Double): Self = StObject.set(x, "tapDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetElement(value: js.Any): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchBoundary(value: Double): Self = StObject.set(x, "touchBoundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchStartX(value: Double): Self = StObject.set(x, "touchStartX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTouchStartY(value: Double): Self = StObject.set(x, "touchStartY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingClick(value: Boolean): Self = StObject.set(x, "trackingClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackingClickStart(value: Double): Self = StObject.set(x, "trackingClickStart", value.asInstanceOf[js.Any])
  }
}
