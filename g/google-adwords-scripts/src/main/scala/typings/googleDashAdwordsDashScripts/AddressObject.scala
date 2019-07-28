package typings.googleDashAdwordsDashScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressObject extends js.Object {
  var cityName: String
  var countryCode: String
  var postalCode: String
  var provinceCode: String
  var provinceName: String
  var streetAddress: String
  var streetAddress2: String
}

object AddressObject {
  @scala.inline
  def apply(
    cityName: String,
    countryCode: String,
    postalCode: String,
    provinceCode: String,
    provinceName: String,
    streetAddress: String,
    streetAddress2: String
  ): AddressObject = {
    val __obj = js.Dynamic.literal(cityName = cityName, countryCode = countryCode, postalCode = postalCode, provinceCode = provinceCode, provinceName = provinceName, streetAddress = streetAddress, streetAddress2 = streetAddress2)
  
    __obj.asInstanceOf[AddressObject]
  }
}

