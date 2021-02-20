package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressObject extends StObject {
  
  var cityName: String = js.native
  
  var countryCode: String = js.native
  
  var postalCode: String = js.native
  
  var provinceCode: String = js.native
  
  var provinceName: String = js.native
  
  var streetAddress: String = js.native
  
  var streetAddress2: String = js.native
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
  
  @scala.inline
  implicit class AddressObjectMutableBuilder[Self <: AddressObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCityName(value: String): Self = StObject.set(x, "cityName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvinceCode(value: String): Self = StObject.set(x, "provinceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvinceName(value: String): Self = StObject.set(x, "provinceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStreetAddress2(value: String): Self = StObject.set(x, "streetAddress2", value.asInstanceOf[js.Any])
  }
}
