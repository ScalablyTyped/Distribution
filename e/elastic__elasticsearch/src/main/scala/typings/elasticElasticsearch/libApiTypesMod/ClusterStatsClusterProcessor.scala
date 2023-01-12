package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterStatsClusterProcessor extends StObject {
  
  var count: long
  
  var current: long
  
  var failed: long
  
  var time: js.UndefOr[Duration] = js.undefined
  
  var time_in_millis: DurationValue[UnitMillis]
}
object ClusterStatsClusterProcessor {
  
  inline def apply(count: long, current: long, failed: long, time_in_millis: DurationValue[UnitMillis]): ClusterStatsClusterProcessor = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], failed = failed.asInstanceOf[js.Any], time_in_millis = time_in_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterStatsClusterProcessor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterStatsClusterProcessor] (val x: Self) extends AnyVal {
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCurrent(value: long): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    inline def setFailed(value: long): Self = StObject.set(x, "failed", value.asInstanceOf[js.Any])
    
    inline def setTime(value: Duration): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTime_in_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "time_in_millis", value.asInstanceOf[js.Any])
  }
}
