package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Aliases extends StObject {
  
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
object Aliases {
  
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
  ): Aliases = {
    val __obj = js.Dynamic.literal(EndpointID = EndpointID.asInstanceOf[js.Any], Gateway = Gateway.asInstanceOf[js.Any], GlobalIPv6Address = GlobalIPv6Address.asInstanceOf[js.Any], GlobalIPv6PrefixLen = GlobalIPv6PrefixLen.asInstanceOf[js.Any], IPAddress = IPAddress.asInstanceOf[js.Any], IPPrefixLen = IPPrefixLen.asInstanceOf[js.Any], IPv6Gateway = IPv6Gateway.asInstanceOf[js.Any], MacAddress = MacAddress.asInstanceOf[js.Any], NetworkID = NetworkID.asInstanceOf[js.Any])
    __obj.asInstanceOf[Aliases]
  }
  
  @scala.inline
  implicit class AliasesMutableBuilder[Self <: Aliases] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: js.Any): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    @scala.inline
    def setEndpointID(value: String): Self = StObject.set(x, "EndpointID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGateway(value: String): Self = StObject.set(x, "Gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalIPv6Address(value: String): Self = StObject.set(x, "GlobalIPv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalIPv6PrefixLen(value: Double): Self = StObject.set(x, "GlobalIPv6PrefixLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPAMConfig(value: js.Any): Self = StObject.set(x, "IPAMConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPAMConfigUndefined: Self = StObject.set(x, "IPAMConfig", js.undefined)
    
    @scala.inline
    def setIPAddress(value: String): Self = StObject.set(x, "IPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPPrefixLen(value: Double): Self = StObject.set(x, "IPPrefixLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPv6Gateway(value: String): Self = StObject.set(x, "IPv6Gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinks(value: js.Any): Self = StObject.set(x, "Links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "Links", js.undefined)
    
    @scala.inline
    def setMacAddress(value: String): Self = StObject.set(x, "MacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkID(value: String): Self = StObject.set(x, "NetworkID", value.asInstanceOf[js.Any])
  }
}
