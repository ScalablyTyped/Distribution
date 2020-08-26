package typings.devtoolsProtocol.mod.Protocol.DOM

import typings.devtoolsProtocol.mod.Protocol.Runtime.RemoteObjectId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetFileInputFilesRequest extends js.Object {
  /**
    * Identifier of the backend node.
    */
  var backendNodeId: js.UndefOr[BackendNodeId] = js.native
  /**
    * Array of file paths to set.
    */
  var files: js.Array[String] = js.native
  /**
    * Identifier of the node.
    */
  var nodeId: js.UndefOr[NodeId] = js.native
  /**
    * JavaScript object id of the node wrapper.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.native
}

object SetFileInputFilesRequest {
  @scala.inline
  def apply(files: js.Array[String]): SetFileInputFilesRequest = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetFileInputFilesRequest]
  }
  @scala.inline
  implicit class SetFileInputFilesRequestOps[Self <: SetFileInputFilesRequest] (val x: Self) extends AnyVal {
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
    def setFilesVarargs(value: String*): Self = this.set("files", js.Array(value :_*))
    @scala.inline
    def setFiles(value: js.Array[String]): Self = this.set("files", value.asInstanceOf[js.Any])
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
  }
  
}

