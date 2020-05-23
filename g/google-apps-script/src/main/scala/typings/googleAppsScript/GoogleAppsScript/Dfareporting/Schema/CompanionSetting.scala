package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompanionSetting extends js.Object {
  var companionsDisabled: js.UndefOr[Boolean] = js.undefined
  var enabledSizes: js.UndefOr[js.Array[Size]] = js.undefined
  var imageOnly: js.UndefOr[Boolean] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
}

object CompanionSetting {
  @scala.inline
  def apply(
    companionsDisabled: js.UndefOr[Boolean] = js.undefined,
    enabledSizes: js.Array[Size] = null,
    imageOnly: js.UndefOr[Boolean] = js.undefined,
    kind: String = null
  ): CompanionSetting = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(companionsDisabled)) __obj.updateDynamic("companionsDisabled")(companionsDisabled.get.asInstanceOf[js.Any])
    if (enabledSizes != null) __obj.updateDynamic("enabledSizes")(enabledSizes.asInstanceOf[js.Any])
    if (!js.isUndefined(imageOnly)) __obj.updateDynamic("imageOnly")(imageOnly.get.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompanionSetting]
  }
}

