package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.GetBackgroundColorsRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetBackgroundColorsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetBackgroundColorsResponse extends StObject {
  
  var paramsType: js.Array[GetBackgroundColorsRequest]
  
  var returnType: GetBackgroundColorsResponse
}
object ReturnTypeGetBackgroundColorsResponse {
  
  inline def apply(paramsType: js.Array[GetBackgroundColorsRequest], returnType: GetBackgroundColorsResponse): ReturnTypeGetBackgroundColorsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetBackgroundColorsResponse]
  }
  
  extension [Self <: ReturnTypeGetBackgroundColorsResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetBackgroundColorsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetBackgroundColorsRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetBackgroundColorsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
