package typings
package domDashMediacaptureDashRecordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRecorderErrorEventInit
  extends stdLib.EventInit {
  var error: stdLib.DOMException
}

object MediaRecorderErrorEventInit {
  @scala.inline
  def apply(
    error: stdLib.DOMException,
    bubbles: js.UndefOr[scala.Boolean] = js.undefined,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    composed: js.UndefOr[scala.Boolean] = js.undefined
  ): MediaRecorderErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    __obj.asInstanceOf[MediaRecorderErrorEventInit]
  }
}

