package typings.devtoolsProtocol.mod.Protocol.Profiler

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCountersResponse extends StObject {
  
  /**
    * Collected counters information.
    */
  var result: js.Array[CounterInfo]
}
object GetCountersResponse {
  
  inline def apply(result: js.Array[CounterInfo]): GetCountersResponse = {
    val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCountersResponse]
  }
  
  extension [Self <: GetCountersResponse](x: Self) {
    
    inline def setResult(value: js.Array[CounterInfo]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setResultVarargs(value: CounterInfo*): Self = StObject.set(x, "result", js.Array(value :_*))
  }
}
