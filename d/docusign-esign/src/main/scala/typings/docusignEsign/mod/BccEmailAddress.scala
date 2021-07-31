package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BccEmailAddress extends StObject {
  
  /**
    * Only users with canManageAccount setting can use this option. An array of up to 5 email addresses the envelope is sent to as a BCC email.
    *
    * Example: If your account has BCC for Email Archive set up for the email address 'archive@mycompany.com' and you send an envelope using the BCC
    * Email Override to send a BCC email to 'salesarchive@mycompany.com', then a copy of the envelope is only sent to the 'salesarchive@mycompany.com' email address.
    */
  var bccEmailAddressId: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies the BCC email address. DocuSign verifies that the email format is correct, but does not verify that the email is active.Using this overrides the BCC
    * for Email Archive information setting for this envelope.
    *
    * Maximum of length: 100 characters.
    */
  var email: js.UndefOr[String] = js.undefined
}
object BccEmailAddress {
  
  @scala.inline
  def apply(): BccEmailAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BccEmailAddress]
  }
  
  @scala.inline
  implicit class BccEmailAddressMutableBuilder[Self <: BccEmailAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBccEmailAddressId(value: String): Self = StObject.set(x, "bccEmailAddressId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBccEmailAddressIdUndefined: Self = StObject.set(x, "bccEmailAddressId", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
  }
}
