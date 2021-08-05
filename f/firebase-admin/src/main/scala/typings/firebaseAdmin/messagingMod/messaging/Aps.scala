package typings.firebaseAdmin.messagingMod.messaging

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aps
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  /**
    * Alert to be included in the message. This may be a string or an object of
    * type `admin.messaging.ApsAlert`.
    */
  var alert: js.UndefOr[String | ApsAlert] = js.undefined
  
  /**
    * Badge to be displayed with the message. Set to 0 to remove the badge. When
    * not specified, the badge will remain unchanged.
    */
  var badge: js.UndefOr[Double] = js.undefined
  
  /**
    * Type of the notification.
    */
  var category: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies whether to configure a background update notification.
    */
  var contentAvailable: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether to set the `mutable-content` property on the message
    * so the clients can modify the notification via app extensions.
    */
  var mutableContent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Sound to be played with the message.
    */
  var sound: js.UndefOr[String | CriticalSound] = js.undefined
  
  /**
    * An app-specific identifier for grouping notifications.
    */
  var threadId: js.UndefOr[String] = js.undefined
}
object Aps {
  
  inline def apply(): Aps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Aps]
  }
  
  extension [Self <: Aps](x: Self) {
    
    inline def setAlert(value: String | ApsAlert): Self = StObject.set(x, "alert", value.asInstanceOf[js.Any])
    
    inline def setAlertUndefined: Self = StObject.set(x, "alert", js.undefined)
    
    inline def setBadge(value: Double): Self = StObject.set(x, "badge", value.asInstanceOf[js.Any])
    
    inline def setBadgeUndefined: Self = StObject.set(x, "badge", js.undefined)
    
    inline def setCategory(value: String): Self = StObject.set(x, "category", value.asInstanceOf[js.Any])
    
    inline def setCategoryUndefined: Self = StObject.set(x, "category", js.undefined)
    
    inline def setContentAvailable(value: Boolean): Self = StObject.set(x, "contentAvailable", value.asInstanceOf[js.Any])
    
    inline def setContentAvailableUndefined: Self = StObject.set(x, "contentAvailable", js.undefined)
    
    inline def setMutableContent(value: Boolean): Self = StObject.set(x, "mutableContent", value.asInstanceOf[js.Any])
    
    inline def setMutableContentUndefined: Self = StObject.set(x, "mutableContent", js.undefined)
    
    inline def setSound(value: String | CriticalSound): Self = StObject.set(x, "sound", value.asInstanceOf[js.Any])
    
    inline def setSoundUndefined: Self = StObject.set(x, "sound", js.undefined)
    
    inline def setThreadId(value: String): Self = StObject.set(x, "threadId", value.asInstanceOf[js.Any])
    
    inline def setThreadIdUndefined: Self = StObject.set(x, "threadId", js.undefined)
  }
}
