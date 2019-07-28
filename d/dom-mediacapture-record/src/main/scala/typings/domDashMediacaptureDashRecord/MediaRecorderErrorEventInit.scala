package typings.domDashMediacaptureDashRecord

import typings.std.DOMException
import typings.std.EventInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MediaRecorderErrorEventInit extends EventInit {
  var error: DOMException
}

object MediaRecorderErrorEventInit {
  @scala.inline
  def apply(
    error: DOMException,
    bubbles: js.UndefOr[Boolean] = js.undefined,
    cancelable: js.UndefOr[Boolean] = js.undefined,
    composed: js.UndefOr[Boolean] = js.undefined
  ): MediaRecorderErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error)
    if (!js.isUndefined(bubbles)) __obj.updateDynamic("bubbles")(bubbles)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (!js.isUndefined(composed)) __obj.updateDynamic("composed")(composed)
    __obj.asInstanceOf[MediaRecorderErrorEventInit]
  }
}

