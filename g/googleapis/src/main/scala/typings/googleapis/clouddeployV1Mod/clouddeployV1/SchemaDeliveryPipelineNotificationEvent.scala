package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaDeliveryPipelineNotificationEvent extends StObject {
  
  /**
    * The name of the `Delivery Pipeline`.
    */
  var deliveryPipeline: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Debug message for when a notification fails to send.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of this notification, e.g. for a Pub/Sub failure.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaDeliveryPipelineNotificationEvent {
  
  inline def apply(): SchemaDeliveryPipelineNotificationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeliveryPipelineNotificationEvent]
  }
  
  extension [Self <: SchemaDeliveryPipelineNotificationEvent](x: Self) {
    
    inline def setDeliveryPipeline(value: String): Self = StObject.set(x, "deliveryPipeline", value.asInstanceOf[js.Any])
    
    inline def setDeliveryPipelineNull: Self = StObject.set(x, "deliveryPipeline", null)
    
    inline def setDeliveryPipelineUndefined: Self = StObject.set(x, "deliveryPipeline", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
