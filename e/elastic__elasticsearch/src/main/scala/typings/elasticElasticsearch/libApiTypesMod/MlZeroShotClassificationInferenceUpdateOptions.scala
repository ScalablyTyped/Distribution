package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlZeroShotClassificationInferenceUpdateOptions extends StObject {
  
  var labels: js.Array[String]
  
  var multi_label: js.UndefOr[Boolean] = js.undefined
  
  var results_field: js.UndefOr[String] = js.undefined
  
  var tokenization: js.UndefOr[MlNlpTokenizationUpdateOptions] = js.undefined
}
object MlZeroShotClassificationInferenceUpdateOptions {
  
  inline def apply(labels: js.Array[String]): MlZeroShotClassificationInferenceUpdateOptions = {
    val __obj = js.Dynamic.literal(labels = labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlZeroShotClassificationInferenceUpdateOptions]
  }
  
  extension [Self <: MlZeroShotClassificationInferenceUpdateOptions](x: Self) {
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setMulti_label(value: Boolean): Self = StObject.set(x, "multi_label", value.asInstanceOf[js.Any])
    
    inline def setMulti_labelUndefined: Self = StObject.set(x, "multi_label", js.undefined)
    
    inline def setResults_field(value: String): Self = StObject.set(x, "results_field", value.asInstanceOf[js.Any])
    
    inline def setResults_fieldUndefined: Self = StObject.set(x, "results_field", js.undefined)
    
    inline def setTokenization(value: MlNlpTokenizationUpdateOptions): Self = StObject.set(x, "tokenization", value.asInstanceOf[js.Any])
    
    inline def setTokenizationUndefined: Self = StObject.set(x, "tokenization", js.undefined)
  }
}
