package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.SetContainerQueryTextRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetContainerQueryTextResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeSetContainerQueryTextResponse extends StObject {
  
  var paramsType: js.Array[SetContainerQueryTextRequest]
  
  var returnType: SetContainerQueryTextResponse
}
object ReturnTypeSetContainerQueryTextResponse {
  
  inline def apply(paramsType: js.Array[SetContainerQueryTextRequest], returnType: SetContainerQueryTextResponse): ReturnTypeSetContainerQueryTextResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetContainerQueryTextResponse]
  }
  
  extension [Self <: ReturnTypeSetContainerQueryTextResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[SetContainerQueryTextRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetContainerQueryTextRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: SetContainerQueryTextResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
