package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaNotificationConfig extends StObject {
  
  /**
    * Pub/Sub topic for Connector to subscribe and receive notifications from `projects/{project\}/topics/{pubsub_topic\}`
    */
  var pubsubNotification: js.UndefOr[SchemaCloudPubSubNotificationConfig] = js.undefined
}
object SchemaNotificationConfig {
  
  inline def apply(): SchemaNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNotificationConfig]
  }
  
  extension [Self <: SchemaNotificationConfig](x: Self) {
    
    inline def setPubsubNotification(value: SchemaCloudPubSubNotificationConfig): Self = StObject.set(x, "pubsubNotification", value.asInstanceOf[js.Any])
    
    inline def setPubsubNotificationUndefined: Self = StObject.set(x, "pubsubNotification", js.undefined)
  }
}
