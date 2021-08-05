package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseNamesRequest
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseNamesResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeRequestDatabaseNamesResponse extends StObject {
  
  var paramsType: js.Array[RequestDatabaseNamesRequest]
  
  var returnType: RequestDatabaseNamesResponse
}
object ReturnTypeRequestDatabaseNamesResponse {
  
  inline def apply(paramsType: js.Array[RequestDatabaseNamesRequest], returnType: RequestDatabaseNamesResponse): ReturnTypeRequestDatabaseNamesResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestDatabaseNamesResponse]
  }
  
  extension [Self <: ReturnTypeRequestDatabaseNamesResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[RequestDatabaseNamesRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RequestDatabaseNamesRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: RequestDatabaseNamesResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
