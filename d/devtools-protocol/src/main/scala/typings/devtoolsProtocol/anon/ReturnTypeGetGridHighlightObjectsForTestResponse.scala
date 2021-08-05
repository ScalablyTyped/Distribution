package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.GetGridHighlightObjectsForTestRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.GetGridHighlightObjectsForTestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetGridHighlightObjectsForTestResponse extends StObject {
  
  var paramsType: js.Array[GetGridHighlightObjectsForTestRequest]
  
  var returnType: GetGridHighlightObjectsForTestResponse
}
object ReturnTypeGetGridHighlightObjectsForTestResponse {
  
  inline def apply(
    paramsType: js.Array[GetGridHighlightObjectsForTestRequest],
    returnType: GetGridHighlightObjectsForTestResponse
  ): ReturnTypeGetGridHighlightObjectsForTestResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetGridHighlightObjectsForTestResponse]
  }
  
  extension [Self <: ReturnTypeGetGridHighlightObjectsForTestResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetGridHighlightObjectsForTestRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetGridHighlightObjectsForTestRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: GetGridHighlightObjectsForTestResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
