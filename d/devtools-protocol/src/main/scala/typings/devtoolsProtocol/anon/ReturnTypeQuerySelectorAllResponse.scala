package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorAllRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.QuerySelectorAllResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeQuerySelectorAllResponse extends js.Object {
  
  var paramsType: js.Array[QuerySelectorAllRequest] = js.native
  
  var returnType: QuerySelectorAllResponse = js.native
}
object ReturnTypeQuerySelectorAllResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[QuerySelectorAllRequest], returnType: QuerySelectorAllResponse): ReturnTypeQuerySelectorAllResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeQuerySelectorAllResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeQuerySelectorAllResponseOps[Self <: ReturnTypeQuerySelectorAllResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: QuerySelectorAllRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[QuerySelectorAllRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: QuerySelectorAllResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
