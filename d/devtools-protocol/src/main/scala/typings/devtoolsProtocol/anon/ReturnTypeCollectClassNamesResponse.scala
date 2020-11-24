package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.CollectClassNamesRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.CollectClassNamesResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeCollectClassNamesResponse extends js.Object {
  
  var paramsType: js.Array[CollectClassNamesRequest] = js.native
  
  var returnType: CollectClassNamesResponse = js.native
}
object ReturnTypeCollectClassNamesResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[CollectClassNamesRequest], returnType: CollectClassNamesResponse): ReturnTypeCollectClassNamesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCollectClassNamesResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeCollectClassNamesResponseOps[Self <: ReturnTypeCollectClassNamesResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: CollectClassNamesRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[CollectClassNamesRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: CollectClassNamesResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
