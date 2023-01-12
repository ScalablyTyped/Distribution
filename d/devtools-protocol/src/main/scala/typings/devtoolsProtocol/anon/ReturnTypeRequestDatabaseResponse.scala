package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseRequest
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDatabaseResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeRequestDatabaseResponse extends StObject {
  
  var paramsType: js.Array[RequestDatabaseRequest]
  
  var returnType: RequestDatabaseResponse
}
object ReturnTypeRequestDatabaseResponse {
  
  inline def apply(paramsType: js.Array[RequestDatabaseRequest], returnType: RequestDatabaseResponse): ReturnTypeRequestDatabaseResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestDatabaseResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeRequestDatabaseResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[RequestDatabaseRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RequestDatabaseRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: RequestDatabaseResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
