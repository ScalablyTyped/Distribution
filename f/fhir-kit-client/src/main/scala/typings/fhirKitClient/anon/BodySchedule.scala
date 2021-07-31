package typings.fhirKitClient.anon

import typings.fhir.fhir.Schedule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodySchedule extends StObject {
  
  var body: Schedule
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Schedule
}
object BodySchedule {
  
  @scala.inline
  def apply(body: Schedule): BodySchedule = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = "Schedule")
    __obj.asInstanceOf[BodySchedule]
  }
  
  @scala.inline
  implicit class BodyScheduleMutableBuilder[Self <: BodySchedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Schedule): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.Schedule): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
