package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsAggregationContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.HttpHeaders
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexName
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndicesOptions
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingRuntimeFields
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlChunkingConfig
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MlDelayedDataCheckConfig
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.QueryDslQueryContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.ScriptField
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.integer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Chunkingconfig extends StObject {
  
  var aggregations: js.UndefOr[Record[String, AggregationsAggregationContainer]] = js.undefined
  
  var chunking_config: js.UndefOr[MlChunkingConfig] = js.undefined
  
  var delayed_data_check_config: js.UndefOr[MlDelayedDataCheckConfig] = js.undefined
  
  var frequency: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration] = js.undefined
  
  var headers: js.UndefOr[HttpHeaders] = js.undefined
  
  var indexes: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Indices] = js.undefined
  
  var indices: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Indices] = js.undefined
  
  var indices_options: js.UndefOr[IndicesOptions] = js.undefined
  
  var job_id: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id] = js.undefined
  
  var max_empty_searches: js.UndefOr[integer] = js.undefined
  
  var query: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var query_delay: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration] = js.undefined
  
  var runtime_mappings: js.UndefOr[MappingRuntimeFields] = js.undefined
  
  var script_fields: js.UndefOr[Record[String, ScriptField]] = js.undefined
  
  var scroll_size: js.UndefOr[integer] = js.undefined
}
object Chunkingconfig {
  
  inline def apply(): Chunkingconfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Chunkingconfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Chunkingconfig] (val x: Self) extends AnyVal {
    
    inline def setAggregations(value: Record[String, AggregationsAggregationContainer]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setChunking_config(value: MlChunkingConfig): Self = StObject.set(x, "chunking_config", value.asInstanceOf[js.Any])
    
    inline def setChunking_configUndefined: Self = StObject.set(x, "chunking_config", js.undefined)
    
    inline def setDelayed_data_check_config(value: MlDelayedDataCheckConfig): Self = StObject.set(x, "delayed_data_check_config", value.asInstanceOf[js.Any])
    
    inline def setDelayed_data_check_configUndefined: Self = StObject.set(x, "delayed_data_check_config", js.undefined)
    
    inline def setFrequency(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setFrequencyUndefined: Self = StObject.set(x, "frequency", js.undefined)
    
    inline def setHeaders(value: HttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setIndexes(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Indices): Self = StObject.set(x, "indexes", value.asInstanceOf[js.Any])
    
    inline def setIndexesUndefined: Self = StObject.set(x, "indexes", js.undefined)
    
    inline def setIndexesVarargs(value: IndexName*): Self = StObject.set(x, "indexes", js.Array(value*))
    
    inline def setIndices(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Indices): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setIndicesVarargs(value: IndexName*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setIndices_options(value: IndicesOptions): Self = StObject.set(x, "indices_options", value.asInstanceOf[js.Any])
    
    inline def setIndices_optionsUndefined: Self = StObject.set(x, "indices_options", js.undefined)
    
    inline def setJob_id(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setJob_idUndefined: Self = StObject.set(x, "job_id", js.undefined)
    
    inline def setMax_empty_searches(value: integer): Self = StObject.set(x, "max_empty_searches", value.asInstanceOf[js.Any])
    
    inline def setMax_empty_searchesUndefined: Self = StObject.set(x, "max_empty_searches", js.undefined)
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setQuery_delay(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration): Self = StObject.set(x, "query_delay", value.asInstanceOf[js.Any])
    
    inline def setQuery_delayUndefined: Self = StObject.set(x, "query_delay", js.undefined)
    
    inline def setRuntime_mappings(value: MappingRuntimeFields): Self = StObject.set(x, "runtime_mappings", value.asInstanceOf[js.Any])
    
    inline def setRuntime_mappingsUndefined: Self = StObject.set(x, "runtime_mappings", js.undefined)
    
    inline def setScript_fields(value: Record[String, ScriptField]): Self = StObject.set(x, "script_fields", value.asInstanceOf[js.Any])
    
    inline def setScript_fieldsUndefined: Self = StObject.set(x, "script_fields", js.undefined)
    
    inline def setScroll_size(value: integer): Self = StObject.set(x, "scroll_size", value.asInstanceOf[js.Any])
    
    inline def setScroll_sizeUndefined: Self = StObject.set(x, "scroll_size", js.undefined)
  }
}
