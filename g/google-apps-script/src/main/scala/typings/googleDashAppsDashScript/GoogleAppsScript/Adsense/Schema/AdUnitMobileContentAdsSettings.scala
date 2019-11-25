package typings.googleDashAppsDashScript.GoogleAppsScript.Adsense.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AdUnitMobileContentAdsSettings extends js.Object {
  var markupLanguage: js.UndefOr[String] = js.undefined
  var scriptingLanguage: js.UndefOr[String] = js.undefined
  var size: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
}

object AdUnitMobileContentAdsSettings {
  @scala.inline
  def apply(
    markupLanguage: String = null,
    scriptingLanguage: String = null,
    size: String = null,
    `type`: String = null
  ): AdUnitMobileContentAdsSettings = {
    val __obj = js.Dynamic.literal()
    if (markupLanguage != null) __obj.updateDynamic("markupLanguage")(markupLanguage.asInstanceOf[js.Any])
    if (scriptingLanguage != null) __obj.updateDynamic("scriptingLanguage")(scriptingLanguage.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AdUnitMobileContentAdsSettings]
  }
}

