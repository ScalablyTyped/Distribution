package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Profiler.StopResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeStopResponse extends StObject {
  
  var paramsType: js.Array[Any]
  
  var returnType: StopResponse
}
object ReturnTypeStopResponse {
  
  inline def apply(paramsType: js.Array[Any], returnType: StopResponse): ReturnTypeStopResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeStopResponse]
  }
  
  extension [Self <: ReturnTypeStopResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: Any*): Self = StObject.set(x, "paramsType", js.Array(value*))
    
    inline def setReturnType(value: StopResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
