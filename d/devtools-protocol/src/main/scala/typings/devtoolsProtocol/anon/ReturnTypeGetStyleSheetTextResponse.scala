package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.GetStyleSheetTextRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetStyleSheetTextResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetStyleSheetTextResponse extends js.Object {
  
  var paramsType: js.Array[GetStyleSheetTextRequest] = js.native
  
  var returnType: GetStyleSheetTextResponse = js.native
}
object ReturnTypeGetStyleSheetTextResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetStyleSheetTextRequest], returnType: GetStyleSheetTextResponse): ReturnTypeGetStyleSheetTextResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetStyleSheetTextResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetStyleSheetTextResponseOps[Self <: ReturnTypeGetStyleSheetTextResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: GetStyleSheetTextRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[GetStyleSheetTextRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetStyleSheetTextResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
