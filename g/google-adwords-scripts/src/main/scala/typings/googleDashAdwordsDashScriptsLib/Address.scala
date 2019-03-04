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
    getCityName: js.Function0[java.lang.String],
    getCountryCode: js.Function0[java.lang.String],
    getPostalCode: js.Function0[java.lang.String],
    getProvinceCode: js.Function0[java.lang.String],
    getProvinceName: js.Function0[java.lang.String],
    getStreetAddress: js.Function0[java.lang.String],
    getStreetAddress2: js.Function0[java.lang.String]
  ): Address = {
    val __obj = js.Dynamic.literal(getCityName = getCityName, getCountryCode = getCountryCode, getPostalCode = getPostalCode, getProvinceCode = getProvinceCode, getProvinceName = getProvinceName, getStreetAddress = getStreetAddress, getStreetAddress2 = getStreetAddress2)
  
    __obj.asInstanceOf[Address]
  }
}

