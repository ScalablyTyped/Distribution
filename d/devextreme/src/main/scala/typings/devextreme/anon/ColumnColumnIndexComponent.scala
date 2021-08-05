package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.ui.dxTreeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnColumnIndexComponent extends StObject {
  
  var column: js.UndefOr[this.type] = js.undefined
  
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  var component: js.UndefOr[dxTreeList] = js.undefined
}
object ColumnColumnIndexComponent {
  
  inline def apply(): ColumnColumnIndexComponent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnColumnIndexComponent]
  }
  
  extension [Self <: ColumnColumnIndexComponent](x: Self) {
    
    inline def setColumn(value: ColumnColumnIndexComponent): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
    
    inline def setComponent(value: dxTreeList): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
  }
}
