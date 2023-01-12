package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BillsPaymentBillsRequest extends StObject {
  
  var service: String
  
  var service_channel: String
  
  var service_method: String
  
  var service_payload: js.UndefOr[String] = js.undefined
  
  var service_version: String
}
object BillsPaymentBillsRequest {
  
  inline def apply(service: String, service_channel: String, service_method: String, service_version: String): BillsPaymentBillsRequest = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any], service_channel = service_channel.asInstanceOf[js.Any], service_method = service_method.asInstanceOf[js.Any], service_version = service_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[BillsPaymentBillsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BillsPaymentBillsRequest] (val x: Self) extends AnyVal {
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setService_channel(value: String): Self = StObject.set(x, "service_channel", value.asInstanceOf[js.Any])
    
    inline def setService_method(value: String): Self = StObject.set(x, "service_method", value.asInstanceOf[js.Any])
    
    inline def setService_payload(value: String): Self = StObject.set(x, "service_payload", value.asInstanceOf[js.Any])
    
    inline def setService_payloadUndefined: Self = StObject.set(x, "service_payload", js.undefined)
    
    inline def setService_version(value: String): Self = StObject.set(x, "service_version", value.asInstanceOf[js.Any])
  }
}
