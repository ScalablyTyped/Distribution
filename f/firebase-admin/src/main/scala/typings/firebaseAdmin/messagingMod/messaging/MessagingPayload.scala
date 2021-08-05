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
  
  inline def apply(): MessagingPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessagingPayload]
  }
  
  extension [Self <: MessagingPayload](x: Self) {
    
    inline def setData(value: DataMessagePayload): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setNotification(value: NotificationMessagePayload): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
  }
}
