package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndpointVirtualIP extends StObject {
  
  var Addr: js.UndefOr[String] = js.undefined
  
  var NetworkID: js.UndefOr[String] = js.undefined
}
object EndpointVirtualIP {
  
  inline def apply(): EndpointVirtualIP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointVirtualIP]
  }
  
  extension [Self <: EndpointVirtualIP](x: Self) {
    
    inline def setAddr(value: String): Self = StObject.set(x, "Addr", value.asInstanceOf[js.Any])
    
    inline def setAddrUndefined: Self = StObject.set(x, "Addr", js.undefined)
    
    inline def setNetworkID(value: String): Self = StObject.set(x, "NetworkID", value.asInstanceOf[js.Any])
    
    inline def setNetworkIDUndefined: Self = StObject.set(x, "NetworkID", js.undefined)
  }
}
