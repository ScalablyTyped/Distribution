package typings.devtoolsProtocol.mod.Protocol.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBestEffortCoverageResponse extends StObject {
  
  /**
    * Coverage data for the current isolate.
    */
  var result: js.Array[ScriptCoverage]
}
object GetBestEffortCoverageResponse {
  
  inline def apply(result: js.Array[ScriptCoverage]): GetBestEffortCoverageResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBestEffortCoverageResponse]
  }
  
  extension [Self <: GetBestEffortCoverageResponse](x: Self) {
    
    inline def setResult(value: js.Array[ScriptCoverage]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: ScriptCoverage*): Self = StObject.set(x, "result", js.Array(value*))
  }
}
