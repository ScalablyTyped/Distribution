package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.Runtime.ExecutionContextId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResolveNodeRequest extends js.Object {
  /**
    * Backend identifier of the node to resolve.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.native
  /**
    * Execution context in which to resolve the node.
    */
  var executionContextId: js.UndefOr[ExecutionContextId] = js.native
  /**
    * Id of the node to resolve.
    */
  var nodeId: js.UndefOr[NodeId] = js.native
  /**
    * Symbolic group name that can be used to release multiple objects.
    */
  var objectGroup: js.UndefOr[String] = js.native
}

object ResolveNodeRequest {
  @scala.inline
  def apply(): ResolveNodeRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResolveNodeRequest]
  }
  @scala.inline
  implicit class ResolveNodeRequestOps[Self <: ResolveNodeRequest] (val x: Self) extends AnyVal {
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
    def setBackendNodeId(value: BackendNodeId): Self = this.set("backendNodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackendNodeId: Self = this.set("backendNodeId", js.undefined)
    @scala.inline
    def setExecutionContextId(value: ExecutionContextId): Self = this.set("executionContextId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionContextId: Self = this.set("executionContextId", js.undefined)
    @scala.inline
    def setNodeId(value: NodeId): Self = this.set("nodeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeId: Self = this.set("nodeId", js.undefined)
    @scala.inline
    def setObjectGroup(value: String): Self = this.set("objectGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteObjectGroup: Self = this.set("objectGroup", js.undefined)
  }
  
}

