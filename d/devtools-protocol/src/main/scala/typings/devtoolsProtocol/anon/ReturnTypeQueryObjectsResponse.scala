package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Runtime.QueryObjectsRequest
import typings.devtoolsProtocol.mod.Protocol.Runtime.QueryObjectsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeQueryObjectsResponse extends StObject {
  
  var paramsType: js.Array[QueryObjectsRequest]
  
  var returnType: QueryObjectsResponse
}
object ReturnTypeQueryObjectsResponse {
  
  inline def apply(paramsType: js.Array[QueryObjectsRequest], returnType: QueryObjectsResponse): ReturnTypeQueryObjectsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeQueryObjectsResponse]
  }
  
  extension [Self <: ReturnTypeQueryObjectsResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[QueryObjectsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: QueryObjectsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: QueryObjectsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
