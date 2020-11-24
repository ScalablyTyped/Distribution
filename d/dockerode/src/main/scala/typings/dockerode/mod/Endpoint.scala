package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Endpoint extends js.Object {
  
  var Ports: js.UndefOr[js.Array[PortConfig]] = js.native
  
  var Spec: js.UndefOr[EndpointSpec] = js.native
  
  var VirtualIPs: js.UndefOr[js.Array[EndpointVirtualIP]] = js.native
}
object Endpoint {
  
  @scala.inline
  def apply(): Endpoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint]
  }
  
  @scala.inline
  implicit class EndpointOps[Self <: Endpoint] (val x: Self) extends AnyVal {
    
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
    def setPortsVarargs(value: PortConfig*): Self = this.set("Ports", js.Array(value :_*))
    
    @scala.inline
    def setPorts(value: js.Array[PortConfig]): Self = this.set("Ports", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePorts: Self = this.set("Ports", js.undefined)
    
    @scala.inline
    def setSpec(value: EndpointSpec): Self = this.set("Spec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpec: Self = this.set("Spec", js.undefined)
    
    @scala.inline
    def setVirtualIPsVarargs(value: EndpointVirtualIP*): Self = this.set("VirtualIPs", js.Array(value :_*))
    
    @scala.inline
    def setVirtualIPs(value: js.Array[EndpointVirtualIP]): Self = this.set("VirtualIPs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVirtualIPs: Self = this.set("VirtualIPs", js.undefined)
  }
}
