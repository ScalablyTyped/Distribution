package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPreviewDataFrameAnalyticsDataframePreviewConfig extends StObject {
  
  var analysis: MlDataframeAnalysisContainer
  
  var analyzed_fields: js.UndefOr[MlDataframeAnalysisAnalyzedFields | js.Array[String]] = js.undefined
  
  var max_num_threads: js.UndefOr[integer] = js.undefined
  
  var model_memory_limit: js.UndefOr[String] = js.undefined
  
  var source: MlDataframeAnalyticsSource
}
object MlPreviewDataFrameAnalyticsDataframePreviewConfig {
  
  inline def apply(analysis: MlDataframeAnalysisContainer, source: MlDataframeAnalyticsSource): MlPreviewDataFrameAnalyticsDataframePreviewConfig = {
    val __obj = js.Dynamic.literal(analysis = analysis.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPreviewDataFrameAnalyticsDataframePreviewConfig]
  }
  
  extension [Self <: MlPreviewDataFrameAnalyticsDataframePreviewConfig](x: Self) {
    
    inline def setAnalysis(value: MlDataframeAnalysisContainer): Self = StObject.set(x, "analysis", value.asInstanceOf[js.Any])
    
    inline def setAnalyzed_fields(value: MlDataframeAnalysisAnalyzedFields | js.Array[String]): Self = StObject.set(x, "analyzed_fields", value.asInstanceOf[js.Any])
    
    inline def setAnalyzed_fieldsUndefined: Self = StObject.set(x, "analyzed_fields", js.undefined)
    
    inline def setAnalyzed_fieldsVarargs(value: String*): Self = StObject.set(x, "analyzed_fields", js.Array(value*))
    
    inline def setMax_num_threads(value: integer): Self = StObject.set(x, "max_num_threads", value.asInstanceOf[js.Any])
    
    inline def setMax_num_threadsUndefined: Self = StObject.set(x, "max_num_threads", js.undefined)
    
    inline def setModel_memory_limit(value: String): Self = StObject.set(x, "model_memory_limit", value.asInstanceOf[js.Any])
    
    inline def setModel_memory_limitUndefined: Self = StObject.set(x, "model_memory_limit", js.undefined)
    
    inline def setSource(value: MlDataframeAnalyticsSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
