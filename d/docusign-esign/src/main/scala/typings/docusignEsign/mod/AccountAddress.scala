package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountAddress extends StObject {
  
  /**
    * The first line of the address. Maximum length: 100 characters.
    */
  var address1: js.UndefOr[String] = js.native
  
  /**
    * The second line of the address. Maximum length: 100 characters.
    */
  var address2: js.UndefOr[String] = js.native
  
  /**
    * The city associated with the address. Maximum length: 40 characters.
    */
  var city: js.UndefOr[String] = js.native
  
  /**
    * The country associated with the address. Maximum length: 50 characters.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * The email address associated with the account.
    */
  var email: js.UndefOr[String] = js.native
  
  /**
    * The fax number associated with the account.
    */
  var fax: js.UndefOr[String] = js.native
  
  /**
    * The first name of the user associated with the account. Maximum Length: 50 characters.
    */
  var firstName: js.UndefOr[String] = js.native
  
  /**
    * The last name of the user associated with the account.
    */
  var lastName: js.UndefOr[String] = js.native
  
  /**
    * The phone number associated with the account.
    */
  var phone: js.UndefOr[String] = js.native
  
  /**
    * The postal code associated with the address. Maximum length: 20 characters.
    */
  var postalCode: js.UndefOr[String] = js.native
  
  /**
    * The state or province associated with the address. Maximum length: 40 characters.
    */
  var state: js.UndefOr[String] = js.native
  
  /**
    * An array of supported countries associated with the account.
    */
  var supportedCountries: js.UndefOr[js.Array[Country]] = js.native
}
object AccountAddress {
  
  @scala.inline
  def apply(): AccountAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountAddress]
  }
  
  @scala.inline
  implicit class AccountAddressMutableBuilder[Self <: AccountAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress1Undefined: Self = StObject.set(x, "address1", js.undefined)
    
    @scala.inline
    def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress2Undefined: Self = StObject.set(x, "address2", js.undefined)
    
    @scala.inline
    def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "city", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "country", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setFax(value: String): Self = StObject.set(x, "fax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaxUndefined: Self = StObject.set(x, "fax", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstNameUndefined: Self = StObject.set(x, "firstName", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastNameUndefined: Self = StObject.set(x, "lastName", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setSupportedCountries(value: js.Array[Country]): Self = StObject.set(x, "supportedCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedCountriesUndefined: Self = StObject.set(x, "supportedCountries", js.undefined)
    
    @scala.inline
    def setSupportedCountriesVarargs(value: Country*): Self = StObject.set(x, "supportedCountries", js.Array(value :_*))
  }
}
