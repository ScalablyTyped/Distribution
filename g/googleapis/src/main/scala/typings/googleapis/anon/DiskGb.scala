package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiskGb extends js.Object {
  var diskGb: js.UndefOr[Double] = js.native
}

object DiskGb {
  @scala.inline
  def apply(diskGb: js.UndefOr[Double] = js.undefined): DiskGb = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(diskGb)) __obj.updateDynamic("diskGb")(diskGb.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskGb]
  }
}

