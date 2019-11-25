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
    val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], extendedAddress = extendedAddress.asInstanceOf[js.Any], formattedType = formattedType.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], poBox = poBox.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], streetAddress = streetAddress.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Address]
  }
}

