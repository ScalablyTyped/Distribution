package typings.devextreme

import typings.devextreme.mod.DevExpress.animationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHide extends js.Object {
  var hide: js.UndefOr[animationConfig] = js.undefined
  var show: js.UndefOr[animationConfig] = js.undefined
}

object AnonHide {
  @scala.inline
  def apply(hide: animationConfig = null, show: animationConfig = null): AnonHide = {
    val __obj = js.Dynamic.literal()
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHide]
  }
}

