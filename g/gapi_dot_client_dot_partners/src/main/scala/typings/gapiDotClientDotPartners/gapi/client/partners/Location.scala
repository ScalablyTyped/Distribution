package typings.gapiDotClientDotPartners.gapi.client.partners

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /** The single string version of the address. */
  var address: js.UndefOr[String] = js.undefined
  /**
    * The following address lines represent the most specific part of any
    * address.
    */
  var addressLine: js.UndefOr[js.Array[String]] = js.undefined
  /** Top-level administrative subdivision of this country. */
  var administrativeArea: js.UndefOr[String] = js.undefined
  /**
    * Dependent locality or sublocality. Used for UK dependent localities, or
    * neighborhoods or boroughs in other locations.
    */
  var dependentLocality: js.UndefOr[String] = js.undefined
  /** Language code of the address. Should be in BCP 47 format. */
  var languageCode: js.UndefOr[String] = js.undefined
  /** The latitude and longitude of the location, in degrees. */
  var latLng: js.UndefOr[LatLng] = js.undefined
  /** Generally refers to the city/town portion of an address. */
  var locality: js.UndefOr[String] = js.undefined
  /** Values are frequently alphanumeric. */
  var postalCode: js.UndefOr[String] = js.undefined
  /** CLDR (Common Locale Data Repository) region code . */
  var regionCode: js.UndefOr[String] = js.undefined
  /**
    * Use of this code is very country-specific, but will refer to a secondary
    * classification code for sorting mail.
    */
  var sortingCode: js.UndefOr[String] = js.undefined
}

object Location {
  @scala.inline
  def apply(
    address: String = null,
    addressLine: js.Array[String] = null,
    administrativeArea: String = null,
    dependentLocality: String = null,
    languageCode: String = null,
    latLng: LatLng = null,
    locality: String = null,
    postalCode: String = null,
    regionCode: String = null,
    sortingCode: String = null
  ): Location = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (addressLine != null) __obj.updateDynamic("addressLine")(addressLine.asInstanceOf[js.Any])
    if (administrativeArea != null) __obj.updateDynamic("administrativeArea")(administrativeArea.asInstanceOf[js.Any])
    if (dependentLocality != null) __obj.updateDynamic("dependentLocality")(dependentLocality.asInstanceOf[js.Any])
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (latLng != null) __obj.updateDynamic("latLng")(latLng.asInstanceOf[js.Any])
    if (locality != null) __obj.updateDynamic("locality")(locality.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (regionCode != null) __obj.updateDynamic("regionCode")(regionCode.asInstanceOf[js.Any])
    if (sortingCode != null) __obj.updateDynamic("sortingCode")(sortingCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Location]
  }
}

