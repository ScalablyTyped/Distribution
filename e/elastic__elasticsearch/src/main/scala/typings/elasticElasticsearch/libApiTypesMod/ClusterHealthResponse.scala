package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterHealthResponse extends StObject {
  
  var active_primary_shards: integer
  
  var active_shards: integer
  
  var active_shards_percent_as_number: Percentage
  
  var cluster_name: Name
  
  var delayed_unassigned_shards: integer
  
  var indices: js.UndefOr[Record[IndexName, ClusterHealthIndexHealthStats]] = js.undefined
  
  var initializing_shards: integer
  
  var number_of_data_nodes: integer
  
  var number_of_in_flight_fetch: integer
  
  var number_of_nodes: integer
  
  var number_of_pending_tasks: integer
  
  var relocating_shards: integer
  
  var status: HealthStatus
  
  var task_max_waiting_in_queue: js.UndefOr[Duration] = js.undefined
  
  var task_max_waiting_in_queue_millis: DurationValue[UnitMillis]
  
  var timed_out: Boolean
  
  var unassigned_shards: integer
}
object ClusterHealthResponse {
  
  inline def apply(
    active_primary_shards: integer,
    active_shards: integer,
    active_shards_percent_as_number: Percentage,
    cluster_name: Name,
    delayed_unassigned_shards: integer,
    initializing_shards: integer,
    number_of_data_nodes: integer,
    number_of_in_flight_fetch: integer,
    number_of_nodes: integer,
    number_of_pending_tasks: integer,
    relocating_shards: integer,
    status: HealthStatus,
    task_max_waiting_in_queue_millis: DurationValue[UnitMillis],
    timed_out: Boolean,
    unassigned_shards: integer
  ): ClusterHealthResponse = {
    val __obj = js.Dynamic.literal(active_primary_shards = active_primary_shards.asInstanceOf[js.Any], active_shards = active_shards.asInstanceOf[js.Any], active_shards_percent_as_number = active_shards_percent_as_number.asInstanceOf[js.Any], cluster_name = cluster_name.asInstanceOf[js.Any], delayed_unassigned_shards = delayed_unassigned_shards.asInstanceOf[js.Any], initializing_shards = initializing_shards.asInstanceOf[js.Any], number_of_data_nodes = number_of_data_nodes.asInstanceOf[js.Any], number_of_in_flight_fetch = number_of_in_flight_fetch.asInstanceOf[js.Any], number_of_nodes = number_of_nodes.asInstanceOf[js.Any], number_of_pending_tasks = number_of_pending_tasks.asInstanceOf[js.Any], relocating_shards = relocating_shards.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], task_max_waiting_in_queue_millis = task_max_waiting_in_queue_millis.asInstanceOf[js.Any], timed_out = timed_out.asInstanceOf[js.Any], unassigned_shards = unassigned_shards.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClusterHealthResponse]
  }
  
  extension [Self <: ClusterHealthResponse](x: Self) {
    
    inline def setActive_primary_shards(value: integer): Self = StObject.set(x, "active_primary_shards", value.asInstanceOf[js.Any])
    
    inline def setActive_shards(value: integer): Self = StObject.set(x, "active_shards", value.asInstanceOf[js.Any])
    
    inline def setActive_shards_percent_as_number(value: Percentage): Self = StObject.set(x, "active_shards_percent_as_number", value.asInstanceOf[js.Any])
    
    inline def setCluster_name(value: Name): Self = StObject.set(x, "cluster_name", value.asInstanceOf[js.Any])
    
    inline def setDelayed_unassigned_shards(value: integer): Self = StObject.set(x, "delayed_unassigned_shards", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: Record[IndexName, ClusterHealthIndexHealthStats]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setInitializing_shards(value: integer): Self = StObject.set(x, "initializing_shards", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_data_nodes(value: integer): Self = StObject.set(x, "number_of_data_nodes", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_in_flight_fetch(value: integer): Self = StObject.set(x, "number_of_in_flight_fetch", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_nodes(value: integer): Self = StObject.set(x, "number_of_nodes", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_pending_tasks(value: integer): Self = StObject.set(x, "number_of_pending_tasks", value.asInstanceOf[js.Any])
    
    inline def setRelocating_shards(value: integer): Self = StObject.set(x, "relocating_shards", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: HealthStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTask_max_waiting_in_queue(value: Duration): Self = StObject.set(x, "task_max_waiting_in_queue", value.asInstanceOf[js.Any])
    
    inline def setTask_max_waiting_in_queueUndefined: Self = StObject.set(x, "task_max_waiting_in_queue", js.undefined)
    
    inline def setTask_max_waiting_in_queue_millis(value: DurationValue[UnitMillis]): Self = StObject.set(x, "task_max_waiting_in_queue_millis", value.asInstanceOf[js.Any])
    
    inline def setTimed_out(value: Boolean): Self = StObject.set(x, "timed_out", value.asInstanceOf[js.Any])
    
    inline def setUnassigned_shards(value: integer): Self = StObject.set(x, "unassigned_shards", value.asInstanceOf[js.Any])
  }
}
