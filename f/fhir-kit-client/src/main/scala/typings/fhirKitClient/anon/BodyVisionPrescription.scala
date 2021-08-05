package typings.fhirKitClient.anon

import typings.fhir.fhir.VisionPrescription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyVisionPrescription extends StObject {
  
  var body: VisionPrescription
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.VisionPrescription
}
object BodyVisionPrescription {
  
  inline def apply(body: VisionPrescription): BodyVisionPrescription = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = "VisionPrescription")
    __obj.asInstanceOf[BodyVisionPrescription]
  }
  
  extension [Self <: BodyVisionPrescription](x: Self) {
    
    inline def setBody(value: VisionPrescription): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.VisionPrescription): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
