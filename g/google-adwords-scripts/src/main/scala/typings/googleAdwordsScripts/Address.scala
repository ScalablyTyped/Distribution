package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Address extends StObject {
  
  def getCityName(): String
  
  def getCountryCode(): String
  
  def getPostalCode(): String
  
  def getProvinceCode(): String
  
  def getProvinceName(): String
  
  def getStreetAddress(): String
  
  def getStreetAddress2(): String
}
object Address {
  
  inline def apply(
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
  
  extension [Self <: Address](x: Self) {
    
    inline def setGetCityName(value: () => String): Self = StObject.set(x, "getCityName", js.Any.fromFunction0(value))
    
    inline def setGetCountryCode(value: () => String): Self = StObject.set(x, "getCountryCode", js.Any.fromFunction0(value))
    
    inline def setGetPostalCode(value: () => String): Self = StObject.set(x, "getPostalCode", js.Any.fromFunction0(value))
    
    inline def setGetProvinceCode(value: () => String): Self = StObject.set(x, "getProvinceCode", js.Any.fromFunction0(value))
    
    inline def setGetProvinceName(value: () => String): Self = StObject.set(x, "getProvinceName", js.Any.fromFunction0(value))
    
    inline def setGetStreetAddress(value: () => String): Self = StObject.set(x, "getStreetAddress", js.Any.fromFunction0(value))
    
    inline def setGetStreetAddress2(value: () => String): Self = StObject.set(x, "getStreetAddress2", js.Any.fromFunction0(value))
  }
}
