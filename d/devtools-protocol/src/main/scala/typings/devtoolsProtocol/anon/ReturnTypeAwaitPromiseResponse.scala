package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.AwaitPromiseRequest
import typings.devtoolsProtocol.mod.Protocol.Runtime.AwaitPromiseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeAwaitPromiseResponse extends js.Object {
  
  var paramsType: js.Array[AwaitPromiseRequest] = js.native
  
  var returnType: AwaitPromiseResponse = js.native
}
object ReturnTypeAwaitPromiseResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[AwaitPromiseRequest], returnType: AwaitPromiseResponse): ReturnTypeAwaitPromiseResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeAwaitPromiseResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeAwaitPromiseResponseOps[Self <: ReturnTypeAwaitPromiseResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: AwaitPromiseRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[AwaitPromiseRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: AwaitPromiseResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
