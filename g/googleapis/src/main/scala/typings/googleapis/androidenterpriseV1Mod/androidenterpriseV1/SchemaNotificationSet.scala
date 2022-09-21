package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNotificationSet extends StObject {
  
  /**
    * The notifications received, or empty if no notifications are present.
    */
  var notification: js.UndefOr[js.Array[SchemaNotification]] = js.undefined
  
  /**
    * The notification set ID, required to mark the notification as received with the Enterprises.AcknowledgeNotification API. This will be omitted if no notifications are present.
    */
  var notificationSetId: js.UndefOr[String | Null] = js.undefined
}
object SchemaNotificationSet {
  
  inline def apply(): SchemaNotificationSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotificationSet]
  }
  
  extension [Self <: SchemaNotificationSet](x: Self) {
    
    inline def setNotification(value: js.Array[SchemaNotification]): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationSetId(value: String): Self = StObject.set(x, "notificationSetId", value.asInstanceOf[js.Any])
    
    inline def setNotificationSetIdNull: Self = StObject.set(x, "notificationSetId", null)
    
    inline def setNotificationSetIdUndefined: Self = StObject.set(x, "notificationSetId", js.undefined)
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setNotificationVarargs(value: SchemaNotification*): Self = StObject.set(x, "notification", js.Array(value*))
  }
}
