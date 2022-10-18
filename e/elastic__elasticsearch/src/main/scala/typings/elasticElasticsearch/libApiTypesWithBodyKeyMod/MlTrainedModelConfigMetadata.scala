package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlTrainedModelConfigMetadata extends StObject {
  
  var feature_importance_baseline: js.UndefOr[Record[String, String]] = js.undefined
  
  var hyperparameters: js.UndefOr[js.Array[MlHyperparameter]] = js.undefined
  
  var model_aliases: js.UndefOr[js.Array[String]] = js.undefined
  
  var total_feature_importance: js.UndefOr[js.Array[MlTotalFeatureImportance]] = js.undefined
}
object MlTrainedModelConfigMetadata {
  
  inline def apply(): MlTrainedModelConfigMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlTrainedModelConfigMetadata]
  }
  
  extension [Self <: MlTrainedModelConfigMetadata](x: Self) {
    
    inline def setFeature_importance_baseline(value: Record[String, String]): Self = StObject.set(x, "feature_importance_baseline", value.asInstanceOf[js.Any])
    
    inline def setFeature_importance_baselineUndefined: Self = StObject.set(x, "feature_importance_baseline", js.undefined)
    
    inline def setHyperparameters(value: js.Array[MlHyperparameter]): Self = StObject.set(x, "hyperparameters", value.asInstanceOf[js.Any])
    
    inline def setHyperparametersUndefined: Self = StObject.set(x, "hyperparameters", js.undefined)
    
    inline def setHyperparametersVarargs(value: MlHyperparameter*): Self = StObject.set(x, "hyperparameters", js.Array(value*))
    
    inline def setModel_aliases(value: js.Array[String]): Self = StObject.set(x, "model_aliases", value.asInstanceOf[js.Any])
    
    inline def setModel_aliasesUndefined: Self = StObject.set(x, "model_aliases", js.undefined)
    
    inline def setModel_aliasesVarargs(value: String*): Self = StObject.set(x, "model_aliases", js.Array(value*))
    
    inline def setTotal_feature_importance(value: js.Array[MlTotalFeatureImportance]): Self = StObject.set(x, "total_feature_importance", value.asInstanceOf[js.Any])
    
    inline def setTotal_feature_importanceUndefined: Self = StObject.set(x, "total_feature_importance", js.undefined)
    
    inline def setTotal_feature_importanceVarargs(value: MlTotalFeatureImportance*): Self = StObject.set(x, "total_feature_importance", js.Array(value*))
  }
}
