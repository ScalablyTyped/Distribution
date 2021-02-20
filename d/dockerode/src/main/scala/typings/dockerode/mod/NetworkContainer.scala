package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkContainer extends StObject {
  
  var EndpointID: String = js.native
  
  var IPv4Address: String = js.native
  
  var IPv6Address: String = js.native
  
  var MacAddress: String = js.native
  
  var Name: String = js.native
}
object NetworkContainer {
  
  @scala.inline
  def apply(EndpointID: String, IPv4Address: String, IPv6Address: String, MacAddress: String, Name: String): NetworkContainer = {
    val __obj = js.Dynamic.literal(EndpointID = EndpointID.asInstanceOf[js.Any], IPv4Address = IPv4Address.asInstanceOf[js.Any], IPv6Address = IPv6Address.asInstanceOf[js.Any], MacAddress = MacAddress.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkContainer]
  }
  
  @scala.inline
  implicit class NetworkContainerMutableBuilder[Self <: NetworkContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpointID(value: String): Self = StObject.set(x, "EndpointID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPv4Address(value: String): Self = StObject.set(x, "IPv4Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPv6Address(value: String): Self = StObject.set(x, "IPv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddress(value: String): Self = StObject.set(x, "MacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
