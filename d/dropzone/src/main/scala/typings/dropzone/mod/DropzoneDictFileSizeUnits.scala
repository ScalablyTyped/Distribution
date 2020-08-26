package typings.dropzone.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropzoneDictFileSizeUnits extends js.Object {
  var b: js.UndefOr[String] = js.native
  var gb: js.UndefOr[String] = js.native
  var kb: js.UndefOr[String] = js.native
  var mb: js.UndefOr[String] = js.native
  var tb: js.UndefOr[String] = js.native
}

object DropzoneDictFileSizeUnits {
  @scala.inline
  def apply(): DropzoneDictFileSizeUnits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropzoneDictFileSizeUnits]
  }
  @scala.inline
  implicit class DropzoneDictFileSizeUnitsOps[Self <: DropzoneDictFileSizeUnits] (val x: Self) extends AnyVal {
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
    def setB(value: String): Self = this.set("b", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteB: Self = this.set("b", js.undefined)
    @scala.inline
    def setGb(value: String): Self = this.set("gb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGb: Self = this.set("gb", js.undefined)
    @scala.inline
    def setKb(value: String): Self = this.set("kb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKb: Self = this.set("kb", js.undefined)
    @scala.inline
    def setMb(value: String): Self = this.set("mb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMb: Self = this.set("mb", js.undefined)
    @scala.inline
    def setTb(value: String): Self = this.set("tb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTb: Self = this.set("tb", js.undefined)
  }
  
}

