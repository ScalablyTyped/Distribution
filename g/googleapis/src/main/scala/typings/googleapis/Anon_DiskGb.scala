package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DiskGb extends js.Object {
  var diskGb: js.UndefOr[Double] = js.native
}

object Anon_DiskGb {
  @scala.inline
  def apply(diskGb: Int | Double = null): Anon_DiskGb = {
    val __obj = js.Dynamic.literal()
    if (diskGb != null) __obj.updateDynamic("diskGb")(diskGb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DiskGb]
  }
}

