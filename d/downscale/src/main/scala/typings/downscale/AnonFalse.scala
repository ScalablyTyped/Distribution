package typings.downscale

import typings.downscale.downscaleBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFalse extends js.Object {
  var returnBlob: js.UndefOr[`false`] = js.undefined
  var returnCanvas: js.UndefOr[`false`] = js.undefined
}

object AnonFalse {
  @scala.inline
  def apply(returnBlob: `false` = null, returnCanvas: `false` = null): AnonFalse = {
    val __obj = js.Dynamic.literal()
    if (returnBlob != null) __obj.updateDynamic("returnBlob")(returnBlob.asInstanceOf[js.Any])
    if (returnCanvas != null) __obj.updateDynamic("returnCanvas")(returnCanvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFalse]
  }
}

