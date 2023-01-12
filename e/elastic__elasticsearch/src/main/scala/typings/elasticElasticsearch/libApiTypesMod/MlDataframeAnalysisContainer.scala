package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalysisContainer extends StObject {
  
  var classification: js.UndefOr[MlDataframeAnalysisClassification] = js.undefined
  
  var outlier_detection: js.UndefOr[MlDataframeAnalysisOutlierDetection] = js.undefined
  
  var regression: js.UndefOr[MlDataframeAnalysisRegression] = js.undefined
}
object MlDataframeAnalysisContainer {
  
  inline def apply(): MlDataframeAnalysisContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlDataframeAnalysisContainer]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlDataframeAnalysisContainer] (val x: Self) extends AnyVal {
    
    inline def setClassification(value: MlDataframeAnalysisClassification): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setOutlier_detection(value: MlDataframeAnalysisOutlierDetection): Self = StObject.set(x, "outlier_detection", value.asInstanceOf[js.Any])
    
    inline def setOutlier_detectionUndefined: Self = StObject.set(x, "outlier_detection", js.undefined)
    
    inline def setRegression(value: MlDataframeAnalysisRegression): Self = StObject.set(x, "regression", value.asInstanceOf[js.Any])
    
    inline def setRegressionUndefined: Self = StObject.set(x, "regression", js.undefined)
  }
}
