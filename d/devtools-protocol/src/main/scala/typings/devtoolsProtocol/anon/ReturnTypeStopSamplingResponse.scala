package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.HeapProfiler.StopSamplingResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeStopSamplingResponse extends StObject {
  
  var paramsType: js.Array[Any]
  
  var returnType: StopSamplingResponse
}
object ReturnTypeStopSamplingResponse {
  
  inline def apply(paramsType: js.Array[Any], returnType: StopSamplingResponse): ReturnTypeStopSamplingResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeStopSamplingResponse]
  }
  
  extension [Self <: ReturnTypeStopSamplingResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: Any*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: StopSamplingResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
