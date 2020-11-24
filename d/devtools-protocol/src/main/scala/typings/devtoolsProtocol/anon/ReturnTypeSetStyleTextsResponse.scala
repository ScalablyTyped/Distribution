package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.SetStyleTextsRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetStyleTextsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSetStyleTextsResponse extends js.Object {
  
  var paramsType: js.Array[SetStyleTextsRequest] = js.native
  
  var returnType: SetStyleTextsResponse = js.native
}
object ReturnTypeSetStyleTextsResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SetStyleTextsRequest], returnType: SetStyleTextsResponse): ReturnTypeSetStyleTextsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetStyleTextsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetStyleTextsResponseOps[Self <: ReturnTypeSetStyleTextsResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: SetStyleTextsRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[SetStyleTextsRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: SetStyleTextsResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
