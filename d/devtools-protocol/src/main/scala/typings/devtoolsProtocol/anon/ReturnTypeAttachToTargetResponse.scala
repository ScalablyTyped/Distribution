package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Target.AttachToTargetRequest
import typings.devtoolsProtocol.mod.Protocol.Target.AttachToTargetResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeAttachToTargetResponse extends StObject {
  
  var paramsType: js.Array[AttachToTargetRequest]
  
  var returnType: AttachToTargetResponse
}
object ReturnTypeAttachToTargetResponse {
  
  inline def apply(paramsType: js.Array[AttachToTargetRequest], returnType: AttachToTargetResponse): ReturnTypeAttachToTargetResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeAttachToTargetResponse]
  }
  
  extension [Self <: ReturnTypeAttachToTargetResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[AttachToTargetRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: AttachToTargetRequest*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: AttachToTargetResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
