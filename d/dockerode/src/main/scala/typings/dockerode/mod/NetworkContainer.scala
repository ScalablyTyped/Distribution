package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkContainer extends js.Object {
  
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
  implicit class NetworkContainerOps[Self <: NetworkContainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEndpointID(value: String): Self = this.set("EndpointID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPv4Address(value: String): Self = this.set("IPv4Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPv6Address(value: String): Self = this.set("IPv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddress(value: String): Self = this.set("MacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
  }
}
