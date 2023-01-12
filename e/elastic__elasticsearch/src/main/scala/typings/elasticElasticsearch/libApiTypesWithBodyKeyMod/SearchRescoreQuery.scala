package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchRescoreQuery extends StObject {
  
  var query_weight: js.UndefOr[double] = js.undefined
  
  var rescore_query: QueryDslQueryContainer
  
  var rescore_query_weight: js.UndefOr[double] = js.undefined
  
  var score_mode: js.UndefOr[SearchScoreMode] = js.undefined
}
object SearchRescoreQuery {
  
  inline def apply(rescore_query: QueryDslQueryContainer): SearchRescoreQuery = {
    val __obj = js.Dynamic.literal(rescore_query = rescore_query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchRescoreQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchRescoreQuery] (val x: Self) extends AnyVal {
    
    inline def setQuery_weight(value: double): Self = StObject.set(x, "query_weight", value.asInstanceOf[js.Any])
    
    inline def setQuery_weightUndefined: Self = StObject.set(x, "query_weight", js.undefined)
    
    inline def setRescore_query(value: QueryDslQueryContainer): Self = StObject.set(x, "rescore_query", value.asInstanceOf[js.Any])
    
    inline def setRescore_query_weight(value: double): Self = StObject.set(x, "rescore_query_weight", value.asInstanceOf[js.Any])
    
    inline def setRescore_query_weightUndefined: Self = StObject.set(x, "rescore_query_weight", js.undefined)
    
    inline def setScore_mode(value: SearchScoreMode): Self = StObject.set(x, "score_mode", value.asInstanceOf[js.Any])
    
    inline def setScore_modeUndefined: Self = StObject.set(x, "score_mode", js.undefined)
  }
}
