package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.HttpHeaders
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlDataframeAnalysisAnalyzedFields
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlDataframeAnalysisContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlDataframeAnalyticsDestination
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlDataframeAnalyticsSource
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.VersionString
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Analysis extends StObject {
  
  var allow_lazy_start: js.UndefOr[Boolean] = js.undefined
  
  var analysis: MlDataframeAnalysisContainer
  
  var analyzed_fields: js.UndefOr[MlDataframeAnalysisAnalyzedFields | js.Array[String]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var dest: MlDataframeAnalyticsDestination
  
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  
  var max_num_threads: js.UndefOr[integer] = js.undefined
  
  var model_memory_limit: js.UndefOr[String] = js.undefined
  
  var source: MlDataframeAnalyticsSource
  
  var version: js.UndefOr[VersionString] = js.undefined
}
object Analysis {
  
  inline def apply(
    analysis: MlDataframeAnalysisContainer,
    dest: MlDataframeAnalyticsDestination,
    source: MlDataframeAnalyticsSource
  ): Analysis = {
    val __obj = js.Dynamic.literal(analysis = analysis.asInstanceOf[js.Any], dest = dest.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Analysis]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Analysis] (val x: Self) extends AnyVal {
    
    inline def setAllow_lazy_start(value: Boolean): Self = StObject.set(x, "allow_lazy_start", value.asInstanceOf[js.Any])
    
    inline def setAllow_lazy_startUndefined: Self = StObject.set(x, "allow_lazy_start", js.undefined)
    
    inline def setAnalysis(value: MlDataframeAnalysisContainer): Self = StObject.set(x, "analysis", value.asInstanceOf[js.Any])
    
    inline def setAnalyzed_fields(value: MlDataframeAnalysisAnalyzedFields | js.Array[String]): Self = StObject.set(x, "analyzed_fields", value.asInstanceOf[js.Any])
    
    inline def setAnalyzed_fieldsUndefined: Self = StObject.set(x, "analyzed_fields", js.undefined)
    
    inline def setAnalyzed_fieldsVarargs(value: String*): Self = StObject.set(x, "analyzed_fields", js.Array(value*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDest(value: MlDataframeAnalyticsDestination): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMax_num_threads(value: integer): Self = StObject.set(x, "max_num_threads", value.asInstanceOf[js.Any])
    
    inline def setMax_num_threadsUndefined: Self = StObject.set(x, "max_num_threads", js.undefined)
    
    inline def setModel_memory_limit(value: String): Self = StObject.set(x, "model_memory_limit", value.asInstanceOf[js.Any])
    
    inline def setModel_memory_limitUndefined: Self = StObject.set(x, "model_memory_limit", js.undefined)
    
    inline def setSource(value: MlDataframeAnalyticsSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: VersionString): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
