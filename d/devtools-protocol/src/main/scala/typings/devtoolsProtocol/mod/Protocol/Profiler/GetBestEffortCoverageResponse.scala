package typings.devtoolsProtocol.mod.Protocol.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBestEffortCoverageResponse extends StObject {
  
  /**
    * Coverage data for the current isolate.
    */
  var result: js.Array[ScriptCoverage] = js.native
}
object GetBestEffortCoverageResponse {
  
  @scala.inline
  def apply(result: js.Array[ScriptCoverage]): GetBestEffortCoverageResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBestEffortCoverageResponse]
  }
  
  @scala.inline
  implicit class GetBestEffortCoverageResponseMutableBuilder[Self <: GetBestEffortCoverageResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: js.Array[ScriptCoverage]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: ScriptCoverage*): Self = StObject.set(x, "result", js.Array(value :_*))
  }
}
