package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdsenseNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomChannelTargetingInfo extends js.Object {
  var adsAppearOn: js.UndefOr[String] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var location: js.UndefOr[String] = js.undefined
  var siteLanguage: js.UndefOr[String] = js.undefined
}

object CustomChannelTargetingInfo {
  @scala.inline
  def apply(
    adsAppearOn: String = null,
    description: String = null,
    location: String = null,
    siteLanguage: String = null
  ): CustomChannelTargetingInfo = {
    val __obj = js.Dynamic.literal()
    if (adsAppearOn != null) __obj.updateDynamic("adsAppearOn")(adsAppearOn)
    if (description != null) __obj.updateDynamic("description")(description)
    if (location != null) __obj.updateDynamic("location")(location)
    if (siteLanguage != null) __obj.updateDynamic("siteLanguage")(siteLanguage)
    __obj.asInstanceOf[CustomChannelTargetingInfo]
  }
}

