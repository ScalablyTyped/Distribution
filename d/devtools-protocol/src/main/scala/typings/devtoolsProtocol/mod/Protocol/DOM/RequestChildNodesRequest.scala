package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestChildNodesRequest extends js.Object {
  
  /**
    * The maximum depth at which children should be retrieved, defaults to 1. Use -1 for the
    * entire subtree or provide an integer larger than 0.
    */
  var depth: js.UndefOr[integer] = js.native
  
  /**
    * Id of the node to get children for.
    */
  var nodeId: NodeId = js.native
  
  /**
    * Whether or not iframes and shadow roots should be traversed when returning the sub-tree
    * (default is false).
    */
  var pierce: js.UndefOr[Boolean] = js.native
}
object RequestChildNodesRequest {
  
  @scala.inline
  def apply(nodeId: NodeId): RequestChildNodesRequest = {
    val __obj = js.Dynamic.literal(nodeId = nodeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestChildNodesRequest]
  }
  
  @scala.inline
  implicit class RequestChildNodesRequestOps[Self <: RequestChildNodesRequest] (val x: Self) extends AnyVal {
    
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
    def setNodeId(value: NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepth(value: integer): Self = this.set("depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDepth: Self = this.set("depth", js.undefined)
    
    @scala.inline
    def setPierce(value: Boolean): Self = this.set("pierce", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePierce: Self = this.set("pierce", js.undefined)
  }
}
