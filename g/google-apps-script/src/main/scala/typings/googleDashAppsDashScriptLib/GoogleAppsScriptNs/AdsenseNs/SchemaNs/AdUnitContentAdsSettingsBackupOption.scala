package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdUnitContentAdsSettingsBackupOption extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object AdUnitContentAdsSettingsBackupOption {
  @scala.inline
  def apply(color: java.lang.String = null, `type`: java.lang.String = null, url: java.lang.String = null): AdUnitContentAdsSettingsBackupOption = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[AdUnitContentAdsSettingsBackupOption]
  }
}

