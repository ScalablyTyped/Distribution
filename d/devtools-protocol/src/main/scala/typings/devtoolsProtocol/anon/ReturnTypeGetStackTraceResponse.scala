package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.GetStackTraceRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.GetStackTraceResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetStackTraceResponse extends js.Object {
  
  var paramsType: js.Array[GetStackTraceRequest] = js.native
  
  var returnType: GetStackTraceResponse = js.native
}
object ReturnTypeGetStackTraceResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetStackTraceRequest], returnType: GetStackTraceResponse): ReturnTypeGetStackTraceResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetStackTraceResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetStackTraceResponseOps[Self <: ReturnTypeGetStackTraceResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: GetStackTraceRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[GetStackTraceRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetStackTraceResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
