package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AccountAddress extends js.Object {
  
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
  implicit class AccountAddressOps[Self <: AccountAddress] (val x: Self) extends AnyVal {
    
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
    def setAddress1(value: String): Self = this.set("address1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress1: Self = this.set("address1", js.undefined)
    
    @scala.inline
    def setAddress2(value: String): Self = this.set("address2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress2: Self = this.set("address2", js.undefined)
    
    @scala.inline
    def setCity(value: String): Self = this.set("city", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCity: Self = this.set("city", js.undefined)
    
    @scala.inline
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setFax(value: String): Self = this.set("fax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFax: Self = this.set("fax", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
    
    @scala.inline
    def setSupportedCountriesVarargs(value: Country*): Self = this.set("supportedCountries", js.Array(value :_*))
    
    @scala.inline
    def setSupportedCountries(value: js.Array[Country]): Self = this.set("supportedCountries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportedCountries: Self = this.set("supportedCountries", js.undefined)
  }
}
