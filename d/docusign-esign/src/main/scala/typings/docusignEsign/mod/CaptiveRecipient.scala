package typings.docusignEsign.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CaptiveRecipient extends StObject {
  
  /**
    * Specifies whether the recipient is embedded or remote.
    *
    * If the `clientUserId` property is not null then the recipient is embedded. Use this field to associate the signer with their userId in your app.
    * Authenticating the user is the responsibility of your app when you use embedded signing.
    *
    * Note: if the `clientUserId` property is set and either `SignerMustHaveAccount` or `SignerMustLoginToSign` property of the account settings is set to
    * **true**, an error is generated on sending.
    *
    * Maximum length: 100 characters.
    */
  var clientUserId: js.UndefOr[String] = js.undefined
  
  /**
    * The email address associated with the captive recipient.
    */
  var email: js.UndefOr[String] = js.undefined
  
  /**
    * This object describes errors that occur. It is only valid for responses and ignored in requests.
    */
  var errorDetails: js.UndefOr[
    /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
  ] = js.undefined
  
  /**
    * The username associated with the captive recipient.
    */
  var userName: js.UndefOr[String] = js.undefined
}
object CaptiveRecipient {
  
  @scala.inline
  def apply(): CaptiveRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CaptiveRecipient]
  }
  
  @scala.inline
  implicit class CaptiveRecipientMutableBuilder[Self <: CaptiveRecipient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientUserId(value: String): Self = StObject.set(x, "clientUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientUserIdUndefined: Self = StObject.set(x, "clientUserId", js.undefined)
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    @scala.inline
    def setErrorDetails(
      value: /* This object describes errors that occur. It is only valid for responses and ignored in requests. */ ErrorDetails
    ): Self = StObject.set(x, "errorDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorDetailsUndefined: Self = StObject.set(x, "errorDetails", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
