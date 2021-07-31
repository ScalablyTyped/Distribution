package typings.fhirKitClient.anon

import typings.fhir.fhir.Slot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodySlot extends StObject {
  
  var body: Slot
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Slot
}
object BodySlot {
  
  @scala.inline
  def apply(body: Slot): BodySlot = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = "Slot")
    __obj.asInstanceOf[BodySlot]
  }
  
  @scala.inline
  implicit class BodySlotMutableBuilder[Self <: BodySlot] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: Slot): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.Slot): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
