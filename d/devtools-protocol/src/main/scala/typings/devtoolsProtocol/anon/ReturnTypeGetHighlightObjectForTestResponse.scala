package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Overlay.GetHighlightObjectForTestRequest
import typings.devtoolsProtocol.mod.Protocol.Overlay.GetHighlightObjectForTestResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetHighlightObjectForTestResponse extends StObject {
  
  var paramsType: js.Array[GetHighlightObjectForTestRequest]
  
  var returnType: GetHighlightObjectForTestResponse
}
object ReturnTypeGetHighlightObjectForTestResponse {
  
  inline def apply(
    paramsType: js.Array[GetHighlightObjectForTestRequest],
    returnType: GetHighlightObjectForTestResponse
  ): ReturnTypeGetHighlightObjectForTestResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetHighlightObjectForTestResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetHighlightObjectForTestResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[GetHighlightObjectForTestRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetHighlightObjectForTestRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetHighlightObjectForTestResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
