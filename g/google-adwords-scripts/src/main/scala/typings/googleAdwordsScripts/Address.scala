package typings.googleAdwordsScripts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Address extends js.Object {
  
  def getCityName(): String = js.native
  
  def getCountryCode(): String = js.native
  
  def getPostalCode(): String = js.native
  
  def getProvinceCode(): String = js.native
  
  def getProvinceName(): String = js.native
  
  def getStreetAddress(): String = js.native
  
  def getStreetAddress2(): String = js.native
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
    def setGetCityName(value: () => String): Self = this.set("getCityName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetCountryCode(value: () => String): Self = this.set("getCountryCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPostalCode(value: () => String): Self = this.set("getPostalCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProvinceCode(value: () => String): Self = this.set("getProvinceCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetProvinceName(value: () => String): Self = this.set("getProvinceName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStreetAddress(value: () => String): Self = this.set("getStreetAddress", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetStreetAddress2(value: () => String): Self = this.set("getStreetAddress2", js.Any.fromFunction0(value))
  }
}
