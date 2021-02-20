package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import typings.devextreme.mod.DevExpress.ui.dxDataGridRowObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComponentRow extends StObject {
  
  var component: js.UndefOr[dxDataGrid] = js.native
  
  var row: js.UndefOr[dxDataGridRowObject] = js.native
}
object ComponentRow {
  
  @scala.inline
  def apply(): ComponentRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentRow]
  }
  
  @scala.inline
  implicit class ComponentRowMutableBuilder[Self <: ComponentRow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponent(value: dxDataGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setRow(value: dxDataGridRowObject): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
  }
}
