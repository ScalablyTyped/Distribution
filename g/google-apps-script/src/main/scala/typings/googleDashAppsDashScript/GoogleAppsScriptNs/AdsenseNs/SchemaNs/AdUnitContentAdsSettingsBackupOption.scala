package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdUnitContentAdsSettingsBackupOption extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object AdUnitContentAdsSettingsBackupOption {
  @scala.inline
  def apply(color: String = null, `type`: String = null, url: String = null): AdUnitContentAdsSettingsBackupOption = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[AdUnitContentAdsSettingsBackupOption]
  }
}

