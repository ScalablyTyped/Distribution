package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IndexedDB.GetMetadataRequest
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.GetMetadataResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetMetadataResponse extends js.Object {
  
  var paramsType: js.Array[GetMetadataRequest] = js.native
  
  var returnType: GetMetadataResponse = js.native
}
object ReturnTypeGetMetadataResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetMetadataRequest], returnType: GetMetadataResponse): ReturnTypeGetMetadataResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetMetadataResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetMetadataResponseOps[Self <: ReturnTypeGetMetadataResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: GetMetadataRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[GetMetadataRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetMetadataResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
