package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.animationConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hide extends js.Object {
  var hide: js.UndefOr[animationConfig] = js.undefined
  var show: js.UndefOr[animationConfig] = js.undefined
}

object Hide {
  @scala.inline
  def apply(hide: animationConfig = null, show: animationConfig = null): Hide = {
    val __obj = js.Dynamic.literal()
    if (hide != null) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (show != null) __obj.updateDynamic("show")(show.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hide]
  }
}

