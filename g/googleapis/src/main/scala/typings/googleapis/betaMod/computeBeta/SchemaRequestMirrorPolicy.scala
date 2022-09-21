package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaRequestMirrorPolicy extends StObject {
  
  /**
    * The full or partial URL to the BackendService resource being mirrored to. The backend service configured for a mirroring policy must reference backends that are of the same type as the original backend service matched in the URL map. Serverless NEG backends are not currently supported as a mirrored backend service.
    */
  var backendService: js.UndefOr[String | Null] = js.undefined
}
object SchemaRequestMirrorPolicy {
  
  inline def apply(): SchemaRequestMirrorPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRequestMirrorPolicy]
  }
  
  extension [Self <: SchemaRequestMirrorPolicy](x: Self) {
    
    inline def setBackendService(value: String): Self = StObject.set(x, "backendService", value.asInstanceOf[js.Any])
    
    inline def setBackendServiceNull: Self = StObject.set(x, "backendService", null)
    
    inline def setBackendServiceUndefined: Self = StObject.set(x, "backendService", js.undefined)
  }
}
