package typings.googleapis.buildSrcApisDfareportingV3Dot1Mod.dfareporting_v3_1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Dynamic and Image Tag Settings.
  */
@js.native
trait Schema$TagSettings extends js.Object {
  /**
    * Whether dynamic floodlight tags are enabled.
    */
  var dynamicTagEnabled: js.UndefOr[Boolean] = js.native
  /**
    * Whether image tags are enabled.
    */
  var imageTagEnabled: js.UndefOr[Boolean] = js.native
}

object Schema$TagSettings {
  @scala.inline
  def apply(
    dynamicTagEnabled: js.UndefOr[Boolean] = js.undefined,
    imageTagEnabled: js.UndefOr[Boolean] = js.undefined
  ): Schema$TagSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dynamicTagEnabled)) __obj.updateDynamic("dynamicTagEnabled")(dynamicTagEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(imageTagEnabled)) __obj.updateDynamic("imageTagEnabled")(imageTagEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TagSettings]
  }
}

