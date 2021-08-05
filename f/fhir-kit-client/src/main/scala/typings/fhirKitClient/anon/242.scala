package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.Flag
import typings.jsonPatch.mod.OpPatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `242` extends StObject {
  
  var JSONPatch: js.Array[OpPatch]
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: Flag
}
object `242` {
  
  inline def apply(JSONPatch: js.Array[OpPatch], id: String): `242` = {
    val __obj = js.Dynamic.literal(JSONPatch = JSONPatch.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = "Flag")
    __obj.asInstanceOf[`242`]
  }
  
  extension [Self <: `242`](x: Self) {
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setJSONPatch(value: js.Array[OpPatch]): Self = StObject.set(x, "JSONPatch", value.asInstanceOf[js.Any])
    
    inline def setJSONPatchVarargs(value: OpPatch*): Self = StObject.set(x, "JSONPatch", js.Array(value :_*))
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: Flag): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
