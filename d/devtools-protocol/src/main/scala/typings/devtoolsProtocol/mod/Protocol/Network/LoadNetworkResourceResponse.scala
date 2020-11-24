package typings.devtoolsProtocol.mod.Protocol.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadNetworkResourceResponse extends js.Object {
  
  var resource: LoadNetworkResourcePageResult = js.native
}
object LoadNetworkResourceResponse {
  
  @scala.inline
  def apply(resource: LoadNetworkResourcePageResult): LoadNetworkResourceResponse = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadNetworkResourceResponse]
  }
  
  @scala.inline
  implicit class LoadNetworkResourceResponseOps[Self <: LoadNetworkResourceResponse] (val x: Self) extends AnyVal {
    
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
    def setResource(value: LoadNetworkResourcePageResult): Self = this.set("resource", value.asInstanceOf[js.Any])
  }
}
