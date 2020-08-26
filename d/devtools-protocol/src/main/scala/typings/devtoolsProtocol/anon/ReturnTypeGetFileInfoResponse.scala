package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.GetFileInfoRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.GetFileInfoResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetFileInfoResponse extends js.Object {
  var paramsType: js.Array[GetFileInfoRequest] = js.native
  var returnType: GetFileInfoResponse = js.native
}

object ReturnTypeGetFileInfoResponse {
  @scala.inline
  def apply(paramsType: js.Array[GetFileInfoRequest], returnType: GetFileInfoResponse): ReturnTypeGetFileInfoResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetFileInfoResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetFileInfoResponseOps[Self <: ReturnTypeGetFileInfoResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: GetFileInfoRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[GetFileInfoRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetFileInfoResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

