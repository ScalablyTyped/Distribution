package typings.fhirKitClient.anon

import typings.fhir.fhir.ServiceDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BodyServiceDefinition extends StObject {
  
  var body: ServiceDefinition = js.native
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.native
  
  var options: js.UndefOr[typings.request.mod.Options] = js.native
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.ServiceDefinition = js.native
}
object BodyServiceDefinition {
  
  @scala.inline
  def apply(
    body: ServiceDefinition,
    resourceType: typings.fhirKitClient.fhirKitClientStrings.ServiceDefinition
  ): BodyServiceDefinition = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BodyServiceDefinition]
  }
  
  @scala.inline
  implicit class BodyServiceDefinitionMutableBuilder[Self <: BodyServiceDefinition] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: ServiceDefinition): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.ServiceDefinition): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
