package typings.gapiClientPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Location extends js.Object {
  /** The single string version of the address. */
  var address: js.UndefOr[String] = js.native
  /**
    * The following address lines represent the most specific part of any
    * address.
    */
  var addressLine: js.UndefOr[js.Array[String]] = js.native
  /** Top-level administrative subdivision of this country. */
  var administrativeArea: js.UndefOr[String] = js.native
  /**
    * Dependent locality or sublocality. Used for UK dependent localities, or
    * neighborhoods or boroughs in other locations.
    */
  var dependentLocality: js.UndefOr[String] = js.native
  /** Language code of the address. Should be in BCP 47 format. */
  var languageCode: js.UndefOr[String] = js.native
  /** The latitude and longitude of the location, in degrees. */
  var latLng: js.UndefOr[LatLng] = js.native
  /** Generally refers to the city/town portion of an address. */
  var locality: js.UndefOr[String] = js.native
  /** Values are frequently alphanumeric. */
  var postalCode: js.UndefOr[String] = js.native
  /** CLDR (Common Locale Data Repository) region code . */
  var regionCode: js.UndefOr[String] = js.native
  /**
    * Use of this code is very country-specific, but will refer to a secondary
    * classification code for sorting mail.
    */
  var sortingCode: js.UndefOr[String] = js.native
}

object Location {
  @scala.inline
  def apply(): Location = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Location]
  }
  @scala.inline
  implicit class LocationOps[Self <: Location] (val x: Self) extends AnyVal {
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
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    @scala.inline
    def setAddressLineVarargs(value: String*): Self = this.set("addressLine", js.Array(value :_*))
    @scala.inline
    def setAddressLine(value: js.Array[String]): Self = this.set("addressLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAddressLine: Self = this.set("addressLine", js.undefined)
    @scala.inline
    def setAdministrativeArea(value: String): Self = this.set("administrativeArea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdministrativeArea: Self = this.set("administrativeArea", js.undefined)
    @scala.inline
    def setDependentLocality(value: String): Self = this.set("dependentLocality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDependentLocality: Self = this.set("dependentLocality", js.undefined)
    @scala.inline
    def setLanguageCode(value: String): Self = this.set("languageCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLanguageCode: Self = this.set("languageCode", js.undefined)
    @scala.inline
    def setLatLng(value: LatLng): Self = this.set("latLng", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLatLng: Self = this.set("latLng", js.undefined)
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocality: Self = this.set("locality", js.undefined)
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    @scala.inline
    def setRegionCode(value: String): Self = this.set("regionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegionCode: Self = this.set("regionCode", js.undefined)
    @scala.inline
    def setSortingCode(value: String): Self = this.set("sortingCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortingCode: Self = this.set("sortingCode", js.undefined)
  }
  
}

