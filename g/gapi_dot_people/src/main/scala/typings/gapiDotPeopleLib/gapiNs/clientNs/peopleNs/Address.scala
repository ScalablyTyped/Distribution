package typings
package gapiDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var city: java.lang.String
  var country: java.lang.String
  var countryCode: java.lang.String
  var extendedAddress: java.lang.String
  var formattedType: java.lang.String
  var formattedValue: java.lang.String
  var metadata: FieldMetadata
  var poBox: java.lang.String
  var postalCode: java.lang.String
  var region: java.lang.String
  var streetAddress: java.lang.String
  var `type`: java.lang.String
}

object Address {
  @scala.inline
  def apply(
    city: java.lang.String,
    country: java.lang.String,
    countryCode: java.lang.String,
    extendedAddress: java.lang.String,
    formattedType: java.lang.String,
    formattedValue: java.lang.String,
    metadata: FieldMetadata,
    poBox: java.lang.String,
    postalCode: java.lang.String,
    region: java.lang.String,
    streetAddress: java.lang.String,
    `type`: java.lang.String
  ): Address = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("city")(city)
    __obj.updateDynamic("country")(country)
    __obj.updateDynamic("countryCode")(countryCode)
    __obj.updateDynamic("extendedAddress")(extendedAddress)
    __obj.updateDynamic("formattedType")(formattedType)
    __obj.updateDynamic("formattedValue")(formattedValue)
    __obj.updateDynamic("metadata")(metadata)
    __obj.updateDynamic("poBox")(poBox)
    __obj.updateDynamic("postalCode")(postalCode)
    __obj.updateDynamic("region")(region)
    __obj.updateDynamic("streetAddress")(streetAddress)
    __obj.asInstanceOf[Address]
  }
}

