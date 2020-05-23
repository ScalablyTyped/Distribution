package typings.gapiClientCompute.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiskGb extends js.Object {
  /** Size of the scratch disk, defined in GB. */
  var diskGb: js.UndefOr[Double] = js.undefined
}

object DiskGb {
  @scala.inline
  def apply(diskGb: js.UndefOr[Double] = js.undefined): DiskGb = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(diskGb)) __obj.updateDynamic("diskGb")(diskGb.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiskGb]
  }
}

