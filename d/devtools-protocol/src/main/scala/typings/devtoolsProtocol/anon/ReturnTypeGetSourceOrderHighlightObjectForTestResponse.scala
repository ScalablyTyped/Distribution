package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.GetSourceOrderHighlightObjectForTestRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.GetSourceOrderHighlightObjectForTestResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetSourceOrderHighlightObjectForTestResponse extends js.Object {
  
  var paramsType: js.Array[GetSourceOrderHighlightObjectForTestRequest] = js.native
  
  var returnType: GetSourceOrderHighlightObjectForTestResponse = js.native
}
object ReturnTypeGetSourceOrderHighlightObjectForTestResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[GetSourceOrderHighlightObjectForTestRequest],
    returnType: GetSourceOrderHighlightObjectForTestResponse
  ): ReturnTypeGetSourceOrderHighlightObjectForTestResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetSourceOrderHighlightObjectForTestResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetSourceOrderHighlightObjectForTestResponseOps[Self <: ReturnTypeGetSourceOrderHighlightObjectForTestResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: GetSourceOrderHighlightObjectForTestRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[GetSourceOrderHighlightObjectForTestRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetSourceOrderHighlightObjectForTestResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
