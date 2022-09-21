package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpAppconnectorsV1NotificationConfigCloudPubSubNotificationConfig extends StObject {
  
  /**
    * The Pub/Sub subscription the AppConnector uses to receive notifications.
    */
  var pubsubSubscription: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudBeyondcorpAppconnectorsV1NotificationConfigCloudPubSubNotificationConfig {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpAppconnectorsV1NotificationConfigCloudPubSubNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpAppconnectorsV1NotificationConfigCloudPubSubNotificationConfig]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpAppconnectorsV1NotificationConfigCloudPubSubNotificationConfig](x: Self) {
    
    inline def setPubsubSubscription(value: String): Self = StObject.set(x, "pubsubSubscription", value.asInstanceOf[js.Any])
    
    inline def setPubsubSubscriptionNull: Self = StObject.set(x, "pubsubSubscription", null)
    
    inline def setPubsubSubscriptionUndefined: Self = StObject.set(x, "pubsubSubscription", js.undefined)
  }
}
