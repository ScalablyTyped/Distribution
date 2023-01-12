package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NestedSortValue extends StObject {
  
  var filter: js.UndefOr[QueryDslQueryContainer] = js.undefined
  
  var max_children: js.UndefOr[integer] = js.undefined
  
  var nested: js.UndefOr[NestedSortValue] = js.undefined
  
  var path: Field
}
object NestedSortValue {
  
  inline def apply(path: Field): NestedSortValue = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[NestedSortValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NestedSortValue] (val x: Self) extends AnyVal {
    
    inline def setFilter(value: QueryDslQueryContainer): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setMax_children(value: integer): Self = StObject.set(x, "max_children", value.asInstanceOf[js.Any])
    
    inline def setMax_childrenUndefined: Self = StObject.set(x, "max_children", js.undefined)
    
    inline def setNested(value: NestedSortValue): Self = StObject.set(x, "nested", value.asInstanceOf[js.Any])
    
    inline def setNestedUndefined: Self = StObject.set(x, "nested", js.undefined)
    
    inline def setPath(value: Field): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
