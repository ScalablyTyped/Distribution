package typings.fhirKitClient.anon

import typings.fhir.fhir.HealthcareService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyHealthcareService extends StObject {
  
  var body: HealthcareService
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.HealthcareService
}
object BodyHealthcareService {
  
  @scala.inline
  def apply(body: HealthcareService): BodyHealthcareService = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = "HealthcareService")
    __obj.asInstanceOf[BodyHealthcareService]
  }
  
  @scala.inline
  implicit class BodyHealthcareServiceMutableBuilder[Self <: BodyHealthcareService] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: HealthcareService): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.HealthcareService): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
