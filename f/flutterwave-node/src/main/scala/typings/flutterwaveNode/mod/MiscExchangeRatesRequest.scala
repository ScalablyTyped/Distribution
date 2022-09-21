package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MiscExchangeRatesRequest extends StObject {
  
  var service: String
  
  var service_channel: String
  
  var service_channel_group: String
  
  var service_method: String
  
  var service_payload: String
  
  var service_version: String
}
object MiscExchangeRatesRequest {
  
  inline def apply(
    service: String,
    service_channel: String,
    service_channel_group: String,
    service_method: String,
    service_payload: String,
    service_version: String
  ): MiscExchangeRatesRequest = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any], service_channel = service_channel.asInstanceOf[js.Any], service_channel_group = service_channel_group.asInstanceOf[js.Any], service_method = service_method.asInstanceOf[js.Any], service_payload = service_payload.asInstanceOf[js.Any], service_version = service_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MiscExchangeRatesRequest]
  }
  
  extension [Self <: MiscExchangeRatesRequest](x: Self) {
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setService_channel(value: String): Self = StObject.set(x, "service_channel", value.asInstanceOf[js.Any])
    
    inline def setService_channel_group(value: String): Self = StObject.set(x, "service_channel_group", value.asInstanceOf[js.Any])
    
    inline def setService_method(value: String): Self = StObject.set(x, "service_method", value.asInstanceOf[js.Any])
    
    inline def setService_payload(value: String): Self = StObject.set(x, "service_payload", value.asInstanceOf[js.Any])
    
    inline def setService_version(value: String): Self = StObject.set(x, "service_version", value.asInstanceOf[js.Any])
  }
}
