package typings.fhirKitClient.anon

import typings.fhir.fhir.Medication
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyMedicationHeaders extends StObject {
  
  var body: Medication
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var id: String
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Medication
}
object BodyMedicationHeaders {
  
  @scala.inline
  def apply(body: Medication, id: String): BodyMedicationHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = "Medication")
    __obj.asInstanceOf[BodyMedicationHeaders]
  }
  
  @scala.inline
  implicit class BodyMedicationHeadersMutableBuilder[Self <: BodyMedicationHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Medication): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.Medication): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
