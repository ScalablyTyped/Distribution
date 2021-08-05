package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.CreateStyleSheetRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.CreateStyleSheetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeCreateStyleSheetResponse extends StObject {
  
  var paramsType: js.Array[CreateStyleSheetRequest]
  
  var returnType: CreateStyleSheetResponse
}
object ReturnTypeCreateStyleSheetResponse {
  
  inline def apply(paramsType: js.Array[CreateStyleSheetRequest], returnType: CreateStyleSheetResponse): ReturnTypeCreateStyleSheetResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCreateStyleSheetResponse]
  }
  
  extension [Self <: ReturnTypeCreateStyleSheetResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[CreateStyleSheetRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: CreateStyleSheetRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: CreateStyleSheetResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
