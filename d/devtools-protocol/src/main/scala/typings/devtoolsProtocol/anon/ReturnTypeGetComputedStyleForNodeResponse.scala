package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.GetComputedStyleForNodeRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetComputedStyleForNodeResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetComputedStyleForNodeResponse extends js.Object {
  
  var paramsType: js.Array[GetComputedStyleForNodeRequest] = js.native
  
  var returnType: GetComputedStyleForNodeResponse = js.native
}
object ReturnTypeGetComputedStyleForNodeResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetComputedStyleForNodeRequest], returnType: GetComputedStyleForNodeResponse): ReturnTypeGetComputedStyleForNodeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetComputedStyleForNodeResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetComputedStyleForNodeResponseOps[Self <: ReturnTypeGetComputedStyleForNodeResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: GetComputedStyleForNodeRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[GetComputedStyleForNodeRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetComputedStyleForNodeResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
