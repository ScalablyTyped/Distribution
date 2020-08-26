package typings.gapiClientCivicinfo.gapi.client.civicinfo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostalAddress extends js.Object {
  var addressLines: js.UndefOr[js.Array[String]] = js.native
  var administrativeAreaName: js.UndefOr[String] = js.native
  var countryName: js.UndefOr[String] = js.native
  var countryNameCode: js.UndefOr[String] = js.native
  var dependentLocalityName: js.UndefOr[String] = js.native
  var dependentThoroughfareLeadingType: js.UndefOr[String] = js.native
  var dependentThoroughfareName: js.UndefOr[String] = js.native
  var dependentThoroughfarePostDirection: js.UndefOr[String] = js.native
  var dependentThoroughfarePreDirection: js.UndefOr[String] = js.native
  var dependentThoroughfareTrailingType: js.UndefOr[String] = js.native
  var dependentThoroughfaresConnector: js.UndefOr[String] = js.native
  var dependentThoroughfaresIndicator: js.UndefOr[String] = js.native
  var dependentThoroughfaresType: js.UndefOr[String] = js.native
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
  var thoroughfareLeadingType: js.UndefOr[String] = js.native
  var thoroughfareName: js.UndefOr[String] = js.native
  var thoroughfareNumber: js.UndefOr[String] = js.native
  var thoroughfarePostDirection: js.UndefOr[String] = js.native
  var thoroughfarePreDirection: js.UndefOr[String] = js.native
  var thoroughfareTrailingType: js.UndefOr[String] = js.native
}

object PostalAddress {
  @scala.inline
  def apply(): PostalAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostalAddress]
  }
  @scala.inline
  implicit class PostalAddressOps[Self <: PostalAddress] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddressLinesVarargs(value: String*): Self = this.set("addressLines", js.Array(value :_*))
    @scala.inline
    def setAddressLines(value: js.Array[String]): Self = this.set("addressLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressLines: Self = this.set("addressLines", js.undefined)
    @scala.inline
    def setAdministrativeAreaName(value: String): Self = this.set("administrativeAreaName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdministrativeAreaName: Self = this.set("administrativeAreaName", js.undefined)
    @scala.inline
    def setCountryName(value: String): Self = this.set("countryName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryName: Self = this.set("countryName", js.undefined)
    @scala.inline
    def setCountryNameCode(value: String): Self = this.set("countryNameCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryNameCode: Self = this.set("countryNameCode", js.undefined)
    @scala.inline
    def setDependentLocalityName(value: String): Self = this.set("dependentLocalityName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependentLocalityName: Self = this.set("dependentLocalityName", js.undefined)
    @scala.inline
    def setDependentThoroughfareLeadingType(value: String): Self = this.set("dependentThoroughfareLeadingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependentThoroughfareLeadingType: Self = this.set("dependentThoroughfareLeadingType", js.undefined)
    @scala.inline
    def setDependentThoroughfareName(value: String): Self = this.set("dependentThoroughfareName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependentThoroughfareName: Self = this.set("dependentThoroughfareName", js.undefined)
    @scala.inline
    def setDependentThoroughfarePostDirection(value: String): Self = this.set("dependentThoroughfarePostDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependentThoroughfarePostDirection: Self = this.set("dependentThoroughfarePostDirection", js.undefined)
    @scala.inline
    def setDependentThoroughfarePreDirection(value: String): Self = this.set("dependentThoroughfarePreDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependentThoroughfarePreDirection: Self = this.set("dependentThoroughfarePreDirection", js.undefined)
    @scala.inline
    def setDependentThoroughfareTrailingType(value: String): Self = this.set("dependentThoroughfareTrailingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependentThoroughfareTrailingType: Self = this.set("dependentThoroughfareTrailingType", js.undefined)
    @scala.inline
    def setDependentThoroughfaresConnector(value: String): Self = this.set("dependentThoroughfaresConnector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependentThoroughfaresConnector: Self = this.set("dependentThoroughfaresConnector", js.undefined)
    @scala.inline
    def setDependentThoroughfaresIndicator(value: String): Self = this.set("dependentThoroughfaresIndicator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependentThoroughfaresIndicator: Self = this.set("dependentThoroughfaresIndicator", js.undefined)
    @scala.inline
    def setDependentThoroughfaresType(value: String): Self = this.set("dependentThoroughfaresType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependentThoroughfaresType: Self = this.set("dependentThoroughfaresType", js.undefined)
    @scala.inline
    def setFirmName(value: String): Self = this.set("firmName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirmName: Self = this.set("firmName", js.undefined)
    @scala.inline
    def setIsDisputed(value: Boolean): Self = this.set("isDisputed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDisputed: Self = this.set("isDisputed", js.undefined)
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    @scala.inline
    def setLocalityName(value: String): Self = this.set("localityName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalityName: Self = this.set("localityName", js.undefined)
    @scala.inline
    def setPostBoxNumber(value: String): Self = this.set("postBoxNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostBoxNumber: Self = this.set("postBoxNumber", js.undefined)
    @scala.inline
    def setPostalCodeNumber(value: String): Self = this.set("postalCodeNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCodeNumber: Self = this.set("postalCodeNumber", js.undefined)
    @scala.inline
    def setPostalCodeNumberExtension(value: String): Self = this.set("postalCodeNumberExtension", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCodeNumberExtension: Self = this.set("postalCodeNumberExtension", js.undefined)
    @scala.inline
    def setPremiseName(value: String): Self = this.set("premiseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePremiseName: Self = this.set("premiseName", js.undefined)
    @scala.inline
    def setRecipientName(value: String): Self = this.set("recipientName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecipientName: Self = this.set("recipientName", js.undefined)
    @scala.inline
    def setSortingCode(value: String): Self = this.set("sortingCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortingCode: Self = this.set("sortingCode", js.undefined)
    @scala.inline
    def setSubAdministrativeAreaName(value: String): Self = this.set("subAdministrativeAreaName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubAdministrativeAreaName: Self = this.set("subAdministrativeAreaName", js.undefined)
    @scala.inline
    def setSubPremiseName(value: String): Self = this.set("subPremiseName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubPremiseName: Self = this.set("subPremiseName", js.undefined)
    @scala.inline
    def setThoroughfareLeadingType(value: String): Self = this.set("thoroughfareLeadingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThoroughfareLeadingType: Self = this.set("thoroughfareLeadingType", js.undefined)
    @scala.inline
    def setThoroughfareName(value: String): Self = this.set("thoroughfareName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThoroughfareName: Self = this.set("thoroughfareName", js.undefined)
    @scala.inline
    def setThoroughfareNumber(value: String): Self = this.set("thoroughfareNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThoroughfareNumber: Self = this.set("thoroughfareNumber", js.undefined)
    @scala.inline
    def setThoroughfarePostDirection(value: String): Self = this.set("thoroughfarePostDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThoroughfarePostDirection: Self = this.set("thoroughfarePostDirection", js.undefined)
    @scala.inline
    def setThoroughfarePreDirection(value: String): Self = this.set("thoroughfarePreDirection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThoroughfarePreDirection: Self = this.set("thoroughfarePreDirection", js.undefined)
    @scala.inline
    def setThoroughfareTrailingType(value: String): Self = this.set("thoroughfareTrailingType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThoroughfareTrailingType: Self = this.set("thoroughfareTrailingType", js.undefined)
  }
  
}

