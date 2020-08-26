package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.GetHighlightObjectForTestRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.GetHighlightObjectForTestResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetHighlightObjectForTestResponse extends js.Object {
  var paramsType: js.Array[GetHighlightObjectForTestRequest] = js.native
  var returnType: GetHighlightObjectForTestResponse = js.native
}

object ReturnTypeGetHighlightObjectForTestResponse {
  @scala.inline
  def apply(
    paramsType: js.Array[GetHighlightObjectForTestRequest],
    returnType: GetHighlightObjectForTestResponse
  ): ReturnTypeGetHighlightObjectForTestResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetHighlightObjectForTestResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetHighlightObjectForTestResponseOps[Self <: ReturnTypeGetHighlightObjectForTestResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: GetHighlightObjectForTestRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[GetHighlightObjectForTestRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetHighlightObjectForTestResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

