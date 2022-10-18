package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutDataFrameAnalyticsResponse extends StObject {
  
  var allow_lazy_start: Boolean
  
  var analysis: MlDataframeAnalysisContainer
  
  var analyzed_fields: js.UndefOr[MlDataframeAnalysisAnalyzedFields | js.Array[String]] = js.undefined
  
  var authorization: js.UndefOr[MlDataframeAnalyticsAuthorization] = js.undefined
  
  var create_time: EpochTime[UnitMillis]
  
  var description: js.UndefOr[String] = js.undefined
  
  var dest: MlDataframeAnalyticsDestination
  
  var id: Id
  
  var max_num_threads: integer
  
  var model_memory_limit: String
  
  var source: MlDataframeAnalyticsSource
  
  var version: VersionString
}
object MlPutDataFrameAnalyticsResponse {
  
  inline def apply(
    allow_lazy_start: Boolean,
    analysis: MlDataframeAnalysisContainer,
    create_time: EpochTime[UnitMillis],
    dest: MlDataframeAnalyticsDestination,
    id: Id,
    max_num_threads: integer,
    model_memory_limit: String,
    source: MlDataframeAnalyticsSource,
    version: VersionString
  ): MlPutDataFrameAnalyticsResponse = {
    val __obj = js.Dynamic.literal(allow_lazy_start = allow_lazy_start.asInstanceOf[js.Any], analysis = analysis.asInstanceOf[js.Any], create_time = create_time.asInstanceOf[js.Any], dest = dest.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], max_num_threads = max_num_threads.asInstanceOf[js.Any], model_memory_limit = model_memory_limit.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutDataFrameAnalyticsResponse]
  }
  
  extension [Self <: MlPutDataFrameAnalyticsResponse](x: Self) {
    
    inline def setAllow_lazy_start(value: Boolean): Self = StObject.set(x, "allow_lazy_start", value.asInstanceOf[js.Any])
    
    inline def setAnalysis(value: MlDataframeAnalysisContainer): Self = StObject.set(x, "analysis", value.asInstanceOf[js.Any])
    
    inline def setAnalyzed_fields(value: MlDataframeAnalysisAnalyzedFields | js.Array[String]): Self = StObject.set(x, "analyzed_fields", value.asInstanceOf[js.Any])
    
    inline def setAnalyzed_fieldsUndefined: Self = StObject.set(x, "analyzed_fields", js.undefined)
    
    inline def setAnalyzed_fieldsVarargs(value: String*): Self = StObject.set(x, "analyzed_fields", js.Array(value*))
    
    inline def setAuthorization(value: MlDataframeAnalyticsAuthorization): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    inline def setCreate_time(value: EpochTime[UnitMillis]): Self = StObject.set(x, "create_time", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDest(value: MlDataframeAnalyticsDestination): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    inline def setId(value: Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMax_num_threads(value: integer): Self = StObject.set(x, "max_num_threads", value.asInstanceOf[js.Any])
    
    inline def setModel_memory_limit(value: String): Self = StObject.set(x, "model_memory_limit", value.asInstanceOf[js.Any])
    
    inline def setSource(value: MlDataframeAnalyticsSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}
