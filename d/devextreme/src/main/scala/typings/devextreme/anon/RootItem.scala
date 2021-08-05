package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxMenu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootItem extends StObject {
  
  var component: js.UndefOr[dxMenu] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var rootItem: js.UndefOr[dxElement] = js.undefined
}
object RootItem {
  
  inline def apply(): RootItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RootItem]
  }
  
  extension [Self <: RootItem](x: Self) {
    
    inline def setComponent(value: dxMenu): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setRootItem(value: dxElement): Self = StObject.set(x, "rootItem", value.asInstanceOf[js.Any])
    
    inline def setRootItemUndefined: Self = StObject.set(x, "rootItem", js.undefined)
  }
}
