package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.SetNodeNameRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.SetNodeNameResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSetNodeNameResponse extends js.Object {
  
  var paramsType: js.Array[SetNodeNameRequest] = js.native
  
  var returnType: SetNodeNameResponse = js.native
}
object ReturnTypeSetNodeNameResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SetNodeNameRequest], returnType: SetNodeNameResponse): ReturnTypeSetNodeNameResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetNodeNameResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetNodeNameResponseOps[Self <: ReturnTypeSetNodeNameResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: SetNodeNameRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[SetNodeNameRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: SetNodeNameResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
