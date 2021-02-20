package typings.devextreme.anon

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.PivotGridDataSourceField
import typings.devextreme.mod.DevExpress.ui.dxPivotGrid
import typings.devextreme.mod.DevExpress.ui.dxPivotGridPivotGridCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnFields extends StObject {
  
  var area: js.UndefOr[String] = js.native
  
  var cell: js.UndefOr[dxPivotGridPivotGridCell] = js.native
  
  var cellElement: js.UndefOr[dxElement] = js.native
  
  var columnFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.native
  
  var columnIndex: js.UndefOr[Double] = js.native
  
  var component: js.UndefOr[dxPivotGrid] = js.native
  
  var dataFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.native
  
  var element: js.UndefOr[dxElement] = js.native
  
  var field: js.UndefOr[PivotGridDataSourceField] = js.native
  
  var items: js.UndefOr[js.Array[_]] = js.native
  
  var model: js.UndefOr[js.Any] = js.native
  
  var rowFields: js.UndefOr[js.Array[PivotGridDataSourceField]] = js.native
  
  var rowIndex: js.UndefOr[Double] = js.native
}
object ColumnFields {
  
  @scala.inline
  def apply(): ColumnFields = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnFields]
  }
  
  @scala.inline
  implicit class ColumnFieldsMutableBuilder[Self <: ColumnFields] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArea(value: String): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    @scala.inline
    def setCell(value: dxPivotGridPivotGridCell): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellElement(value: dxElement): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellElementUndefined: Self = StObject.set(x, "cellElement", js.undefined)
    
    @scala.inline
    def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    @scala.inline
    def setColumnFields(value: js.Array[PivotGridDataSourceField]): Self = StObject.set(x, "columnFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnFieldsUndefined: Self = StObject.set(x, "columnFields", js.undefined)
    
    @scala.inline
    def setColumnFieldsVarargs(value: PivotGridDataSourceField*): Self = StObject.set(x, "columnFields", js.Array(value :_*))
    
    @scala.inline
    def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
    
    @scala.inline
    def setComponent(value: dxPivotGrid): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    @scala.inline
    def setDataFields(value: js.Array[PivotGridDataSourceField]): Self = StObject.set(x, "dataFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataFieldsUndefined: Self = StObject.set(x, "dataFields", js.undefined)
    
    @scala.inline
    def setDataFieldsVarargs(value: PivotGridDataSourceField*): Self = StObject.set(x, "dataFields", js.Array(value :_*))
    
    @scala.inline
    def setElement(value: dxElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setField(value: PivotGridDataSourceField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    @scala.inline
    def setItems(value: js.Array[_]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: js.Any*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    @scala.inline
    def setRowFields(value: js.Array[PivotGridDataSourceField]): Self = StObject.set(x, "rowFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowFieldsUndefined: Self = StObject.set(x, "rowFields", js.undefined)
    
    @scala.inline
    def setRowFieldsVarargs(value: PivotGridDataSourceField*): Self = StObject.set(x, "rowFields", js.Array(value :_*))
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
  }
}
