package typings.fastclick

import typings.std.Element
import typings.std.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FastClickObject extends js.Object {
  var lastTouchIdentifier: Double
  var layer: Element
  var tapDelay: Double
  var targetElement: js.Any
  var touchBoundary: Double
  var touchStartX: Double
  var touchStartY: Double
  var trackingClick: Boolean
  var trackingClickStart: Double
  def destroy(): Unit
  def determineEventType(targetElement: js.Any): String
  def findControl(labelElement: js.Any): js.Any
  def focus(targetElement: js.Any): Unit
  def getTargetElementFromEventTarget(eventTarget: EventTarget): js.Any
  def needsClick(target: js.Any): Boolean
  def needsFocus(target: js.Any): Boolean
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
}

