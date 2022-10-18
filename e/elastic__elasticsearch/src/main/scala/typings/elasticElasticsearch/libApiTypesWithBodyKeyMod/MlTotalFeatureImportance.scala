package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTotalFeatureImportance extends StObject {
  
  var classes: js.Array[MlTotalFeatureImportanceClass]
  
  var feature_name: Name
  
  var importance: js.Array[MlTotalFeatureImportanceStatistics]
}
object MlTotalFeatureImportance {
  
  inline def apply(
    classes: js.Array[MlTotalFeatureImportanceClass],
    feature_name: Name,
    importance: js.Array[MlTotalFeatureImportanceStatistics]
  ): MlTotalFeatureImportance = {
    val __obj = js.Dynamic.literal(classes = classes.asInstanceOf[js.Any], feature_name = feature_name.asInstanceOf[js.Any], importance = importance.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlTotalFeatureImportance]
  }
  
  extension [Self <: MlTotalFeatureImportance](x: Self) {
    
    inline def setClasses(value: js.Array[MlTotalFeatureImportanceClass]): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
    
    inline def setClassesVarargs(value: MlTotalFeatureImportanceClass*): Self = StObject.set(x, "classes", js.Array(value*))
    
    inline def setFeature_name(value: Name): Self = StObject.set(x, "feature_name", value.asInstanceOf[js.Any])
    
    inline def setImportance(value: js.Array[MlTotalFeatureImportanceStatistics]): Self = StObject.set(x, "importance", value.asInstanceOf[js.Any])
    
    inline def setImportanceVarargs(value: MlTotalFeatureImportanceStatistics*): Self = StObject.set(x, "importance", js.Array(value*))
  }
}
