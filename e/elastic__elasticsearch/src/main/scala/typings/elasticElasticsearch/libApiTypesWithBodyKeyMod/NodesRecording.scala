package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesRecording extends StObject {
  
  var cumulative_execution_count: js.UndefOr[long] = js.undefined
  
  var cumulative_execution_time: js.UndefOr[Duration] = js.undefined
  
  var cumulative_execution_time_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
}
object NodesRecording {
  
  inline def apply(): NodesRecording = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodesRecording]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesRecording] (val x: Self) extends AnyVal {
    
    inline def setCumulative_execution_count(value: long): Self = StObject.set(x, "cumulative_execution_count", value.asInstanceOf[js.Any])
    
    inline def setCumulative_execution_countUndefined: Self = StObject.set(x, "cumulative_execution_count", js.undefined)
    
    inline def setCumulative_execution_time(value: Duration): Self = StObject.set(x, "cumulative_execution_time", value.asInstanceOf[js.Any])
    
    inline def setCumulative_execution_timeUndefined: Self = StObject.set(x, "cumulative_execution_time", js.undefined)
    
    inline def setCumulative_execution_time_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "cumulative_execution_time_millis", value.asInstanceOf[js.Any])
    
    inline def setCumulative_execution_time_millisUndefined: Self = StObject.set(x, "cumulative_execution_time_millis", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
