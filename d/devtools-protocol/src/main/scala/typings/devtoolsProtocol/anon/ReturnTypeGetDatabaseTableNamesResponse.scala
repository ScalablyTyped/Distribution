package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Database.GetDatabaseTableNamesRequest
import typings.devtoolsProtocol.mod.Protocol.Database.GetDatabaseTableNamesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReturnTypeGetDatabaseTableNamesResponse extends StObject {
  
  var paramsType: js.Array[GetDatabaseTableNamesRequest] = js.native
  
  var returnType: GetDatabaseTableNamesResponse = js.native
}
object ReturnTypeGetDatabaseTableNamesResponse {
  
  @scala.inline
  def apply(paramsType: js.Array[GetDatabaseTableNamesRequest], returnType: GetDatabaseTableNamesResponse): ReturnTypeGetDatabaseTableNamesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetDatabaseTableNamesResponse]
  }
  
  @scala.inline
  implicit class ReturnTypeGetDatabaseTableNamesResponseMutableBuilder[Self <: ReturnTypeGetDatabaseTableNamesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParamsType(value: js.Array[GetDatabaseTableNamesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsTypeVarargs(value: GetDatabaseTableNamesRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    @scala.inline
    def setReturnType(value: GetDatabaseTableNamesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
