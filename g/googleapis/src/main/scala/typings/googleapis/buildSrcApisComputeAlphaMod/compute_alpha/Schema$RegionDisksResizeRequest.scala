package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$RegionDisksResizeRequest extends js.Object {
  /**
    * The new size of the regional persistent disk, which is specified in GB.
    */
  var sizeGb: js.UndefOr[String] = js.native
}

object Schema$RegionDisksResizeRequest {
  @scala.inline
  def apply(sizeGb: String = null): Schema$RegionDisksResizeRequest = {
    val __obj = js.Dynamic.literal()
    if (sizeGb != null) __obj.updateDynamic("sizeGb")(sizeGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RegionDisksResizeRequest]
  }
}

