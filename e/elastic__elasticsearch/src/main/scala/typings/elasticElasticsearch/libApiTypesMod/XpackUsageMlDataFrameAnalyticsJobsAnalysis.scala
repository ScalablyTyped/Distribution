package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageMlDataFrameAnalyticsJobsAnalysis extends StObject {
  
  var classification: js.UndefOr[integer] = js.undefined
  
  var outlier_detection: js.UndefOr[integer] = js.undefined
  
  var regression: js.UndefOr[integer] = js.undefined
}
object XpackUsageMlDataFrameAnalyticsJobsAnalysis {
  
  inline def apply(): XpackUsageMlDataFrameAnalyticsJobsAnalysis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XpackUsageMlDataFrameAnalyticsJobsAnalysis]
  }
  
  extension [Self <: XpackUsageMlDataFrameAnalyticsJobsAnalysis](x: Self) {
    
    inline def setClassification(value: integer): Self = StObject.set(x, "classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "classification", js.undefined)
    
    inline def setOutlier_detection(value: integer): Self = StObject.set(x, "outlier_detection", value.asInstanceOf[js.Any])
    
    inline def setOutlier_detectionUndefined: Self = StObject.set(x, "outlier_detection", js.undefined)
    
    inline def setRegression(value: integer): Self = StObject.set(x, "regression", value.asInstanceOf[js.Any])
    
    inline def setRegressionUndefined: Self = StObject.set(x, "regression", js.undefined)
  }
}
