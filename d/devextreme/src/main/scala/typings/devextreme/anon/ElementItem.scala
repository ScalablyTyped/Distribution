package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxDiagram
import typings.devextreme.mod.DevExpress.ui.dxDiagramItem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElementItem extends StObject {
  
  var component: js.UndefOr[dxDiagram] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var item: js.UndefOr[dxDiagramItem] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
}
object ElementItem {
  
  @scala.inline
  def apply(): ElementItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementItem]
  }
  
  @scala.inline
  implicit class ElementItemMutableBuilder[Self <: ElementItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxDiagram): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setItem(value: dxDiagramItem): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
  }
}
