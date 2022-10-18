package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEvaluateDataFrameDataframeClassificationSummary extends StObject {
  
  var accuracy: js.UndefOr[MlEvaluateDataFrameDataframeClassificationSummaryAccuracy] = js.undefined
  
  var auc_roc: js.UndefOr[MlEvaluateDataFrameDataframeEvaluationSummaryAucRoc] = js.undefined
  
  var multiclass_confusion_matrix: js.UndefOr[MlEvaluateDataFrameDataframeClassificationSummaryMulticlassConfusionMatrix] = js.undefined
  
  var precision: js.UndefOr[MlEvaluateDataFrameDataframeClassificationSummaryPrecision] = js.undefined
  
  var recall: js.UndefOr[MlEvaluateDataFrameDataframeClassificationSummaryRecall] = js.undefined
}
object MlEvaluateDataFrameDataframeClassificationSummary {
  
  inline def apply(): MlEvaluateDataFrameDataframeClassificationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlEvaluateDataFrameDataframeClassificationSummary]
  }
  
  extension [Self <: MlEvaluateDataFrameDataframeClassificationSummary](x: Self) {
    
    inline def setAccuracy(value: MlEvaluateDataFrameDataframeClassificationSummaryAccuracy): Self = StObject.set(x, "accuracy", value.asInstanceOf[js.Any])
    
    inline def setAccuracyUndefined: Self = StObject.set(x, "accuracy", js.undefined)
    
    inline def setAuc_roc(value: MlEvaluateDataFrameDataframeEvaluationSummaryAucRoc): Self = StObject.set(x, "auc_roc", value.asInstanceOf[js.Any])
    
    inline def setAuc_rocUndefined: Self = StObject.set(x, "auc_roc", js.undefined)
    
    inline def setMulticlass_confusion_matrix(value: MlEvaluateDataFrameDataframeClassificationSummaryMulticlassConfusionMatrix): Self = StObject.set(x, "multiclass_confusion_matrix", value.asInstanceOf[js.Any])
    
    inline def setMulticlass_confusion_matrixUndefined: Self = StObject.set(x, "multiclass_confusion_matrix", js.undefined)
    
    inline def setPrecision(value: MlEvaluateDataFrameDataframeClassificationSummaryPrecision): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setRecall(value: MlEvaluateDataFrameDataframeClassificationSummaryRecall): Self = StObject.set(x, "recall", value.asInstanceOf[js.Any])
    
    inline def setRecallUndefined: Self = StObject.set(x, "recall", js.undefined)
  }
}
