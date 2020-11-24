package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.SetRuleSelectorRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetRuleSelectorResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSetRuleSelectorResponse extends js.Object {
  
  var paramsType: js.Array[SetRuleSelectorRequest] = js.native
  
  var returnType: SetRuleSelectorResponse = js.native
}
object ReturnTypeSetRuleSelectorResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SetRuleSelectorRequest], returnType: SetRuleSelectorResponse): ReturnTypeSetRuleSelectorResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetRuleSelectorResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetRuleSelectorResponseOps[Self <: ReturnTypeSetRuleSelectorResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: SetRuleSelectorRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[SetRuleSelectorRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: SetRuleSelectorResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
