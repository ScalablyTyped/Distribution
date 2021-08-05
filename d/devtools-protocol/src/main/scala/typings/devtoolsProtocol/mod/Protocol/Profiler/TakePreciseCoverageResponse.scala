package typings.devtoolsProtocol.mod.Protocol.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TakePreciseCoverageResponse extends StObject {
  
  /**
    * Coverage data for the current isolate.
    */
  var result: js.Array[ScriptCoverage]
  
  /**
    * Monotonically increasing time (in seconds) when the coverage update was taken in the backend.
    */
  var timestamp: Double
}
object TakePreciseCoverageResponse {
  
  inline def apply(result: js.Array[ScriptCoverage], timestamp: Double): TakePreciseCoverageResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[TakePreciseCoverageResponse]
  }
  
  extension [Self <: TakePreciseCoverageResponse](x: Self) {
    
    inline def setResult(value: js.Array[ScriptCoverage]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: ScriptCoverage*): Self = StObject.set(x, "result", js.Array(value :_*))
    
    inline def setTimestamp(value: Double): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
