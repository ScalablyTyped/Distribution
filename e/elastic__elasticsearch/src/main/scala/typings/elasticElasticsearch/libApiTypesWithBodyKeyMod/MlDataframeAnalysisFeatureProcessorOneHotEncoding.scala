package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalysisFeatureProcessorOneHotEncoding extends StObject {
  
  var field: Field
  
  var hot_map: String
}
object MlDataframeAnalysisFeatureProcessorOneHotEncoding {
  
  inline def apply(field: Field, hot_map: String): MlDataframeAnalysisFeatureProcessorOneHotEncoding = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], hot_map = hot_map.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeAnalysisFeatureProcessorOneHotEncoding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDataframeAnalysisFeatureProcessorOneHotEncoding] (val x: Self) extends AnyVal {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setHot_map(value: String): Self = StObject.set(x, "hot_map", value.asInstanceOf[js.Any])
  }
}
