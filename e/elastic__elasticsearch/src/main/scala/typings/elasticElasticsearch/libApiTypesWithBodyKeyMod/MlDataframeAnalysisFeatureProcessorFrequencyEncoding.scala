package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalysisFeatureProcessorFrequencyEncoding extends StObject {
  
  var feature_name: Name
  
  var field: Field
  
  var frequency_map: Record[String, double]
}
object MlDataframeAnalysisFeatureProcessorFrequencyEncoding {
  
  inline def apply(feature_name: Name, field: Field, frequency_map: Record[String, double]): MlDataframeAnalysisFeatureProcessorFrequencyEncoding = {
    val __obj = js.Dynamic.literal(feature_name = feature_name.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], frequency_map = frequency_map.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeAnalysisFeatureProcessorFrequencyEncoding]
  }
  
  extension [Self <: MlDataframeAnalysisFeatureProcessorFrequencyEncoding](x: Self) {
    
    inline def setFeature_name(value: Name): Self = StObject.set(x, "feature_name", value.asInstanceOf[js.Any])
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFrequency_map(value: Record[String, double]): Self = StObject.set(x, "frequency_map", value.asInstanceOf[js.Any])
  }
}
