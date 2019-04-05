package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdUnitMobileContentAdsSettings extends js.Object {
  var markupLanguage: js.UndefOr[java.lang.String] = js.undefined
  var scriptingLanguage: js.UndefOr[java.lang.String] = js.undefined
  var size: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object AdUnitMobileContentAdsSettings {
  @scala.inline
  def apply(
    markupLanguage: java.lang.String = null,
    scriptingLanguage: java.lang.String = null,
    size: java.lang.String = null,
    `type`: java.lang.String = null
  ): AdUnitMobileContentAdsSettings = {
    val __obj = js.Dynamic.literal()
    if (markupLanguage != null) __obj.updateDynamic("markupLanguage")(markupLanguage)
    if (scriptingLanguage != null) __obj.updateDynamic("scriptingLanguage")(scriptingLanguage)
    if (size != null) __obj.updateDynamic("size")(size)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[AdUnitMobileContentAdsSettings]
  }
}

