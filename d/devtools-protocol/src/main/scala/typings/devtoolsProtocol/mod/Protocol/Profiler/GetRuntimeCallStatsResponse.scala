package typings.devtoolsProtocol.mod.Protocol.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetRuntimeCallStatsResponse extends StObject {
  
  /**
    * Collected runtime call counter information.
    */
  var result: js.Array[RuntimeCallCounterInfo] = js.native
}
object GetRuntimeCallStatsResponse {
  
  @scala.inline
  def apply(result: js.Array[RuntimeCallCounterInfo]): GetRuntimeCallStatsResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRuntimeCallStatsResponse]
  }
  
  @scala.inline
  implicit class GetRuntimeCallStatsResponseMutableBuilder[Self <: GetRuntimeCallStatsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: js.Array[RuntimeCallCounterInfo]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: RuntimeCallCounterInfo*): Self = StObject.set(x, "result", js.Array(value :_*))
  }
}
