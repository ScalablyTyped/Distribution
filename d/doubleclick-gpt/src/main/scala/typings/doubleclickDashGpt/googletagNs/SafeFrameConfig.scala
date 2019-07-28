package typings.doubleclickDashGpt.googletagNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SafeFrameConfig extends js.Object {
  var allowOverlayExpansion: js.UndefOr[Boolean] = js.undefined
  var allowPushExpansion: js.UndefOr[Boolean] = js.undefined
  var sandbox: js.UndefOr[Boolean] = js.undefined
}

object SafeFrameConfig {
  @scala.inline
  def apply(
    allowOverlayExpansion: js.UndefOr[Boolean] = js.undefined,
    allowPushExpansion: js.UndefOr[Boolean] = js.undefined,
    sandbox: js.UndefOr[Boolean] = js.undefined
  ): SafeFrameConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowOverlayExpansion)) __obj.updateDynamic("allowOverlayExpansion")(allowOverlayExpansion)
    if (!js.isUndefined(allowPushExpansion)) __obj.updateDynamic("allowPushExpansion")(allowPushExpansion)
    if (!js.isUndefined(sandbox)) __obj.updateDynamic("sandbox")(sandbox)
    __obj.asInstanceOf[SafeFrameConfig]
  }
}

