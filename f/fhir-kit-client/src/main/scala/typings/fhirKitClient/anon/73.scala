package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.Procedure
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait `73` extends StObject {
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: Procedure
}
object `73` {
  
  inline def apply(id: String): `73` = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = "Procedure")
    __obj.asInstanceOf[`73`]
  }
  
  extension [Self <: `73`](x: Self) {
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: Procedure): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
