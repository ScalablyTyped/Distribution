package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessagingPayload extends StObject {
  
  /**
    * The data message payload.
    */
  var data: js.UndefOr[DataMessagePayload] = js.undefined
  
  /**
    * The notification message payload.
    */
  var notification: js.UndefOr[NotificationMessagePayload] = js.undefined
}
object MessagingPayload {
  
  @scala.inline
  def apply(): MessagingPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagingPayload]
  }
  
  @scala.inline
  implicit class MessagingPayloadMutableBuilder[Self <: MessagingPayload] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: DataMessagePayload): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setNotification(value: NotificationMessagePayload): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
  }
}
