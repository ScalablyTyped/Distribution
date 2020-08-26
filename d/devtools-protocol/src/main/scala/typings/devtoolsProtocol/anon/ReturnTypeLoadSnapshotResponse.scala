package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.LayerTree.LoadSnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.LayerTree.LoadSnapshotResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeLoadSnapshotResponse extends js.Object {
  var paramsType: js.Array[LoadSnapshotRequest] = js.native
  var returnType: LoadSnapshotResponse = js.native
}

object ReturnTypeLoadSnapshotResponse {
  @scala.inline
  def apply(paramsType: js.Array[LoadSnapshotRequest], returnType: LoadSnapshotResponse): ReturnTypeLoadSnapshotResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeLoadSnapshotResponse]
  }
  @scala.inline
  implicit class ReturnTypeLoadSnapshotResponseOps[Self <: ReturnTypeLoadSnapshotResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: LoadSnapshotRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[LoadSnapshotRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: LoadSnapshotResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

