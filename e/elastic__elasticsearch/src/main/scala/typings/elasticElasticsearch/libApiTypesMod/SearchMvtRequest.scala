package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchMvtRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var aggs: js.UndefOr[Record[String, AggregationsAggregationContainer]] = js.undefined
  
  var exact_bounds: js.UndefOr[Boolean] = js.undefined
  
  var extent: js.UndefOr[integer] = js.undefined
  
  var field: Field
  
  var fields: js.UndefOr[Fields] = js.undefined
  
  var grid_precision: js.UndefOr[integer] = js.undefined
  
  var grid_type: js.UndefOr[SearchMvtGridType] = js.undefined
  
  var index: Indices
  
  var query: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var runtime_mappings: js.UndefOr[MappingRuntimeFields] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
  
  var sort: js.UndefOr[Sort] = js.undefined
  
  var track_total_hits: js.UndefOr[SearchTrackHits] = js.undefined
  
  var x: SearchMvtCoordinate
  
  var y: SearchMvtCoordinate
  
  var zoom: SearchMvtZoomLevel
}
object SearchMvtRequest {
  
  inline def apply(
    field: Field,
    index: Indices,
    x: SearchMvtCoordinate,
    y: SearchMvtCoordinate,
    zoom: SearchMvtZoomLevel
  ): SearchMvtRequest = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchMvtRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchMvtRequest] (val x: Self) extends AnyVal {
    
    inline def setAggs(value: Record[String, AggregationsAggregationContainer]): Self = StObject.set(x, "aggs", value.asInstanceOf[js.Any])
    
    inline def setAggsUndefined: Self = StObject.set(x, "aggs", js.undefined)
    
    inline def setExact_bounds(value: Boolean): Self = StObject.set(x, "exact_bounds", value.asInstanceOf[js.Any])
    
    inline def setExact_boundsUndefined: Self = StObject.set(x, "exact_bounds", js.undefined)
    
    inline def setExtent(value: integer): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setGrid_precision(value: integer): Self = StObject.set(x, "grid_precision", value.asInstanceOf[js.Any])
    
    inline def setGrid_precisionUndefined: Self = StObject.set(x, "grid_precision", js.undefined)
    
    inline def setGrid_type(value: SearchMvtGridType): Self = StObject.set(x, "grid_type", value.asInstanceOf[js.Any])
    
    inline def setGrid_typeUndefined: Self = StObject.set(x, "grid_type", js.undefined)
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
    
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
    
    inline def setX(value: SearchMvtCoordinate): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: SearchMvtCoordinate): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZoom(value: SearchMvtZoomLevel): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
  }
}
