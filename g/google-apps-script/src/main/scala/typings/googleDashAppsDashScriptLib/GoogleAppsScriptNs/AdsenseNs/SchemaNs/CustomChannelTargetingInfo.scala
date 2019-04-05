package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdsenseNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomChannelTargetingInfo extends js.Object {
  var adsAppearOn: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var location: js.UndefOr[java.lang.String] = js.undefined
  var siteLanguage: js.UndefOr[java.lang.String] = js.undefined
}

object CustomChannelTargetingInfo {
  @scala.inline
  def apply(
    adsAppearOn: java.lang.String = null,
    description: java.lang.String = null,
    location: java.lang.String = null,
    siteLanguage: java.lang.String = null
  ): CustomChannelTargetingInfo = {
    val __obj = js.Dynamic.literal()
    if (adsAppearOn != null) __obj.updateDynamic("adsAppearOn")(adsAppearOn)
    if (description != null) __obj.updateDynamic("description")(description)
    if (location != null) __obj.updateDynamic("location")(location)
    if (siteLanguage != null) __obj.updateDynamic("siteLanguage")(siteLanguage)
    __obj.asInstanceOf[CustomChannelTargetingInfo]
  }
}

