package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.GetResponseBodyRequest
import typings.devtoolsProtocol.mod.Protocol.Network.GetResponseBodyResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetResponseBodyResponse extends js.Object {
  
  var paramsType: js.Array[GetResponseBodyRequest] = js.native
  
  var returnType: GetResponseBodyResponse = js.native
}
object ReturnTypeGetResponseBodyResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetResponseBodyRequest], returnType: GetResponseBodyResponse): ReturnTypeGetResponseBodyResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetResponseBodyResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetResponseBodyResponseOps[Self <: ReturnTypeGetResponseBodyResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: GetResponseBodyRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[GetResponseBodyRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetResponseBodyResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
