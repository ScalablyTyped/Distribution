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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeCreateStyleSheetResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[CreateStyleSheetRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: CreateStyleSheetRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: CreateStyleSheetResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
