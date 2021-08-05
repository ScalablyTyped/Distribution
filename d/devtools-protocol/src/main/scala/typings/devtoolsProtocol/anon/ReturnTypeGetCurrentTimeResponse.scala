package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Animation.GetCurrentTimeRequest
import typings.devtoolsProtocol.mod.Protocol.Animation.GetCurrentTimeResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeGetCurrentTimeResponse extends StObject {
  
  var paramsType: js.Array[GetCurrentTimeRequest]
  
  var returnType: GetCurrentTimeResponse
}
object ReturnTypeGetCurrentTimeResponse {
  
  inline def apply(paramsType: js.Array[GetCurrentTimeRequest], returnType: GetCurrentTimeResponse): ReturnTypeGetCurrentTimeResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeGetCurrentTimeResponse]
  }
  
  extension [Self <: ReturnTypeGetCurrentTimeResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[GetCurrentTimeRequest]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: GetCurrentTimeRequest*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: GetCurrentTimeResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
