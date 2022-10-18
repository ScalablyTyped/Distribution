package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlTranslateResponse extends StObject {
  
  var _source: js.UndefOr[SearchSourceConfig] = js.undefined
  
  var aggregations: js.UndefOr[Record[String, AggregationsAggregationContainer]] = js.undefined
  
  var fields: js.UndefOr[js.Array[QueryDslFieldAndFormat | Field]] = js.undefined
  
  var query: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var size: js.UndefOr[long] = js.undefined
  
  var sort: js.UndefOr[Sort] = js.undefined
}
object SqlTranslateResponse {
  
  inline def apply(): SqlTranslateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlTranslateResponse]
  }
  
  extension [Self <: SqlTranslateResponse](x: Self) {
    
    inline def setAggregations(value: Record[String, AggregationsAggregationContainer]): Self = StObject.set(x, "aggregations", value.asInstanceOf[js.Any])
    
    inline def setAggregationsUndefined: Self = StObject.set(x, "aggregations", js.undefined)
    
    inline def setFields(value: js.Array[QueryDslFieldAndFormat | Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setFieldsVarargs(value: (QueryDslFieldAndFormat | Field)*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setSize(value: long): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSort(value: Sort): Self = StObject.set(x, "sort", value.asInstanceOf[js.Any])
    
    inline def setSortUndefined: Self = StObject.set(x, "sort", js.undefined)
    
    inline def setSortVarargs(value: SortCombinations*): Self = StObject.set(x, "sort", js.Array(value*))
    
    inline def set_source(value: SearchSourceConfig): Self = StObject.set(x, "_source", value.asInstanceOf[js.Any])
    
    inline def set_sourceUndefined: Self = StObject.set(x, "_source", js.undefined)
    
    inline def set_sourceVarargs(value: Field*): Self = StObject.set(x, "_source", js.Array(value*))
  }
}
