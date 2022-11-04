package typings.elasticElasticsearch.anon

import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.AggregationsAggregationContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Field
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingRuntimeFields
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.QueryDslQueryContainer
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchMvtGridType
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SearchTrackHits
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Sort
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.SortCombinations
import typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.integer
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exactbounds extends StObject {
  
  var aggs: js.UndefOr[Record[String, AggregationsAggregationContainer]] = js.undefined
  
  var exact_bounds: js.UndefOr[Boolean] = js.undefined
  
  var extent: js.UndefOr[integer] = js.undefined
  
  var fields: js.UndefOr[typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Fields] = js.undefined
  
  var grid_precision: js.UndefOr[integer] = js.undefined
  
  var grid_type: js.UndefOr[SearchMvtGridType] = js.undefined
  
  var query: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var runtime_mappings: js.UndefOr[MappingRuntimeFields] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
  
  var sort: js.UndefOr[Sort] = js.undefined
  
  var track_total_hits: js.UndefOr[SearchTrackHits] = js.undefined
}
object Exactbounds {
  
  inline def apply(): Exactbounds = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exactbounds]
  }
  
  extension [Self <: Exactbounds](x: Self) {
    
    inline def setAggs(value: Record[String, AggregationsAggregationContainer]): Self = StObject.set(x, "aggs", value.asInstanceOf[js.Any])
    
    inline def setAggsUndefined: Self = StObject.set(x, "aggs", js.undefined)
    
    inline def setExact_bounds(value: Boolean): Self = StObject.set(x, "exact_bounds", value.asInstanceOf[js.Any])
    
    inline def setExact_boundsUndefined: Self = StObject.set(x, "exact_bounds", js.undefined)
    
    inline def setExtent(value: integer): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setFields(value: typings.elasticElasticsearch.libApiTypesWithBodyKeyMod.Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setGrid_precision(value: integer): Self = StObject.set(x, "grid_precision", value.asInstanceOf[js.Any])
    
    inline def setGrid_precisionUndefined: Self = StObject.set(x, "grid_precision", js.undefined)
    
    inline def setGrid_type(value: SearchMvtGridType): Self = StObject.set(x, "grid_type", value.asInstanceOf[js.Any])
    
    inline def setGrid_typeUndefined: Self = StObject.set(x, "grid_type", js.undefined)
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRuntime_mappings(value: MappingRuntimeFields): Self = StObject.set(x, "runtime_mappings", value.asInstanceOf[js.Any])
    
    inline def setRuntime_mappingsUndefined: Self = StObject.set(x, "runtime_mappings", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSort(value: Sort): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: SortCombinations*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def setTrack_total_hits(value: SearchTrackHits): Self = StObject.set(x, "track_total_hits", value.asInstanceOf[js.Any])
    
    inline def setTrack_total_hitsUndefined: Self = StObject.set(x, "track_total_hits", js.undefined)
  }
}
