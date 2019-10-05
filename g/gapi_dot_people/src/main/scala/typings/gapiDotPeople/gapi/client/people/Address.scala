package typings.gapiDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  var city: String
  var country: String
  var countryCode: String
  var extendedAddress: String
  var formattedType: String
  var formattedValue: String
  var metadata: FieldMetadata
  var poBox: String
  var postalCode: String
  var region: String
  var streetAddress: String
  var `type`: String
}

object Address {
  @scala.inline
  def apply(
    city: String,
    country: String,
    countryCode: String,
    extendedAddress: String,
    formattedType: String,
    formattedValue: String,
    metadata: FieldMetadata,
    poBox: String,
    postalCode: String,
    region: String,
    streetAddress: String,
    `type`: String
  ): Address = {
    val __obj = js.Dynamic.literal(city = city, country = country, countryCode = countryCode, extendedAddress = extendedAddress, formattedType = formattedType, formattedValue = formattedValue, metadata = metadata, poBox = poBox, postalCode = postalCode, region = region, streetAddress = streetAddress)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Address]
  }
}

