package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.LayerTree.ReplaySnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.LayerTree.ReplaySnapshotResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeReplaySnapshotResponse extends js.Object {
  
  var paramsType: js.Array[ReplaySnapshotRequest] = js.native
  
  var returnType: ReplaySnapshotResponse = js.native
}
object ReturnTypeReplaySnapshotResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[ReplaySnapshotRequest], returnType: ReplaySnapshotResponse): ReturnTypeReplaySnapshotResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeReplaySnapshotResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeReplaySnapshotResponseOps[Self <: ReturnTypeReplaySnapshotResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: ReplaySnapshotRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[ReplaySnapshotRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: ReplaySnapshotResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
