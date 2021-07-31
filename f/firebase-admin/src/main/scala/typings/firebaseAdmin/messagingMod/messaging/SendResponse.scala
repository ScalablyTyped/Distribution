package typings.firebaseAdmin.messagingMod.messaging

import typings.firebaseAdmin.firebaseNamespaceApiMod.FirebaseError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendResponse extends StObject {
  
  /**
    * An error, if the message was not handed off to FCM successfully.
    */
  var error: js.UndefOr[FirebaseError] = js.undefined
  
  /**
    * A unique message ID string, if the message was handed off to FCM for
    * delivery.
    *
    */
  var messageId: js.UndefOr[String] = js.undefined
  
  /**
    * A boolean indicating if the message was successfully handed off to FCM or
    * not. When true, the `messageId` attribute is guaranteed to be set. When
    * false, the `error` attribute is guaranteed to be set.
    */
  var success: Boolean
}
object SendResponse {
  
  @scala.inline
  def apply(success: Boolean): SendResponse = {
    val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendResponse]
  }
  
  @scala.inline
  implicit class SendResponseMutableBuilder[Self <: SendResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setError(value: FirebaseError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessageIdUndefined: Self = StObject.set(x, "messageId", js.undefined)
    
    @scala.inline
    def setSuccess(value: Boolean): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
  }
}
