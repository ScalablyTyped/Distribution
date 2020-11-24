package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddressInformation extends js.Object {
  
  /**
    * The first line of the user's address.
    * Maximum length: 100 characters.
    */
  var address1: js.UndefOr[String] = js.native
  
  /**
    * The second line of the user's address.
    * Maximum length: 100 characters.
    */
  var address2: js.UndefOr[String] = js.native
  
  /**
    * The user's city. Maximum length: 40 characters.
    */
  var city: js.UndefOr[String] = js.native
  
  /**
    * The user's country. Maximum length: 50 characters.
    */
  var country: js.UndefOr[String] = js.native
  
  /**
    * A fax number associated with the address, if one is available.
    */
  var fax: js.UndefOr[String] = js.native
  
  /**
    * A phone number associated with the address.
    */
  var phone: js.UndefOr[String] = js.native
  
  /**
    * The user's postal code. Maximum length: 20 characters.
    */
  var postalCode: js.UndefOr[String] = js.native
  
  /**
    * The user's state or province. Maximum length: 40 characters.
    */
  var stateOrProvince: js.UndefOr[String] = js.native
}
object AddressInformation {
  
  @scala.inline
  def apply(): AddressInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddressInformation]
  }
  
  @scala.inline
  implicit class AddressInformationOps[Self <: AddressInformation] (val x: Self) extends AnyVal {
    
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
    def setFax(value: String): Self = this.set("fax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFax: Self = this.set("fax", js.undefined)
    
    @scala.inline
    def setPhone(value: String): Self = this.set("phone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhone: Self = this.set("phone", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    
    @scala.inline
    def setStateOrProvince(value: String): Self = this.set("stateOrProvince", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateOrProvince: Self = this.set("stateOrProvince", js.undefined)
  }
}
