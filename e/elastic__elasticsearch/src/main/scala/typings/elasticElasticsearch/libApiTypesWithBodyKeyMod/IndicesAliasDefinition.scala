package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesAliasDefinition extends StObject {
  
  var filter: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var index_routing: js.UndefOr[String] = js.undefined
  
  var is_hidden: js.UndefOr[Boolean] = js.undefined
  
  var is_write_index: js.UndefOr[Boolean] = js.undefined
  
  var routing: js.UndefOr[String] = js.undefined
  
  var search_routing: js.UndefOr[String] = js.undefined
}
object IndicesAliasDefinition {
  
  inline def apply(): IndicesAliasDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesAliasDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesAliasDefinition] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: QueryDslQueryContainer): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setIndex_routing(value: String): Self = StObject.set(x, "index_routing", value.asInstanceOf[js.Any])
    
    inline def setIndex_routingUndefined: Self = StObject.set(x, "index_routing", js.undefined)
    
    inline def setIs_hidden(value: Boolean): Self = StObject.set(x, "is_hidden", value.asInstanceOf[js.Any])
    
    inline def setIs_hiddenUndefined: Self = StObject.set(x, "is_hidden", js.undefined)
    
    inline def setIs_write_index(value: Boolean): Self = StObject.set(x, "is_write_index", value.asInstanceOf[js.Any])
    
    inline def setIs_write_indexUndefined: Self = StObject.set(x, "is_write_index", js.undefined)
    
    inline def setRouting(value: String): Self = StObject.set(x, "routing", value.asInstanceOf[js.Any])
    
    inline def setRoutingUndefined: Self = StObject.set(x, "routing", js.undefined)
    
    inline def setSearch_routing(value: String): Self = StObject.set(x, "search_routing", value.asInstanceOf[js.Any])
    
    inline def setSearch_routingUndefined: Self = StObject.set(x, "search_routing", js.undefined)
  }
}
