package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.SetStyleSheetTextRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetStyleSheetTextResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeSetStyleSheetTextResponse extends StObject {
  
  var paramsType: js.Array[SetStyleSheetTextRequest]
  
  var returnType: SetStyleSheetTextResponse
}
object ReturnTypeSetStyleSheetTextResponse {
  
  inline def apply(paramsType: js.Array[SetStyleSheetTextRequest], returnType: SetStyleSheetTextResponse): ReturnTypeSetStyleSheetTextResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetStyleSheetTextResponse]
  }
  
  extension [Self <: ReturnTypeSetStyleSheetTextResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[SetStyleSheetTextRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetStyleSheetTextRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: SetStyleSheetTextResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
