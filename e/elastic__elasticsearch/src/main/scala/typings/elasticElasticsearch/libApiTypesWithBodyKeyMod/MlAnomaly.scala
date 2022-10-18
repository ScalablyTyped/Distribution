package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlAnomaly extends StObject {
  
  var actual: js.UndefOr[js.Array[double]] = js.undefined
  
  var bucket_span: DurationValue[UnitSeconds]
  
  var by_field_name: js.UndefOr[String] = js.undefined
  
  var by_field_value: js.UndefOr[String] = js.undefined
  
  var causes: js.UndefOr[js.Array[MlAnomalyCause]] = js.undefined
  
  var detector_index: integer
  
  var field_name: js.UndefOr[String] = js.undefined
  
  var function: js.UndefOr[String] = js.undefined
  
  var function_description: js.UndefOr[String] = js.undefined
  
  var influencers: js.UndefOr[js.Array[MlInfluence]] = js.undefined
  
  var initial_record_score: double
  
  var is_interim: Boolean
  
  var job_id: String
  
  var over_field_name: js.UndefOr[String] = js.undefined
  
  var over_field_value: js.UndefOr[String] = js.undefined
  
  var partition_field_name: js.UndefOr[String] = js.undefined
  
  var partition_field_value: js.UndefOr[String] = js.undefined
  
  var probability: double
  
  var record_score: double
  
  var result_type: String
  
  var timestamp: EpochTime[UnitMillis]
  
  var typical: js.UndefOr[js.Array[double]] = js.undefined
}
object MlAnomaly {
  
  inline def apply(
    bucket_span: DurationValue[UnitSeconds],
    detector_index: integer,
    initial_record_score: double,
    is_interim: Boolean,
    job_id: String,
    probability: double,
    record_score: double,
    result_type: String,
    timestamp: EpochTime[UnitMillis]
  ): MlAnomaly = {
    val __obj = js.Dynamic.literal(bucket_span = bucket_span.asInstanceOf[js.Any], detector_index = detector_index.asInstanceOf[js.Any], initial_record_score = initial_record_score.asInstanceOf[js.Any], is_interim = is_interim.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any], record_score = record_score.asInstanceOf[js.Any], result_type = result_type.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlAnomaly]
  }
  
  extension [Self <: MlAnomaly](x: Self) {
    
    inline def setActual(value: js.Array[double]): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
    
    inline def setActualUndefined: Self = StObject.set(x, "actual", js.undefined)
    
    inline def setActualVarargs(value: double*): Self = StObject.set(x, "actual", js.Array(value*))
    
    inline def setBucket_span(value: DurationValue[UnitSeconds]): Self = StObject.set(x, "bucket_span", value.asInstanceOf[js.Any])
    
    inline def setBy_field_name(value: String): Self = StObject.set(x, "by_field_name", value.asInstanceOf[js.Any])
    
    inline def setBy_field_nameUndefined: Self = StObject.set(x, "by_field_name", js.undefined)
    
    inline def setBy_field_value(value: String): Self = StObject.set(x, "by_field_value", value.asInstanceOf[js.Any])
    
    inline def setBy_field_valueUndefined: Self = StObject.set(x, "by_field_value", js.undefined)
    
    inline def setCauses(value: js.Array[MlAnomalyCause]): Self = StObject.set(x, "causes", value.asInstanceOf[js.Any])
    
    inline def setCausesUndefined: Self = StObject.set(x, "causes", js.undefined)
    
    inline def setCausesVarargs(value: MlAnomalyCause*): Self = StObject.set(x, "causes", js.Array(value*))
    
    inline def setDetector_index(value: integer): Self = StObject.set(x, "detector_index", value.asInstanceOf[js.Any])
    
    inline def setField_name(value: String): Self = StObject.set(x, "field_name", value.asInstanceOf[js.Any])
    
    inline def setField_nameUndefined: Self = StObject.set(x, "field_name", js.undefined)
    
    inline def setFunction(value: String): Self = StObject.set(x, "function", value.asInstanceOf[js.Any])
    
    inline def setFunctionUndefined: Self = StObject.set(x, "function", js.undefined)
    
    inline def setFunction_description(value: String): Self = StObject.set(x, "function_description", value.asInstanceOf[js.Any])
    
    inline def setFunction_descriptionUndefined: Self = StObject.set(x, "function_description", js.undefined)
    
    inline def setInfluencers(value: js.Array[MlInfluence]): Self = StObject.set(x, "influencers", value.asInstanceOf[js.Any])
    
    inline def setInfluencersUndefined: Self = StObject.set(x, "influencers", js.undefined)
    
    inline def setInfluencersVarargs(value: MlInfluence*): Self = StObject.set(x, "influencers", js.Array(value*))
    
    inline def setInitial_record_score(value: double): Self = StObject.set(x, "initial_record_score", value.asInstanceOf[js.Any])
    
    inline def setIs_interim(value: Boolean): Self = StObject.set(x, "is_interim", value.asInstanceOf[js.Any])
    
    inline def setJob_id(value: String): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setOver_field_name(value: String): Self = StObject.set(x, "over_field_name", value.asInstanceOf[js.Any])
    
    inline def setOver_field_nameUndefined: Self = StObject.set(x, "over_field_name", js.undefined)
    
    inline def setOver_field_value(value: String): Self = StObject.set(x, "over_field_value", value.asInstanceOf[js.Any])
    
    inline def setOver_field_valueUndefined: Self = StObject.set(x, "over_field_value", js.undefined)
    
    inline def setPartition_field_name(value: String): Self = StObject.set(x, "partition_field_name", value.asInstanceOf[js.Any])
    
    inline def setPartition_field_nameUndefined: Self = StObject.set(x, "partition_field_name", js.undefined)
    
    inline def setPartition_field_value(value: String): Self = StObject.set(x, "partition_field_value", value.asInstanceOf[js.Any])
    
    inline def setPartition_field_valueUndefined: Self = StObject.set(x, "partition_field_value", js.undefined)
    
    inline def setProbability(value: double): Self = StObject.set(x, "probability", value.asInstanceOf[js.Any])
    
    inline def setRecord_score(value: double): Self = StObject.set(x, "record_score", value.asInstanceOf[js.Any])
    
    inline def setResult_type(value: String): Self = StObject.set(x, "result_type", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: EpochTime[UnitMillis]): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTypical(value: js.Array[double]): Self = StObject.set(x, "typical", value.asInstanceOf[js.Any])
    
    inline def setTypicalUndefined: Self = StObject.set(x, "typical", js.undefined)
    
    inline def setTypicalVarargs(value: double*): Self = StObject.set(x, "typical", js.Array(value*))
  }
}
