package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestEntriesRequest
import typings.devtoolsProtocol.mod.Protocol.CacheStorage.RequestEntriesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeRequestEntriesResponse extends js.Object {
  
  var paramsType: js.Array[RequestEntriesRequest] = js.native
  
  var returnType: RequestEntriesResponse = js.native
}
object ReturnTypeRequestEntriesResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[RequestEntriesRequest], returnType: RequestEntriesResponse): ReturnTypeRequestEntriesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestEntriesResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeRequestEntriesResponseOps[Self <: ReturnTypeRequestEntriesResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: RequestEntriesRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[RequestEntriesRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: RequestEntriesResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
