package typings.dockerode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndpointVirtualIP extends js.Object {
  
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
  implicit class EndpointVirtualIPOps[Self <: EndpointVirtualIP] (val x: Self) extends AnyVal {
    
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
    def setAddr(value: String): Self = this.set("Addr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddr: Self = this.set("Addr", js.undefined)
    
    @scala.inline
    def setNetworkID(value: String): Self = this.set("NetworkID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkID: Self = this.set("NetworkID", js.undefined)
  }
}
