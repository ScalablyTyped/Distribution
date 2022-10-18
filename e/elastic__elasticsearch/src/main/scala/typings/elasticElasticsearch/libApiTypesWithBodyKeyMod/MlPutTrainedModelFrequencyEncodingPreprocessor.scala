package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutTrainedModelFrequencyEncodingPreprocessor extends StObject {
  
  var feature_name: String
  
  var field: String
  
  var frequency_map: Record[String, double]
}
object MlPutTrainedModelFrequencyEncodingPreprocessor {
  
  inline def apply(feature_name: String, field: String, frequency_map: Record[String, double]): MlPutTrainedModelFrequencyEncodingPreprocessor = {
    val __obj = js.Dynamic.literal(feature_name = feature_name.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], frequency_map = frequency_map.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutTrainedModelFrequencyEncodingPreprocessor]
  }
  
  extension [Self <: MlPutTrainedModelFrequencyEncodingPreprocessor](x: Self) {
    
    inline def setFeature_name(value: String): Self = StObject.set(x, "feature_name", value.asInstanceOf[js.Any])
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFrequency_map(value: Record[String, double]): Self = StObject.set(x, "frequency_map", value.asInstanceOf[js.Any])
  }
}
