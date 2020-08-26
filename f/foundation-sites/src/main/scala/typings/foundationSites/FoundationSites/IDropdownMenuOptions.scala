package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDropdownMenuOptions extends js.Object {
  var alignment: js.UndefOr[String] = js.native
  var autoclose: js.UndefOr[Boolean] = js.native
  var clickOpen: js.UndefOr[Boolean] = js.native
  var closeOnClick: js.UndefOr[Boolean] = js.native
  var closingTime: js.UndefOr[Double] = js.native
  var disableHover: js.UndefOr[Boolean] = js.native
  var forceFollow: js.UndefOr[Boolean] = js.native
  var hoverDelay: js.UndefOr[Double] = js.native
  var rightClass: js.UndefOr[String] = js.native
  var verticalClass: js.UndefOr[String] = js.native
}

object IDropdownMenuOptions {
  @scala.inline
  def apply(): IDropdownMenuOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDropdownMenuOptions]
  }
  @scala.inline
  implicit class IDropdownMenuOptionsOps[Self <: IDropdownMenuOptions] (val x: Self) extends AnyVal {
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
    def setAlignment(value: String): Self = this.set("alignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlignment: Self = this.set("alignment", js.undefined)
    @scala.inline
    def setAutoclose(value: Boolean): Self = this.set("autoclose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoclose: Self = this.set("autoclose", js.undefined)
    @scala.inline
    def setClickOpen(value: Boolean): Self = this.set("clickOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClickOpen: Self = this.set("clickOpen", js.undefined)
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = this.set("closeOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnClick: Self = this.set("closeOnClick", js.undefined)
    @scala.inline
    def setClosingTime(value: Double): Self = this.set("closingTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosingTime: Self = this.set("closingTime", js.undefined)
    @scala.inline
    def setDisableHover(value: Boolean): Self = this.set("disableHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableHover: Self = this.set("disableHover", js.undefined)
    @scala.inline
    def setForceFollow(value: Boolean): Self = this.set("forceFollow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceFollow: Self = this.set("forceFollow", js.undefined)
    @scala.inline
    def setHoverDelay(value: Double): Self = this.set("hoverDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHoverDelay: Self = this.set("hoverDelay", js.undefined)
    @scala.inline
    def setRightClass(value: String): Self = this.set("rightClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRightClass: Self = this.set("rightClass", js.undefined)
    @scala.inline
    def setVerticalClass(value: String): Self = this.set("verticalClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVerticalClass: Self = this.set("verticalClass", js.undefined)
  }
  
}

