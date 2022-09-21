package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaNotificationConfig extends StObject {
  
  /**
    * Cloud Pub/Sub Configuration to receive notifications.
    */
  var pubsubNotification: js.UndefOr[
    SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaNotificationConfigCloudPubSubNotificationConfig
  ] = js.undefined
}
object SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaNotificationConfig {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaNotificationConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaNotificationConfig]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaNotificationConfig](x: Self) {
    
    inline def setPubsubNotification(
      value: SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaNotificationConfigCloudPubSubNotificationConfig
    ): Self = StObject.set(x, "pubsubNotification", value.asInstanceOf[js.Any])
    
    inline def setPubsubNotificationUndefined: Self = StObject.set(x, "pubsubNotification", js.undefined)
  }
}
