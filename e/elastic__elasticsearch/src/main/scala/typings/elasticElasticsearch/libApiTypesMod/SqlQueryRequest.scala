package typings.elasticElasticsearch.libApiTypesMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SqlQueryRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var catalog: js.UndefOr[String] = js.undefined
  
  var columnar: js.UndefOr[Boolean] = js.undefined
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var fetch_size: js.UndefOr[integer] = js.undefined
  
  var field_multi_value_leniency: js.UndefOr[Boolean] = js.undefined
  
  var filter: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
  
  var index_using_frozen: js.UndefOr[Boolean] = js.undefined
  
  var keep_alive: js.UndefOr[Duration] = js.undefined
  
  var keep_on_completion: js.UndefOr[Boolean] = js.undefined
  
  var page_timeout: js.UndefOr[Duration] = js.undefined
  
  var params: js.UndefOr[Record[String, Any]] = js.undefined
  
  var query: js.UndefOr[String] = js.undefined
  
  var request_timeout: js.UndefOr[Duration] = js.undefined
  
  var runtime_mappings: js.UndefOr[MappingRuntimeFields] = js.undefined
  
  var time_zone: js.UndefOr[TimeZone] = js.undefined
  
  var wait_for_completion_timeout: js.UndefOr[Duration] = js.undefined
}
object SqlQueryRequest {
  
  inline def apply(): SqlQueryRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SqlQueryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SqlQueryRequest] (val x: Self) extends AnyVal {
    
    inline def setCatalog(value: String): Self = StObject.set(x, "catalog", value.asInstanceOf[js.Any])
    
    inline def setCatalogUndefined: Self = StObject.set(x, "catalog", js.undefined)
    
    inline def setColumnar(value: Boolean): Self = StObject.set(x, "columnar", value.asInstanceOf[js.Any])
    
    inline def setColumnarUndefined: Self = StObject.set(x, "columnar", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setFetch_size(value: integer): Self = StObject.set(x, "fetch_size", value.asInstanceOf[js.Any])
    
    inline def setFetch_sizeUndefined: Self = StObject.set(x, "fetch_size", js.undefined)
    
    inline def setField_multi_value_leniency(value: Boolean): Self = StObject.set(x, "field_multi_value_leniency", value.asInstanceOf[js.Any])
    
    inline def setField_multi_value_leniencyUndefined: Self = StObject.set(x, "field_multi_value_leniency", js.undefined)
    
    inline def setFilter(value: QueryDslQueryContainer): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setIndex_using_frozen(value: Boolean): Self = StObject.set(x, "index_using_frozen", value.asInstanceOf[js.Any])
    
    inline def setIndex_using_frozenUndefined: Self = StObject.set(x, "index_using_frozen", js.undefined)
    
    inline def setKeep_alive(value: Duration): Self = StObject.set(x, "keep_alive", value.asInstanceOf[js.Any])
    
    inline def setKeep_aliveUndefined: Self = StObject.set(x, "keep_alive", js.undefined)
    
    inline def setKeep_on_completion(value: Boolean): Self = StObject.set(x, "keep_on_completion", value.asInstanceOf[js.Any])
    
    inline def setKeep_on_completionUndefined: Self = StObject.set(x, "keep_on_completion", js.undefined)
    
    inline def setPage_timeout(value: Duration): Self = StObject.set(x, "page_timeout", value.asInstanceOf[js.Any])
    
    inline def setPage_timeoutUndefined: Self = StObject.set(x, "page_timeout", js.undefined)
    
    inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setQuery(value: String): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    inline def setRequest_timeout(value: Duration): Self = StObject.set(x, "request_timeout", value.asInstanceOf[js.Any])
    
    inline def setRequest_timeoutUndefined: Self = StObject.set(x, "request_timeout", js.undefined)
    
    inline def setRuntime_mappings(value: MappingRuntimeFields): Self = StObject.set(x, "runtime_mappings", value.asInstanceOf[js.Any])
    
    inline def setRuntime_mappingsUndefined: Self = StObject.set(x, "runtime_mappings", js.undefined)
    
    inline def setTime_zone(value: TimeZone): Self = StObject.set(x, "time_zone", value.asInstanceOf[js.Any])
    
    inline def setTime_zoneUndefined: Self = StObject.set(x, "time_zone", js.undefined)
    
    inline def setWait_for_completion_timeout(value: Duration): Self = StObject.set(x, "wait_for_completion_timeout", value.asInstanceOf[js.Any])
    
    inline def setWait_for_completion_timeoutUndefined: Self = StObject.set(x, "wait_for_completion_timeout", js.undefined)
  }
}
