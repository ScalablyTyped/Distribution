package typings.googleDashAppsDashScript.GoogleAppsScript.People.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var city: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[String] = js.undefined
  var countryCode: js.UndefOr[String] = js.undefined
  var extendedAddress: js.UndefOr[String] = js.undefined
  var formattedType: js.UndefOr[String] = js.undefined
  var formattedValue: js.UndefOr[String] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var poBox: js.UndefOr[String] = js.undefined
  var postalCode: js.UndefOr[String] = js.undefined
  var region: js.UndefOr[String] = js.undefined
  var streetAddress: js.UndefOr[String] = js.undefined
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

