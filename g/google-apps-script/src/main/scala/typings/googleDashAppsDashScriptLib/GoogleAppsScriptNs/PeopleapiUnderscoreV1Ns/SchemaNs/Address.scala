package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.PeopleapiUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var city: js.UndefOr[java.lang.String] = js.undefined
  var country: js.UndefOr[java.lang.String] = js.undefined
  var countryCode: js.UndefOr[java.lang.String] = js.undefined
  var extendedAddress: js.UndefOr[java.lang.String] = js.undefined
  var formattedType: js.UndefOr[java.lang.String] = js.undefined
  var formattedValue: js.UndefOr[java.lang.String] = js.undefined
  var metadata: js.UndefOr[FieldMetadata] = js.undefined
  var poBox: js.UndefOr[java.lang.String] = js.undefined
  var postalCode: js.UndefOr[java.lang.String] = js.undefined
  var region: js.UndefOr[java.lang.String] = js.undefined
  var streetAddress: js.UndefOr[java.lang.String] = js.undefined
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

