package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryDslHasChildQuery
  extends StObject
     with QueryDslQueryBase {
  
  var ignore_unmapped: js.UndefOr[Boolean] = js.undefined
  
  var inner_hits: js.UndefOr[SearchInnerHits] = js.undefined
  
  var max_children: js.UndefOr[integer] = js.undefined
  
  var min_children: js.UndefOr[integer] = js.undefined
  
  var query: QueryDslQueryContainer
  
  var score_mode: js.UndefOr[QueryDslChildScoreMode] = js.undefined
  
  var `type`: RelationName
}
object QueryDslHasChildQuery {
  
  inline def apply(query: QueryDslQueryContainer, `type`: RelationName): QueryDslHasChildQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDslHasChildQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryDslHasChildQuery] (val x: Self) extends AnyVal {
    
    inline def setIgnore_unmapped(value: Boolean): Self = StObject.set(x, "ignore_unmapped", value.asInstanceOf[js.Any])
    
    inline def setIgnore_unmappedUndefined: Self = StObject.set(x, "ignore_unmapped", js.undefined)
    
    inline def setInner_hits(value: SearchInnerHits): Self = StObject.set(x, "inner_hits", value.asInstanceOf[js.Any])
    
    inline def setInner_hitsUndefined: Self = StObject.set(x, "inner_hits", js.undefined)
    
    inline def setMax_children(value: integer): Self = StObject.set(x, "max_children", value.asInstanceOf[js.Any])
    
    inline def setMax_childrenUndefined: Self = StObject.set(x, "max_children", js.undefined)
    
    inline def setMin_children(value: integer): Self = StObject.set(x, "min_children", value.asInstanceOf[js.Any])
    
    inline def setMin_childrenUndefined: Self = StObject.set(x, "min_children", js.undefined)
    
    inline def setQuery(value: QueryDslQueryContainer): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setScore_mode(value: QueryDslChildScoreMode): Self = StObject.set(x, "score_mode", value.asInstanceOf[js.Any])
    
    inline def setScore_modeUndefined: Self = StObject.set(x, "score_mode", js.undefined)
    
    inline def setType(value: RelationName): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
