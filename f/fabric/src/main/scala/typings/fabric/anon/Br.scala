package typings.fabric.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Br extends js.Object {
  var bl: js.UndefOr[Boolean] = js.native
  var br: js.UndefOr[Boolean] = js.native
  var mb: js.UndefOr[Boolean] = js.native
  var ml: js.UndefOr[Boolean] = js.native
  var mr: js.UndefOr[Boolean] = js.native
  var mt: js.UndefOr[Boolean] = js.native
  var mtr: js.UndefOr[Boolean] = js.native
  var tl: js.UndefOr[Boolean] = js.native
  var tr: js.UndefOr[Boolean] = js.native
}

object Br {
  @scala.inline
  def apply(): Br = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Br]
  }
  @scala.inline
  implicit class BrOps[Self <: Br] (val x: Self) extends AnyVal {
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
    def setBl(value: Boolean): Self = this.set("bl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBl: Self = this.set("bl", js.undefined)
    @scala.inline
    def setBr(value: Boolean): Self = this.set("br", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBr: Self = this.set("br", js.undefined)
    @scala.inline
    def setMb(value: Boolean): Self = this.set("mb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMb: Self = this.set("mb", js.undefined)
    @scala.inline
    def setMl(value: Boolean): Self = this.set("ml", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMl: Self = this.set("ml", js.undefined)
    @scala.inline
    def setMr(value: Boolean): Self = this.set("mr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMr: Self = this.set("mr", js.undefined)
    @scala.inline
    def setMt(value: Boolean): Self = this.set("mt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMt: Self = this.set("mt", js.undefined)
    @scala.inline
    def setMtr(value: Boolean): Self = this.set("mtr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMtr: Self = this.set("mtr", js.undefined)
    @scala.inline
    def setTl(value: Boolean): Self = this.set("tl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTl: Self = this.set("tl", js.undefined)
    @scala.inline
    def setTr(value: Boolean): Self = this.set("tr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTr: Self = this.set("tr", js.undefined)
  }
  
}

