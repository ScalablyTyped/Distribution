package typings
package gapiDotClientDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  /** The city of the address. */
  var city: js.UndefOr[java.lang.String] = js.undefined
  /** The country of the address. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The [ISO 3166-1 alpha-2](http://www.iso.org/iso/country_codes.htm) country
    * code of the address.
    */
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  /** The extended address of the address; for example, the apartment number. */
  var extendedAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The read-only type of the address translated and formatted in the viewer's
    * account locale or the `Accept-Language` HTTP header locale.
    */
  var formattedType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The unstructured value of the address. If this is not set by the user it
    * will be automatically constructed from structured values.
    */
  var formattedValue: js.UndefOr[java.lang.String] = js.undefined
  /** Metadata about the address. */
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  /** The P.O. box of the address. */
  var poBox: js.UndefOr[java.lang.String] = js.undefined
  /** The postal code of the address. */
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  /** The region of the address; for example, the state or province. */
  var region: js.UndefOr[java.lang.String] = js.undefined
  /** The street address. */
  var streetAddress: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The type of the address. The type can be custom or predefined.
    * Possible values include, but are not limited to, the following:
    *
    * &#42; `home`
    * &#42; `work`
    * &#42; `other`
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object Address {
  @scala.inline
  def apply(
    city: java.lang.String = null,
    country: java.lang.String = null,
    countryCode: java.lang.String = null,
    extendedAddress: java.lang.String = null,
    formattedType: java.lang.String = null,
    formattedValue: java.lang.String = null,
    metadata: FieldMetadata = null,
    poBox: java.lang.String = null,
    postalCode: java.lang.String = null,
    region: java.lang.String = null,
    streetAddress: java.lang.String = null,
    `type`: java.lang.String = null
  ): Address = {
    val __obj = js.Dynamic.literal()
    if (city != null) __obj.updateDynamic("city")(city)
    if (country != null) __obj.updateDynamic("country")(country)
    if (countryCode != null) __obj.updateDynamic("countryCode")(countryCode)
    if (extendedAddress != null) __obj.updateDynamic("extendedAddress")(extendedAddress)
    if (formattedType != null) __obj.updateDynamic("formattedType")(formattedType)
    if (formattedValue != null) __obj.updateDynamic("formattedValue")(formattedValue)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (poBox != null) __obj.updateDynamic("poBox")(poBox)
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode)
    if (region != null) __obj.updateDynamic("region")(region)
    if (streetAddress != null) __obj.updateDynamic("streetAddress")(streetAddress)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Address]
  }
}

