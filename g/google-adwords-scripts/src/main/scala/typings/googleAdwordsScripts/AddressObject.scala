package typings.googleAdwordsScripts

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
    val __obj = js.Dynamic.literal(cityName = cityName.asInstanceOf[js.Any], countryCode = countryCode.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], provinceCode = provinceCode.asInstanceOf[js.Any], provinceName = provinceName.asInstanceOf[js.Any], streetAddress = streetAddress.asInstanceOf[js.Any], streetAddress2 = streetAddress2.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddressObject]
  }
}

