package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.SetCookieRequest
import typings.devtoolsProtocol.mod.Protocol.Network.SetCookieResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeSetCookieResponse extends js.Object {
  
  var paramsType: js.Array[SetCookieRequest] = js.native
  
  var returnType: SetCookieResponse = js.native
}
object ReturnTypeSetCookieResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[SetCookieRequest], returnType: SetCookieResponse): ReturnTypeSetCookieResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetCookieResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeSetCookieResponseOps[Self <: ReturnTypeSetCookieResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: SetCookieRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[SetCookieRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: SetCookieResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
