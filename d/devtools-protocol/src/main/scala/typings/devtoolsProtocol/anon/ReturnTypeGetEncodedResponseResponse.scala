package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Audits.GetEncodedResponseRequest
import typings.devtoolsProtocol.mod.Protocol.Audits.GetEncodedResponseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetEncodedResponseResponse extends js.Object {
  
  var paramsType: js.Array[GetEncodedResponseRequest] = js.native
  
  var returnType: GetEncodedResponseResponse = js.native
}
object ReturnTypeGetEncodedResponseResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetEncodedResponseRequest], returnType: GetEncodedResponseResponse): ReturnTypeGetEncodedResponseResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetEncodedResponseResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetEncodedResponseResponseOps[Self <: ReturnTypeGetEncodedResponseResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: GetEncodedResponseRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[GetEncodedResponseRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetEncodedResponseResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
