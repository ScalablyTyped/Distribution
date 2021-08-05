package typings.fhirKitClient.anon

import typings.fhir.fhir.Goal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyGoal extends StObject {
  
  var body: Goal
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.Goal
}
object BodyGoal {
  
  inline def apply(body: Goal): BodyGoal = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = "Goal")
    __obj.asInstanceOf[BodyGoal]
  }
  
  extension [Self <: BodyGoal](x: Self) {
    
    inline def setBody(value: Goal): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.Goal): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
