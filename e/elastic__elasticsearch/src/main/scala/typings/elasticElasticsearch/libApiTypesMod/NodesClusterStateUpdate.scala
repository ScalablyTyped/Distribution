package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesClusterStateUpdate extends StObject {
  
  var commit_time: js.UndefOr[Duration] = js.undefined
  
  var commit_time_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
  
  var completion_time: js.UndefOr[Duration] = js.undefined
  
  var completion_time_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
  
  var computation_time: js.UndefOr[Duration] = js.undefined
  
  var computation_time_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
  
  var context_construction_time: js.UndefOr[Duration] = js.undefined
  
  var context_construction_time_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
  
  var count: long
  
  var master_apply_time: js.UndefOr[Duration] = js.undefined
  
  var master_apply_time_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
  
  var notification_time: js.UndefOr[Duration] = js.undefined
  
  var notification_time_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
  
  var publication_time: js.UndefOr[Duration] = js.undefined
  
  var publication_time_millis: js.UndefOr[DurationValue[UnitMillis]] = js.undefined
}
object NodesClusterStateUpdate {
  
  inline def apply(count: long): NodesClusterStateUpdate = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesClusterStateUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodesClusterStateUpdate] (val x: Self) extends AnyVal {
    
    inline def setCommit_time(value: Duration): Self = StObject.set(x, "commit_time", value.asInstanceOf[js.Any])
    
    inline def setCommit_timeUndefined: Self = StObject.set(x, "commit_time", js.undefined)
    
    inline def setCommit_time_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "commit_time_millis", value.asInstanceOf[js.Any])
    
    inline def setCommit_time_millisUndefined: Self = StObject.set(x, "commit_time_millis", js.undefined)
    
    inline def setCompletion_time(value: Duration): Self = StObject.set(x, "completion_time", value.asInstanceOf[js.Any])
    
    inline def setCompletion_timeUndefined: Self = StObject.set(x, "completion_time", js.undefined)
    
    inline def setCompletion_time_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "completion_time_millis", value.asInstanceOf[js.Any])
    
    inline def setCompletion_time_millisUndefined: Self = StObject.set(x, "completion_time_millis", js.undefined)
    
    inline def setComputation_time(value: Duration): Self = StObject.set(x, "computation_time", value.asInstanceOf[js.Any])
    
    inline def setComputation_timeUndefined: Self = StObject.set(x, "computation_time", js.undefined)
    
    inline def setComputation_time_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "computation_time_millis", value.asInstanceOf[js.Any])
    
    inline def setComputation_time_millisUndefined: Self = StObject.set(x, "computation_time_millis", js.undefined)
    
    inline def setContext_construction_time(value: Duration): Self = StObject.set(x, "context_construction_time", value.asInstanceOf[js.Any])
    
    inline def setContext_construction_timeUndefined: Self = StObject.set(x, "context_construction_time", js.undefined)
    
    inline def setContext_construction_time_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "context_construction_time_millis", value.asInstanceOf[js.Any])
    
    inline def setContext_construction_time_millisUndefined: Self = StObject.set(x, "context_construction_time_millis", js.undefined)
    
    inline def setCount(value: long): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setMaster_apply_time(value: Duration): Self = StObject.set(x, "master_apply_time", value.asInstanceOf[js.Any])
    
    inline def setMaster_apply_timeUndefined: Self = StObject.set(x, "master_apply_time", js.undefined)
    
    inline def setMaster_apply_time_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "master_apply_time_millis", value.asInstanceOf[js.Any])
    
    inline def setMaster_apply_time_millisUndefined: Self = StObject.set(x, "master_apply_time_millis", js.undefined)
    
    inline def setNotification_time(value: Duration): Self = StObject.set(x, "notification_time", value.asInstanceOf[js.Any])
    
    inline def setNotification_timeUndefined: Self = StObject.set(x, "notification_time", js.undefined)
    
    inline def setNotification_time_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "notification_time_millis", value.asInstanceOf[js.Any])
    
    inline def setNotification_time_millisUndefined: Self = StObject.set(x, "notification_time_millis", js.undefined)
    
    inline def setPublication_time(value: Duration): Self = StObject.set(x, "publication_time", value.asInstanceOf[js.Any])
    
    inline def setPublication_timeUndefined: Self = StObject.set(x, "publication_time", js.undefined)
    
    inline def setPublication_time_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "publication_time_millis", value.asInstanceOf[js.Any])
    
    inline def setPublication_time_millisUndefined: Self = StObject.set(x, "publication_time_millis", js.undefined)
  }
}
