package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.animationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxToastAnimation extends dxOverlayAnimation

object dxToastAnimation {
  @scala.inline
  def apply(hide: animationConfig = null, show: animationConfig = null): dxToastAnimation = {
    val __obj = js.Dynamic.literal()
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxToastAnimation]
  }
}

