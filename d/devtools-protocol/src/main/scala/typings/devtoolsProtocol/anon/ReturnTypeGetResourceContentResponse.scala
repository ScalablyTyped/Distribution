package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.GetResourceContentRequest
import typings.devtoolsProtocol.mod.Protocol.Page.GetResourceContentResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetResourceContentResponse extends js.Object {
  var paramsType: js.Array[GetResourceContentRequest] = js.native
  var returnType: GetResourceContentResponse = js.native
}

object ReturnTypeGetResourceContentResponse {
  @scala.inline
  def apply(paramsType: js.Array[GetResourceContentRequest], returnType: GetResourceContentResponse): ReturnTypeGetResourceContentResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetResourceContentResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetResourceContentResponseOps[Self <: ReturnTypeGetResourceContentResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: GetResourceContentRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[GetResourceContentRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetResourceContentResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

