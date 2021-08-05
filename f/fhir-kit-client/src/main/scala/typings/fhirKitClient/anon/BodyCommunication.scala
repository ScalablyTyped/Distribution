package typings.fhirKitClient.anon

import typings.fhir.fhir.Communication
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyCommunication extends StObject {
  
  var body: Communication
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Communication
}
object BodyCommunication {
  
  inline def apply(body: Communication): BodyCommunication = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = "Communication")
    __obj.asInstanceOf[BodyCommunication]
  }
  
  extension [Self <: BodyCommunication](x: Self) {
    
    inline def setBody(value: Communication): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.Communication): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
