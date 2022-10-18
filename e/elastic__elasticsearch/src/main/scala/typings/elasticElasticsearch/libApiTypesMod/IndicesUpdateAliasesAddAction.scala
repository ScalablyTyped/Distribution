package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesUpdateAliasesAddAction extends StObject {
  
  var alias: js.UndefOr[IndexAlias] = js.undefined
  
  var aliases: js.UndefOr[IndexAlias | js.Array[IndexAlias]] = js.undefined
  
  var filter: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var index: js.UndefOr[IndexName] = js.undefined
  
  var index_routing: js.UndefOr[Routing] = js.undefined
  
  var indices: js.UndefOr[Indices] = js.undefined
  
  var is_hidden: js.UndefOr[Boolean] = js.undefined
  
  var is_write_index: js.UndefOr[Boolean] = js.undefined
  
  var must_exist: js.UndefOr[Boolean] = js.undefined
  
  var routing: js.UndefOr[Routing] = js.undefined
  
  var search_routing: js.UndefOr[Routing] = js.undefined
}
object IndicesUpdateAliasesAddAction {
  
  inline def apply(): IndicesUpdateAliasesAddAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesUpdateAliasesAddAction]
  }
  
  extension [Self <: IndicesUpdateAliasesAddAction](x: Self) {
    
    inline def setAlias(value: IndexAlias): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
    
    inline def setAliases(value: IndexAlias | js.Array[IndexAlias]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: IndexAlias*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setFilter(value: QueryDslQueryContainer): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setIndex_routing(value: Routing): Self = StObject.set(x, "index_routing", value.asInstanceOf[js.Any])
    
    inline def setIndex_routingUndefined: Self = StObject.set(x, "index_routing", js.undefined)
    
    inline def setIndices(value: Indices): Self = StObject.set(x, "indices", value.asInstanceOf[js.Any])
    
    inline def setIndicesUndefined: Self = StObject.set(x, "indices", js.undefined)
    
    inline def setIndicesVarargs(value: IndexName*): Self = StObject.set(x, "indices", js.Array(value*))
    
    inline def setIs_hidden(value: Boolean): Self = StObject.set(x, "is_hidden", value.asInstanceOf[js.Any])
    
    inline def setIs_hiddenUndefined: Self = StObject.set(x, "is_hidden", js.undefined)
    
    inline def setIs_write_index(value: Boolean): Self = StObject.set(x, "is_write_index", value.asInstanceOf[js.Any])
    
    inline def setIs_write_indexUndefined: Self = StObject.set(x, "is_write_index", js.undefined)
    
    inline def setMust_exist(value: Boolean): Self = StObject.set(x, "must_exist", value.asInstanceOf[js.Any])
    
    inline def setMust_existUndefined: Self = StObject.set(x, "must_exist", js.undefined)
    
    inline def setRouting(value: Routing): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setSearch_routing(value: Routing): Self = StObject.set(x, "search_routing", value.asInstanceOf[js.Any])
    
    inline def setSearch_routingUndefined: Self = StObject.set(x, "search_routing", js.undefined)
  }
}
