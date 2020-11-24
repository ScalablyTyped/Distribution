package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Network.LoadNetworkResourceRequest
import typings.devtoolsProtocol.mod.Protocol.Network.LoadNetworkResourceResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeLoadNetworkResourceResponse extends js.Object {
  
  var paramsType: js.Array[LoadNetworkResourceRequest] = js.native
  
  var returnType: LoadNetworkResourceResponse = js.native
}
object ReturnTypeLoadNetworkResourceResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[LoadNetworkResourceRequest], returnType: LoadNetworkResourceResponse): ReturnTypeLoadNetworkResourceResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeLoadNetworkResourceResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeLoadNetworkResourceResponseOps[Self <: ReturnTypeLoadNetworkResourceResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: LoadNetworkResourceRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[LoadNetworkResourceRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: LoadNetworkResourceResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
