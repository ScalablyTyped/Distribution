package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTrainedModelAssignmentTaskParameters extends StObject {
  
  var cache_size: ByteSize
  
  var model_bytes: integer
  
  var model_id: Id
  
  var number_of_allocations: integer
  
  var queue_capacity: integer
  
  var threads_per_allocation: integer
}
object MlTrainedModelAssignmentTaskParameters {
  
  inline def apply(
    cache_size: ByteSize,
    model_bytes: integer,
    model_id: Id,
    number_of_allocations: integer,
    queue_capacity: integer,
    threads_per_allocation: integer
  ): MlTrainedModelAssignmentTaskParameters = {
    val __obj = js.Dynamic.literal(cache_size = cache_size.asInstanceOf[js.Any], model_bytes = model_bytes.asInstanceOf[js.Any], model_id = model_id.asInstanceOf[js.Any], number_of_allocations = number_of_allocations.asInstanceOf[js.Any], queue_capacity = queue_capacity.asInstanceOf[js.Any], threads_per_allocation = threads_per_allocation.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTrainedModelAssignmentTaskParameters]
  }
  
  extension [Self <: MlTrainedModelAssignmentTaskParameters](x: Self) {
    
    inline def setCache_size(value: ByteSize): Self = StObject.set(x, "cache_size", value.asInstanceOf[js.Any])
    
    inline def setModel_bytes(value: integer): Self = StObject.set(x, "model_bytes", value.asInstanceOf[js.Any])
    
    inline def setModel_id(value: Id): Self = StObject.set(x, "model_id", value.asInstanceOf[js.Any])
    
    inline def setNumber_of_allocations(value: integer): Self = StObject.set(x, "number_of_allocations", value.asInstanceOf[js.Any])
    
    inline def setQueue_capacity(value: integer): Self = StObject.set(x, "queue_capacity", value.asInstanceOf[js.Any])
    
    inline def setThreads_per_allocation(value: integer): Self = StObject.set(x, "threads_per_allocation", value.asInstanceOf[js.Any])
  }
}
