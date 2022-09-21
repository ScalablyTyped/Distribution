package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmailSettings extends StObject {
  
  /**
    * An array containing the email address that should receive a copy of all email communications related to an envelope for archiving purposes. Maximum Length: 100 characters.
    *
    * While this property is an array, note that it takes only a single email address.
    *
    * **Note**: Only users with the `canManageAccount` setting set to **true** can use this option.
    *
    * DocuSign verifies that the email format is correct, but does not verify that the email address is active. You can use this for archiving purposes. However,
    * using this property overrides the BCC for Email Archive information setting for this envelope.
    *
    * **Example**: if your account has BCC for Email Archive set up for the email address archive@mycompany.com and you send an envelope using the BCC Email
    * Override to send a BCC email to salesarchive@mycompany.com, then a copy of the envelope is only sent to the salesarchive@mycompany.com email address.
    */
  var bccEmailAddresses: js.UndefOr[
    js.Array[/* Contains information about the BCC email address. */ BccEmailAddress]
  ] = js.undefined
  
  /**
    * The Reply To email address to use for email replies, instead of the one that is configured at the account level. DocuSign verifies that the email address
    * is in a correct format, but does not verify that it is active. Maximum Length: 100 characters.
    */
  var replyEmailAddressOverride: js.UndefOr[String] = js.undefined
  
  /**
    * The name to associate with the Reply To email address, instead of the name that is configured at the account level. Maximum Length: 100 characters.
    */
  var replyEmailNameOverride: js.UndefOr[String] = js.undefined
}
object EmailSettings {
  
  inline def apply(): EmailSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EmailSettings]
  }
  
  extension [Self <: EmailSettings](x: Self) {
    
    inline def setBccEmailAddresses(value: js.Array[/* Contains information about the BCC email address. */ BccEmailAddress]): Self = StObject.set(x, "bccEmailAddresses", value.asInstanceOf[js.Any])
    
    inline def setBccEmailAddressesUndefined: Self = StObject.set(x, "bccEmailAddresses", js.undefined)
    
    inline def setBccEmailAddressesVarargs(value: (/* Contains information about the BCC email address. */ BccEmailAddress)*): Self = StObject.set(x, "bccEmailAddresses", js.Array(value*))
    
    inline def setReplyEmailAddressOverride(value: String): Self = StObject.set(x, "replyEmailAddressOverride", value.asInstanceOf[js.Any])
    
    inline def setReplyEmailAddressOverrideUndefined: Self = StObject.set(x, "replyEmailAddressOverride", js.undefined)
    
    inline def setReplyEmailNameOverride(value: String): Self = StObject.set(x, "replyEmailNameOverride", value.asInstanceOf[js.Any])
    
    inline def setReplyEmailNameOverrideUndefined: Self = StObject.set(x, "replyEmailNameOverride", js.undefined)
  }
}
