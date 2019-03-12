package typings
package fastclickLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastClickObject extends js.Object {
  var lastTouchIdentifier: scala.Double
  var layer: stdLib.Element
  var tapDelay: scala.Double
  var targetElement: js.Any
  var touchBoundary: scala.Double
  var touchStartX: scala.Double
  var touchStartY: scala.Double
  var trackingClick: scala.Boolean
  var trackingClickStart: scala.Double
  def destroy(): scala.Unit
  def determineEventType(targetElement: js.Any): java.lang.String
  def findControl(labelElement: js.Any): js.Any
  def focus(targetElement: js.Any): scala.Unit
  def getTargetElementFromEventTarget(eventTarget: stdLib.EventTarget): js.Any
  def needsClick(target: js.Any): scala.Boolean
  def needsFocus(target: js.Any): scala.Boolean
}

object FastClickObject {
  @scala.inline
  def apply(
    destroy: () => scala.Unit,
    determineEventType: js.Any => java.lang.String,
    findControl: js.Any => js.Any,
    focus: js.Any => scala.Unit,
    getTargetElementFromEventTarget: stdLib.EventTarget => js.Any,
    lastTouchIdentifier: scala.Double,
    layer: stdLib.Element,
    needsClick: js.Any => scala.Boolean,
    needsFocus: js.Any => scala.Boolean,
    tapDelay: scala.Double,
    targetElement: js.Any,
    touchBoundary: scala.Double,
    touchStartX: scala.Double,
    touchStartY: scala.Double,
    trackingClick: scala.Boolean,
    trackingClickStart: scala.Double
  ): FastClickObject = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), determineEventType = js.Any.fromFunction1(determineEventType), findControl = js.Any.fromFunction1(findControl), focus = js.Any.fromFunction1(focus), getTargetElementFromEventTarget = js.Any.fromFunction1(getTargetElementFromEventTarget), lastTouchIdentifier = lastTouchIdentifier, layer = layer, needsClick = js.Any.fromFunction1(needsClick), needsFocus = js.Any.fromFunction1(needsFocus), tapDelay = tapDelay, targetElement = targetElement, touchBoundary = touchBoundary, touchStartX = touchStartX, touchStartY = touchStartY, trackingClick = trackingClick, trackingClickStart = trackingClickStart)
  
    __obj.asInstanceOf[FastClickObject]
  }
}

