package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddressInformation extends StObject {
  
  /**
    * The first line of the user's address.
    * Maximum length: 100 characters.
    */
  var address1: js.UndefOr[String] = js.undefined
  
  /**
    * The second line of the user's address.
    * Maximum length: 100 characters.
    */
  var address2: js.UndefOr[String] = js.undefined
  
  /**
    * The user's city. Maximum length: 40 characters.
    */
  var city: js.UndefOr[String] = js.undefined
  
  /**
    * The user's country. Maximum length: 50 characters.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * A fax number associated with the address, if one is available.
    */
  var fax: js.UndefOr[String] = js.undefined
  
  /**
    * A phone number associated with the address.
    */
  var phone: js.UndefOr[String] = js.undefined
  
  /**
    * The user's postal code. Maximum length: 20 characters.
    */
  var postalCode: js.UndefOr[String] = js.undefined
  
  /**
    * The user's state or province. Maximum length: 40 characters.
    */
  var stateOrProvince: js.UndefOr[String] = js.undefined
}
object AddressInformation {
  
  inline def apply(): AddressInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressInformation]
  }
  
  extension [Self <: AddressInformation](x: Self) {
    
    inline def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
    
    inline def setAddress1Undefined: Self = StObject.set(x, "address1", js.undefined)
    
    inline def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
    
    inline def setAddress2Undefined: Self = StObject.set(x, "address2", js.undefined)
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setFax(value: String): Self = StObject.set(x, "fax", value.asInstanceOf[js.Any])
    
    inline def setFaxUndefined: Self = StObject.set(x, "fax", js.undefined)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setStateOrProvince(value: String): Self = StObject.set(x, "stateOrProvince", value.asInstanceOf[js.Any])
    
    inline def setStateOrProvinceUndefined: Self = StObject.set(x, "stateOrProvince", js.undefined)
  }
}
