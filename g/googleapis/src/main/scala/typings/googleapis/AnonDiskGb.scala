package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDiskGb extends js.Object {
  var diskGb: js.UndefOr[Double] = js.native
}

object AnonDiskGb {
  @scala.inline
  def apply(diskGb: Int | Double = null): AnonDiskGb = {
    val __obj = js.Dynamic.literal()
    if (diskGb != null) __obj.updateDynamic("diskGb")(diskGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDiskGb]
  }
}

