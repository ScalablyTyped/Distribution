package typings.gapiDotClientDotCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostalAddress extends js.Object {
  var addressLines: js.UndefOr[js.Array[String]] = js.undefined
  var administrativeAreaName: js.UndefOr[String] = js.undefined
  var countryName: js.UndefOr[String] = js.undefined
  var countryNameCode: js.UndefOr[String] = js.undefined
  var dependentLocalityName: js.UndefOr[String] = js.undefined
  var dependentThoroughfareLeadingType: js.UndefOr[String] = js.undefined
  var dependentThoroughfareName: js.UndefOr[String] = js.undefined
  var dependentThoroughfarePostDirection: js.UndefOr[String] = js.undefined
  var dependentThoroughfarePreDirection: js.UndefOr[String] = js.undefined
  var dependentThoroughfareTrailingType: js.UndefOr[String] = js.undefined
  var dependentThoroughfaresConnector: js.UndefOr[String] = js.undefined
  var dependentThoroughfaresIndicator: js.UndefOr[String] = js.undefined
  var dependentThoroughfaresType: js.UndefOr[String] = js.undefined
  var firmName: js.UndefOr[String] = js.undefined
  var isDisputed: js.UndefOr[Boolean] = js.undefined
  var languageCode: js.UndefOr[String] = js.undefined
  var localityName: js.UndefOr[String] = js.undefined
  var postBoxNumber: js.UndefOr[String] = js.undefined
  var postalCodeNumber: js.UndefOr[String] = js.undefined
  var postalCodeNumberExtension: js.UndefOr[String] = js.undefined
  var premiseName: js.UndefOr[String] = js.undefined
  var recipientName: js.UndefOr[String] = js.undefined
  var sortingCode: js.UndefOr[String] = js.undefined
  var subAdministrativeAreaName: js.UndefOr[String] = js.undefined
  var subPremiseName: js.UndefOr[String] = js.undefined
  var thoroughfareLeadingType: js.UndefOr[String] = js.undefined
  var thoroughfareName: js.UndefOr[String] = js.undefined
  var thoroughfareNumber: js.UndefOr[String] = js.undefined
  var thoroughfarePostDirection: js.UndefOr[String] = js.undefined
  var thoroughfarePreDirection: js.UndefOr[String] = js.undefined
  var thoroughfareTrailingType: js.UndefOr[String] = js.undefined
}

object PostalAddress {
  @scala.inline
  def apply(
    addressLines: js.Array[String] = null,
    administrativeAreaName: String = null,
    countryName: String = null,
    countryNameCode: String = null,
    dependentLocalityName: String = null,
    dependentThoroughfareLeadingType: String = null,
    dependentThoroughfareName: String = null,
    dependentThoroughfarePostDirection: String = null,
    dependentThoroughfarePreDirection: String = null,
    dependentThoroughfareTrailingType: String = null,
    dependentThoroughfaresConnector: String = null,
    dependentThoroughfaresIndicator: String = null,
    dependentThoroughfaresType: String = null,
    firmName: String = null,
    isDisputed: js.UndefOr[Boolean] = js.undefined,
    languageCode: String = null,
    localityName: String = null,
    postBoxNumber: String = null,
    postalCodeNumber: String = null,
    postalCodeNumberExtension: String = null,
    premiseName: String = null,
    recipientName: String = null,
    sortingCode: String = null,
    subAdministrativeAreaName: String = null,
    subPremiseName: String = null,
    thoroughfareLeadingType: String = null,
    thoroughfareName: String = null,
    thoroughfareNumber: String = null,
    thoroughfarePostDirection: String = null,
    thoroughfarePreDirection: String = null,
    thoroughfareTrailingType: String = null
  ): PostalAddress = {
    val __obj = js.Dynamic.literal()
    if (addressLines != null) __obj.updateDynamic("addressLines")(addressLines)
    if (administrativeAreaName != null) __obj.updateDynamic("administrativeAreaName")(administrativeAreaName)
    if (countryName != null) __obj.updateDynamic("countryName")(countryName)
    if (countryNameCode != null) __obj.updateDynamic("countryNameCode")(countryNameCode)
    if (dependentLocalityName != null) __obj.updateDynamic("dependentLocalityName")(dependentLocalityName)
    if (dependentThoroughfareLeadingType != null) __obj.updateDynamic("dependentThoroughfareLeadingType")(dependentThoroughfareLeadingType)
    if (dependentThoroughfareName != null) __obj.updateDynamic("dependentThoroughfareName")(dependentThoroughfareName)
    if (dependentThoroughfarePostDirection != null) __obj.updateDynamic("dependentThoroughfarePostDirection")(dependentThoroughfarePostDirection)
    if (dependentThoroughfarePreDirection != null) __obj.updateDynamic("dependentThoroughfarePreDirection")(dependentThoroughfarePreDirection)
    if (dependentThoroughfareTrailingType != null) __obj.updateDynamic("dependentThoroughfareTrailingType")(dependentThoroughfareTrailingType)
    if (dependentThoroughfaresConnector != null) __obj.updateDynamic("dependentThoroughfaresConnector")(dependentThoroughfaresConnector)
    if (dependentThoroughfaresIndicator != null) __obj.updateDynamic("dependentThoroughfaresIndicator")(dependentThoroughfaresIndicator)
    if (dependentThoroughfaresType != null) __obj.updateDynamic("dependentThoroughfaresType")(dependentThoroughfaresType)
    if (firmName != null) __obj.updateDynamic("firmName")(firmName)
    if (!js.isUndefined(isDisputed)) __obj.updateDynamic("isDisputed")(isDisputed)
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode)
    if (localityName != null) __obj.updateDynamic("localityName")(localityName)
    if (postBoxNumber != null) __obj.updateDynamic("postBoxNumber")(postBoxNumber)
    if (postalCodeNumber != null) __obj.updateDynamic("postalCodeNumber")(postalCodeNumber)
    if (postalCodeNumberExtension != null) __obj.updateDynamic("postalCodeNumberExtension")(postalCodeNumberExtension)
    if (premiseName != null) __obj.updateDynamic("premiseName")(premiseName)
    if (recipientName != null) __obj.updateDynamic("recipientName")(recipientName)
    if (sortingCode != null) __obj.updateDynamic("sortingCode")(sortingCode)
    if (subAdministrativeAreaName != null) __obj.updateDynamic("subAdministrativeAreaName")(subAdministrativeAreaName)
    if (subPremiseName != null) __obj.updateDynamic("subPremiseName")(subPremiseName)
    if (thoroughfareLeadingType != null) __obj.updateDynamic("thoroughfareLeadingType")(thoroughfareLeadingType)
    if (thoroughfareName != null) __obj.updateDynamic("thoroughfareName")(thoroughfareName)
    if (thoroughfareNumber != null) __obj.updateDynamic("thoroughfareNumber")(thoroughfareNumber)
    if (thoroughfarePostDirection != null) __obj.updateDynamic("thoroughfarePostDirection")(thoroughfarePostDirection)
    if (thoroughfarePreDirection != null) __obj.updateDynamic("thoroughfarePreDirection")(thoroughfarePreDirection)
    if (thoroughfareTrailingType != null) __obj.updateDynamic("thoroughfareTrailingType")(thoroughfareTrailingType)
    __obj.asInstanceOf[PostalAddress]
  }
}

