package typings.dockerode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Aliases extends StObject {
  
  var Aliases: js.UndefOr[Any] = js.undefined
  
  var EndpointID: String
  
  var Gateway: String
  
  var GlobalIPv6Address: String
  
  var GlobalIPv6PrefixLen: Double
  
  var IPAMConfig: js.UndefOr[Any] = js.undefined
  
  var IPAddress: String
  
  var IPPrefixLen: Double
  
  var IPv6Gateway: String
  
  var Links: js.UndefOr[Any] = js.undefined
  
  var MacAddress: String
  
  var NetworkID: String
}
object Aliases {
  
  inline def apply(
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
  
  extension [Self <: Aliases](x: Self) {
    
    inline def setAliases(value: Any): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    inline def setEndpointID(value: String): Self = StObject.set(x, "EndpointID", value.asInstanceOf[js.Any])
    
    inline def setGateway(value: String): Self = StObject.set(x, "Gateway", value.asInstanceOf[js.Any])
    
    inline def setGlobalIPv6Address(value: String): Self = StObject.set(x, "GlobalIPv6Address", value.asInstanceOf[js.Any])
    
    inline def setGlobalIPv6PrefixLen(value: Double): Self = StObject.set(x, "GlobalIPv6PrefixLen", value.asInstanceOf[js.Any])
    
    inline def setIPAMConfig(value: Any): Self = StObject.set(x, "IPAMConfig", value.asInstanceOf[js.Any])
    
    inline def setIPAMConfigUndefined: Self = StObject.set(x, "IPAMConfig", js.undefined)
    
    inline def setIPAddress(value: String): Self = StObject.set(x, "IPAddress", value.asInstanceOf[js.Any])
    
    inline def setIPPrefixLen(value: Double): Self = StObject.set(x, "IPPrefixLen", value.asInstanceOf[js.Any])
    
    inline def setIPv6Gateway(value: String): Self = StObject.set(x, "IPv6Gateway", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Any): Self = StObject.set(x, "Links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "Links", js.undefined)
    
    inline def setMacAddress(value: String): Self = StObject.set(x, "MacAddress", value.asInstanceOf[js.Any])
    
    inline def setNetworkID(value: String): Self = StObject.set(x, "NetworkID", value.asInstanceOf[js.Any])
  }
}
