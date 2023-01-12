package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlRegressionInferenceOptions extends StObject {
  
  var num_top_feature_importance_values: js.UndefOr[integer] = js.undefined
  
  var results_field: js.UndefOr[Field] = js.undefined
}
object MlRegressionInferenceOptions {
  
  inline def apply(): MlRegressionInferenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlRegressionInferenceOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlRegressionInferenceOptions] (val x: Self) extends AnyVal {
    
    inline def setNum_top_feature_importance_values(value: integer): Self = StObject.set(x, "num_top_feature_importance_values", value.asInstanceOf[js.Any])
    
    inline def setNum_top_feature_importance_valuesUndefined: Self = StObject.set(x, "num_top_feature_importance_values", js.undefined)
    
    inline def setResults_field(value: Field): Self = StObject.set(x, "results_field", value.asInstanceOf[js.Any])
    
    inline def setResults_fieldUndefined: Self = StObject.set(x, "results_field", js.undefined)
  }
}
