package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlInfluencer extends StObject {
  
  var bucket_span: DurationValue[UnitSeconds]
  
  var foo: js.UndefOr[String] = js.undefined
  
  var influencer_field_name: Field
  
  var influencer_field_value: String
  
  var influencer_score: double
  
  var initial_influencer_score: double
  
  var is_interim: Boolean
  
  var job_id: Id
  
  var probability: double
  
  var result_type: String
  
  var timestamp: EpochTime[UnitMillis]
}
object MlInfluencer {
  
  inline def apply(
    bucket_span: DurationValue[UnitSeconds],
    influencer_field_name: Field,
    influencer_field_value: String,
    influencer_score: double,
    initial_influencer_score: double,
    is_interim: Boolean,
    job_id: Id,
    probability: double,
    result_type: String,
    timestamp: EpochTime[UnitMillis]
  ): MlInfluencer = {
    val __obj = js.Dynamic.literal(bucket_span = bucket_span.asInstanceOf[js.Any], influencer_field_name = influencer_field_name.asInstanceOf[js.Any], influencer_field_value = influencer_field_value.asInstanceOf[js.Any], influencer_score = influencer_score.asInstanceOf[js.Any], initial_influencer_score = initial_influencer_score.asInstanceOf[js.Any], is_interim = is_interim.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], probability = probability.asInstanceOf[js.Any], result_type = result_type.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlInfluencer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlInfluencer] (val x: Self) extends AnyVal {
    
    inline def setBucket_span(value: DurationValue[UnitSeconds]): Self = StObject.set(x, "bucket_span", value.asInstanceOf[js.Any])
    
    inline def setFoo(value: String): Self = StObject.set(x, "foo", value.asInstanceOf[js.Any])
    
    inline def setFooUndefined: Self = StObject.set(x, "foo", js.undefined)
    
    inline def setInfluencer_field_name(value: Field): Self = StObject.set(x, "influencer_field_name", value.asInstanceOf[js.Any])
    
    inline def setInfluencer_field_value(value: String): Self = StObject.set(x, "influencer_field_value", value.asInstanceOf[js.Any])
    
    inline def setInfluencer_score(value: double): Self = StObject.set(x, "influencer_score", value.asInstanceOf[js.Any])
    
    inline def setInitial_influencer_score(value: double): Self = StObject.set(x, "initial_influencer_score", value.asInstanceOf[js.Any])
    
    inline def setIs_interim(value: Boolean): Self = StObject.set(x, "is_interim", value.asInstanceOf[js.Any])
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setProbability(value: double): Self = StObject.set(x, "probability", value.asInstanceOf[js.Any])
    
    inline def setResult_type(value: String): Self = StObject.set(x, "result_type", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: EpochTime[UnitMillis]): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
