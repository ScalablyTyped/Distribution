package typings.docusignEsign.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BccEmailAddress extends js.Object {
  
  /**
    * Only users with canManageAccount setting can use this option. An array of up to 5 email addresses the envelope is sent to as a BCC email.
    *
    * Example: If your account has BCC for Email Archive set up for the email address 'archive@mycompany.com' and you send an envelope using the BCC
    * Email Override to send a BCC email to 'salesarchive@mycompany.com', then a copy of the envelope is only sent to the 'salesarchive@mycompany.com' email address.
    */
  var bccEmailAddressId: js.UndefOr[String] = js.native
  
  /**
    * Specifies the BCC email address. DocuSign verifies that the email format is correct, but does not verify that the email is active.Using this overrides the BCC
    * for Email Archive information setting for this envelope.
    *
    * Maximum of length: 100 characters.
    */
  var email: js.UndefOr[String] = js.native
}
object BccEmailAddress {
  
  @scala.inline
  def apply(): BccEmailAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BccEmailAddress]
  }
  
  @scala.inline
  implicit class BccEmailAddressOps[Self <: BccEmailAddress] (val x: Self) extends AnyVal {
    
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
    def setBccEmailAddressId(value: String): Self = this.set("bccEmailAddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBccEmailAddressId: Self = this.set("bccEmailAddressId", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
  }
}
