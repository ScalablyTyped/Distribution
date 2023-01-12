package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalysisFeatureProcessorTargetMeanEncoding extends StObject {
  
  var default_value: integer
  
  var feature_name: Name
  
  var field: Field
  
  var target_map: Record[String, Any]
}
object MlDataframeAnalysisFeatureProcessorTargetMeanEncoding {
  
  inline def apply(default_value: integer, feature_name: Name, field: Field, target_map: Record[String, Any]): MlDataframeAnalysisFeatureProcessorTargetMeanEncoding = {
    val __obj = js.Dynamic.literal(default_value = default_value.asInstanceOf[js.Any], feature_name = feature_name.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], target_map = target_map.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeAnalysisFeatureProcessorTargetMeanEncoding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDataframeAnalysisFeatureProcessorTargetMeanEncoding] (val x: Self) extends AnyVal {
    
    inline def setDefault_value(value: integer): Self = StObject.set(x, "default_value", value.asInstanceOf[js.Any])
    
    inline def setFeature_name(value: Name): Self = StObject.set(x, "feature_name", value.asInstanceOf[js.Any])
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setTarget_map(value: Record[String, Any]): Self = StObject.set(x, "target_map", value.asInstanceOf[js.Any])
  }
}
