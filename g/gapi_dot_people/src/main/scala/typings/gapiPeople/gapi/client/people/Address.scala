package typings.gapiPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Address extends js.Object {
  var city: String = js.native
  var country: String = js.native
  var countryCode: String = js.native
  var extendedAddress: String = js.native
  var formattedType: String = js.native
  var formattedValue: String = js.native
  var metadata: FieldMetadata = js.native
  var poBox: String = js.native
  var postalCode: String = js.native
  var region: String = js.native
  var streetAddress: String = js.native
  var `type`: String = js.native
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
  @scala.inline
  implicit class AddressOps[Self <: Address] (val x: Self) extends AnyVal {
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
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtendedAddress(value: String): Self = this.set("extendedAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormattedType(value: String): Self = this.set("formattedType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFormattedValue(value: String): Self = this.set("formattedValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetadata(value: FieldMetadata): Self = this.set("metadata", value.asInstanceOf[js.Any])
    @scala.inline
    def setPoBox(value: String): Self = this.set("poBox", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreetAddress(value: String): Self = this.set("streetAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

