package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlBucketSummary extends StObject {
  
  var anomaly_score: double
  
  var bucket_influencers: js.Array[MlBucketInfluencer]
  
  var bucket_span: DurationValue[UnitSeconds]
  
  var event_count: long
  
  var initial_anomaly_score: double
  
  var is_interim: Boolean
  
  var job_id: Id
  
  var processing_time_ms: DurationValue[UnitMillis]
  
  var result_type: String
  
  var timestamp: EpochTime[UnitMillis]
  
  var timestamp_string: js.UndefOr[DateTime] = js.undefined
}
object MlBucketSummary {
  
  inline def apply(
    anomaly_score: double,
    bucket_influencers: js.Array[MlBucketInfluencer],
    bucket_span: DurationValue[UnitSeconds],
    event_count: long,
    initial_anomaly_score: double,
    is_interim: Boolean,
    job_id: Id,
    processing_time_ms: DurationValue[UnitMillis],
    result_type: String,
    timestamp: EpochTime[UnitMillis]
  ): MlBucketSummary = {
    val __obj = js.Dynamic.literal(anomaly_score = anomaly_score.asInstanceOf[js.Any], bucket_influencers = bucket_influencers.asInstanceOf[js.Any], bucket_span = bucket_span.asInstanceOf[js.Any], event_count = event_count.asInstanceOf[js.Any], initial_anomaly_score = initial_anomaly_score.asInstanceOf[js.Any], is_interim = is_interim.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], processing_time_ms = processing_time_ms.asInstanceOf[js.Any], result_type = result_type.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlBucketSummary]
  }
  
  extension [Self <: MlBucketSummary](x: Self) {
    
    inline def setAnomaly_score(value: double): Self = StObject.set(x, "anomaly_score", value.asInstanceOf[js.Any])
    
    inline def setBucket_influencers(value: js.Array[MlBucketInfluencer]): Self = StObject.set(x, "bucket_influencers", value.asInstanceOf[js.Any])
    
    inline def setBucket_influencersVarargs(value: MlBucketInfluencer*): Self = StObject.set(x, "bucket_influencers", js.Array(value*))
    
    inline def setBucket_span(value: DurationValue[UnitSeconds]): Self = StObject.set(x, "bucket_span", value.asInstanceOf[js.Any])
    
    inline def setEvent_count(value: long): Self = StObject.set(x, "event_count", value.asInstanceOf[js.Any])
    
    inline def setInitial_anomaly_score(value: double): Self = StObject.set(x, "initial_anomaly_score", value.asInstanceOf[js.Any])
    
    inline def setIs_interim(value: Boolean): Self = StObject.set(x, "is_interim", value.asInstanceOf[js.Any])
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setProcessing_time_ms(value: DurationValue[UnitMillis]): Self = StObject.set(x, "processing_time_ms", value.asInstanceOf[js.Any])
    
    inline def setResult_type(value: String): Self = StObject.set(x, "result_type", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: EpochTime[UnitMillis]): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestamp_string(value: DateTime): Self = StObject.set(x, "timestamp_string", value.asInstanceOf[js.Any])
    
    inline def setTimestamp_stringUndefined: Self = StObject.set(x, "timestamp_string", js.undefined)
  }
}
