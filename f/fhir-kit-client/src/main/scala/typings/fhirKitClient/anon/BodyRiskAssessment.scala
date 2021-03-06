package typings.fhirKitClient.anon

import typings.fhir.fhir.RiskAssessment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyRiskAssessment extends StObject {
  
  var body: RiskAssessment = js.native
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.RiskAssessment = js.native
}
object BodyRiskAssessment {
  
  @scala.inline
  def apply(body: RiskAssessment, resourceType: typings.fhirKitClient.fhirKitClientStrings.RiskAssessment): BodyRiskAssessment = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyRiskAssessment]
  }
  
  @scala.inline
  implicit class BodyRiskAssessmentMutableBuilder[Self <: BodyRiskAssessment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: RiskAssessment): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.RiskAssessment): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
