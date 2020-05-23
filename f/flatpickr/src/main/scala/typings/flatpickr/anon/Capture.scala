package typings.flatpickr.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Capture extends js.Object {
  var capture: js.UndefOr[Boolean] = js.undefined
}

object Capture {
  @scala.inline
  def apply(capture: js.UndefOr[Boolean] = js.undefined): Capture = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capture]
  }
}

