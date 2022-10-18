package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlInferenceConfigUpdateContainer extends StObject {
  
  var classification: js.UndefOr[MlClassificationInferenceOptions] = js.undefined
  
  var fill_mask: js.UndefOr[MlFillMaskInferenceUpdateOptions] = js.undefined
  
  var ner: js.UndefOr[MlNerInferenceUpdateOptions] = js.undefined
  
  var pass_through: js.UndefOr[MlPassThroughInferenceUpdateOptions] = js.undefined
  
  var question_answering: js.UndefOr[MlQuestionAnsweringInferenceUpdateOptions] = js.undefined
  
  var regression: js.UndefOr[MlRegressionInferenceOptions] = js.undefined
  
  var text_classification: js.UndefOr[MlTextClassificationInferenceUpdateOptions] = js.undefined
  
  var text_embedding: js.UndefOr[MlTextEmbeddingInferenceUpdateOptions] = js.undefined
  
  var zero_shot_classification: js.UndefOr[MlZeroShotClassificationInferenceUpdateOptions] = js.undefined
}
object MlInferenceConfigUpdateContainer {
  
  inline def apply(): MlInferenceConfigUpdateContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlInferenceConfigUpdateContainer]
  }
  
  extension [Self <: MlInferenceConfigUpdateContainer](x: Self) {
    
    inline def setClassification(value: MlClassificationInferenceOptions): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setFill_mask(value: MlFillMaskInferenceUpdateOptions): Self = StObject.set(x, "fill_mask", value.asInstanceOf[js.Any])
    
    inline def setFill_maskUndefined: Self = StObject.set(x, "fill_mask", js.undefined)
    
    inline def setNer(value: MlNerInferenceUpdateOptions): Self = StObject.set(x, "ner", value.asInstanceOf[js.Any])
    
    inline def setNerUndefined: Self = StObject.set(x, "ner", js.undefined)
    
    inline def setPass_through(value: MlPassThroughInferenceUpdateOptions): Self = StObject.set(x, "pass_through", value.asInstanceOf[js.Any])
    
    inline def setPass_throughUndefined: Self = StObject.set(x, "pass_through", js.undefined)
    
    inline def setQuestion_answering(value: MlQuestionAnsweringInferenceUpdateOptions): Self = StObject.set(x, "question_answering", value.asInstanceOf[js.Any])
    
    inline def setQuestion_answeringUndefined: Self = StObject.set(x, "question_answering", js.undefined)
    
    inline def setRegression(value: MlRegressionInferenceOptions): Self = StObject.set(x, "regression", value.asInstanceOf[js.Any])
    
    inline def setRegressionUndefined: Self = StObject.set(x, "regression", js.undefined)
    
    inline def setText_classification(value: MlTextClassificationInferenceUpdateOptions): Self = StObject.set(x, "text_classification", value.asInstanceOf[js.Any])
    
    inline def setText_classificationUndefined: Self = StObject.set(x, "text_classification", js.undefined)
    
    inline def setText_embedding(value: MlTextEmbeddingInferenceUpdateOptions): Self = StObject.set(x, "text_embedding", value.asInstanceOf[js.Any])
    
    inline def setText_embeddingUndefined: Self = StObject.set(x, "text_embedding", js.undefined)
    
    inline def setZero_shot_classification(value: MlZeroShotClassificationInferenceUpdateOptions): Self = StObject.set(x, "zero_shot_classification", value.asInstanceOf[js.Any])
    
    inline def setZero_shot_classificationUndefined: Self = StObject.set(x, "zero_shot_classification", js.undefined)
  }
}
