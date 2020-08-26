package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.AddScriptToEvaluateOnLoadRequest
import typings.devtoolsProtocol.mod.Protocol.Page.AddScriptToEvaluateOnLoadResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeAddScriptToEvaluateOnLoadResponse extends js.Object {
  var paramsType: js.Array[AddScriptToEvaluateOnLoadRequest] = js.native
  var returnType: AddScriptToEvaluateOnLoadResponse = js.native
}

object ReturnTypeAddScriptToEvaluateOnLoadResponse {
  @scala.inline
  def apply(
    paramsType: js.Array[AddScriptToEvaluateOnLoadRequest],
    returnType: AddScriptToEvaluateOnLoadResponse
  ): ReturnTypeAddScriptToEvaluateOnLoadResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeAddScriptToEvaluateOnLoadResponse]
  }
  @scala.inline
  implicit class ReturnTypeAddScriptToEvaluateOnLoadResponseOps[Self <: ReturnTypeAddScriptToEvaluateOnLoadResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: AddScriptToEvaluateOnLoadRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[AddScriptToEvaluateOnLoadRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: AddScriptToEvaluateOnLoadResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

