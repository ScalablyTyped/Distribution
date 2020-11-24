package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactPhoneNumber extends js.Object {
  
  /**
    * The contact's phone number.
    *
    * Example: `+12223334444`
    */
  var phoneNumber: js.UndefOr[String] = js.native
  
  /**
    * The type of phone number. Valid values are:
    *
    * - `home`
    * - `mobile`
    * - `work`
    * - `other`
    * - `fax`
    */
  var phoneType: js.UndefOr[String] = js.native
}
object ContactPhoneNumber {
  
  @scala.inline
  def apply(): ContactPhoneNumber = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContactPhoneNumber]
  }
  
  @scala.inline
  implicit class ContactPhoneNumberOps[Self <: ContactPhoneNumber] (val x: Self) extends AnyVal {
    
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
    def setPhoneNumber(value: String): Self = this.set("phoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneNumber: Self = this.set("phoneNumber", js.undefined)
    
    @scala.inline
    def setPhoneType(value: String): Self = this.set("phoneType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhoneType: Self = this.set("phoneType", js.undefined)
  }
}
