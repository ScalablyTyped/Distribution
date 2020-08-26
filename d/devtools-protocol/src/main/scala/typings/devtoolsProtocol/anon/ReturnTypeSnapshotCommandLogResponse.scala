package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.LayerTree.SnapshotCommandLogRequest
import typings.devtoolsProtocol.mod.Protocol.LayerTree.SnapshotCommandLogResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeSnapshotCommandLogResponse extends js.Object {
  var paramsType: js.Array[SnapshotCommandLogRequest] = js.native
  var returnType: SnapshotCommandLogResponse = js.native
}

object ReturnTypeSnapshotCommandLogResponse {
  @scala.inline
  def apply(paramsType: js.Array[SnapshotCommandLogRequest], returnType: SnapshotCommandLogResponse): ReturnTypeSnapshotCommandLogResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSnapshotCommandLogResponse]
  }
  @scala.inline
  implicit class ReturnTypeSnapshotCommandLogResponseOps[Self <: ReturnTypeSnapshotCommandLogResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: SnapshotCommandLogRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[SnapshotCommandLogRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: SnapshotCommandLogResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

