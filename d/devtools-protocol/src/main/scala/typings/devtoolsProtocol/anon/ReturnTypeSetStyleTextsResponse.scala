package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.SetStyleTextsRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetStyleTextsResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeSetStyleTextsResponse extends StObject {
  
  var paramsType: js.Array[SetStyleTextsRequest]
  
  var returnType: SetStyleTextsResponse
}
object ReturnTypeSetStyleTextsResponse {
  
  inline def apply(paramsType: js.Array[SetStyleTextsRequest], returnType: SetStyleTextsResponse): ReturnTypeSetStyleTextsResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetStyleTextsResponse]
  }
  
  extension [Self <: ReturnTypeSetStyleTextsResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[SetStyleTextsRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetStyleTextsRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: SetStyleTextsResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
