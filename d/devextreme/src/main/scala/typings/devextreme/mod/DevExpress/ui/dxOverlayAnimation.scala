package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.animationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxOverlayAnimation extends js.Object {
  /** @name dxOverlay.Options.animation.hide */
  var hide: js.UndefOr[animationConfig] = js.undefined
  /** @name dxOverlay.Options.animation.show */
  var show: js.UndefOr[animationConfig] = js.undefined
}

object dxOverlayAnimation {
  @scala.inline
  def apply(hide: animationConfig = null, show: animationConfig = null): dxOverlayAnimation = {
    val __obj = js.Dynamic.literal()
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxOverlayAnimation]
  }
}

