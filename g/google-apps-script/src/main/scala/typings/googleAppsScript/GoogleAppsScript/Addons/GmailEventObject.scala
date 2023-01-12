package typings.googleAppsScript.GoogleAppsScript.Addons

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @summary Event object with information on user's Gmail messages
  * @see https://developers.google.com/workspace/add-ons/concepts/event-objects#gmail_event_object
  */
trait GmailEventObject extends StObject {
  
  var accessToken: String
  
  var bccRecipients: js.UndefOr[js.Array[String]] = js.undefined
  
  var ccRecipients: js.UndefOr[js.Array[String]] = js.undefined
  
  var messageId: String
  
  var threadId: String
  
  var toRecipients: js.UndefOr[js.Array[String]] = js.undefined
}
object GmailEventObject {
  
  inline def apply(accessToken: String, messageId: String, threadId: String): GmailEventObject = {
    val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any], messageId = messageId.asInstanceOf[js.Any], threadId = threadId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GmailEventObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GmailEventObject] (val x: Self) extends AnyVal {
    
    inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    
    inline def setBccRecipients(value: js.Array[String]): Self = StObject.set(x, "bccRecipients", value.asInstanceOf[js.Any])
    
    inline def setBccRecipientsUndefined: Self = StObject.set(x, "bccRecipients", js.undefined)
    
    inline def setBccRecipientsVarargs(value: String*): Self = StObject.set(x, "bccRecipients", js.Array(value*))
    
    inline def setCcRecipients(value: js.Array[String]): Self = StObject.set(x, "ccRecipients", value.asInstanceOf[js.Any])
    
    inline def setCcRecipientsUndefined: Self = StObject.set(x, "ccRecipients", js.undefined)
    
    inline def setCcRecipientsVarargs(value: String*): Self = StObject.set(x, "ccRecipients", js.Array(value*))
    
    inline def setMessageId(value: String): Self = StObject.set(x, "messageId", value.asInstanceOf[js.Any])
    
    inline def setThreadId(value: String): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
    
    inline def setToRecipients(value: js.Array[String]): Self = StObject.set(x, "toRecipients", value.asInstanceOf[js.Any])
    
    inline def setToRecipientsUndefined: Self = StObject.set(x, "toRecipients", js.undefined)
    
    inline def setToRecipientsVarargs(value: String*): Self = StObject.set(x, "toRecipients", js.Array(value*))
  }
}
