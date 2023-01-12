package typings.googleAdsScripts.GoogleAdsScripts.AdsApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the address of a geographical point. Contains information about the street address, country, province / state, and postal code.
  *
  * For instance, the address "1600 Amphitheatre Parkway, Mountain View, CA 94043" will have the following values:
  *
  * * `getStreetAddress()`: "1600 Amphitheatre Parkway"
  * * `getStreetAddress2()`: `null`
  * * `getCityName()`: "Mountain View"
  * * `getProvinceCode()`: "CA"
  * * `getProvinceName()`: "California"
  * * `getPostalCode()`: "94043"
  * * `getCountryCode()`: "US"
  */
trait Address extends StObject {
  
  /** Returns the city name, or `null` if not known. */
  def getCityName(): String | Null
  
  /** Returns the country code, or `null` if not known. */
  def getCountryCode(): String | Null
  
  /** Returns the postal code, or `null` if not known. */
  def getPostalCode(): String | Null
  
  /** Returns the province / state code, or `null` if not known. */
  def getProvinceCode(): String | Null
  
  /** Returns the province / state name, or `null` if not known. */
  def getProvinceName(): String | Null
  
  /** Returns the street address, or `null` if not known. */
  def getStreetAddress(): String | Null
  
  /** Returns the second line of the street address, or `null` if not known. */
  def getStreetAddress2(): String | Null
}
object Address {
  
  inline def apply(
    getCityName: () => String | Null,
    getCountryCode: () => String | Null,
    getPostalCode: () => String | Null,
    getProvinceCode: () => String | Null,
    getProvinceName: () => String | Null,
    getStreetAddress: () => String | Null,
    getStreetAddress2: () => String | Null
  ): Address = {
    val __obj = js.Dynamic.literal(getCityName = js.Any.fromFunction0(getCityName), getCountryCode = js.Any.fromFunction0(getCountryCode), getPostalCode = js.Any.fromFunction0(getPostalCode), getProvinceCode = js.Any.fromFunction0(getProvinceCode), getProvinceName = js.Any.fromFunction0(getProvinceName), getStreetAddress = js.Any.fromFunction0(getStreetAddress), getStreetAddress2 = js.Any.fromFunction0(getStreetAddress2))
    __obj.asInstanceOf[Address]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Address] (val x: Self) extends AnyVal {
    
    inline def setGetCityName(value: () => String | Null): Self = StObject.set(x, "getCityName", js.Any.fromFunction0(value))
    
    inline def setGetCountryCode(value: () => String | Null): Self = StObject.set(x, "getCountryCode", js.Any.fromFunction0(value))
    
    inline def setGetPostalCode(value: () => String | Null): Self = StObject.set(x, "getPostalCode", js.Any.fromFunction0(value))
    
    inline def setGetProvinceCode(value: () => String | Null): Self = StObject.set(x, "getProvinceCode", js.Any.fromFunction0(value))
    
    inline def setGetProvinceName(value: () => String | Null): Self = StObject.set(x, "getProvinceName", js.Any.fromFunction0(value))
    
    inline def setGetStreetAddress(value: () => String | Null): Self = StObject.set(x, "getStreetAddress", js.Any.fromFunction0(value))
    
    inline def setGetStreetAddress2(value: () => String | Null): Self = StObject.set(x, "getStreetAddress2", js.Any.fromFunction0(value))
  }
}
