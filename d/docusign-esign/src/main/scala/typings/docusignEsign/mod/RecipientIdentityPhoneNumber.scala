package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecipientIdentityPhoneNumber extends js.Object {
  
  /**
    * The three-letter code for the user's country.
    */
  var countryCode: js.UndefOr[String] = js.native
  
  var extension: js.UndefOr[String] = js.native
  
  var number: js.UndefOr[String] = js.native
}
object RecipientIdentityPhoneNumber {
  
  @scala.inline
  def apply(): RecipientIdentityPhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecipientIdentityPhoneNumber]
  }
  
  @scala.inline
  implicit class RecipientIdentityPhoneNumberOps[Self <: RecipientIdentityPhoneNumber] (val x: Self) extends AnyVal {
    
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
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    
    @scala.inline
    def setExtension(value: String): Self = this.set("extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtension: Self = this.set("extension", js.undefined)
    
    @scala.inline
    def setNumber(value: String): Self = this.set("number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumber: Self = this.set("number", js.undefined)
  }
}
