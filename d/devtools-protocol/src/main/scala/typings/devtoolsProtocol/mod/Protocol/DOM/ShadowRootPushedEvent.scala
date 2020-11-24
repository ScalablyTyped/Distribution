package typings.devtoolsProtocol.mod.Protocol.DOM

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShadowRootPushedEvent extends js.Object {
  
  /**
    * Host element id.
    */
  var hostId: NodeId = js.native
  
  /**
    * Shadow root.
    */
  var root: Node = js.native
}
object ShadowRootPushedEvent {
  
  @scala.inline
  def apply(hostId: NodeId, root: Node): ShadowRootPushedEvent = {
    val __obj = js.Dynamic.literal(hostId = hostId.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShadowRootPushedEvent]
  }
  
  @scala.inline
  implicit class ShadowRootPushedEventOps[Self <: ShadowRootPushedEvent] (val x: Self) extends AnyVal {
    
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
    def setHostId(value: NodeId): Self = this.set("hostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: Node): Self = this.set("root", value.asInstanceOf[js.Any])
  }
}
