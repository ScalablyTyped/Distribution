package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTrainedModelInferenceFeatureImportance extends StObject {
  
  var classes: js.UndefOr[js.Array[MlTrainedModelInferenceClassImportance]] = js.undefined
  
  var feature_name: String
  
  var importance: js.UndefOr[double] = js.undefined
}
object MlTrainedModelInferenceFeatureImportance {
  
  inline def apply(feature_name: String): MlTrainedModelInferenceFeatureImportance = {
    val __obj = js.Dynamic.literal(feature_name = feature_name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTrainedModelInferenceFeatureImportance]
  }
  
  extension [Self <: MlTrainedModelInferenceFeatureImportance](x: Self) {
    
    inline def setClasses(value: js.Array[MlTrainedModelInferenceClassImportance]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
    
    inline def setClassesVarargs(value: MlTrainedModelInferenceClassImportance*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setFeature_name(value: String): Self = StObject.set(x, "feature_name", value.asInstanceOf[js.Any])
    
    inline def setImportance(value: double): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    inline def setImportanceUndefined: Self = StObject.set(x, "importance", js.undefined)
  }
}
