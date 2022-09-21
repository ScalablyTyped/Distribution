package typings.googleapis.beyondcorpV1alphaMod.beyondcorpV1alpha

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaAppConnectorInstanceConfig extends StObject {
  
  /**
    * ImageConfig defines the GCR images to run for the remote agent's control plane.
    */
  var imageConfig: js.UndefOr[SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaImageConfig] = js.undefined
  
  /**
    * The SLM instance agent configuration.
    */
  var instanceConfig: js.UndefOr[StringDictionary[Any] | Null] = js.undefined
  
  /**
    * NotificationConfig defines the notification mechanism that the remote instance should subscribe to in order to receive notification.
    */
  var notificationConfig: js.UndefOr[SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaNotificationConfig] = js.undefined
  
  /**
    * Required. A monotonically increasing number generated and maintained by the API provider. Every time a config changes in the backend, the sequenceNumber should be bumped up to reflect the change.
    */
  var sequenceNumber: js.UndefOr[String | Null] = js.undefined
}
object SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaAppConnectorInstanceConfig {
  
  inline def apply(): SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaAppConnectorInstanceConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaAppConnectorInstanceConfig]
  }
  
  extension [Self <: SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaAppConnectorInstanceConfig](x: Self) {
    
    inline def setImageConfig(value: SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaImageConfig): Self = StObject.set(x, "imageConfig", value.asInstanceOf[js.Any])
    
    inline def setImageConfigUndefined: Self = StObject.set(x, "imageConfig", js.undefined)
    
    inline def setInstanceConfig(value: StringDictionary[Any]): Self = StObject.set(x, "instanceConfig", value.asInstanceOf[js.Any])
    
    inline def setInstanceConfigNull: Self = StObject.set(x, "instanceConfig", null)
    
    inline def setInstanceConfigUndefined: Self = StObject.set(x, "instanceConfig", js.undefined)
    
    inline def setNotificationConfig(value: SchemaGoogleCloudBeyondcorpAppconnectorsV1alphaNotificationConfig): Self = StObject.set(x, "notificationConfig", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigUndefined: Self = StObject.set(x, "notificationConfig", js.undefined)
    
    inline def setSequenceNumber(value: String): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumberNull: Self = StObject.set(x, "sequenceNumber", null)
    
    inline def setSequenceNumberUndefined: Self = StObject.set(x, "sequenceNumber", js.undefined)
  }
}
