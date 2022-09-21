package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDataRequest
import typings.devtoolsProtocol.mod.Protocol.IndexedDB.RequestDataResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeRequestDataResponse extends StObject {
  
  var paramsType: js.Array[RequestDataRequest]
  
  var returnType: RequestDataResponse
}
object ReturnTypeRequestDataResponse {
  
  inline def apply(paramsType: js.Array[RequestDataRequest], returnType: RequestDataResponse): ReturnTypeRequestDataResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeRequestDataResponse]
  }
  
  extension [Self <: ReturnTypeRequestDataResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[RequestDataRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: RequestDataRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: RequestDataResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
