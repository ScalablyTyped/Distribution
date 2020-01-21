package typings.gapiClientPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  /** The city of the address. */
  var city: js.UndefOr[String] = js.undefined
  /** The country of the address. */
  var country: js.UndefOr[String] = js.undefined
  /**
    * The [ISO 3166-1 alpha-2](http://www.iso.org/iso/country_codes.htm) country
    * code of the address.
    */
  var countryCode: js.UndefOr[String] = js.undefined
  /** The extended address of the address; for example, the apartment number. */
  var extendedAddress: js.UndefOr[String] = js.undefined
  /**
    * The read-only type of the address translated and formatted in the viewer's
    * account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[String] = js.undefined
  /**
    * The unstructured value of the address. If this is not set by the user it
    * will be automatically constructed from structured values.
    */
  var formattedValue: js.UndefOr[String] = js.undefined
  /** Metadata about the address. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The P.O. box of the address. */
  var poBox: js.UndefOr[String] = js.undefined
  /** The postal code of the address. */
  var postalCode: js.UndefOr[String] = js.undefined
  /** The region of the address; for example, the state or province. */
  var region: js.UndefOr[String] = js.undefined
  /** The street address. */
  var streetAddress: js.UndefOr[String] = js.undefined
  /**
    * The type of the address. The type can be custom or predefined.
    * Possible values include, but are not limited to, the following:
    *
    * &#42; `home`
    * &#42; `work`
    * &#42; `other`
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object Address {
  @scala.inline
  def apply(
    city: String = null,
    country: String = null,
    countryCode: String = null,
    extendedAddress: String = null,
    formattedType: String = null,
    formattedValue: String = null,
    metadata: FieldMetadata = null,
    poBox: String = null,
    postalCode: String = null,
    region: String = null,
    streetAddress: String = null,
    `type`: String = null
  ): Address = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode.asInstanceOf[js.Any])
    if (extendedAddress != null) __obj.updateDynamic("extendedAddress")(extendedAddress.asInstanceOf[js.Any])
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType.asInstanceOf[js.Any])
    if (formattedValue != null) __obj.updateDynamic("formattedValue")(formattedValue.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (poBox != null) __obj.updateDynamic("poBox")(poBox.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (streetAddress != null) __obj.updateDynamic("streetAddress")(streetAddress.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

