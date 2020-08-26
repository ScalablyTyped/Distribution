package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStickyOptions extends js.Object {
  var anchor: js.UndefOr[String] = js.native
  var btmAnchor: js.UndefOr[String] = js.native
  var checkEvery: js.UndefOr[Double] = js.native
  var container: js.UndefOr[String] = js.native
  var containerClass: js.UndefOr[String] = js.native
  var marginBottom: js.UndefOr[Double] = js.native
  var marginTop: js.UndefOr[Double] = js.native
  var stickTo: js.UndefOr[String] = js.native
  var stickyClass: js.UndefOr[String] = js.native
  var stickyOn: js.UndefOr[String] = js.native
  var topAnchor: js.UndefOr[String] = js.native
}

object IStickyOptions {
  @scala.inline
  def apply(): IStickyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStickyOptions]
  }
  @scala.inline
  implicit class IStickyOptionsOps[Self <: IStickyOptions] (val x: Self) extends AnyVal {
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
    def setAnchor(value: String): Self = this.set("anchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnchor: Self = this.set("anchor", js.undefined)
    @scala.inline
    def setBtmAnchor(value: String): Self = this.set("btmAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBtmAnchor: Self = this.set("btmAnchor", js.undefined)
    @scala.inline
    def setCheckEvery(value: Double): Self = this.set("checkEvery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCheckEvery: Self = this.set("checkEvery", js.undefined)
    @scala.inline
    def setContainer(value: String): Self = this.set("container", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainer: Self = this.set("container", js.undefined)
    @scala.inline
    def setContainerClass(value: String): Self = this.set("containerClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerClass: Self = this.set("containerClass", js.undefined)
    @scala.inline
    def setMarginBottom(value: Double): Self = this.set("marginBottom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginBottom: Self = this.set("marginBottom", js.undefined)
    @scala.inline
    def setMarginTop(value: Double): Self = this.set("marginTop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMarginTop: Self = this.set("marginTop", js.undefined)
    @scala.inline
    def setStickTo(value: String): Self = this.set("stickTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickTo: Self = this.set("stickTo", js.undefined)
    @scala.inline
    def setStickyClass(value: String): Self = this.set("stickyClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyClass: Self = this.set("stickyClass", js.undefined)
    @scala.inline
    def setStickyOn(value: String): Self = this.set("stickyOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStickyOn: Self = this.set("stickyOn", js.undefined)
    @scala.inline
    def setTopAnchor(value: String): Self = this.set("topAnchor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTopAnchor: Self = this.set("topAnchor", js.undefined)
  }
  
}

