package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* tslint:disable:interface-name */
trait IPAMConfig extends StObject {
  
  var IPv4Address: js.UndefOr[String] = js.undefined
  
  var IPv6Address: js.UndefOr[String] = js.undefined
  
  var LinkLocalIPs: js.UndefOr[js.Array[String]] = js.undefined
}
object IPAMConfig {
  
  inline def apply(): IPAMConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPAMConfig]
  }
  
  extension [Self <: IPAMConfig](x: Self) {
    
    inline def setIPv4Address(value: String): Self = StObject.set(x, "IPv4Address", value.asInstanceOf[js.Any])
    
    inline def setIPv4AddressUndefined: Self = StObject.set(x, "IPv4Address", js.undefined)
    
    inline def setIPv6Address(value: String): Self = StObject.set(x, "IPv6Address", value.asInstanceOf[js.Any])
    
    inline def setIPv6AddressUndefined: Self = StObject.set(x, "IPv6Address", js.undefined)
    
    inline def setLinkLocalIPs(value: js.Array[String]): Self = StObject.set(x, "LinkLocalIPs", value.asInstanceOf[js.Any])
    
    inline def setLinkLocalIPsUndefined: Self = StObject.set(x, "LinkLocalIPs", js.undefined)
    
    inline def setLinkLocalIPsVarargs(value: String*): Self = StObject.set(x, "LinkLocalIPs", js.Array(value :_*))
  }
}
