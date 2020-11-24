package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetBreakpointResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSetBreakpointResponse extends js.Object {
  
  var paramsType: js.Array[SetBreakpointRequest] = js.native
  
  var returnType: SetBreakpointResponse = js.native
}
object ReturnTypeSetBreakpointResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SetBreakpointRequest], returnType: SetBreakpointResponse): ReturnTypeSetBreakpointResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetBreakpointResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetBreakpointResponseOps[Self <: ReturnTypeSetBreakpointResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: SetBreakpointRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[SetBreakpointRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: SetBreakpointResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
