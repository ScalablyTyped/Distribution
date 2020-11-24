package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Accessibility.QueryAXTreeRequest
import typings.devtoolsProtocol.mod.Protocol.Accessibility.QueryAXTreeResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeQueryAXTreeResponse extends js.Object {
  
  var paramsType: js.Array[js.UndefOr[QueryAXTreeRequest]] = js.native
  
  var returnType: QueryAXTreeResponse = js.native
}
object ReturnTypeQueryAXTreeResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[js.UndefOr[QueryAXTreeRequest]], returnType: QueryAXTreeResponse): ReturnTypeQueryAXTreeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeQueryAXTreeResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeQueryAXTreeResponseOps[Self <: ReturnTypeQueryAXTreeResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: js.UndefOr[QueryAXTreeRequest]*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[js.UndefOr[QueryAXTreeRequest]]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: QueryAXTreeResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
