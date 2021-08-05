package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A resource returned by the PullNotificationSet API, which contains a
  * collection of notifications for enterprises associated with the service
  * account authenticated for the request.
  */
trait SchemaNotificationSet extends StObject {
  
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;androidenterprise#notificationSet&quot;.
    */
  var kind: js.UndefOr[String] = js.undefined
  
  /**
    * The notifications received, or empty if no notifications are present.
    */
  var notification: js.UndefOr[js.Array[SchemaNotification]] = js.undefined
  
  /**
    * The notification set ID, required to mark the notification as received
    * with the Enterprises.AcknowledgeNotification API. This will be omitted if
    * no notifications are present.
    */
  var notificationSetId: js.UndefOr[String] = js.undefined
}
object SchemaNotificationSet {
  
  inline def apply(): SchemaNotificationSet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotificationSet]
  }
  
  extension [Self <: SchemaNotificationSet](x: Self) {
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setNotification(value: js.Array[SchemaNotification]): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setNotificationSetId(value: String): Self = StObject.set(x, "notificationSetId", value.asInstanceOf[js.Any])
    
    inline def setNotificationSetIdUndefined: Self = StObject.set(x, "notificationSetId", js.undefined)
    
    inline def setNotificationUndefined: Self = StObject.set(x, "notification", js.undefined)
    
    inline def setNotificationVarargs(value: SchemaNotification*): Self = StObject.set(x, "notification", js.Array(value :_*))
  }
}
