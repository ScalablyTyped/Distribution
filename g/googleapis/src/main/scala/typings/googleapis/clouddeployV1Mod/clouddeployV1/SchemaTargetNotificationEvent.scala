package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaTargetNotificationEvent extends StObject {
  
  /**
    * Debug message for when a notification fails to send.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the `Target`.
    */
  var target: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of this notification, e.g. for a Pub/Sub failure.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaTargetNotificationEvent {
  
  inline def apply(): SchemaTargetNotificationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTargetNotificationEvent]
  }
  
  extension [Self <: SchemaTargetNotificationEvent](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
