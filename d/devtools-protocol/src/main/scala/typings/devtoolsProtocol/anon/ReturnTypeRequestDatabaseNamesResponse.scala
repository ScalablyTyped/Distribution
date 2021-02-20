package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseNamesRequest
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseNamesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeRequestDatabaseNamesResponse extends StObject {
  
  var paramsType: js.Array[RequestDatabaseNamesRequest] = js.native
  
  var returnType: RequestDatabaseNamesResponse = js.native
}
object ReturnTypeRequestDatabaseNamesResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[RequestDatabaseNamesRequest], returnType: RequestDatabaseNamesResponse): ReturnTypeRequestDatabaseNamesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestDatabaseNamesResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeRequestDatabaseNamesResponseMutableBuilder[Self <: ReturnTypeRequestDatabaseNamesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[RequestDatabaseNamesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: RequestDatabaseNamesRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: RequestDatabaseNamesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
