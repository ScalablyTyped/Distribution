package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReindexRethrottleReindexTask extends StObject {
  
  var action: String
  
  var cancellable: Boolean
  
  var description: String
  
  var headers: HttpHeaders
  
  var id: long
  
  var node: Name
  
  var running_time_in_nanos: DurationValue[UnitNanos]
  
  var start_time_in_millis: EpochTime[UnitMillis]
  
  var status: ReindexRethrottleReindexStatus
  
  var `type`: String
}
object ReindexRethrottleReindexTask {
  
  inline def apply(
    action: String,
    cancellable: Boolean,
    description: String,
    headers: HttpHeaders,
    id: long,
    node: Name,
    running_time_in_nanos: DurationValue[UnitNanos],
    start_time_in_millis: EpochTime[UnitMillis],
    status: ReindexRethrottleReindexStatus,
    `type`: String
  ): ReindexRethrottleReindexTask = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], cancellable = cancellable.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], running_time_in_nanos = running_time_in_nanos.asInstanceOf[js.Any], start_time_in_millis = start_time_in_millis.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReindexRethrottleReindexTask]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReindexRethrottleReindexTask] (val x: Self) extends AnyVal {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setCancellable(value: Boolean): Self = StObject.set(x, "cancellable", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setId(value: long): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode(value: Name): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setRunning_time_in_nanos(value: DurationValue[UnitNanos]): Self = StObject.set(x, "running_time_in_nanos", value.asInstanceOf[js.Any])
    
    inline def setStart_time_in_millis(value: EpochTime[UnitMillis]): Self = StObject.set(x, "start_time_in_millis", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ReindexRethrottleReindexStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
