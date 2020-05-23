package typings.expo.appLoadingNativeWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var autoHideSplash: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(autoHideSplash: js.UndefOr[Boolean] = js.undefined): Props = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoHideSplash)) __obj.updateDynamic("autoHideSplash")(autoHideSplash.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

