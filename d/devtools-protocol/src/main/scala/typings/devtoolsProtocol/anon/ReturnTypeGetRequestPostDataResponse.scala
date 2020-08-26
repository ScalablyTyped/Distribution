package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.GetRequestPostDataRequest
import typings.devtoolsProtocol.mod.Protocol.Network.GetRequestPostDataResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetRequestPostDataResponse extends js.Object {
  var paramsType: js.Array[GetRequestPostDataRequest] = js.native
  var returnType: GetRequestPostDataResponse = js.native
}

object ReturnTypeGetRequestPostDataResponse {
  @scala.inline
  def apply(paramsType: js.Array[GetRequestPostDataRequest], returnType: GetRequestPostDataResponse): ReturnTypeGetRequestPostDataResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetRequestPostDataResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetRequestPostDataResponseOps[Self <: ReturnTypeGetRequestPostDataResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: GetRequestPostDataRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[GetRequestPostDataRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetRequestPostDataResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

