package typings.devextreme.mod.DevExpress.common.grids

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterPanelCustomizeTextArg[TComponent] extends StObject {
  
  val component: TComponent
  
  val filterValue: Any
  
  val text: String
}
object FilterPanelCustomizeTextArg {
  
  inline def apply[TComponent](component: TComponent, filterValue: Any, text: String): FilterPanelCustomizeTextArg[TComponent] = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], filterValue = filterValue.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterPanelCustomizeTextArg[TComponent]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterPanelCustomizeTextArg[?], TComponent] (val x: Self & FilterPanelCustomizeTextArg[TComponent]) extends AnyVal {
    
    inline def setComponent(value: TComponent): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setFilterValue(value: Any): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
