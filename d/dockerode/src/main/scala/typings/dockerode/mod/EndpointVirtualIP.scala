package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointVirtualIP extends StObject {
  
  var Addr: js.UndefOr[String] = js.native
  
  var NetworkID: js.UndefOr[String] = js.native
}
object EndpointVirtualIP {
  
  @scala.inline
  def apply(): EndpointVirtualIP = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndpointVirtualIP]
  }
  
  @scala.inline
  implicit class EndpointVirtualIPMutableBuilder[Self <: EndpointVirtualIP] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddr(value: String): Self = StObject.set(x, "Addr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddrUndefined: Self = StObject.set(x, "Addr", js.undefined)
    
    @scala.inline
    def setNetworkID(value: String): Self = StObject.set(x, "NetworkID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkIDUndefined: Self = StObject.set(x, "NetworkID", js.undefined)
  }
}
