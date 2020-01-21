package typings.flatpickr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCapture extends js.Object {
  var capture: js.UndefOr[Boolean] = js.undefined
}

object AnonCapture {
  @scala.inline
  def apply(capture: js.UndefOr[Boolean] = js.undefined): AnonCapture = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCapture]
  }
}

