package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.Column
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnBase
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnButton
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnCellTemplateData
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnEditCellTemplateData
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnGroupCellTemplateData
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnHeaderCellTemplateData
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.DataGridCommandColumnType
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.DataGridPredefinedColumnButton
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxDataGridColumn[TRowData, TKey]
  extends StObject
     with ColumnBase[TRowData] {
  
  /**
    * Specifies whether data from this column should be exported. Applies only if the column is visible.
    */
  var allowExporting: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether the user can group data by values of this column. Applies only when grouping is enabled.
    */
  var allowGrouping: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether groups appear expanded or not when records are grouped by a specific column. Setting this property makes sense only when grouping is allowed for this column.
    */
  var autoExpandGroup: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Allows you to customize buttons in the edit column or create a custom command column. Applies only if the column&apos;s type is &apos;buttons&apos;.
    */
  var buttons: js.UndefOr[js.Array[DataGridPredefinedColumnButton | (ColumnButton[TRowData, TKey])]] = js.undefined
  
  /**
    * Sets custom column values used to group grid records.
    */
  var calculateGroupValue: js.UndefOr[String | (js.Function1[/* rowData */ TRowData, Any])] = js.undefined
  
  /**
    * Specifies a custom template for data cells.
    */
  var cellTemplate: js.UndefOr[
    template | (js.Function2[
      /* cellElement */ DxElement_[HTMLElement], 
      /* cellInfo */ ColumnCellTemplateData[TRowData, TKey], 
      Any
    ])
  ] = js.undefined
  
  /**
    * An array of grid columns.
    */
  var columns: js.UndefOr[js.Array[(Column[TRowData, TKey]) | String]] = js.undefined
  
  /**
    * Specifies a custom template for data cells in editing state.
    */
  var editCellTemplate: js.UndefOr[
    template | (js.Function2[
      /* cellElement */ DxElement_[HTMLElement], 
      /* cellInfo */ ColumnEditCellTemplateData[TRowData, TKey], 
      Any
    ])
  ] = js.undefined
  
  /**
    * Specifies a custom template for group cells (group rows).
    */
  var groupCellTemplate: js.UndefOr[
    template | (js.Function2[
      /* cellElement */ DxElement_[HTMLElement], 
      /* cellInfo */ ColumnGroupCellTemplateData[TRowData, TKey], 
      Any
    ])
  ] = js.undefined
  
  /**
    * Specifies the index of a column when grid records are grouped by the values of this column.
    */
  var groupIndex: js.UndefOr[Double] = js.undefined
  
  /**
    * Specifies a custom template for column headers.
    */
  var headerCellTemplate: js.UndefOr[
    template | (js.Function2[
      /* columnHeader */ DxElement_[HTMLElement], 
      /* headerInfo */ ColumnHeaderCellTemplateData[TRowData, TKey], 
      Any
    ])
  ] = js.undefined
  
  /**
    * Specifies whether or not to display the column when grid records are grouped by it.
    */
  var showWhenGrouped: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies the command column that this object customizes.
    */
  var `type`: js.UndefOr[DataGridCommandColumnType] = js.undefined
}
object dxDataGridColumn {
  
