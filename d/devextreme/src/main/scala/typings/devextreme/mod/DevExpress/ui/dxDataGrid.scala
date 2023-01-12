package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ComponentRow
import typings.devextreme.anon.Y
import typings.devextreme.devextremeStrings.pdf_
import typings.devextreme.devextremeStrings.xlsx
import typings.devextreme.mod.DevExpress.common.DataType
import typings.devextreme.mod.DevExpress.common.DragDirection
import typings.devextreme.mod.DevExpress.common.DragHighlight
import typings.devextreme.mod.DevExpress.common.HorizontalAlignment
import typings.devextreme.mod.DevExpress.common.HorizontalEdge
import typings.devextreme.mod.DevExpress.common.Mode
import typings.devextreme.mod.DevExpress.common.ScrollbarMode
import typings.devextreme.mod.DevExpress.common.SelectAllMode
import typings.devextreme.mod.DevExpress.common.SingleMultipleOrNone
import typings.devextreme.mod.DevExpress.common.SortOrder
import typings.devextreme.mod.DevExpress.common.charts.DataRenderMode
import typings.devextreme.mod.DevExpress.common.charts.FilterOperation
import typings.devextreme.mod.DevExpress.common.charts.FilterType
import typings.devextreme.mod.DevExpress.common.charts.GridsEditMode
import typings.devextreme.mod.DevExpress.common.charts.GridsEditRefreshMode
import typings.devextreme.mod.DevExpress.common.charts.GroupExpandMode
import typings.devextreme.mod.DevExpress.common.charts.NewRowPosition
import typings.devextreme.mod.DevExpress.common.charts.SelectedFilterOperation
import typings.devextreme.mod.DevExpress.common.charts.SelectionColumnDisplayMode
import typings.devextreme.mod.DevExpress.common.charts.StartEditAction
import typings.devextreme.mod.DevExpress.common.charts.SummaryType
import typings.devextreme.mod.DevExpress.core.DeepPartial
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.events.Cancelable
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.DxEvent
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.excelExporter.DataGridCell
import typings.devextreme.mod.DevExpress.exporter.ExcelFont
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.Column
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.Row
import typings.std.Blob
import typings.std.Element
import typings.std.HTMLElement
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import typings.std.PointerEvent
import typings.std.PromiseLike
import typings.std.TouchEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDataGrid[TRowData, TKey]
  extends StObject
     with Widget[dxDataGridOptions[TRowData, TKey]]
     with GridBase[TRowData, TKey] {
  
  def addColumn(columnOptions: String): Unit = js.native
  /**
    * Adds a new column.
    */
  def addColumn(columnOptions: Column[TRowData, TKey]): Unit = js.native
  
  /**
    * Adds an empty data row and switches it to the editing state.
    */
  def addRow(): js.Promise[Unit] = js.native
  
  /**
    * Ungroups grid records.
    */
  def clearGrouping(): Unit = js.native
  
  /**
    * Collapses master rows or groups of a specific level.
    */
  def collapseAll(): Unit = js.native
  def collapseAll(groupIndex: Double): Unit = js.native
  
  /**
    * Collapses a group or a master row with a specific key.
    */
  def collapseRow(key: TKey): js.Promise[Unit] = js.native
  
  /**
    * Expands master rows or groups of a specific level. Does not apply if data is remote.
    */
  def expandAll(): Unit = js.native
  def expandAll(groupIndex: Double): Unit = js.native
  
  /**
    * Expands a group or a master row with a specific key.
    */
  def expandRow(key: TKey): js.Promise[Unit] = js.native
  
  /**
    * Exports grid data to Excel.
    * @deprecated Use exportDataGrid instead.
    */
  def exportToExcel(selectionOnly: Boolean): Unit = js.native
  
  /**
    * Sets focus on the UI component.
    */
  /* InferMemberOverrides */
  override def focus(): Unit = js.native
  
  /**
    * Gets the currently selected rows&apos; keys.
    */
  def getSelectedRowKeys(): js.Array[TKey] & js.Promise[js.Array[TKey]] = js.native
  
  /**
    * Gets the selected rows&apos; data objects.
    */
  def getSelectedRowsData(): js.Array[TRowData] & js.Promise[js.Array[TRowData]] = js.native
  
  /**
    * Gets the value of a total summary item.
    */
  def getTotalSummaryValue(summaryItemName: String): Any = js.native
  
  /**
    * Gets all visible columns.
    */
  def getVisibleColumns(): js.Array[Column[TRowData, TKey]] = js.native
  /**
    * Gets all visible columns at a specific hierarchical level of column headers. Use it to access banded columns.
    */
  def getVisibleColumns(headerLevel: Double): js.Array[Column[TRowData, TKey]] = js.native
  
  /**
    * Gets currently rendered rows.
    */
  def getVisibleRows(): js.Array[Row[TRowData, TKey]] = js.native
  
  /**
    * Checks whether a specific group or master row is expanded or collapsed.
    */
  def isRowExpanded(key: TKey): Boolean = js.native
  
  /**
    * Gets the total row count.
    */
  def totalCount(): Double = js.native
}
object dxDataGrid {
  
  trait AdaptiveDetailRowPreparingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with AdaptiveDetailRowPreparingInfo
  object AdaptiveDetailRowPreparingEvent {
    
