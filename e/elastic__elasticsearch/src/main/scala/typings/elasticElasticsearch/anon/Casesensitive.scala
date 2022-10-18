package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.EqlSearchResultPosition
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Field
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingRuntimeFields
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.QueryDslFieldAndFormat
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.QueryDslQueryContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.uint
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Casesensitive extends StObject {
  
  var case_sensitive: js.UndefOr[Boolean] = js.undefined
  
  var event_category_field: js.UndefOr[Field] = js.undefined
  
  var fetch_size: js.UndefOr[uint] = js.undefined
  
  var fields: js.UndefOr[QueryDslFieldAndFormat | Field | (js.Array[QueryDslFieldAndFormat | Field])] = js.undefined
  
  var filter: js.UndefOr[QueryDslQueryContainer | js.Array[QueryDslQueryContainer]] = js.undefined
  
  var keep_alive: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration] = js.undefined
  
  var keep_on_completion: js.UndefOr[Boolean] = js.undefined
  
  var query: String
  
  var result_position: js.UndefOr[EqlSearchResultPosition] = js.undefined
  
  var runtime_mappings: js.UndefOr[MappingRuntimeFields] = js.undefined
  
  var size: js.UndefOr[uint] = js.undefined
  
  var tiebreaker_field: js.UndefOr[Field] = js.undefined
  
  var timestamp_field: js.UndefOr[Field] = js.undefined
  
  var wait_for_completion_timeout: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration] = js.undefined
}
object Casesensitive {
  
  inline def apply(query: String): Casesensitive = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[Casesensitive]
  }
  
  extension [Self <: Casesensitive](x: Self) {
    
    inline def setCase_sensitive(value: Boolean): Self = StObject.set(x, "case_sensitive", value.asInstanceOf[js.Any])
    
    inline def setCase_sensitiveUndefined: Self = StObject.set(x, "case_sensitive", js.undefined)
    
    inline def setEvent_category_field(value: Field): Self = StObject.set(x, "event_category_field", value.asInstanceOf[js.Any])
    
    inline def setEvent_category_fieldUndefined: Self = StObject.set(x, "event_category_field", js.undefined)
    
    inline def setFetch_size(value: uint): Self = StObject.set(x, "fetch_size", value.asInstanceOf[js.Any])
    
    inline def setFetch_sizeUndefined: Self = StObject.set(x, "fetch_size", js.undefined)
    
    inline def setFields(value: QueryDslFieldAndFormat | Field | (js.Array[QueryDslFieldAndFormat | Field])): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: (QueryDslFieldAndFormat | Field)*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setFilter(value: QueryDslQueryContainer | js.Array[QueryDslQueryContainer]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: QueryDslQueryContainer*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setKeep_alive(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration): Self = StObject.set(x, "keep_alive", value.asInstanceOf[js.Any])
    
    inline def setKeep_aliveUndefined: Self = StObject.set(x, "keep_alive", js.undefined)
    
    inline def setKeep_on_completion(value: Boolean): Self = StObject.set(x, "keep_on_completion", value.asInstanceOf[js.Any])
    
    inline def setKeep_on_completionUndefined: Self = StObject.set(x, "keep_on_completion", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setResult_position(value: EqlSearchResultPosition): Self = StObject.set(x, "result_position", value.asInstanceOf[js.Any])
    
    inline def setResult_positionUndefined: Self = StObject.set(x, "result_position", js.undefined)
    
    inline def setRuntime_mappings(value: MappingRuntimeFields): Self = StObject.set(x, "runtime_mappings", value.asInstanceOf[js.Any])
    
    inline def setRuntime_mappingsUndefined: Self = StObject.set(x, "runtime_mappings", js.undefined)
    
    inline def setSize(value: uint): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTiebreaker_field(value: Field): Self = StObject.set(x, "tiebreaker_field", value.asInstanceOf[js.Any])
    
    inline def setTiebreaker_fieldUndefined: Self = StObject.set(x, "tiebreaker_field", js.undefined)
    
    inline def setTimestamp_field(value: Field): Self = StObject.set(x, "timestamp_field", value.asInstanceOf[js.Any])
    
    inline def setTimestamp_fieldUndefined: Self = StObject.set(x, "timestamp_field", js.undefined)
    
    inline def setWait_for_completion_timeout(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Duration): Self = StObject.set(x, "wait_for_completion_timeout", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completion_timeoutUndefined: Self = StObject.set(x, "wait_for_completion_timeout", js.undefined)
  }
}
