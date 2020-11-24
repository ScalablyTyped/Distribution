package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.GetPossibleBreakpointsRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.GetPossibleBreakpointsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetPossibleBreakpointsResponse extends js.Object {
  
  var paramsType: js.Array[GetPossibleBreakpointsRequest] = js.native
  
  var returnType: GetPossibleBreakpointsResponse = js.native
}
object ReturnTypeGetPossibleBreakpointsResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetPossibleBreakpointsRequest], returnType: GetPossibleBreakpointsResponse): ReturnTypeGetPossibleBreakpointsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetPossibleBreakpointsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetPossibleBreakpointsResponseOps[Self <: ReturnTypeGetPossibleBreakpointsResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: GetPossibleBreakpointsRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[GetPossibleBreakpointsRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetPossibleBreakpointsResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
