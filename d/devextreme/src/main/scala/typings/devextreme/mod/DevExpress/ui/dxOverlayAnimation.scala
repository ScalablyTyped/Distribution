package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.animationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxOverlayAnimation extends js.Object {
  /** @name dxOverlay.Options.animation.hide */
  var hide: js.UndefOr[animationConfig] = js.native
  /** @name dxOverlay.Options.animation.show */
  var show: js.UndefOr[animationConfig] = js.native
}

object dxOverlayAnimation {
  @scala.inline
  def apply(): dxOverlayAnimation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxOverlayAnimation]
  }
  @scala.inline
  implicit class dxOverlayAnimationOps[Self <: dxOverlayAnimation] (val x: Self) extends AnyVal {
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
    def setHide(value: animationConfig): Self = this.set("hide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setShow(value: animationConfig): Self = this.set("show", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
  
}

