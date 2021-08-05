package typings.fhirKitClient.anon

import typings.fhir.fhir.Group
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyGroup extends StObject {
  
  var body: Group
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Group
}
object BodyGroup {
  
  inline def apply(body: Group): BodyGroup = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = "Group")
    __obj.asInstanceOf[BodyGroup]
  }
  
  extension [Self <: BodyGroup](x: Self) {
    
    inline def setBody(value: Group): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.Group): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
