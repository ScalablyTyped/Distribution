package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDrilldownOptions extends js.Object {
  var backButton: js.UndefOr[String] = js.native
  var closeOnClick: js.UndefOr[Boolean] = js.native
  var parentLink: js.UndefOr[Boolean] = js.native
  var wrapper: js.UndefOr[String] = js.native
}

object IDrilldownOptions {
  @scala.inline
  def apply(): IDrilldownOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDrilldownOptions]
  }
  @scala.inline
  implicit class IDrilldownOptionsOps[Self <: IDrilldownOptions] (val x: Self) extends AnyVal {
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
    def setBackButton(value: String): Self = this.set("backButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackButton: Self = this.set("backButton", js.undefined)
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = this.set("closeOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnClick: Self = this.set("closeOnClick", js.undefined)
    @scala.inline
    def setParentLink(value: Boolean): Self = this.set("parentLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentLink: Self = this.set("parentLink", js.undefined)
    @scala.inline
    def setWrapper(value: String): Self = this.set("wrapper", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWrapper: Self = this.set("wrapper", js.undefined)
  }
  
}

