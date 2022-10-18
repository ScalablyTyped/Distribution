package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslHasParentQuery
  extends StObject
     with QueryDslQueryBase {
  
  var ignore_unmapped: js.UndefOr[Boolean] = js.undefined
  
  var inner_hits: js.UndefOr[SearchInnerHits] = js.undefined
  
  var parent_type: RelationName
  
  var query: QueryDslQueryContainer
  
  var score: js.UndefOr[Boolean] = js.undefined
}
object QueryDslHasParentQuery {
  
  inline def apply(parent_type: RelationName, query: QueryDslQueryContainer): QueryDslHasParentQuery = {
    val __obj = js.Dynamic.literal(parent_type = parent_type.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslHasParentQuery]
  }
  
  extension [Self <: QueryDslHasParentQuery](x: Self) {
    
    inline def setIgnore_unmapped(value: Boolean): Self = StObject.set(x, "ignore_unmapped", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unmappedUndefined: Self = StObject.set(x, "ignore_unmapped", js.undefined)
    
    inline def setInner_hits(value: SearchInnerHits): Self = StObject.set(x, "inner_hits", value.asInstanceOf[js.Any])
    
    inline def setInner_hitsUndefined: Self = StObject.set(x, "inner_hits", js.undefined)
    
    inline def setParent_type(value: RelationName): Self = StObject.set(x, "parent_type", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setScore(value: Boolean): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
    
    inline def setScoreUndefined: Self = StObject.set(x, "score", js.undefined)
  }
}
