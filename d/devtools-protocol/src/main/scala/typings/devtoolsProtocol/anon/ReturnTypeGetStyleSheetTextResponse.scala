package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.GetStyleSheetTextRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.GetStyleSheetTextResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetStyleSheetTextResponse extends StObject {
  
  var paramsType: js.Array[GetStyleSheetTextRequest]
  
  var returnType: GetStyleSheetTextResponse
}
object ReturnTypeGetStyleSheetTextResponse {
  
  inline def apply(paramsType: js.Array[GetStyleSheetTextRequest], returnType: GetStyleSheetTextResponse): ReturnTypeGetStyleSheetTextResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetStyleSheetTextResponse]
  }
  
  extension [Self <: ReturnTypeGetStyleSheetTextResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetStyleSheetTextRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetStyleSheetTextRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: GetStyleSheetTextResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
