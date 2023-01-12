package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.CloseTargetRequest
import typings.devtoolsProtocol.mod.Protocol.Target.CloseTargetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeCloseTargetResponse extends StObject {
  
  var paramsType: js.Array[CloseTargetRequest]
  
  var returnType: CloseTargetResponse
}
object ReturnTypeCloseTargetResponse {
  
  inline def apply(paramsType: js.Array[CloseTargetRequest], returnType: CloseTargetResponse): ReturnTypeCloseTargetResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeCloseTargetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeCloseTargetResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[CloseTargetRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: CloseTargetRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: CloseTargetResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
