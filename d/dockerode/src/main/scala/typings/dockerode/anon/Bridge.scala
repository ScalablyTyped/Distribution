package typings.dockerode.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bridge extends js.Object {
  
  var Bridge: String = js.native
  
  var EndpointID: String = js.native
  
  var Gateway: String = js.native
  
  var GlobalIPv6Address: String = js.native
  
  var GlobalIPv6PrefixLen: Double = js.native
  
  var HairpinMode: Boolean = js.native
  
  var IPAddress: String = js.native
  
  var IPPrefixLen: Double = js.native
  
  var IPv6Gateway: String = js.native
  
  var LinkLocalIPv6Address: String = js.native
  
  var LinkLocalIPv6PrefixLen: Double = js.native
  
  var MacAddress: String = js.native
  
  var Networks: StringDictionary[Aliases] = js.native
  
  var Node: js.UndefOr[Addr] = js.native
  
  var Ports: StringDictionary[js.Array[HostIp]] = js.native
  
  var SandboxID: String = js.native
  
  var SandboxKey: String = js.native
  
  var SecondaryIPAddresses: js.UndefOr[js.Any] = js.native
  
  var SecondaryIPv6Addresses: js.UndefOr[js.Any] = js.native
}
object Bridge {
  
  @scala.inline
  def apply(
    Bridge: String,
    EndpointID: String,
    Gateway: String,
    GlobalIPv6Address: String,
    GlobalIPv6PrefixLen: Double,
    HairpinMode: Boolean,
    IPAddress: String,
    IPPrefixLen: Double,
    IPv6Gateway: String,
    LinkLocalIPv6Address: String,
    LinkLocalIPv6PrefixLen: Double,
    MacAddress: String,
    Networks: StringDictionary[Aliases],
    Ports: StringDictionary[js.Array[HostIp]],
    SandboxID: String,
    SandboxKey: String
  ): Bridge = {
    val __obj = js.Dynamic.literal(Bridge = Bridge.asInstanceOf[js.Any], EndpointID = EndpointID.asInstanceOf[js.Any], Gateway = Gateway.asInstanceOf[js.Any], GlobalIPv6Address = GlobalIPv6Address.asInstanceOf[js.Any], GlobalIPv6PrefixLen = GlobalIPv6PrefixLen.asInstanceOf[js.Any], HairpinMode = HairpinMode.asInstanceOf[js.Any], IPAddress = IPAddress.asInstanceOf[js.Any], IPPrefixLen = IPPrefixLen.asInstanceOf[js.Any], IPv6Gateway = IPv6Gateway.asInstanceOf[js.Any], LinkLocalIPv6Address = LinkLocalIPv6Address.asInstanceOf[js.Any], LinkLocalIPv6PrefixLen = LinkLocalIPv6PrefixLen.asInstanceOf[js.Any], MacAddress = MacAddress.asInstanceOf[js.Any], Networks = Networks.asInstanceOf[js.Any], Ports = Ports.asInstanceOf[js.Any], SandboxID = SandboxID.asInstanceOf[js.Any], SandboxKey = SandboxKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bridge]
  }
  
  @scala.inline
  implicit class BridgeOps[Self <: Bridge] (val x: Self) extends AnyVal {
    
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
    def setBridge(value: String): Self = this.set("Bridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointID(value: String): Self = this.set("EndpointID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGateway(value: String): Self = this.set("Gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalIPv6Address(value: String): Self = this.set("GlobalIPv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalIPv6PrefixLen(value: Double): Self = this.set("GlobalIPv6PrefixLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHairpinMode(value: Boolean): Self = this.set("HairpinMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPAddress(value: String): Self = this.set("IPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPPrefixLen(value: Double): Self = this.set("IPPrefixLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPv6Gateway(value: String): Self = this.set("IPv6Gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkLocalIPv6Address(value: String): Self = this.set("LinkLocalIPv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkLocalIPv6PrefixLen(value: Double): Self = this.set("LinkLocalIPv6PrefixLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddress(value: String): Self = this.set("MacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworks(value: StringDictionary[Aliases]): Self = this.set("Networks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPorts(value: StringDictionary[js.Array[HostIp]]): Self = this.set("Ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxID(value: String): Self = this.set("SandboxID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxKey(value: String): Self = this.set("SandboxKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Addr): Self = this.set("Node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNode: Self = this.set("Node", js.undefined)
    
    @scala.inline
    def setSecondaryIPAddresses(value: js.Any): Self = this.set("SecondaryIPAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryIPAddresses: Self = this.set("SecondaryIPAddresses", js.undefined)
    
    @scala.inline
    def setSecondaryIPv6Addresses(value: js.Any): Self = this.set("SecondaryIPv6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecondaryIPv6Addresses: Self = this.set("SecondaryIPv6Addresses", js.undefined)
  }
}
