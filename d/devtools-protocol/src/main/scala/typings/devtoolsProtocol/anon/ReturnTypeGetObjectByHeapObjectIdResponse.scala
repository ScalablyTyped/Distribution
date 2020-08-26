package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.GetObjectByHeapObjectIdRequest
import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.GetObjectByHeapObjectIdResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetObjectByHeapObjectIdResponse extends js.Object {
  var paramsType: js.Array[GetObjectByHeapObjectIdRequest] = js.native
  var returnType: GetObjectByHeapObjectIdResponse = js.native
}

object ReturnTypeGetObjectByHeapObjectIdResponse {
  @scala.inline
  def apply(paramsType: js.Array[GetObjectByHeapObjectIdRequest], returnType: GetObjectByHeapObjectIdResponse): ReturnTypeGetObjectByHeapObjectIdResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetObjectByHeapObjectIdResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetObjectByHeapObjectIdResponseOps[Self <: ReturnTypeGetObjectByHeapObjectIdResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: GetObjectByHeapObjectIdRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[GetObjectByHeapObjectIdRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetObjectByHeapObjectIdResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

