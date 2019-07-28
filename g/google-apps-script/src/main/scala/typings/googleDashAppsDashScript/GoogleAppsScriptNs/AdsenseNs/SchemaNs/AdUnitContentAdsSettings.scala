package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs

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
    if (backupOption != null) __obj.updateDynamic("backupOption")(backupOption)
    if (size != null) __obj.updateDynamic("size")(size)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AdUnitContentAdsSettings]
  }
}

