package typings.googleapis.buildSrcApisComputeBetaMod.compute_beta

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$DisksResizeRequest extends js.Object {
  /**
    * The new size of the persistent disk, which is specified in GB.
    */
  var sizeGb: js.UndefOr[String] = js.native
}

object Schema$DisksResizeRequest {
  @scala.inline
  def apply(sizeGb: String = null): Schema$DisksResizeRequest = {
    val __obj = js.Dynamic.literal()
    if (sizeGb != null) __obj.updateDynamic("sizeGb")(sizeGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DisksResizeRequest]
  }
}

