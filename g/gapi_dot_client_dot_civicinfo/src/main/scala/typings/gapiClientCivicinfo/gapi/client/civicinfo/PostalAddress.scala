package typings.gapiClientCivicinfo.gapi.client.civicinfo

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
    if (addressLines != null) __obj.updateDynamic("addressLines")(addressLines.asInstanceOf[js.Any])
    if (administrativeAreaName != null) __obj.updateDynamic("administrativeAreaName")(administrativeAreaName.asInstanceOf[js.Any])
    if (countryName != null) __obj.updateDynamic("countryName")(countryName.asInstanceOf[js.Any])
    if (countryNameCode != null) __obj.updateDynamic("countryNameCode")(countryNameCode.asInstanceOf[js.Any])
    if (dependentLocalityName != null) __obj.updateDynamic("dependentLocalityName")(dependentLocalityName.asInstanceOf[js.Any])
    if (dependentThoroughfareLeadingType != null) __obj.updateDynamic("dependentThoroughfareLeadingType")(dependentThoroughfareLeadingType.asInstanceOf[js.Any])
    if (dependentThoroughfareName != null) __obj.updateDynamic("dependentThoroughfareName")(dependentThoroughfareName.asInstanceOf[js.Any])
    if (dependentThoroughfarePostDirection != null) __obj.updateDynamic("dependentThoroughfarePostDirection")(dependentThoroughfarePostDirection.asInstanceOf[js.Any])
    if (dependentThoroughfarePreDirection != null) __obj.updateDynamic("dependentThoroughfarePreDirection")(dependentThoroughfarePreDirection.asInstanceOf[js.Any])
    if (dependentThoroughfareTrailingType != null) __obj.updateDynamic("dependentThoroughfareTrailingType")(dependentThoroughfareTrailingType.asInstanceOf[js.Any])
    if (dependentThoroughfaresConnector != null) __obj.updateDynamic("dependentThoroughfaresConnector")(dependentThoroughfaresConnector.asInstanceOf[js.Any])
    if (dependentThoroughfaresIndicator != null) __obj.updateDynamic("dependentThoroughfaresIndicator")(dependentThoroughfaresIndicator.asInstanceOf[js.Any])
    if (dependentThoroughfaresType != null) __obj.updateDynamic("dependentThoroughfaresType")(dependentThoroughfaresType.asInstanceOf[js.Any])
    if (firmName != null) __obj.updateDynamic("firmName")(firmName.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisputed)) __obj.updateDynamic("isDisputed")(isDisputed.get.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (localityName != null) __obj.updateDynamic("localityName")(localityName.asInstanceOf[js.Any])
    if (postBoxNumber != null) __obj.updateDynamic("postBoxNumber")(postBoxNumber.asInstanceOf[js.Any])
    if (postalCodeNumber != null) __obj.updateDynamic("postalCodeNumber")(postalCodeNumber.asInstanceOf[js.Any])
    if (postalCodeNumberExtension != null) __obj.updateDynamic("postalCodeNumberExtension")(postalCodeNumberExtension.asInstanceOf[js.Any])
    if (premiseName != null) __obj.updateDynamic("premiseName")(premiseName.asInstanceOf[js.Any])
    if (recipientName != null) __obj.updateDynamic("recipientName")(recipientName.asInstanceOf[js.Any])
    if (sortingCode != null) __obj.updateDynamic("sortingCode")(sortingCode.asInstanceOf[js.Any])
    if (subAdministrativeAreaName != null) __obj.updateDynamic("subAdministrativeAreaName")(subAdministrativeAreaName.asInstanceOf[js.Any])
    if (subPremiseName != null) __obj.updateDynamic("subPremiseName")(subPremiseName.asInstanceOf[js.Any])
    if (thoroughfareLeadingType != null) __obj.updateDynamic("thoroughfareLeadingType")(thoroughfareLeadingType.asInstanceOf[js.Any])
    if (thoroughfareName != null) __obj.updateDynamic("thoroughfareName")(thoroughfareName.asInstanceOf[js.Any])
    if (thoroughfareNumber != null) __obj.updateDynamic("thoroughfareNumber")(thoroughfareNumber.asInstanceOf[js.Any])
    if (thoroughfarePostDirection != null) __obj.updateDynamic("thoroughfarePostDirection")(thoroughfarePostDirection.asInstanceOf[js.Any])
    if (thoroughfarePreDirection != null) __obj.updateDynamic("thoroughfarePreDirection")(thoroughfarePreDirection.asInstanceOf[js.Any])
    if (thoroughfareTrailingType != null) __obj.updateDynamic("thoroughfareTrailingType")(thoroughfareTrailingType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostalAddress]
  }
}

