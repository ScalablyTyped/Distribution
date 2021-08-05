package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.PivotGridDataSourceField
import typings.devextreme.mod.DevExpress.ui.dxPivotGrid
import typings.devextreme.mod.DevExpress.ui.dxPivotGridPivotGridCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnFields extends StObject {
  
  var area: js.UndefOr[String] = js.undefined
  
  var cell: js.UndefOr[dxPivotGridPivotGridCell] = js.undefined
  
  var cellElement: js.UndefOr[dxElement] = js.undefined
  
  var columnFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.undefined
  
  var columnIndex: js.UndefOr[Double] = js.undefined
  
  var component: js.UndefOr[dxPivotGrid] = js.undefined
  
  var dataFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.undefined
  
  var element: js.UndefOr[dxElement] = js.undefined
  
  var field: js.UndefOr[PivotGridDataSourceField] = js.undefined
  
  var items: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  var model: js.UndefOr[js.Any] = js.undefined
  
  var rowFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.undefined
  
  var rowIndex: js.UndefOr[Double] = js.undefined
}
object ColumnFields {
  
  inline def apply(): ColumnFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFields]
  }
  
  extension [Self <: ColumnFields](x: Self) {
    
    inline def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    inline def setCell(value: dxPivotGridPivotGridCell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setCellElement(value: dxElement): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
    
    inline def setCellElementUndefined: Self = StObject.set(x, "cellElement", js.undefined)
    
    inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    inline def setColumnFields(value: js.Array[PivotGridDataSourceField]): Self = StObject.set(x, "columnFields", value.asInstanceOf[js.Any])
    
    inline def setColumnFieldsUndefined: Self = StObject.set(x, "columnFields", js.undefined)
    
    inline def setColumnFieldsVarargs(value: PivotGridDataSourceField*): Self = StObject.set(x, "columnFields", js.Array(value :_*))
    
    inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    inline def setComponent(value: dxPivotGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setDataFields(value: js.Array[PivotGridDataSourceField]): Self = StObject.set(x, "dataFields", value.asInstanceOf[js.Any])
    
    inline def setDataFieldsUndefined: Self = StObject.set(x, "dataFields", js.undefined)
    
    inline def setDataFieldsVarargs(value: PivotGridDataSourceField*): Self = StObject.set(x, "dataFields", js.Array(value :_*))
    
    inline def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    inline def setField(value: PivotGridDataSourceField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setItems(value: js.Array[js.Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    inline def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setRowFields(value: js.Array[PivotGridDataSourceField]): Self = StObject.set(x, "rowFields", value.asInstanceOf[js.Any])
    
    inline def setRowFieldsUndefined: Self = StObject.set(x, "rowFields", js.undefined)
    
    inline def setRowFieldsVarargs(value: PivotGridDataSourceField*): Self = StObject.set(x, "rowFields", js.Array(value :_*))
    
    inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
