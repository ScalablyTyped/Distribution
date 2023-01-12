package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Database.ExecuteSQLRequest
import typings.devtoolsProtocol.mod.Protocol.Database.ExecuteSQLResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeExecuteSQLResponse extends StObject {
  
  var paramsType: js.Array[ExecuteSQLRequest]
  
  var returnType: ExecuteSQLResponse
}
object ReturnTypeExecuteSQLResponse {
  
  inline def apply(paramsType: js.Array[ExecuteSQLRequest], returnType: ExecuteSQLResponse): ReturnTypeExecuteSQLResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeExecuteSQLResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeExecuteSQLResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[ExecuteSQLRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ExecuteSQLRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: ExecuteSQLResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
