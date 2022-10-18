package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterPendingTasksPendingTask extends StObject {
  
  var executing: Boolean
  
  var insert_order: integer
  
  var priority: String
  
  var source: String
  
  var time_in_queue: js.UndefOr[Duration] = js.undefined
  
  var time_in_queue_millis: DurationValue[UnitMillis]
}
object ClusterPendingTasksPendingTask {
  
  inline def apply(
    executing: Boolean,
    insert_order: integer,
    priority: String,
    source: String,
    time_in_queue_millis: DurationValue[UnitMillis]
  ): ClusterPendingTasksPendingTask = {
    val __obj = js.Dynamic.literal(executing = executing.asInstanceOf[js.Any], insert_order = insert_order.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time_in_queue_millis = time_in_queue_millis.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterPendingTasksPendingTask]
  }
  
  extension [Self <: ClusterPendingTasksPendingTask](x: Self) {
    
    inline def setExecuting(value: Boolean): Self = StObject.set(x, "executing", value.asInstanceOf[js.Any])
    
    inline def setInsert_order(value: integer): Self = StObject.set(x, "insert_order", value.asInstanceOf[js.Any])
    
    inline def setPriority(value: String): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setTime_in_queue(value: Duration): Self = StObject.set(x, "time_in_queue", value.asInstanceOf[js.Any])
    
    inline def setTime_in_queueUndefined: Self = StObject.set(x, "time_in_queue", js.undefined)
    
    inline def setTime_in_queue_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "time_in_queue_millis", value.asInstanceOf[js.Any])
  }
}
