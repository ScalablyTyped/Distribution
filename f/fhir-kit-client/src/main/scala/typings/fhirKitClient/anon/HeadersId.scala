package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.AllergyIntolerance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersId extends StObject {
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: AllergyIntolerance
}
object HeadersId {
  
  inline def apply(id: String): HeadersId = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], resourceType = "AllergyIntolerance")
    __obj.asInstanceOf[HeadersId]
  }
  
  extension [Self <: HeadersId](x: Self) {
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: AllergyIntolerance): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
