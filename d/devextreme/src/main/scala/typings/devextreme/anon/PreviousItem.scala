package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxDropDownButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviousItem extends StObject {
  
  var component: js.UndefOr[dxDropDownButton] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var item: js.UndefOr[js.Any] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var previousItem: js.UndefOr[js.Any] = js.native
}
object PreviousItem {
  
  @scala.inline
  def apply(): PreviousItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviousItem]
  }
  
  @scala.inline
  implicit class PreviousItemMutableBuilder[Self <: PreviousItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxDropDownButton): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setItem(value: js.Any): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemUndefined: Self = StObject.set(x, "item", js.undefined)
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setPreviousItem(value: js.Any): Self = StObject.set(x, "previousItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousItemUndefined: Self = StObject.set(x, "previousItem", js.undefined)
  }
}
