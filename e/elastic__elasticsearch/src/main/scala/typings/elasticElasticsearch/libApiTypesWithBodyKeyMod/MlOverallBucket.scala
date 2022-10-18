package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlOverallBucket extends StObject {
  
  var bucket_span: DurationValue[UnitSeconds]
  
  var is_interim: Boolean
  
  var jobs: js.Array[MlOverallBucketJob]
  
  var overall_score: double
  
  var result_type: String
  
  var timestamp: EpochTime[UnitMillis]
  
  var timestamp_string: DateTime
}
object MlOverallBucket {
  
  inline def apply(
    bucket_span: DurationValue[UnitSeconds],
    is_interim: Boolean,
    jobs: js.Array[MlOverallBucketJob],
    overall_score: double,
    result_type: String,
    timestamp: EpochTime[UnitMillis],
    timestamp_string: DateTime
  ): MlOverallBucket = {
    val __obj = js.Dynamic.literal(bucket_span = bucket_span.asInstanceOf[js.Any], is_interim = is_interim.asInstanceOf[js.Any], jobs = jobs.asInstanceOf[js.Any], overall_score = overall_score.asInstanceOf[js.Any], result_type = result_type.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], timestamp_string = timestamp_string.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlOverallBucket]
  }
  
  extension [Self <: MlOverallBucket](x: Self) {
    
    inline def setBucket_span(value: DurationValue[UnitSeconds]): Self = StObject.set(x, "bucket_span", value.asInstanceOf[js.Any])
    
    inline def setIs_interim(value: Boolean): Self = StObject.set(x, "is_interim", value.asInstanceOf[js.Any])
    
    inline def setJobs(value: js.Array[MlOverallBucketJob]): Self = StObject.set(x, "jobs", value.asInstanceOf[js.Any])
    
    inline def setJobsVarargs(value: MlOverallBucketJob*): Self = StObject.set(x, "jobs", js.Array(value*))
    
    inline def setOverall_score(value: double): Self = StObject.set(x, "overall_score", value.asInstanceOf[js.Any])
    
    inline def setResult_type(value: String): Self = StObject.set(x, "result_type", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: EpochTime[UnitMillis]): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestamp_string(value: DateTime): Self = StObject.set(x, "timestamp_string", value.asInstanceOf[js.Any])
  }
}
