package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.GetInlineStylesForNodeRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetInlineStylesForNodeResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetInlineStylesForNodeResponse extends js.Object {
  
  var paramsType: js.Array[GetInlineStylesForNodeRequest] = js.native
  
  var returnType: GetInlineStylesForNodeResponse = js.native
}
object ReturnTypeGetInlineStylesForNodeResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetInlineStylesForNodeRequest], returnType: GetInlineStylesForNodeResponse): ReturnTypeGetInlineStylesForNodeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetInlineStylesForNodeResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetInlineStylesForNodeResponseOps[Self <: ReturnTypeGetInlineStylesForNodeResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: GetInlineStylesForNodeRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[GetInlineStylesForNodeRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetInlineStylesForNodeResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
