package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.CreateBrowserContextRequest
import typings.devtoolsProtocol.mod.Protocol.Target.CreateBrowserContextResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeCreateBrowserContextResponse extends js.Object {
  
  var paramsType: js.Array[js.UndefOr[CreateBrowserContextRequest]] = js.native
  
  var returnType: CreateBrowserContextResponse = js.native
}
object ReturnTypeCreateBrowserContextResponse {
  
  @scala.inline
  def apply(
    paramsType: js.Array[js.UndefOr[CreateBrowserContextRequest]],
    returnType: CreateBrowserContextResponse
  ): ReturnTypeCreateBrowserContextResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCreateBrowserContextResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeCreateBrowserContextResponseOps[Self <: ReturnTypeCreateBrowserContextResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: js.UndefOr[CreateBrowserContextRequest]*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[CreateBrowserContextRequest]]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: CreateBrowserContextResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
