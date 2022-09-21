package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaAppsDynamiteSharedMessageIntegrationPayload extends StObject {
  
  /**
    * Pantheon project number used to identify the calling app.
    */
  var projectNumber: js.UndefOr[String | Null] = js.undefined
  
  var tasksMessageIntegrationPayload: js.UndefOr[SchemaAppsDynamiteSharedTasksMessageIntegrationPayload] = js.undefined
  
  /**
    * An enum indicating which 1P application's payload this is. This field is required to add 1P payload.
    */
  var `type`: js.UndefOr[String | Null] = js.undefined
}
object SchemaAppsDynamiteSharedMessageIntegrationPayload {
  
  inline def apply(): SchemaAppsDynamiteSharedMessageIntegrationPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAppsDynamiteSharedMessageIntegrationPayload]
  }
  
  extension [Self <: SchemaAppsDynamiteSharedMessageIntegrationPayload](x: Self) {
    
    inline def setProjectNumber(value: String): Self = StObject.set(x, "projectNumber", value.asInstanceOf[js.Any])
    
    inline def setProjectNumberNull: Self = StObject.set(x, "projectNumber", null)
    
    inline def setProjectNumberUndefined: Self = StObject.set(x, "projectNumber", js.undefined)
    
    inline def setTasksMessageIntegrationPayload(value: SchemaAppsDynamiteSharedTasksMessageIntegrationPayload): Self = StObject.set(x, "tasksMessageIntegrationPayload", value.asInstanceOf[js.Any])
    
    inline def setTasksMessageIntegrationPayloadUndefined: Self = StObject.set(x, "tasksMessageIntegrationPayload", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeNull: Self = StObject.set(x, "type", null)
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
