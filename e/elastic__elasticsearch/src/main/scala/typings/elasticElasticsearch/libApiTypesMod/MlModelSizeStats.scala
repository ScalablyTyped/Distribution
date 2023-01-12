package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlModelSizeStats extends StObject {
  
  var assignment_memory_basis: js.UndefOr[String] = js.undefined
  
  var bucket_allocation_failures_count: long
  
  var categorization_status: MlCategorizationStatus
  
  var categorized_doc_count: integer
  
  var dead_category_count: integer
  
  var failed_category_count: integer
  
  var frequent_category_count: integer
  
  var job_id: Id
  
  var log_time: DateTime
  
  var memory_status: MlMemoryStatus
  
  var model_bytes: ByteSize
  
  var model_bytes_exceeded: js.UndefOr[ByteSize] = js.undefined
  
  var model_bytes_memory_limit: js.UndefOr[ByteSize] = js.undefined
  
  var peak_model_bytes: js.UndefOr[ByteSize] = js.undefined
  
  var rare_category_count: integer
  
  var result_type: String
  
  var timestamp: js.UndefOr[long] = js.undefined
  
  var total_by_field_count: long
  
  var total_category_count: integer
  
  var total_over_field_count: long
  
  var total_partition_field_count: long
}
object MlModelSizeStats {
  
  inline def apply(
    bucket_allocation_failures_count: long,
    categorization_status: MlCategorizationStatus,
    categorized_doc_count: integer,
    dead_category_count: integer,
    failed_category_count: integer,
    frequent_category_count: integer,
    job_id: Id,
    log_time: DateTime,
    memory_status: MlMemoryStatus,
    model_bytes: ByteSize,
    rare_category_count: integer,
    result_type: String,
    total_by_field_count: long,
    total_category_count: integer,
    total_over_field_count: long,
    total_partition_field_count: long
  ): MlModelSizeStats = {
    val __obj = js.Dynamic.literal(bucket_allocation_failures_count = bucket_allocation_failures_count.asInstanceOf[js.Any], categorization_status = categorization_status.asInstanceOf[js.Any], categorized_doc_count = categorized_doc_count.asInstanceOf[js.Any], dead_category_count = dead_category_count.asInstanceOf[js.Any], failed_category_count = failed_category_count.asInstanceOf[js.Any], frequent_category_count = frequent_category_count.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], log_time = log_time.asInstanceOf[js.Any], memory_status = memory_status.asInstanceOf[js.Any], model_bytes = model_bytes.asInstanceOf[js.Any], rare_category_count = rare_category_count.asInstanceOf[js.Any], result_type = result_type.asInstanceOf[js.Any], total_by_field_count = total_by_field_count.asInstanceOf[js.Any], total_category_count = total_category_count.asInstanceOf[js.Any], total_over_field_count = total_over_field_count.asInstanceOf[js.Any], total_partition_field_count = total_partition_field_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlModelSizeStats]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlModelSizeStats] (val x: Self) extends AnyVal {
    
    inline def setAssignment_memory_basis(value: String): Self = StObject.set(x, "assignment_memory_basis", value.asInstanceOf[js.Any])
    
    inline def setAssignment_memory_basisUndefined: Self = StObject.set(x, "assignment_memory_basis", js.undefined)
    
    inline def setBucket_allocation_failures_count(value: long): Self = StObject.set(x, "bucket_allocation_failures_count", value.asInstanceOf[js.Any])
    
    inline def setCategorization_status(value: MlCategorizationStatus): Self = StObject.set(x, "categorization_status", value.asInstanceOf[js.Any])
    
    inline def setCategorized_doc_count(value: integer): Self = StObject.set(x, "categorized_doc_count", value.asInstanceOf[js.Any])
    
    inline def setDead_category_count(value: integer): Self = StObject.set(x, "dead_category_count", value.asInstanceOf[js.Any])
    
    inline def setFailed_category_count(value: integer): Self = StObject.set(x, "failed_category_count", value.asInstanceOf[js.Any])
    
    inline def setFrequent_category_count(value: integer): Self = StObject.set(x, "frequent_category_count", value.asInstanceOf[js.Any])
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setLog_time(value: DateTime): Self = StObject.set(x, "log_time", value.asInstanceOf[js.Any])
    
    inline def setMemory_status(value: MlMemoryStatus): Self = StObject.set(x, "memory_status", value.asInstanceOf[js.Any])
    
    inline def setModel_bytes(value: ByteSize): Self = StObject.set(x, "model_bytes", value.asInstanceOf[js.Any])
    
    inline def setModel_bytes_exceeded(value: ByteSize): Self = StObject.set(x, "model_bytes_exceeded", value.asInstanceOf[js.Any])
    
    inline def setModel_bytes_exceededUndefined: Self = StObject.set(x, "model_bytes_exceeded", js.undefined)
    
    inline def setModel_bytes_memory_limit(value: ByteSize): Self = StObject.set(x, "model_bytes_memory_limit", value.asInstanceOf[js.Any])
    
    inline def setModel_bytes_memory_limitUndefined: Self = StObject.set(x, "model_bytes_memory_limit", js.undefined)
    
    inline def setPeak_model_bytes(value: ByteSize): Self = StObject.set(x, "peak_model_bytes", value.asInstanceOf[js.Any])
    
    inline def setPeak_model_bytesUndefined: Self = StObject.set(x, "peak_model_bytes", js.undefined)
    
    inline def setRare_category_count(value: integer): Self = StObject.set(x, "rare_category_count", value.asInstanceOf[js.Any])
    
    inline def setResult_type(value: String): Self = StObject.set(x, "result_type", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: long): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
    
    inline def setTotal_by_field_count(value: long): Self = StObject.set(x, "total_by_field_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_category_count(value: integer): Self = StObject.set(x, "total_category_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_over_field_count(value: long): Self = StObject.set(x, "total_over_field_count", value.asInstanceOf[js.Any])
    
    inline def setTotal_partition_field_count(value: long): Self = StObject.set(x, "total_partition_field_count", value.asInstanceOf[js.Any])
  }
}
