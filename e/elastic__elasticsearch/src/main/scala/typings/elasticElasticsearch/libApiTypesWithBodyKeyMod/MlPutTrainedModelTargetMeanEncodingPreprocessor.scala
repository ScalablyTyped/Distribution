package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutTrainedModelTargetMeanEncodingPreprocessor extends StObject {
  
  var default_value: double
  
  var feature_name: String
  
  var field: String
  
  var target_map: Record[String, double]
}
object MlPutTrainedModelTargetMeanEncodingPreprocessor {
  
  inline def apply(default_value: double, feature_name: String, field: String, target_map: Record[String, double]): MlPutTrainedModelTargetMeanEncodingPreprocessor = {
    val __obj = js.Dynamic.literal(default_value = default_value.asInstanceOf[js.Any], feature_name = feature_name.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], target_map = target_map.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutTrainedModelTargetMeanEncodingPreprocessor]
  }
  
  extension [Self <: MlPutTrainedModelTargetMeanEncodingPreprocessor](x: Self) {
    
    inline def setDefault_value(value: double): Self = StObject.set(x, "default_value", value.asInstanceOf[js.Any])
    
    inline def setFeature_name(value: String): Self = StObject.set(x, "feature_name", value.asInstanceOf[js.Any])
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setTarget_map(value: Record[String, double]): Self = StObject.set(x, "target_map", value.asInstanceOf[js.Any])
  }
}
