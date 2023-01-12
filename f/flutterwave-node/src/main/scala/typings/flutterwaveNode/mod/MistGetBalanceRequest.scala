package typings.flutterwaveNode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MistGetBalanceRequest extends StObject {
  
  var service: String
  
  var service_channel: String
  
  var service_method: String
  
  var service_version: String
}
object MistGetBalanceRequest {
  
  inline def apply(service: String, service_channel: String, service_method: String, service_version: String): MistGetBalanceRequest = {
    val __obj = js.Dynamic.literal(service = service.asInstanceOf[js.Any], service_channel = service_channel.asInstanceOf[js.Any], service_method = service_method.asInstanceOf[js.Any], service_version = service_version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MistGetBalanceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MistGetBalanceRequest] (val x: Self) extends AnyVal {
    
    inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    
    inline def setService_channel(value: String): Self = StObject.set(x, "service_channel", value.asInstanceOf[js.Any])
    
    inline def setService_method(value: String): Self = StObject.set(x, "service_method", value.asInstanceOf[js.Any])
    
    inline def setService_version(value: String): Self = StObject.set(x, "service_version", value.asInstanceOf[js.Any])
  }
}
