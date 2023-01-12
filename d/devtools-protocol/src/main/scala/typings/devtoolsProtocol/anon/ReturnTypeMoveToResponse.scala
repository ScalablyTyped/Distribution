package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.MoveToRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.MoveToResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeMoveToResponse extends StObject {
  
  var paramsType: js.Array[MoveToRequest]
  
  var returnType: MoveToResponse
}
object ReturnTypeMoveToResponse {
  
  inline def apply(paramsType: js.Array[MoveToRequest], returnType: MoveToResponse): ReturnTypeMoveToResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeMoveToResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeMoveToResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[MoveToRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: MoveToRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: MoveToResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
