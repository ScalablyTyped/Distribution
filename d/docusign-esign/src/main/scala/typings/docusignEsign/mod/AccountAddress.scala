package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountAddress extends StObject {
  
  /**
    * The first line of the address. Maximum length: 100 characters.
    */
  var address1: js.UndefOr[String] = js.undefined
  
  /**
    * The second line of the address. Maximum length: 100 characters.
    */
  var address2: js.UndefOr[String] = js.undefined
  
  /**
    * The city associated with the address. Maximum length: 40 characters.
    */
  var city: js.UndefOr[String] = js.undefined
  
  /**
    * The country associated with the address. Maximum length: 50 characters.
    */
  var country: js.UndefOr[String] = js.undefined
  
  /**
    * The email address associated with the account.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * The fax number associated with the account.
    */
  var fax: js.UndefOr[String] = js.undefined
  
  /**
    * The first name of the user associated with the account. Maximum Length: 50 characters.
    */
  var firstName: js.UndefOr[String] = js.undefined
  
  /**
    * The last name of the user associated with the account.
    */
  var lastName: js.UndefOr[String] = js.undefined
  
  /**
    * The phone number associated with the account.
    */
  var phone: js.UndefOr[String] = js.undefined
  
  /**
    * The postal code associated with the address. Maximum length: 20 characters.
    */
  var postalCode: js.UndefOr[String] = js.undefined
  
  /**
    * The state or province associated with the address. Maximum length: 40 characters.
    */
  var state: js.UndefOr[String] = js.undefined
  
  /**
    * An array of supported countries associated with the account.
    */
  var supportedCountries: js.UndefOr[js.Array[Country]] = js.undefined
}
object AccountAddress {
  
  inline def apply(): AccountAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAddress]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AccountAddress] (val x: Self) extends AnyVal {
    
    inline def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
    
    inline def setAddress1Undefined: Self = StObject.set(x, "address1", js.undefined)
    
    inline def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
    
    inline def setAddress2Undefined: Self = StObject.set(x, "address2", js.undefined)
    
    inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setFax(value: String): Self = StObject.set(x, "fax", value.asInstanceOf[js.Any])
    
    inline def setFaxUndefined: Self = StObject.set(x, "fax", js.undefined)
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSupportedCountries(value: js.Array[Country]): Self = StObject.set(x, "supportedCountries", value.asInstanceOf[js.Any])
    
    inline def setSupportedCountriesUndefined: Self = StObject.set(x, "supportedCountries", js.undefined)
    
    inline def setSupportedCountriesVarargs(value: Country*): Self = StObject.set(x, "supportedCountries", js.Array(value*))
  }
}
