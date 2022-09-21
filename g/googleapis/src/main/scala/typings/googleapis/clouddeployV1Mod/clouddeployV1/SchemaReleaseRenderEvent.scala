package typings.googleapis.clouddeployV1Mod.clouddeployV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaReleaseRenderEvent extends StObject {
  
  /**
    * Debug message for when a render transition occurs. Provides further details as rendering progresses through render states.
    */
  var message: js.UndefOr[String | Null] = js.undefined
  
  /**
    * The name of the `Release`.
    */
  var release: js.UndefOr[String | Null] = js.undefined
}
object SchemaReleaseRenderEvent {
  
  inline def apply(): SchemaReleaseRenderEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaReleaseRenderEvent]
  }
  
  extension [Self <: SchemaReleaseRenderEvent](x: Self) {
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    
    inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    inline def setReleaseNull: Self = StObject.set(x, "release", null)
    
    inline def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
  }
}
