package typings.fhirKitClient.anon

import typings.fhir.fhir.Coverage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyCoverage extends StObject {
  
  var body: Coverage = js.native
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Coverage = js.native
}
object BodyCoverage {
  
  @scala.inline
  def apply(body: Coverage, resourceType: typings.fhirKitClient.fhirKitClientStrings.Coverage): BodyCoverage = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyCoverage]
  }
  
  @scala.inline
  implicit class BodyCoverageMutableBuilder[Self <: BodyCoverage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Coverage): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.Coverage): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
