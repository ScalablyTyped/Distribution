package typings.devtoolsProtocol.mod.Protocol.Accessibility

import typings.devtoolsProtocol.mod.Protocol.DOM.BackendNodeId
import typings.devtoolsProtocol.mod.Protocol.DOM.NodeId
import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryAXTreeRequest extends js.Object {
  
  /**
    * Find nodes with this computed name.
    */
  var accessibleName: js.UndefOr[String] = js.native
  
  /**
    * Identifier of the backend node for the root to query.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.native
  
  /**
    * Identifier of the node for the root to query.
    */
  var nodeId: js.UndefOr[NodeId] = js.native
  
  /**
    * JavaScript object id of the node wrapper for the root to query.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.native
  
  /**
    * Find nodes with this computed role.
    */
  var role: js.UndefOr[String] = js.native
}
object QueryAXTreeRequest {
  
  @scala.inline
  def apply(): QueryAXTreeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryAXTreeRequest]
  }
  
  @scala.inline
  implicit class QueryAXTreeRequestOps[Self <: QueryAXTreeRequest] (val x: Self) extends AnyVal {
    
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
    def setAccessibleName(value: String): Self = this.set("accessibleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAccessibleName: Self = this.set("accessibleName", js.undefined)
    
    @scala.inline
    def setBackendNodeId(value: BackendNodeId): Self = this.set("backendNodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackendNodeId: Self = this.set("backendNodeId", js.undefined)
    
    @scala.inline
    def setNodeId(value: NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNodeId: Self = this.set("nodeId", js.undefined)
    
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
}
