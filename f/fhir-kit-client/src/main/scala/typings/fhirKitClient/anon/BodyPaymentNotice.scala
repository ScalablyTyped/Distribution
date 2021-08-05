package typings.fhirKitClient.anon

import typings.fhir.fhir.PaymentNotice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyPaymentNotice extends StObject {
  
  var body: PaymentNotice
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.PaymentNotice
}
object BodyPaymentNotice {
  
  inline def apply(body: PaymentNotice): BodyPaymentNotice = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = "PaymentNotice")
    __obj.asInstanceOf[BodyPaymentNotice]
  }
  
  extension [Self <: BodyPaymentNotice](x: Self) {
    
    inline def setBody(value: PaymentNotice): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.PaymentNotice): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
