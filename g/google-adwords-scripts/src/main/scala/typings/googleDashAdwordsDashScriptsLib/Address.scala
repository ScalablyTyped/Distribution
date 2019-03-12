package typings
package googleDashAdwordsDashScriptsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  def getCityName(): java.lang.String
  def getCountryCode(): java.lang.String
  def getPostalCode(): java.lang.String
  def getProvinceCode(): java.lang.String
  def getProvinceName(): java.lang.String
  def getStreetAddress(): java.lang.String
  def getStreetAddress2(): java.lang.String
}

object Address {
  @scala.inline
  def apply(
    getCityName: () => java.lang.String,
    getCountryCode: () => java.lang.String,
    getPostalCode: () => java.lang.String,
    getProvinceCode: () => java.lang.String,
    getProvinceName: () => java.lang.String,
    getStreetAddress: () => java.lang.String,
    getStreetAddress2: () => java.lang.String
  ): Address = {
    val __obj = js.Dynamic.literal(getCityName = js.Any.fromFunction0(getCityName), getCountryCode = js.Any.fromFunction0(getCountryCode), getPostalCode = js.Any.fromFunction0(getPostalCode), getProvinceCode = js.Any.fromFunction0(getProvinceCode), getProvinceName = js.Any.fromFunction0(getProvinceName), getStreetAddress = js.Any.fromFunction0(getStreetAddress), getStreetAddress2 = js.Any.fromFunction0(getStreetAddress2))
  
    __obj.asInstanceOf[Address]
  }
}

