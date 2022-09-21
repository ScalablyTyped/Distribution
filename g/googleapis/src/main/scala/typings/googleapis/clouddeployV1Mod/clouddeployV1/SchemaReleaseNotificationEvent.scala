package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReleaseNotificationEvent extends StObject {
  
  /**
    * Debug message for when a notification fails to send.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the `Release`.
    */
  var release: js.UndefOr[String | Null] = js.undefined
  
  /**
    * Type of this notification, e.g. for a Pub/Sub failure.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaReleaseNotificationEvent {
  
  inline def apply(): SchemaReleaseNotificationEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReleaseNotificationEvent]
  }
  
  extension [Self <: SchemaReleaseNotificationEvent](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseNull: Self = StObject.set(x, "release", null)
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
