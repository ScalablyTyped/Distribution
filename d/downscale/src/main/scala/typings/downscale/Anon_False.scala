package typings.downscale

import typings.downscale.downscaleBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_False extends js.Object {
  var returnBlob: js.UndefOr[`false`] = js.undefined
  var returnCanvas: js.UndefOr[`false`] = js.undefined
}

object Anon_False {
  @scala.inline
  def apply(returnBlob: `false` = null, returnCanvas: `false` = null): Anon_False = {
    val __obj = js.Dynamic.literal()
    if (returnBlob != null) __obj.updateDynamic("returnBlob")(returnBlob.asInstanceOf[js.Any])
    if (returnCanvas != null) __obj.updateDynamic("returnCanvas")(returnCanvas.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_False]
  }
}

