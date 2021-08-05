package typings.expoLocation.locationTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LocationGeocodedAddress extends StObject {
  
  var city: String | Null
  
  var country: String | Null
  
  var district: String | Null
  
  var isoCountryCode: String | Null
  
  var name: String | Null
  
  var postalCode: String | Null
  
  var region: String | Null
  
  var street: String | Null
  
  var subregion: String | Null
  
  var timezone: String | Null
}
object LocationGeocodedAddress {
  
  inline def apply(): LocationGeocodedAddress = {
    val __obj = js.Dynamic.literal(city = null, country = null, district = null, isoCountryCode = null, name = null, postalCode = null, region = null, street = null, subregion = null, timezone = null)
    __obj.asInstanceOf[LocationGeocodedAddress]
  }
  
  extension [Self <: LocationGeocodedAddress](x: Self) {
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityNull: Self = StObject.set(x, "city", null)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryNull: Self = StObject.set(x, "country", null)
    
    inline def setDistrict(value: String): Self = StObject.set(x, "district", value.asInstanceOf[js.Any])
    
    inline def setDistrictNull: Self = StObject.set(x, "district", null)
    
    inline def setIsoCountryCode(value: String): Self = StObject.set(x, "isoCountryCode", value.asInstanceOf[js.Any])
    
    inline def setIsoCountryCodeNull: Self = StObject.set(x, "isoCountryCode", null)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeNull: Self = StObject.set(x, "postalCode", null)
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionNull: Self = StObject.set(x, "region", null)
    
    inline def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
    
    inline def setStreetNull: Self = StObject.set(x, "street", null)
    
    inline def setSubregion(value: String): Self = StObject.set(x, "subregion", value.asInstanceOf[js.Any])
    
    inline def setSubregionNull: Self = StObject.set(x, "subregion", null)
    
    inline def setTimezone(value: String): Self = StObject.set(x, "timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneNull: Self = StObject.set(x, "timezone", null)
  }
}
