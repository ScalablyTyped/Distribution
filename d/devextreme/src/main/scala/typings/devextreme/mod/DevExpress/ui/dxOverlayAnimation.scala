package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.animationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxOverlayAnimation extends js.Object {
  /** An object that defines the animation options used when the widget is being hidden. */
  var hide: js.UndefOr[animationConfig] = js.undefined
  /** An object that defines the animation options used when the widget is being shown. */
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

