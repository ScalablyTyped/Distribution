package typings.fhirKitClient.anon

import typings.fhir.fhir.ExplanationOfBenefit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyExplanationOfBenefitHeaders extends StObject {
  
  var body: ExplanationOfBenefit = js.native
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  
  var id: String = js.native
  
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.ExplanationOfBenefit = js.native
}
object BodyExplanationOfBenefitHeaders {
  
  @scala.inline
  def apply(
    body: ExplanationOfBenefit,
    id: String,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.ExplanationOfBenefit
  ): BodyExplanationOfBenefitHeaders = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyExplanationOfBenefitHeaders]
  }
  
  @scala.inline
  implicit class BodyExplanationOfBenefitHeadersMutableBuilder[Self <: BodyExplanationOfBenefitHeaders] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ExplanationOfBenefit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
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
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.ExplanationOfBenefit): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
