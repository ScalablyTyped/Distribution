package typings.gapiClientCompute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDiskGb extends js.Object {
  /** Size of the scratch disk, defined in GB. */
  var diskGb: js.UndefOr[Double] = js.undefined
}

object AnonDiskGb {
  @scala.inline
  def apply(diskGb: Int | Double = null): AnonDiskGb = {
    val __obj = js.Dynamic.literal()
    if (diskGb != null) __obj.updateDynamic("diskGb")(diskGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDiskGb]
  }
}

