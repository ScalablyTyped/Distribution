package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Animation.ResolveAnimationRequest
import typings.devtoolsProtocol.mod.Protocol.Animation.ResolveAnimationResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeResolveAnimationResponse extends StObject {
  
  var paramsType: js.Array[ResolveAnimationRequest]
  
  var returnType: ResolveAnimationResponse
}
object ReturnTypeResolveAnimationResponse {
  
  inline def apply(paramsType: js.Array[ResolveAnimationRequest], returnType: ResolveAnimationResponse): ReturnTypeResolveAnimationResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeResolveAnimationResponse]
  }
  
  extension [Self <: ReturnTypeResolveAnimationResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[ResolveAnimationRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: ResolveAnimationRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: ResolveAnimationResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
