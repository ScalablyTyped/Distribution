package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Browser.GetWindowForTargetRequest
import typings.devtoolsProtocol.mod.Protocol.Browser.GetWindowForTargetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetWindowForTargetResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[GetWindowForTargetRequest]]
  
  var returnType: GetWindowForTargetResponse
}
object ReturnTypeGetWindowForTargetResponse {
  
  inline def apply(
    paramsType: js.Array[js.UndefOr[GetWindowForTargetRequest]],
    returnType: GetWindowForTargetResponse
  ): ReturnTypeGetWindowForTargetResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetWindowForTargetResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypeGetWindowForTargetResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[js.UndefOr[GetWindowForTargetRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[GetWindowForTargetRequest]*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: GetWindowForTargetResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
