package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildingAddress extends js.Object {
  var addressLines: js.UndefOr[js.Array[String]] = js.undefined
  var administrativeArea: js.UndefOr[String] = js.undefined
  var languageCode: js.UndefOr[String] = js.undefined
  var locality: js.UndefOr[String] = js.undefined
  var postalCode: js.UndefOr[String] = js.undefined
  var regionCode: js.UndefOr[String] = js.undefined
  var sublocality: js.UndefOr[String] = js.undefined
}

object BuildingAddress {
  @scala.inline
  def apply(
    addressLines: js.Array[String] = null,
    administrativeArea: String = null,
    languageCode: String = null,
    locality: String = null,
    postalCode: String = null,
    regionCode: String = null,
    sublocality: String = null
  ): BuildingAddress = {
    val __obj = js.Dynamic.literal()
    if (addressLines != null) __obj.updateDynamic("addressLines")(addressLines.asInstanceOf[js.Any])
    if (administrativeArea != null) __obj.updateDynamic("administrativeArea")(administrativeArea.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode.asInstanceOf[js.Any])
    if (sublocality != null) __obj.updateDynamic("sublocality")(sublocality.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildingAddress]
  }
}

