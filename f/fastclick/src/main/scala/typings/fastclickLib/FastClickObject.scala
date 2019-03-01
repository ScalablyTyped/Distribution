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
    destroy: js.Function0[scala.Unit],
    determineEventType: js.Function1[js.Any, java.lang.String],
    findControl: js.Function1[js.Any, js.Any],
    focus: js.Function1[js.Any, scala.Unit],
    getTargetElementFromEventTarget: js.Function1[stdLib.EventTarget, js.Any],
    lastTouchIdentifier: scala.Double,
    layer: stdLib.Element,
    needsClick: js.Function1[js.Any, scala.Boolean],
    needsFocus: js.Function1[js.Any, scala.Boolean],
    tapDelay: scala.Double,
    targetElement: js.Any,
    touchBoundary: scala.Double,
    touchStartX: scala.Double,
    touchStartY: scala.Double,
    trackingClick: scala.Boolean,
    trackingClickStart: scala.Double
  ): FastClickObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("destroy")(destroy)
    __obj.updateDynamic("determineEventType")(determineEventType)
    __obj.updateDynamic("findControl")(findControl)
    __obj.updateDynamic("focus")(focus)
    __obj.updateDynamic("getTargetElementFromEventTarget")(getTargetElementFromEventTarget)
    __obj.updateDynamic("lastTouchIdentifier")(lastTouchIdentifier)
    __obj.updateDynamic("layer")(layer)
    __obj.updateDynamic("needsClick")(needsClick)
    __obj.updateDynamic("needsFocus")(needsFocus)
    __obj.updateDynamic("tapDelay")(tapDelay)
    __obj.updateDynamic("targetElement")(targetElement)
    __obj.updateDynamic("touchBoundary")(touchBoundary)
    __obj.updateDynamic("touchStartX")(touchStartX)
    __obj.updateDynamic("touchStartY")(touchStartY)
    __obj.updateDynamic("trackingClick")(trackingClick)
    __obj.updateDynamic("trackingClickStart")(trackingClickStart)
    __obj.asInstanceOf[FastClickObject]
  }
}

