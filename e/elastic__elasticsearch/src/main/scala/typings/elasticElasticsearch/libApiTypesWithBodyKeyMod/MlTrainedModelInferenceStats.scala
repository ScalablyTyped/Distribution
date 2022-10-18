package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTrainedModelInferenceStats extends StObject {
  
  var cache_miss_count: integer
  
  var failure_count: integer
  
  var inference_count: integer
  
  var missing_all_fields_count: integer
  
  var timestamp: DateTime
}
object MlTrainedModelInferenceStats {
  
  inline def apply(
    cache_miss_count: integer,
    failure_count: integer,
    inference_count: integer,
    missing_all_fields_count: integer,
    timestamp: DateTime
  ): MlTrainedModelInferenceStats = {
    val __obj = js.Dynamic.literal(cache_miss_count = cache_miss_count.asInstanceOf[js.Any], failure_count = failure_count.asInstanceOf[js.Any], inference_count = inference_count.asInstanceOf[js.Any], missing_all_fields_count = missing_all_fields_count.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTrainedModelInferenceStats]
  }
  
  extension [Self <: MlTrainedModelInferenceStats](x: Self) {
    
    inline def setCache_miss_count(value: integer): Self = StObject.set(x, "cache_miss_count", value.asInstanceOf[js.Any])
    
    inline def setFailure_count(value: integer): Self = StObject.set(x, "failure_count", value.asInstanceOf[js.Any])
    
    inline def setInference_count(value: integer): Self = StObject.set(x, "inference_count", value.asInstanceOf[js.Any])
    
    inline def setMissing_all_fields_count(value: integer): Self = StObject.set(x, "missing_all_fields_count", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: DateTime): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
