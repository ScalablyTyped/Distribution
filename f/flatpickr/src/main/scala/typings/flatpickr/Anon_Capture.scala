package typings.flatpickr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Capture extends js.Object {
  var capture: js.UndefOr[Boolean] = js.undefined
}

object Anon_Capture {
  @scala.inline
  def apply(capture: js.UndefOr[Boolean] = js.undefined): Anon_Capture = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Capture]
  }
}

