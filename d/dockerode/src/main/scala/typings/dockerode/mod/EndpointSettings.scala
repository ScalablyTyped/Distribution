package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* tslint:enable:interface-name */
@js.native
trait EndpointSettings extends StObject {
  
  var Aliases: js.UndefOr[js.Array[String]] = js.native
  
  var DriverOpts: js.UndefOr[StringDictionary[String]] = js.native
  
  var EndpointID: js.UndefOr[String] = js.native
  
  var Gateway: js.UndefOr[String] = js.native
  
  var GlobalIPV6PrefixLen: js.UndefOr[Double] = js.native
  
  var GlobalIPv6Address: js.UndefOr[String] = js.native
  
  var IPAMConfig: js.UndefOr[typings.dockerode.mod.IPAMConfig] = js.native
  
  var IPAddress: js.UndefOr[String] = js.native
  
  var IPPrefixLen: js.UndefOr[Double] = js.native
  
  var IPv6Gateway: js.UndefOr[String] = js.native
  
  var Links: js.UndefOr[js.Array[String]] = js.native
  
  var MacAddress: js.UndefOr[String] = js.native
  
  var NetworkID: js.UndefOr[String] = js.native
}
object EndpointSettings {
  
  @scala.inline
  def apply(): EndpointSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointSettings]
  }
  
  @scala.inline
  implicit class EndpointSettingsMutableBuilder[Self <: EndpointSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = StObject.set(x, "Aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAliasesUndefined: Self = StObject.set(x, "Aliases", js.undefined)
    
    @scala.inline
    def setAliasesVarargs(value: String*): Self = StObject.set(x, "Aliases", js.Array(value :_*))
    
    @scala.inline
    def setDriverOpts(value: StringDictionary[String]): Self = StObject.set(x, "DriverOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDriverOptsUndefined: Self = StObject.set(x, "DriverOpts", js.undefined)
    
    @scala.inline
    def setEndpointID(value: String): Self = StObject.set(x, "EndpointID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointIDUndefined: Self = StObject.set(x, "EndpointID", js.undefined)
    
    @scala.inline
    def setGateway(value: String): Self = StObject.set(x, "Gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGatewayUndefined: Self = StObject.set(x, "Gateway", js.undefined)
    
    @scala.inline
    def setGlobalIPV6PrefixLen(value: Double): Self = StObject.set(x, "GlobalIPV6PrefixLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalIPV6PrefixLenUndefined: Self = StObject.set(x, "GlobalIPV6PrefixLen", js.undefined)
    
    @scala.inline
    def setGlobalIPv6Address(value: String): Self = StObject.set(x, "GlobalIPv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlobalIPv6AddressUndefined: Self = StObject.set(x, "GlobalIPv6Address", js.undefined)
    
    @scala.inline
    def setIPAMConfig(value: IPAMConfig): Self = StObject.set(x, "IPAMConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPAMConfigUndefined: Self = StObject.set(x, "IPAMConfig", js.undefined)
    
    @scala.inline
    def setIPAddress(value: String): Self = StObject.set(x, "IPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPAddressUndefined: Self = StObject.set(x, "IPAddress", js.undefined)
    
    @scala.inline
    def setIPPrefixLen(value: Double): Self = StObject.set(x, "IPPrefixLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPPrefixLenUndefined: Self = StObject.set(x, "IPPrefixLen", js.undefined)
    
    @scala.inline
    def setIPv6Gateway(value: String): Self = StObject.set(x, "IPv6Gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPv6GatewayUndefined: Self = StObject.set(x, "IPv6Gateway", js.undefined)
    
    @scala.inline
    def setLinks(value: js.Array[String]): Self = StObject.set(x, "Links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinksUndefined: Self = StObject.set(x, "Links", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: String*): Self = StObject.set(x, "Links", js.Array(value :_*))
    
    @scala.inline
    def setMacAddress(value: String): Self = StObject.set(x, "MacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddressUndefined: Self = StObject.set(x, "MacAddress", js.undefined)
    
    @scala.inline
    def setNetworkID(value: String): Self = StObject.set(x, "NetworkID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkIDUndefined: Self = StObject.set(x, "NetworkID", js.undefined)
  }
}
