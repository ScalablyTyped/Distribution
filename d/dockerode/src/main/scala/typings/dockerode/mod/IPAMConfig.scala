package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* tslint:disable:interface-name */
@js.native
trait IPAMConfig extends StObject {
  
  var IPv4Address: js.UndefOr[String] = js.native
  
  var IPv6Address: js.UndefOr[String] = js.native
  
  var LinkLocalIPs: js.UndefOr[js.Array[String]] = js.native
}
object IPAMConfig {
  
  @scala.inline
  def apply(): IPAMConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPAMConfig]
  }
  
  @scala.inline
  implicit class IPAMConfigMutableBuilder[Self <: IPAMConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIPv4Address(value: String): Self = StObject.set(x, "IPv4Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPv4AddressUndefined: Self = StObject.set(x, "IPv4Address", js.undefined)
    
    @scala.inline
    def setIPv6Address(value: String): Self = StObject.set(x, "IPv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPv6AddressUndefined: Self = StObject.set(x, "IPv6Address", js.undefined)
    
    @scala.inline
    def setLinkLocalIPs(value: js.Array[String]): Self = StObject.set(x, "LinkLocalIPs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkLocalIPsUndefined: Self = StObject.set(x, "LinkLocalIPs", js.undefined)
    
    @scala.inline
    def setLinkLocalIPsVarargs(value: String*): Self = StObject.set(x, "LinkLocalIPs", js.Array(value :_*))
  }
}
