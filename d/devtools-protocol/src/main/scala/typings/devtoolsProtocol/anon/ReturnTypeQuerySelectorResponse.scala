package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeQuerySelectorResponse extends js.Object {
  
  var paramsType: js.Array[QuerySelectorRequest] = js.native
  
  var returnType: QuerySelectorResponse = js.native
}
object ReturnTypeQuerySelectorResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[QuerySelectorRequest], returnType: QuerySelectorResponse): ReturnTypeQuerySelectorResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeQuerySelectorResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeQuerySelectorResponseOps[Self <: ReturnTypeQuerySelectorResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: QuerySelectorRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[QuerySelectorRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: QuerySelectorResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
