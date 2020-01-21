package typings.googleAppsScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdUnitContentAdsSettings extends js.Object {
  var backupOption: js.UndefOr[AdUnitContentAdsSettingsBackupOption] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AdUnitContentAdsSettings {
  @scala.inline
  def apply(
    backupOption: AdUnitContentAdsSettingsBackupOption = null,
    size: String = null,
    `type`: String = null
  ): AdUnitContentAdsSettings = {
    val __obj = js.Dynamic.literal()
    if (backupOption != null) __obj.updateDynamic("backupOption")(backupOption.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdUnitContentAdsSettings]
  }
}

