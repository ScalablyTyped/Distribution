package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Page.CreateIsolatedWorldRequest
import typings.devtoolsProtocol.mod.Protocol.Page.CreateIsolatedWorldResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeCreateIsolatedWorldResponse extends js.Object {
  
  var paramsType: js.Array[CreateIsolatedWorldRequest] = js.native
  
  var returnType: CreateIsolatedWorldResponse = js.native
}
object ReturnTypeCreateIsolatedWorldResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[CreateIsolatedWorldRequest], returnType: CreateIsolatedWorldResponse): ReturnTypeCreateIsolatedWorldResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCreateIsolatedWorldResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeCreateIsolatedWorldResponseOps[Self <: ReturnTypeCreateIsolatedWorldResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: CreateIsolatedWorldRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[CreateIsolatedWorldRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: CreateIsolatedWorldResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
