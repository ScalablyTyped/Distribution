package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslNestedQuery
  extends StObject
     with QueryDslQueryBase {
  
  var ignore_unmapped: js.UndefOr[Boolean] = js.undefined
  
  var inner_hits: js.UndefOr[SearchInnerHits] = js.undefined
  
  var path: Field
  
  var query: QueryDslQueryContainer
  
  var score_mode: js.UndefOr[QueryDslChildScoreMode] = js.undefined
}
object QueryDslNestedQuery {
  
  inline def apply(path: Field, query: QueryDslQueryContainer): QueryDslNestedQuery = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslNestedQuery]
  }
  
  extension [Self <: QueryDslNestedQuery](x: Self) {
    
    inline def setIgnore_unmapped(value: Boolean): Self = StObject.set(x, "ignore_unmapped", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unmappedUndefined: Self = StObject.set(x, "ignore_unmapped", js.undefined)
    
    inline def setInner_hits(value: SearchInnerHits): Self = StObject.set(x, "inner_hits", value.asInstanceOf[js.Any])
    
    inline def setInner_hitsUndefined: Self = StObject.set(x, "inner_hits", js.undefined)
    
    inline def setPath(value: Field): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setScore_mode(value: QueryDslChildScoreMode): Self = StObject.set(x, "score_mode", value.asInstanceOf[js.Any])
    
    inline def setScore_modeUndefined: Self = StObject.set(x, "score_mode", js.undefined)
  }
}
