package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.data.FilterDescriptor
import typings.devextreme.mod.DevExpress.data.GroupDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filter[TItem] extends StObject {
  
  var filter: js.UndefOr[FilterDescriptor | js.Array[FilterDescriptor]] = js.undefined
  
  var group: js.UndefOr[GroupDescriptor[TItem] | js.Array[GroupDescriptor[TItem]]] = js.undefined
}
object Filter {
  
  inline def apply[TItem](): Filter[TItem] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter[TItem]]
  }
  
  extension [Self <: Filter[?], TItem](x: Self & Filter[TItem]) {
    
    inline def setFilter(value: FilterDescriptor | js.Array[FilterDescriptor]): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
    
    inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
    
    inline def setFilterVarargs(value: FilterDescriptor*): Self = StObject.set(x, "filter", js.Array(value*))
    
    inline def setGroup(value: GroupDescriptor[TItem] | js.Array[GroupDescriptor[TItem]]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupFunction1(value: TItem => String | Double | js.Date | js.Object): Self = StObject.set(x, "group", js.Any.fromFunction1(value))
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setGroupVarargs(value: GroupDescriptor[TItem]*): Self = StObject.set(x, "group", js.Array(value*))
  }
}
