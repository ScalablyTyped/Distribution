package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDataRequest
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDataResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeRequestDataResponse extends js.Object {
  var paramsType: js.Array[RequestDataRequest] = js.native
  var returnType: RequestDataResponse = js.native
}

object ReturnTypeRequestDataResponse {
  @scala.inline
  def apply(paramsType: js.Array[RequestDataRequest], returnType: RequestDataResponse): ReturnTypeRequestDataResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestDataResponse]
  }
  @scala.inline
  implicit class ReturnTypeRequestDataResponseOps[Self <: ReturnTypeRequestDataResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: RequestDataRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[RequestDataRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: RequestDataResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

