package typings.googleapis.beyondcorpV1Mod.beyondcorpV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpAppconnectorsV1NotificationConfig extends StObject {
  
  /**
    * Cloud Pub/Sub Configuration to receive notifications.
    */
  var pubsubNotification: js.UndefOr[
    SchemaGoogleCloudBeyondcorpAppconnectorsV1NotificationConfigCloudPubSubNotificationConfig
  ] = js.undefined
}
object SchemaGoogleCloudBeyondcorpAppconnectorsV1NotificationConfig {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpAppconnectorsV1NotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpAppconnectorsV1NotificationConfig]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpAppconnectorsV1NotificationConfig](x: Self) {
    
    inline def setPubsubNotification(value: SchemaGoogleCloudBeyondcorpAppconnectorsV1NotificationConfigCloudPubSubNotificationConfig): Self = StObject.set(x, "pubsubNotification", value.asInstanceOf[js.Any])
    
    inline def setPubsubNotificationUndefined: Self = StObject.set(x, "pubsubNotification", js.undefined)
  }
}
