package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlDataframeAnalyticsSummary extends StObject {
  
  var allow_lazy_start: js.UndefOr[Boolean] = js.undefined
  
  var analysis: MlDataframeAnalysisContainer
  
  var analyzed_fields: js.UndefOr[MlDataframeAnalysisAnalyzedFields | js.Array[String]] = js.undefined
  
  var authorization: js.UndefOr[MlDataframeAnalyticsAuthorization] = js.undefined
  
  var create_time: js.UndefOr[EpochTime[UnitMillis]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var dest: MlDataframeAnalyticsDestination
  
  var id: Id
  
  var max_num_threads: js.UndefOr[integer] = js.undefined
  
  var model_memory_limit: js.UndefOr[String] = js.undefined
  
  var source: MlDataframeAnalyticsSource
  
  var version: js.UndefOr[VersionString] = js.undefined
}
object MlDataframeAnalyticsSummary {
  
  inline def apply(
    analysis: MlDataframeAnalysisContainer,
    dest: MlDataframeAnalyticsDestination,
    id: Id,
    source: MlDataframeAnalyticsSource
  ): MlDataframeAnalyticsSummary = {
    val __obj = js.Dynamic.literal(analysis = analysis.asInstanceOf[js.Any], dest = dest.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlDataframeAnalyticsSummary]
  }
  
  extension [Self <: MlDataframeAnalyticsSummary](x: Self) {
    
    inline def setAllow_lazy_start(value: Boolean): Self = StObject.set(x, "allow_lazy_start", value.asInstanceOf[js.Any])
    
    inline def setAllow_lazy_startUndefined: Self = StObject.set(x, "allow_lazy_start", js.undefined)
    
    inline def setAnalysis(value: MlDataframeAnalysisContainer): Self = StObject.set(x, "analysis", value.asInstanceOf[js.Any])
    
    inline def setAnalyzed_fields(value: MlDataframeAnalysisAnalyzedFields | js.Array[String]): Self = StObject.set(x, "analyzed_fields", value.asInstanceOf[js.Any])
    
    inline def setAnalyzed_fieldsUndefined: Self = StObject.set(x, "analyzed_fields", js.undefined)
    
    inline def setAnalyzed_fieldsVarargs(value: String*): Self = StObject.set(x, "analyzed_fields", js.Array(value*))
    
    inline def setAuthorization(value: MlDataframeAnalyticsAuthorization): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    inline def setCreate_time(value: EpochTime[UnitMillis]): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
    
    inline def setCreate_timeUndefined: Self = StObject.set(x, "create_time", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDest(value: MlDataframeAnalyticsDestination): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMax_num_threads(value: integer): Self = StObject.set(x, "max_num_threads", value.asInstanceOf[js.Any])
    
    inline def setMax_num_threadsUndefined: Self = StObject.set(x, "max_num_threads", js.undefined)
    
    inline def setModel_memory_limit(value: String): Self = StObject.set(x, "model_memory_limit", value.asInstanceOf[js.Any])
    
    inline def setModel_memory_limitUndefined: Self = StObject.set(x, "model_memory_limit", js.undefined)
    
    inline def setSource(value: MlDataframeAnalyticsSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
