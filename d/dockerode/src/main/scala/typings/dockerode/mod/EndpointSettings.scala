package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* tslint:enable:interface-name */
@js.native
trait EndpointSettings extends js.Object {
  
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
  implicit class EndpointSettingsOps[Self <: EndpointSettings] (val x: Self) extends AnyVal {
    
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
    def setAliasesVarargs(value: String*): Self = this.set("Aliases", js.Array(value :_*))
    
    @scala.inline
    def setAliases(value: js.Array[String]): Self = this.set("Aliases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliases: Self = this.set("Aliases", js.undefined)
    
    @scala.inline
    def setDriverOpts(value: StringDictionary[String]): Self = this.set("DriverOpts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDriverOpts: Self = this.set("DriverOpts", js.undefined)
    
    @scala.inline
    def setEndpointID(value: String): Self = this.set("EndpointID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndpointID: Self = this.set("EndpointID", js.undefined)
    
    @scala.inline
    def setGateway(value: String): Self = this.set("Gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGateway: Self = this.set("Gateway", js.undefined)
    
    @scala.inline
    def setGlobalIPV6PrefixLen(value: Double): Self = this.set("GlobalIPV6PrefixLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalIPV6PrefixLen: Self = this.set("GlobalIPV6PrefixLen", js.undefined)
    
    @scala.inline
    def setGlobalIPv6Address(value: String): Self = this.set("GlobalIPv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGlobalIPv6Address: Self = this.set("GlobalIPv6Address", js.undefined)
    
    @scala.inline
    def setIPAMConfig(value: IPAMConfig): Self = this.set("IPAMConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPAMConfig: Self = this.set("IPAMConfig", js.undefined)
    
    @scala.inline
    def setIPAddress(value: String): Self = this.set("IPAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPAddress: Self = this.set("IPAddress", js.undefined)
    
    @scala.inline
    def setIPPrefixLen(value: Double): Self = this.set("IPPrefixLen", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPPrefixLen: Self = this.set("IPPrefixLen", js.undefined)
    
    @scala.inline
    def setIPv6Gateway(value: String): Self = this.set("IPv6Gateway", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPv6Gateway: Self = this.set("IPv6Gateway", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: String*): Self = this.set("Links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[String]): Self = this.set("Links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("Links", js.undefined)
    
    @scala.inline
    def setMacAddress(value: String): Self = this.set("MacAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMacAddress: Self = this.set("MacAddress", js.undefined)
    
    @scala.inline
    def setNetworkID(value: String): Self = this.set("NetworkID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkID: Self = this.set("NetworkID", js.undefined)
  }
}
