package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkInfo extends js.Object {
  
  var Aliases: js.UndefOr[js.Any] = js.native
  
  var EndpointID: String = js.native
  
  var Gateway: String = js.native
  
  var GlobalIPv6Address: String = js.native
  
  var GlobalIPv6PrefixLen: Double = js.native
  
  var IPAMConfig: js.UndefOr[js.Any] = js.native
  
  var IPAddress: String = js.native
  
  var IPPrefixLen: Double = js.native
  
  var IPv6Gateway: String = js.native
  
  var Links: js.UndefOr[js.Any] = js.native
  
  var MacAddress: String = js.native
  
  var NetworkID: String = js.native
}
object NetworkInfo {
  
  @scala.inline
  def apply(
    EndpointID: String,
    Gateway: String,
    GlobalIPv6Address: String,
    GlobalIPv6PrefixLen: Double,
    IPAddress: String,
    IPPrefixLen: Double,
    IPv6Gateway: String,
    MacAddress: String,
    NetworkID: String
  ): NetworkInfo = {
    val __obj = js.Dynamic.literal(EndpointID = EndpointID.asInstanceOf[js.Any], Gateway = Gateway.asInstanceOf[js.Any], GlobalIPv6Address = GlobalIPv6Address.asInstanceOf[js.Any], GlobalIPv6PrefixLen = GlobalIPv6PrefixLen.asInstanceOf[js.Any], IPAddress = IPAddress.asInstanceOf[js.Any], IPPrefixLen = IPPrefixLen.asInstanceOf[js.Any], IPv6Gateway = IPv6Gateway.asInstanceOf[js.Any], MacAddress = MacAddress.asInstanceOf[js.Any], NetworkID = NetworkID.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkInfo]
  }
  
  @scala.inline
  implicit class NetworkInfoOps[Self <: NetworkInfo] (val x: Self) extends AnyVal {
    
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
    def setGateway(value: String): Self = this.set("Gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalIPv6Address(value: String): Self = this.set("GlobalIPv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalIPv6PrefixLen(value: Double): Self = this.set("GlobalIPv6PrefixLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPAddress(value: String): Self = this.set("IPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPPrefixLen(value: Double): Self = this.set("IPPrefixLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPv6Gateway(value: String): Self = this.set("IPv6Gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddress(value: String): Self = this.set("MacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkID(value: String): Self = this.set("NetworkID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliases(value: js.Any): Self = this.set("Aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("Aliases", js.undefined)
    
    @scala.inline
    def setIPAMConfig(value: js.Any): Self = this.set("IPAMConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPAMConfig: Self = this.set("IPAMConfig", js.undefined)
    
    @scala.inline
    def setLinks(value: js.Any): Self = this.set("Links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("Links", js.undefined)
  }
}
