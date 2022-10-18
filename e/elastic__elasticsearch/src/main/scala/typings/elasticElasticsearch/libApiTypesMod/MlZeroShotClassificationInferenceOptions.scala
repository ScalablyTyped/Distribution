package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlZeroShotClassificationInferenceOptions extends StObject {
  
  var classification_labels: js.Array[String]
  
  var hypothesis_template: js.UndefOr[String] = js.undefined
  
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  
  var multi_label: js.UndefOr[Boolean] = js.undefined
  
  var results_field: js.UndefOr[String] = js.undefined
  
  var tokenization: js.UndefOr[MlTokenizationConfigContainer] = js.undefined
}
object MlZeroShotClassificationInferenceOptions {
  
  inline def apply(classification_labels: js.Array[String]): MlZeroShotClassificationInferenceOptions = {
    val __obj = js.Dynamic.literal(classification_labels = classification_labels.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlZeroShotClassificationInferenceOptions]
  }
  
  extension [Self <: MlZeroShotClassificationInferenceOptions](x: Self) {
    
    inline def setClassification_labels(value: js.Array[String]): Self = StObject.set(x, "classification_labels", value.asInstanceOf[js.Any])
    
    inline def setClassification_labelsVarargs(value: String*): Self = StObject.set(x, "classification_labels", js.Array(value*))
    
    inline def setHypothesis_template(value: String): Self = StObject.set(x, "hypothesis_template", value.asInstanceOf[js.Any])
    
    inline def setHypothesis_templateUndefined: Self = StObject.set(x, "hypothesis_template", js.undefined)
    
    inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
    
    inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
    
    inline def setMulti_label(value: Boolean): Self = StObject.set(x, "multi_label", value.asInstanceOf[js.Any])
    
    inline def setMulti_labelUndefined: Self = StObject.set(x, "multi_label", js.undefined)
    
    inline def setResults_field(value: String): Self = StObject.set(x, "results_field", value.asInstanceOf[js.Any])
    
    inline def setResults_fieldUndefined: Self = StObject.set(x, "results_field", js.undefined)
    
    inline def setTokenization(value: MlTokenizationConfigContainer): Self = StObject.set(x, "tokenization", value.asInstanceOf[js.Any])
    
    inline def setTokenizationUndefined: Self = StObject.set(x, "tokenization", js.undefined)
  }
}
