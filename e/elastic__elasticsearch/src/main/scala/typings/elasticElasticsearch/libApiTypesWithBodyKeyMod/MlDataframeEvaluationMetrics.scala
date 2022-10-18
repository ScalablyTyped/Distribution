package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeEvaluationMetrics extends StObject {
  
  var auc_roc: js.UndefOr[MlDataframeEvaluationClassificationMetricsAucRoc] = js.undefined
  
  var precision: js.UndefOr[Record[String, Any]] = js.undefined
  
  var recall: js.UndefOr[Record[String, Any]] = js.undefined
}
object MlDataframeEvaluationMetrics {
  
  inline def apply(): MlDataframeEvaluationMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlDataframeEvaluationMetrics]
  }
  
  extension [Self <: MlDataframeEvaluationMetrics](x: Self) {
    
    inline def setAuc_roc(value: MlDataframeEvaluationClassificationMetricsAucRoc): Self = StObject.set(x, "auc_roc", value.asInstanceOf[js.Any])
    
    inline def setAuc_rocUndefined: Self = StObject.set(x, "auc_roc", js.undefined)
    
    inline def setPrecision(value: Record[String, Any]): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setRecall(value: Record[String, Any]): Self = StObject.set(x, "recall", value.asInstanceOf[js.Any])
    
    inline def setRecallUndefined: Self = StObject.set(x, "recall", js.undefined)
  }
}
