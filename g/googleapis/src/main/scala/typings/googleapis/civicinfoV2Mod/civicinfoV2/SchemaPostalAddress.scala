package typings.googleapis.civicinfoV2Mod.civicinfoV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaPostalAddress extends js.Object {
  var addressLines: js.UndefOr[js.Array[String]] = js.native
  var administrativeAreaName: js.UndefOr[String] = js.native
  var countryName: js.UndefOr[String] = js.native
  var countryNameCode: js.UndefOr[String] = js.native
  var dependentLocalityName: js.UndefOr[String] = js.native
  var dependentThoroughfareName: js.UndefOr[String] = js.native
  var firmName: js.UndefOr[String] = js.native
  var isDisputed: js.UndefOr[Boolean] = js.native
  var languageCode: js.UndefOr[String] = js.native
  var localityName: js.UndefOr[String] = js.native
  var postBoxNumber: js.UndefOr[String] = js.native
  var postalCodeNumber: js.UndefOr[String] = js.native
  var postalCodeNumberExtension: js.UndefOr[String] = js.native
  var premiseName: js.UndefOr[String] = js.native
  var recipientName: js.UndefOr[String] = js.native
  var sortingCode: js.UndefOr[String] = js.native
  var subAdministrativeAreaName: js.UndefOr[String] = js.native
  var subPremiseName: js.UndefOr[String] = js.native
  var thoroughfareName: js.UndefOr[String] = js.native
  var thoroughfareNumber: js.UndefOr[String] = js.native
}

object SchemaPostalAddress {
  @scala.inline
  def apply(
    addressLines: js.Array[String] = null,
    administrativeAreaName: String = null,
    countryName: String = null,
    countryNameCode: String = null,
    dependentLocalityName: String = null,
    dependentThoroughfareName: String = null,
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
    thoroughfareName: String = null,
    thoroughfareNumber: String = null
  ): SchemaPostalAddress = {
    val __obj = js.Dynamic.literal()
    if (addressLines != null) __obj.updateDynamic("addressLines")(addressLines.asInstanceOf[js.Any])
    if (administrativeAreaName != null) __obj.updateDynamic("administrativeAreaName")(administrativeAreaName.asInstanceOf[js.Any])
    if (countryName != null) __obj.updateDynamic("countryName")(countryName.asInstanceOf[js.Any])
    if (countryNameCode != null) __obj.updateDynamic("countryNameCode")(countryNameCode.asInstanceOf[js.Any])
    if (dependentLocalityName != null) __obj.updateDynamic("dependentLocalityName")(dependentLocalityName.asInstanceOf[js.Any])
    if (dependentThoroughfareName != null) __obj.updateDynamic("dependentThoroughfareName")(dependentThoroughfareName.asInstanceOf[js.Any])
    if (firmName != null) __obj.updateDynamic("firmName")(firmName.asInstanceOf[js.Any])
    if (!js.isUndefined(isDisputed)) __obj.updateDynamic("isDisputed")(isDisputed.asInstanceOf[js.Any])
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
    if (thoroughfareName != null) __obj.updateDynamic("thoroughfareName")(thoroughfareName.asInstanceOf[js.Any])
    if (thoroughfareNumber != null) __obj.updateDynamic("thoroughfareNumber")(thoroughfareNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaPostalAddress]
  }
}

