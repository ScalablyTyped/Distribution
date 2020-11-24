package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.LayerTree.MakeSnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.LayerTree.MakeSnapshotResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeMakeSnapshotResponse extends js.Object {
  
  var paramsType: js.Array[MakeSnapshotRequest] = js.native
  
  var returnType: MakeSnapshotResponse = js.native
}
object ReturnTypeMakeSnapshotResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[MakeSnapshotRequest], returnType: MakeSnapshotResponse): ReturnTypeMakeSnapshotResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeMakeSnapshotResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeMakeSnapshotResponseOps[Self <: ReturnTypeMakeSnapshotResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: MakeSnapshotRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[MakeSnapshotRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: MakeSnapshotResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
