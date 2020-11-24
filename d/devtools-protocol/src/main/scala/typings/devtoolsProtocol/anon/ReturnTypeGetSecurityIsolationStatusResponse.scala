package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.GetSecurityIsolationStatusRequest
import typings.devtoolsProtocol.mod.Protocol.Network.GetSecurityIsolationStatusResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetSecurityIsolationStatusResponse extends js.Object {
  
  var paramsType: js.Array[js.UndefOr[GetSecurityIsolationStatusRequest]] = js.native
  
  var returnType: GetSecurityIsolationStatusResponse = js.native
}
object ReturnTypeGetSecurityIsolationStatusResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[js.UndefOr[GetSecurityIsolationStatusRequest]],
    returnType: GetSecurityIsolationStatusResponse
  ): ReturnTypeGetSecurityIsolationStatusResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetSecurityIsolationStatusResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetSecurityIsolationStatusResponseOps[Self <: ReturnTypeGetSecurityIsolationStatusResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: js.UndefOr[GetSecurityIsolationStatusRequest]*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[GetSecurityIsolationStatusRequest]]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetSecurityIsolationStatusResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
