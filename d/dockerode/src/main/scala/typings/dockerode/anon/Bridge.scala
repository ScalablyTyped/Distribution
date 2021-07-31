package typings.dockerode.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bridge extends StObject {
  
  var Bridge: String
  
  var EndpointID: String
  
  var Gateway: String
  
  var GlobalIPv6Address: String
  
  var GlobalIPv6PrefixLen: Double
  
  var HairpinMode: Boolean
  
  var IPAddress: String
  
  var IPPrefixLen: Double
  
  var IPv6Gateway: String
  
  var LinkLocalIPv6Address: String
  
  var LinkLocalIPv6PrefixLen: Double
  
  var MacAddress: String
  
  var Networks: StringDictionary[Aliases]
  
  var Node: js.UndefOr[Addr] = js.undefined
  
  var Ports: StringDictionary[js.Array[HostIp]]
  
  var SandboxID: String
  
  var SandboxKey: String
  
  var SecondaryIPAddresses: js.UndefOr[js.Any] = js.undefined
  
  var SecondaryIPv6Addresses: js.UndefOr[js.Any] = js.undefined
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
  implicit class BridgeMutableBuilder[Self <: Bridge] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBridge(value: String): Self = StObject.set(x, "Bridge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointID(value: String): Self = StObject.set(x, "EndpointID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGateway(value: String): Self = StObject.set(x, "Gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalIPv6Address(value: String): Self = StObject.set(x, "GlobalIPv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalIPv6PrefixLen(value: Double): Self = StObject.set(x, "GlobalIPv6PrefixLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHairpinMode(value: Boolean): Self = StObject.set(x, "HairpinMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPAddress(value: String): Self = StObject.set(x, "IPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPPrefixLen(value: Double): Self = StObject.set(x, "IPPrefixLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPv6Gateway(value: String): Self = StObject.set(x, "IPv6Gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkLocalIPv6Address(value: String): Self = StObject.set(x, "LinkLocalIPv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkLocalIPv6PrefixLen(value: Double): Self = StObject.set(x, "LinkLocalIPv6PrefixLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddress(value: String): Self = StObject.set(x, "MacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworks(value: StringDictionary[Aliases]): Self = StObject.set(x, "Networks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNode(value: Addr): Self = StObject.set(x, "Node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "Node", js.undefined)
    
    @scala.inline
    def setPorts(value: StringDictionary[js.Array[HostIp]]): Self = StObject.set(x, "Ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxID(value: String): Self = StObject.set(x, "SandboxID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSandboxKey(value: String): Self = StObject.set(x, "SandboxKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryIPAddresses(value: js.Any): Self = StObject.set(x, "SecondaryIPAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryIPAddressesUndefined: Self = StObject.set(x, "SecondaryIPAddresses", js.undefined)
    
    @scala.inline
    def setSecondaryIPv6Addresses(value: js.Any): Self = StObject.set(x, "SecondaryIPv6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryIPv6AddressesUndefined: Self = StObject.set(x, "SecondaryIPv6Addresses", js.undefined)
  }
}
