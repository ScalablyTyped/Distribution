package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Debugger.SearchInContentRequest
import typings.devtoolsProtocol.mod.Protocol.Debugger.SearchInContentResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeSearchInContentResponse extends StObject {
  
  var paramsType: js.Array[SearchInContentRequest]
  
  var returnType: SearchInContentResponse
}
object ReturnTypeSearchInContentResponse {
  
  inline def apply(paramsType: js.Array[SearchInContentRequest], returnType: SearchInContentResponse): ReturnTypeSearchInContentResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSearchInContentResponse]
  }
  
  extension [Self <: ReturnTypeSearchInContentResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[SearchInContentRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SearchInContentRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: SearchInContentResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
