package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxMenu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelRootItem extends StObject {
  
  var cancel: js.UndefOr[Boolean] = js.undefined
  
  var component: js.UndefOr[dxMenu] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var rootItem: js.UndefOr[dxElement] = js.undefined
}
object ModelRootItem {
  
  @scala.inline
  def apply(): ModelRootItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ModelRootItem]
  }
  
  @scala.inline
  implicit class ModelRootItemMutableBuilder[Self <: ModelRootItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
    
    @scala.inline
    def setComponent(value: dxMenu): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setRootItem(value: dxElement): Self = StObject.set(x, "rootItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootItemUndefined: Self = StObject.set(x, "rootItem", js.undefined)
  }
}
