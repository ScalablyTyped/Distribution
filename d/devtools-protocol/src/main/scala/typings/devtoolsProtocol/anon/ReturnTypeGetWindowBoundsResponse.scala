package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Browser.GetWindowBoundsRequest
import typings.devtoolsProtocol.mod.Protocol.Browser.GetWindowBoundsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetWindowBoundsResponse extends js.Object {
  
  var paramsType: js.Array[GetWindowBoundsRequest] = js.native
  
  var returnType: GetWindowBoundsResponse = js.native
}
object ReturnTypeGetWindowBoundsResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetWindowBoundsRequest], returnType: GetWindowBoundsResponse): ReturnTypeGetWindowBoundsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetWindowBoundsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetWindowBoundsResponseOps[Self <: ReturnTypeGetWindowBoundsResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: GetWindowBoundsRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[GetWindowBoundsRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetWindowBoundsResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
