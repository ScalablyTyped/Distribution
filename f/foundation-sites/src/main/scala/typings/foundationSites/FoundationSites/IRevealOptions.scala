package typings.foundationSites.FoundationSites

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRevealOptions extends js.Object {
  var animationIn: js.UndefOr[String] = js.native
  var animationOut: js.UndefOr[String] = js.native
  var btmOffsetPct: js.UndefOr[Double] = js.native
  var closeOnClick: js.UndefOr[Boolean] = js.native
  var closeOnEsc: js.UndefOr[Boolean] = js.native
  var deepLink: js.UndefOr[Boolean] = js.native
  var fullScreen: js.UndefOr[Boolean] = js.native
  var hOffset: js.UndefOr[Double] = js.native
  var hideDelay: js.UndefOr[Double] = js.native
  var multipleOpened: js.UndefOr[Boolean] = js.native
  var overlay: js.UndefOr[Boolean] = js.native
  var resetOnClose: js.UndefOr[Boolean] = js.native
  var showDelay: js.UndefOr[Double] = js.native
  var vOffset: js.UndefOr[Double] = js.native
}

object IRevealOptions {
  @scala.inline
  def apply(): IRevealOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRevealOptions]
  }
  @scala.inline
  implicit class IRevealOptionsOps[Self <: IRevealOptions] (val x: Self) extends AnyVal {
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
    def setAnimationIn(value: String): Self = this.set("animationIn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationIn: Self = this.set("animationIn", js.undefined)
    @scala.inline
    def setAnimationOut(value: String): Self = this.set("animationOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimationOut: Self = this.set("animationOut", js.undefined)
    @scala.inline
    def setBtmOffsetPct(value: Double): Self = this.set("btmOffsetPct", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBtmOffsetPct: Self = this.set("btmOffsetPct", js.undefined)
    @scala.inline
    def setCloseOnClick(value: Boolean): Self = this.set("closeOnClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnClick: Self = this.set("closeOnClick", js.undefined)
    @scala.inline
    def setCloseOnEsc(value: Boolean): Self = this.set("closeOnEsc", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseOnEsc: Self = this.set("closeOnEsc", js.undefined)
    @scala.inline
    def setDeepLink(value: Boolean): Self = this.set("deepLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeepLink: Self = this.set("deepLink", js.undefined)
    @scala.inline
    def setFullScreen(value: Boolean): Self = this.set("fullScreen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullScreen: Self = this.set("fullScreen", js.undefined)
    @scala.inline
    def setHOffset(value: Double): Self = this.set("hOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHOffset: Self = this.set("hOffset", js.undefined)
    @scala.inline
    def setHideDelay(value: Double): Self = this.set("hideDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideDelay: Self = this.set("hideDelay", js.undefined)
    @scala.inline
    def setMultipleOpened(value: Boolean): Self = this.set("multipleOpened", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultipleOpened: Self = this.set("multipleOpened", js.undefined)
    @scala.inline
    def setOverlay(value: Boolean): Self = this.set("overlay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverlay: Self = this.set("overlay", js.undefined)
    @scala.inline
    def setResetOnClose(value: Boolean): Self = this.set("resetOnClose", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetOnClose: Self = this.set("resetOnClose", js.undefined)
    @scala.inline
    def setShowDelay(value: Double): Self = this.set("showDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDelay: Self = this.set("showDelay", js.undefined)
    @scala.inline
    def setVOffset(value: Double): Self = this.set("vOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVOffset: Self = this.set("vOffset", js.undefined)
  }
  
}

