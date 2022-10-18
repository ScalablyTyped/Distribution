package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEvaluateDataFrameDataframeOutlierDetectionSummary extends StObject {
  
  var auc_roc: js.UndefOr[MlEvaluateDataFrameDataframeEvaluationSummaryAucRoc] = js.undefined
  
  var confusion_matrix: js.UndefOr[Record[String, MlEvaluateDataFrameConfusionMatrixThreshold]] = js.undefined
  
  var precision: js.UndefOr[Record[String, double]] = js.undefined
  
  var recall: js.UndefOr[Record[String, double]] = js.undefined
}
object MlEvaluateDataFrameDataframeOutlierDetectionSummary {
  
  inline def apply(): MlEvaluateDataFrameDataframeOutlierDetectionSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlEvaluateDataFrameDataframeOutlierDetectionSummary]
  }
  
  extension [Self <: MlEvaluateDataFrameDataframeOutlierDetectionSummary](x: Self) {
    
    inline def setAuc_roc(value: MlEvaluateDataFrameDataframeEvaluationSummaryAucRoc): Self = StObject.set(x, "auc_roc", value.asInstanceOf[js.Any])
    
    inline def setAuc_rocUndefined: Self = StObject.set(x, "auc_roc", js.undefined)
    
    inline def setConfusion_matrix(value: Record[String, MlEvaluateDataFrameConfusionMatrixThreshold]): Self = StObject.set(x, "confusion_matrix", value.asInstanceOf[js.Any])
    
    inline def setConfusion_matrixUndefined: Self = StObject.set(x, "confusion_matrix", js.undefined)
    
    inline def setPrecision(value: Record[String, double]): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setRecall(value: Record[String, double]): Self = StObject.set(x, "recall", value.asInstanceOf[js.Any])
    
    inline def setRecallUndefined: Self = StObject.set(x, "recall", js.undefined)
  }
}
