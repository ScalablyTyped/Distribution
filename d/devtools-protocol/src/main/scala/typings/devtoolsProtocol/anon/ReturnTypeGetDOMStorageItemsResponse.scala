package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOMStorage.GetDOMStorageItemsRequest
import typings.devtoolsProtocol.mod.Protocol.DOMStorage.GetDOMStorageItemsResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetDOMStorageItemsResponse extends js.Object {
  
  var paramsType: js.Array[GetDOMStorageItemsRequest] = js.native
  
  var returnType: GetDOMStorageItemsResponse = js.native
}
object ReturnTypeGetDOMStorageItemsResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetDOMStorageItemsRequest], returnType: GetDOMStorageItemsResponse): ReturnTypeGetDOMStorageItemsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetDOMStorageItemsResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetDOMStorageItemsResponseOps[Self <: ReturnTypeGetDOMStorageItemsResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: GetDOMStorageItemsRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[GetDOMStorageItemsRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: GetDOMStorageItemsResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
