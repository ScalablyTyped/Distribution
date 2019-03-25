package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildingAddress extends js.Object {
  var addressLines: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var administrativeArea: js.UndefOr[java.lang.String] = js.undefined
  var languageCode: js.UndefOr[java.lang.String] = js.undefined
  var locality: js.UndefOr[java.lang.String] = js.undefined
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  var regionCode: js.UndefOr[java.lang.String] = js.undefined
  var sublocality: js.UndefOr[java.lang.String] = js.undefined
}

object BuildingAddress {
  @scala.inline
  def apply(
    addressLines: js.Array[java.lang.String] = null,
    administrativeArea: java.lang.String = null,
    languageCode: java.lang.String = null,
    locality: java.lang.String = null,
    postalCode: java.lang.String = null,
    regionCode: java.lang.String = null,
    sublocality: java.lang.String = null
  ): BuildingAddress = {
    val __obj = js.Dynamic.literal()
    if (addressLines != null) __obj.updateDynamic("addressLines")(addressLines)
    if (administrativeArea != null) __obj.updateDynamic("administrativeArea")(administrativeArea)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (locality != null) __obj.updateDynamic("locality")(locality)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode)
    if (sublocality != null) __obj.updateDynamic("sublocality")(sublocality)
    __obj.asInstanceOf[BuildingAddress]
  }
}

