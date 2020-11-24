package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseRequest
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeRequestDatabaseResponse extends js.Object {
  
  var paramsType: js.Array[RequestDatabaseRequest] = js.native
  
  var returnType: RequestDatabaseResponse = js.native
}
object ReturnTypeRequestDatabaseResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[RequestDatabaseRequest], returnType: RequestDatabaseResponse): ReturnTypeRequestDatabaseResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestDatabaseResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeRequestDatabaseResponseOps[Self <: ReturnTypeRequestDatabaseResponse] (val x: Self) extends AnyVal {
    
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
    def setParamsTypeVarargs(value: RequestDatabaseRequest*): Self = this.set("paramsType", js.Array(value :_*))
    
    @scala.inline
    def setParamsType(value: js.Array[RequestDatabaseRequest]): Self = this.set("paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnType(value: RequestDatabaseResponse): Self = this.set("returnType", value.asInstanceOf[js.Any])
  }
}
