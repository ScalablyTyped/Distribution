package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxDataGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnColumnIndex extends StObject {
  
  var column: js.UndefOr[this.type] = js.undefined
  
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  var component: js.UndefOr[dxDataGrid] = js.undefined
}
object ColumnColumnIndex {
  
  inline def apply(): ColumnColumnIndex = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnColumnIndex]
  }
  
  extension [Self <: ColumnColumnIndex](x: Self) {
    
    inline def setColumn(value: ColumnColumnIndex): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setComponent(value: dxDataGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
