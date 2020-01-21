package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaRegionDisksResizeRequest extends js.Object {
  /**
    * The new size of the regional persistent disk, which is specified in GB.
    */
  var sizeGb: js.UndefOr[String] = js.native
}

object SchemaRegionDisksResizeRequest {
  @scala.inline
  def apply(sizeGb: String = null): SchemaRegionDisksResizeRequest = {
    val __obj = js.Dynamic.literal()
    if (sizeGb != null) __obj.updateDynamic("sizeGb")(sizeGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaRegionDisksResizeRequest]
  }
}

