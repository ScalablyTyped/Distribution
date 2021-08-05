package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxDiagram
import typings.devextreme.mod.DevExpress.ui.dxDiagramItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementItems extends StObject {
  
  var component: js.UndefOr[dxDiagram] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var items: js.UndefOr[js.Array[dxDiagramItem]] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
}
object ElementItems {
  
  inline def apply(): ElementItems = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementItems]
  }
  
  extension [Self <: ElementItems](x: Self) {
    
    inline def setComponent(value: dxDiagram): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setItems(value: js.Array[dxDiagramItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: dxDiagramItem*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
