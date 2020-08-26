package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOMSnapshot.GetSnapshotRequest
import typings.devtoolsProtocol.mod.Protocol.DOMSnapshot.GetSnapshotResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetSnapshotResponse extends js.Object {
  var paramsType: js.Array[GetSnapshotRequest] = js.native
  var returnType: GetSnapshotResponse = js.native
}

object ReturnTypeGetSnapshotResponse {
  @scala.inline
  def apply(paramsType: js.Array[GetSnapshotRequest], returnType: GetSnapshotResponse): ReturnTypeGetSnapshotResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetSnapshotResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetSnapshotResponseOps[Self <: ReturnTypeGetSnapshotResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: GetSnapshotRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[GetSnapshotRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetSnapshotResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

