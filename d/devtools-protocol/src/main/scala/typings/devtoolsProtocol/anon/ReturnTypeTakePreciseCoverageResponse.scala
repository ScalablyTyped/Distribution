package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Profiler.TakePreciseCoverageResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeTakePreciseCoverageResponse extends StObject {
  
  var paramsType: js.Array[js.Any]
  
  var returnType: TakePreciseCoverageResponse
}
object ReturnTypeTakePreciseCoverageResponse {
  
  inline def apply(paramsType: js.Array[js.Any], returnType: TakePreciseCoverageResponse): ReturnTypeTakePreciseCoverageResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeTakePreciseCoverageResponse]
  }
  
  extension [Self <: ReturnTypeTakePreciseCoverageResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[js.Any]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.Any*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: TakePreciseCoverageResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
