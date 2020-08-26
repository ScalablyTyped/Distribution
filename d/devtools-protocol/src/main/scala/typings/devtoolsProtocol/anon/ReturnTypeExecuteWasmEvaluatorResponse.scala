package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.ExecuteWasmEvaluatorRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.ExecuteWasmEvaluatorResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReturnTypeExecuteWasmEvaluatorResponse extends js.Object {
  var paramsType: js.Array[ExecuteWasmEvaluatorRequest] = js.native
  var returnType: ExecuteWasmEvaluatorResponse = js.native
}

object ReturnTypeExecuteWasmEvaluatorResponse {
  @scala.inline
  def apply(paramsType: js.Array[ExecuteWasmEvaluatorRequest], returnType: ExecuteWasmEvaluatorResponse): ReturnTypeExecuteWasmEvaluatorResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeExecuteWasmEvaluatorResponse]
  }
  @scala.inline
  implicit class ReturnTypeExecuteWasmEvaluatorResponseOps[Self <: ReturnTypeExecuteWasmEvaluatorResponse] (val x: Self) extends AnyVal {
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
    def setParamsTypeVarargs(value: ExecuteWasmEvaluatorRequest*): Self = this.set("paramsType", js.Array(value :_*))
    @scala.inline
    def setParamsType(value: js.Array[ExecuteWasmEvaluatorRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnType(value: ExecuteWasmEvaluatorResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
  
}

