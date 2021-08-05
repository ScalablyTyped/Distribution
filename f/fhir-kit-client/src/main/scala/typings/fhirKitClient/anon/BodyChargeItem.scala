package typings.fhirKitClient.anon

import typings.fhir.fhir.ChargeItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyChargeItem extends StObject {
  
  var body: ChargeItem
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.ChargeItem
}
object BodyChargeItem {
  
  inline def apply(body: ChargeItem): BodyChargeItem = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = "ChargeItem")
    __obj.asInstanceOf[BodyChargeItem]
  }
  
  extension [Self <: BodyChargeItem](x: Self) {
    
    inline def setBody(value: ChargeItem): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.ChargeItem): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
