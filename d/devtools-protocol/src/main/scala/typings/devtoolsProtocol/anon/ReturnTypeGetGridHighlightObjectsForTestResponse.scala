package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.GetGridHighlightObjectsForTestRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.GetGridHighlightObjectsForTestResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetGridHighlightObjectsForTestResponse extends js.Object {
  
  var paramsType: js.Array[GetGridHighlightObjectsForTestRequest] = js.native
  
  var returnType: GetGridHighlightObjectsForTestResponse = js.native
}
object ReturnTypeGetGridHighlightObjectsForTestResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[GetGridHighlightObjectsForTestRequest],
    returnType: GetGridHighlightObjectsForTestResponse
  ): ReturnTypeGetGridHighlightObjectsForTestResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetGridHighlightObjectsForTestResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetGridHighlightObjectsForTestResponseOps[Self <: ReturnTypeGetGridHighlightObjectsForTestResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: GetGridHighlightObjectsForTestRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[GetGridHighlightObjectsForTestRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetGridHighlightObjectsForTestResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
