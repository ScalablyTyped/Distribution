package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AddressObject extends js.Object {
  var cityName: java.lang.String
  var countryCode: java.lang.String
  var postalCode: java.lang.String
  var provinceCode: java.lang.String
  var provinceName: java.lang.String
  var streetAddress: java.lang.String
  var streetAddress2: java.lang.String
}

object AddressObject {
  @scala.inline
  def apply(
    cityName: java.lang.String,
    countryCode: java.lang.String,
    postalCode: java.lang.String,
    provinceCode: java.lang.String,
    provinceName: java.lang.String,
    streetAddress: java.lang.String,
    streetAddress2: java.lang.String
  ): AddressObject = {
    val __obj = js.Dynamic.literal(cityName = cityName, countryCode = countryCode, postalCode = postalCode, provinceCode = provinceCode, provinceName = provinceName, streetAddress = streetAddress, streetAddress2 = streetAddress2)
  
    __obj.asInstanceOf[AddressObject]
  }
}

