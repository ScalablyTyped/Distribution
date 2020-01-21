package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Address extends js.Object {
  def getCityName(): String
  def getCountryCode(): String
  def getPostalCode(): String
  def getProvinceCode(): String
  def getProvinceName(): String
  def getStreetAddress(): String
  def getStreetAddress2(): String
}

object Address {
  @scala.inline
  def apply(
    getCityName: () => String,
    getCountryCode: () => String,
    getPostalCode: () => String,
    getProvinceCode: () => String,
    getProvinceName: () => String,
    getStreetAddress: () => String,
    getStreetAddress2: () => String
  ): Address = {
    val __obj = js.Dynamic.literal(getCityName = js.Any.fromFunction0(getCityName), getCountryCode = js.Any.fromFunction0(getCountryCode), getPostalCode = js.Any.fromFunction0(getPostalCode), getProvinceCode = js.Any.fromFunction0(getProvinceCode), getProvinceName = js.Any.fromFunction0(getProvinceName), getStreetAddress = js.Any.fromFunction0(getStreetAddress), getStreetAddress2 = js.Any.fromFunction0(getStreetAddress2))
  
    __obj.asInstanceOf[Address]
  }
}

