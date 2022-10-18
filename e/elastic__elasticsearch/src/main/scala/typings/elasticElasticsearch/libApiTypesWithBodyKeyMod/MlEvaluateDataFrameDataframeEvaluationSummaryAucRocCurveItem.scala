package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEvaluateDataFrameDataframeEvaluationSummaryAucRocCurveItem extends StObject {
  
  var fpr: double
  
  var threshold: double
  
  var tpr: double
}
object MlEvaluateDataFrameDataframeEvaluationSummaryAucRocCurveItem {
  
  inline def apply(fpr: double, threshold: double, tpr: double): MlEvaluateDataFrameDataframeEvaluationSummaryAucRocCurveItem = {
    val __obj = js.Dynamic.literal(fpr = fpr.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any], tpr = tpr.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlEvaluateDataFrameDataframeEvaluationSummaryAucRocCurveItem]
  }
  
  extension [Self <: MlEvaluateDataFrameDataframeEvaluationSummaryAucRocCurveItem](x: Self) {
    
    inline def setFpr(value: double): Self = StObject.set(x, "fpr", value.asInstanceOf[js.Any])
    
    inline def setThreshold(value: double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    
    inline def setTpr(value: double): Self = StObject.set(x, "tpr", value.asInstanceOf[js.Any])
  }
}
