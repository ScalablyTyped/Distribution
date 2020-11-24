package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.SetScriptSourceRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SetScriptSourceResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSetScriptSourceResponse extends js.Object {
  
  var paramsType: js.Array[SetScriptSourceRequest] = js.native
  
  var returnType: SetScriptSourceResponse = js.native
}
object ReturnTypeSetScriptSourceResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SetScriptSourceRequest], returnType: SetScriptSourceResponse): ReturnTypeSetScriptSourceResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetScriptSourceResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetScriptSourceResponseOps[Self <: ReturnTypeSetScriptSourceResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: SetScriptSourceRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[SetScriptSourceRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: SetScriptSourceResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
