package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.ui.dxGantt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectedRowKey extends StObject {
  
  var component: js.UndefOr[dxGantt] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var selectedRowKey: js.UndefOr[js.Any] = js.undefined
}
object SelectedRowKey {
  
  @scala.inline
  def apply(): SelectedRowKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectedRowKey]
  }
  
  @scala.inline
  implicit class SelectedRowKeyMutableBuilder[Self <: SelectedRowKey] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxGantt): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
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
    def setSelectedRowKey(value: js.Any): Self = StObject.set(x, "selectedRowKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedRowKeyUndefined: Self = StObject.set(x, "selectedRowKey", js.undefined)
  }
}
