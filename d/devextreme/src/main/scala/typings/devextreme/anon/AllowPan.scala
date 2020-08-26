package typings.devextreme.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AllowPan extends js.Object {
  var allowPan: js.UndefOr[Boolean] = js.native
  var allowSelection: js.UndefOr[Boolean] = js.native
  var allowZoom: js.UndefOr[Boolean] = js.native
}

object AllowPan {
  @scala.inline
  def apply(): AllowPan = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowPan]
  }
  @scala.inline
  implicit class AllowPanOps[Self <: AllowPan] (val x: Self) extends AnyVal {
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
    def setAllowPan(value: Boolean): Self = this.set("allowPan", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowPan: Self = this.set("allowPan", js.undefined)
    @scala.inline
    def setAllowSelection(value: Boolean): Self = this.set("allowSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSelection: Self = this.set("allowSelection", js.undefined)
    @scala.inline
    def setAllowZoom(value: Boolean): Self = this.set("allowZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowZoom: Self = this.set("allowZoom", js.undefined)
  }
  
}

