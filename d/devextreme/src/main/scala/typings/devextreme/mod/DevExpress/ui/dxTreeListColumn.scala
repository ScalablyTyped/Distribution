package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnBase
import typings.devextreme.mod.DevExpress.ui.dxTreeList.Column
import typings.devextreme.mod.DevExpress.ui.dxTreeList.ColumnButton
import typings.devextreme.mod.DevExpress.ui.dxTreeList.ColumnCellTemplateData
import typings.devextreme.mod.DevExpress.ui.dxTreeList.ColumnEditCellTemplateData
import typings.devextreme.mod.DevExpress.ui.dxTreeList.ColumnHeaderCellTemplateData
import typings.devextreme.mod.DevExpress.ui.dxTreeList.TreeListCommandColumnType
import typings.devextreme.mod.DevExpress.ui.dxTreeList.TreeListPredefinedColumnButton
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxTreeListColumn[TRowData, TKey]
  extends StObject
     with ColumnBase[TRowData] {
  
  /**
    * Allows you to customize buttons in the edit column or create a custom command column. Applies only if the column&apos;s type is &apos;buttons&apos;.
    */
  var buttons: js.UndefOr[js.Array[TreeListPredefinedColumnButton | (ColumnButton[TRowData, TKey])]] = js.undefined
  
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
    * Configures columns.
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
    * Specifies the command column that this object customizes.
    */
  var `type`: js.UndefOr[TreeListCommandColumnType] = js.undefined
}
object dxTreeListColumn {
  
  inline def apply[TRowData, TKey](): dxTreeListColumn[TRowData, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeListColumn[TRowData, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxTreeListColumn[?, ?], TRowData, TKey] (val x: Self & (dxTreeListColumn[TRowData, TKey])) extends AnyVal {
    
    inline def setButtons(value: js.Array[TreeListPredefinedColumnButton | (ColumnButton[TRowData, TKey])]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: (TreeListPredefinedColumnButton | (ColumnButton[TRowData, TKey]))*): Self = StObject.set(x, "buttons", js.Array(value*))
    
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
    
    inline def setType(value: TreeListCommandColumnType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
