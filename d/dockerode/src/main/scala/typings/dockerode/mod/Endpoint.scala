package typings.dockerode.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint extends StObject {
  
  var Ports: js.UndefOr[js.Array[PortConfig]] = js.undefined
  
  var Spec: js.UndefOr[EndpointSpec] = js.undefined
  
  var VirtualIPs: js.UndefOr[js.Array[EndpointVirtualIP]] = js.undefined
}
object Endpoint {
  
  @scala.inline
  def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit class EndpointMutableBuilder[Self <: Endpoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPorts(value: js.Array[PortConfig]): Self = StObject.set(x, "Ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortsUndefined: Self = StObject.set(x, "Ports", js.undefined)
    
    @scala.inline
    def setPortsVarargs(value: PortConfig*): Self = StObject.set(x, "Ports", js.Array(value :_*))
    
    @scala.inline
    def setSpec(value: EndpointSpec): Self = StObject.set(x, "Spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpecUndefined: Self = StObject.set(x, "Spec", js.undefined)
    
    @scala.inline
    def setVirtualIPs(value: js.Array[EndpointVirtualIP]): Self = StObject.set(x, "VirtualIPs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualIPsUndefined: Self = StObject.set(x, "VirtualIPs", js.undefined)
    
    @scala.inline
    def setVirtualIPsVarargs(value: EndpointVirtualIP*): Self = StObject.set(x, "VirtualIPs", js.Array(value :_*))
  }
}
