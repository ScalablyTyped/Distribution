package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.CompileScriptRequest
import typings.devtoolsProtocol.mod.Protocol.Runtime.CompileScriptResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeCompileScriptResponse extends js.Object {
  var paramsType: js.Array[CompileScriptRequest] = js.native
  var returnType: CompileScriptResponse = js.native
}

object ReturnTypeCompileScriptResponse {
  @scala.inline
  def apply(paramsType: js.Array[CompileScriptRequest], returnType: CompileScriptResponse): ReturnTypeCompileScriptResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCompileScriptResponse]
  }
  @scala.inline
  implicit class ReturnTypeCompileScriptResponseOps[Self <: ReturnTypeCompileScriptResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: CompileScriptRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[CompileScriptRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: CompileScriptResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

