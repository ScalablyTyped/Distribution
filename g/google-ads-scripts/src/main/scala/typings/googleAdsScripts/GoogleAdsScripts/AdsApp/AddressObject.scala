package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Plain JavaScript objects describing an address. */
trait AddressObject extends StObject {
  
  var cityName: js.UndefOr[String] = js.undefined
  
  var countryCode: js.UndefOr[String] = js.undefined
  
  var postalCode: js.UndefOr[String] = js.undefined
  
  var provinceCode: js.UndefOr[String] = js.undefined
  
  var provinceName: js.UndefOr[String] = js.undefined
  
  var streetAddress: js.UndefOr[String] = js.undefined
}
object AddressObject {
  
  inline def apply(): AddressObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddressObject] (val x: Self) extends AnyVal {
    
    inline def setCityName(value: String): Self = StObject.set(x, "cityName", value.asInstanceOf[js.Any])
    
    inline def setCityNameUndefined: Self = StObject.set(x, "cityName", js.undefined)
    
    inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
    
    inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setProvinceCode(value: String): Self = StObject.set(x, "provinceCode", value.asInstanceOf[js.Any])
    
    inline def setProvinceCodeUndefined: Self = StObject.set(x, "provinceCode", js.undefined)
    
    inline def setProvinceName(value: String): Self = StObject.set(x, "provinceName", value.asInstanceOf[js.Any])
    
    inline def setProvinceNameUndefined: Self = StObject.set(x, "provinceName", js.undefined)
    
    inline def setStreetAddress(value: String): Self = StObject.set(x, "streetAddress", value.asInstanceOf[js.Any])
    
    inline def setStreetAddressUndefined: Self = StObject.set(x, "streetAddress", js.undefined)
  }
}
