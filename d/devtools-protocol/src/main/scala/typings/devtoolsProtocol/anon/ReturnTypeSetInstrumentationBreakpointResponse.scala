package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.SetInstrumentationBreakpointRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetInstrumentationBreakpointResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSetInstrumentationBreakpointResponse extends js.Object {
  
  var paramsType: js.Array[SetInstrumentationBreakpointRequest] = js.native
  
  var returnType: SetInstrumentationBreakpointResponse = js.native
}
object ReturnTypeSetInstrumentationBreakpointResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[SetInstrumentationBreakpointRequest],
    returnType: SetInstrumentationBreakpointResponse
  ): ReturnTypeSetInstrumentationBreakpointResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetInstrumentationBreakpointResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetInstrumentationBreakpointResponseOps[Self <: ReturnTypeSetInstrumentationBreakpointResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: SetInstrumentationBreakpointRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[SetInstrumentationBreakpointRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: SetInstrumentationBreakpointResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
