package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlBucketInfluencer extends StObject {
  
  var anomaly_score: double
  
  var bucket_span: DurationValue[UnitSeconds]
  
  var influencer_field_name: Field
  
  var initial_anomaly_score: double
  
  var is_interim: Boolean
  
  var job_id: Id
  
  var probability: double
  
  var raw_anomaly_score: double
  
  var result_type: String
  
  var timestamp: EpochTime[UnitMillis]
  
  var timestamp_string: js.UndefOr[DateTime] = js.undefined
}
object MlBucketInfluencer {
  
  inline def apply(
    anomaly_score: double,
    bucket_span: DurationValue[UnitSeconds],
    influencer_field_name: Field,
    initial_anomaly_score: double,
    is_interim: Boolean,
    job_id: Id,
    probability: double,
    raw_anomaly_score: double,
    result_type: String,
    timestamp: EpochTime[UnitMillis]
  ): MlBucketInfluencer = {
    val __obj = js.Dynamic.literal(anomaly_score = anomaly_score.asInstanceOf[js.Any], bucket_span = bucket_span.asInstanceOf[js.Any], influencer_field_name = influencer_field_name.asInstanceOf[js.Any], initial_anomaly_score = initial_anomaly_score.asInstanceOf[js.Any], is_interim = is_interim.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any], raw_anomaly_score = raw_anomaly_score.asInstanceOf[js.Any], result_type = result_type.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlBucketInfluencer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlBucketInfluencer] (val x: Self) extends AnyVal {
    
    inline def setAnomaly_score(value: double): Self = StObject.set(x, "anomaly_score", value.asInstanceOf[js.Any])
    
    inline def setBucket_span(value: DurationValue[UnitSeconds]): Self = StObject.set(x, "bucket_span", value.asInstanceOf[js.Any])
    
    inline def setInfluencer_field_name(value: Field): Self = StObject.set(x, "influencer_field_name", value.asInstanceOf[js.Any])
    
    inline def setInitial_anomaly_score(value: double): Self = StObject.set(x, "initial_anomaly_score", value.asInstanceOf[js.Any])
    
    inline def setIs_interim(value: Boolean): Self = StObject.set(x, "is_interim", value.asInstanceOf[js.Any])
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setProbability(value: double): Self = StObject.set(x, "probability", value.asInstanceOf[js.Any])
    
    inline def setRaw_anomaly_score(value: double): Self = StObject.set(x, "raw_anomaly_score", value.asInstanceOf[js.Any])
    
    inline def setResult_type(value: String): Self = StObject.set(x, "result_type", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: EpochTime[UnitMillis]): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestamp_string(value: DateTime): Self = StObject.set(x, "timestamp_string", value.asInstanceOf[js.Any])
    
    inline def setTimestamp_stringUndefined: Self = StObject.set(x, "timestamp_string", js.undefined)
  }
}
