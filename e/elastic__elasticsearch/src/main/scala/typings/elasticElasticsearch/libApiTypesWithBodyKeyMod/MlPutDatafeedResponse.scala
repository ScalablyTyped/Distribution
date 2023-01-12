package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MlPutDatafeedResponse extends StObject {
  
  var aggregations: Record[String, AggregationsAggregationContainer]
  
  var authorization: js.UndefOr[MlDatafeedAuthorization] = js.undefined
  
  var chunking_config: MlChunkingConfig
  
  var datafeed_id: Id
  
  var delayed_data_check_config: js.UndefOr[MlDelayedDataCheckConfig] = js.undefined
  
  var frequency: Duration
  
  var indices: js.Array[String]
  
  var indices_options: js.UndefOr[IndicesOptions] = js.undefined
  
  var job_id: Id
  
  var max_empty_searches: integer
  
  var query: QueryDslQueryContainer
  
  var query_delay: Duration
  
  var runtime_mappings: js.UndefOr[MappingRuntimeFields] = js.undefined
  
  var script_fields: js.UndefOr[Record[String, ScriptField]] = js.undefined
  
  var scroll_size: integer
}
object MlPutDatafeedResponse {
  
  inline def apply(
    aggregations: Record[String, AggregationsAggregationContainer],
    chunking_config: MlChunkingConfig,
    datafeed_id: Id,
    frequency: Duration,
    indices: js.Array[String],
    job_id: Id,
    max_empty_searches: integer,
    query: QueryDslQueryContainer,
    query_delay: Duration,
    scroll_size: integer
  ): MlPutDatafeedResponse = {
    val __obj = js.Dynamic.literal(aggregations = aggregations.asInstanceOf[js.Any], chunking_config = chunking_config.asInstanceOf[js.Any], datafeed_id = datafeed_id.asInstanceOf[js.Any], frequency = frequency.asInstanceOf[js.Any], indices = indices.asInstanceOf[js.Any], job_id = job_id.asInstanceOf[js.Any], max_empty_searches = max_empty_searches.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], query_delay = query_delay.asInstanceOf[js.Any], scroll_size = scroll_size.asInstanceOf[js.Any])
    __obj.asInstanceOf[MlPutDatafeedResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MlPutDatafeedResponse] (val x: Self) extends AnyVal {
    
    inline def setAggregations(value: Record[String, AggregationsAggregationContainer]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAuthorization(value: MlDatafeedAuthorization): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationUndefined: Self = StObject.set(x, "authorization", js.undefined)
    
    inline def setChunking_config(value: MlChunkingConfig): Self = StObject.set(x, "chunking_config", value.asInstanceOf[js.Any])
    
    inline def setDatafeed_id(value: Id): Self = StObject.set(x, "datafeed_id", value.asInstanceOf[js.Any])
    
    inline def setDelayed_data_check_config(value: MlDelayedDataCheckConfig): Self = StObject.set(x, "delayed_data_check_config", value.asInstanceOf[js.Any])
    
    inline def setDelayed_data_check_configUndefined: Self = StObject.set(x, "delayed_data_check_config", js.undefined)
    
    inline def setFrequency(value: Duration): Self = StObject.set(x, "frequency", value.asInstanceOf[js.Any])
    
    inline def setIndices(value: js.Array[String]): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesVarargs(value: String*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setIndices_options(value: IndicesOptions): Self = StObject.set(x, "indices_options", value.asInstanceOf[js.Any])
    
    inline def setIndices_optionsUndefined: Self = StObject.set(x, "indices_options", js.undefined)
    
    inline def setJob_id(value: Id): Self = StObject.set(x, "job_id", value.asInstanceOf[js.Any])
    
    inline def setMax_empty_searches(value: integer): Self = StObject.set(x, "max_empty_searches", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQuery_delay(value: Duration): Self = StObject.set(x, "query_delay", value.asInstanceOf[js.Any])
    
    inline def setRuntime_mappings(value: MappingRuntimeFields): Self = StObject.set(x, "runtime_mappings", value.asInstanceOf[js.Any])
    
    inline def setRuntime_mappingsUndefined: Self = StObject.set(x, "runtime_mappings", js.undefined)
    
    inline def setScript_fields(value: Record[String, ScriptField]): Self = StObject.set(x, "script_fields", value.asInstanceOf[js.Any])
    
    inline def setScript_fieldsUndefined: Self = StObject.set(x, "script_fields", js.undefined)
    
    inline def setScroll_size(value: integer): Self = StObject.set(x, "scroll_size", value.asInstanceOf[js.Any])
  }
}
