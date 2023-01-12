package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchFieldCollapse extends StObject {
  
  var collapse: js.UndefOr[SearchFieldCollapse] = js.undefined
  
  var field: Field
  
  var inner_hits: js.UndefOr[SearchInnerHits | js.Array[SearchInnerHits]] = js.undefined
  
  var max_concurrent_group_searches: js.UndefOr[integer] = js.undefined
}
object SearchFieldCollapse {
  
  inline def apply(field: Field): SearchFieldCollapse = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFieldCollapse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchFieldCollapse] (val x: Self) extends AnyVal {
    
    inline def setCollapse(value: SearchFieldCollapse): Self = StObject.set(x, "collapse", value.asInstanceOf[js.Any])
    
    inline def setCollapseUndefined: Self = StObject.set(x, "collapse", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setInner_hits(value: SearchInnerHits | js.Array[SearchInnerHits]): Self = StObject.set(x, "inner_hits", value.asInstanceOf[js.Any])
    
    inline def setInner_hitsUndefined: Self = StObject.set(x, "inner_hits", js.undefined)
    
    inline def setInner_hitsVarargs(value: SearchInnerHits*): Self = StObject.set(x, "inner_hits", js.Array(value*))
    
    inline def setMax_concurrent_group_searches(value: integer): Self = StObject.set(x, "max_concurrent_group_searches", value.asInstanceOf[js.Any])
    
    inline def setMax_concurrent_group_searchesUndefined: Self = StObject.set(x, "max_concurrent_group_searches", js.undefined)
  }
}
