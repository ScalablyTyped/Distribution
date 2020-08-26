package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.LayerTree.ProfileSnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.LayerTree.ProfileSnapshotResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeProfileSnapshotResponse extends js.Object {
  var paramsType: js.Array[ProfileSnapshotRequest] = js.native
  var returnType: ProfileSnapshotResponse = js.native
}

object ReturnTypeProfileSnapshotResponse {
  @scala.inline
  def apply(paramsType: js.Array[ProfileSnapshotRequest], returnType: ProfileSnapshotResponse): ReturnTypeProfileSnapshotResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeProfileSnapshotResponse]
  }
  @scala.inline
  implicit class ReturnTypeProfileSnapshotResponseOps[Self <: ReturnTypeProfileSnapshotResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: ProfileSnapshotRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[ProfileSnapshotRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: ProfileSnapshotResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

