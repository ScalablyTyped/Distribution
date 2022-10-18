package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsInferenceAggregateKeys
  extends StObject
     with AggregationsAggregateBase {
  
  var feature_importance: js.UndefOr[js.Array[AggregationsInferenceFeatureImportance]] = js.undefined
  
  var top_classes: js.UndefOr[js.Array[AggregationsInferenceTopClassEntry]] = js.undefined
  
  var value: js.UndefOr[FieldValue] = js.undefined
  
  var warning: js.UndefOr[String] = js.undefined
}
object AggregationsInferenceAggregateKeys {
  
  inline def apply(): AggregationsInferenceAggregateKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationsInferenceAggregateKeys]
  }
  
  extension [Self <: AggregationsInferenceAggregateKeys](x: Self) {
    
    inline def setFeature_importance(value: js.Array[AggregationsInferenceFeatureImportance]): Self = StObject.set(x, "feature_importance", value.asInstanceOf[js.Any])
    
    inline def setFeature_importanceUndefined: Self = StObject.set(x, "feature_importance", js.undefined)
    
    inline def setFeature_importanceVarargs(value: AggregationsInferenceFeatureImportance*): Self = StObject.set(x, "feature_importance", js.Array(value*))
    
    inline def setTop_classes(value: js.Array[AggregationsInferenceTopClassEntry]): Self = StObject.set(x, "top_classes", value.asInstanceOf[js.Any])
    
    inline def setTop_classesUndefined: Self = StObject.set(x, "top_classes", js.undefined)
    
    inline def setTop_classesVarargs(value: AggregationsInferenceTopClassEntry*): Self = StObject.set(x, "top_classes", js.Array(value*))
    
    inline def setValue(value: FieldValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setWarning(value: String): Self = StObject.set(x, "warning", value.asInstanceOf[js.Any])
    
    inline def setWarningUndefined: Self = StObject.set(x, "warning", js.undefined)
  }
}
