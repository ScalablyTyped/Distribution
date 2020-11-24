package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.EvaluateOnCallFrameRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.EvaluateOnCallFrameResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeEvaluateOnCallFrameResponse extends js.Object {
  
  var paramsType: js.Array[EvaluateOnCallFrameRequest] = js.native
  
  var returnType: EvaluateOnCallFrameResponse = js.native
}
object ReturnTypeEvaluateOnCallFrameResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[EvaluateOnCallFrameRequest], returnType: EvaluateOnCallFrameResponse): ReturnTypeEvaluateOnCallFrameResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeEvaluateOnCallFrameResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeEvaluateOnCallFrameResponseOps[Self <: ReturnTypeEvaluateOnCallFrameResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: EvaluateOnCallFrameRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[EvaluateOnCallFrameRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: EvaluateOnCallFrameResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
