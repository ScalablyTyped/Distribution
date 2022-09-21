package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRolloutNotificationEvent extends StObject {
  
  /**
    * Debug message for when a notification fails to send.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique identifier of the `DeliveryPipeline`.
    */
  var pipelineUid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Unique identifier of the `Release`.
    */
  var releaseUid: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the `Rollout`.
    */
  var rollout: js.UndefOr[String | Null] = js.undefined
  
  /**
    * ID of the `Target` that the rollout is deployed to.
    */
  var targetId: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of this notification, e.g. for a Pub/Sub failure.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaRolloutNotificationEvent {
  
  inline def apply(): SchemaRolloutNotificationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRolloutNotificationEvent]
  }
  
  extension [Self <: SchemaRolloutNotificationEvent](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setPipelineUid(value: String): Self = StObject.set(x, "pipelineUid", value.asInstanceOf[js.Any])
    
    inline def setPipelineUidNull: Self = StObject.set(x, "pipelineUid", null)
    
    inline def setPipelineUidUndefined: Self = StObject.set(x, "pipelineUid", js.undefined)
    
    inline def setReleaseUid(value: String): Self = StObject.set(x, "releaseUid", value.asInstanceOf[js.Any])
    
    inline def setReleaseUidNull: Self = StObject.set(x, "releaseUid", null)
    
    inline def setReleaseUidUndefined: Self = StObject.set(x, "releaseUid", js.undefined)
    
    inline def setRollout(value: String): Self = StObject.set(x, "rollout", value.asInstanceOf[js.Any])
    
    inline def setRolloutNull: Self = StObject.set(x, "rollout", null)
    
    inline def setRolloutUndefined: Self = StObject.set(x, "rollout", js.undefined)
    
    inline def setTargetId(value: String): Self = StObject.set(x, "targetId", value.asInstanceOf[js.Any])
    
    inline def setTargetIdNull: Self = StObject.set(x, "targetId", null)
    
    inline def setTargetIdUndefined: Self = StObject.set(x, "targetId", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
