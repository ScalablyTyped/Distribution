package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.SetStyleSheetTextRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetStyleSheetTextResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSetStyleSheetTextResponse extends js.Object {
  
  var paramsType: js.Array[SetStyleSheetTextRequest] = js.native
  
  var returnType: SetStyleSheetTextResponse = js.native
}
object ReturnTypeSetStyleSheetTextResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SetStyleSheetTextRequest], returnType: SetStyleSheetTextResponse): ReturnTypeSetStyleSheetTextResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetStyleSheetTextResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetStyleSheetTextResponseOps[Self <: ReturnTypeSetStyleSheetTextResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: SetStyleSheetTextRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[SetStyleSheetTextRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: SetStyleSheetTextResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
