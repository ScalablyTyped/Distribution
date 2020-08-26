package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.GetScriptSourceRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.GetScriptSourceResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeGetScriptSourceResponse extends js.Object {
  var paramsType: js.Array[GetScriptSourceRequest] = js.native
  var returnType: GetScriptSourceResponse = js.native
}

object ReturnTypeGetScriptSourceResponse {
  @scala.inline
  def apply(paramsType: js.Array[GetScriptSourceRequest], returnType: GetScriptSourceResponse): ReturnTypeGetScriptSourceResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetScriptSourceResponse]
  }
  @scala.inline
  implicit class ReturnTypeGetScriptSourceResponseOps[Self <: ReturnTypeGetScriptSourceResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: GetScriptSourceRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[GetScriptSourceRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: GetScriptSourceResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

