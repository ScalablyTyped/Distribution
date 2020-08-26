package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.AddScriptToEvaluateOnNewDocumentRequest
import typings.devtoolsProtocol.mod.Protocol.Page.AddScriptToEvaluateOnNewDocumentResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeAddScriptToEvaluateOnNewDocumentResponse extends js.Object {
  var paramsType: js.Array[AddScriptToEvaluateOnNewDocumentRequest] = js.native
  var returnType: AddScriptToEvaluateOnNewDocumentResponse = js.native
}

object ReturnTypeAddScriptToEvaluateOnNewDocumentResponse {
  @scala.inline
  def apply(
    paramsType: js.Array[AddScriptToEvaluateOnNewDocumentRequest],
    returnType: AddScriptToEvaluateOnNewDocumentResponse
  ): ReturnTypeAddScriptToEvaluateOnNewDocumentResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeAddScriptToEvaluateOnNewDocumentResponse]
  }
  @scala.inline
  implicit class ReturnTypeAddScriptToEvaluateOnNewDocumentResponseOps[Self <: ReturnTypeAddScriptToEvaluateOnNewDocumentResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: AddScriptToEvaluateOnNewDocumentRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[AddScriptToEvaluateOnNewDocumentRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: AddScriptToEvaluateOnNewDocumentResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

