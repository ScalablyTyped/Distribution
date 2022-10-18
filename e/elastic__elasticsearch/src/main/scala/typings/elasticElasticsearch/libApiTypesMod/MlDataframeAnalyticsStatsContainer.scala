package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalyticsStatsContainer extends StObject {
  
  var classification_stats: js.UndefOr[MlDataframeAnalyticsStatsHyperparameters] = js.undefined
  
  var outlier_detection_stats: js.UndefOr[MlDataframeAnalyticsStatsOutlierDetection] = js.undefined
  
  var regression_stats: js.UndefOr[MlDataframeAnalyticsStatsHyperparameters] = js.undefined
}
object MlDataframeAnalyticsStatsContainer {
  
  inline def apply(): MlDataframeAnalyticsStatsContainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MlDataframeAnalyticsStatsContainer]
  }
  
  extension [Self <: MlDataframeAnalyticsStatsContainer](x: Self) {
    
    inline def setClassification_stats(value: MlDataframeAnalyticsStatsHyperparameters): Self = StObject.set(x, "classification_stats", value.asInstanceOf[js.Any])
    
    inline def setClassification_statsUndefined: Self = StObject.set(x, "classification_stats", js.undefined)
    
    inline def setOutlier_detection_stats(value: MlDataframeAnalyticsStatsOutlierDetection): Self = StObject.set(x, "outlier_detection_stats", value.asInstanceOf[js.Any])
    
    inline def setOutlier_detection_statsUndefined: Self = StObject.set(x, "outlier_detection_stats", js.undefined)
    
    inline def setRegression_stats(value: MlDataframeAnalyticsStatsHyperparameters): Self = StObject.set(x, "regression_stats", value.asInstanceOf[js.Any])
    
    inline def setRegression_statsUndefined: Self = StObject.set(x, "regression_stats", js.undefined)
  }
}
