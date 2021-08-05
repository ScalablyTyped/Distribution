package typings.devtoolsProtocol.mod.Protocol.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRuntimeCallStatsResponse extends StObject {
  
  /**
    * Collected runtime call counter information.
    */
  var result: js.Array[RuntimeCallCounterInfo]
}
object GetRuntimeCallStatsResponse {
  
  inline def apply(result: js.Array[RuntimeCallCounterInfo]): GetRuntimeCallStatsResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRuntimeCallStatsResponse]
  }
  
  extension [Self <: GetRuntimeCallStatsResponse](x: Self) {
    
    inline def setResult(value: js.Array[RuntimeCallCounterInfo]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: RuntimeCallCounterInfo*): Self = StObject.set(x, "result", js.Array(value :_*))
  }
}
