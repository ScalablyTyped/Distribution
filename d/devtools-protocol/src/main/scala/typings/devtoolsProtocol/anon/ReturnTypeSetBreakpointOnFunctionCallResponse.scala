package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointOnFunctionCallRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointOnFunctionCallResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeSetBreakpointOnFunctionCallResponse extends js.Object {
  var paramsType: js.Array[SetBreakpointOnFunctionCallRequest] = js.native
  var returnType: SetBreakpointOnFunctionCallResponse = js.native
}

object ReturnTypeSetBreakpointOnFunctionCallResponse {
  @scala.inline
  def apply(
    paramsType: js.Array[SetBreakpointOnFunctionCallRequest],
    returnType: SetBreakpointOnFunctionCallResponse
  ): ReturnTypeSetBreakpointOnFunctionCallResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetBreakpointOnFunctionCallResponse]
  }
  @scala.inline
  implicit class ReturnTypeSetBreakpointOnFunctionCallResponseOps[Self <: ReturnTypeSetBreakpointOnFunctionCallResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: SetBreakpointOnFunctionCallRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[SetBreakpointOnFunctionCallRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: SetBreakpointOnFunctionCallResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

