package typings.devtoolsProtocol.mod.Protocol.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetCountersResponse extends StObject {
  
  /**
    * Collected counters information.
    */
  var result: js.Array[CounterInfo] = js.native
}
object GetCountersResponse {
  
  @scala.inline
  def apply(result: js.Array[CounterInfo]): GetCountersResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCountersResponse]
  }
  
  @scala.inline
  implicit class GetCountersResponseMutableBuilder[Self <: GetCountersResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResult(value: js.Array[CounterInfo]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultVarargs(value: CounterInfo*): Self = StObject.set(x, "result", js.Array(value :_*))
  }
}
