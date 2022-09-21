package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaNotificationConfigCloudPubSubNotificationConfig extends StObject {
  
  /**
    * The Pub/Sub subscription the AppConnector uses to receive notifications.
    */
  var pubsubSubscription: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaNotificationConfigCloudPubSubNotificationConfig {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaNotificationConfigCloudPubSubNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaNotificationConfigCloudPubSubNotificationConfig]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaNotificationConfigCloudPubSubNotificationConfig](x: Self) {
    
    inline def setPubsubSubscription(value: String): Self = StObject.set(x, "pubsubSubscription", value.asInstanceOf[js.Any])
    
    inline def setPubsubSubscriptionNull: Self = StObject.set(x, "pubsubSubscription", null)
    
    inline def setPubsubSubscriptionUndefined: Self = StObject.set(x, "pubsubSubscription", js.undefined)
  }
}
