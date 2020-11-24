package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.CollectClassNamesFromSubtreeRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.CollectClassNamesFromSubtreeResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeCollectClassNamesFromSubtreeResponse extends js.Object {
  
  var paramsType: js.Array[CollectClassNamesFromSubtreeRequest] = js.native
  
  var returnType: CollectClassNamesFromSubtreeResponse = js.native
}
object ReturnTypeCollectClassNamesFromSubtreeResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[CollectClassNamesFromSubtreeRequest],
    returnType: CollectClassNamesFromSubtreeResponse
  ): ReturnTypeCollectClassNamesFromSubtreeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCollectClassNamesFromSubtreeResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeCollectClassNamesFromSubtreeResponseOps[Self <: ReturnTypeCollectClassNamesFromSubtreeResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: CollectClassNamesFromSubtreeRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[CollectClassNamesFromSubtreeRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: CollectClassNamesFromSubtreeResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
