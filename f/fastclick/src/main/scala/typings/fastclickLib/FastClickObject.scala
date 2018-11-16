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

