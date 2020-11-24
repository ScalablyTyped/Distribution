package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.GetResponseBodyForInterceptionRequest
import typings.devtoolsProtocol.mod.Protocol.Network.GetResponseBodyForInterceptionResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetResponseBodyForInterceptionResponse extends js.Object {
  
  var paramsType: js.Array[GetResponseBodyForInterceptionRequest] = js.native
  
  var returnType: GetResponseBodyForInterceptionResponse = js.native
}
object ReturnTypeGetResponseBodyForInterceptionResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[GetResponseBodyForInterceptionRequest],
    returnType: GetResponseBodyForInterceptionResponse
  ): ReturnTypeGetResponseBodyForInterceptionResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetResponseBodyForInterceptionResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetResponseBodyForInterceptionResponseOps[Self <: ReturnTypeGetResponseBodyForInterceptionResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: GetResponseBodyForInterceptionRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[GetResponseBodyForInterceptionRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetResponseBodyForInterceptionResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
