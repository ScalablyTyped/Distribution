package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* tslint:enable:interface-name */
trait EndpointSettings extends StObject {
  
  var Aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  var DriverOpts: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var EndpointID: js.UndefOr[String] = js.undefined
  
  var Gateway: js.UndefOr[String] = js.undefined
  
  var GlobalIPV6PrefixLen: js.UndefOr[Double] = js.undefined
  
  var GlobalIPv6Address: js.UndefOr[String] = js.undefined
  
  var IPAMConfig: js.UndefOr[typings.dockerode.mod.IPAMConfig] = js.undefined
  
  var IPAddress: js.UndefOr[String] = js.undefined
  
  var IPPrefixLen: js.UndefOr[Double] = js.undefined
  
  var IPv6Gateway: js.UndefOr[String] = js.undefined
  
  var Links: js.UndefOr[js.Array[String]] = js.undefined
  
  var MacAddress: js.UndefOr[String] = js.undefined
  
  var NetworkID: js.UndefOr[String] = js.undefined
}
object EndpointSettings {
  
  inline def apply(): EndpointSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointSettings]
  }
  
  extension [Self <: EndpointSettings](x: Self) {
    
    inline def setAliases(value: js.Array[String]): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    inline def setAliasesVarargs(value: String*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
    
    inline def setDriverOpts(value: StringDictionary[String]): Self = StObject.set(x, "DriverOpts", value.asInstanceOf[js.Any])
    
    inline def setDriverOptsUndefined: Self = StObject.set(x, "DriverOpts", js.undefined)
    
    inline def setEndpointID(value: String): Self = StObject.set(x, "EndpointID", value.asInstanceOf[js.Any])
    
    inline def setEndpointIDUndefined: Self = StObject.set(x, "EndpointID", js.undefined)
    
    inline def setGateway(value: String): Self = StObject.set(x, "Gateway", value.asInstanceOf[js.Any])
    
    inline def setGatewayUndefined: Self = StObject.set(x, "Gateway", js.undefined)
    
    inline def setGlobalIPV6PrefixLen(value: Double): Self = StObject.set(x, "GlobalIPV6PrefixLen", value.asInstanceOf[js.Any])
    
    inline def setGlobalIPV6PrefixLenUndefined: Self = StObject.set(x, "GlobalIPV6PrefixLen", js.undefined)
    
    inline def setGlobalIPv6Address(value: String): Self = StObject.set(x, "GlobalIPv6Address", value.asInstanceOf[js.Any])
    
    inline def setGlobalIPv6AddressUndefined: Self = StObject.set(x, "GlobalIPv6Address", js.undefined)
    
    inline def setIPAMConfig(value: IPAMConfig): Self = StObject.set(x, "IPAMConfig", value.asInstanceOf[js.Any])
    
    inline def setIPAMConfigUndefined: Self = StObject.set(x, "IPAMConfig", js.undefined)
    
    inline def setIPAddress(value: String): Self = StObject.set(x, "IPAddress", value.asInstanceOf[js.Any])
    
    inline def setIPAddressUndefined: Self = StObject.set(x, "IPAddress", js.undefined)
    
    inline def setIPPrefixLen(value: Double): Self = StObject.set(x, "IPPrefixLen", value.asInstanceOf[js.Any])
    
    inline def setIPPrefixLenUndefined: Self = StObject.set(x, "IPPrefixLen", js.undefined)
    
    inline def setIPv6Gateway(value: String): Self = StObject.set(x, "IPv6Gateway", value.asInstanceOf[js.Any])
    
    inline def setIPv6GatewayUndefined: Self = StObject.set(x, "IPv6Gateway", js.undefined)
    
    inline def setLinks(value: js.Array[String]): Self = StObject.set(x, "Links", value.asInstanceOf[js.Any])
    
    inline def setLinksUndefined: Self = StObject.set(x, "Links", js.undefined)
    
    inline def setLinksVarargs(value: String*): Self = StObject.set(x, "Links", js.Array(value :_*))
    
    inline def setMacAddress(value: String): Self = StObject.set(x, "MacAddress", value.asInstanceOf[js.Any])
    
    inline def setMacAddressUndefined: Self = StObject.set(x, "MacAddress", js.undefined)
    
    inline def setNetworkID(value: String): Self = StObject.set(x, "NetworkID", value.asInstanceOf[js.Any])
    
    inline def setNetworkIDUndefined: Self = StObject.set(x, "NetworkID", js.undefined)
  }
}
