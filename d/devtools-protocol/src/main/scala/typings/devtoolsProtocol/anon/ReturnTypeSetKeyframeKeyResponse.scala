package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.CSS.SetKeyframeKeyRequest
import typings.devtoolsProtocol.mod.Protocol.CSS.SetKeyframeKeyResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeSetKeyframeKeyResponse extends StObject {
  
  var paramsType: js.Array[SetKeyframeKeyRequest]
  
  var returnType: SetKeyframeKeyResponse
}
object ReturnTypeSetKeyframeKeyResponse {
  
  inline def apply(paramsType: js.Array[SetKeyframeKeyRequest], returnType: SetKeyframeKeyResponse): ReturnTypeSetKeyframeKeyResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeSetKeyframeKeyResponse]
  }
  
  extension [Self <: ReturnTypeSetKeyframeKeyResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[SetKeyframeKeyRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: SetKeyframeKeyRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: SetKeyframeKeyResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
