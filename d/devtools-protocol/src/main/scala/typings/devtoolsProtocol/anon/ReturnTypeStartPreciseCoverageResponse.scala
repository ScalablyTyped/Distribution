package typings.devtoolsProtocol.anon

import typings.devtoolsProtocol.mod.Protocol.Profiler.StartPreciseCoverageRequest
import typings.devtoolsProtocol.mod.Protocol.Profiler.StartPreciseCoverageResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReturnTypeStartPreciseCoverageResponse extends StObject {
  
  var paramsType: js.Array[js.UndefOr[StartPreciseCoverageRequest]]
  
  var returnType: StartPreciseCoverageResponse
}
object ReturnTypeStartPreciseCoverageResponse {
  
  inline def apply(
    paramsType: js.Array[js.UndefOr[StartPreciseCoverageRequest]],
    returnType: StartPreciseCoverageResponse
  ): ReturnTypeStartPreciseCoverageResponse = {
    val __obj = js.Dynamic.literal(paramsType = paramsType.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReturnTypeStartPreciseCoverageResponse]
  }
  
  extension [Self <: ReturnTypeStartPreciseCoverageResponse](x: Self) {
    
    inline def setParamsType(value: js.Array[js.UndefOr[StartPreciseCoverageRequest]]): Self = StObject.set(x, "paramsType", value.asInstanceOf[js.Any])
    
    inline def setParamsTypeVarargs(value: js.UndefOr[StartPreciseCoverageRequest]*): Self = StObject.set(x, "paramsType", js.Array(value :_*))
    
    inline def setReturnType(value: StartPreciseCoverageResponse): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
  }
}
