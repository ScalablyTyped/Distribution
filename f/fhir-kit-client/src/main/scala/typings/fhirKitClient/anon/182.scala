package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.ProcedureRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `182` extends StObject {
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: ProcedureRequest
  
  var version: String
}
object `182` {
  
  inline def apply(id: String, version: String): `182` = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = "ProcedureRequest", version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[`182`]
  }
  
  extension [Self <: `182`](x: Self) {
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: ProcedureRequest): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
