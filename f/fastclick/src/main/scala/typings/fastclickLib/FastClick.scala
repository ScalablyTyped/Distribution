package typings
package fastclickLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("FastClick")
@js.native
class FastClick protected () extends FastClickObject {
  def this(layer: js.Any) = this()
  def this(layer: js.Any, options: FastClickOptions) = this()
  /* CompleteClass */
  override var lastTouchIdentifier: scala.Double = js.native
  /* CompleteClass */
  override var layer: stdLib.Element = js.native
  /* CompleteClass */
  override var tapDelay: scala.Double = js.native
  /* CompleteClass */
  override var targetElement: js.Any = js.native
  /* CompleteClass */
  override var touchBoundary: scala.Double = js.native
  /* CompleteClass */
  override var touchStartX: scala.Double = js.native
  /* CompleteClass */
  override var touchStartY: scala.Double = js.native
  /* CompleteClass */
  override var trackingClick: scala.Boolean = js.native
  /* CompleteClass */
  override var trackingClickStart: scala.Double = js.native
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /* CompleteClass */
  override def determineEventType(targetElement: js.Any): java.lang.String = js.native
  /* CompleteClass */
  override def findControl(labelElement: js.Any): js.Any = js.native
  /* CompleteClass */
  override def focus(targetElement: js.Any): scala.Unit = js.native
  /* CompleteClass */
  override def getTargetElementFromEventTarget(eventTarget: stdLib.EventTarget): js.Any = js.native
  /* CompleteClass */
  override def needsClick(target: js.Any): scala.Boolean = js.native
  /* CompleteClass */
  override def needsFocus(target: js.Any): scala.Boolean = js.native
}

