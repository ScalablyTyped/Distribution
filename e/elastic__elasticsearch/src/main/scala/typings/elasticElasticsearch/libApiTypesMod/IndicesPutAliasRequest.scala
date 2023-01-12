package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesPutAliasRequest
  extends StObject
     with SpecUtilsCommonQueryParameters {
  
  var filter: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var index: Indices
  
  var index_routing: js.UndefOr[Routing] = js.undefined
  
  var is_write_index: js.UndefOr[Boolean] = js.undefined
  
  var master_timeout: js.UndefOr[Duration] = js.undefined
  
  var name: Name
  
  var routing: js.UndefOr[Routing] = js.undefined
  
  var search_routing: js.UndefOr[Routing] = js.undefined
  
  var timeout: js.UndefOr[Duration] = js.undefined
}
object IndicesPutAliasRequest {
  
  inline def apply(index: Indices, name: Name): IndicesPutAliasRequest = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndicesPutAliasRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesPutAliasRequest] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: QueryDslQueryContainer): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setIndex(value: Indices): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexVarargs(value: IndexName*): Self = StObject.set(x, "index", js.Array(value*))
    
    inline def setIndex_routing(value: Routing): Self = StObject.set(x, "index_routing", value.asInstanceOf[js.Any])
    
    inline def setIndex_routingUndefined: Self = StObject.set(x, "index_routing", js.undefined)
    
    inline def setIs_write_index(value: Boolean): Self = StObject.set(x, "is_write_index", value.asInstanceOf[js.Any])
    
    inline def setIs_write_indexUndefined: Self = StObject.set(x, "is_write_index", js.undefined)
    
    inline def setMaster_timeout(value: Duration): Self = StObject.set(x, "master_timeout", value.asInstanceOf[js.Any])
    
    inline def setMaster_timeoutUndefined: Self = StObject.set(x, "master_timeout", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRouting(value: Routing): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setSearch_routing(value: Routing): Self = StObject.set(x, "search_routing", value.asInstanceOf[js.Any])
    
    inline def setSearch_routingUndefined: Self = StObject.set(x, "search_routing", js.undefined)
    
    inline def setTimeout(value: Duration): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
  }
}