  inline def apply[TRowData, TKey](): dxDataGridColumn[TRowData, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDataGridColumn[TRowData, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxDataGridColumn[?, ?], TRowData, TKey] (val x: Self & (dxDataGridColumn[TRowData, TKey])) extends AnyVal {
    
    inline def setAllowExporting(value: Boolean): Self = StObject.set(x, "allowExporting", value.asInstanceOf[js.Any])
    
    inline def setAllowExportingUndefined: Self = StObject.set(x, "allowExporting", js.undefined)
    
    inline def setAllowGrouping(value: Boolean): Self = StObject.set(x, "allowGrouping", value.asInstanceOf[js.Any])
    
    inline def setAllowGroupingUndefined: Self = StObject.set(x, "allowGrouping", js.undefined)
    
    inline def setAutoExpandGroup(value: Boolean): Self = StObject.set(x, "autoExpandGroup", value.asInstanceOf[js.Any])
    
    inline def setAutoExpandGroupUndefined: Self = StObject.set(x, "autoExpandGroup", js.undefined)
    
    inline def setButtons(value: js.Array[DataGridPredefinedColumnButton | (ColumnButton[TRowData, TKey])]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: (DataGridPredefinedColumnButton | (ColumnButton[TRowData, TKey]))*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setCalculateGroupValue(value: String | (js.Function1[/* rowData */ TRowData, Any])): Self = StObject.set(x, "calculateGroupValue", value.asInstanceOf[js.Any])
    
    inline def setCalculateGroupValueFunction1(value: /* rowData */ TRowData => Any): Self = StObject.set(x, "calculateGroupValue", js.Any.fromFunction1(value))
    
    inline def setCalculateGroupValueUndefined: Self = StObject.set(x, "calculateGroupValue", js.undefined)
    
    inline def setCellTemplate(
      value: template | (js.Function2[
          /* cellElement */ DxElement_[HTMLElement], 
          /* cellInfo */ ColumnCellTemplateData[TRowData, TKey], 
          Any
        ])
    ): Self = StObject.set(x, "cellTemplate", value.asInstanceOf[js.Any])
    
    inline def setCellTemplateFunction2(
      value: (/* cellElement */ DxElement_[HTMLElement], /* cellInfo */ ColumnCellTemplateData[TRowData, TKey]) => Any
    ): Self = StObject.set(x, "cellTemplate", js.Any.fromFunction2(value))
    
    inline def setCellTemplateUndefined: Self = StObject.set(x, "cellTemplate", js.undefined)
    
    inline def setColumns(value: js.Array[(Column[TRowData, TKey]) | String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: ((Column[TRowData, TKey]) | String)*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setEditCellTemplate(
      value: template | (js.Function2[
          /* cellElement */ DxElement_[HTMLElement], 
          /* cellInfo */ ColumnEditCellTemplateData[TRowData, TKey], 
          Any
        ])
    ): Self = StObject.set(x, "editCellTemplate", value.asInstanceOf[js.Any])
    
    inline def setEditCellTemplateFunction2(
      value: (/* cellElement */ DxElement_[HTMLElement], /* cellInfo */ ColumnEditCellTemplateData[TRowData, TKey]) => Any
    ): Self = StObject.set(x, "editCellTemplate", js.Any.fromFunction2(value))
    
    inline def setEditCellTemplateUndefined: Self = StObject.set(x, "editCellTemplate", js.undefined)
    
    inline def setGroupCellTemplate(
      value: template | (js.Function2[
          /* cellElement */ DxElement_[HTMLElement], 
          /* cellInfo */ ColumnGroupCellTemplateData[TRowData, TKey], 
          Any
        ])
    ): Self = StObject.set(x, "groupCellTemplate", value.asInstanceOf[js.Any])
    
    inline def setGroupCellTemplateFunction2(
      value: (/* cellElement */ DxElement_[HTMLElement], /* cellInfo */ ColumnGroupCellTemplateData[TRowData, TKey]) => Any
    ): Self = StObject.set(x, "groupCellTemplate", js.Any.fromFunction2(value))
    
    inline def setGroupCellTemplateUndefined: Self = StObject.set(x, "groupCellTemplate", js.undefined)
    
    inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
    
    inline def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
    
    inline def setHeaderCellTemplate(
      value: template | (js.Function2[
          /* columnHeader */ DxElement_[HTMLElement], 
          /* headerInfo */ ColumnHeaderCellTemplateData[TRowData, TKey], 
          Any
        ])
    ): Self = StObject.set(x, "headerCellTemplate", value.asInstanceOf[js.Any])
    
    inline def setHeaderCellTemplateFunction2(
      value: (/* columnHeader */ DxElement_[HTMLElement], /* headerInfo */ ColumnHeaderCellTemplateData[TRowData, TKey]) => Any
    ): Self = StObject.set(x, "headerCellTemplate", js.Any.fromFunction2(value))
    
    inline def setHeaderCellTemplateUndefined: Self = StObject.set(x, "headerCellTemplate", js.undefined)
    
    inline def setShowWhenGrouped(value: Boolean): Self = StObject.set(x, "showWhenGrouped", value.asInstanceOf[js.Any])
    
    inline def setShowWhenGroupedUndefined: Self = StObject.set(x, "showWhenGrouped", js.undefined)
    
    inline def setType(value: DataGridCommandColumnType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
