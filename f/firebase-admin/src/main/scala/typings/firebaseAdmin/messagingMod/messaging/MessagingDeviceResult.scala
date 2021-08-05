package typings.firebaseAdmin.messagingMod.messaging

import typings.firebaseAdmin.firebaseNamespaceApiMod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagingDeviceResult extends StObject {
  
  /**
    * The canonical registration token for the client app that the message was
    * processed and sent to. You should use this value as the registration token
    * for future requests. Otherwise, future messages might be rejected.
    */
  var canonicalRegistrationToken: js.UndefOr[String] = js.undefined
  
  /**
    * The error that occurred when processing the message for the recipient.
    */
  var error: js.UndefOr[FirebaseError] = js.undefined
  
  /**
    * A unique ID for the successfully processed message.
    */
  var messageId: js.UndefOr[String] = js.undefined
}
object MessagingDeviceResult {
  
  inline def apply(): MessagingDeviceResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagingDeviceResult]
  }
  
  extension [Self <: MessagingDeviceResult](x: Self) {
    
    inline def setCanonicalRegistrationToken(value: String): Self = StObject.set(x, "canonicalRegistrationToken", value.asInstanceOf[js.Any])
    
    inline def setCanonicalRegistrationTokenUndefined: Self = StObject.set(x, "canonicalRegistrationToken", js.undefined)
    
    inline def setError(value: FirebaseError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
  }
}
