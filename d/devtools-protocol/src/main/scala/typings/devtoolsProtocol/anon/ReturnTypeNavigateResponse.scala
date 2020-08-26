package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.NavigateRequest
import typings.devtoolsProtocol.mod.Protocol.Page.NavigateResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeNavigateResponse extends js.Object {
  var paramsType: js.Array[NavigateRequest] = js.native
  var returnType: NavigateResponse = js.native
}

object ReturnTypeNavigateResponse {
  @scala.inline
  def apply(paramsType: js.Array[NavigateRequest], returnType: NavigateResponse): ReturnTypeNavigateResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeNavigateResponse]
  }
  @scala.inline
  implicit class ReturnTypeNavigateResponseOps[Self <: ReturnTypeNavigateResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: NavigateRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[NavigateRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: NavigateResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

