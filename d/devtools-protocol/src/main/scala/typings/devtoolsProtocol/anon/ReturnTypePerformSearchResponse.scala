package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.PerformSearchRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.PerformSearchResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypePerformSearchResponse extends js.Object {
  
  var paramsType: js.Array[PerformSearchRequest] = js.native
  
  var returnType: PerformSearchResponse = js.native
}
object ReturnTypePerformSearchResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[PerformSearchRequest], returnType: PerformSearchResponse): ReturnTypePerformSearchResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypePerformSearchResponse]
  }
  
  @scala.inline
  implicit class ReturnTypePerformSearchResponseOps[Self <: ReturnTypePerformSearchResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: PerformSearchRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[PerformSearchRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: PerformSearchResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