    inline def apply[TRowData, TKey](component: dxDataGrid[TRowData, TKey], element: DxElement_[HTMLElement], formOptions: Any): AdaptiveDetailRowPreparingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], formOptions = formOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdaptiveDetailRowPreparingEvent[TRowData, TKey]]
    }
  }
  
  trait AdaptiveDetailRowPreparingInfo extends StObject {
    
    val formOptions: Any
  }
  object AdaptiveDetailRowPreparingInfo {
    
    inline def apply(formOptions: Any): AdaptiveDetailRowPreparingInfo = {
      val __obj = js.Dynamic.literal(formOptions = formOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdaptiveDetailRowPreparingInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdaptiveDetailRowPreparingInfo] (val x: Self) extends AnyVal {
      
      inline def setFormOptions(value: Any): Self = StObject.set(x, "formOptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait CellClickEvent[TRowData, TKey]
    extends StObject
       with NativeEventInfo[dxDataGrid[TRowData, TKey], PointerEvent | MouseEvent] {
    
    val cellElement: DxElement_[HTMLElement]
    
    val column: Column[TRowData, TKey]
    
    val columnIndex: Double
    
    val data: TRowData
    
    val displayValue: js.UndefOr[Any] = js.undefined
    
    val key: TKey
    
    val row: Row[TRowData, TKey]
    
    val rowIndex: Double
    
    val rowType: String
    
    val text: String
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object CellClickEvent {
    
    inline def apply[TRowData, TKey](
      cellElement: DxElement_[HTMLElement],
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxDataGrid[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      key: TKey,
      row: Row[TRowData, TKey],
      rowIndex: Double,
      rowType: String,
      text: String
    ): CellClickEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cellElement = cellElement.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellClickEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellClickEvent[?, ?], TRowData, TKey] (val x: Self & (CellClickEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDisplayValue(value: Any): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
      
      inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CellDblClickEvent[TRowData, TKey]
    extends StObject
       with NativeEventInfo[dxDataGrid[TRowData, TKey], PointerEvent | MouseEvent] {
    
    val cellElement: DxElement_[HTMLElement]
    
    val column: Column[TRowData, TKey]
    
    val columnIndex: Double
    
    val data: TRowData
    
    val displayValue: js.UndefOr[Any] = js.undefined
    
    val key: TKey
    
    val row: Row[TRowData, TKey]
    
    val rowIndex: Double
    
    val rowType: String
    
    val text: String
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object CellDblClickEvent {
    
    inline def apply[TRowData, TKey](
      cellElement: DxElement_[HTMLElement],
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxDataGrid[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      key: TKey,
      row: Row[TRowData, TKey],
      rowIndex: Double,
      rowType: String,
      text: String
    ): CellDblClickEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cellElement = cellElement.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellDblClickEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellDblClickEvent[?, ?], TRowData, TKey] (val x: Self & (CellDblClickEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDisplayValue(value: Any): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
      
      inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CellHoverChangedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]] {
    
    val cellElement: DxElement_[HTMLElement]
    
    val column: Column[TRowData, TKey]
    
    val columnIndex: Double
    
    val data: TRowData
    
    val displayValue: js.UndefOr[Any] = js.undefined
    
    val eventType: String
    
    val key: TKey
    
    val row: Row[TRowData, TKey]
    
    val rowIndex: Double
    
    val rowType: String
    
    val text: String
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object CellHoverChangedEvent {
    
    inline def apply[TRowData, TKey](
      cellElement: DxElement_[HTMLElement],
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxDataGrid[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      eventType: String,
      key: TKey,
      row: Row[TRowData, TKey],
      rowIndex: Double,
      rowType: String,
      text: String
    ): CellHoverChangedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cellElement = cellElement.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellHoverChangedEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellHoverChangedEvent[?, ?], TRowData, TKey] (val x: Self & (CellHoverChangedEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDisplayValue(value: Any): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
      
      inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
      
      inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CellPreparedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]] {
    
    val cellElement: DxElement_[HTMLElement]
    
    val column: Column[TRowData, TKey]
    
    val columnIndex: Double
    
    val data: TRowData
    
    val displayValue: js.UndefOr[Any] = js.undefined
    
    val isExpanded: js.UndefOr[Boolean] = js.undefined
    
    val isNewRow: js.UndefOr[Boolean] = js.undefined
    
    val isSelected: js.UndefOr[Boolean] = js.undefined
    
    val key: TKey
    
    val oldValue: js.UndefOr[Any] = js.undefined
    
    val row: Row[TRowData, TKey]
    
    val rowIndex: Double
    
    val rowType: String
    
    val text: String
    
    val value: js.UndefOr[Any] = js.undefined
    
    val watch: js.UndefOr[js.Function] = js.undefined
  }
  object CellPreparedEvent {
    
    inline def apply[TRowData, TKey](
      cellElement: DxElement_[HTMLElement],
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxDataGrid[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      key: TKey,
      row: Row[TRowData, TKey],
      rowIndex: Double,
      rowType: String,
      text: String
    ): CellPreparedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cellElement = cellElement.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellPreparedEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellPreparedEvent[?, ?], TRowData, TKey] (val x: Self & (CellPreparedEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDisplayValue(value: Any): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
      
      inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsNewRow(value: Boolean): Self = StObject.set(x, "isNewRow", value.asInstanceOf[js.Any])
      
      inline def setIsNewRowUndefined: Self = StObject.set(x, "isNewRow", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWatch(value: js.Function): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  type Column[TRowData, TKey] = dxDataGridColumn[TRowData, TKey]
  
  trait ColumnBase[TRowData] extends StObject {
    
    /**
      * Aligns the content of the column.
      */
    var alignment: js.UndefOr[HorizontalAlignment] = js.undefined
    
    /**
      * Specifies whether a user can edit values in the column at runtime. By default, inherits the value of the editing.allowUpdating property.
      */
    var allowEditing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether data can be filtered by this column. Applies only if filterRow.visible is true.
      */
    var allowFiltering: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether a user can fix the column at runtime. Applies only if columnFixing.enabled is true.
      */
    var allowFixing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether the header filter can be used to filter data by this column. Applies only if headerFilter.visible is true. By default, inherits the value of the allowFiltering property.
      */
    var allowHeaderFiltering: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether a user can hide the column using the column chooser at runtime. Applies only if columnChooser.enabled is true.
      */
    var allowHiding: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether this column can be used in column reordering at runtime. Applies only if allowColumnReordering is true.
      */
    var allowReordering: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether a user can resize the column at runtime. Applies only if allowColumnResizing is true.
      */
    var allowResizing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether this column can be searched. Applies only if searchPanel.visible is true. Inherits the value of the allowFiltering property by default.
      */
    var allowSearch: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether a user can sort rows by this column at runtime. Applies only if sorting.mode differs from &apos;none&apos;.
      */
    var allowSorting: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Calculates custom cell values. Use this function to create an unbound data column.
      */
    var calculateCellValue: js.UndefOr[js.Function1[/* rowData */ TRowData, Any]] = js.undefined
    
    /**
      * Calculates custom display values for column cells. Requires specifying the dataField or calculateCellValue property. Used in lookup optimization.
      */
    var calculateDisplayValue: js.UndefOr[String | (js.Function1[/* rowData */ TRowData, Any])] = js.undefined
    
    /**
      * Specifies the column&apos;s custom rules to filter data.
      */
    var calculateFilterExpression: js.UndefOr[
        js.Function3[
          /* filterValue */ Any, 
          /* selectedFilterOperation */ String, 
          /* target */ String, 
          String | js.Array[Any] | js.Function
        ]
      ] = js.undefined
    
    /**
      * Calculates custom values used to sort this column.
      */
    var calculateSortValue: js.UndefOr[String | (js.Function1[/* rowData */ TRowData, Any])] = js.undefined
    
    /**
      * Specifies a caption for the column.
      */
    var caption: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a CSS class to be applied to the column.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /**
      * Customizes the text displayed in column cells.
      */
    var customizeText: js.UndefOr[
        js.Function1[
          /* cellInfo */ typings.devextreme.mod.DevExpress.common.grids.ColumnCustomizeTextArg, 
          String
        ]
      ] = js.undefined
    
    /**
      * Binds the column to a field of the dataSource.
      */
    var dataField: js.UndefOr[String] = js.undefined
    
    /**
      * Casts column values to a specific data type.
      */
    var dataType: js.UndefOr[DataType] = js.undefined
    
    var defaultCalculateCellValue: js.UndefOr[js.Function1[/* rowData */ Any, Any]] = js.undefined
    
    var defaultCalculateFilterExpression: js.UndefOr[
        js.Function3[
          /* filterValue */ Any, 
          /* selectedFilterOperation */ String, 
          /* target */ String, 
          String | js.Array[Any] | js.Function
        ]
      ] = js.undefined
    
    var defaultSetCellValue: js.UndefOr[
        js.Function3[
          /* newData */ DeepPartial[Any], 
          /* value */ Any, 
          /* currentRowData */ Any, 
          Unit | PromiseLike[Unit]
        ]
      ] = js.undefined
    
    /**
      * Configures the default UI component used for editing and filtering in the filter row.
      */
    var editorOptions: js.UndefOr[Any] = js.undefined
    
    /**
      * Specifies whether HTML tags are displayed as plain text or applied to the values of the column.
      */
    var encodeHtml: js.UndefOr[Boolean] = js.undefined
    
    /**
      * In a boolean column, replaces all false items with a specified text. Applies only if showEditorAlways property is false.
      */
    var falseText: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies available filter operations. Applies if allowFiltering is true and the filterRow and/or filterPanel are visible.
      */
    var filterOperations: js.UndefOr[js.Array[FilterOperation | String]] = js.undefined
    
    /**
      * Specifies whether a user changes the current filter by including (selecting) or excluding (clearing the selection of) values. Applies only if headerFilter.visible and allowHeaderFiltering are true.
      */
    var filterType: js.UndefOr[FilterType] = js.undefined
    
    /**
      * Specifies the column&apos;s filter value displayed in the filter row.
      */
    var filterValue: js.UndefOr[Any] = js.undefined
    
    /**
      * Specifies values selected in the column&apos;s header filter.
      */
    var filterValues: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * Fixes the column.
      */
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the UI component&apos;s edge to which the column is fixed. Applies only if columns[].fixed is true.
      */
    var fixedPosition: js.UndefOr[HorizontalEdge] = js.undefined
    
    /**
      * Configures the form item that the column produces in the editing state. Applies only if editing.mode is &apos;form&apos; or &apos;popup&apos;.
      */
    var formItem: js.UndefOr[dxFormSimpleItem] = js.undefined
    
    /**
      * Formats a value before it is displayed in a column cell.
      */
    var format: js.UndefOr[Format] = js.undefined
    
    /**
      * Specifies data settings for the header filter.
      */
    var headerFilter: js.UndefOr[typings.devextreme.mod.DevExpress.common.grids.ColumnHeaderFilter] = js.undefined
    
    /**
      * Specifies the order in which columns are hidden when the UI component adapts to the screen or container size. Ignored if allowColumnResizing is true and columnResizingMode is &apos;widget&apos;.
      */
    var hidingPriority: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies whether the column organizes other columns into bands.
      */
    var isBand: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies properties of a lookup column.
      */
    var lookup: js.UndefOr[typings.devextreme.mod.DevExpress.common.grids.ColumnLookup] = js.undefined
    
    /**
      * Specifies the minimum width of the column.
      */
    var minWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the column&apos;s unique identifier. If not set in code, this value is inherited from the dataField.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the band column that owns the current column. Accepts the index of the band column in the columns array.
      */
    var ownerBand: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies whether to render the column after other columns and elements. Use if column cells have a complex template. Requires the width property specified.
      */
    var renderAsync: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies a filter operation that applies when users use the filter row to filter the column.
      */
    var selectedFilterOperation: js.UndefOr[SelectedFilterOperation] = js.undefined
    
    /**
      * Specifies a function to be invoked after the user has edited a cell value, but before it will be saved in the data source.
      */
    var setCellValue: js.UndefOr[
        js.Function3[
          /* newData */ DeepPartial[TRowData], 
          /* value */ Any, 
          /* currentRowData */ TRowData, 
          Unit | PromiseLike[Unit]
        ]
      ] = js.undefined
    
    /**
      * Specifies whether the column displays its values using editors.
      */
    var showEditorAlways: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether the column chooser can contain the column header.
      */
    var showInColumnChooser: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the index according to which columns participate in sorting.
      */
    var sortIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the sort order of column values.
      */
    var sortOrder: js.UndefOr[SortOrder] = js.undefined
    
    /**
      * Specifies a custom comparison function for sorting. Applies only when sorting is performed on the client.
      */
    var sortingMethod: js.UndefOr[js.Function2[/* value1 */ Any, /* value2 */ Any, Double]] = js.undefined
    
    /**
      * In a boolean column, replaces all true items with a specified text. Applies only if showEditorAlways property is false.
      */
    var trueText: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies validation rules to be checked when cell values are updated.
      */
    var validationRules: js.UndefOr[
        js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ]
      ] = js.undefined
    
    /**
      * Specifies whether the column is visible, that is, occupies space in the table.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the position of the column regarding other columns in the resulting UI component.
      */
    var visibleIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the column&apos;s width in pixels or as a percentage. Ignored if it is less than minWidth.
      */
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object ColumnBase {
    
    inline def apply[TRowData](): ColumnBase[TRowData] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnBase[TRowData]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnBase[?], TRowData] (val x: Self & ColumnBase[TRowData]) extends AnyVal {
      
      inline def setAlignment(value: HorizontalAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setAllowEditing(value: Boolean): Self = StObject.set(x, "allowEditing", value.asInstanceOf[js.Any])
      
      inline def setAllowEditingUndefined: Self = StObject.set(x, "allowEditing", js.undefined)
      
      inline def setAllowFiltering(value: Boolean): Self = StObject.set(x, "allowFiltering", value.asInstanceOf[js.Any])
      
      inline def setAllowFilteringUndefined: Self = StObject.set(x, "allowFiltering", js.undefined)
      
      inline def setAllowFixing(value: Boolean): Self = StObject.set(x, "allowFixing", value.asInstanceOf[js.Any])
      
      inline def setAllowFixingUndefined: Self = StObject.set(x, "allowFixing", js.undefined)
      
      inline def setAllowHeaderFiltering(value: Boolean): Self = StObject.set(x, "allowHeaderFiltering", value.asInstanceOf[js.Any])
      
      inline def setAllowHeaderFilteringUndefined: Self = StObject.set(x, "allowHeaderFiltering", js.undefined)
      
      inline def setAllowHiding(value: Boolean): Self = StObject.set(x, "allowHiding", value.asInstanceOf[js.Any])
      
      inline def setAllowHidingUndefined: Self = StObject.set(x, "allowHiding", js.undefined)
      
      inline def setAllowReordering(value: Boolean): Self = StObject.set(x, "allowReordering", value.asInstanceOf[js.Any])
      
      inline def setAllowReorderingUndefined: Self = StObject.set(x, "allowReordering", js.undefined)
      
      inline def setAllowResizing(value: Boolean): Self = StObject.set(x, "allowResizing", value.asInstanceOf[js.Any])
      
      inline def setAllowResizingUndefined: Self = StObject.set(x, "allowResizing", js.undefined)
      
      inline def setAllowSearch(value: Boolean): Self = StObject.set(x, "allowSearch", value.asInstanceOf[js.Any])
      
      inline def setAllowSearchUndefined: Self = StObject.set(x, "allowSearch", js.undefined)
      
      inline def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
      
      inline def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
      
      inline def setCalculateCellValue(value: /* rowData */ TRowData => Any): Self = StObject.set(x, "calculateCellValue", js.Any.fromFunction1(value))
      
      inline def setCalculateCellValueUndefined: Self = StObject.set(x, "calculateCellValue", js.undefined)
      
      inline def setCalculateDisplayValue(value: String | (js.Function1[/* rowData */ TRowData, Any])): Self = StObject.set(x, "calculateDisplayValue", value.asInstanceOf[js.Any])
      
      inline def setCalculateDisplayValueFunction1(value: /* rowData */ TRowData => Any): Self = StObject.set(x, "calculateDisplayValue", js.Any.fromFunction1(value))
      
      inline def setCalculateDisplayValueUndefined: Self = StObject.set(x, "calculateDisplayValue", js.undefined)
      
      inline def setCalculateFilterExpression(
        value: (/* filterValue */ Any, /* selectedFilterOperation */ String, /* target */ String) => String | js.Array[Any] | js.Function
      ): Self = StObject.set(x, "calculateFilterExpression", js.Any.fromFunction3(value))
      
      inline def setCalculateFilterExpressionUndefined: Self = StObject.set(x, "calculateFilterExpression", js.undefined)
      
      inline def setCalculateSortValue(value: String | (js.Function1[/* rowData */ TRowData, Any])): Self = StObject.set(x, "calculateSortValue", value.asInstanceOf[js.Any])
      
      inline def setCalculateSortValueFunction1(value: /* rowData */ TRowData => Any): Self = StObject.set(x, "calculateSortValue", js.Any.fromFunction1(value))
      
      inline def setCalculateSortValueUndefined: Self = StObject.set(x, "calculateSortValue", js.undefined)
      
      inline def setCaption(value: String): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
      
      inline def setCaptionUndefined: Self = StObject.set(x, "caption", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCustomizeText(
        value: /* cellInfo */ typings.devextreme.mod.DevExpress.common.grids.ColumnCustomizeTextArg => String
      ): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
      
      inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
      
      inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
      
      inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
      
      inline def setDataType(value: DataType): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
      
      inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
      
      inline def setDefaultCalculateCellValue(value: /* rowData */ Any => Any): Self = StObject.set(x, "defaultCalculateCellValue", js.Any.fromFunction1(value))
      
      inline def setDefaultCalculateCellValueUndefined: Self = StObject.set(x, "defaultCalculateCellValue", js.undefined)
      
      inline def setDefaultCalculateFilterExpression(
        value: (/* filterValue */ Any, /* selectedFilterOperation */ String, /* target */ String) => String | js.Array[Any] | js.Function
      ): Self = StObject.set(x, "defaultCalculateFilterExpression", js.Any.fromFunction3(value))
      
      inline def setDefaultCalculateFilterExpressionUndefined: Self = StObject.set(x, "defaultCalculateFilterExpression", js.undefined)
      
      inline def setDefaultSetCellValue(
        value: (/* newData */ DeepPartial[Any], /* value */ Any, /* currentRowData */ Any) => Unit | PromiseLike[Unit]
      ): Self = StObject.set(x, "defaultSetCellValue", js.Any.fromFunction3(value))
      
      inline def setDefaultSetCellValueUndefined: Self = StObject.set(x, "defaultSetCellValue", js.undefined)
      
      inline def setEditorOptions(value: Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
      
      inline def setEditorOptionsUndefined: Self = StObject.set(x, "editorOptions", js.undefined)
      
      inline def setEncodeHtml(value: Boolean): Self = StObject.set(x, "encodeHtml", value.asInstanceOf[js.Any])
      
      inline def setEncodeHtmlUndefined: Self = StObject.set(x, "encodeHtml", js.undefined)
      
      inline def setFalseText(value: String): Self = StObject.set(x, "falseText", value.asInstanceOf[js.Any])
      
      inline def setFalseTextUndefined: Self = StObject.set(x, "falseText", js.undefined)
      
      inline def setFilterOperations(value: js.Array[FilterOperation | String]): Self = StObject.set(x, "filterOperations", value.asInstanceOf[js.Any])
      
      inline def setFilterOperationsUndefined: Self = StObject.set(x, "filterOperations", js.undefined)
      
      inline def setFilterOperationsVarargs(value: (FilterOperation | String)*): Self = StObject.set(x, "filterOperations", js.Array(value*))
      
      inline def setFilterType(value: FilterType): Self = StObject.set(x, "filterType", value.asInstanceOf[js.Any])
      
      inline def setFilterTypeUndefined: Self = StObject.set(x, "filterType", js.undefined)
      
      inline def setFilterValue(value: Any): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
      
      inline def setFilterValueUndefined: Self = StObject.set(x, "filterValue", js.undefined)
      
      inline def setFilterValues(value: js.Array[Any]): Self = StObject.set(x, "filterValues", value.asInstanceOf[js.Any])
      
      inline def setFilterValuesUndefined: Self = StObject.set(x, "filterValues", js.undefined)
      
      inline def setFilterValuesVarargs(value: Any*): Self = StObject.set(x, "filterValues", js.Array(value*))
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedPosition(value: HorizontalEdge): Self = StObject.set(x, "fixedPosition", value.asInstanceOf[js.Any])
      
      inline def setFixedPositionUndefined: Self = StObject.set(x, "fixedPosition", js.undefined)
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFormItem(value: dxFormSimpleItem): Self = StObject.set(x, "formItem", value.asInstanceOf[js.Any])
      
      inline def setFormItemUndefined: Self = StObject.set(x, "formItem", js.undefined)
      
      inline def setFormat(value: Format): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHeaderFilter(value: typings.devextreme.mod.DevExpress.common.grids.ColumnHeaderFilter): Self = StObject.set(x, "headerFilter", value.asInstanceOf[js.Any])
      
      inline def setHeaderFilterUndefined: Self = StObject.set(x, "headerFilter", js.undefined)
      
      inline def setHidingPriority(value: Double): Self = StObject.set(x, "hidingPriority", value.asInstanceOf[js.Any])
      
      inline def setHidingPriorityUndefined: Self = StObject.set(x, "hidingPriority", js.undefined)
      
      inline def setIsBand(value: Boolean): Self = StObject.set(x, "isBand", value.asInstanceOf[js.Any])
      
      inline def setIsBandUndefined: Self = StObject.set(x, "isBand", js.undefined)
      
      inline def setLookup(value: typings.devextreme.mod.DevExpress.common.grids.ColumnLookup): Self = StObject.set(x, "lookup", value.asInstanceOf[js.Any])
      
      inline def setLookupUndefined: Self = StObject.set(x, "lookup", js.undefined)
      
      inline def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOwnerBand(value: Double): Self = StObject.set(x, "ownerBand", value.asInstanceOf[js.Any])
      
      inline def setOwnerBandUndefined: Self = StObject.set(x, "ownerBand", js.undefined)
      
      inline def setRenderAsync(value: Boolean): Self = StObject.set(x, "renderAsync", value.asInstanceOf[js.Any])
      
      inline def setRenderAsyncUndefined: Self = StObject.set(x, "renderAsync", js.undefined)
      
      inline def setSelectedFilterOperation(value: SelectedFilterOperation): Self = StObject.set(x, "selectedFilterOperation", value.asInstanceOf[js.Any])
      
      inline def setSelectedFilterOperationUndefined: Self = StObject.set(x, "selectedFilterOperation", js.undefined)
      
      inline def setSetCellValue(
        value: (/* newData */ DeepPartial[TRowData], /* value */ Any, /* currentRowData */ TRowData) => Unit | PromiseLike[Unit]
      ): Self = StObject.set(x, "setCellValue", js.Any.fromFunction3(value))
      
      inline def setSetCellValueUndefined: Self = StObject.set(x, "setCellValue", js.undefined)
      
      inline def setShowEditorAlways(value: Boolean): Self = StObject.set(x, "showEditorAlways", value.asInstanceOf[js.Any])
      
      inline def setShowEditorAlwaysUndefined: Self = StObject.set(x, "showEditorAlways", js.undefined)
      
      inline def setShowInColumnChooser(value: Boolean): Self = StObject.set(x, "showInColumnChooser", value.asInstanceOf[js.Any])
      
      inline def setShowInColumnChooserUndefined: Self = StObject.set(x, "showInColumnChooser", js.undefined)
      
      inline def setSortIndex(value: Double): Self = StObject.set(x, "sortIndex", value.asInstanceOf[js.Any])
      
      inline def setSortIndexUndefined: Self = StObject.set(x, "sortIndex", js.undefined)
      
      inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      inline def setSortingMethod(value: (/* value1 */ Any, /* value2 */ Any) => Double): Self = StObject.set(x, "sortingMethod", js.Any.fromFunction2(value))
      
      inline def setSortingMethodUndefined: Self = StObject.set(x, "sortingMethod", js.undefined)
      
      inline def setTrueText(value: String): Self = StObject.set(x, "trueText", value.asInstanceOf[js.Any])
      
      inline def setTrueTextUndefined: Self = StObject.set(x, "trueText", js.undefined)
      
      inline def setValidationRules(
        value: js.Array[
              RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
            ]
      ): Self = StObject.set(x, "validationRules", value.asInstanceOf[js.Any])
      
      inline def setValidationRulesUndefined: Self = StObject.set(x, "validationRules", js.undefined)
      
      inline def setValidationRulesVarargs(
        value: (RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule)*
      ): Self = StObject.set(x, "validationRules", js.Array(value*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleIndex(value: Double): Self = StObject.set(x, "visibleIndex", value.asInstanceOf[js.Any])
      
      inline def setVisibleIndexUndefined: Self = StObject.set(x, "visibleIndex", js.undefined)
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type ColumnButton[TRowData, TKey] = dxDataGridColumnButton[TRowData, TKey]
  
  trait ColumnButtonBase extends StObject {
    
    /**
      * Specifies a CSS class to be applied to the button.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the text for the hint that appears when the button is hovered over or long-pressed.
      */
    var hint: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the button&apos;s icon.
      */
    var icon: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the button&apos;s text. Applies only if the button&apos;s icon is not specified.
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object ColumnButtonBase {
    
    inline def apply(): ColumnButtonBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColumnButtonBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnButtonBase] (val x: Self) extends AnyVal {
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait ColumnButtonClickEvent[TRowData, TKey]
    extends StObject
       with NativeEventInfo[dxDataGrid[TRowData, TKey], PointerEvent | MouseEvent] {
    
    var column: js.UndefOr[Column[TRowData, TKey]] = js.undefined
    
    var row: js.UndefOr[Row[TRowData, TKey]] = js.undefined
  }
  object ColumnButtonClickEvent {
    
    inline def apply[TRowData, TKey](component: dxDataGrid[TRowData, TKey], element: DxElement_[HTMLElement]): ColumnButtonClickEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnButtonClickEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnButtonClickEvent[?, ?], TRowData, TKey] (val x: Self & (ColumnButtonClickEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
  
  trait ColumnButtonTemplateData[TRowData, TKey] extends StObject {
    
    val column: Column[TRowData, TKey]
    
    val columnIndex: Double
    
    val component: dxDataGrid[TRowData, TKey]
    
    val data: js.UndefOr[TRowData] = js.undefined
    
    val key: js.UndefOr[TKey] = js.undefined
    
    val row: Row[TRowData, TKey]
    
    val rowIndex: Double
    
    val rowType: String
  }
  object ColumnButtonTemplateData {
    
    inline def apply[TRowData, TKey](
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxDataGrid[TRowData, TKey],
      row: Row[TRowData, TKey],
      rowIndex: Double,
      rowType: String
    ): ColumnButtonTemplateData[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnButtonTemplateData[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnButtonTemplateData[?, ?], TRowData, TKey] (val x: Self & (ColumnButtonTemplateData[TRowData, TKey])) extends AnyVal {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: dxDataGrid[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnCellTemplateData[TRowData, TKey] extends StObject {
    
    val column: Column[TRowData, TKey]
    
    val columnIndex: Double
    
    val component: dxDataGrid[TRowData, TKey]
    
    val data: js.UndefOr[TRowData] = js.undefined
    
    val displayValue: js.UndefOr[Any] = js.undefined
    
    val oldValue: js.UndefOr[Any] = js.undefined
    
    val row: Row[TRowData, TKey]
    
    val rowIndex: Double
    
    val rowType: String
    
    val text: String
    
    val value: js.UndefOr[Any] = js.undefined
    
    val watch: js.UndefOr[js.Function] = js.undefined
  }
  object ColumnCellTemplateData {
    
    inline def apply[TRowData, TKey](
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxDataGrid[TRowData, TKey],
      row: Row[TRowData, TKey],
      rowIndex: Double,
      rowType: String,
      text: String
    ): ColumnCellTemplateData[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnCellTemplateData[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnCellTemplateData[?, ?], TRowData, TKey] (val x: Self & (ColumnCellTemplateData[TRowData, TKey])) extends AnyVal {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: dxDataGrid[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDisplayValue(value: Any): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
      
      inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
      
      inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWatch(value: js.Function): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  type ColumnChooser = typings.devextreme.mod.DevExpress.common.grids.ColumnChooser
  
  type ColumnCustomizeTextArg = typings.devextreme.mod.DevExpress.common.grids.ColumnCustomizeTextArg
  
  trait ColumnEditCellTemplateData[TRowData, TKey] extends StObject {
    
    val column: Column[TRowData, TKey]
    
    val columnIndex: Double
    
    val component: dxDataGrid[TRowData, TKey]
    
    val data: js.UndefOr[TRowData] = js.undefined
    
    val displayValue: js.UndefOr[Any] = js.undefined
    
    val row: Row[TRowData, TKey]
    
    val rowIndex: Double
    
    val rowType: String
    
    val setValue: js.UndefOr[Any] = js.undefined
    
    val text: String
    
    val value: js.UndefOr[Any] = js.undefined
    
    val watch: js.UndefOr[js.Function] = js.undefined
  }
  object ColumnEditCellTemplateData {
    
    inline def apply[TRowData, TKey](
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxDataGrid[TRowData, TKey],
      row: Row[TRowData, TKey],
      rowIndex: Double,
      rowType: String,
      text: String
    ): ColumnEditCellTemplateData[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnEditCellTemplateData[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnEditCellTemplateData[?, ?], TRowData, TKey] (val x: Self & (ColumnEditCellTemplateData[TRowData, TKey])) extends AnyVal {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: dxDataGrid[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDisplayValue(value: Any): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
      
      inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setSetValue(value: Any): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
      
      inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWatch(value: js.Function): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  type ColumnFixing = typings.devextreme.mod.DevExpress.common.grids.ColumnFixing
  
  type ColumnFixingTexts = typings.devextreme.mod.DevExpress.common.grids.ColumnFixingTexts
  
  trait ColumnGroupCellTemplateData[TRowData, TKey] extends StObject {
    
    val column: Column[TRowData, TKey]
    
    val columnIndex: Double
    
    val component: dxDataGrid[TRowData, TKey]
    
    val data: js.UndefOr[GroupData[TRowData]] = js.undefined
    
    val displayValue: js.UndefOr[Any] = js.undefined
    
    val groupContinuedMessage: js.UndefOr[String] = js.undefined
    
    val groupContinuesMessage: js.UndefOr[String] = js.undefined
    
    val row: Row[GroupData[TRowData], GroupKey]
    
    val rowIndex: Double
    
    val summaryItems: js.Array[Any]
    
    val text: String
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object ColumnGroupCellTemplateData {
    
    inline def apply[TRowData, TKey](
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxDataGrid[TRowData, TKey],
      row: Row[GroupData[TRowData], GroupKey],
      rowIndex: Double,
      summaryItems: js.Array[Any],
      text: String
    ): ColumnGroupCellTemplateData[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], summaryItems = summaryItems.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnGroupCellTemplateData[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnGroupCellTemplateData[?, ?], TRowData, TKey] (val x: Self & (ColumnGroupCellTemplateData[TRowData, TKey])) extends AnyVal {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: dxDataGrid[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setData(value: GroupData[TRowData]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDisplayValue(value: Any): Self = StObject.set(x, "displayValue", value.asInstanceOf[js.Any])
      
      inline def setDisplayValueUndefined: Self = StObject.set(x, "displayValue", js.undefined)
      
      inline def setGroupContinuedMessage(value: String): Self = StObject.set(x, "groupContinuedMessage", value.asInstanceOf[js.Any])
      
      inline def setGroupContinuedMessageUndefined: Self = StObject.set(x, "groupContinuedMessage", js.undefined)
      
      inline def setGroupContinuesMessage(value: String): Self = StObject.set(x, "groupContinuesMessage", value.asInstanceOf[js.Any])
      
      inline def setGroupContinuesMessageUndefined: Self = StObject.set(x, "groupContinuesMessage", js.undefined)
      
      inline def setRow(value: Row[GroupData[TRowData], GroupKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setSummaryItems(value: js.Array[Any]): Self = StObject.set(x, "summaryItems", value.asInstanceOf[js.Any])
      
      inline def setSummaryItemsVarargs(value: Any*): Self = StObject.set(x, "summaryItems", js.Array(value*))
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ColumnHeaderCellTemplateData[TRowData, TKey] extends StObject {
    
    val column: Column[TRowData, TKey]
    
    val columnIndex: Double
    
    val component: dxDataGrid[TRowData, TKey]
  }
  object ColumnHeaderCellTemplateData {
    
    inline def apply[TRowData, TKey](column: Column[TRowData, TKey], columnIndex: Double, component: dxDataGrid[TRowData, TKey]): ColumnHeaderCellTemplateData[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnHeaderCellTemplateData[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnHeaderCellTemplateData[?, ?], TRowData, TKey] (val x: Self & (ColumnHeaderCellTemplateData[TRowData, TKey])) extends AnyVal {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: dxDataGrid[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    }
  }
  
  type ColumnHeaderFilter = typings.devextreme.mod.DevExpress.common.grids.ColumnHeaderFilter
  
  type ColumnLookup = typings.devextreme.mod.DevExpress.common.grids.ColumnLookup
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.nextColumn
    - typings.devextreme.devextremeStrings.widget
  */
  trait ColumnResizeMode extends StObject
  object ColumnResizeMode {
    
    inline def nextColumn: typings.devextreme.devextremeStrings.nextColumn = "nextColumn".asInstanceOf[typings.devextreme.devextremeStrings.nextColumn]
    
    inline def widget: typings.devextreme.devextremeStrings.widget = "widget".asInstanceOf[typings.devextreme.devextremeStrings.widget]
  }
  
  type ContentReadyEvent[TRowData, TKey] = EventInfo[dxDataGrid[TRowData, TKey]]
  
  trait ContextMenuPreparingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]] {
    
    val column: js.UndefOr[Column[TRowData, TKey]] = js.undefined
    
    val columnIndex: Double
    
    var items: js.UndefOr[js.Array[Any]] = js.undefined
    
    val row: js.UndefOr[Row[TRowData, TKey]] = js.undefined
    
    val rowIndex: Double
    
    val target: String
    
    val targetElement: DxElement_[HTMLElement]
  }
  object ContextMenuPreparingEvent {
    
    inline def apply[TRowData, TKey](
      columnIndex: Double,
      component: dxDataGrid[TRowData, TKey],
      element: DxElement_[HTMLElement],
      rowIndex: Double,
      target: String,
      targetElement: DxElement_[HTMLElement]
    ): ContextMenuPreparingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], targetElement = targetElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[ContextMenuPreparingEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextMenuPreparingEvent[?, ?], TRowData, TKey] (val x: Self & (ContextMenuPreparingEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "targetElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait CustomSummaryInfo[TRowData, TKey] extends StObject {
    
    val component: dxDataGrid[TRowData, TKey]
    
    val groupIndex: js.UndefOr[Double] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
    
    val summaryProcess: String
    
    var totalValue: js.UndefOr[Any] = js.undefined
    
    val value: js.UndefOr[Any] = js.undefined
  }
  object CustomSummaryInfo {
    
    inline def apply[TRowData, TKey](component: dxDataGrid[TRowData, TKey], summaryProcess: String): CustomSummaryInfo[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], summaryProcess = summaryProcess.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomSummaryInfo[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomSummaryInfo[?, ?], TRowData, TKey] (val x: Self & (CustomSummaryInfo[TRowData, TKey])) extends AnyVal {
      
      inline def setComponent(value: dxDataGrid[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
      
      inline def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSummaryProcess(value: String): Self = StObject.set(x, "summaryProcess", value.asInstanceOf[js.Any])
      
      inline def setTotalValue(value: Any): Self = StObject.set(x, "totalValue", value.asInstanceOf[js.Any])
      
      inline def setTotalValueUndefined: Self = StObject.set(x, "totalValue", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type DataChange = typings.devextreme.mod.DevExpress.common.grids.DataChange[Any, Any]
  
  trait DataChangeInfo[TRowData, TKey] extends StObject {
    
    val changes: js.Array[typings.devextreme.mod.DevExpress.common.grids.DataChange[TRowData, TKey]]
  }
  object DataChangeInfo {
    
    inline def apply[TRowData, TKey](changes: js.Array[typings.devextreme.mod.DevExpress.common.grids.DataChange[TRowData, TKey]]): DataChangeInfo[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataChangeInfo[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataChangeInfo[?, ?], TRowData, TKey] (val x: Self & (DataChangeInfo[TRowData, TKey])) extends AnyVal {
      
      inline def setChanges(value: js.Array[typings.devextreme.mod.DevExpress.common.grids.DataChange[TRowData, TKey]]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesVarargs(value: (typings.devextreme.mod.DevExpress.common.grids.DataChange[TRowData, TKey])*): Self = StObject.set(x, "changes", js.Array(value*))
    }
  }
  
  trait DataErrorOccurredEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with DataErrorOccurredInfo
  object DataErrorOccurredEvent {
    
    inline def apply[TRowData, TKey](component: dxDataGrid[TRowData, TKey], element: DxElement_[HTMLElement]): DataErrorOccurredEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataErrorOccurredEvent[TRowData, TKey]]
    }
  }
  
  trait DataErrorOccurredInfo extends StObject {
    
    val error: js.UndefOr[js.Error] = js.undefined
  }
  object DataErrorOccurredInfo {
    
    inline def apply(): DataErrorOccurredInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataErrorOccurredInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataErrorOccurredInfo] (val x: Self) extends AnyVal {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.adaptive
    - typings.devextreme.devextremeStrings.buttons
    - typings.devextreme.devextremeStrings.detailExpand
    - typings.devextreme.devextremeStrings.groupExpand
    - typings.devextreme.devextremeStrings.selection
    - typings.devextreme.devextremeStrings.drag
  */
  trait DataGridCommandColumnType extends StObject
  object DataGridCommandColumnType {
    
    inline def adaptive: typings.devextreme.devextremeStrings.adaptive = "adaptive".asInstanceOf[typings.devextreme.devextremeStrings.adaptive]
    
    inline def buttons: typings.devextreme.devextremeStrings.buttons = "buttons".asInstanceOf[typings.devextreme.devextremeStrings.buttons]
    
    inline def detailExpand: typings.devextreme.devextremeStrings.detailExpand = "detailExpand".asInstanceOf[typings.devextreme.devextremeStrings.detailExpand]
    
    inline def drag: typings.devextreme.devextremeStrings.drag = "drag".asInstanceOf[typings.devextreme.devextremeStrings.drag]
    
    inline def groupExpand: typings.devextreme.devextremeStrings.groupExpand = "groupExpand".asInstanceOf[typings.devextreme.devextremeStrings.groupExpand]
    
    inline def selection: typings.devextreme.devextremeStrings.selection = "selection".asInstanceOf[typings.devextreme.devextremeStrings.selection]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.pdf_
    - typings.devextreme.devextremeStrings.xlsx
  */
  trait DataGridExportFormat extends StObject
  object DataGridExportFormat {
    
    inline def pdf: pdf_ = "pdf".asInstanceOf[pdf_]
    
    inline def xlsx: typings.devextreme.devextremeStrings.xlsx = "xlsx".asInstanceOf[typings.devextreme.devextremeStrings.xlsx]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.cancel
    - typings.devextreme.devextremeStrings.delete
    - typings.devextreme.devextremeStrings.edit
    - typings.devextreme.devextremeStrings.save
    - typings.devextreme.devextremeStrings.undelete
  */
  trait DataGridPredefinedColumnButton extends StObject
  object DataGridPredefinedColumnButton {
    
    inline def cancel: typings.devextreme.devextremeStrings.cancel = "cancel".asInstanceOf[typings.devextreme.devextremeStrings.cancel]
    
    inline def delete: typings.devextreme.devextremeStrings.delete = "delete".asInstanceOf[typings.devextreme.devextremeStrings.delete]
    
    inline def edit: typings.devextreme.devextremeStrings.edit = "edit".asInstanceOf[typings.devextreme.devextremeStrings.edit]
    
    inline def save: typings.devextreme.devextremeStrings.save = "save".asInstanceOf[typings.devextreme.devextremeStrings.save]
    
    inline def undelete: typings.devextreme.devextremeStrings.undelete = "undelete".asInstanceOf[typings.devextreme.devextremeStrings.undelete]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.addRowButton
    - typings.devextreme.devextremeStrings.applyFilterButton
    - typings.devextreme.devextremeStrings.columnChooserButton
    - typings.devextreme.devextremeStrings.exportButton
    - typings.devextreme.devextremeStrings.groupPanel
    - typings.devextreme.devextremeStrings.revertButton
    - typings.devextreme.devextremeStrings.saveButton
    - typings.devextreme.devextremeStrings.searchPanel
  */
  trait DataGridPredefinedToolbarItem extends StObject
  object DataGridPredefinedToolbarItem {
    
    inline def addRowButton: typings.devextreme.devextremeStrings.addRowButton = "addRowButton".asInstanceOf[typings.devextreme.devextremeStrings.addRowButton]
    
    inline def applyFilterButton: typings.devextreme.devextremeStrings.applyFilterButton = "applyFilterButton".asInstanceOf[typings.devextreme.devextremeStrings.applyFilterButton]
    
    inline def columnChooserButton: typings.devextreme.devextremeStrings.columnChooserButton = "columnChooserButton".asInstanceOf[typings.devextreme.devextremeStrings.columnChooserButton]
    
    inline def exportButton: typings.devextreme.devextremeStrings.exportButton = "exportButton".asInstanceOf[typings.devextreme.devextremeStrings.exportButton]
    
    inline def groupPanel: typings.devextreme.devextremeStrings.groupPanel = "groupPanel".asInstanceOf[typings.devextreme.devextremeStrings.groupPanel]
    
    inline def revertButton: typings.devextreme.devextremeStrings.revertButton = "revertButton".asInstanceOf[typings.devextreme.devextremeStrings.revertButton]
    
    inline def saveButton: typings.devextreme.devextremeStrings.saveButton = "saveButton".asInstanceOf[typings.devextreme.devextremeStrings.saveButton]
    
    inline def searchPanel: typings.devextreme.devextremeStrings.searchPanel = "searchPanel".asInstanceOf[typings.devextreme.devextremeStrings.searchPanel]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.infinite
    - typings.devextreme.devextremeStrings.standard
    - typings.devextreme.devextremeStrings.virtual
  */
  trait DataGridScrollMode extends StObject
  object DataGridScrollMode {
    
    inline def infinite: typings.devextreme.devextremeStrings.infinite = "infinite".asInstanceOf[typings.devextreme.devextremeStrings.infinite]
    
    inline def standard: typings.devextreme.devextremeStrings.standard = "standard".asInstanceOf[typings.devextreme.devextremeStrings.standard]
    
    inline def virtual: typings.devextreme.devextremeStrings.virtual = "virtual".asInstanceOf[typings.devextreme.devextremeStrings.virtual]
  }
  
  trait DataRowTemplateData[TRowData, TKey] extends StObject {
    
    val columns: js.Array[Column[TRowData, TKey]]
    
    val component: dxDataGrid[TRowData, TKey]
    
    val data: TRowData
    
    val isExpanded: js.UndefOr[Boolean] = js.undefined
    
    val isSelected: js.UndefOr[Boolean] = js.undefined
    
    val key: TKey
    
    val rowIndex: Double
    
    val values: js.Array[Any]
  }
  object DataRowTemplateData {
    
    inline def apply[TRowData, TKey](
      columns: js.Array[Column[TRowData, TKey]],
      component: dxDataGrid[TRowData, TKey],
      data: TRowData,
      key: TKey,
      rowIndex: Double,
      values: js.Array[Any]
    ): DataRowTemplateData[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataRowTemplateData[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataRowTemplateData[?, ?], TRowData, TKey] (val x: Self & (DataRowTemplateData[TRowData, TKey])) extends AnyVal {
      
      inline def setColumns(value: js.Array[Column[TRowData, TKey]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (Column[TRowData, TKey])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setComponent(value: dxDataGrid[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  type DisposingEvent[TRowData, TKey] = EventInfo[dxDataGrid[TRowData, TKey]]
  
  trait DragDropInfo extends StObject {
    
    val dropInsideItem: Boolean
  }
  object DragDropInfo {
    
    inline def apply(dropInsideItem: Boolean): DragDropInfo = {
      val __obj = js.Dynamic.literal(dropInsideItem = dropInsideItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragDropInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragDropInfo] (val x: Self) extends AnyVal {
      
      inline def setDropInsideItem(value: Boolean): Self = StObject.set(x, "dropInsideItem", value.asInstanceOf[js.Any])
    }
  }
  
  trait DragReorderInfo extends StObject {
    
    val dropInsideItem: Boolean
    
    var promise: js.UndefOr[PromiseLike[Unit]] = js.undefined
  }
  object DragReorderInfo {
    
    inline def apply(dropInsideItem: Boolean): DragReorderInfo = {
      val __obj = js.Dynamic.literal(dropInsideItem = dropInsideItem.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragReorderInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragReorderInfo] (val x: Self) extends AnyVal {
      
      inline def setDropInsideItem(value: Boolean): Self = StObject.set(x, "dropInsideItem", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: PromiseLike[Unit]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
    }
  }
  
  trait DragStartEventInfo[T /* <: GridBase[TRowData, TKey] */, TRowData, TKey] extends StObject {
    
    val component: T
    
    val event: DxEvent[PointerEvent | MouseEvent | TouchEvent]
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val fromIndex: Double
    
    var itemData: js.UndefOr[TRowData] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
  }
  object DragStartEventInfo {
    
    inline def apply[T /* <: GridBase[TRowData, TKey] */, TRowData, TKey](
      component: T,
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement]
    ): DragStartEventInfo[T, TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[DragStartEventInfo[T, TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragStartEventInfo[?, ?, ?], T /* <: GridBase[TRowData, TKey] */, TRowData, TKey] (val x: Self & (DragStartEventInfo[T, TRowData, TKey])) extends AnyVal {
      
      inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: DxEvent[PointerEvent | MouseEvent | TouchEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: TRowData): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditCanceledEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with DataChangeInfo[TRowData, TKey]
  object EditCanceledEvent {
    
    inline def apply[TRowData, TKey](
      changes: js.Array[typings.devextreme.mod.DevExpress.common.grids.DataChange[TRowData, TKey]],
      component: dxDataGrid[TRowData, TKey],
      element: DxElement_[HTMLElement]
    ): EditCanceledEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditCanceledEvent[TRowData, TKey]]
    }
  }
  
  trait EditCancelingEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with DataChangeInfo[TRowData, TKey]
  object EditCancelingEvent {
    
    inline def apply[TRowData, TKey](
      changes: js.Array[typings.devextreme.mod.DevExpress.common.grids.DataChange[TRowData, TKey]],
      component: dxDataGrid[TRowData, TKey],
      element: DxElement_[HTMLElement]
    ): EditCancelingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditCancelingEvent[TRowData, TKey]]
    }
  }
  
  trait Editing[TRowData, TKey]
    extends StObject
       with EditingBase[TRowData, TKey] {
    
    /**
      * Specifies whether a user can add new rows.
      */
    var allowAdding: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether a user can delete rows. It is called for each data row when defined as a function.
      */
    var allowDeleting: js.UndefOr[Boolean | (js.Function1[/* options */ ComponentRow[TRowData, TKey], Boolean])] = js.undefined
    
    /**
      * Specifies whether a user can update rows. It is called for each data row when defined as a function.
      */
    var allowUpdating: js.UndefOr[Boolean | (js.Function1[/* options */ ComponentRow[TRowData, TKey], Boolean])] = js.undefined
    
    /**
      * Specifies a position for a new row.
      */
    var newRowPosition: js.UndefOr[NewRowPosition] = js.undefined
    
    /**
      * Contains properties that specify texts for editing-related UI elements.
      */
    @JSName("texts")
    var texts_Editing: js.UndefOr[Any] = js.undefined
  }
  object Editing {
    
    inline def apply[TRowData, TKey](): Editing[TRowData, TKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Editing[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Editing[?, ?], TRowData, TKey] (val x: Self & (Editing[TRowData, TKey])) extends AnyVal {
      
      inline def setAllowAdding(value: Boolean): Self = StObject.set(x, "allowAdding", value.asInstanceOf[js.Any])
      
      inline def setAllowAddingUndefined: Self = StObject.set(x, "allowAdding", js.undefined)
      
      inline def setAllowDeleting(value: Boolean | (js.Function1[/* options */ ComponentRow[TRowData, TKey], Boolean])): Self = StObject.set(x, "allowDeleting", value.asInstanceOf[js.Any])
      
      inline def setAllowDeletingFunction1(value: /* options */ ComponentRow[TRowData, TKey] => Boolean): Self = StObject.set(x, "allowDeleting", js.Any.fromFunction1(value))
      
      inline def setAllowDeletingUndefined: Self = StObject.set(x, "allowDeleting", js.undefined)
      
      inline def setAllowUpdating(value: Boolean | (js.Function1[/* options */ ComponentRow[TRowData, TKey], Boolean])): Self = StObject.set(x, "allowUpdating", value.asInstanceOf[js.Any])
      
      inline def setAllowUpdatingFunction1(value: /* options */ ComponentRow[TRowData, TKey] => Boolean): Self = StObject.set(x, "allowUpdating", js.Any.fromFunction1(value))
      
      inline def setAllowUpdatingUndefined: Self = StObject.set(x, "allowUpdating", js.undefined)
      
      inline def setNewRowPosition(value: NewRowPosition): Self = StObject.set(x, "newRowPosition", value.asInstanceOf[js.Any])
      
      inline def setNewRowPositionUndefined: Self = StObject.set(x, "newRowPosition", js.undefined)
      
      inline def setTexts(value: Any): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
      
      inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    }
  }
  
  trait EditingBase[TRowData, TKey] extends StObject {
    
    /**
      * An array of pending row changes.
      */
    var changes: js.UndefOr[
        js.Array[typings.devextreme.mod.DevExpress.common.grids.DataChange[TRowData, TKey]]
      ] = js.undefined
    
    /**
      * Specifies if confirmation is required when a user deletes a row.
      */
    var confirmDelete: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The name of a column being edited. Applies only if editing.mode is &apos;cell&apos; or &apos;batch&apos;.
      */
    var editColumnName: js.UndefOr[String] = js.undefined
    
    /**
      * The key(s) of a row being edited.
      */
    var editRowKey: js.UndefOr[TKey] = js.undefined
    
    /**
      * Configures the form. Used only if editing.mode is &apos;form&apos; or &apos;popup&apos;.
      */
    var form: js.UndefOr[dxFormOptions] = js.undefined
    
    /**
      * Specifies how a user edits data.
      */
    var mode: js.UndefOr[GridsEditMode] = js.undefined
    
    /**
      * Configures the popup. Used only if editing.mode is &apos;popup&apos;.
      */
    var popup: js.UndefOr[typings.devextreme.mod.DevExpress.ui.dxPopup.Properties] = js.undefined
    
    /**
      * Specifies operations that are performed after saving changes.
      */
    var refreshMode: js.UndefOr[GridsEditRefreshMode] = js.undefined
    
    /**
      * Specifies whether to select text in a cell when a user starts editing.
      */
    var selectTextOnEditStart: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether a single or double click should switch a cell to the editing state. Applies if editing.mode is &apos;cell&apos; or &apos;batch&apos;.
      */
    var startEditAction: js.UndefOr[StartEditAction] = js.undefined
    
    /**
      * Contains properties that specify texts for editing-related UI elements.
      */
    var texts: js.UndefOr[EditingTextsBase] = js.undefined
    
    /**
      * Specifies whether the edit column uses icons instead of links.
      */
    var useIcons: js.UndefOr[Boolean] = js.undefined
  }
  object EditingBase {
    
    inline def apply[TRowData, TKey](): EditingBase[TRowData, TKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditingBase[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditingBase[?, ?], TRowData, TKey] (val x: Self & (EditingBase[TRowData, TKey])) extends AnyVal {
      
      inline def setChanges(value: js.Array[typings.devextreme.mod.DevExpress.common.grids.DataChange[TRowData, TKey]]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesUndefined: Self = StObject.set(x, "changes", js.undefined)
      
      inline def setChangesVarargs(value: (typings.devextreme.mod.DevExpress.common.grids.DataChange[TRowData, TKey])*): Self = StObject.set(x, "changes", js.Array(value*))
      
      inline def setConfirmDelete(value: Boolean): Self = StObject.set(x, "confirmDelete", value.asInstanceOf[js.Any])
      
      inline def setConfirmDeleteUndefined: Self = StObject.set(x, "confirmDelete", js.undefined)
      
      inline def setEditColumnName(value: String): Self = StObject.set(x, "editColumnName", value.asInstanceOf[js.Any])
      
      inline def setEditColumnNameUndefined: Self = StObject.set(x, "editColumnName", js.undefined)
      
      inline def setEditRowKey(value: TKey): Self = StObject.set(x, "editRowKey", value.asInstanceOf[js.Any])
      
      inline def setEditRowKeyUndefined: Self = StObject.set(x, "editRowKey", js.undefined)
      
      inline def setForm(value: dxFormOptions): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      inline def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      inline def setMode(value: GridsEditMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setPopup(value: typings.devextreme.mod.DevExpress.ui.dxPopup.Properties): Self = StObject.set(x, "popup", value.asInstanceOf[js.Any])
      
      inline def setPopupUndefined: Self = StObject.set(x, "popup", js.undefined)
      
      inline def setRefreshMode(value: GridsEditRefreshMode): Self = StObject.set(x, "refreshMode", value.asInstanceOf[js.Any])
      
      inline def setRefreshModeUndefined: Self = StObject.set(x, "refreshMode", js.undefined)
      
      inline def setSelectTextOnEditStart(value: Boolean): Self = StObject.set(x, "selectTextOnEditStart", value.asInstanceOf[js.Any])
      
      inline def setSelectTextOnEditStartUndefined: Self = StObject.set(x, "selectTextOnEditStart", js.undefined)
      
      inline def setStartEditAction(value: StartEditAction): Self = StObject.set(x, "startEditAction", value.asInstanceOf[js.Any])
      
      inline def setStartEditActionUndefined: Self = StObject.set(x, "startEditAction", js.undefined)
      
      inline def setTexts(value: EditingTextsBase): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
      
      inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
      
      inline def setUseIcons(value: Boolean): Self = StObject.set(x, "useIcons", value.asInstanceOf[js.Any])
      
      inline def setUseIconsUndefined: Self = StObject.set(x, "useIcons", js.undefined)
    }
  }
  
  trait EditingStartEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with EventInfo[dxDataGrid[TRowData, TKey]] {
    
    val column: js.UndefOr[Column[TRowData, TKey]] = js.undefined
    
    val data: TRowData
    
    val key: TKey
  }
  object EditingStartEvent {
    
    inline def apply[TRowData, TKey](component: dxDataGrid[TRowData, TKey], data: TRowData, element: DxElement_[HTMLElement], key: TKey): EditingStartEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditingStartEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditingStartEvent[?, ?], TRowData, TKey] (val x: Self & (EditingStartEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditingTextsBase extends StObject {
    
    /**
      * Specifies text for a hint that appears when a user pauses on the global &apos;Add&apos; button. Applies only if editing.allowAdding is true.
      */
    var addRow: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies text for a hint that appears when a user pauses on the &apos;Discard&apos; button. Applies only if editing.mode is &apos;batch&apos;.
      */
    var cancelAllChanges: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies text for a button that cancels changes in a row. Applies only if editing.allowUpdating is true and editing.mode is &apos;row&apos;.
      */
    var cancelRowChanges: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a message that prompts a user to confirm deletion.
      */
    var confirmDeleteMessage: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a title for the window that asks a user to confirm deletion.
      */
    var confirmDeleteTitle: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies text for buttons that delete rows. Applies only if allowDeleting is true.
      */
    var deleteRow: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies text for buttons that switch rows into the editing state. Applies only if allowUpdating is true.
      */
    var editRow: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies text for a hint that appears when a user pauses on the global &apos;Save&apos; button. Applies only if editing.mode is &apos;batch&apos;.
      */
    var saveAllChanges: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies text for a button that saves changes made in a row. Applies only if allowUpdating is true.
      */
    var saveRowChanges: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies text for buttons that recover deleted rows. Applies only if allowDeleting is true and editing.mode is &apos;batch&apos;.
      */
    var undeleteRow: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies text for a hint appearing when a user pauses on the button that cancels changes in a cell. Applies only if editing.mode is &apos;cell&apos; and data validation is enabled.
      */
    var validationCancelChanges: js.UndefOr[String] = js.undefined
  }
  object EditingTextsBase {
    
    inline def apply(): EditingTextsBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditingTextsBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditingTextsBase] (val x: Self) extends AnyVal {
      
      inline def setAddRow(value: String): Self = StObject.set(x, "addRow", value.asInstanceOf[js.Any])
      
      inline def setAddRowUndefined: Self = StObject.set(x, "addRow", js.undefined)
      
      inline def setCancelAllChanges(value: String): Self = StObject.set(x, "cancelAllChanges", value.asInstanceOf[js.Any])
      
      inline def setCancelAllChangesUndefined: Self = StObject.set(x, "cancelAllChanges", js.undefined)
      
      inline def setCancelRowChanges(value: String): Self = StObject.set(x, "cancelRowChanges", value.asInstanceOf[js.Any])
      
      inline def setCancelRowChangesUndefined: Self = StObject.set(x, "cancelRowChanges", js.undefined)
      
      inline def setConfirmDeleteMessage(value: String): Self = StObject.set(x, "confirmDeleteMessage", value.asInstanceOf[js.Any])
      
      inline def setConfirmDeleteMessageUndefined: Self = StObject.set(x, "confirmDeleteMessage", js.undefined)
      
      inline def setConfirmDeleteTitle(value: String): Self = StObject.set(x, "confirmDeleteTitle", value.asInstanceOf[js.Any])
      
      inline def setConfirmDeleteTitleUndefined: Self = StObject.set(x, "confirmDeleteTitle", js.undefined)
      
      inline def setDeleteRow(value: String): Self = StObject.set(x, "deleteRow", value.asInstanceOf[js.Any])
      
      inline def setDeleteRowUndefined: Self = StObject.set(x, "deleteRow", js.undefined)
      
      inline def setEditRow(value: String): Self = StObject.set(x, "editRow", value.asInstanceOf[js.Any])
      
      inline def setEditRowUndefined: Self = StObject.set(x, "editRow", js.undefined)
      
      inline def setSaveAllChanges(value: String): Self = StObject.set(x, "saveAllChanges", value.asInstanceOf[js.Any])
      
      inline def setSaveAllChangesUndefined: Self = StObject.set(x, "saveAllChanges", js.undefined)
      
      inline def setSaveRowChanges(value: String): Self = StObject.set(x, "saveRowChanges", value.asInstanceOf[js.Any])
      
      inline def setSaveRowChangesUndefined: Self = StObject.set(x, "saveRowChanges", js.undefined)
      
      inline def setUndeleteRow(value: String): Self = StObject.set(x, "undeleteRow", value.asInstanceOf[js.Any])
      
      inline def setUndeleteRowUndefined: Self = StObject.set(x, "undeleteRow", js.undefined)
      
      inline def setValidationCancelChanges(value: String): Self = StObject.set(x, "validationCancelChanges", value.asInstanceOf[js.Any])
      
      inline def setValidationCancelChangesUndefined: Self = StObject.set(x, "validationCancelChanges", js.undefined)
    }
  }
  
  trait EditorPreparedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]] {
    
    val dataField: js.UndefOr[String] = js.undefined
    
    val disabled: Boolean
    
    val editorElement: DxElement_[HTMLElement]
    
    val parentType: String
    
    val readOnly: Boolean
    
    val row: js.UndefOr[Row[TRowData, TKey]] = js.undefined
    
    val rtlEnabled: Boolean
    
    val setValue: js.UndefOr[Any] = js.undefined
    
    val updateValueTimeout: js.UndefOr[Double] = js.undefined
    
    val value: js.UndefOr[Any] = js.undefined
    
    val width: js.UndefOr[Double] = js.undefined
  }
  object EditorPreparedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      disabled: Boolean,
      editorElement: DxElement_[HTMLElement],
      element: DxElement_[HTMLElement],
      parentType: String,
      readOnly: Boolean,
      rtlEnabled: Boolean
    ): EditorPreparedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editorElement = editorElement.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], rtlEnabled = rtlEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorPreparedEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorPreparedEvent[?, ?], TRowData, TKey] (val x: Self & (EditorPreparedEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
      
      inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEditorElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "editorElement", value.asInstanceOf[js.Any])
      
      inline def setParentType(value: String): Self = StObject.set(x, "parentType", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setRtlEnabled(value: Boolean): Self = StObject.set(x, "rtlEnabled", value.asInstanceOf[js.Any])
      
      inline def setSetValue(value: Any): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
      
      inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      
      inline def setUpdateValueTimeout(value: Double): Self = StObject.set(x, "updateValueTimeout", value.asInstanceOf[js.Any])
      
      inline def setUpdateValueTimeoutUndefined: Self = StObject.set(x, "updateValueTimeout", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait EditorPreparingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]] {
    
    var cancel: Boolean
    
    val dataField: js.UndefOr[String] = js.undefined
    
    val disabled: Boolean
    
    val editorElement: DxElement_[HTMLElement]
    
    var editorName: String
    
    var editorOptions: Any
    
    val parentType: String
    
    val readOnly: Boolean
    
    val row: js.UndefOr[Row[TRowData, TKey]] = js.undefined
    
    val rtlEnabled: Boolean
    
    val setValue: js.UndefOr[Any] = js.undefined
    
    val updateValueTimeout: js.UndefOr[Double] = js.undefined
    
    val value: js.UndefOr[Any] = js.undefined
    
    val width: js.UndefOr[Double] = js.undefined
  }
  object EditorPreparingEvent {
    
    inline def apply[TRowData, TKey](
      cancel: Boolean,
      component: dxDataGrid[TRowData, TKey],
      disabled: Boolean,
      editorElement: DxElement_[HTMLElement],
      editorName: String,
      editorOptions: Any,
      element: DxElement_[HTMLElement],
      parentType: String,
      readOnly: Boolean,
      rtlEnabled: Boolean
    ): EditorPreparingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editorElement = editorElement.asInstanceOf[js.Any], editorName = editorName.asInstanceOf[js.Any], editorOptions = editorOptions.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], rtlEnabled = rtlEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorPreparingEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorPreparingEvent[?, ?], TRowData, TKey] (val x: Self & (EditorPreparingEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setDataField(value: String): Self = StObject.set(x, "dataField", value.asInstanceOf[js.Any])
      
      inline def setDataFieldUndefined: Self = StObject.set(x, "dataField", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEditorElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "editorElement", value.asInstanceOf[js.Any])
      
      inline def setEditorName(value: String): Self = StObject.set(x, "editorName", value.asInstanceOf[js.Any])
      
      inline def setEditorOptions(value: Any): Self = StObject.set(x, "editorOptions", value.asInstanceOf[js.Any])
      
      inline def setParentType(value: String): Self = StObject.set(x, "parentType", value.asInstanceOf[js.Any])
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
      
      inline def setRtlEnabled(value: Boolean): Self = StObject.set(x, "rtlEnabled", value.asInstanceOf[js.Any])
      
      inline def setSetValue(value: Any): Self = StObject.set(x, "setValue", value.asInstanceOf[js.Any])
      
      inline def setSetValueUndefined: Self = StObject.set(x, "setValue", js.undefined)
      
      inline def setUpdateValueTimeout(value: Double): Self = StObject.set(x, "updateValueTimeout", value.asInstanceOf[js.Any])
      
      inline def setUpdateValueTimeoutUndefined: Self = StObject.set(x, "updateValueTimeout", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.center
    - typings.devextreme.devextremeStrings.centerContinuous
    - typings.devextreme.devextremeStrings.distributed
    - typings.devextreme.devextremeStrings.fill
    - typings.devextreme.devextremeStrings.general
    - typings.devextreme.devextremeStrings.justify
    - typings.devextreme.devextremeStrings.left
    - typings.devextreme.devextremeStrings.right
  */
  trait ExcelCellHorizontalAlignment extends StObject
  object ExcelCellHorizontalAlignment {
    
    inline def center: typings.devextreme.devextremeStrings.center = "center".asInstanceOf[typings.devextreme.devextremeStrings.center]
    
    inline def centerContinuous: typings.devextreme.devextremeStrings.centerContinuous = "centerContinuous".asInstanceOf[typings.devextreme.devextremeStrings.centerContinuous]
    
    inline def distributed: typings.devextreme.devextremeStrings.distributed = "distributed".asInstanceOf[typings.devextreme.devextremeStrings.distributed]
    
    inline def fill: typings.devextreme.devextremeStrings.fill = "fill".asInstanceOf[typings.devextreme.devextremeStrings.fill]
    
    inline def general: typings.devextreme.devextremeStrings.general = "general".asInstanceOf[typings.devextreme.devextremeStrings.general]
    
    inline def justify: typings.devextreme.devextremeStrings.justify = "justify".asInstanceOf[typings.devextreme.devextremeStrings.justify]
    
    inline def left: typings.devextreme.devextremeStrings.left = "left".asInstanceOf[typings.devextreme.devextremeStrings.left]
    
    inline def right: typings.devextreme.devextremeStrings.right = "right".asInstanceOf[typings.devextreme.devextremeStrings.right]
  }
  
  trait ExcelCellInfo[TRowData, TKey] extends StObject {
    
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    val component: dxDataGrid[TRowData, TKey]
    
    var fillPatternColor: js.UndefOr[String] = js.undefined
    
    var fillPatternType: js.UndefOr[ExcelCellPatternType] = js.undefined
    
    var font: js.UndefOr[ExcelFont] = js.undefined
    
    var gridCell: js.UndefOr[DataGridCell] = js.undefined
    
    var horizontalAlignment: js.UndefOr[ExcelCellHorizontalAlignment] = js.undefined
    
    var numberFormat: js.UndefOr[String] = js.undefined
    
    val value: js.UndefOr[String | Double | js.Date] = js.undefined
    
    var verticalAlignment: js.UndefOr[ExcelCellVerticalAlignment] = js.undefined
    
    var wrapTextEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object ExcelCellInfo {
    
    inline def apply[TRowData, TKey](component: dxDataGrid[TRowData, TKey]): ExcelCellInfo[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExcelCellInfo[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExcelCellInfo[?, ?], TRowData, TKey] (val x: Self & (ExcelCellInfo[TRowData, TKey])) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setComponent(value: dxDataGrid[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setFillPatternColor(value: String): Self = StObject.set(x, "fillPatternColor", value.asInstanceOf[js.Any])
      
      inline def setFillPatternColorUndefined: Self = StObject.set(x, "fillPatternColor", js.undefined)
      
      inline def setFillPatternType(value: ExcelCellPatternType): Self = StObject.set(x, "fillPatternType", value.asInstanceOf[js.Any])
      
      inline def setFillPatternTypeUndefined: Self = StObject.set(x, "fillPatternType", js.undefined)
      
      inline def setFont(value: ExcelFont): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      inline def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      inline def setGridCell(value: DataGridCell): Self = StObject.set(x, "gridCell", value.asInstanceOf[js.Any])
      
      inline def setGridCellUndefined: Self = StObject.set(x, "gridCell", js.undefined)
      
      inline def setHorizontalAlignment(value: ExcelCellHorizontalAlignment): Self = StObject.set(x, "horizontalAlignment", value.asInstanceOf[js.Any])
      
      inline def setHorizontalAlignmentUndefined: Self = StObject.set(x, "horizontalAlignment", js.undefined)
      
      inline def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
      
      inline def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
      
      inline def setValue(value: String | Double | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVerticalAlignment(value: ExcelCellVerticalAlignment): Self = StObject.set(x, "verticalAlignment", value.asInstanceOf[js.Any])
      
      inline def setVerticalAlignmentUndefined: Self = StObject.set(x, "verticalAlignment", js.undefined)
      
      inline def setWrapTextEnabled(value: Boolean): Self = StObject.set(x, "wrapTextEnabled", value.asInstanceOf[js.Any])
      
      inline def setWrapTextEnabledUndefined: Self = StObject.set(x, "wrapTextEnabled", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.darkDown
    - typings.devextreme.devextremeStrings.darkGray
    - typings.devextreme.devextremeStrings.darkGrid
    - typings.devextreme.devextremeStrings.darkHorizontal
    - typings.devextreme.devextremeStrings.darkTrellis
    - typings.devextreme.devextremeStrings.darkUp
    - typings.devextreme.devextremeStrings.darkVertical
    - typings.devextreme.devextremeStrings.gray0625
    - typings.devextreme.devextremeStrings.gray125
    - typings.devextreme.devextremeStrings.lightDown
    - typings.devextreme.devextremeStrings.lightGray
    - typings.devextreme.devextremeStrings.lightGrid
    - typings.devextreme.devextremeStrings.lightHorizontal
    - typings.devextreme.devextremeStrings.lightTrellis
    - typings.devextreme.devextremeStrings.lightUp
    - typings.devextreme.devextremeStrings.lightVertical
    - typings.devextreme.devextremeStrings.mediumGray
    - typings.devextreme.devextremeStrings.none
    - typings.devextreme.devextremeStrings.solid
  */
  trait ExcelCellPatternType extends StObject
  object ExcelCellPatternType {
    
    inline def darkDown: typings.devextreme.devextremeStrings.darkDown = "darkDown".asInstanceOf[typings.devextreme.devextremeStrings.darkDown]
    
    inline def darkGray: typings.devextreme.devextremeStrings.darkGray = "darkGray".asInstanceOf[typings.devextreme.devextremeStrings.darkGray]
    
    inline def darkGrid: typings.devextreme.devextremeStrings.darkGrid = "darkGrid".asInstanceOf[typings.devextreme.devextremeStrings.darkGrid]
    
    inline def darkHorizontal: typings.devextreme.devextremeStrings.darkHorizontal = "darkHorizontal".asInstanceOf[typings.devextreme.devextremeStrings.darkHorizontal]
    
    inline def darkTrellis: typings.devextreme.devextremeStrings.darkTrellis = "darkTrellis".asInstanceOf[typings.devextreme.devextremeStrings.darkTrellis]
    
    inline def darkUp: typings.devextreme.devextremeStrings.darkUp = "darkUp".asInstanceOf[typings.devextreme.devextremeStrings.darkUp]
    
    inline def darkVertical: typings.devextreme.devextremeStrings.darkVertical = "darkVertical".asInstanceOf[typings.devextreme.devextremeStrings.darkVertical]
    
    inline def gray0625: typings.devextreme.devextremeStrings.gray0625 = "gray0625".asInstanceOf[typings.devextreme.devextremeStrings.gray0625]
    
    inline def gray125: typings.devextreme.devextremeStrings.gray125 = "gray125".asInstanceOf[typings.devextreme.devextremeStrings.gray125]
    
    inline def lightDown: typings.devextreme.devextremeStrings.lightDown = "lightDown".asInstanceOf[typings.devextreme.devextremeStrings.lightDown]
    
    inline def lightGray: typings.devextreme.devextremeStrings.lightGray = "lightGray".asInstanceOf[typings.devextreme.devextremeStrings.lightGray]
    
    inline def lightGrid: typings.devextreme.devextremeStrings.lightGrid = "lightGrid".asInstanceOf[typings.devextreme.devextremeStrings.lightGrid]
    
    inline def lightHorizontal: typings.devextreme.devextremeStrings.lightHorizontal = "lightHorizontal".asInstanceOf[typings.devextreme.devextremeStrings.lightHorizontal]
    
    inline def lightTrellis: typings.devextreme.devextremeStrings.lightTrellis = "lightTrellis".asInstanceOf[typings.devextreme.devextremeStrings.lightTrellis]
    
    inline def lightUp: typings.devextreme.devextremeStrings.lightUp = "lightUp".asInstanceOf[typings.devextreme.devextremeStrings.lightUp]
    
    inline def lightVertical: typings.devextreme.devextremeStrings.lightVertical = "lightVertical".asInstanceOf[typings.devextreme.devextremeStrings.lightVertical]
    
    inline def mediumGray: typings.devextreme.devextremeStrings.mediumGray = "mediumGray".asInstanceOf[typings.devextreme.devextremeStrings.mediumGray]
    
    inline def none: typings.devextreme.devextremeStrings.none = "none".asInstanceOf[typings.devextreme.devextremeStrings.none]
    
    inline def solid: typings.devextreme.devextremeStrings.solid = "solid".asInstanceOf[typings.devextreme.devextremeStrings.solid]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.bottom
    - typings.devextreme.devextremeStrings.center
    - typings.devextreme.devextremeStrings.distributed
    - typings.devextreme.devextremeStrings.justify
    - typings.devextreme.devextremeStrings.top
  */
  trait ExcelCellVerticalAlignment extends StObject
  object ExcelCellVerticalAlignment {
    
    inline def bottom: typings.devextreme.devextremeStrings.bottom = "bottom".asInstanceOf[typings.devextreme.devextremeStrings.bottom]
    
    inline def center: typings.devextreme.devextremeStrings.center = "center".asInstanceOf[typings.devextreme.devextremeStrings.center]
    
    inline def distributed: typings.devextreme.devextremeStrings.distributed = "distributed".asInstanceOf[typings.devextreme.devextremeStrings.distributed]
    
    inline def justify: typings.devextreme.devextremeStrings.justify = "justify".asInstanceOf[typings.devextreme.devextremeStrings.justify]
    
    inline def top: typings.devextreme.devextremeStrings.top = "top".asInstanceOf[typings.devextreme.devextremeStrings.top]
  }
  
  trait ExplicitTypes[TRowData, TKey] extends StObject {
    
    var AdaptiveDetailRowPreparingEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.AdaptiveDetailRowPreparingEvent[TRowData, TKey]
    
    var CellClickEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.CellClickEvent[TRowData, TKey]
    
    var CellDblClickEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.CellDblClickEvent[TRowData, TKey]
    
    var CellHoverChangedEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.CellHoverChangedEvent[TRowData, TKey]
    
    var CellPreparedEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.CellPreparedEvent[TRowData, TKey]
    
    var Column: typings.devextreme.mod.DevExpress.ui.dxDataGrid.Column[TRowData, TKey]
    
    var ColumnButton: typings.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnButton[TRowData, TKey]
    
    var ColumnButtonClickEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnButtonClickEvent[TRowData, TKey]
    
    var ColumnButtonTemplateData: typings.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnButtonTemplateData[TRowData, TKey]
    
    var ColumnCellTemplateData: typings.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnCellTemplateData[TRowData, TKey]
    
    var ColumnEditCellTemplateData: typings.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnEditCellTemplateData[TRowData, TKey]
    
    var ColumnGroupCellTemplateData: typings.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnGroupCellTemplateData[TRowData, TKey]
    
    var ColumnHeaderCellTemplateData: typings.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnHeaderCellTemplateData[TRowData, TKey]
    
    var ContentReadyEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.ContentReadyEvent[TRowData, TKey]
    
    var ContextMenuPreparingEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.ContextMenuPreparingEvent[TRowData, TKey]
    
    var CustomSummaryInfo: typings.devextreme.mod.DevExpress.ui.dxDataGrid.CustomSummaryInfo[TRowData, TKey]
    
    var DataErrorOccurredEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.DataErrorOccurredEvent[TRowData, TKey]
    
    var DataRowTemplateData: typings.devextreme.mod.DevExpress.ui.dxDataGrid.DataRowTemplateData[TRowData, TKey]
    
    var DisposingEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.DisposingEvent[TRowData, TKey]
    
    var EditCanceledEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.EditCanceledEvent[TRowData, TKey]
    
    var EditCancelingEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.EditCancelingEvent[TRowData, TKey]
    
    var Editing: typings.devextreme.mod.DevExpress.ui.dxDataGrid.Editing[TRowData, TKey]
    
    var EditingStartEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.EditingStartEvent[TRowData, TKey]
    
    var EditorPreparedEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.EditorPreparedEvent[TRowData, TKey]
    
    var EditorPreparingEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.EditorPreparingEvent[TRowData, TKey]
    
    var ExcelCellInfo: typings.devextreme.mod.DevExpress.ui.dxDataGrid.ExcelCellInfo[TRowData, TKey]
    
    var Export: typings.devextreme.mod.DevExpress.ui.dxDataGrid.Export[TRowData, TKey]
    
    var ExportTexts: typings.devextreme.mod.DevExpress.ui.dxDataGrid.ExportTexts
    
    var ExportedEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.ExportedEvent[TRowData, TKey]
    
    var ExportingEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.ExportingEvent[TRowData, TKey]
    
    var FileSavingEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.FileSavingEvent[TRowData, TKey]
    
    var FocusedCellChangedEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.FocusedCellChangedEvent[TRowData, TKey]
    
    var FocusedCellChangingEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.FocusedCellChangingEvent[TRowData, TKey]
    
    var FocusedRowChangedEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.FocusedRowChangedEvent[TRowData, TKey]
    
    var FocusedRowChangingEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.FocusedRowChangingEvent[TRowData, TKey]
    
    var GroupData: typings.devextreme.mod.DevExpress.ui.dxDataGrid.GroupData[TRowData]
    
    var GroupPanel: typings.devextreme.mod.DevExpress.ui.dxDataGrid.GroupPanel
    
    var Grouping: typings.devextreme.mod.DevExpress.ui.dxDataGrid.Grouping
    
    var GroupingTexts: typings.devextreme.mod.DevExpress.ui.dxDataGrid.GroupingTexts
    
    var InitNewRowEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.InitNewRowEvent[TRowData, TKey]
    
    var InitializedEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.InitializedEvent[TRowData, TKey]
    
    var KeyDownEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.KeyDownEvent[TRowData, TKey]
    
    var MasterDetail: typings.devextreme.mod.DevExpress.ui.dxDataGrid.MasterDetail[TRowData, TKey]
    
    var MasterDetailTemplateData: typings.devextreme.mod.DevExpress.ui.dxDataGrid.MasterDetailTemplateData[TRowData, TKey]
    
    var OptionChangedEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.OptionChangedEvent[TRowData, TKey]
    
    var Properties: typings.devextreme.mod.DevExpress.ui.dxDataGrid.Properties[TRowData, TKey]
    
    var Row: typings.devextreme.mod.DevExpress.ui.dxDataGrid.Row[TRowData, TKey]
    
    var RowClickEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowClickEvent[TRowData, TKey]
    
    var RowCollapsedEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowCollapsedEvent[TRowData, TKey]
    
    var RowCollapsingEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowCollapsingEvent[TRowData, TKey]
    
    var RowDblClickEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowDblClickEvent[TRowData, TKey]
    
    var RowDraggingAddEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowDraggingAddEvent[TRowData, TKey]
    
    var RowDraggingChangeEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowDraggingChangeEvent[TRowData, TKey]
    
    var RowDraggingEndEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowDraggingEndEvent[TRowData, TKey]
    
    var RowDraggingMoveEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowDraggingMoveEvent[TRowData, TKey]
    
    var RowDraggingRemoveEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowDraggingRemoveEvent[TRowData, TKey]
    
    var RowDraggingReorderEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowDraggingReorderEvent[TRowData, TKey]
    
    var RowDraggingStartEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowDraggingStartEvent[TRowData, TKey]
    
    var RowDraggingTemplateData: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowDraggingTemplateData[TRowData]
    
    var RowExpandedEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowExpandedEvent[TRowData, TKey]
    
    var RowExpandingEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowExpandingEvent[TRowData, TKey]
    
    var RowInsertedEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowInsertedEvent[TRowData, TKey]
    
    var RowInsertingEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowInsertingEvent[TRowData, TKey]
    
    var RowPreparedEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowPreparedEvent[TRowData, TKey]
    
    var RowRemovedEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowRemovedEvent[TRowData, TKey]
    
    var RowRemovingEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowRemovingEvent[TRowData, TKey]
    
    var RowTemplateData: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowTemplateData[TRowData, TKey]
    
    var RowUpdatedEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowUpdatedEvent[TRowData, TKey]
    
    var RowUpdatingEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowUpdatingEvent[TRowData, TKey]
    
    var RowValidatingEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowValidatingEvent[TRowData, TKey]
    
    var SavedEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.SavedEvent[TRowData, TKey]
    
    var SavingEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.SavingEvent[TRowData, TKey]
    
    var Scrolling: typings.devextreme.mod.DevExpress.ui.dxDataGrid.Scrolling
    
    var Selection: typings.devextreme.mod.DevExpress.ui.dxDataGrid.Selection
    
    var SelectionChangedEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.SelectionChangedEvent[TRowData, TKey]
    
    var Summary: typings.devextreme.mod.DevExpress.ui.dxDataGrid.Summary[TRowData, TKey]
    
    var SummaryGroupItem: typings.devextreme.mod.DevExpress.ui.dxDataGrid.SummaryGroupItem
    
    var SummaryItemTextInfo: typings.devextreme.mod.DevExpress.ui.dxDataGrid.SummaryItemTextInfo
    
    var SummaryTexts: typings.devextreme.mod.DevExpress.ui.dxDataGrid.SummaryTexts
    
    var SummaryTotalItem: typings.devextreme.mod.DevExpress.ui.dxDataGrid.SummaryTotalItem
    
    var Toolbar: typings.devextreme.mod.DevExpress.ui.dxDataGrid.Toolbar
    
    var ToolbarItem: typings.devextreme.mod.DevExpress.ui.dxDataGrid.ToolbarItem
    
    var ToolbarPreparingEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.ToolbarPreparingEvent[TRowData, TKey]
  }
  object ExplicitTypes {
    
    inline def apply[TRowData, TKey](
      AdaptiveDetailRowPreparingEvent: AdaptiveDetailRowPreparingEvent[TRowData, TKey],
      CellClickEvent: CellClickEvent[TRowData, TKey],
      CellDblClickEvent: CellDblClickEvent[TRowData, TKey],
      CellHoverChangedEvent: CellHoverChangedEvent[TRowData, TKey],
      CellPreparedEvent: CellPreparedEvent[TRowData, TKey],
      Column: Column[TRowData, TKey],
      ColumnButton: ColumnButton[TRowData, TKey],
      ColumnButtonClickEvent: ColumnButtonClickEvent[TRowData, TKey],
      ColumnButtonTemplateData: ColumnButtonTemplateData[TRowData, TKey],
      ColumnCellTemplateData: ColumnCellTemplateData[TRowData, TKey],
      ColumnEditCellTemplateData: ColumnEditCellTemplateData[TRowData, TKey],
      ColumnGroupCellTemplateData: ColumnGroupCellTemplateData[TRowData, TKey],
      ColumnHeaderCellTemplateData: ColumnHeaderCellTemplateData[TRowData, TKey],
      ContentReadyEvent: ContentReadyEvent[TRowData, TKey],
      ContextMenuPreparingEvent: ContextMenuPreparingEvent[TRowData, TKey],
      CustomSummaryInfo: CustomSummaryInfo[TRowData, TKey],
      DataErrorOccurredEvent: DataErrorOccurredEvent[TRowData, TKey],
      DataRowTemplateData: DataRowTemplateData[TRowData, TKey],
      DisposingEvent: DisposingEvent[TRowData, TKey],
      EditCanceledEvent: EditCanceledEvent[TRowData, TKey],
      EditCancelingEvent: EditCancelingEvent[TRowData, TKey],
      Editing: Editing[TRowData, TKey],
      EditingStartEvent: EditingStartEvent[TRowData, TKey],
      EditorPreparedEvent: EditorPreparedEvent[TRowData, TKey],
      EditorPreparingEvent: EditorPreparingEvent[TRowData, TKey],
      ExcelCellInfo: ExcelCellInfo[TRowData, TKey],
      Export: Export[TRowData, TKey],
      ExportTexts: ExportTexts,
      ExportedEvent: ExportedEvent[TRowData, TKey],
      ExportingEvent: ExportingEvent[TRowData, TKey],
      FileSavingEvent: FileSavingEvent[TRowData, TKey],
      FocusedCellChangedEvent: FocusedCellChangedEvent[TRowData, TKey],
      FocusedCellChangingEvent: FocusedCellChangingEvent[TRowData, TKey],
      FocusedRowChangedEvent: FocusedRowChangedEvent[TRowData, TKey],
      FocusedRowChangingEvent: FocusedRowChangingEvent[TRowData, TKey],
      GroupData: GroupData[TRowData],
      GroupPanel: GroupPanel,
      Grouping: Grouping,
      GroupingTexts: GroupingTexts,
      InitNewRowEvent: InitNewRowEvent[TRowData, TKey],
      InitializedEvent: InitializedEvent[TRowData, TKey],
      KeyDownEvent: KeyDownEvent[TRowData, TKey],
      MasterDetail: MasterDetail[TRowData, TKey],
      MasterDetailTemplateData: MasterDetailTemplateData[TRowData, TKey],
      OptionChangedEvent: OptionChangedEvent[TRowData, TKey],
      Properties: Properties[TRowData, TKey],
      Row: Row[TRowData, TKey],
      RowClickEvent: RowClickEvent[TRowData, TKey],
      RowCollapsedEvent: RowCollapsedEvent[TRowData, TKey],
      RowCollapsingEvent: RowCollapsingEvent[TRowData, TKey],
      RowDblClickEvent: RowDblClickEvent[TRowData, TKey],
      RowDraggingAddEvent: RowDraggingAddEvent[TRowData, TKey],
      RowDraggingChangeEvent: RowDraggingChangeEvent[TRowData, TKey],
      RowDraggingEndEvent: RowDraggingEndEvent[TRowData, TKey],
      RowDraggingMoveEvent: RowDraggingMoveEvent[TRowData, TKey],
      RowDraggingRemoveEvent: RowDraggingRemoveEvent[TRowData, TKey],
      RowDraggingReorderEvent: RowDraggingReorderEvent[TRowData, TKey],
      RowDraggingStartEvent: RowDraggingStartEvent[TRowData, TKey],
      RowDraggingTemplateData: RowDraggingTemplateData[TRowData],
      RowExpandedEvent: RowExpandedEvent[TRowData, TKey],
      RowExpandingEvent: RowExpandingEvent[TRowData, TKey],
      RowInsertedEvent: RowInsertedEvent[TRowData, TKey],
      RowInsertingEvent: RowInsertingEvent[TRowData, TKey],
      RowPreparedEvent: RowPreparedEvent[TRowData, TKey],
      RowRemovedEvent: RowRemovedEvent[TRowData, TKey],
      RowRemovingEvent: RowRemovingEvent[TRowData, TKey],
      RowTemplateData: RowTemplateData[TRowData, TKey],
      RowUpdatedEvent: RowUpdatedEvent[TRowData, TKey],
      RowUpdatingEvent: RowUpdatingEvent[TRowData, TKey],
      RowValidatingEvent: RowValidatingEvent[TRowData, TKey],
      SavedEvent: SavedEvent[TRowData, TKey],
      SavingEvent: SavingEvent[TRowData, TKey],
      Scrolling: Scrolling,
      Selection: Selection,
      SelectionChangedEvent: SelectionChangedEvent[TRowData, TKey],
      Summary: Summary[TRowData, TKey],
      SummaryGroupItem: SummaryGroupItem,
      SummaryItemTextInfo: SummaryItemTextInfo,
      SummaryTexts: SummaryTexts,
      SummaryTotalItem: SummaryTotalItem,
      Toolbar: Toolbar,
      ToolbarItem: ToolbarItem,
      ToolbarPreparingEvent: ToolbarPreparingEvent[TRowData, TKey]
    ): ExplicitTypes[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(AdaptiveDetailRowPreparingEvent = AdaptiveDetailRowPreparingEvent.asInstanceOf[js.Any], CellClickEvent = CellClickEvent.asInstanceOf[js.Any], CellDblClickEvent = CellDblClickEvent.asInstanceOf[js.Any], CellHoverChangedEvent = CellHoverChangedEvent.asInstanceOf[js.Any], CellPreparedEvent = CellPreparedEvent.asInstanceOf[js.Any], Column = Column.asInstanceOf[js.Any], ColumnButton = ColumnButton.asInstanceOf[js.Any], ColumnButtonClickEvent = ColumnButtonClickEvent.asInstanceOf[js.Any], ColumnButtonTemplateData = ColumnButtonTemplateData.asInstanceOf[js.Any], ColumnCellTemplateData = ColumnCellTemplateData.asInstanceOf[js.Any], ColumnEditCellTemplateData = ColumnEditCellTemplateData.asInstanceOf[js.Any], ColumnGroupCellTemplateData = ColumnGroupCellTemplateData.asInstanceOf[js.Any], ColumnHeaderCellTemplateData = ColumnHeaderCellTemplateData.asInstanceOf[js.Any], ContentReadyEvent = ContentReadyEvent.asInstanceOf[js.Any], ContextMenuPreparingEvent = ContextMenuPreparingEvent.asInstanceOf[js.Any], CustomSummaryInfo = CustomSummaryInfo.asInstanceOf[js.Any], DataErrorOccurredEvent = DataErrorOccurredEvent.asInstanceOf[js.Any], DataRowTemplateData = DataRowTemplateData.asInstanceOf[js.Any], DisposingEvent = DisposingEvent.asInstanceOf[js.Any], EditCanceledEvent = EditCanceledEvent.asInstanceOf[js.Any], EditCancelingEvent = EditCancelingEvent.asInstanceOf[js.Any], Editing = Editing.asInstanceOf[js.Any], EditingStartEvent = EditingStartEvent.asInstanceOf[js.Any], EditorPreparedEvent = EditorPreparedEvent.asInstanceOf[js.Any], EditorPreparingEvent = EditorPreparingEvent.asInstanceOf[js.Any], ExcelCellInfo = ExcelCellInfo.asInstanceOf[js.Any], Export = Export.asInstanceOf[js.Any], ExportTexts = ExportTexts.asInstanceOf[js.Any], ExportedEvent = ExportedEvent.asInstanceOf[js.Any], ExportingEvent = ExportingEvent.asInstanceOf[js.Any], FileSavingEvent = FileSavingEvent.asInstanceOf[js.Any], FocusedCellChangedEvent = FocusedCellChangedEvent.asInstanceOf[js.Any], FocusedCellChangingEvent = FocusedCellChangingEvent.asInstanceOf[js.Any], FocusedRowChangedEvent = FocusedRowChangedEvent.asInstanceOf[js.Any], FocusedRowChangingEvent = FocusedRowChangingEvent.asInstanceOf[js.Any], GroupData = GroupData.asInstanceOf[js.Any], GroupPanel = GroupPanel.asInstanceOf[js.Any], Grouping = Grouping.asInstanceOf[js.Any], GroupingTexts = GroupingTexts.asInstanceOf[js.Any], InitNewRowEvent = InitNewRowEvent.asInstanceOf[js.Any], InitializedEvent = InitializedEvent.asInstanceOf[js.Any], KeyDownEvent = KeyDownEvent.asInstanceOf[js.Any], MasterDetail = MasterDetail.asInstanceOf[js.Any], MasterDetailTemplateData = MasterDetailTemplateData.asInstanceOf[js.Any], OptionChangedEvent = OptionChangedEvent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any], RowClickEvent = RowClickEvent.asInstanceOf[js.Any], RowCollapsedEvent = RowCollapsedEvent.asInstanceOf[js.Any], RowCollapsingEvent = RowCollapsingEvent.asInstanceOf[js.Any], RowDblClickEvent = RowDblClickEvent.asInstanceOf[js.Any], RowDraggingAddEvent = RowDraggingAddEvent.asInstanceOf[js.Any], RowDraggingChangeEvent = RowDraggingChangeEvent.asInstanceOf[js.Any], RowDraggingEndEvent = RowDraggingEndEvent.asInstanceOf[js.Any], RowDraggingMoveEvent = RowDraggingMoveEvent.asInstanceOf[js.Any], RowDraggingRemoveEvent = RowDraggingRemoveEvent.asInstanceOf[js.Any], RowDraggingReorderEvent = RowDraggingReorderEvent.asInstanceOf[js.Any], RowDraggingStartEvent = RowDraggingStartEvent.asInstanceOf[js.Any], RowDraggingTemplateData = RowDraggingTemplateData.asInstanceOf[js.Any], RowExpandedEvent = RowExpandedEvent.asInstanceOf[js.Any], RowExpandingEvent = RowExpandingEvent.asInstanceOf[js.Any], RowInsertedEvent = RowInsertedEvent.asInstanceOf[js.Any], RowInsertingEvent = RowInsertingEvent.asInstanceOf[js.Any], RowPreparedEvent = RowPreparedEvent.asInstanceOf[js.Any], RowRemovedEvent = RowRemovedEvent.asInstanceOf[js.Any], RowRemovingEvent = RowRemovingEvent.asInstanceOf[js.Any], RowTemplateData = RowTemplateData.asInstanceOf[js.Any], RowUpdatedEvent = RowUpdatedEvent.asInstanceOf[js.Any], RowUpdatingEvent = RowUpdatingEvent.asInstanceOf[js.Any], RowValidatingEvent = RowValidatingEvent.asInstanceOf[js.Any], SavedEvent = SavedEvent.asInstanceOf[js.Any], SavingEvent = SavingEvent.asInstanceOf[js.Any], Scrolling = Scrolling.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], SelectionChangedEvent = SelectionChangedEvent.asInstanceOf[js.Any], Summary = Summary.asInstanceOf[js.Any], SummaryGroupItem = SummaryGroupItem.asInstanceOf[js.Any], SummaryItemTextInfo = SummaryItemTextInfo.asInstanceOf[js.Any], SummaryTexts = SummaryTexts.asInstanceOf[js.Any], SummaryTotalItem = SummaryTotalItem.asInstanceOf[js.Any], Toolbar = Toolbar.asInstanceOf[js.Any], ToolbarItem = ToolbarItem.asInstanceOf[js.Any], ToolbarPreparingEvent = ToolbarPreparingEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitTypes[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExplicitTypes[?, ?], TRowData, TKey] (val x: Self & (ExplicitTypes[TRowData, TKey])) extends AnyVal {
      
      inline def setAdaptiveDetailRowPreparingEvent(value: AdaptiveDetailRowPreparingEvent[TRowData, TKey]): Self = StObject.set(x, "AdaptiveDetailRowPreparingEvent", value.asInstanceOf[js.Any])
      
      inline def setCellClickEvent(value: CellClickEvent[TRowData, TKey]): Self = StObject.set(x, "CellClickEvent", value.asInstanceOf[js.Any])
      
      inline def setCellDblClickEvent(value: CellDblClickEvent[TRowData, TKey]): Self = StObject.set(x, "CellDblClickEvent", value.asInstanceOf[js.Any])
      
      inline def setCellHoverChangedEvent(value: CellHoverChangedEvent[TRowData, TKey]): Self = StObject.set(x, "CellHoverChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setCellPreparedEvent(value: CellPreparedEvent[TRowData, TKey]): Self = StObject.set(x, "CellPreparedEvent", value.asInstanceOf[js.Any])
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "Column", value.asInstanceOf[js.Any])
      
      inline def setColumnButton(value: ColumnButton[TRowData, TKey]): Self = StObject.set(x, "ColumnButton", value.asInstanceOf[js.Any])
      
      inline def setColumnButtonClickEvent(value: ColumnButtonClickEvent[TRowData, TKey]): Self = StObject.set(x, "ColumnButtonClickEvent", value.asInstanceOf[js.Any])
      
      inline def setColumnButtonTemplateData(value: ColumnButtonTemplateData[TRowData, TKey]): Self = StObject.set(x, "ColumnButtonTemplateData", value.asInstanceOf[js.Any])
      
      inline def setColumnCellTemplateData(value: ColumnCellTemplateData[TRowData, TKey]): Self = StObject.set(x, "ColumnCellTemplateData", value.asInstanceOf[js.Any])
      
      inline def setColumnEditCellTemplateData(value: ColumnEditCellTemplateData[TRowData, TKey]): Self = StObject.set(x, "ColumnEditCellTemplateData", value.asInstanceOf[js.Any])
      
      inline def setColumnGroupCellTemplateData(value: ColumnGroupCellTemplateData[TRowData, TKey]): Self = StObject.set(x, "ColumnGroupCellTemplateData", value.asInstanceOf[js.Any])
      
      inline def setColumnHeaderCellTemplateData(value: ColumnHeaderCellTemplateData[TRowData, TKey]): Self = StObject.set(x, "ColumnHeaderCellTemplateData", value.asInstanceOf[js.Any])
      
      inline def setContentReadyEvent(value: ContentReadyEvent[TRowData, TKey]): Self = StObject.set(x, "ContentReadyEvent", value.asInstanceOf[js.Any])
      
      inline def setContextMenuPreparingEvent(value: ContextMenuPreparingEvent[TRowData, TKey]): Self = StObject.set(x, "ContextMenuPreparingEvent", value.asInstanceOf[js.Any])
      
      inline def setCustomSummaryInfo(value: CustomSummaryInfo[TRowData, TKey]): Self = StObject.set(x, "CustomSummaryInfo", value.asInstanceOf[js.Any])
      
      inline def setDataErrorOccurredEvent(value: DataErrorOccurredEvent[TRowData, TKey]): Self = StObject.set(x, "DataErrorOccurredEvent", value.asInstanceOf[js.Any])
      
      inline def setDataRowTemplateData(value: DataRowTemplateData[TRowData, TKey]): Self = StObject.set(x, "DataRowTemplateData", value.asInstanceOf[js.Any])
      
      inline def setDisposingEvent(value: DisposingEvent[TRowData, TKey]): Self = StObject.set(x, "DisposingEvent", value.asInstanceOf[js.Any])
      
      inline def setEditCanceledEvent(value: EditCanceledEvent[TRowData, TKey]): Self = StObject.set(x, "EditCanceledEvent", value.asInstanceOf[js.Any])
      
      inline def setEditCancelingEvent(value: EditCancelingEvent[TRowData, TKey]): Self = StObject.set(x, "EditCancelingEvent", value.asInstanceOf[js.Any])
      
      inline def setEditing(value: Editing[TRowData, TKey]): Self = StObject.set(x, "Editing", value.asInstanceOf[js.Any])
      
      inline def setEditingStartEvent(value: EditingStartEvent[TRowData, TKey]): Self = StObject.set(x, "EditingStartEvent", value.asInstanceOf[js.Any])
      
      inline def setEditorPreparedEvent(value: EditorPreparedEvent[TRowData, TKey]): Self = StObject.set(x, "EditorPreparedEvent", value.asInstanceOf[js.Any])
      
      inline def setEditorPreparingEvent(value: EditorPreparingEvent[TRowData, TKey]): Self = StObject.set(x, "EditorPreparingEvent", value.asInstanceOf[js.Any])
      
      inline def setExcelCellInfo(value: ExcelCellInfo[TRowData, TKey]): Self = StObject.set(x, "ExcelCellInfo", value.asInstanceOf[js.Any])
      
      inline def setExport(value: Export[TRowData, TKey]): Self = StObject.set(x, "Export", value.asInstanceOf[js.Any])
      
      inline def setExportTexts(value: ExportTexts): Self = StObject.set(x, "ExportTexts", value.asInstanceOf[js.Any])
      
      inline def setExportedEvent(value: ExportedEvent[TRowData, TKey]): Self = StObject.set(x, "ExportedEvent", value.asInstanceOf[js.Any])
      
      inline def setExportingEvent(value: ExportingEvent[TRowData, TKey]): Self = StObject.set(x, "ExportingEvent", value.asInstanceOf[js.Any])
      
      inline def setFileSavingEvent(value: FileSavingEvent[TRowData, TKey]): Self = StObject.set(x, "FileSavingEvent", value.asInstanceOf[js.Any])
      
      inline def setFocusedCellChangedEvent(value: FocusedCellChangedEvent[TRowData, TKey]): Self = StObject.set(x, "FocusedCellChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setFocusedCellChangingEvent(value: FocusedCellChangingEvent[TRowData, TKey]): Self = StObject.set(x, "FocusedCellChangingEvent", value.asInstanceOf[js.Any])
      
      inline def setFocusedRowChangedEvent(value: FocusedRowChangedEvent[TRowData, TKey]): Self = StObject.set(x, "FocusedRowChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setFocusedRowChangingEvent(value: FocusedRowChangingEvent[TRowData, TKey]): Self = StObject.set(x, "FocusedRowChangingEvent", value.asInstanceOf[js.Any])
      
      inline def setGroupData(value: GroupData[TRowData]): Self = StObject.set(x, "GroupData", value.asInstanceOf[js.Any])
      
      inline def setGroupPanel(value: GroupPanel): Self = StObject.set(x, "GroupPanel", value.asInstanceOf[js.Any])
      
      inline def setGrouping(value: Grouping): Self = StObject.set(x, "Grouping", value.asInstanceOf[js.Any])
      
      inline def setGroupingTexts(value: GroupingTexts): Self = StObject.set(x, "GroupingTexts", value.asInstanceOf[js.Any])
      
      inline def setInitNewRowEvent(value: InitNewRowEvent[TRowData, TKey]): Self = StObject.set(x, "InitNewRowEvent", value.asInstanceOf[js.Any])
      
      inline def setInitializedEvent(value: InitializedEvent[TRowData, TKey]): Self = StObject.set(x, "InitializedEvent", value.asInstanceOf[js.Any])
      
      inline def setKeyDownEvent(value: KeyDownEvent[TRowData, TKey]): Self = StObject.set(x, "KeyDownEvent", value.asInstanceOf[js.Any])
      
      inline def setMasterDetail(value: MasterDetail[TRowData, TKey]): Self = StObject.set(x, "MasterDetail", value.asInstanceOf[js.Any])
      
      inline def setMasterDetailTemplateData(value: MasterDetailTemplateData[TRowData, TKey]): Self = StObject.set(x, "MasterDetailTemplateData", value.asInstanceOf[js.Any])
      
      inline def setOptionChangedEvent(value: OptionChangedEvent[TRowData, TKey]): Self = StObject.set(x, "OptionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Properties[TRowData, TKey]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "Row", value.asInstanceOf[js.Any])
      
      inline def setRowClickEvent(value: RowClickEvent[TRowData, TKey]): Self = StObject.set(x, "RowClickEvent", value.asInstanceOf[js.Any])
      
      inline def setRowCollapsedEvent(value: RowCollapsedEvent[TRowData, TKey]): Self = StObject.set(x, "RowCollapsedEvent", value.asInstanceOf[js.Any])
      
      inline def setRowCollapsingEvent(value: RowCollapsingEvent[TRowData, TKey]): Self = StObject.set(x, "RowCollapsingEvent", value.asInstanceOf[js.Any])
      
      inline def setRowDblClickEvent(value: RowDblClickEvent[TRowData, TKey]): Self = StObject.set(x, "RowDblClickEvent", value.asInstanceOf[js.Any])
      
      inline def setRowDraggingAddEvent(value: RowDraggingAddEvent[TRowData, TKey]): Self = StObject.set(x, "RowDraggingAddEvent", value.asInstanceOf[js.Any])
      
      inline def setRowDraggingChangeEvent(value: RowDraggingChangeEvent[TRowData, TKey]): Self = StObject.set(x, "RowDraggingChangeEvent", value.asInstanceOf[js.Any])
      
      inline def setRowDraggingEndEvent(value: RowDraggingEndEvent[TRowData, TKey]): Self = StObject.set(x, "RowDraggingEndEvent", value.asInstanceOf[js.Any])
      
      inline def setRowDraggingMoveEvent(value: RowDraggingMoveEvent[TRowData, TKey]): Self = StObject.set(x, "RowDraggingMoveEvent", value.asInstanceOf[js.Any])
      
      inline def setRowDraggingRemoveEvent(value: RowDraggingRemoveEvent[TRowData, TKey]): Self = StObject.set(x, "RowDraggingRemoveEvent", value.asInstanceOf[js.Any])
      
      inline def setRowDraggingReorderEvent(value: RowDraggingReorderEvent[TRowData, TKey]): Self = StObject.set(x, "RowDraggingReorderEvent", value.asInstanceOf[js.Any])
      
      inline def setRowDraggingStartEvent(value: RowDraggingStartEvent[TRowData, TKey]): Self = StObject.set(x, "RowDraggingStartEvent", value.asInstanceOf[js.Any])
      
      inline def setRowDraggingTemplateData(value: RowDraggingTemplateData[TRowData]): Self = StObject.set(x, "RowDraggingTemplateData", value.asInstanceOf[js.Any])
      
      inline def setRowExpandedEvent(value: RowExpandedEvent[TRowData, TKey]): Self = StObject.set(x, "RowExpandedEvent", value.asInstanceOf[js.Any])
      
      inline def setRowExpandingEvent(value: RowExpandingEvent[TRowData, TKey]): Self = StObject.set(x, "RowExpandingEvent", value.asInstanceOf[js.Any])
      
      inline def setRowInsertedEvent(value: RowInsertedEvent[TRowData, TKey]): Self = StObject.set(x, "RowInsertedEvent", value.asInstanceOf[js.Any])
      
      inline def setRowInsertingEvent(value: RowInsertingEvent[TRowData, TKey]): Self = StObject.set(x, "RowInsertingEvent", value.asInstanceOf[js.Any])
      
      inline def setRowPreparedEvent(value: RowPreparedEvent[TRowData, TKey]): Self = StObject.set(x, "RowPreparedEvent", value.asInstanceOf[js.Any])
      
      inline def setRowRemovedEvent(value: RowRemovedEvent[TRowData, TKey]): Self = StObject.set(x, "RowRemovedEvent", value.asInstanceOf[js.Any])
      
      inline def setRowRemovingEvent(value: RowRemovingEvent[TRowData, TKey]): Self = StObject.set(x, "RowRemovingEvent", value.asInstanceOf[js.Any])
      
      inline def setRowTemplateData(value: RowTemplateData[TRowData, TKey]): Self = StObject.set(x, "RowTemplateData", value.asInstanceOf[js.Any])
      
      inline def setRowUpdatedEvent(value: RowUpdatedEvent[TRowData, TKey]): Self = StObject.set(x, "RowUpdatedEvent", value.asInstanceOf[js.Any])
      
      inline def setRowUpdatingEvent(value: RowUpdatingEvent[TRowData, TKey]): Self = StObject.set(x, "RowUpdatingEvent", value.asInstanceOf[js.Any])
      
      inline def setRowValidatingEvent(value: RowValidatingEvent[TRowData, TKey]): Self = StObject.set(x, "RowValidatingEvent", value.asInstanceOf[js.Any])
      
      inline def setSavedEvent(value: SavedEvent[TRowData, TKey]): Self = StObject.set(x, "SavedEvent", value.asInstanceOf[js.Any])
      
      inline def setSavingEvent(value: SavingEvent[TRowData, TKey]): Self = StObject.set(x, "SavingEvent", value.asInstanceOf[js.Any])
      
      inline def setScrolling(value: Scrolling): Self = StObject.set(x, "Scrolling", value.asInstanceOf[js.Any])
      
      inline def setSelection(value: Selection): Self = StObject.set(x, "Selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionChangedEvent(value: SelectionChangedEvent[TRowData, TKey]): Self = StObject.set(x, "SelectionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setSummary(value: Summary[TRowData, TKey]): Self = StObject.set(x, "Summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryGroupItem(value: SummaryGroupItem): Self = StObject.set(x, "SummaryGroupItem", value.asInstanceOf[js.Any])
      
      inline def setSummaryItemTextInfo(value: SummaryItemTextInfo): Self = StObject.set(x, "SummaryItemTextInfo", value.asInstanceOf[js.Any])
      
      inline def setSummaryTexts(value: SummaryTexts): Self = StObject.set(x, "SummaryTexts", value.asInstanceOf[js.Any])
      
      inline def setSummaryTotalItem(value: SummaryTotalItem): Self = StObject.set(x, "SummaryTotalItem", value.asInstanceOf[js.Any])
      
      inline def setToolbar(value: Toolbar): Self = StObject.set(x, "Toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarItem(value: ToolbarItem): Self = StObject.set(x, "ToolbarItem", value.asInstanceOf[js.Any])
      
      inline def setToolbarPreparingEvent(value: ToolbarPreparingEvent[TRowData, TKey]): Self = StObject.set(x, "ToolbarPreparingEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait Export[TRowData, TKey] extends StObject {
    
    /**
      * Allows users to export selected rows only.
      */
    var allowExportSelectedData: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Customizes an Excel cell after it is created.
      * @deprecated Since v20.1, we recommend ExcelJS-based export which does not use this property.
      */
    var customizeExcelCell: js.UndefOr[js.Function1[/* options */ ExcelCellInfo[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * Adds the Export button to the DataGrid&apos;s toolbar.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether to enable Excel filtering for the exported data in the resulting XLSX file.
      * @deprecated Since v20.1, we recommend ExcelJS-based export which does not use this property.
      */
    var excelFilterEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether to enable word wrapping for exported data in the resulting XLSX file.
      * @deprecated Since v20.1, we recommend ExcelJS-based export which does not use this property.
      */
    var excelWrapTextEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies a default name for the file to which grid data is exported.
      * @deprecated Since v20.1, we recommend ExcelJS-based export which does not use this property.
      */
    var fileName: js.UndefOr[String] = js.undefined
    
    /**
      * 
      */
    var formats: js.UndefOr[js.Array[xlsx | pdf_ | String]] = js.undefined
    
    /**
      * Specifies whether Excel should hide warnings if there are errors in the exported document.
      * @deprecated Since v20.1, we recommend ExcelJS-based export which does not use this property.
      */
    var ignoreExcelErrors: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the URL of the server-side proxy that streams the resulting file to the end user to enable exporting in the Safari browser.
      * @deprecated Since v10, Safari browser supports API for saving files, and this property is no longer required.
      */
    var proxyUrl: js.UndefOr[String] = js.undefined
    
    /**
      * Configures the texts of export commands, buttons, and hints.
      */
    var texts: js.UndefOr[ExportTexts] = js.undefined
  }
  object Export {
    
    inline def apply[TRowData, TKey](): Export[TRowData, TKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Export[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Export[?, ?], TRowData, TKey] (val x: Self & (Export[TRowData, TKey])) extends AnyVal {
      
      inline def setAllowExportSelectedData(value: Boolean): Self = StObject.set(x, "allowExportSelectedData", value.asInstanceOf[js.Any])
      
      inline def setAllowExportSelectedDataUndefined: Self = StObject.set(x, "allowExportSelectedData", js.undefined)
      
      inline def setCustomizeExcelCell(value: /* options */ ExcelCellInfo[TRowData, TKey] => Unit): Self = StObject.set(x, "customizeExcelCell", js.Any.fromFunction1(value))
      
      inline def setCustomizeExcelCellUndefined: Self = StObject.set(x, "customizeExcelCell", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setExcelFilterEnabled(value: Boolean): Self = StObject.set(x, "excelFilterEnabled", value.asInstanceOf[js.Any])
      
      inline def setExcelFilterEnabledUndefined: Self = StObject.set(x, "excelFilterEnabled", js.undefined)
      
      inline def setExcelWrapTextEnabled(value: Boolean): Self = StObject.set(x, "excelWrapTextEnabled", value.asInstanceOf[js.Any])
      
      inline def setExcelWrapTextEnabledUndefined: Self = StObject.set(x, "excelWrapTextEnabled", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFormats(value: js.Array[xlsx | pdf_ | String]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setFormatsVarargs(value: (xlsx | pdf_ | String)*): Self = StObject.set(x, "formats", js.Array(value*))
      
      inline def setIgnoreExcelErrors(value: Boolean): Self = StObject.set(x, "ignoreExcelErrors", value.asInstanceOf[js.Any])
      
      inline def setIgnoreExcelErrorsUndefined: Self = StObject.set(x, "ignoreExcelErrors", js.undefined)
      
      inline def setProxyUrl(value: String): Self = StObject.set(x, "proxyUrl", value.asInstanceOf[js.Any])
      
      inline def setProxyUrlUndefined: Self = StObject.set(x, "proxyUrl", js.undefined)
      
      inline def setTexts(value: ExportTexts): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
      
      inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    }
  }
  
  trait ExportTexts extends StObject {
    
    /**
      * The text or hint of the command that exports all data.
      */
    var exportAll: js.UndefOr[String] = js.undefined
    
    /**
      * The text of the command that exports selected rows. Applies when allowExportSelectedData property is true.
      */
    var exportSelectedRows: js.UndefOr[String] = js.undefined
    
    /**
      * The hint of the Export button when the allowExportSelectedData property is true.
      */
    var exportTo: js.UndefOr[String] = js.undefined
  }
  object ExportTexts {
    
    inline def apply(): ExportTexts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportTexts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExportTexts] (val x: Self) extends AnyVal {
      
      inline def setExportAll(value: String): Self = StObject.set(x, "exportAll", value.asInstanceOf[js.Any])
      
      inline def setExportAllUndefined: Self = StObject.set(x, "exportAll", js.undefined)
      
      inline def setExportSelectedRows(value: String): Self = StObject.set(x, "exportSelectedRows", value.asInstanceOf[js.Any])
      
      inline def setExportSelectedRowsUndefined: Self = StObject.set(x, "exportSelectedRows", js.undefined)
      
      inline def setExportTo(value: String): Self = StObject.set(x, "exportTo", value.asInstanceOf[js.Any])
      
      inline def setExportToUndefined: Self = StObject.set(x, "exportTo", js.undefined)
    }
  }
  
  type ExportedEvent[TRowData, TKey] = EventInfo[dxDataGrid[TRowData, TKey]]
  
  trait ExportingEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with EventInfo[dxDataGrid[TRowData, TKey]] {
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var format: DataGridExportFormat | String
    
    var selectedRowsOnly: Boolean
  }
  object ExportingEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      element: DxElement_[HTMLElement],
      format: DataGridExportFormat | String,
      selectedRowsOnly: Boolean
    ): ExportingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], selectedRowsOnly = selectedRowsOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExportingEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExportingEvent[?, ?], TRowData, TKey] (val x: Self & (ExportingEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFormat(value: DataGridExportFormat | String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowsOnly(value: Boolean): Self = StObject.set(x, "selectedRowsOnly", value.asInstanceOf[js.Any])
    }
  }
  
  trait FileSavingEvent[TRowData, TKey]
    extends StObject
       with Cancelable {
    
    val component: dxDataGrid[TRowData, TKey]
    
    val data: Blob
    
    val element: DxElement_[HTMLElement]
    
    var fileName: js.UndefOr[String] = js.undefined
    
    var format: js.UndefOr[String] = js.undefined
  }
  object FileSavingEvent {
    
    inline def apply[TRowData, TKey](component: dxDataGrid[TRowData, TKey], data: Blob, element: DxElement_[HTMLElement]): FileSavingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileSavingEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileSavingEvent[?, ?], TRowData, TKey] (val x: Self & (FileSavingEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setComponent(value: dxDataGrid[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setData(value: Blob): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    }
  }
  
  trait FilterPanel[T /* <: GridBase[TRowData, TKey] */, TRowData, TKey] extends StObject {
    
    /**
      * Customizes the filter expression&apos;s text representation.
      */
    var customizeText: js.UndefOr[js.Function1[/* e */ FilterPanelCustomizeTextArg[T], String]] = js.undefined
    
    /**
      * Specifies whether the filter expression is applied.
      */
    var filterEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies texts for the filter panel&apos;s elements.
      */
    var texts: js.UndefOr[typings.devextreme.mod.DevExpress.common.grids.FilterPanelTexts] = js.undefined
    
    /**
      * Specifies whether the filter panel is visible.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object FilterPanel {
    
    inline def apply[T /* <: GridBase[TRowData, TKey] */, TRowData, TKey](): FilterPanel[T, TRowData, TKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterPanel[T, TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterPanel[?, ?, ?], T /* <: GridBase[TRowData, TKey] */, TRowData, TKey] (val x: Self & (FilterPanel[T, TRowData, TKey])) extends AnyVal {
      
      inline def setCustomizeText(value: /* e */ FilterPanelCustomizeTextArg[T] => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
      
      inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
      
      inline def setFilterEnabled(value: Boolean): Self = StObject.set(x, "filterEnabled", value.asInstanceOf[js.Any])
      
      inline def setFilterEnabledUndefined: Self = StObject.set(x, "filterEnabled", js.undefined)
      
      inline def setTexts(value: typings.devextreme.mod.DevExpress.common.grids.FilterPanelTexts): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
      
      inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait FilterPanelCustomizeTextArg[T] extends StObject {
    
    val component: T
    
    val filterValue: Any
    
    val text: String
  }
  object FilterPanelCustomizeTextArg {
    
    inline def apply[T](component: T, filterValue: Any, text: String): FilterPanelCustomizeTextArg[T] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], filterValue = filterValue.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterPanelCustomizeTextArg[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterPanelCustomizeTextArg[?], T] (val x: Self & FilterPanelCustomizeTextArg[T]) extends AnyVal {
      
      inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setFilterValue(value: Any): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  type FilterPanelTexts = typings.devextreme.mod.DevExpress.common.grids.FilterPanelTexts
  
  type FilterRow = typings.devextreme.mod.DevExpress.common.grids.FilterRow
  
  type FilterRowOperationDescriptions = typings.devextreme.mod.DevExpress.common.grids.FilterRowOperationDescriptions
  
  trait FocusedCellChangedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]] {
    
    val cellElement: DxElement_[HTMLElement]
    
    val column: js.UndefOr[Column[TRowData, TKey]] = js.undefined
    
    val columnIndex: Double
    
    val row: js.UndefOr[Row[TRowData, TKey]] = js.undefined
    
    val rowIndex: Double
  }
  object FocusedCellChangedEvent {
    
    inline def apply[TRowData, TKey](
      cellElement: DxElement_[HTMLElement],
      columnIndex: Double,
      component: dxDataGrid[TRowData, TKey],
      element: DxElement_[HTMLElement],
      rowIndex: Double
    ): FocusedCellChangedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cellElement = cellElement.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusedCellChangedEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusedCellChangedEvent[?, ?], TRowData, TKey] (val x: Self & (FocusedCellChangedEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
  
  trait FocusedCellChangingEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with NativeEventInfo[dxDataGrid[TRowData, TKey], KeyboardEvent | PointerEvent | MouseEvent | TouchEvent] {
    
    val cellElement: DxElement_[HTMLElement]
    
    val columns: js.Array[Column[TRowData, TKey]]
    
    var isHighlighted: Boolean
    
    var newColumnIndex: Double
    
    var newRowIndex: Double
    
    val prevColumnIndex: Double
    
    val prevRowIndex: Double
    
    val rows: js.Array[Row[TRowData, TKey]]
  }
  object FocusedCellChangingEvent {
    
    inline def apply[TRowData, TKey](
      cellElement: DxElement_[HTMLElement],
      columns: js.Array[Column[TRowData, TKey]],
      component: dxDataGrid[TRowData, TKey],
      element: DxElement_[HTMLElement],
      isHighlighted: Boolean,
      newColumnIndex: Double,
      newRowIndex: Double,
      prevColumnIndex: Double,
      prevRowIndex: Double,
      rows: js.Array[Row[TRowData, TKey]]
    ): FocusedCellChangingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cellElement = cellElement.asInstanceOf[js.Any], columns = columns.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], isHighlighted = isHighlighted.asInstanceOf[js.Any], newColumnIndex = newColumnIndex.asInstanceOf[js.Any], newRowIndex = newRowIndex.asInstanceOf[js.Any], prevColumnIndex = prevColumnIndex.asInstanceOf[js.Any], prevRowIndex = prevRowIndex.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusedCellChangingEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusedCellChangingEvent[?, ?], TRowData, TKey] (val x: Self & (FocusedCellChangingEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
      
      inline def setColumns(value: js.Array[Column[TRowData, TKey]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (Column[TRowData, TKey])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setIsHighlighted(value: Boolean): Self = StObject.set(x, "isHighlighted", value.asInstanceOf[js.Any])
      
      inline def setNewColumnIndex(value: Double): Self = StObject.set(x, "newColumnIndex", value.asInstanceOf[js.Any])
      
      inline def setNewRowIndex(value: Double): Self = StObject.set(x, "newRowIndex", value.asInstanceOf[js.Any])
      
      inline def setPrevColumnIndex(value: Double): Self = StObject.set(x, "prevColumnIndex", value.asInstanceOf[js.Any])
      
      inline def setPrevRowIndex(value: Double): Self = StObject.set(x, "prevRowIndex", value.asInstanceOf[js.Any])
      
      inline def setRows(value: js.Array[Row[TRowData, TKey]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: (Row[TRowData, TKey])*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
  
  trait FocusedRowChangedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]] {
    
    val row: js.UndefOr[Row[TRowData, TKey]] = js.undefined
    
    val rowElement: DxElement_[HTMLElement]
    
    val rowIndex: Double
  }
  object FocusedRowChangedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      element: DxElement_[HTMLElement],
      rowElement: DxElement_[HTMLElement],
      rowIndex: Double
    ): FocusedRowChangedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], rowElement = rowElement.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusedRowChangedEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusedRowChangedEvent[?, ?], TRowData, TKey] (val x: Self & (FocusedRowChangedEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowUndefined: Self = StObject.set(x, "row", js.undefined)
    }
  }
  
  trait FocusedRowChangingEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with NativeEventInfo[dxDataGrid[TRowData, TKey], KeyboardEvent | PointerEvent | MouseEvent | TouchEvent] {
    
    var newRowIndex: Double
    
    val prevRowIndex: Double
    
    val rowElement: DxElement_[HTMLElement]
    
    val rows: js.Array[Row[TRowData, TKey]]
  }
  object FocusedRowChangingEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      element: DxElement_[HTMLElement],
      newRowIndex: Double,
      prevRowIndex: Double,
      rowElement: DxElement_[HTMLElement],
      rows: js.Array[Row[TRowData, TKey]]
    ): FocusedRowChangingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], newRowIndex = newRowIndex.asInstanceOf[js.Any], prevRowIndex = prevRowIndex.asInstanceOf[js.Any], rowElement = rowElement.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusedRowChangingEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusedRowChangingEvent[?, ?], TRowData, TKey] (val x: Self & (FocusedRowChangingEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setNewRowIndex(value: Double): Self = StObject.set(x, "newRowIndex", value.asInstanceOf[js.Any])
      
      inline def setPrevRowIndex(value: Double): Self = StObject.set(x, "prevRowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
      
      inline def setRows(value: js.Array[Row[TRowData, TKey]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsVarargs(value: (Row[TRowData, TKey])*): Self = StObject.set(x, "rows", js.Array(value*))
    }
  }
  
  trait GroupData[TRowData] extends StObject {
    
    /**
      * @deprecated Attention! This property is for internal purposes only.
      */
    var aggregates: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * @deprecated Attention! This property is for internal purposes only.
      */
    var collapsedItems: js.UndefOr[js.Array[GroupData[TRowData] | TRowData]] = js.undefined
    
    /**
      * @deprecated Attention! This property is for internal purposes only.
      */
    var isContinuation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated Attention! This property is for internal purposes only.
      */
    var isContinuationOnNextPage: js.UndefOr[Boolean] = js.undefined
    
    var items: (js.Array[GroupData[TRowData] | TRowData]) | Null
    
    var key: Any
    
    /**
      * @deprecated Attention! This property is for internal purposes only.
      */
    var summary: js.UndefOr[js.Array[Any]] = js.undefined
  }
  object GroupData {
    
    inline def apply[TRowData](key: Any): GroupData[TRowData] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], items = null)
      __obj.asInstanceOf[GroupData[TRowData]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupData[?], TRowData] (val x: Self & GroupData[TRowData]) extends AnyVal {
      
      inline def setAggregates(value: js.Array[Any]): Self = StObject.set(x, "aggregates", value.asInstanceOf[js.Any])
      
      inline def setAggregatesUndefined: Self = StObject.set(x, "aggregates", js.undefined)
      
      inline def setAggregatesVarargs(value: Any*): Self = StObject.set(x, "aggregates", js.Array(value*))
      
      inline def setCollapsedItems(value: js.Array[GroupData[TRowData] | TRowData]): Self = StObject.set(x, "collapsedItems", value.asInstanceOf[js.Any])
      
      inline def setCollapsedItemsUndefined: Self = StObject.set(x, "collapsedItems", js.undefined)
      
      inline def setCollapsedItemsVarargs(value: (GroupData[TRowData] | TRowData)*): Self = StObject.set(x, "collapsedItems", js.Array(value*))
      
      inline def setIsContinuation(value: Boolean): Self = StObject.set(x, "isContinuation", value.asInstanceOf[js.Any])
      
      inline def setIsContinuationOnNextPage(value: Boolean): Self = StObject.set(x, "isContinuationOnNextPage", value.asInstanceOf[js.Any])
      
      inline def setIsContinuationOnNextPageUndefined: Self = StObject.set(x, "isContinuationOnNextPage", js.undefined)
      
      inline def setIsContinuationUndefined: Self = StObject.set(x, "isContinuation", js.undefined)
      
      inline def setItems(value: js.Array[GroupData[TRowData] | TRowData]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsNull: Self = StObject.set(x, "items", null)
      
      inline def setItemsVarargs(value: (GroupData[TRowData] | TRowData)*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setKey(value: Any): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setSummary(value: js.Array[Any]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setSummaryVarargs(value: Any*): Self = StObject.set(x, "summary", js.Array(value*))
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  type GroupKey = js.Array[Any]
  
  trait GroupPanel extends StObject {
    
    /**
      * Specifies whether columns can be dragged onto or from the group panel.
      */
    var allowColumnDragging: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies text displayed by the group panel when it does not contain any columns.
      */
    var emptyPanelText: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies whether the group panel is visible or not.
      */
    var visible: js.UndefOr[Boolean | Mode] = js.undefined
  }
  object GroupPanel {
    
    inline def apply(): GroupPanel = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupPanel]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupPanel] (val x: Self) extends AnyVal {
      
      inline def setAllowColumnDragging(value: Boolean): Self = StObject.set(x, "allowColumnDragging", value.asInstanceOf[js.Any])
      
      inline def setAllowColumnDraggingUndefined: Self = StObject.set(x, "allowColumnDragging", js.undefined)
      
      inline def setEmptyPanelText(value: String): Self = StObject.set(x, "emptyPanelText", value.asInstanceOf[js.Any])
      
      inline def setEmptyPanelTextUndefined: Self = StObject.set(x, "emptyPanelText", js.undefined)
      
      inline def setVisible(value: Boolean | Mode): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait Grouping extends StObject {
    
    /**
      * Specifies whether the user can collapse grouped records in a grid or not.
      */
    var allowCollapsing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether groups appear expanded or not.
      */
    var autoExpandAll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables the user to group data using the context menu.
      */
    var contextMenuEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the event on which a group will be expanded/collapsed.
      */
    var expandMode: js.UndefOr[GroupExpandMode] = js.undefined
    
    /**
      * Defines the texts of grouping-related visual elements.
      */
    var texts: js.UndefOr[GroupingTexts] = js.undefined
  }
  object Grouping {
    
    inline def apply(): Grouping = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Grouping]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Grouping] (val x: Self) extends AnyVal {
      
      inline def setAllowCollapsing(value: Boolean): Self = StObject.set(x, "allowCollapsing", value.asInstanceOf[js.Any])
      
      inline def setAllowCollapsingUndefined: Self = StObject.set(x, "allowCollapsing", js.undefined)
      
      inline def setAutoExpandAll(value: Boolean): Self = StObject.set(x, "autoExpandAll", value.asInstanceOf[js.Any])
      
      inline def setAutoExpandAllUndefined: Self = StObject.set(x, "autoExpandAll", js.undefined)
      
      inline def setContextMenuEnabled(value: Boolean): Self = StObject.set(x, "contextMenuEnabled", value.asInstanceOf[js.Any])
      
      inline def setContextMenuEnabledUndefined: Self = StObject.set(x, "contextMenuEnabled", js.undefined)
      
      inline def setExpandMode(value: GroupExpandMode): Self = StObject.set(x, "expandMode", value.asInstanceOf[js.Any])
      
      inline def setExpandModeUndefined: Self = StObject.set(x, "expandMode", js.undefined)
      
      inline def setTexts(value: GroupingTexts): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
      
      inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    }
  }
  
  trait GroupingTexts extends StObject {
    
    /**
      * Specifies the text of the context menu item that groups data by a specific column.
      */
    var groupByThisColumn: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the message displayed in a group row when the corresponding group is continued from the previous page.
      */
    var groupContinuedMessage: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the message displayed in a group row when the corresponding group continues on the next page.
      */
    var groupContinuesMessage: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the text of the context menu item that clears grouping settings of a specific column.
      */
    var ungroup: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the text of the context menu item that clears grouping settings of all columns.
      */
    var ungroupAll: js.UndefOr[String] = js.undefined
  }
  object GroupingTexts {
    
    inline def apply(): GroupingTexts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GroupingTexts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GroupingTexts] (val x: Self) extends AnyVal {
      
      inline def setGroupByThisColumn(value: String): Self = StObject.set(x, "groupByThisColumn", value.asInstanceOf[js.Any])
      
      inline def setGroupByThisColumnUndefined: Self = StObject.set(x, "groupByThisColumn", js.undefined)
      
      inline def setGroupContinuedMessage(value: String): Self = StObject.set(x, "groupContinuedMessage", value.asInstanceOf[js.Any])
      
      inline def setGroupContinuedMessageUndefined: Self = StObject.set(x, "groupContinuedMessage", js.undefined)
      
      inline def setGroupContinuesMessage(value: String): Self = StObject.set(x, "groupContinuesMessage", value.asInstanceOf[js.Any])
      
      inline def setGroupContinuesMessageUndefined: Self = StObject.set(x, "groupContinuesMessage", js.undefined)
      
      inline def setUngroup(value: String): Self = StObject.set(x, "ungroup", value.asInstanceOf[js.Any])
      
      inline def setUngroupAll(value: String): Self = StObject.set(x, "ungroupAll", value.asInstanceOf[js.Any])
      
      inline def setUngroupAllUndefined: Self = StObject.set(x, "ungroupAll", js.undefined)
      
      inline def setUngroupUndefined: Self = StObject.set(x, "ungroup", js.undefined)
    }
  }
  
  type HeaderFilter = typings.devextreme.mod.DevExpress.common.grids.HeaderFilter
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.day
    - typings.devextreme.devextremeStrings.hour
    - typings.devextreme.devextremeStrings.minute
    - typings.devextreme.devextremeStrings.month
    - typings.devextreme.devextremeStrings.quarter
    - typings.devextreme.devextremeStrings.second
    - typings.devextreme.devextremeStrings.year
  */
  trait HeaderFilterGroupInterval extends StObject
  object HeaderFilterGroupInterval {
    
    inline def day: typings.devextreme.devextremeStrings.day = "day".asInstanceOf[typings.devextreme.devextremeStrings.day]
    
    inline def hour: typings.devextreme.devextremeStrings.hour = "hour".asInstanceOf[typings.devextreme.devextremeStrings.hour]
    
    inline def minute: typings.devextreme.devextremeStrings.minute = "minute".asInstanceOf[typings.devextreme.devextremeStrings.minute]
    
    inline def month: typings.devextreme.devextremeStrings.month = "month".asInstanceOf[typings.devextreme.devextremeStrings.month]
    
    inline def quarter: typings.devextreme.devextremeStrings.quarter = "quarter".asInstanceOf[typings.devextreme.devextremeStrings.quarter]
    
    inline def second: typings.devextreme.devextremeStrings.second = "second".asInstanceOf[typings.devextreme.devextremeStrings.second]
    
    inline def year: typings.devextreme.devextremeStrings.year = "year".asInstanceOf[typings.devextreme.devextremeStrings.year]
  }
  
  type HeaderFilterTexts = typings.devextreme.mod.DevExpress.common.grids.HeaderFilterTexts
  
  trait InitNewRowEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with NewRowInfo[TRowData]
  object InitNewRowEvent {
    
    inline def apply[TRowData, TKey](component: dxDataGrid[TRowData, TKey], data: TRowData, element: DxElement_[HTMLElement]): InitNewRowEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitNewRowEvent[TRowData, TKey]]
    }
  }
  
  type InitializedEvent[TRowData, TKey] = InitializedEventInfo[dxDataGrid[TRowData, TKey]]
  
  trait KeyDownEvent[TRowData, TKey]
    extends StObject
       with NativeEventInfo[dxDataGrid[TRowData, TKey], KeyboardEvent]
       with KeyDownInfo
  object KeyDownEvent {
    
    inline def apply[TRowData, TKey](component: dxDataGrid[TRowData, TKey], element: DxElement_[HTMLElement], handled: Boolean): KeyDownEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyDownEvent[TRowData, TKey]]
    }
  }
  
  trait KeyDownInfo extends StObject {
    
    var handled: Boolean
  }
  object KeyDownInfo {
    
    inline def apply(handled: Boolean): KeyDownInfo = {
      val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyDownInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyDownInfo] (val x: Self) extends AnyVal {
      
      inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
    }
  }
  
  type KeyboardNavigation = typings.devextreme.mod.DevExpress.common.grids.KeyboardNavigation
  
  type LoadPanel = typings.devextreme.mod.DevExpress.common.grids.LoadPanel
  
  trait MasterDetail[TRowData, TKey] extends StObject {
    
    /**
      * Specifies whether detail sections appear expanded or collapsed.
      */
    var autoExpandAll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables an end-user to expand/collapse detail sections.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies a custom template for detail sections.
      */
    var template: js.UndefOr[
        typings.devextreme.mod.DevExpress.core.template | (js.Function2[
          /* detailElement */ DxElement_[HTMLElement], 
          /* detailInfo */ MasterDetailTemplateData[TRowData, TKey], 
          Any
        ])
      ] = js.undefined
  }
  object MasterDetail {
    
    inline def apply[TRowData, TKey](): MasterDetail[TRowData, TKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MasterDetail[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MasterDetail[?, ?], TRowData, TKey] (val x: Self & (MasterDetail[TRowData, TKey])) extends AnyVal {
      
      inline def setAutoExpandAll(value: Boolean): Self = StObject.set(x, "autoExpandAll", value.asInstanceOf[js.Any])
      
      inline def setAutoExpandAllUndefined: Self = StObject.set(x, "autoExpandAll", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setTemplate(
        value: template | (js.Function2[
              /* detailElement */ DxElement_[HTMLElement], 
              /* detailInfo */ MasterDetailTemplateData[TRowData, TKey], 
              Any
            ])
      ): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateFunction2(
        value: (/* detailElement */ DxElement_[HTMLElement], /* detailInfo */ MasterDetailTemplateData[TRowData, TKey]) => Any
      ): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  trait MasterDetailTemplateData[TRowData, TKey] extends StObject {
    
    val data: TRowData
    
    val key: TKey
    
    val watch: js.UndefOr[js.Function] = js.undefined
  }
  object MasterDetailTemplateData {
    
    inline def apply[TRowData, TKey](data: TRowData, key: TKey): MasterDetailTemplateData[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[MasterDetailTemplateData[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MasterDetailTemplateData[?, ?], TRowData, TKey] (val x: Self & (MasterDetailTemplateData[TRowData, TKey])) extends AnyVal {
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setWatch(value: js.Function): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  trait NewRowInfo[TRowData] extends StObject {
    
    var data: TRowData
    
    var promise: js.UndefOr[PromiseLike[Unit]] = js.undefined
  }
  object NewRowInfo {
    
    inline def apply[TRowData](data: TRowData): NewRowInfo[TRowData] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[NewRowInfo[TRowData]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NewRowInfo[?], TRowData] (val x: Self & NewRowInfo[TRowData]) extends AnyVal {
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: PromiseLike[Unit]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
    }
  }
  
  trait OptionChangedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      element: DxElement_[HTMLElement],
      fullName: String,
      name: String
    ): OptionChangedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent[TRowData, TKey]]
    }
  }
  
  type Pager = typings.devextreme.mod.DevExpress.common.grids.Pager
  
  trait PagingBase extends StObject {
    
    /**
      * Enables paging.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the page to be displayed using a zero-based index.
      */
    var pageIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the page size.
      */
    var pageSize: js.UndefOr[Double] = js.undefined
  }
  object PagingBase {
    
    inline def apply(): PagingBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagingBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PagingBase] (val x: Self) extends AnyVal {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setPageIndex(value: Double): Self = StObject.set(x, "pageIndex", value.asInstanceOf[js.Any])
      
      inline def setPageIndexUndefined: Self = StObject.set(x, "pageIndex", js.undefined)
      
      inline def setPageSize(value: Double): Self = StObject.set(x, "pageSize", value.asInstanceOf[js.Any])
      
      inline def setPageSizeUndefined: Self = StObject.set(x, "pageSize", js.undefined)
    }
  }
  
  type Properties[TRowData, TKey] = dxDataGridOptions[TRowData, TKey]
  
  trait Row[TRowData, TKey] extends StObject {
    
    /**
      * The data object represented by the row.
      */
    val data: TRowData
    
    /**
      * The group index of the row. Available when the rowType is &apos;group&apos;.
      */
    val groupIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Indicates whether the row is in the editing state.
      */
    val isEditing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether the row is expanded or collapsed. Available if rowType is &apos;data&apos; or &apos;group&apos;.
      */
    val isExpanded: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates that the row is added, but not yet saved. Available if rowType is &apos;data&apos;.
      */
    val isNewRow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether the row is selected. Available if rowType is &apos;data&apos;.
      */
    val isSelected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The key of the data object represented by the row.
      */
    val key: TKey
    
    /**
      * The visible index of the row.
      */
    val rowIndex: Double
    
    /**
      * The row&apos;s type.
      */
    val rowType: String
    
    /**
      * Values of the row as they exist in the data source.
      */
    val values: js.Array[Any]
  }
  object Row {
    
    inline def apply[TRowData, TKey](data: TRowData, key: TKey, rowIndex: Double, rowType: String, values: js.Array[Any]): Row[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Row[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Row[?, ?], TRowData, TKey] (val x: Self & (Row[TRowData, TKey])) extends AnyVal {
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
      
      inline def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
      
      inline def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
      
      inline def setIsEditingUndefined: Self = StObject.set(x, "isEditing", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsNewRow(value: Boolean): Self = StObject.set(x, "isNewRow", value.asInstanceOf[js.Any])
      
      inline def setIsNewRowUndefined: Self = StObject.set(x, "isNewRow", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait RowClickEvent[TRowData, TKey]
    extends StObject
       with NativeEventInfo[dxDataGrid[TRowData, TKey], PointerEvent | MouseEvent] {
    
    val columns: js.Array[Column[TRowData, TKey]]
    
    val data: TRowData
    
    val groupIndex: js.UndefOr[Double] = js.undefined
    
    val handled: Boolean
    
    val isExpanded: js.UndefOr[Boolean] = js.undefined
    
    val isNewRow: js.UndefOr[Boolean] = js.undefined
    
    val isSelected: js.UndefOr[Boolean] = js.undefined
    
    val key: TKey
    
    val rowElement: DxElement_[HTMLElement]
    
    val rowIndex: Double
    
    val rowType: String
    
    val values: js.Array[Any]
  }
  object RowClickEvent {
    
    inline def apply[TRowData, TKey](
      columns: js.Array[Column[TRowData, TKey]],
      component: dxDataGrid[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      handled: Boolean,
      key: TKey,
      rowElement: DxElement_[HTMLElement],
      rowIndex: Double,
      rowType: String,
      values: js.Array[Any]
    ): RowClickEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowElement = rowElement.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowClickEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowClickEvent[?, ?], TRowData, TKey] (val x: Self & (RowClickEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setColumns(value: js.Array[Column[TRowData, TKey]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (Column[TRowData, TKey])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
      
      inline def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
      
      inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsNewRow(value: Boolean): Self = StObject.set(x, "isNewRow", value.asInstanceOf[js.Any])
      
      inline def setIsNewRowUndefined: Self = StObject.set(x, "isNewRow", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRowElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait RowCollapsedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with RowKeyInfo[TKey]
  object RowCollapsedEvent {
    
    inline def apply[TRowData, TKey](component: dxDataGrid[TRowData, TKey], element: DxElement_[HTMLElement], key: TKey): RowCollapsedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowCollapsedEvent[TRowData, TKey]]
    }
  }
  
  trait RowCollapsingEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with RowKeyInfo[TKey]
  object RowCollapsingEvent {
    
    inline def apply[TRowData, TKey](component: dxDataGrid[TRowData, TKey], element: DxElement_[HTMLElement], key: TKey): RowCollapsingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowCollapsingEvent[TRowData, TKey]]
    }
  }
  
  trait RowDblClickEvent[TRowData, TKey]
    extends StObject
       with NativeEventInfo[dxDataGrid[TRowData, TKey], PointerEvent | MouseEvent] {
    
    val columns: js.Array[Column[TRowData, TKey]]
    
    val data: TRowData
    
    val groupIndex: js.UndefOr[Double] = js.undefined
    
    val isExpanded: js.UndefOr[Boolean] = js.undefined
    
    val isNewRow: js.UndefOr[Boolean] = js.undefined
    
    val isSelected: js.UndefOr[Boolean] = js.undefined
    
    val key: TKey
    
    val rowElement: DxElement_[HTMLElement]
    
    val rowIndex: Double
    
    val rowType: String
    
    val values: js.Array[Any]
  }
  object RowDblClickEvent {
    
    inline def apply[TRowData, TKey](
      columns: js.Array[Column[TRowData, TKey]],
      component: dxDataGrid[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      key: TKey,
      rowElement: DxElement_[HTMLElement],
      rowIndex: Double,
      rowType: String,
      values: js.Array[Any]
    ): RowDblClickEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowElement = rowElement.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDblClickEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowDblClickEvent[?, ?], TRowData, TKey] (val x: Self & (RowDblClickEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setColumns(value: js.Array[Column[TRowData, TKey]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (Column[TRowData, TKey])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
      
      inline def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsNewRow(value: Boolean): Self = StObject.set(x, "isNewRow", value.asInstanceOf[js.Any])
      
      inline def setIsNewRowUndefined: Self = StObject.set(x, "isNewRow", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRowElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait RowDragging[T /* <: GridBase[TRowData, TKey] */, TRowData, TKey] extends StObject {
    
    /**
      * Allows users to drop a row inside another row.
      */
    var allowDropInsideItem: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows row reordering using drag and drop gestures.
      */
    var allowReordering: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables automatic scrolling while dragging a row beyond the viewport.
      */
    var autoScroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies a DOM element that limits the dragging area.
      */
    var boundary: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
    
    /**
      * Specifies a custom container in which the draggable row should be rendered.
      */
    var container: js.UndefOr[String | UserDefinedElement[Element]] = js.undefined
    
    /**
      * Specifies the cursor offset from the dragged row.
      */
    var cursorOffset: js.UndefOr[String | Y] = js.undefined
    
    /**
      * A container for custom data.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /**
      * Specifies the directions in which a row can be dragged.
      */
    var dragDirection: js.UndefOr[DragDirection] = js.undefined
    
    /**
      * Specifies custom markup to be shown instead of the item being dragged.
      */
    var dragTemplate: js.UndefOr[
        template | (js.Function2[
          /* dragInfo */ RowDraggingTemplateData[TRowData], 
          /* containerElement */ DxElement_[HTMLElement], 
          String | UserDefinedElement[Element]
        ])
      ] = js.undefined
    
    /**
      * Specifies how to highlight the row&apos;s drop position.
      */
    var dropFeedbackMode: js.UndefOr[DragHighlight] = js.undefined
    
    /**
      * Specifies a CSS selector for draggable rows.
      */
    var filter: js.UndefOr[String] = js.undefined
    
    /**
      * Allows you to group several UI components so that users can drag and drop rows between them.
      */
    var group: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a CSS selector (ID or class) for the element(s) that should act as the drag handle(s).
      */
    var handle: js.UndefOr[String] = js.undefined
    
    /**
      * A function that is called when a new row is added.
      */
    var onAdd: js.UndefOr[
        js.Function1[/* e */ (RowDraggingEventInfo[T, TRowData, TKey]) & DragDropInfo, Unit]
      ] = js.undefined
    
    /**
      * A function that is called when the dragged row&apos;s position is changed.
      */
    var onDragChange: js.UndefOr[
        js.Function1[
          /* e */ Cancelable & (RowDraggingEventInfo[T, TRowData, TKey]) & DragDropInfo, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is called when the drag gesture is finished.
      */
    var onDragEnd: js.UndefOr[
        js.Function1[
          /* e */ Cancelable & (RowDraggingEventInfo[T, TRowData, TKey]) & DragDropInfo, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is called every time a draggable row is moved.
      */
    var onDragMove: js.UndefOr[
        js.Function1[
          /* e */ Cancelable & (RowDraggingEventInfo[T, TRowData, TKey]) & DragDropInfo, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is called when the drag gesture is initialized.
      */
    var onDragStart: js.UndefOr[js.Function1[/* e */ Cancelable & (DragStartEventInfo[T, TRowData, TKey]), Unit]] = js.undefined
    
    /**
      * A function that is called when a draggable row is removed.
      */
    var onRemove: js.UndefOr[js.Function1[/* e */ RowDraggingEventInfo[T, TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is called when the draggable rows are reordered.
      */
    var onReorder: js.UndefOr[
        js.Function1[
          /* e */ (RowDraggingEventInfo[dxDataGrid[TRowData, TKey], TRowData, TKey]) & DragReorderInfo, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Specifies the distance in pixels from the edge of viewport at which scrolling should start. Applies only if autoScroll is true.
      */
    var scrollSensitivity: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies the scrolling speed when dragging a row beyond the viewport. Applies only if autoScroll is true.
      */
    var scrollSpeed: js.UndefOr[Double] = js.undefined
    
    /**
      * Shows or hides row dragging icons.
      */
    var showDragIcons: js.UndefOr[Boolean] = js.undefined
  }
  object RowDragging {
    
    inline def apply[T /* <: GridBase[TRowData, TKey] */, TRowData, TKey](): RowDragging[T, TRowData, TKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowDragging[T, TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowDragging[?, ?, ?], T /* <: GridBase[TRowData, TKey] */, TRowData, TKey] (val x: Self & (RowDragging[T, TRowData, TKey])) extends AnyVal {
      
      inline def setAllowDropInsideItem(value: Boolean): Self = StObject.set(x, "allowDropInsideItem", value.asInstanceOf[js.Any])
      
      inline def setAllowDropInsideItemUndefined: Self = StObject.set(x, "allowDropInsideItem", js.undefined)
      
      inline def setAllowReordering(value: Boolean): Self = StObject.set(x, "allowReordering", value.asInstanceOf[js.Any])
      
      inline def setAllowReorderingUndefined: Self = StObject.set(x, "allowReordering", js.undefined)
      
      inline def setAutoScroll(value: Boolean): Self = StObject.set(x, "autoScroll", value.asInstanceOf[js.Any])
      
      inline def setAutoScrollUndefined: Self = StObject.set(x, "autoScroll", js.undefined)
      
      inline def setBoundary(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "boundary", value.asInstanceOf[js.Any])
      
      inline def setBoundaryUndefined: Self = StObject.set(x, "boundary", js.undefined)
      
      inline def setContainer(value: String | UserDefinedElement[Element]): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setContainerUndefined: Self = StObject.set(x, "container", js.undefined)
      
      inline def setCursorOffset(value: String | Y): Self = StObject.set(x, "cursorOffset", value.asInstanceOf[js.Any])
      
      inline def setCursorOffsetUndefined: Self = StObject.set(x, "cursorOffset", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setDragDirection(value: DragDirection): Self = StObject.set(x, "dragDirection", value.asInstanceOf[js.Any])
      
      inline def setDragDirectionUndefined: Self = StObject.set(x, "dragDirection", js.undefined)
      
      inline def setDragTemplate(
        value: template | (js.Function2[
              /* dragInfo */ RowDraggingTemplateData[TRowData], 
              /* containerElement */ DxElement_[HTMLElement], 
              String | UserDefinedElement[Element]
            ])
      ): Self = StObject.set(x, "dragTemplate", value.asInstanceOf[js.Any])
      
      inline def setDragTemplateFunction2(
        value: (/* dragInfo */ RowDraggingTemplateData[TRowData], /* containerElement */ DxElement_[HTMLElement]) => String | UserDefinedElement[Element]
      ): Self = StObject.set(x, "dragTemplate", js.Any.fromFunction2(value))
      
      inline def setDragTemplateUndefined: Self = StObject.set(x, "dragTemplate", js.undefined)
      
      inline def setDropFeedbackMode(value: DragHighlight): Self = StObject.set(x, "dropFeedbackMode", value.asInstanceOf[js.Any])
      
      inline def setDropFeedbackModeUndefined: Self = StObject.set(x, "dropFeedbackMode", js.undefined)
      
      inline def setFilter(value: String): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
      
      inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
      
      inline def setHandle(value: String): Self = StObject.set(x, "handle", value.asInstanceOf[js.Any])
      
      inline def setHandleUndefined: Self = StObject.set(x, "handle", js.undefined)
      
      inline def setOnAdd(value: /* e */ (RowDraggingEventInfo[T, TRowData, TKey]) & DragDropInfo => Unit): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
      
      inline def setOnAddUndefined: Self = StObject.set(x, "onAdd", js.undefined)
      
      inline def setOnDragChange(value: /* e */ Cancelable & (RowDraggingEventInfo[T, TRowData, TKey]) & DragDropInfo => Unit): Self = StObject.set(x, "onDragChange", js.Any.fromFunction1(value))
      
      inline def setOnDragChangeUndefined: Self = StObject.set(x, "onDragChange", js.undefined)
      
      inline def setOnDragEnd(value: /* e */ Cancelable & (RowDraggingEventInfo[T, TRowData, TKey]) & DragDropInfo => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      inline def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      inline def setOnDragMove(value: /* e */ Cancelable & (RowDraggingEventInfo[T, TRowData, TKey]) & DragDropInfo => Unit): Self = StObject.set(x, "onDragMove", js.Any.fromFunction1(value))
      
      inline def setOnDragMoveUndefined: Self = StObject.set(x, "onDragMove", js.undefined)
      
      inline def setOnDragStart(value: /* e */ Cancelable & (DragStartEventInfo[T, TRowData, TKey]) => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      inline def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      inline def setOnRemove(value: /* e */ RowDraggingEventInfo[T, TRowData, TKey] => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      inline def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      inline def setOnReorder(
        value: /* e */ (RowDraggingEventInfo[dxDataGrid[TRowData, TKey], TRowData, TKey]) & DragReorderInfo => Unit
      ): Self = StObject.set(x, "onReorder", js.Any.fromFunction1(value))
      
      inline def setOnReorderUndefined: Self = StObject.set(x, "onReorder", js.undefined)
      
      inline def setScrollSensitivity(value: Double): Self = StObject.set(x, "scrollSensitivity", value.asInstanceOf[js.Any])
      
      inline def setScrollSensitivityUndefined: Self = StObject.set(x, "scrollSensitivity", js.undefined)
      
      inline def setScrollSpeed(value: Double): Self = StObject.set(x, "scrollSpeed", value.asInstanceOf[js.Any])
      
      inline def setScrollSpeedUndefined: Self = StObject.set(x, "scrollSpeed", js.undefined)
      
      inline def setShowDragIcons(value: Boolean): Self = StObject.set(x, "showDragIcons", value.asInstanceOf[js.Any])
      
      inline def setShowDragIconsUndefined: Self = StObject.set(x, "showDragIcons", js.undefined)
    }
  }
  
  trait RowDraggingAddEvent[TRowData, TKey]
    extends StObject
       with RowDraggingEventInfo[dxDataGrid[TRowData, TKey], TRowData, TKey]
       with DragDropInfo
  object RowDraggingAddEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      dropInsideItem: Boolean,
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromComponent: dxSortable | dxDraggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: dxSortable | dxDraggable,
      toIndex: Double
    ): RowDraggingAddEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropInsideItem = dropInsideItem.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingAddEvent[TRowData, TKey]]
    }
  }
  
  trait RowDraggingChangeEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with RowDraggingEventInfo[dxDataGrid[TRowData, TKey], TRowData, TKey]
       with DragDropInfo
  object RowDraggingChangeEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      dropInsideItem: Boolean,
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromComponent: dxSortable | dxDraggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: dxSortable | dxDraggable,
      toIndex: Double
    ): RowDraggingChangeEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropInsideItem = dropInsideItem.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingChangeEvent[TRowData, TKey]]
    }
  }
  
  trait RowDraggingEndEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with RowDraggingEventInfo[dxDataGrid[TRowData, TKey], TRowData, TKey]
       with DragDropInfo
  object RowDraggingEndEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      dropInsideItem: Boolean,
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromComponent: dxSortable | dxDraggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: dxSortable | dxDraggable,
      toIndex: Double
    ): RowDraggingEndEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropInsideItem = dropInsideItem.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingEndEvent[TRowData, TKey]]
    }
  }
  
  trait RowDraggingEventInfo[T /* <: GridBase[TRowData, TKey] */, TRowData, TKey] extends StObject {
    
    val component: T
    
    val event: DxEvent[PointerEvent | MouseEvent | TouchEvent]
    
    val fromComponent: dxSortable | dxDraggable
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val fromIndex: Double
    
    val itemData: js.UndefOr[TRowData] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
    
    val toComponent: dxSortable | dxDraggable
    
    val toData: js.UndefOr[Any] = js.undefined
    
    val toIndex: Double
  }
  object RowDraggingEventInfo {
    
    inline def apply[T /* <: GridBase[TRowData, TKey] */, TRowData, TKey](
      component: T,
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromComponent: dxSortable | dxDraggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: dxSortable | dxDraggable,
      toIndex: Double
    ): RowDraggingEventInfo[T, TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingEventInfo[T, TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowDraggingEventInfo[?, ?, ?], T /* <: GridBase[TRowData, TKey] */, TRowData, TKey] (val x: Self & (RowDraggingEventInfo[T, TRowData, TKey])) extends AnyVal {
      
      inline def setComponent(value: T): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: DxEvent[PointerEvent | MouseEvent | TouchEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setFromComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: TRowData): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setToComponent(value: dxSortable | dxDraggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
      
      inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowDraggingMoveEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with RowDraggingEventInfo[dxDataGrid[TRowData, TKey], TRowData, TKey]
       with DragDropInfo
  object RowDraggingMoveEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      dropInsideItem: Boolean,
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromComponent: dxSortable | dxDraggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: dxSortable | dxDraggable,
      toIndex: Double
    ): RowDraggingMoveEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropInsideItem = dropInsideItem.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingMoveEvent[TRowData, TKey]]
    }
  }
  
  type RowDraggingRemoveEvent[TRowData, TKey] = RowDraggingEventInfo[dxDataGrid[TRowData, TKey], TRowData, TKey]
  
  trait RowDraggingReorderEvent[TRowData, TKey]
    extends StObject
       with RowDraggingEventInfo[dxDataGrid[TRowData, TKey], TRowData, TKey]
       with DragReorderInfo
  object RowDraggingReorderEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      dropInsideItem: Boolean,
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromComponent: dxSortable | dxDraggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: dxSortable | dxDraggable,
      toIndex: Double
    ): RowDraggingReorderEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropInsideItem = dropInsideItem.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingReorderEvent[TRowData, TKey]]
    }
  }
  
  trait RowDraggingStartEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with DragStartEventInfo[dxDataGrid[TRowData, TKey], TRowData, TKey]
  object RowDraggingStartEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement]
    ): RowDraggingStartEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingStartEvent[TRowData, TKey]]
    }
  }
  
  type RowDraggingTemplateData[TRowData] = RowDraggingTemplateDataModel[TRowData]
  
  trait RowDraggingTemplateDataModel[TRowData] extends StObject {
    
    val itemData: TRowData
    
    val itemElement: DxElement_[HTMLElement]
  }
  object RowDraggingTemplateDataModel {
    
    inline def apply[TRowData](itemData: TRowData, itemElement: DxElement_[HTMLElement]): RowDraggingTemplateDataModel[TRowData] = {
      val __obj = js.Dynamic.literal(itemData = itemData.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingTemplateDataModel[TRowData]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowDraggingTemplateDataModel[?], TRowData] (val x: Self & RowDraggingTemplateDataModel[TRowData]) extends AnyVal {
      
      inline def setItemData(value: TRowData): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowExpandedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with RowKeyInfo[TKey]
  object RowExpandedEvent {
    
    inline def apply[TRowData, TKey](component: dxDataGrid[TRowData, TKey], element: DxElement_[HTMLElement], key: TKey): RowExpandedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowExpandedEvent[TRowData, TKey]]
    }
  }
  
  trait RowExpandingEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with RowKeyInfo[TKey]
  object RowExpandingEvent {
    
    inline def apply[TRowData, TKey](component: dxDataGrid[TRowData, TKey], element: DxElement_[HTMLElement], key: TKey): RowExpandingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowExpandingEvent[TRowData, TKey]]
    }
  }
  
  trait RowInsertedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with RowInsertedInfo[TRowData, TKey]
  object RowInsertedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      error: js.Error,
      key: TKey
    ): RowInsertedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowInsertedEvent[TRowData, TKey]]
    }
  }
  
  trait RowInsertedInfo[TRowData, TKey] extends StObject {
    
    val data: TRowData
    
    val error: js.Error
    
    val key: TKey
  }
  object RowInsertedInfo {
    
    inline def apply[TRowData, TKey](data: TRowData, error: js.Error, key: TKey): RowInsertedInfo[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowInsertedInfo[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowInsertedInfo[?, ?], TRowData, TKey] (val x: Self & (RowInsertedInfo[TRowData, TKey])) extends AnyVal {
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowInsertingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with RowInsertingInfo[TRowData]
  object RowInsertingEvent {
    
    inline def apply[TRowData, TKey](
      cancel: Boolean | PromiseLike[Unit],
      component: dxDataGrid[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement]
    ): RowInsertingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowInsertingEvent[TRowData, TKey]]
    }
  }
  
  trait RowInsertingInfo[TRowData] extends StObject {
    
    var cancel: Boolean | PromiseLike[Unit]
    
    var data: TRowData
  }
  object RowInsertingInfo {
    
    inline def apply[TRowData](cancel: Boolean | PromiseLike[Unit], data: TRowData): RowInsertingInfo[TRowData] = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowInsertingInfo[TRowData]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowInsertingInfo[?], TRowData] (val x: Self & RowInsertingInfo[TRowData]) extends AnyVal {
      
      inline def setCancel(value: Boolean | PromiseLike[Unit]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowKeyInfo[TKey] extends StObject {
    
    val key: TKey
  }
  object RowKeyInfo {
    
    inline def apply[TKey](key: TKey): RowKeyInfo[TKey] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowKeyInfo[TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowKeyInfo[?], TKey] (val x: Self & RowKeyInfo[TKey]) extends AnyVal {
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowPreparedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]] {
    
    val columns: js.Array[Column[TRowData, TKey]]
    
    val data: TRowData
    
    val groupIndex: js.UndefOr[Double] = js.undefined
    
    val isExpanded: js.UndefOr[Boolean] = js.undefined
    
    val isNewRow: js.UndefOr[Boolean] = js.undefined
    
    val isSelected: js.UndefOr[Boolean] = js.undefined
    
    val key: TKey
    
    val rowElement: DxElement_[HTMLElement]
    
    val rowIndex: Double
    
    val rowType: String
    
    val values: js.Array[Any]
  }
  object RowPreparedEvent {
    
    inline def apply[TRowData, TKey](
      columns: js.Array[Column[TRowData, TKey]],
      component: dxDataGrid[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      key: TKey,
      rowElement: DxElement_[HTMLElement],
      rowIndex: Double,
      rowType: String,
      values: js.Array[Any]
    ): RowPreparedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowElement = rowElement.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowPreparedEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowPreparedEvent[?, ?], TRowData, TKey] (val x: Self & (RowPreparedEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setColumns(value: js.Array[Column[TRowData, TKey]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (Column[TRowData, TKey])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
      
      inline def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsNewRow(value: Boolean): Self = StObject.set(x, "isNewRow", value.asInstanceOf[js.Any])
      
      inline def setIsNewRowUndefined: Self = StObject.set(x, "isNewRow", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRowElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait RowRemovedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with RowRemovedInfo[TRowData, TKey]
  object RowRemovedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      error: js.Error,
      key: TKey
    ): RowRemovedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowRemovedEvent[TRowData, TKey]]
    }
  }
  
  trait RowRemovedInfo[TRowData, TKey] extends StObject {
    
    val data: TRowData
    
    val error: js.Error
    
    val key: TKey
  }
  object RowRemovedInfo {
    
    inline def apply[TRowData, TKey](data: TRowData, error: js.Error, key: TKey): RowRemovedInfo[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowRemovedInfo[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowRemovedInfo[?, ?], TRowData, TKey] (val x: Self & (RowRemovedInfo[TRowData, TKey])) extends AnyVal {
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowRemovingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with RowRemovingInfo[TRowData, TKey]
  object RowRemovingEvent {
    
    inline def apply[TRowData, TKey](
      cancel: Boolean | PromiseLike[Unit],
      component: dxDataGrid[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      key: TKey
    ): RowRemovingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowRemovingEvent[TRowData, TKey]]
    }
  }
  
  trait RowRemovingInfo[TRowData, TKey] extends StObject {
    
    var cancel: Boolean | PromiseLike[Unit]
    
    val data: TRowData
    
    val key: TKey
  }
  object RowRemovingInfo {
    
    inline def apply[TRowData, TKey](cancel: Boolean | PromiseLike[Unit], data: TRowData, key: TKey): RowRemovingInfo[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowRemovingInfo[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowRemovingInfo[?, ?], TRowData, TKey] (val x: Self & (RowRemovingInfo[TRowData, TKey])) extends AnyVal {
      
      inline def setCancel(value: Boolean | PromiseLike[Unit]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowTemplateData[TRowData, TKey] extends StObject {
    
    val columns: js.Array[Column[TRowData, TKey]]
    
    val component: dxDataGrid[TRowData, TKey]
    
    val data: TRowData
    
    val groupIndex: js.UndefOr[Double] = js.undefined
    
    val isExpanded: js.UndefOr[Boolean] = js.undefined
    
    val isSelected: js.UndefOr[Boolean] = js.undefined
    
    val key: TKey
    
    val rowIndex: Double
    
    val rowType: String
    
    val values: js.Array[Any]
  }
  object RowTemplateData {
    
    inline def apply[TRowData, TKey](
      columns: js.Array[Column[TRowData, TKey]],
      component: dxDataGrid[TRowData, TKey],
      data: TRowData,
      key: TKey,
      rowIndex: Double,
      rowType: String,
      values: js.Array[Any]
    ): RowTemplateData[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowTemplateData[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowTemplateData[?, ?], TRowData, TKey] (val x: Self & (RowTemplateData[TRowData, TKey])) extends AnyVal {
      
      inline def setColumns(value: js.Array[Column[TRowData, TKey]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (Column[TRowData, TKey])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setComponent(value: dxDataGrid[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setGroupIndex(value: Double): Self = StObject.set(x, "groupIndex", value.asInstanceOf[js.Any])
      
      inline def setGroupIndexUndefined: Self = StObject.set(x, "groupIndex", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait RowUpdatedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with RowUpdatedInfo[TRowData, TKey]
  object RowUpdatedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      error: js.Error,
      key: TKey
    ): RowUpdatedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowUpdatedEvent[TRowData, TKey]]
    }
  }
  
  trait RowUpdatedInfo[TRowData, TKey] extends StObject {
    
    val data: TRowData
    
    val error: js.Error
    
    val key: TKey
  }
  object RowUpdatedInfo {
    
    inline def apply[TRowData, TKey](data: TRowData, error: js.Error, key: TKey): RowUpdatedInfo[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowUpdatedInfo[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowUpdatedInfo[?, ?], TRowData, TKey] (val x: Self & (RowUpdatedInfo[TRowData, TKey])) extends AnyVal {
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowUpdatingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with RowUpdatingInfo[TRowData, TKey]
  object RowUpdatingEvent {
    
    inline def apply[TRowData, TKey](
      cancel: Boolean | PromiseLike[Unit],
      component: dxDataGrid[TRowData, TKey],
      element: DxElement_[HTMLElement],
      key: TKey,
      newData: DeepPartial[TRowData],
      oldData: TRowData
    ): RowUpdatingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], newData = newData.asInstanceOf[js.Any], oldData = oldData.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowUpdatingEvent[TRowData, TKey]]
    }
  }
  
  trait RowUpdatingInfo[TRowData, TKey] extends StObject {
    
    var cancel: Boolean | PromiseLike[Unit]
    
    val key: TKey
    
    var newData: DeepPartial[TRowData]
    
    val oldData: TRowData
  }
  object RowUpdatingInfo {
    
    inline def apply[TRowData, TKey](cancel: Boolean | PromiseLike[Unit], key: TKey, newData: DeepPartial[TRowData], oldData: TRowData): RowUpdatingInfo[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], newData = newData.asInstanceOf[js.Any], oldData = oldData.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowUpdatingInfo[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowUpdatingInfo[?, ?], TRowData, TKey] (val x: Self & (RowUpdatingInfo[TRowData, TKey])) extends AnyVal {
      
      inline def setCancel(value: Boolean | PromiseLike[Unit]): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNewData(value: DeepPartial[TRowData]): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
      
      inline def setOldData(value: TRowData): Self = StObject.set(x, "oldData", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowValidatingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with RowValidatingInfo[TRowData, TKey]
  object RowValidatingEvent {
    
    inline def apply[TRowData, TKey](
      brokenRules: js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ],
      component: dxDataGrid[TRowData, TKey],
      element: DxElement_[HTMLElement],
      errorText: String,
      isValid: Boolean,
      key: TKey,
      newData: DeepPartial[TRowData],
      oldData: TRowData
    ): RowValidatingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(brokenRules = brokenRules.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], newData = newData.asInstanceOf[js.Any], oldData = oldData.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowValidatingEvent[TRowData, TKey]]
    }
  }
  
  trait RowValidatingInfo[TRowData, TKey] extends StObject {
    
    val brokenRules: js.Array[
        RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
      ]
    
    var errorText: String
    
    var isValid: Boolean
    
    val key: TKey
    
    val newData: DeepPartial[TRowData]
    
    val oldData: TRowData
    
    var promise: js.UndefOr[PromiseLike[Unit]] = js.undefined
  }
  object RowValidatingInfo {
    
    inline def apply[TRowData, TKey](
      brokenRules: js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ],
      errorText: String,
      isValid: Boolean,
      key: TKey,
      newData: DeepPartial[TRowData],
      oldData: TRowData
    ): RowValidatingInfo[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(brokenRules = brokenRules.asInstanceOf[js.Any], errorText = errorText.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], newData = newData.asInstanceOf[js.Any], oldData = oldData.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowValidatingInfo[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowValidatingInfo[?, ?], TRowData, TKey] (val x: Self & (RowValidatingInfo[TRowData, TKey])) extends AnyVal {
      
      inline def setBrokenRules(
        value: js.Array[
              RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
            ]
      ): Self = StObject.set(x, "brokenRules", value.asInstanceOf[js.Any])
      
      inline def setBrokenRulesVarargs(
        value: (RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule)*
      ): Self = StObject.set(x, "brokenRules", js.Array(value*))
      
      inline def setErrorText(value: String): Self = StObject.set(x, "errorText", value.asInstanceOf[js.Any])
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setNewData(value: DeepPartial[TRowData]): Self = StObject.set(x, "newData", value.asInstanceOf[js.Any])
      
      inline def setOldData(value: TRowData): Self = StObject.set(x, "oldData", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: PromiseLike[Unit]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
    }
  }
  
  trait SavedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with DataChangeInfo[TRowData, TKey]
  object SavedEvent {
    
    inline def apply[TRowData, TKey](
      changes: js.Array[typings.devextreme.mod.DevExpress.common.grids.DataChange[TRowData, TKey]],
      component: dxDataGrid[TRowData, TKey],
      element: DxElement_[HTMLElement]
    ): SavedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[SavedEvent[TRowData, TKey]]
    }
  }
  
  trait SavingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with SavingInfo[TRowData, TKey]
  object SavingEvent {
    
    inline def apply[TRowData, TKey](
      cancel: Boolean,
      changes: js.Array[typings.devextreme.mod.DevExpress.common.grids.DataChange[TRowData, TKey]],
      component: dxDataGrid[TRowData, TKey],
      element: DxElement_[HTMLElement]
    ): SavingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[SavingEvent[TRowData, TKey]]
    }
  }
  
  trait SavingInfo[TRowData, TKey] extends StObject {
    
    var cancel: Boolean
    
    var changes: js.Array[typings.devextreme.mod.DevExpress.common.grids.DataChange[TRowData, TKey]]
    
    var promise: js.UndefOr[PromiseLike[Unit]] = js.undefined
  }
  object SavingInfo {
    
    inline def apply[TRowData, TKey](
      cancel: Boolean,
      changes: js.Array[typings.devextreme.mod.DevExpress.common.grids.DataChange[TRowData, TKey]]
    ): SavingInfo[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any])
      __obj.asInstanceOf[SavingInfo[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SavingInfo[?, ?], TRowData, TKey] (val x: Self & (SavingInfo[TRowData, TKey])) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setChanges(value: js.Array[typings.devextreme.mod.DevExpress.common.grids.DataChange[TRowData, TKey]]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setChangesVarargs(value: (typings.devextreme.mod.DevExpress.common.grids.DataChange[TRowData, TKey])*): Self = StObject.set(x, "changes", js.Array(value*))
      
      inline def setPromise(value: PromiseLike[Unit]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
    }
  }
  
  /* Inlined devextreme.devextreme.DevExpress.core.Skip<devextreme.devextreme.DevExpress.ui.dxScrollable<devextreme.devextreme.DevExpress.ui.dxScrollable.Properties>, '_templateManager' | '_cancelOptionChange' | '_getTemplate' | '_invalidate' | '_refresh' | '_notifyOptionChanged' | '_createElement'> */
  trait Scrollable extends StObject {
    
    @JSName("$element")
    def $element(): UserDefinedElement[Element]
    @JSName("$element")
    var $element_Original: js.Function0[UserDefinedElement[Element]]
    
    def beginUpdate(): Unit
    @JSName("beginUpdate")
    var beginUpdate_Original: js.Function0[Unit]
    
    def clientHeight(): Double
    @JSName("clientHeight")
    var clientHeight_Original: js.Function0[Double]
    
    def clientWidth(): Double
    @JSName("clientWidth")
    var clientWidth_Original: js.Function0[Double]
    
    def content(): DxElement_[HTMLElement]
    @JSName("content")
    var content_Original: js.Function0[DxElement_[HTMLElement]]
    
    def dispose(): Unit
    @JSName("dispose")
    var dispose_Original: js.Function0[Unit]
    
    def element(): DxElement_[HTMLElement]
    @JSName("element")
    var element_Original: js.Function0[DxElement_[HTMLElement]]
    
    def endUpdate(): Unit
    @JSName("endUpdate")
    var endUpdate_Original: js.Function0[Unit]
    
    def instance(): this.type
    @JSName("instance")
    var instance_Original: js.Function0[this.type]
    
    def off(eventName: String): this.type
    @JSName("off")
    var off_Original: js.Function1[/* eventName */ String, this.type]
    
    def on(eventName: String, eventHandler: js.Function): this.type
    @JSName("on")
    var on_Original: js.Function2[/* eventName */ String, /* eventHandler */ js.Function, this.type]
    
    def option(): typings.devextreme.mod.DevExpress.ui.dxScrollable.Properties
    @JSName("option")
    var option_Original: js.Function0[typings.devextreme.mod.DevExpress.ui.dxScrollable.Properties]
    
    def resetOption(optionName: String): Unit
    @JSName("resetOption")
    var resetOption_Original: js.Function1[/* optionName */ String, Unit]
    
    def scrollBy(distance: Any): Unit
    def scrollBy(distance: Double): Unit
    @JSName("scrollBy")
    var scrollBy_Original: js.Function1[/* distance */ Double | Any, Unit]
    
    def scrollHeight(): Double
    @JSName("scrollHeight")
    var scrollHeight_Original: js.Function0[Double]
    
    def scrollLeft(): Double
    @JSName("scrollLeft")
    var scrollLeft_Original: js.Function0[Double]
    
    def scrollOffset(): Any
    @JSName("scrollOffset")
    var scrollOffset_Original: js.Function0[Any]
    
    def scrollTo(targetLocation: Any): Unit
    def scrollTo(targetLocation: Double): Unit
    
    def scrollToElement(element: UserDefinedElement[Element]): Unit
    @JSName("scrollToElement")
    var scrollToElement_Original: js.Function1[/* element */ UserDefinedElement[Element], Unit]
    
    @JSName("scrollTo")
    var scrollTo_Original: js.Function1[/* targetLocation */ Double | Any, Unit]
    
    def scrollTop(): Double
    @JSName("scrollTop")
    var scrollTop_Original: js.Function0[Double]
    
    def scrollWidth(): Double
    @JSName("scrollWidth")
    var scrollWidth_Original: js.Function0[Double]
    
    def update(): js.Promise[Unit]
    @JSName("update")
    var update_Original: js.Function0[js.Promise[Unit]]
  }
  object Scrollable {
    
    inline def apply(
      $element: () => UserDefinedElement[Element],
      beginUpdate: () => Unit,
      clientHeight: () => Double,
      clientWidth: () => Double,
      content: () => DxElement_[HTMLElement],
      dispose: () => Unit,
      element: () => DxElement_[HTMLElement],
      endUpdate: () => Unit,
      instance: () => Scrollable,
      off: /* eventName */ String => Scrollable,
      on: (/* eventName */ String, /* eventHandler */ js.Function) => Scrollable,
      option: () => typings.devextreme.mod.DevExpress.ui.dxScrollable.Properties,
      resetOption: /* optionName */ String => Unit,
      scrollBy: /* distance */ Double | Any => Unit,
      scrollHeight: () => Double,
      scrollLeft: () => Double,
      scrollOffset: () => Any,
      scrollTo: /* targetLocation */ Double | Any => Unit,
      scrollToElement: /* element */ UserDefinedElement[Element] => Unit,
      scrollTop: () => Double,
      scrollWidth: () => Double,
      update: () => js.Promise[Unit]
    ): Scrollable = {
      val __obj = js.Dynamic.literal($element = js.Any.fromFunction0($element), beginUpdate = js.Any.fromFunction0(beginUpdate), clientHeight = js.Any.fromFunction0(clientHeight), clientWidth = js.Any.fromFunction0(clientWidth), content = js.Any.fromFunction0(content), dispose = js.Any.fromFunction0(dispose), element = js.Any.fromFunction0(element), endUpdate = js.Any.fromFunction0(endUpdate), instance = js.Any.fromFunction0(instance), off = js.Any.fromFunction1(off), on = js.Any.fromFunction2(on), option = js.Any.fromFunction0(option), resetOption = js.Any.fromFunction1(resetOption), scrollBy = js.Any.fromFunction1(scrollBy), scrollHeight = js.Any.fromFunction0(scrollHeight), scrollLeft = js.Any.fromFunction0(scrollLeft), scrollOffset = js.Any.fromFunction0(scrollOffset), scrollTo = js.Any.fromFunction1(scrollTo), scrollToElement = js.Any.fromFunction1(scrollToElement), scrollTop = js.Any.fromFunction0(scrollTop), scrollWidth = js.Any.fromFunction0(scrollWidth), update = js.Any.fromFunction0(update))
      __obj.asInstanceOf[Scrollable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scrollable] (val x: Self) extends AnyVal {
      
      inline def set$element(value: () => UserDefinedElement[Element]): Self = StObject.set(x, "$element", js.Any.fromFunction0(value))
      
      inline def setBeginUpdate(value: () => Unit): Self = StObject.set(x, "beginUpdate", js.Any.fromFunction0(value))
      
      inline def setClientHeight(value: () => Double): Self = StObject.set(x, "clientHeight", js.Any.fromFunction0(value))
      
      inline def setClientWidth(value: () => Double): Self = StObject.set(x, "clientWidth", js.Any.fromFunction0(value))
      
      inline def setContent(value: () => DxElement_[HTMLElement]): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setElement(value: () => DxElement_[HTMLElement]): Self = StObject.set(x, "element", js.Any.fromFunction0(value))
      
      inline def setEndUpdate(value: () => Unit): Self = StObject.set(x, "endUpdate", js.Any.fromFunction0(value))
      
      inline def setInstance(value: () => Scrollable): Self = StObject.set(x, "instance", js.Any.fromFunction0(value))
      
      inline def setOff(value: /* eventName */ String => Scrollable): Self = StObject.set(x, "off", js.Any.fromFunction1(value))
      
      inline def setOn(value: (/* eventName */ String, /* eventHandler */ js.Function) => Scrollable): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
      
      inline def setOption(value: () => typings.devextreme.mod.DevExpress.ui.dxScrollable.Properties): Self = StObject.set(x, "option", js.Any.fromFunction0(value))
      
      inline def setResetOption(value: /* optionName */ String => Unit): Self = StObject.set(x, "resetOption", js.Any.fromFunction1(value))
      
      inline def setScrollBy(value: /* distance */ Double | Any => Unit): Self = StObject.set(x, "scrollBy", js.Any.fromFunction1(value))
      
      inline def setScrollHeight(value: () => Double): Self = StObject.set(x, "scrollHeight", js.Any.fromFunction0(value))
      
      inline def setScrollLeft(value: () => Double): Self = StObject.set(x, "scrollLeft", js.Any.fromFunction0(value))
      
      inline def setScrollOffset(value: () => Any): Self = StObject.set(x, "scrollOffset", js.Any.fromFunction0(value))
      
      inline def setScrollTo(value: /* targetLocation */ Double | Any => Unit): Self = StObject.set(x, "scrollTo", js.Any.fromFunction1(value))
      
      inline def setScrollToElement(value: /* element */ UserDefinedElement[Element] => Unit): Self = StObject.set(x, "scrollToElement", js.Any.fromFunction1(value))
      
      inline def setScrollTop(value: () => Double): Self = StObject.set(x, "scrollTop", js.Any.fromFunction0(value))
      
      inline def setScrollWidth(value: () => Double): Self = StObject.set(x, "scrollWidth", js.Any.fromFunction0(value))
      
      inline def setUpdate(value: () => js.Promise[Unit]): Self = StObject.set(x, "update", js.Any.fromFunction0(value))
    }
  }
  
  trait Scrolling
    extends StObject
       with ScrollingBase {
    
    /**
      * Specifies the scrolling mode.
      */
    var mode: js.UndefOr[DataGridScrollMode] = js.undefined
  }
  object Scrolling {
    
    inline def apply(): Scrolling = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scrolling]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scrolling] (val x: Self) extends AnyVal {
      
      inline def setMode(value: DataGridScrollMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait ScrollingBase extends StObject {
    
    /**
      * Specifies the rendering mode for columns. Applies when columns are left outside the viewport. Requires the columnWidth, columnAutoWidth, or width (for all columns) property specified.
      */
    var columnRenderingMode: js.UndefOr[DataRenderMode] = js.undefined
    
    /**
      * Specifies whether the UI component should load adjacent pages. Applies only if scrolling.mode is &apos;virtual&apos; or &apos;infinite&apos;.
      */
    var preloadEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether to render rows after a user stops scrolling or at the same time as the user scrolls the widget.
      */
    var renderAsync: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the rendering mode for loaded rows.
      */
    var rowRenderingMode: js.UndefOr[DataRenderMode] = js.undefined
    
    /**
      * Specifies whether a user can scroll the content with a swipe gesture. Applies only if useNative is false.
      */
    var scrollByContent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether a user can scroll the content with the scrollbar. Applies only if useNative is false.
      */
    var scrollByThumb: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies when to show scrollbars. Applies only if useNative is false.
      */
    var showScrollbar: js.UndefOr[ScrollbarMode] = js.undefined
    
    /**
      * Specifies whether the widget should use native or simulated scrolling.
      */
    var useNative: js.UndefOr[Boolean | Mode] = js.undefined
  }
  object ScrollingBase {
    
    inline def apply(): ScrollingBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollingBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollingBase] (val x: Self) extends AnyVal {
      
      inline def setColumnRenderingMode(value: DataRenderMode): Self = StObject.set(x, "columnRenderingMode", value.asInstanceOf[js.Any])
      
      inline def setColumnRenderingModeUndefined: Self = StObject.set(x, "columnRenderingMode", js.undefined)
      
      inline def setPreloadEnabled(value: Boolean): Self = StObject.set(x, "preloadEnabled", value.asInstanceOf[js.Any])
      
      inline def setPreloadEnabledUndefined: Self = StObject.set(x, "preloadEnabled", js.undefined)
      
      inline def setRenderAsync(value: Boolean): Self = StObject.set(x, "renderAsync", value.asInstanceOf[js.Any])
      
      inline def setRenderAsyncUndefined: Self = StObject.set(x, "renderAsync", js.undefined)
      
      inline def setRowRenderingMode(value: DataRenderMode): Self = StObject.set(x, "rowRenderingMode", value.asInstanceOf[js.Any])
      
      inline def setRowRenderingModeUndefined: Self = StObject.set(x, "rowRenderingMode", js.undefined)
      
      inline def setScrollByContent(value: Boolean): Self = StObject.set(x, "scrollByContent", value.asInstanceOf[js.Any])
      
      inline def setScrollByContentUndefined: Self = StObject.set(x, "scrollByContent", js.undefined)
      
      inline def setScrollByThumb(value: Boolean): Self = StObject.set(x, "scrollByThumb", value.asInstanceOf[js.Any])
      
      inline def setScrollByThumbUndefined: Self = StObject.set(x, "scrollByThumb", js.undefined)
      
      inline def setShowScrollbar(value: ScrollbarMode): Self = StObject.set(x, "showScrollbar", value.asInstanceOf[js.Any])
      
      inline def setShowScrollbarUndefined: Self = StObject.set(x, "showScrollbar", js.undefined)
      
      inline def setUseNative(value: Boolean | Mode): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
      
      inline def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
    }
  }
  
  type SearchPanel = typings.devextreme.mod.DevExpress.common.grids.SearchPanel
  
  trait Selection
    extends StObject
       with SelectionBase {
    
    /**
      * Makes selection deferred.
      */
    var deferred: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the mode in which all the records are selected. Applies only if selection.allowSelectAll is true.
      */
    var selectAllMode: js.UndefOr[SelectAllMode] = js.undefined
    
    /**
      * Specifies when to display the selection column and row selection checkboxes. Applies only if selection.mode is &apos;multiple&apos;.
      */
    var showCheckBoxesMode: js.UndefOr[SelectionColumnDisplayMode] = js.undefined
  }
  object Selection {
    
    inline def apply(): Selection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Selection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Selection] (val x: Self) extends AnyVal {
      
      inline def setDeferred(value: Boolean): Self = StObject.set(x, "deferred", value.asInstanceOf[js.Any])
      
      inline def setDeferredUndefined: Self = StObject.set(x, "deferred", js.undefined)
      
      inline def setSelectAllMode(value: SelectAllMode): Self = StObject.set(x, "selectAllMode", value.asInstanceOf[js.Any])
      
      inline def setSelectAllModeUndefined: Self = StObject.set(x, "selectAllMode", js.undefined)
      
      inline def setShowCheckBoxesMode(value: SelectionColumnDisplayMode): Self = StObject.set(x, "showCheckBoxesMode", value.asInstanceOf[js.Any])
      
      inline def setShowCheckBoxesModeUndefined: Self = StObject.set(x, "showCheckBoxesMode", js.undefined)
    }
  }
  
  trait SelectionBase extends StObject {
    
    /**
      * Allows users to simultaneously select all or current page rows (depending on the selectAllMode).
      */
    var allowSelectAll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the selection mode.
      */
    var mode: js.UndefOr[SingleMultipleOrNone] = js.undefined
  }
  object SelectionBase {
    
    inline def apply(): SelectionBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionBase] (val x: Self) extends AnyVal {
      
      inline def setAllowSelectAll(value: Boolean): Self = StObject.set(x, "allowSelectAll", value.asInstanceOf[js.Any])
      
      inline def setAllowSelectAllUndefined: Self = StObject.set(x, "allowSelectAll", js.undefined)
      
      inline def setMode(value: SingleMultipleOrNone): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait SelectionChangedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with SelectionChangedInfo[TRowData, TKey]
  object SelectionChangedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      currentDeselectedRowKeys: js.Array[TKey],
      currentSelectedRowKeys: js.Array[TKey],
      element: DxElement_[HTMLElement],
      selectedRowKeys: js.Array[TKey],
      selectedRowsData: js.Array[TRowData]
    ): SelectionChangedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], currentDeselectedRowKeys = currentDeselectedRowKeys.asInstanceOf[js.Any], currentSelectedRowKeys = currentSelectedRowKeys.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], selectedRowKeys = selectedRowKeys.asInstanceOf[js.Any], selectedRowsData = selectedRowsData.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedEvent[TRowData, TKey]]
    }
  }
  
  trait SelectionChangedInfo[TRowData, TKey] extends StObject {
    
    val currentDeselectedRowKeys: js.Array[TKey]
    
    val currentSelectedRowKeys: js.Array[TKey]
    
    val selectedRowKeys: js.Array[TKey]
    
    val selectedRowsData: js.Array[TRowData]
  }
  object SelectionChangedInfo {
    
    inline def apply[TRowData, TKey](
      currentDeselectedRowKeys: js.Array[TKey],
      currentSelectedRowKeys: js.Array[TKey],
      selectedRowKeys: js.Array[TKey],
      selectedRowsData: js.Array[TRowData]
    ): SelectionChangedInfo[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(currentDeselectedRowKeys = currentDeselectedRowKeys.asInstanceOf[js.Any], currentSelectedRowKeys = currentSelectedRowKeys.asInstanceOf[js.Any], selectedRowKeys = selectedRowKeys.asInstanceOf[js.Any], selectedRowsData = selectedRowsData.asInstanceOf[js.Any])
      __obj.asInstanceOf[SelectionChangedInfo[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionChangedInfo[?, ?], TRowData, TKey] (val x: Self & (SelectionChangedInfo[TRowData, TKey])) extends AnyVal {
      
      inline def setCurrentDeselectedRowKeys(value: js.Array[TKey]): Self = StObject.set(x, "currentDeselectedRowKeys", value.asInstanceOf[js.Any])
      
      inline def setCurrentDeselectedRowKeysVarargs(value: TKey*): Self = StObject.set(x, "currentDeselectedRowKeys", js.Array(value*))
      
      inline def setCurrentSelectedRowKeys(value: js.Array[TKey]): Self = StObject.set(x, "currentSelectedRowKeys", value.asInstanceOf[js.Any])
      
      inline def setCurrentSelectedRowKeysVarargs(value: TKey*): Self = StObject.set(x, "currentSelectedRowKeys", js.Array(value*))
      
      inline def setSelectedRowKeys(value: js.Array[TKey]): Self = StObject.set(x, "selectedRowKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowKeysVarargs(value: TKey*): Self = StObject.set(x, "selectedRowKeys", js.Array(value*))
      
      inline def setSelectedRowsData(value: js.Array[TRowData]): Self = StObject.set(x, "selectedRowsData", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowsDataVarargs(value: TRowData*): Self = StObject.set(x, "selectedRowsData", js.Array(value*))
    }
  }
  
  type Sorting = typings.devextreme.mod.DevExpress.common.grids.Sorting
  
  type StateStoring = typings.devextreme.mod.DevExpress.common.grids.StateStoring
  
  trait Summary[TRowData, TKey] extends StObject {
    
    /**
      * Specifies a custom aggregate function. This function is called for summary items whose summaryType is &apos;custom&apos;.
      */
    var calculateCustomSummary: js.UndefOr[js.Function1[/* options */ CustomSummaryInfo[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * Specifies items of the group summary.
      */
    var groupItems: js.UndefOr[js.Array[SummaryGroupItem]] = js.undefined
    
    /**
      * Specifies whether to recalculate summaries while a user edits data.
      */
    var recalculateWhileEditing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether to skip empty strings, null and undefined values when calculating a summary. Does not apply when you use a remote data source.
      */
    var skipEmptyValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Contains properties that specify text patterns for summary items.
      */
    var texts: js.UndefOr[SummaryTexts] = js.undefined
    
    /**
      * Specifies items of the total summary.
      */
    var totalItems: js.UndefOr[js.Array[SummaryTotalItem]] = js.undefined
  }
  object Summary {
    
    inline def apply[TRowData, TKey](): Summary[TRowData, TKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Summary[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Summary[?, ?], TRowData, TKey] (val x: Self & (Summary[TRowData, TKey])) extends AnyVal {
      
      inline def setCalculateCustomSummary(value: /* options */ CustomSummaryInfo[TRowData, TKey] => Unit): Self = StObject.set(x, "calculateCustomSummary", js.Any.fromFunction1(value))
      
      inline def setCalculateCustomSummaryUndefined: Self = StObject.set(x, "calculateCustomSummary", js.undefined)
      
      inline def setGroupItems(value: js.Array[SummaryGroupItem]): Self = StObject.set(x, "groupItems", value.asInstanceOf[js.Any])
      
      inline def setGroupItemsUndefined: Self = StObject.set(x, "groupItems", js.undefined)
      
      inline def setGroupItemsVarargs(value: SummaryGroupItem*): Self = StObject.set(x, "groupItems", js.Array(value*))
      
      inline def setRecalculateWhileEditing(value: Boolean): Self = StObject.set(x, "recalculateWhileEditing", value.asInstanceOf[js.Any])
      
      inline def setRecalculateWhileEditingUndefined: Self = StObject.set(x, "recalculateWhileEditing", js.undefined)
      
      inline def setSkipEmptyValues(value: Boolean): Self = StObject.set(x, "skipEmptyValues", value.asInstanceOf[js.Any])
      
      inline def setSkipEmptyValuesUndefined: Self = StObject.set(x, "skipEmptyValues", js.undefined)
      
      inline def setTexts(value: SummaryTexts): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
      
      inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
      
      inline def setTotalItems(value: js.Array[SummaryTotalItem]): Self = StObject.set(x, "totalItems", value.asInstanceOf[js.Any])
      
      inline def setTotalItemsUndefined: Self = StObject.set(x, "totalItems", js.undefined)
      
      inline def setTotalItemsVarargs(value: SummaryTotalItem*): Self = StObject.set(x, "totalItems", js.Array(value*))
    }
  }
  
  trait SummaryGroupItem extends StObject {
    
    /**
      * Indicates whether to display group summary items in parentheses after the group row header or to align them by the corresponding columns within the group row.
      */
    var alignByColumn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the column that provides data for a group summary item.
      */
    var column: js.UndefOr[String] = js.undefined
    
    /**
      * Customizes the text to be displayed in the summary item.
      */
    var customizeText: js.UndefOr[js.Function1[/* itemInfo */ SummaryItemTextInfo, String]] = js.undefined
    
    /**
      * Specifies the summary item&apos;s text.
      */
    var displayFormat: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the group summary item&apos;s identifier.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the column that must hold the summary item when this item is displayed in the group footer or aligned by a column in the group row.
      */
    var showInColumn: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies whether or not a summary item must be displayed in the group footer.
      */
    var showInGroupFooter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether to skip empty strings, null, and undefined values when calculating a summary. Does not apply when you use a remote data source.
      */
    var skipEmptyValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies how to aggregate data for the group summary item.
      */
    var summaryType: js.UndefOr[SummaryType | String] = js.undefined
    
    /**
      * Specifies a summary item value&apos;s display format.
      */
    var valueFormat: js.UndefOr[Format] = js.undefined
  }
  object SummaryGroupItem {
    
    inline def apply(): SummaryGroupItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SummaryGroupItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SummaryGroupItem] (val x: Self) extends AnyVal {
      
      inline def setAlignByColumn(value: Boolean): Self = StObject.set(x, "alignByColumn", value.asInstanceOf[js.Any])
      
      inline def setAlignByColumnUndefined: Self = StObject.set(x, "alignByColumn", js.undefined)
      
      inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setCustomizeText(value: /* itemInfo */ SummaryItemTextInfo => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
      
      inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
      
      inline def setDisplayFormat(value: String): Self = StObject.set(x, "displayFormat", value.asInstanceOf[js.Any])
      
      inline def setDisplayFormatUndefined: Self = StObject.set(x, "displayFormat", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setShowInColumn(value: String): Self = StObject.set(x, "showInColumn", value.asInstanceOf[js.Any])
      
      inline def setShowInColumnUndefined: Self = StObject.set(x, "showInColumn", js.undefined)
      
      inline def setShowInGroupFooter(value: Boolean): Self = StObject.set(x, "showInGroupFooter", value.asInstanceOf[js.Any])
      
      inline def setShowInGroupFooterUndefined: Self = StObject.set(x, "showInGroupFooter", js.undefined)
      
      inline def setSkipEmptyValues(value: Boolean): Self = StObject.set(x, "skipEmptyValues", value.asInstanceOf[js.Any])
      
      inline def setSkipEmptyValuesUndefined: Self = StObject.set(x, "skipEmptyValues", js.undefined)
      
      inline def setSummaryType(value: SummaryType | String): Self = StObject.set(x, "summaryType", value.asInstanceOf[js.Any])
      
      inline def setSummaryTypeUndefined: Self = StObject.set(x, "summaryType", js.undefined)
      
      inline def setValueFormat(value: Format): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    }
  }
  
  trait SummaryItemTextInfo extends StObject {
    
    val value: js.UndefOr[String | Double | js.Date] = js.undefined
    
    val valueText: String
  }
  object SummaryItemTextInfo {
    
    inline def apply(valueText: String): SummaryItemTextInfo = {
      val __obj = js.Dynamic.literal(valueText = valueText.asInstanceOf[js.Any])
      __obj.asInstanceOf[SummaryItemTextInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SummaryItemTextInfo] (val x: Self) extends AnyVal {
      
      inline def setValue(value: String | Double | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueText(value: String): Self = StObject.set(x, "valueText", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SummaryTexts extends StObject {
    
    /**
      * Specifies a pattern for the &apos;avg&apos; summary items when they are displayed in the parent column.
      */
    var avg: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a pattern for the &apos;avg&apos; summary items displayed in a group row or in any other column rather than the parent one.
      */
    var avgOtherColumn: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a pattern for the &apos;count&apos; summary items.
      */
    var count: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a pattern for the &apos;max&apos; summary items when they are displayed in the parent column.
      */
    var max: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a pattern for the &apos;max&apos; summary items displayed in a group row or in any other column rather than the parent one.
      */
    var maxOtherColumn: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a pattern for the &apos;min&apos; summary items when they are displayed in the parent column.
      */
    var min: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a pattern for the &apos;min&apos; summary items displayed in a group row or in any other column rather than the parent one.
      */
    var minOtherColumn: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a pattern for the &apos;sum&apos; summary items when they are displayed in the parent column.
      */
    var sum: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a pattern for the &apos;sum&apos; summary items displayed in a group row or in any other column rather than the parent one.
      */
    var sumOtherColumn: js.UndefOr[String] = js.undefined
  }
  object SummaryTexts {
    
    inline def apply(): SummaryTexts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SummaryTexts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SummaryTexts] (val x: Self) extends AnyVal {
      
      inline def setAvg(value: String): Self = StObject.set(x, "avg", value.asInstanceOf[js.Any])
      
      inline def setAvgOtherColumn(value: String): Self = StObject.set(x, "avgOtherColumn", value.asInstanceOf[js.Any])
      
      inline def setAvgOtherColumnUndefined: Self = StObject.set(x, "avgOtherColumn", js.undefined)
      
      inline def setAvgUndefined: Self = StObject.set(x, "avg", js.undefined)
      
      inline def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxOtherColumn(value: String): Self = StObject.set(x, "maxOtherColumn", value.asInstanceOf[js.Any])
      
      inline def setMaxOtherColumnUndefined: Self = StObject.set(x, "maxOtherColumn", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinOtherColumn(value: String): Self = StObject.set(x, "minOtherColumn", value.asInstanceOf[js.Any])
      
      inline def setMinOtherColumnUndefined: Self = StObject.set(x, "minOtherColumn", js.undefined)
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setSum(value: String): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
      
      inline def setSumOtherColumn(value: String): Self = StObject.set(x, "sumOtherColumn", value.asInstanceOf[js.Any])
      
      inline def setSumOtherColumnUndefined: Self = StObject.set(x, "sumOtherColumn", js.undefined)
      
      inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
    }
  }
  
  trait SummaryTotalItem extends StObject {
    
    /**
      * Specifies the alignment of a summary item.
      */
    var alignment: js.UndefOr[HorizontalAlignment] = js.undefined
    
    /**
      * Specifies the column that provides data for a summary item.
      */
    var column: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies a CSS class to be applied to a summary item.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /**
      * Customizes the text to be displayed in the summary item.
      */
    var customizeText: js.UndefOr[js.Function1[/* itemInfo */ SummaryItemTextInfo, String]] = js.undefined
    
    /**
      * Specifies the summary item&apos;s text.
      */
    var displayFormat: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the total summary item&apos;s identifier.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the column that must hold the summary item.
      */
    var showInColumn: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies whether to skip empty strings, null, and undefined values when calculating a summary. Does not apply when you use a remote data source.
      */
    var skipEmptyValues: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies how to aggregate data for the total summary item.
      */
    var summaryType: js.UndefOr[SummaryType | String] = js.undefined
    
    /**
      * Specifies a summary item value&apos;s display format.
      */
    var valueFormat: js.UndefOr[Format] = js.undefined
  }
  object SummaryTotalItem {
    
    inline def apply(): SummaryTotalItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SummaryTotalItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SummaryTotalItem] (val x: Self) extends AnyVal {
      
      inline def setAlignment(value: HorizontalAlignment): Self = StObject.set(x, "alignment", value.asInstanceOf[js.Any])
      
      inline def setAlignmentUndefined: Self = StObject.set(x, "alignment", js.undefined)
      
      inline def setColumn(value: String): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnUndefined: Self = StObject.set(x, "column", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCustomizeText(value: /* itemInfo */ SummaryItemTextInfo => String): Self = StObject.set(x, "customizeText", js.Any.fromFunction1(value))
      
      inline def setCustomizeTextUndefined: Self = StObject.set(x, "customizeText", js.undefined)
      
      inline def setDisplayFormat(value: String): Self = StObject.set(x, "displayFormat", value.asInstanceOf[js.Any])
      
      inline def setDisplayFormatUndefined: Self = StObject.set(x, "displayFormat", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setShowInColumn(value: String): Self = StObject.set(x, "showInColumn", value.asInstanceOf[js.Any])
      
      inline def setShowInColumnUndefined: Self = StObject.set(x, "showInColumn", js.undefined)
      
      inline def setSkipEmptyValues(value: Boolean): Self = StObject.set(x, "skipEmptyValues", value.asInstanceOf[js.Any])
      
      inline def setSkipEmptyValuesUndefined: Self = StObject.set(x, "skipEmptyValues", js.undefined)
      
      inline def setSummaryType(value: SummaryType | String): Self = StObject.set(x, "summaryType", value.asInstanceOf[js.Any])
      
      inline def setSummaryTypeUndefined: Self = StObject.set(x, "summaryType", js.undefined)
      
      inline def setValueFormat(value: Format): Self = StObject.set(x, "valueFormat", value.asInstanceOf[js.Any])
      
      inline def setValueFormatFunction1(value: js.Date | Double => String): Self = StObject.set(x, "valueFormat", js.Any.fromFunction1(value))
      
      inline def setValueFormatUndefined: Self = StObject.set(x, "valueFormat", js.undefined)
    }
  }
  
  trait Toolbar extends StObject {
    
    /**
      * Specifies whether the toolbar responds to user interaction.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configures toolbar items.
      */
    var items: js.UndefOr[js.Array[DataGridPredefinedToolbarItem | ToolbarItem]] = js.undefined
    
    /**
      * Specifies whether the toolbar is visible.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object Toolbar {
    
    inline def apply(): Toolbar = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Toolbar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Toolbar] (val x: Self) extends AnyVal {
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setItems(value: js.Array[DataGridPredefinedToolbarItem | ToolbarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: (DataGridPredefinedToolbarItem | ToolbarItem)*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait ToolbarItem
    extends StObject
       with dxToolbarItem {
    
    /**
      * A name used to identify the toolbar item.
      */
    var name: js.UndefOr[DataGridPredefinedToolbarItem | String] = js.undefined
  }
  object ToolbarItem {
    
    inline def apply(): ToolbarItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarItem] (val x: Self) extends AnyVal {
      
      inline def setName(value: DataGridPredefinedToolbarItem | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait ToolbarPreparingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with ToolbarPreparingInfo
  object ToolbarPreparingEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      element: DxElement_[HTMLElement],
      toolbarOptions: dxToolbarOptions[Any, Any]
    ): ToolbarPreparingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], toolbarOptions = toolbarOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarPreparingEvent[TRowData, TKey]]
    }
  }
  
  trait ToolbarPreparingInfo extends StObject {
    
    var toolbarOptions: dxToolbarOptions[Any, Any]
  }
  object ToolbarPreparingInfo {
    
    inline def apply(toolbarOptions: dxToolbarOptions[Any, Any]): ToolbarPreparingInfo = {
      val __obj = js.Dynamic.literal(toolbarOptions = toolbarOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarPreparingInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarPreparingInfo] (val x: Self) extends AnyVal {
      
      inline def setToolbarOptions(value: dxToolbarOptions[Any, Any]): Self = StObject.set(x, "toolbarOptions", value.asInstanceOf[js.Any])
    }
  }
  
  trait dxDataGridSortByGroupSummaryInfoItem extends StObject {
    
    /**
      * Specifies the identifier of the column that must be used in grouping so that sorting by group summary item values be applied.
      */
    var groupColumn: js.UndefOr[String] = js.undefined
    
    /**
      * Specifies the sort order of group summary item values.
      */
    var sortOrder: js.UndefOr[SortOrder] = js.undefined
    
    /**
      * Specifies the group summary item whose values must be used to sort groups.
      */
    var summaryItem: js.UndefOr[String | Double] = js.undefined
  }
  object dxDataGridSortByGroupSummaryInfoItem {
    
    inline def apply(): dxDataGridSortByGroupSummaryInfoItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[dxDataGridSortByGroupSummaryInfoItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: dxDataGridSortByGroupSummaryInfoItem] (val x: Self) extends AnyVal {
      
      inline def setGroupColumn(value: String): Self = StObject.set(x, "groupColumn", value.asInstanceOf[js.Any])
      
      inline def setGroupColumnUndefined: Self = StObject.set(x, "groupColumn", js.undefined)
      
      inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
      
      inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
      
      inline def setSummaryItem(value: String | Double): Self = StObject.set(x, "summaryItem", value.asInstanceOf[js.Any])
      
      inline def setSummaryItemUndefined: Self = StObject.set(x, "summaryItem", js.undefined)
    }
  }
  
  type dxDataGridToolbar = Toolbar
  
  type dxDataGridToolbarItem = ToolbarItem
}
