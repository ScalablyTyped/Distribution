package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.StructureMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `93` extends StObject {
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: StructureMap
}
object `93` {
  
  inline def apply(id: String): `93` = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = "StructureMap")
    __obj.asInstanceOf[`93`]
  }
  
  extension [Self <: `93`](x: Self) {
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: StructureMap): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
