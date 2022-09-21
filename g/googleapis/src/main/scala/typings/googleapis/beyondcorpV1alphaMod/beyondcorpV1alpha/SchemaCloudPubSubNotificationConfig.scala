package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCloudPubSubNotificationConfig extends StObject {
  
  /**
    * The Pub/Sub subscription the connector uses to receive notifications.
    */
  var pubsubSubscription: js.UndefOr[String | Null] = js.undefined
}
object SchemaCloudPubSubNotificationConfig {
  
  inline def apply(): SchemaCloudPubSubNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCloudPubSubNotificationConfig]
  }
  
  extension [Self <: SchemaCloudPubSubNotificationConfig](x: Self) {
    
    inline def setPubsubSubscription(value: String): Self = StObject.set(x, "pubsubSubscription", value.asInstanceOf[js.Any])
    
    inline def setPubsubSubscriptionNull: Self = StObject.set(x, "pubsubSubscription", null)
    
    inline def setPubsubSubscriptionUndefined: Self = StObject.set(x, "pubsubSubscription", js.undefined)
  }
}
