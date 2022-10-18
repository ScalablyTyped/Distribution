package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlEvaluateDataFrameResponse extends StObject {
  
  var classification: js.UndefOr[MlEvaluateDataFrameDataframeClassificationSummary] = js.undefined
  
  var outlier_detection: js.UndefOr[MlEvaluateDataFrameDataframeOutlierDetectionSummary] = js.undefined
  
  var regression: js.UndefOr[MlEvaluateDataFrameDataframeRegressionSummary] = js.undefined
}
object MlEvaluateDataFrameResponse {
  
  inline def apply(): MlEvaluateDataFrameResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlEvaluateDataFrameResponse]
  }
  
  extension [Self <: MlEvaluateDataFrameResponse](x: Self) {
    
    inline def setClassification(value: MlEvaluateDataFrameDataframeClassificationSummary): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setOutlier_detection(value: MlEvaluateDataFrameDataframeOutlierDetectionSummary): Self = StObject.set(x, "outlier_detection", value.asInstanceOf[js.Any])
    
    inline def setOutlier_detectionUndefined: Self = StObject.set(x, "outlier_detection", js.undefined)
    
    inline def setRegression(value: MlEvaluateDataFrameDataframeRegressionSummary): Self = StObject.set(x, "regression", value.asInstanceOf[js.Any])
    
    inline def setRegressionUndefined: Self = StObject.set(x, "regression", js.undefined)
  }
}
