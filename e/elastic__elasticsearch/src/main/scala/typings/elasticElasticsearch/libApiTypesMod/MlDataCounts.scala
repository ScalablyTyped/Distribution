package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataCounts extends StObject {
  
  var bucket_count: long
  
  var earliest_record_timestamp: js.UndefOr[long] = js.undefined
  
  var empty_bucket_count: long
  
  var input_bytes: long
  
  var input_field_count: long
  
  var input_record_count: long
  
  var invalid_date_count: long
  
  var job_id: Id
  
  var last_data_time: js.UndefOr[long] = js.undefined
  
  var latest_bucket_timestamp: js.UndefOr[long] = js.undefined
  
  var latest_empty_bucket_timestamp: js.UndefOr[long] = js.undefined
  
  var latest_record_timestamp: js.UndefOr[long] = js.undefined
  
  var latest_sparse_bucket_timestamp: js.UndefOr[long] = js.undefined
  
  var log_time: js.UndefOr[long] = js.undefined
  
  var missing_field_count: long
  
  var out_of_order_timestamp_count: long
  
  var processed_field_count: long
  
  var processed_record_count: long
  
  var sparse_bucket_count: long
}
object MlDataCounts {
  
  inline def apply(
    bucket_count: long,
    empty_bucket_count: long,
    input_bytes: long,
    input_field_count: long,
    input_record_count: long,
    invalid_date_count: long,
    job_id: Id,
    missing_field_count: long,
    out_of_order_timestamp_count: long,
    processed_field_count: long,
    processed_record_count: long,
    sparse_bucket_count: long
  ): MlDataCounts = {
    val __obj = js.Dynamic.literal(bucket_count = bucket_count.asInstanceOf[js.Any], empty_bucket_count = empty_bucket_count.asInstanceOf[js.Any], input_bytes = input_bytes.asInstanceOf[js.Any], input_field_count = input_field_count.asInstanceOf[js.Any], input_record_count = input_record_count.asInstanceOf[js.Any], invalid_date_count = invalid_date_count.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], missing_field_count = missing_field_count.asInstanceOf[js.Any], out_of_order_timestamp_count = out_of_order_timestamp_count.asInstanceOf[js.Any], processed_field_count = processed_field_count.asInstanceOf[js.Any], processed_record_count = processed_record_count.asInstanceOf[js.Any], sparse_bucket_count = sparse_bucket_count.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataCounts]
  }
  
  extension [Self <: MlDataCounts](x: Self) {
    
    inline def setBucket_count(value: long): Self = StObject.set(x, "bucket_count", value.asInstanceOf[js.Any])
    
    inline def setEarliest_record_timestamp(value: long): Self = StObject.set(x, "earliest_record_timestamp", value.asInstanceOf[js.Any])
    
    inline def setEarliest_record_timestampUndefined: Self = StObject.set(x, "earliest_record_timestamp", js.undefined)
    
    inline def setEmpty_bucket_count(value: long): Self = StObject.set(x, "empty_bucket_count", value.asInstanceOf[js.Any])
    
    inline def setInput_bytes(value: long): Self = StObject.set(x, "input_bytes", value.asInstanceOf[js.Any])
    
    inline def setInput_field_count(value: long): Self = StObject.set(x, "input_field_count", value.asInstanceOf[js.Any])
    
    inline def setInput_record_count(value: long): Self = StObject.set(x, "input_record_count", value.asInstanceOf[js.Any])
    
    inline def setInvalid_date_count(value: long): Self = StObject.set(x, "invalid_date_count", value.asInstanceOf[js.Any])
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setLast_data_time(value: long): Self = StObject.set(x, "last_data_time", value.asInstanceOf[js.Any])
    
    inline def setLast_data_timeUndefined: Self = StObject.set(x, "last_data_time", js.undefined)
    
    inline def setLatest_bucket_timestamp(value: long): Self = StObject.set(x, "latest_bucket_timestamp", value.asInstanceOf[js.Any])
    
    inline def setLatest_bucket_timestampUndefined: Self = StObject.set(x, "latest_bucket_timestamp", js.undefined)
    
    inline def setLatest_empty_bucket_timestamp(value: long): Self = StObject.set(x, "latest_empty_bucket_timestamp", value.asInstanceOf[js.Any])
    
    inline def setLatest_empty_bucket_timestampUndefined: Self = StObject.set(x, "latest_empty_bucket_timestamp", js.undefined)
    
    inline def setLatest_record_timestamp(value: long): Self = StObject.set(x, "latest_record_timestamp", value.asInstanceOf[js.Any])
    
    inline def setLatest_record_timestampUndefined: Self = StObject.set(x, "latest_record_timestamp", js.undefined)
    
    inline def setLatest_sparse_bucket_timestamp(value: long): Self = StObject.set(x, "latest_sparse_bucket_timestamp", value.asInstanceOf[js.Any])
    
    inline def setLatest_sparse_bucket_timestampUndefined: Self = StObject.set(x, "latest_sparse_bucket_timestamp", js.undefined)
    
    inline def setLog_time(value: long): Self = StObject.set(x, "log_time", value.asInstanceOf[js.Any])
    
    inline def setLog_timeUndefined: Self = StObject.set(x, "log_time", js.undefined)
    
    inline def setMissing_field_count(value: long): Self = StObject.set(x, "missing_field_count", value.asInstanceOf[js.Any])
    
    inline def setOut_of_order_timestamp_count(value: long): Self = StObject.set(x, "out_of_order_timestamp_count", value.asInstanceOf[js.Any])
    
    inline def setProcessed_field_count(value: long): Self = StObject.set(x, "processed_field_count", value.asInstanceOf[js.Any])
    
    inline def setProcessed_record_count(value: long): Self = StObject.set(x, "processed_record_count", value.asInstanceOf[js.Any])
    
    inline def setSparse_bucket_count(value: long): Self = StObject.set(x, "sparse_bucket_count", value.asInstanceOf[js.Any])
  }
}
