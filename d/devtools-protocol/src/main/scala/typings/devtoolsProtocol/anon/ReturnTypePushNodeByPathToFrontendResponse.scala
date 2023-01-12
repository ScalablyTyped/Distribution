package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.DOM.PushNodeByPathToFrontendRequest
import typings.devtoolsProtocol.mod.Protocol.DOM.PushNodeByPathToFrontendResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypePushNodeByPathToFrontendResponse extends StObject {
  
  var paramsType: js.Array[PushNodeByPathToFrontendRequest]
  
  var returnType: PushNodeByPathToFrontendResponse
}
object ReturnTypePushNodeByPathToFrontendResponse {
  
  inline def apply(
    paramsType: js.Array[PushNodeByPathToFrontendRequest],
    returnType: PushNodeByPathToFrontendResponse
  ): ReturnTypePushNodeByPathToFrontendResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypePushNodeByPathToFrontendResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReturnTypePushNodeByPathToFrontendResponse] (val x: Self) extends AnyVal {
    
    inline def setParamsType(value: js.Array[PushNodeByPathToFrontendRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: PushNodeByPathToFrontendRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: PushNodeByPathToFrontendResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
