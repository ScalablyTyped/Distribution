package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchPhraseSuggestCollate extends StObject {
  
  var params: js.UndefOr[Record[String, Any]] = js.undefined
  
  var prune: js.UndefOr[Boolean] = js.undefined
  
  var query: SearchPhraseSuggestCollateQuery
}
object SearchPhraseSuggestCollate {
  
  inline def apply(query: SearchPhraseSuggestCollateQuery): SearchPhraseSuggestCollate = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchPhraseSuggestCollate]
  }
  
  extension [Self <: SearchPhraseSuggestCollate](x: Self) {
    
    inline def setParams(value: Record[String, Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setPrune(value: Boolean): Self = StObject.set(x, "prune", value.asInstanceOf[js.Any])
    
    inline def setPruneUndefined: Self = StObject.set(x, "prune", js.undefined)
    
    inline def setQuery(value: SearchPhraseSuggestCollateQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
  }
}
