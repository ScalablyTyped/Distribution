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
  def apply(): DiskGb = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DiskGb]
  }
  @scala.inline
  implicit class DiskGbOps[Self <: DiskGb] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDiskGb(value: Double): Self = this.set("diskGb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiskGb: Self = this.set("diskGb", js.undefined)
  }
  
}

