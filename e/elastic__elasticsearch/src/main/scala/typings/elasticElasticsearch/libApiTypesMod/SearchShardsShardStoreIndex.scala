package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchShardsShardStoreIndex extends StObject {
  
  var aliases: js.UndefOr[js.Array[Name]] = js.undefined
  
  var filter: js.UndefOr[QueryDslQueryContainer] = js.undefined
}
object SearchShardsShardStoreIndex {
  
  inline def apply(): SearchShardsShardStoreIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchShardsShardStoreIndex]
  }
  
  extension [Self <: SearchShardsShardStoreIndex](x: Self) {
    
    inline def setAliases(value: js.Array[Name]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setAliasesVarargs(value: Name*): Self = StObject.set(x, "aliases", js.Array(value*))
    
    inline def setFilter(value: QueryDslQueryContainer): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
  }
}
