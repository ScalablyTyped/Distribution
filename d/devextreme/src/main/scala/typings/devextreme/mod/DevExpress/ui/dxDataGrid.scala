package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StringDictionary
import typings.devextreme.anon.ComponentRow
import typings.devextreme.anon.Filtering
import typings.devextreme.devextremeStrings.pdf_
import typings.devextreme.devextremeStrings.xlsx
import typings.devextreme.mod.DevExpress.DOMComponent.OptionChangedEventInfo
import typings.devextreme.mod.DevExpress.common.Draggable
import typings.devextreme.mod.DevExpress.common.HorizontalAlignment
import typings.devextreme.mod.DevExpress.common.Mode
import typings.devextreme.mod.DevExpress.common.SelectAllMode
import typings.devextreme.mod.DevExpress.common.SortOrder
import typings.devextreme.mod.DevExpress.common.Sortable
import typings.devextreme.mod.DevExpress.common.grids.ColumnResizeMode
import typings.devextreme.mod.DevExpress.common.grids.GroupExpandMode
import typings.devextreme.mod.DevExpress.common.grids.NewRowPosition
import typings.devextreme.mod.DevExpress.common.grids.SelectionColumnDisplayMode
import typings.devextreme.mod.DevExpress.common.grids.SummaryType
import typings.devextreme.mod.DevExpress.core.DeepPartial
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.template
import typings.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextreme.mod.DevExpress.events.Cancelable
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.DxEvent
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.Column
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.Row
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
     with typings.devextreme.mod.DevExpress.common.grids.GridBase[TRowData, TKey] {
  
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
       with typings.devextreme.mod.DevExpress.common.grids.AdaptiveDetailRowPreparingInfo
  object AdaptiveDetailRowPreparingEvent {
    
    inline def apply[TRowData, TKey](component: dxDataGrid[TRowData, TKey], element: DxElement_[HTMLElement], formOptions: Any): AdaptiveDetailRowPreparingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], formOptions = formOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdaptiveDetailRowPreparingEvent[TRowData, TKey]]
    }
  }
  
  type AdaptiveDetailRowPreparingInfo = typings.devextreme.mod.DevExpress.common.grids.AdaptiveDetailRowPreparingInfo
  
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
  
  type ColumnBase[TRowData] = typings.devextreme.mod.DevExpress.common.grids.ColumnBase[TRowData]
  
  type ColumnButton[TRowData, TKey] = dxDataGridColumnButton[TRowData, TKey]
  
  type ColumnButtonBase = typings.devextreme.mod.DevExpress.common.grids.ColumnButtonBase
  
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
  
  type DataChange[TRowData, TKey] = typings.devextreme.mod.DevExpress.common.grids.DataChange[TRowData, TKey]
  
  type DataChangeInfo[TRowData, TKey] = typings.devextreme.mod.DevExpress.common.grids.DataChangeInfo[TRowData, TKey]
  
  trait DataErrorOccurredEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with typings.devextreme.mod.DevExpress.common.grids.DataErrorOccurredInfo
  object DataErrorOccurredEvent {
    
    inline def apply[TRowData, TKey](component: dxDataGrid[TRowData, TKey], element: DxElement_[HTMLElement]): DataErrorOccurredEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataErrorOccurredEvent[TRowData, TKey]]
    }
  }
  
  type DataErrorOccurredInfo = typings.devextreme.mod.DevExpress.common.grids.DataErrorOccurredInfo
  
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
  
  type DragDropInfo = typings.devextreme.mod.DevExpress.common.grids.DragDropInfo
  
  type DragReorderInfo = typings.devextreme.mod.DevExpress.common.grids.DragReorderInfo
  
  type DragStartEventInfo[TRowData] = typings.devextreme.mod.DevExpress.common.grids.DragStartEventInfo[TRowData]
  
  trait EditCanceledEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with typings.devextreme.mod.DevExpress.common.grids.DataChangeInfo[TRowData, TKey]
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
       with typings.devextreme.mod.DevExpress.common.grids.DataChangeInfo[TRowData, TKey]
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
       with typings.devextreme.mod.DevExpress.common.grids.EditingBase[TRowData, TKey] {
    
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
  
  type EditingBase[TRowData, TKey] = typings.devextreme.mod.DevExpress.common.grids.EditingBase[TRowData, TKey]
  
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
  
  type EditingTextsBase = typings.devextreme.mod.DevExpress.common.grids.EditingTextsBase
  
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
    
    var Export: typings.devextreme.mod.DevExpress.ui.dxDataGrid.Export
    
    var ExportTexts: typings.devextreme.mod.DevExpress.ui.dxDataGrid.ExportTexts
    
    var ExportingEvent: typings.devextreme.mod.DevExpress.ui.dxDataGrid.ExportingEvent[TRowData, TKey]
    
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
    
    var RowDraggingTemplateData: typings.devextreme.mod.DevExpress.common.grids.RowDraggingTemplateData[TRowData]
    
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
      Export: Export,
      ExportTexts: ExportTexts,
      ExportingEvent: ExportingEvent[TRowData, TKey],
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
      RowDraggingTemplateData: typings.devextreme.mod.DevExpress.common.grids.RowDraggingTemplateData[TRowData],
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
      val __obj = js.Dynamic.literal(AdaptiveDetailRowPreparingEvent = AdaptiveDetailRowPreparingEvent.asInstanceOf[js.Any], CellClickEvent = CellClickEvent.asInstanceOf[js.Any], CellDblClickEvent = CellDblClickEvent.asInstanceOf[js.Any], CellHoverChangedEvent = CellHoverChangedEvent.asInstanceOf[js.Any], CellPreparedEvent = CellPreparedEvent.asInstanceOf[js.Any], Column = Column.asInstanceOf[js.Any], ColumnButton = ColumnButton.asInstanceOf[js.Any], ColumnButtonClickEvent = ColumnButtonClickEvent.asInstanceOf[js.Any], ColumnButtonTemplateData = ColumnButtonTemplateData.asInstanceOf[js.Any], ColumnCellTemplateData = ColumnCellTemplateData.asInstanceOf[js.Any], ColumnEditCellTemplateData = ColumnEditCellTemplateData.asInstanceOf[js.Any], ColumnGroupCellTemplateData = ColumnGroupCellTemplateData.asInstanceOf[js.Any], ColumnHeaderCellTemplateData = ColumnHeaderCellTemplateData.asInstanceOf[js.Any], ContentReadyEvent = ContentReadyEvent.asInstanceOf[js.Any], ContextMenuPreparingEvent = ContextMenuPreparingEvent.asInstanceOf[js.Any], CustomSummaryInfo = CustomSummaryInfo.asInstanceOf[js.Any], DataErrorOccurredEvent = DataErrorOccurredEvent.asInstanceOf[js.Any], DataRowTemplateData = DataRowTemplateData.asInstanceOf[js.Any], DisposingEvent = DisposingEvent.asInstanceOf[js.Any], EditCanceledEvent = EditCanceledEvent.asInstanceOf[js.Any], EditCancelingEvent = EditCancelingEvent.asInstanceOf[js.Any], Editing = Editing.asInstanceOf[js.Any], EditingStartEvent = EditingStartEvent.asInstanceOf[js.Any], EditorPreparedEvent = EditorPreparedEvent.asInstanceOf[js.Any], EditorPreparingEvent = EditorPreparingEvent.asInstanceOf[js.Any], Export = Export.asInstanceOf[js.Any], ExportTexts = ExportTexts.asInstanceOf[js.Any], ExportingEvent = ExportingEvent.asInstanceOf[js.Any], FocusedCellChangedEvent = FocusedCellChangedEvent.asInstanceOf[js.Any], FocusedCellChangingEvent = FocusedCellChangingEvent.asInstanceOf[js.Any], FocusedRowChangedEvent = FocusedRowChangedEvent.asInstanceOf[js.Any], FocusedRowChangingEvent = FocusedRowChangingEvent.asInstanceOf[js.Any], GroupData = GroupData.asInstanceOf[js.Any], GroupPanel = GroupPanel.asInstanceOf[js.Any], Grouping = Grouping.asInstanceOf[js.Any], GroupingTexts = GroupingTexts.asInstanceOf[js.Any], InitNewRowEvent = InitNewRowEvent.asInstanceOf[js.Any], InitializedEvent = InitializedEvent.asInstanceOf[js.Any], KeyDownEvent = KeyDownEvent.asInstanceOf[js.Any], MasterDetail = MasterDetail.asInstanceOf[js.Any], MasterDetailTemplateData = MasterDetailTemplateData.asInstanceOf[js.Any], OptionChangedEvent = OptionChangedEvent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], Row = Row.asInstanceOf[js.Any], RowClickEvent = RowClickEvent.asInstanceOf[js.Any], RowCollapsedEvent = RowCollapsedEvent.asInstanceOf[js.Any], RowCollapsingEvent = RowCollapsingEvent.asInstanceOf[js.Any], RowDblClickEvent = RowDblClickEvent.asInstanceOf[js.Any], RowDraggingAddEvent = RowDraggingAddEvent.asInstanceOf[js.Any], RowDraggingChangeEvent = RowDraggingChangeEvent.asInstanceOf[js.Any], RowDraggingEndEvent = RowDraggingEndEvent.asInstanceOf[js.Any], RowDraggingMoveEvent = RowDraggingMoveEvent.asInstanceOf[js.Any], RowDraggingRemoveEvent = RowDraggingRemoveEvent.asInstanceOf[js.Any], RowDraggingReorderEvent = RowDraggingReorderEvent.asInstanceOf[js.Any], RowDraggingStartEvent = RowDraggingStartEvent.asInstanceOf[js.Any], RowDraggingTemplateData = RowDraggingTemplateData.asInstanceOf[js.Any], RowExpandedEvent = RowExpandedEvent.asInstanceOf[js.Any], RowExpandingEvent = RowExpandingEvent.asInstanceOf[js.Any], RowInsertedEvent = RowInsertedEvent.asInstanceOf[js.Any], RowInsertingEvent = RowInsertingEvent.asInstanceOf[js.Any], RowPreparedEvent = RowPreparedEvent.asInstanceOf[js.Any], RowRemovedEvent = RowRemovedEvent.asInstanceOf[js.Any], RowRemovingEvent = RowRemovingEvent.asInstanceOf[js.Any], RowTemplateData = RowTemplateData.asInstanceOf[js.Any], RowUpdatedEvent = RowUpdatedEvent.asInstanceOf[js.Any], RowUpdatingEvent = RowUpdatingEvent.asInstanceOf[js.Any], RowValidatingEvent = RowValidatingEvent.asInstanceOf[js.Any], SavedEvent = SavedEvent.asInstanceOf[js.Any], SavingEvent = SavingEvent.asInstanceOf[js.Any], Scrolling = Scrolling.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], SelectionChangedEvent = SelectionChangedEvent.asInstanceOf[js.Any], Summary = Summary.asInstanceOf[js.Any], SummaryGroupItem = SummaryGroupItem.asInstanceOf[js.Any], SummaryItemTextInfo = SummaryItemTextInfo.asInstanceOf[js.Any], SummaryTexts = SummaryTexts.asInstanceOf[js.Any], SummaryTotalItem = SummaryTotalItem.asInstanceOf[js.Any], Toolbar = Toolbar.asInstanceOf[js.Any], ToolbarItem = ToolbarItem.asInstanceOf[js.Any], ToolbarPreparingEvent = ToolbarPreparingEvent.asInstanceOf[js.Any])
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
      
      inline def setExport(value: Export): Self = StObject.set(x, "Export", value.asInstanceOf[js.Any])
      
      inline def setExportTexts(value: ExportTexts): Self = StObject.set(x, "ExportTexts", value.asInstanceOf[js.Any])
      
      inline def setExportingEvent(value: ExportingEvent[TRowData, TKey]): Self = StObject.set(x, "ExportingEvent", value.asInstanceOf[js.Any])
      
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
      
      inline def setRowDraggingTemplateData(value: typings.devextreme.mod.DevExpress.common.grids.RowDraggingTemplateData[TRowData]): Self = StObject.set(x, "RowDraggingTemplateData", value.asInstanceOf[js.Any])
      
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
  
  trait Export extends StObject {
    
    /**
      * Allows users to export selected rows only.
      */
    var allowExportSelectedData: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Adds the Export button to the DataGrid&apos;s toolbar.
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 
      */
    var formats: js.UndefOr[js.Array[xlsx | pdf_ | String]] = js.undefined
    
    /**
      * Configures the texts of export commands, buttons, and hints.
      */
    var texts: js.UndefOr[ExportTexts] = js.undefined
  }
  object Export {
    
    inline def apply(): Export = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Export]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Export] (val x: Self) extends AnyVal {
      
      inline def setAllowExportSelectedData(value: Boolean): Self = StObject.set(x, "allowExportSelectedData", value.asInstanceOf[js.Any])
      
      inline def setAllowExportSelectedDataUndefined: Self = StObject.set(x, "allowExportSelectedData", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setFormats(value: js.Array[xlsx | pdf_ | String]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
      
      inline def setFormatsUndefined: Self = StObject.set(x, "formats", js.undefined)
      
      inline def setFormatsVarargs(value: (xlsx | pdf_ | String)*): Self = StObject.set(x, "formats", js.Array(value*))
      
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
  
  type FilterPanel[TRowData, TKey] = typings.devextreme.mod.DevExpress.common.grids.FilterPanel[dxDataGrid[Any, Any], TRowData, TKey]
  
  type FilterPanelCustomizeTextArg = typings.devextreme.mod.DevExpress.common.grids.FilterPanelCustomizeTextArg[dxDataGrid[Any, Any]]
  
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
  
  type HeaderFilterGroupInterval = typings.devextreme.mod.DevExpress.common.grids.HeaderFilterGroupInterval
  
  type HeaderFilterTexts = typings.devextreme.mod.DevExpress.common.grids.HeaderFilterTexts
  
  trait InitNewRowEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with typings.devextreme.mod.DevExpress.common.grids.NewRowInfo[TRowData]
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
       with typings.devextreme.mod.DevExpress.common.grids.KeyDownInfo
  object KeyDownEvent {
    
    inline def apply[TRowData, TKey](component: dxDataGrid[TRowData, TKey], element: DxElement_[HTMLElement], handled: Boolean): KeyDownEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyDownEvent[TRowData, TKey]]
    }
  }
  
  type KeyDownInfo = typings.devextreme.mod.DevExpress.common.grids.KeyDownInfo
  
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
  
  type NewRowInfo[TRowData] = typings.devextreme.mod.DevExpress.common.grids.NewRowInfo[TRowData]
  
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
  
  type PagingBase = typings.devextreme.mod.DevExpress.common.grids.PagingBase
  
  /* Inlined devextreme.devextreme.DevExpress.ui.dxDataGridOptions<TRowData, TKey> */
  trait Properties[TRowData, TKey] extends StObject {
    
    var accessKey: js.UndefOr[String] = js.undefined
    
    var activeStateEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether a user can reorder columns.
      */
    var allowColumnReordering: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether a user can resize columns.
      */
    var allowColumnResizing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Automatically scrolls to the focused row when the focusedRowKey is changed.
      */
    var autoNavigateToFocusedRow: js.UndefOr[Boolean] = js.undefined
    
    var bindingOptions: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Specifies whether data should be cached.
      */
    var cacheEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enables a hint that appears when a user hovers the mouse pointer over a cell with truncated content.
      */
    var cellHintEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether columns should adjust their widths to the content.
      */
    var columnAutoWidth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configures the column chooser.
      */
    var columnChooser: js.UndefOr[typings.devextreme.mod.DevExpress.common.grids.ColumnChooser] = js.undefined
    
    /**
      * Configures column fixing.
      */
    var columnFixing: js.UndefOr[typings.devextreme.mod.DevExpress.common.grids.ColumnFixing] = js.undefined
    
    /**
      * Specifies whether the UI component should hide columns to adapt to the screen or container size. Ignored if allowColumnResizing is true and columnResizingMode is &apos;widget&apos;.
      */
    var columnHidingEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the minimum width of columns.
      */
    var columnMinWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies how the UI component resizes columns. Applies only if allowColumnResizing is true.
      */
    var columnResizingMode: js.UndefOr[ColumnResizeMode] = js.undefined
    
    /**
      * Specifies the width for all data columns. Has a lower priority than the column.width property.
      */
    var columnWidth: js.UndefOr[Double | Mode] = js.undefined
    
    /**
      * Overridden.
      */
    /**
      * An array of grid columns.
      */
    var columns: js.UndefOr[
        js.Array[typings.devextreme.mod.DevExpress.common.grids.ColumnBase[TRowData] | String]
      ] = js.undefined
    
    /**
      * Customizes columns after they are created.
      */
    var customizeColumns: js.UndefOr[js.Function1[/* columns */ js.Array[Column[TRowData, TKey]], Unit]] = js.undefined
    
    /**
      * Specifies a custom template for data rows.
      */
    var dataRowTemplate: js.UndefOr[
        template | (js.Function2[
          /* rowElement */ DxElement_[HTMLElement], 
          /* rowInfo */ DataRowTemplateData[TRowData, TKey], 
          Any
        ])
      ] = js.undefined
    
    /**
      * Binds the UI component to data.
      */
    var dataSource: js.UndefOr[(DataSourceLike[TRowData, TKey]) | Null] = js.undefined
    
    /**
      * Specifies the format in which date-time values should be sent to the server.
      */
    var dateSerializationFormat: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Overriden.
      */
    /**
      * Configures editing.
      */
    var editing: js.UndefOr[typings.devextreme.mod.DevExpress.common.grids.EditingBase[TRowData, TKey]] = js.undefined
    
    var elementAttr: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Indicates whether to show the error row.
      */
    var errorRowEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configures client-side exporting.
      */
    var `export`: js.UndefOr[Export] = js.undefined
    
    /**
      * Configures the integrated filter builder.
      */
    var filterBuilder: js.UndefOr[typings.devextreme.mod.DevExpress.ui.dxFilterBuilder.Properties] = js.undefined
    
    /**
      * Configures the popup in which the integrated filter builder is shown.
      */
    var filterBuilderPopup: js.UndefOr[typings.devextreme.mod.DevExpress.ui.dxPopup.Properties] = js.undefined
    
    /**
      * Configures the filter panel.
      */
    var filterPanel: js.UndefOr[
        typings.devextreme.mod.DevExpress.common.grids.FilterPanel[dxDataGrid[TRowData, TKey], TRowData, TKey]
      ] = js.undefined
    
    /**
      * Configures the filter row.
      */
    var filterRow: js.UndefOr[typings.devextreme.mod.DevExpress.common.grids.FilterRow] = js.undefined
    
    /**
      * Specifies whether to synchronize the filter row, header filter, and filter builder. The synchronized filter expression is stored in the filterValue property.
      */
    var filterSyncEnabled: js.UndefOr[Boolean | Mode] = js.undefined
    
    /**
      * Specifies a filter expression.
      */
    var filterValue: js.UndefOr[String | js.Array[Any] | js.Function] = js.undefined
    
    /**
      * The index of the column that contains the focused data cell. This index is taken from the columns array.
      */
    var focusedColumnIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies whether the focused row feature is enabled.
      */
    var focusedRowEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies or indicates the focused data row&apos;s index.
      */
    var focusedRowIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Specifies initially or currently focused grid row&apos;s key.
      */
    var focusedRowKey: js.UndefOr[TKey] = js.undefined
    
    /**
      * Configures the group panel.
      */
    var groupPanel: js.UndefOr[GroupPanel] = js.undefined
    
    /**
      * Configures grouping.
      */
    var grouping: js.UndefOr[Grouping] = js.undefined
    
    /**
      * Configures the header filter feature.
      */
    var headerFilter: js.UndefOr[typings.devextreme.mod.DevExpress.common.grids.HeaderFilter] = js.undefined
    
    var height: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
    
    /**
      * Specifies whether to highlight rows and cells with edited data. repaintChangesOnly should be true.
      */
    var highlightChanges: js.UndefOr[Boolean] = js.undefined
    
    var hint: js.UndefOr[String] = js.undefined
    
    var hoverStateEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the key property (or properties) that provide(s) key values to access data items. Each key value must be unique. This property applies only if data is a simple array.
      */
    var keyExpr: js.UndefOr[String | js.Array[String]] = js.undefined
    
    /**
      * Configures keyboard navigation.
      */
    var keyboardNavigation: js.UndefOr[typings.devextreme.mod.DevExpress.common.grids.KeyboardNavigation] = js.undefined
    
    /**
      * Configures the load panel.
      */
    var loadPanel: js.UndefOr[typings.devextreme.mod.DevExpress.common.grids.LoadPanel] = js.undefined
    
    /**
      * Allows you to build a master-detail interface in the grid.
      */
    var masterDetail: js.UndefOr[MasterDetail[TRowData, TKey]] = js.undefined
    
    /**
      * Specifies a text string shown when the widget does not display any data.
      */
    var noDataText: js.UndefOr[String] = js.undefined
    
    /**
      * A function that is executed before an adaptive detail row is rendered.
      */
    var onAdaptiveDetailRowPreparing: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & typings.devextreme.mod.DevExpress.common.grids.AdaptiveDetailRowPreparingInfo, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed when a cell is clicked or tapped. Executed before onRowClick.
      */
    var onCellClick: js.UndefOr[js.Function1[/* e */ CellClickEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is executed when a cell is double-clicked or double-tapped. Executed before onRowDblClick.
      */
    var onCellDblClick: js.UndefOr[js.Function1[/* e */ CellDblClickEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is executed after the pointer enters or leaves a cell.
      */
    var onCellHoverChanged: js.UndefOr[js.Function1[/* e */ CellHoverChangedEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is executed after a grid cell is created.
      */
    var onCellPrepared: js.UndefOr[js.Function1[/* e */ CellPreparedEvent[TRowData, TKey], Unit]] = js.undefined
    
    var onContentReady: js.UndefOr[js.Function1[/* e */ EventInfo[dxDataGrid[TRowData, TKey]], Unit]] = js.undefined
    
    /**
      * A function that is executed before the context menu is rendered.
      */
    var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ ContextMenuPreparingEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is executed when an error occurs in the data source.
      */
    var onDataErrorOccurred: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & typings.devextreme.mod.DevExpress.common.grids.DataErrorOccurredInfo, 
          Unit
        ]
      ] = js.undefined
    
    var onDisposing: js.UndefOr[js.Function1[/* e */ EventInfo[dxDataGrid[TRowData, TKey]], Unit]] = js.undefined
    
    /**
      * A function that is executed after row changes are discarded.
      */
    var onEditCanceled: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.DataChangeInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed when the edit operation is canceled, but row changes are not yet discarded.
      */
    var onEditCanceling: js.UndefOr[
        js.Function1[
          /* e */ Cancelable & (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.DataChangeInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed before a cell or row switches to the editing state.
      */
    var onEditingStart: js.UndefOr[js.Function1[/* e */ EditingStartEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is executed after an editor is created. Not executed for cells with an editCellTemplate.
      */
    var onEditorPrepared: js.UndefOr[js.Function1[/* options */ EditorPreparedEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function used to customize a cell&apos;s editor. Not executed for cells with an editCellTemplate.
      */
    var onEditorPreparing: js.UndefOr[js.Function1[/* e */ EditorPreparingEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is executed before data is exported.
      */
    var onExporting: js.UndefOr[js.Function1[/* e */ ExportingEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is executed after the focused cell changes. Applies only to cells in data or group rows.
      */
    var onFocusedCellChanged: js.UndefOr[js.Function1[/* e */ FocusedCellChangedEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is executed before the focused cell changes. Applies only to cells in data or group rows.
      */
    var onFocusedCellChanging: js.UndefOr[js.Function1[/* e */ FocusedCellChangingEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is executed after the focused row changes. Applies only to data or group rows. focusedRowEnabled should be true.
      */
    var onFocusedRowChanged: js.UndefOr[js.Function1[/* e */ FocusedRowChangedEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is executed before the focused row changes. Applies only to data or group rows. focusedRowEnabled should be true.
      */
    var onFocusedRowChanging: js.UndefOr[js.Function1[/* e */ FocusedRowChangingEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is executed before a new row is added to the UI component.
      */
    var onInitNewRow: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & typings.devextreme.mod.DevExpress.common.grids.NewRowInfo[TRowData], 
          Unit
        ]
      ] = js.undefined
    
    var onInitialized: js.UndefOr[js.Function1[/* e */ InitializedEventInfo[dxDataGrid[TRowData, TKey]], Unit]] = js.undefined
    
    /**
      * A function that is executed when the UI component is in focus and a key has been pressed down.
      */
    var onKeyDown: js.UndefOr[
        js.Function1[
          /* e */ (NativeEventInfo[dxDataGrid[TRowData, TKey], KeyboardEvent]) & typings.devextreme.mod.DevExpress.common.grids.KeyDownInfo, 
          Unit
        ]
      ] = js.undefined
    
    var onOptionChanged: js.UndefOr[js.Function1[/* e */ OptionChangedEventInfo[dxDataGrid[TRowData, TKey]], Unit]] = js.undefined
    
    /**
      * A function that is executed when a row is clicked or tapped.
      */
    var onRowClick: js.UndefOr[js.Function1[/* e */ RowClickEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is executed after a row is collapsed.
      */
    var onRowCollapsed: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & typings.devextreme.mod.DevExpress.common.grids.RowKeyInfo[TKey], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed before a row is collapsed.
      */
    var onRowCollapsing: js.UndefOr[
        js.Function1[
          /* e */ Cancelable & (EventInfo[dxDataGrid[TRowData, TKey]]) & typings.devextreme.mod.DevExpress.common.grids.RowKeyInfo[TKey], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed when a row is double-clicked or double-tapped. Executed after onCellDblClick.
      */
    var onRowDblClick: js.UndefOr[js.Function1[/* e */ RowDblClickEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is executed after a row is expanded.
      */
    var onRowExpanded: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & typings.devextreme.mod.DevExpress.common.grids.RowKeyInfo[TKey], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed before a row is expanded.
      */
    var onRowExpanding: js.UndefOr[
        js.Function1[
          /* e */ Cancelable & (EventInfo[dxDataGrid[TRowData, TKey]]) & typings.devextreme.mod.DevExpress.common.grids.RowKeyInfo[TKey], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed after a new row has been inserted into the data source.
      */
    var onRowInserted: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.RowInsertedInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed before a new row is inserted into the data source.
      */
    var onRowInserting: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & typings.devextreme.mod.DevExpress.common.grids.RowInsertingInfo[TRowData], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed after a row is created.
      */
    var onRowPrepared: js.UndefOr[js.Function1[/* e */ RowPreparedEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is executed after a row has been removed from the data source.
      */
    var onRowRemoved: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.RowRemovedInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed before a row is removed from the data source.
      */
    var onRowRemoving: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.RowRemovingInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed after a row has been updated in the data source.
      */
    var onRowUpdated: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.RowUpdatedInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed before a row is updated in the data source.
      */
    var onRowUpdating: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.RowUpdatingInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed after cells in a row are validated against validation rules.
      */
    var onRowValidating: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.RowValidatingInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed after row changes are saved.
      */
    var onSaved: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.DataChangeInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed before pending row changes are saved.
      */
    var onSaving: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.SavingInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed after selecting a row or clearing its selection.
      */
    var onSelectionChanged: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.SelectionChangedInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed before the toolbar is created.
      */
    var onToolbarPreparing: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & typings.devextreme.mod.DevExpress.common.grids.ToolbarPreparingInfo, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * Configures the pager.
      */
    var pager: js.UndefOr[typings.devextreme.mod.DevExpress.common.grids.Pager] = js.undefined
    
    /**
      * Configures paging.
      */
    var paging: js.UndefOr[typings.devextreme.mod.DevExpress.common.grids.PagingBase] = js.undefined
    
    /**
      * Notifies the DataGrid of the server&apos;s data processing operations.
      */
    var remoteOperations: js.UndefOr[Boolean | Filtering | Mode] = js.undefined
    
    /**
      * Specifies whether to render the filter row, command columns, and columns with showEditorAlways set to true after other elements.
      */
    var renderAsync: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether to repaint only those cells whose data changed.
      */
    var repaintChangesOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether rows should be shaded differently.
      */
    var rowAlternationEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configures row reordering using drag and drop gestures.
      */
    var rowDragging: js.UndefOr[
        typings.devextreme.mod.DevExpress.common.grids.RowDragging[dxDataGrid[TRowData, TKey], TRowData, TKey]
      ] = js.undefined
    
    /**
      * Specifies a custom template for rows.
      * @deprecated 
      */
    var rowTemplate: js.UndefOr[
        template | (js.Function2[
          /* rowElement */ DxElement_[HTMLElement], 
          /* rowInfo */ RowTemplateData[TRowData, TKey], 
          Any
        ])
      ] = js.undefined
    
    var rtlEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 
      */
    /**
      * Configures scrolling.
      */
    var scrolling: js.UndefOr[typings.devextreme.mod.DevExpress.common.grids.ScrollingBase] = js.undefined
    
    /**
      * Configures the search panel.
      */
    var searchPanel: js.UndefOr[typings.devextreme.mod.DevExpress.common.grids.SearchPanel] = js.undefined
    
    /**
      * Allows you to select rows or determine which rows are selected.
      */
    var selectedRowKeys: js.UndefOr[js.Array[TKey]] = js.undefined
    
    /**
      * 
      */
    /**
      * Configures runtime selection.
      */
    var selection: js.UndefOr[typings.devextreme.mod.DevExpress.common.grids.SelectionBase] = js.undefined
    
    /**
      * Specifies filters for the rows that must be selected initially. Applies only if selection.deferred is true.
      */
    var selectionFilter: js.UndefOr[String | js.Array[Any] | js.Function] = js.undefined
    
    /**
      * Specifies whether the outer borders of the UI component are visible.
      */
    var showBorders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether column headers are visible.
      */
    var showColumnHeaders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether vertical lines that separate one column from another are visible.
      */
    var showColumnLines: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether horizontal lines that separate one row from another are visible.
      */
    var showRowLines: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allows you to sort groups according to the values of group summary items.
      */
    var sortByGroupSummaryInfo: js.UndefOr[js.Array[dxDataGridSortByGroupSummaryInfoItem]] = js.undefined
    
    /**
      * Configures runtime sorting.
      */
    var sorting: js.UndefOr[typings.devextreme.mod.DevExpress.common.grids.Sorting] = js.undefined
    
    /**
      * Configures state storing.
      */
    var stateStoring: js.UndefOr[typings.devextreme.mod.DevExpress.common.grids.StateStoring] = js.undefined
    
    /**
      * Specifies the properties of the grid summary.
      */
    var summary: js.UndefOr[Summary[TRowData, TKey]] = js.undefined
    
    /**
      * 
      */
    var syncLookupFilterValues: js.UndefOr[Boolean] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Configures the toolbar.
      */
    var toolbar: js.UndefOr[Toolbar] = js.undefined
    
    /**
      * Specifies whether to enable two-way data binding.
      */
    var twoWayBindingEnabled: js.UndefOr[Boolean] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
    
    /**
      * Specifies whether text that does not fit into a column should be wrapped.
      */
    var wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object Properties {
    
    inline def apply[TRowData, TKey](): Properties[TRowData, TKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Properties[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Properties[?, ?], TRowData, TKey] (val x: Self & (Properties[TRowData, TKey])) extends AnyVal {
      
      inline def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      inline def setActiveStateEnabled(value: Boolean): Self = StObject.set(x, "activeStateEnabled", value.asInstanceOf[js.Any])
      
      inline def setActiveStateEnabledUndefined: Self = StObject.set(x, "activeStateEnabled", js.undefined)
      
      inline def setAllowColumnReordering(value: Boolean): Self = StObject.set(x, "allowColumnReordering", value.asInstanceOf[js.Any])
      
      inline def setAllowColumnReorderingUndefined: Self = StObject.set(x, "allowColumnReordering", js.undefined)
      
      inline def setAllowColumnResizing(value: Boolean): Self = StObject.set(x, "allowColumnResizing", value.asInstanceOf[js.Any])
      
      inline def setAllowColumnResizingUndefined: Self = StObject.set(x, "allowColumnResizing", js.undefined)
      
      inline def setAutoNavigateToFocusedRow(value: Boolean): Self = StObject.set(x, "autoNavigateToFocusedRow", value.asInstanceOf[js.Any])
      
      inline def setAutoNavigateToFocusedRowUndefined: Self = StObject.set(x, "autoNavigateToFocusedRow", js.undefined)
      
      inline def setBindingOptions(value: StringDictionary[Any]): Self = StObject.set(x, "bindingOptions", value.asInstanceOf[js.Any])
      
      inline def setBindingOptionsUndefined: Self = StObject.set(x, "bindingOptions", js.undefined)
      
      inline def setCacheEnabled(value: Boolean): Self = StObject.set(x, "cacheEnabled", value.asInstanceOf[js.Any])
      
      inline def setCacheEnabledUndefined: Self = StObject.set(x, "cacheEnabled", js.undefined)
      
      inline def setCellHintEnabled(value: Boolean): Self = StObject.set(x, "cellHintEnabled", value.asInstanceOf[js.Any])
      
      inline def setCellHintEnabledUndefined: Self = StObject.set(x, "cellHintEnabled", js.undefined)
      
      inline def setColumnAutoWidth(value: Boolean): Self = StObject.set(x, "columnAutoWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnAutoWidthUndefined: Self = StObject.set(x, "columnAutoWidth", js.undefined)
      
      inline def setColumnChooser(value: typings.devextreme.mod.DevExpress.common.grids.ColumnChooser): Self = StObject.set(x, "columnChooser", value.asInstanceOf[js.Any])
      
      inline def setColumnChooserUndefined: Self = StObject.set(x, "columnChooser", js.undefined)
      
      inline def setColumnFixing(value: typings.devextreme.mod.DevExpress.common.grids.ColumnFixing): Self = StObject.set(x, "columnFixing", value.asInstanceOf[js.Any])
      
      inline def setColumnFixingUndefined: Self = StObject.set(x, "columnFixing", js.undefined)
      
      inline def setColumnHidingEnabled(value: Boolean): Self = StObject.set(x, "columnHidingEnabled", value.asInstanceOf[js.Any])
      
      inline def setColumnHidingEnabledUndefined: Self = StObject.set(x, "columnHidingEnabled", js.undefined)
      
      inline def setColumnMinWidth(value: Double): Self = StObject.set(x, "columnMinWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnMinWidthUndefined: Self = StObject.set(x, "columnMinWidth", js.undefined)
      
      inline def setColumnResizingMode(value: ColumnResizeMode): Self = StObject.set(x, "columnResizingMode", value.asInstanceOf[js.Any])
      
      inline def setColumnResizingModeUndefined: Self = StObject.set(x, "columnResizingMode", js.undefined)
      
      inline def setColumnWidth(value: Double | Mode): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setColumns(value: js.Array[typings.devextreme.mod.DevExpress.common.grids.ColumnBase[TRowData] | String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: (typings.devextreme.mod.DevExpress.common.grids.ColumnBase[TRowData] | String)*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setCustomizeColumns(value: /* columns */ js.Array[Column[TRowData, TKey]] => Unit): Self = StObject.set(x, "customizeColumns", js.Any.fromFunction1(value))
      
      inline def setCustomizeColumnsUndefined: Self = StObject.set(x, "customizeColumns", js.undefined)
      
      inline def setDataRowTemplate(
        value: template | (js.Function2[
              /* rowElement */ DxElement_[HTMLElement], 
              /* rowInfo */ DataRowTemplateData[TRowData, TKey], 
              Any
            ])
      ): Self = StObject.set(x, "dataRowTemplate", value.asInstanceOf[js.Any])
      
      inline def setDataRowTemplateFunction2(
        value: (/* rowElement */ DxElement_[HTMLElement], /* rowInfo */ DataRowTemplateData[TRowData, TKey]) => Any
      ): Self = StObject.set(x, "dataRowTemplate", js.Any.fromFunction2(value))
      
      inline def setDataRowTemplateUndefined: Self = StObject.set(x, "dataRowTemplate", js.undefined)
      
      inline def setDataSource(value: DataSourceLike[TRowData, TKey]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDataSourceVarargs(value: TRowData*): Self = StObject.set(x, "dataSource", js.Array(value*))
      
      inline def setDateSerializationFormat(value: String): Self = StObject.set(x, "dateSerializationFormat", value.asInstanceOf[js.Any])
      
      inline def setDateSerializationFormatUndefined: Self = StObject.set(x, "dateSerializationFormat", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEditing(value: typings.devextreme.mod.DevExpress.common.grids.EditingBase[TRowData, TKey]): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
      
      inline def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
      
      inline def setElementAttr(value: StringDictionary[Any]): Self = StObject.set(x, "elementAttr", value.asInstanceOf[js.Any])
      
      inline def setElementAttrUndefined: Self = StObject.set(x, "elementAttr", js.undefined)
      
      inline def setErrorRowEnabled(value: Boolean): Self = StObject.set(x, "errorRowEnabled", value.asInstanceOf[js.Any])
      
      inline def setErrorRowEnabledUndefined: Self = StObject.set(x, "errorRowEnabled", js.undefined)
      
      inline def setExport(value: Export): Self = StObject.set(x, "export", value.asInstanceOf[js.Any])
      
      inline def setExportUndefined: Self = StObject.set(x, "export", js.undefined)
      
      inline def setFilterBuilder(value: typings.devextreme.mod.DevExpress.ui.dxFilterBuilder.Properties): Self = StObject.set(x, "filterBuilder", value.asInstanceOf[js.Any])
      
      inline def setFilterBuilderPopup(value: typings.devextreme.mod.DevExpress.ui.dxPopup.Properties): Self = StObject.set(x, "filterBuilderPopup", value.asInstanceOf[js.Any])
      
      inline def setFilterBuilderPopupUndefined: Self = StObject.set(x, "filterBuilderPopup", js.undefined)
      
      inline def setFilterBuilderUndefined: Self = StObject.set(x, "filterBuilder", js.undefined)
      
      inline def setFilterPanel(
        value: typings.devextreme.mod.DevExpress.common.grids.FilterPanel[dxDataGrid[TRowData, TKey], TRowData, TKey]
      ): Self = StObject.set(x, "filterPanel", value.asInstanceOf[js.Any])
      
      inline def setFilterPanelUndefined: Self = StObject.set(x, "filterPanel", js.undefined)
      
      inline def setFilterRow(value: typings.devextreme.mod.DevExpress.common.grids.FilterRow): Self = StObject.set(x, "filterRow", value.asInstanceOf[js.Any])
      
      inline def setFilterRowUndefined: Self = StObject.set(x, "filterRow", js.undefined)
      
      inline def setFilterSyncEnabled(value: Boolean | Mode): Self = StObject.set(x, "filterSyncEnabled", value.asInstanceOf[js.Any])
      
      inline def setFilterSyncEnabledUndefined: Self = StObject.set(x, "filterSyncEnabled", js.undefined)
      
      inline def setFilterValue(value: String | js.Array[Any] | js.Function): Self = StObject.set(x, "filterValue", value.asInstanceOf[js.Any])
      
      inline def setFilterValueUndefined: Self = StObject.set(x, "filterValue", js.undefined)
      
      inline def setFilterValueVarargs(value: Any*): Self = StObject.set(x, "filterValue", js.Array(value*))
      
      inline def setFocusedColumnIndex(value: Double): Self = StObject.set(x, "focusedColumnIndex", value.asInstanceOf[js.Any])
      
      inline def setFocusedColumnIndexUndefined: Self = StObject.set(x, "focusedColumnIndex", js.undefined)
      
      inline def setFocusedRowEnabled(value: Boolean): Self = StObject.set(x, "focusedRowEnabled", value.asInstanceOf[js.Any])
      
      inline def setFocusedRowEnabledUndefined: Self = StObject.set(x, "focusedRowEnabled", js.undefined)
      
      inline def setFocusedRowIndex(value: Double): Self = StObject.set(x, "focusedRowIndex", value.asInstanceOf[js.Any])
      
      inline def setFocusedRowIndexUndefined: Self = StObject.set(x, "focusedRowIndex", js.undefined)
      
      inline def setFocusedRowKey(value: TKey): Self = StObject.set(x, "focusedRowKey", value.asInstanceOf[js.Any])
      
      inline def setFocusedRowKeyUndefined: Self = StObject.set(x, "focusedRowKey", js.undefined)
      
      inline def setGroupPanel(value: GroupPanel): Self = StObject.set(x, "groupPanel", value.asInstanceOf[js.Any])
      
      inline def setGroupPanelUndefined: Self = StObject.set(x, "groupPanel", js.undefined)
      
      inline def setGrouping(value: Grouping): Self = StObject.set(x, "grouping", value.asInstanceOf[js.Any])
      
      inline def setGroupingUndefined: Self = StObject.set(x, "grouping", js.undefined)
      
      inline def setHeaderFilter(value: typings.devextreme.mod.DevExpress.common.grids.HeaderFilter): Self = StObject.set(x, "headerFilter", value.asInstanceOf[js.Any])
      
      inline def setHeaderFilterUndefined: Self = StObject.set(x, "headerFilter", js.undefined)
      
      inline def setHeight(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightFunction0(value: () => Double | String): Self = StObject.set(x, "height", js.Any.fromFunction0(value))
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHighlightChanges(value: Boolean): Self = StObject.set(x, "highlightChanges", value.asInstanceOf[js.Any])
      
      inline def setHighlightChangesUndefined: Self = StObject.set(x, "highlightChanges", js.undefined)
      
      inline def setHint(value: String): Self = StObject.set(x, "hint", value.asInstanceOf[js.Any])
      
      inline def setHintUndefined: Self = StObject.set(x, "hint", js.undefined)
      
      inline def setHoverStateEnabled(value: Boolean): Self = StObject.set(x, "hoverStateEnabled", value.asInstanceOf[js.Any])
      
      inline def setHoverStateEnabledUndefined: Self = StObject.set(x, "hoverStateEnabled", js.undefined)
      
      inline def setKeyExpr(value: String | js.Array[String]): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
      
      inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
      
      inline def setKeyExprVarargs(value: String*): Self = StObject.set(x, "keyExpr", js.Array(value*))
      
      inline def setKeyboardNavigation(value: typings.devextreme.mod.DevExpress.common.grids.KeyboardNavigation): Self = StObject.set(x, "keyboardNavigation", value.asInstanceOf[js.Any])
      
      inline def setKeyboardNavigationUndefined: Self = StObject.set(x, "keyboardNavigation", js.undefined)
      
      inline def setLoadPanel(value: typings.devextreme.mod.DevExpress.common.grids.LoadPanel): Self = StObject.set(x, "loadPanel", value.asInstanceOf[js.Any])
      
      inline def setLoadPanelUndefined: Self = StObject.set(x, "loadPanel", js.undefined)
      
      inline def setMasterDetail(value: MasterDetail[TRowData, TKey]): Self = StObject.set(x, "masterDetail", value.asInstanceOf[js.Any])
      
      inline def setMasterDetailUndefined: Self = StObject.set(x, "masterDetail", js.undefined)
      
      inline def setNoDataText(value: String): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
      
      inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
      
      inline def setOnAdaptiveDetailRowPreparing(
        value: /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & typings.devextreme.mod.DevExpress.common.grids.AdaptiveDetailRowPreparingInfo => Unit
      ): Self = StObject.set(x, "onAdaptiveDetailRowPreparing", js.Any.fromFunction1(value))
      
      inline def setOnAdaptiveDetailRowPreparingUndefined: Self = StObject.set(x, "onAdaptiveDetailRowPreparing", js.undefined)
      
      inline def setOnCellClick(value: /* e */ CellClickEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction1(value))
      
      inline def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
      
      inline def setOnCellDblClick(value: /* e */ CellDblClickEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onCellDblClick", js.Any.fromFunction1(value))
      
      inline def setOnCellDblClickUndefined: Self = StObject.set(x, "onCellDblClick", js.undefined)
      
      inline def setOnCellHoverChanged(value: /* e */ CellHoverChangedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onCellHoverChanged", js.Any.fromFunction1(value))
      
      inline def setOnCellHoverChangedUndefined: Self = StObject.set(x, "onCellHoverChanged", js.undefined)
      
      inline def setOnCellPrepared(value: /* e */ CellPreparedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onCellPrepared", js.Any.fromFunction1(value))
      
      inline def setOnCellPreparedUndefined: Self = StObject.set(x, "onCellPrepared", js.undefined)
      
      inline def setOnContentReady(value: /* e */ EventInfo[dxDataGrid[TRowData, TKey]] => Unit): Self = StObject.set(x, "onContentReady", js.Any.fromFunction1(value))
      
      inline def setOnContentReadyUndefined: Self = StObject.set(x, "onContentReady", js.undefined)
      
      inline def setOnContextMenuPreparing(value: /* e */ ContextMenuPreparingEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onContextMenuPreparing", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuPreparingUndefined: Self = StObject.set(x, "onContextMenuPreparing", js.undefined)
      
      inline def setOnDataErrorOccurred(
        value: /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & typings.devextreme.mod.DevExpress.common.grids.DataErrorOccurredInfo => Unit
      ): Self = StObject.set(x, "onDataErrorOccurred", js.Any.fromFunction1(value))
      
      inline def setOnDataErrorOccurredUndefined: Self = StObject.set(x, "onDataErrorOccurred", js.undefined)
      
      inline def setOnDisposing(value: /* e */ EventInfo[dxDataGrid[TRowData, TKey]] => Unit): Self = StObject.set(x, "onDisposing", js.Any.fromFunction1(value))
      
      inline def setOnDisposingUndefined: Self = StObject.set(x, "onDisposing", js.undefined)
      
      inline def setOnEditCanceled(
        value: /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.DataChangeInfo[TRowData, TKey]) => Unit
      ): Self = StObject.set(x, "onEditCanceled", js.Any.fromFunction1(value))
      
      inline def setOnEditCanceledUndefined: Self = StObject.set(x, "onEditCanceled", js.undefined)
      
      inline def setOnEditCanceling(
        value: /* e */ Cancelable & (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.DataChangeInfo[TRowData, TKey]) => Unit
      ): Self = StObject.set(x, "onEditCanceling", js.Any.fromFunction1(value))
      
      inline def setOnEditCancelingUndefined: Self = StObject.set(x, "onEditCanceling", js.undefined)
      
      inline def setOnEditingStart(value: /* e */ EditingStartEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onEditingStart", js.Any.fromFunction1(value))
      
      inline def setOnEditingStartUndefined: Self = StObject.set(x, "onEditingStart", js.undefined)
      
      inline def setOnEditorPrepared(value: /* options */ EditorPreparedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onEditorPrepared", js.Any.fromFunction1(value))
      
      inline def setOnEditorPreparedUndefined: Self = StObject.set(x, "onEditorPrepared", js.undefined)
      
      inline def setOnEditorPreparing(value: /* e */ EditorPreparingEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onEditorPreparing", js.Any.fromFunction1(value))
      
      inline def setOnEditorPreparingUndefined: Self = StObject.set(x, "onEditorPreparing", js.undefined)
      
      inline def setOnExporting(value: /* e */ ExportingEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onExporting", js.Any.fromFunction1(value))
      
      inline def setOnExportingUndefined: Self = StObject.set(x, "onExporting", js.undefined)
      
      inline def setOnFocusedCellChanged(value: /* e */ FocusedCellChangedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onFocusedCellChanged", js.Any.fromFunction1(value))
      
      inline def setOnFocusedCellChangedUndefined: Self = StObject.set(x, "onFocusedCellChanged", js.undefined)
      
      inline def setOnFocusedCellChanging(value: /* e */ FocusedCellChangingEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onFocusedCellChanging", js.Any.fromFunction1(value))
      
      inline def setOnFocusedCellChangingUndefined: Self = StObject.set(x, "onFocusedCellChanging", js.undefined)
      
      inline def setOnFocusedRowChanged(value: /* e */ FocusedRowChangedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onFocusedRowChanged", js.Any.fromFunction1(value))
      
      inline def setOnFocusedRowChangedUndefined: Self = StObject.set(x, "onFocusedRowChanged", js.undefined)
      
      inline def setOnFocusedRowChanging(value: /* e */ FocusedRowChangingEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onFocusedRowChanging", js.Any.fromFunction1(value))
      
      inline def setOnFocusedRowChangingUndefined: Self = StObject.set(x, "onFocusedRowChanging", js.undefined)
      
      inline def setOnInitNewRow(
        value: /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & typings.devextreme.mod.DevExpress.common.grids.NewRowInfo[TRowData] => Unit
      ): Self = StObject.set(x, "onInitNewRow", js.Any.fromFunction1(value))
      
      inline def setOnInitNewRowUndefined: Self = StObject.set(x, "onInitNewRow", js.undefined)
      
      inline def setOnInitialized(value: /* e */ InitializedEventInfo[dxDataGrid[TRowData, TKey]] => Unit): Self = StObject.set(x, "onInitialized", js.Any.fromFunction1(value))
      
      inline def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
      
      inline def setOnKeyDown(
        value: /* e */ (NativeEventInfo[dxDataGrid[TRowData, TKey], KeyboardEvent]) & typings.devextreme.mod.DevExpress.common.grids.KeyDownInfo => Unit
      ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnOptionChanged(value: /* e */ OptionChangedEventInfo[dxDataGrid[TRowData, TKey]] => Unit): Self = StObject.set(x, "onOptionChanged", js.Any.fromFunction1(value))
      
      inline def setOnOptionChangedUndefined: Self = StObject.set(x, "onOptionChanged", js.undefined)
      
      inline def setOnRowClick(value: /* e */ RowClickEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction1(value))
      
      inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
      
      inline def setOnRowCollapsed(
        value: /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & typings.devextreme.mod.DevExpress.common.grids.RowKeyInfo[TKey] => Unit
      ): Self = StObject.set(x, "onRowCollapsed", js.Any.fromFunction1(value))
      
      inline def setOnRowCollapsedUndefined: Self = StObject.set(x, "onRowCollapsed", js.undefined)
      
      inline def setOnRowCollapsing(
        value: /* e */ Cancelable & (EventInfo[dxDataGrid[TRowData, TKey]]) & typings.devextreme.mod.DevExpress.common.grids.RowKeyInfo[TKey] => Unit
      ): Self = StObject.set(x, "onRowCollapsing", js.Any.fromFunction1(value))
      
      inline def setOnRowCollapsingUndefined: Self = StObject.set(x, "onRowCollapsing", js.undefined)
      
      inline def setOnRowDblClick(value: /* e */ RowDblClickEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onRowDblClick", js.Any.fromFunction1(value))
      
      inline def setOnRowDblClickUndefined: Self = StObject.set(x, "onRowDblClick", js.undefined)
      
      inline def setOnRowExpanded(
        value: /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & typings.devextreme.mod.DevExpress.common.grids.RowKeyInfo[TKey] => Unit
      ): Self = StObject.set(x, "onRowExpanded", js.Any.fromFunction1(value))
      
      inline def setOnRowExpandedUndefined: Self = StObject.set(x, "onRowExpanded", js.undefined)
      
      inline def setOnRowExpanding(
        value: /* e */ Cancelable & (EventInfo[dxDataGrid[TRowData, TKey]]) & typings.devextreme.mod.DevExpress.common.grids.RowKeyInfo[TKey] => Unit
      ): Self = StObject.set(x, "onRowExpanding", js.Any.fromFunction1(value))
      
      inline def setOnRowExpandingUndefined: Self = StObject.set(x, "onRowExpanding", js.undefined)
      
      inline def setOnRowInserted(
        value: /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.RowInsertedInfo[TRowData, TKey]) => Unit
      ): Self = StObject.set(x, "onRowInserted", js.Any.fromFunction1(value))
      
      inline def setOnRowInsertedUndefined: Self = StObject.set(x, "onRowInserted", js.undefined)
      
      inline def setOnRowInserting(
        value: /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & typings.devextreme.mod.DevExpress.common.grids.RowInsertingInfo[TRowData] => Unit
      ): Self = StObject.set(x, "onRowInserting", js.Any.fromFunction1(value))
      
      inline def setOnRowInsertingUndefined: Self = StObject.set(x, "onRowInserting", js.undefined)
      
      inline def setOnRowPrepared(value: /* e */ RowPreparedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onRowPrepared", js.Any.fromFunction1(value))
      
      inline def setOnRowPreparedUndefined: Self = StObject.set(x, "onRowPrepared", js.undefined)
      
      inline def setOnRowRemoved(
        value: /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.RowRemovedInfo[TRowData, TKey]) => Unit
      ): Self = StObject.set(x, "onRowRemoved", js.Any.fromFunction1(value))
      
      inline def setOnRowRemovedUndefined: Self = StObject.set(x, "onRowRemoved", js.undefined)
      
      inline def setOnRowRemoving(
        value: /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.RowRemovingInfo[TRowData, TKey]) => Unit
      ): Self = StObject.set(x, "onRowRemoving", js.Any.fromFunction1(value))
      
      inline def setOnRowRemovingUndefined: Self = StObject.set(x, "onRowRemoving", js.undefined)
      
      inline def setOnRowUpdated(
        value: /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.RowUpdatedInfo[TRowData, TKey]) => Unit
      ): Self = StObject.set(x, "onRowUpdated", js.Any.fromFunction1(value))
      
      inline def setOnRowUpdatedUndefined: Self = StObject.set(x, "onRowUpdated", js.undefined)
      
      inline def setOnRowUpdating(
        value: /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.RowUpdatingInfo[TRowData, TKey]) => Unit
      ): Self = StObject.set(x, "onRowUpdating", js.Any.fromFunction1(value))
      
      inline def setOnRowUpdatingUndefined: Self = StObject.set(x, "onRowUpdating", js.undefined)
      
      inline def setOnRowValidating(
        value: /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.RowValidatingInfo[TRowData, TKey]) => Unit
      ): Self = StObject.set(x, "onRowValidating", js.Any.fromFunction1(value))
      
      inline def setOnRowValidatingUndefined: Self = StObject.set(x, "onRowValidating", js.undefined)
      
      inline def setOnSaved(
        value: /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.DataChangeInfo[TRowData, TKey]) => Unit
      ): Self = StObject.set(x, "onSaved", js.Any.fromFunction1(value))
      
      inline def setOnSavedUndefined: Self = StObject.set(x, "onSaved", js.undefined)
      
      inline def setOnSaving(
        value: /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.SavingInfo[TRowData, TKey]) => Unit
      ): Self = StObject.set(x, "onSaving", js.Any.fromFunction1(value))
      
      inline def setOnSavingUndefined: Self = StObject.set(x, "onSaving", js.undefined)
      
      inline def setOnSelectionChanged(
        value: /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & (typings.devextreme.mod.DevExpress.common.grids.SelectionChangedInfo[TRowData, TKey]) => Unit
      ): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1(value))
      
      inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
      
      inline def setOnToolbarPreparing(
        value: /* e */ (EventInfo[dxDataGrid[TRowData, TKey]]) & typings.devextreme.mod.DevExpress.common.grids.ToolbarPreparingInfo => Unit
      ): Self = StObject.set(x, "onToolbarPreparing", js.Any.fromFunction1(value))
      
      inline def setOnToolbarPreparingUndefined: Self = StObject.set(x, "onToolbarPreparing", js.undefined)
      
      inline def setPager(value: typings.devextreme.mod.DevExpress.common.grids.Pager): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
      
      inline def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
      
      inline def setPaging(value: typings.devextreme.mod.DevExpress.common.grids.PagingBase): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
      
      inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
      
      inline def setRemoteOperations(value: Boolean | Filtering | Mode): Self = StObject.set(x, "remoteOperations", value.asInstanceOf[js.Any])
      
      inline def setRemoteOperationsUndefined: Self = StObject.set(x, "remoteOperations", js.undefined)
      
      inline def setRenderAsync(value: Boolean): Self = StObject.set(x, "renderAsync", value.asInstanceOf[js.Any])
      
      inline def setRenderAsyncUndefined: Self = StObject.set(x, "renderAsync", js.undefined)
      
      inline def setRepaintChangesOnly(value: Boolean): Self = StObject.set(x, "repaintChangesOnly", value.asInstanceOf[js.Any])
      
      inline def setRepaintChangesOnlyUndefined: Self = StObject.set(x, "repaintChangesOnly", js.undefined)
      
      inline def setRowAlternationEnabled(value: Boolean): Self = StObject.set(x, "rowAlternationEnabled", value.asInstanceOf[js.Any])
      
      inline def setRowAlternationEnabledUndefined: Self = StObject.set(x, "rowAlternationEnabled", js.undefined)
      
      inline def setRowDragging(
        value: typings.devextreme.mod.DevExpress.common.grids.RowDragging[dxDataGrid[TRowData, TKey], TRowData, TKey]
      ): Self = StObject.set(x, "rowDragging", value.asInstanceOf[js.Any])
      
      inline def setRowDraggingUndefined: Self = StObject.set(x, "rowDragging", js.undefined)
      
      inline def setRowTemplate(
        value: template | (js.Function2[
              /* rowElement */ DxElement_[HTMLElement], 
              /* rowInfo */ RowTemplateData[TRowData, TKey], 
              Any
            ])
      ): Self = StObject.set(x, "rowTemplate", value.asInstanceOf[js.Any])
      
      inline def setRowTemplateFunction2(
        value: (/* rowElement */ DxElement_[HTMLElement], /* rowInfo */ RowTemplateData[TRowData, TKey]) => Any
      ): Self = StObject.set(x, "rowTemplate", js.Any.fromFunction2(value))
      
      inline def setRowTemplateUndefined: Self = StObject.set(x, "rowTemplate", js.undefined)
      
      inline def setRtlEnabled(value: Boolean): Self = StObject.set(x, "rtlEnabled", value.asInstanceOf[js.Any])
      
      inline def setRtlEnabledUndefined: Self = StObject.set(x, "rtlEnabled", js.undefined)
      
      inline def setScrolling(value: typings.devextreme.mod.DevExpress.common.grids.ScrollingBase): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
      
      inline def setSearchPanel(value: typings.devextreme.mod.DevExpress.common.grids.SearchPanel): Self = StObject.set(x, "searchPanel", value.asInstanceOf[js.Any])
      
      inline def setSearchPanelUndefined: Self = StObject.set(x, "searchPanel", js.undefined)
      
      inline def setSelectedRowKeys(value: js.Array[TKey]): Self = StObject.set(x, "selectedRowKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowKeysUndefined: Self = StObject.set(x, "selectedRowKeys", js.undefined)
      
      inline def setSelectedRowKeysVarargs(value: TKey*): Self = StObject.set(x, "selectedRowKeys", js.Array(value*))
      
      inline def setSelection(value: typings.devextreme.mod.DevExpress.common.grids.SelectionBase): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionFilter(value: String | js.Array[Any] | js.Function): Self = StObject.set(x, "selectionFilter", value.asInstanceOf[js.Any])
      
      inline def setSelectionFilterUndefined: Self = StObject.set(x, "selectionFilter", js.undefined)
      
      inline def setSelectionFilterVarargs(value: Any*): Self = StObject.set(x, "selectionFilter", js.Array(value*))
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      inline def setShowBorders(value: Boolean): Self = StObject.set(x, "showBorders", value.asInstanceOf[js.Any])
      
      inline def setShowBordersUndefined: Self = StObject.set(x, "showBorders", js.undefined)
      
      inline def setShowColumnHeaders(value: Boolean): Self = StObject.set(x, "showColumnHeaders", value.asInstanceOf[js.Any])
      
      inline def setShowColumnHeadersUndefined: Self = StObject.set(x, "showColumnHeaders", js.undefined)
      
      inline def setShowColumnLines(value: Boolean): Self = StObject.set(x, "showColumnLines", value.asInstanceOf[js.Any])
      
      inline def setShowColumnLinesUndefined: Self = StObject.set(x, "showColumnLines", js.undefined)
      
      inline def setShowRowLines(value: Boolean): Self = StObject.set(x, "showRowLines", value.asInstanceOf[js.Any])
      
      inline def setShowRowLinesUndefined: Self = StObject.set(x, "showRowLines", js.undefined)
      
      inline def setSortByGroupSummaryInfo(value: js.Array[dxDataGridSortByGroupSummaryInfoItem]): Self = StObject.set(x, "sortByGroupSummaryInfo", value.asInstanceOf[js.Any])
      
      inline def setSortByGroupSummaryInfoUndefined: Self = StObject.set(x, "sortByGroupSummaryInfo", js.undefined)
      
      inline def setSortByGroupSummaryInfoVarargs(value: dxDataGridSortByGroupSummaryInfoItem*): Self = StObject.set(x, "sortByGroupSummaryInfo", js.Array(value*))
      
      inline def setSorting(value: typings.devextreme.mod.DevExpress.common.grids.Sorting): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
      
      inline def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
      
      inline def setStateStoring(value: typings.devextreme.mod.DevExpress.common.grids.StateStoring): Self = StObject.set(x, "stateStoring", value.asInstanceOf[js.Any])
      
      inline def setStateStoringUndefined: Self = StObject.set(x, "stateStoring", js.undefined)
      
      inline def setSummary(value: Summary[TRowData, TKey]): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      inline def setSyncLookupFilterValues(value: Boolean): Self = StObject.set(x, "syncLookupFilterValues", value.asInstanceOf[js.Any])
      
      inline def setSyncLookupFilterValuesUndefined: Self = StObject.set(x, "syncLookupFilterValues", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setToolbar(value: Toolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
      
      inline def setTwoWayBindingEnabled(value: Boolean): Self = StObject.set(x, "twoWayBindingEnabled", value.asInstanceOf[js.Any])
      
      inline def setTwoWayBindingEnabledUndefined: Self = StObject.set(x, "twoWayBindingEnabled", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWidth(value: Double | String | (js.Function0[Double | String])): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthFunction0(value: () => Double | String): Self = StObject.set(x, "width", js.Any.fromFunction0(value))
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWordWrapEnabled(value: Boolean): Self = StObject.set(x, "wordWrapEnabled", value.asInstanceOf[js.Any])
      
      inline def setWordWrapEnabledUndefined: Self = StObject.set(x, "wordWrapEnabled", js.undefined)
    }
  }
  
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
       with typings.devextreme.mod.DevExpress.common.grids.RowKeyInfo[TKey]
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
       with typings.devextreme.mod.DevExpress.common.grids.RowKeyInfo[TKey]
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
  
  type RowDragging[TRowData, TKey] = typings.devextreme.mod.DevExpress.common.grids.RowDragging[dxDataGrid[Any, Any], TRowData, TKey]
  
  /* Inlined devextreme.devextreme.DevExpress.common.ReducedNativeEventInfo<devextreme.devextreme.DevExpress.ui.dxDataGrid<TRowData, TKey>> & devextreme.devextreme.DevExpress.common.grids.RowDraggingEventInfo<TRowData> & devextreme.devextreme.DevExpress.common.grids.DragDropInfo */
  trait RowDraggingAddEvent[TRowData, TKey] extends StObject {
    
    var component: dxDataGrid[TRowData, TKey]
    
    val dropInsideItem: Boolean
    
    var event: DxEvent[PointerEvent | MouseEvent | TouchEvent]
    
    val fromComponent: Sortable | Draggable
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val fromIndex: Double
    
    val itemData: js.UndefOr[TRowData] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
    
    val toComponent: Sortable | Draggable
    
    val toData: js.UndefOr[Any] = js.undefined
    
    val toIndex: Double
  }
  object RowDraggingAddEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      dropInsideItem: Boolean,
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromComponent: Sortable | Draggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: Sortable | Draggable,
      toIndex: Double
    ): RowDraggingAddEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropInsideItem = dropInsideItem.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingAddEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowDraggingAddEvent[?, ?], TRowData, TKey] (val x: Self & (RowDraggingAddEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setComponent(value: dxDataGrid[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDropInsideItem(value: Boolean): Self = StObject.set(x, "dropInsideItem", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: DxEvent[PointerEvent | MouseEvent | TouchEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setFromComponent(value: Sortable | Draggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: TRowData): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setToComponent(value: Sortable | Draggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
      
      inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined devextreme.devextreme.DevExpress.events.Cancelable & devextreme.devextreme.DevExpress.common.ReducedNativeEventInfo<devextreme.devextreme.DevExpress.ui.dxDataGrid<TRowData, TKey>> & devextreme.devextreme.DevExpress.common.grids.RowDraggingEventInfo<TRowData> & devextreme.devextreme.DevExpress.common.grids.DragDropInfo */
  trait RowDraggingChangeEvent[TRowData, TKey] extends StObject {
    
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    var component: dxDataGrid[TRowData, TKey]
    
    val dropInsideItem: Boolean
    
    var event: DxEvent[PointerEvent | MouseEvent | TouchEvent]
    
    val fromComponent: Sortable | Draggable
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val fromIndex: Double
    
    val itemData: js.UndefOr[TRowData] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
    
    val toComponent: Sortable | Draggable
    
    val toData: js.UndefOr[Any] = js.undefined
    
    val toIndex: Double
  }
  object RowDraggingChangeEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      dropInsideItem: Boolean,
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromComponent: Sortable | Draggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: Sortable | Draggable,
      toIndex: Double
    ): RowDraggingChangeEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropInsideItem = dropInsideItem.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingChangeEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowDraggingChangeEvent[?, ?], TRowData, TKey] (val x: Self & (RowDraggingChangeEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setComponent(value: dxDataGrid[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDropInsideItem(value: Boolean): Self = StObject.set(x, "dropInsideItem", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: DxEvent[PointerEvent | MouseEvent | TouchEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setFromComponent(value: Sortable | Draggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: TRowData): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setToComponent(value: Sortable | Draggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
      
      inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined devextreme.devextreme.DevExpress.events.Cancelable & devextreme.devextreme.DevExpress.common.ReducedNativeEventInfo<devextreme.devextreme.DevExpress.ui.dxDataGrid<TRowData, TKey>> & devextreme.devextreme.DevExpress.common.grids.RowDraggingEventInfo<TRowData> & devextreme.devextreme.DevExpress.common.grids.DragDropInfo */
  trait RowDraggingEndEvent[TRowData, TKey] extends StObject {
    
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    var component: dxDataGrid[TRowData, TKey]
    
    val dropInsideItem: Boolean
    
    var event: DxEvent[PointerEvent | MouseEvent | TouchEvent]
    
    val fromComponent: Sortable | Draggable
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val fromIndex: Double
    
    val itemData: js.UndefOr[TRowData] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
    
    val toComponent: Sortable | Draggable
    
    val toData: js.UndefOr[Any] = js.undefined
    
    val toIndex: Double
  }
  object RowDraggingEndEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      dropInsideItem: Boolean,
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromComponent: Sortable | Draggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: Sortable | Draggable,
      toIndex: Double
    ): RowDraggingEndEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropInsideItem = dropInsideItem.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingEndEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowDraggingEndEvent[?, ?], TRowData, TKey] (val x: Self & (RowDraggingEndEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setComponent(value: dxDataGrid[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDropInsideItem(value: Boolean): Self = StObject.set(x, "dropInsideItem", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: DxEvent[PointerEvent | MouseEvent | TouchEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setFromComponent(value: Sortable | Draggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: TRowData): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setToComponent(value: Sortable | Draggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
      
      inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
    }
  }
  
  type RowDraggingEventInfo[TRowData] = typings.devextreme.mod.DevExpress.common.grids.RowDraggingEventInfo[TRowData]
  
  /* Inlined devextreme.devextreme.DevExpress.events.Cancelable & devextreme.devextreme.DevExpress.common.ReducedNativeEventInfo<devextreme.devextreme.DevExpress.ui.dxDataGrid<TRowData, TKey>> & devextreme.devextreme.DevExpress.common.grids.RowDraggingEventInfo<TRowData> & devextreme.devextreme.DevExpress.common.grids.DragDropInfo */
  trait RowDraggingMoveEvent[TRowData, TKey] extends StObject {
    
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    var component: dxDataGrid[TRowData, TKey]
    
    val dropInsideItem: Boolean
    
    var event: DxEvent[PointerEvent | MouseEvent | TouchEvent]
    
    val fromComponent: Sortable | Draggable
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val fromIndex: Double
    
    val itemData: js.UndefOr[TRowData] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
    
    val toComponent: Sortable | Draggable
    
    val toData: js.UndefOr[Any] = js.undefined
    
    val toIndex: Double
  }
  object RowDraggingMoveEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      dropInsideItem: Boolean,
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromComponent: Sortable | Draggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: Sortable | Draggable,
      toIndex: Double
    ): RowDraggingMoveEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropInsideItem = dropInsideItem.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingMoveEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowDraggingMoveEvent[?, ?], TRowData, TKey] (val x: Self & (RowDraggingMoveEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setComponent(value: dxDataGrid[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDropInsideItem(value: Boolean): Self = StObject.set(x, "dropInsideItem", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: DxEvent[PointerEvent | MouseEvent | TouchEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setFromComponent(value: Sortable | Draggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: TRowData): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setToComponent(value: Sortable | Draggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
      
      inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined devextreme.devextreme.DevExpress.common.ReducedNativeEventInfo<devextreme.devextreme.DevExpress.ui.dxDataGrid<TRowData, TKey>> & devextreme.devextreme.DevExpress.common.grids.RowDraggingEventInfo<TRowData> */
  trait RowDraggingRemoveEvent[TRowData, TKey] extends StObject {
    
    var component: dxDataGrid[TRowData, TKey]
    
    var event: DxEvent[PointerEvent | MouseEvent | TouchEvent]
    
    val fromComponent: Sortable | Draggable
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val fromIndex: Double
    
    val itemData: js.UndefOr[TRowData] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
    
    val toComponent: Sortable | Draggable
    
    val toData: js.UndefOr[Any] = js.undefined
    
    val toIndex: Double
  }
  object RowDraggingRemoveEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromComponent: Sortable | Draggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: Sortable | Draggable,
      toIndex: Double
    ): RowDraggingRemoveEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingRemoveEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowDraggingRemoveEvent[?, ?], TRowData, TKey] (val x: Self & (RowDraggingRemoveEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setComponent(value: dxDataGrid[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: DxEvent[PointerEvent | MouseEvent | TouchEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setFromComponent(value: Sortable | Draggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: TRowData): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setToComponent(value: Sortable | Draggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
      
      inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined devextreme.devextreme.DevExpress.common.ReducedNativeEventInfo<devextreme.devextreme.DevExpress.ui.dxDataGrid<TRowData, TKey>> & devextreme.devextreme.DevExpress.common.grids.RowDraggingEventInfo<TRowData> & devextreme.devextreme.DevExpress.common.grids.DragReorderInfo */
  trait RowDraggingReorderEvent[TRowData, TKey] extends StObject {
    
    var component: dxDataGrid[TRowData, TKey]
    
    val dropInsideItem: Boolean
    
    var event: DxEvent[PointerEvent | MouseEvent | TouchEvent]
    
    val fromComponent: Sortable | Draggable
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val fromIndex: Double
    
    val itemData: js.UndefOr[TRowData] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
    
    var promise: js.UndefOr[PromiseLike[Unit]] = js.undefined
    
    val toComponent: Sortable | Draggable
    
    val toData: js.UndefOr[Any] = js.undefined
    
    val toIndex: Double
  }
  object RowDraggingReorderEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      dropInsideItem: Boolean,
      event: DxEvent[PointerEvent | MouseEvent | TouchEvent],
      fromComponent: Sortable | Draggable,
      fromIndex: Double,
      itemElement: DxElement_[HTMLElement],
      toComponent: Sortable | Draggable,
      toIndex: Double
    ): RowDraggingReorderEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], dropInsideItem = dropInsideItem.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], fromComponent = fromComponent.asInstanceOf[js.Any], fromIndex = fromIndex.asInstanceOf[js.Any], itemElement = itemElement.asInstanceOf[js.Any], toComponent = toComponent.asInstanceOf[js.Any], toIndex = toIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowDraggingReorderEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowDraggingReorderEvent[?, ?], TRowData, TKey] (val x: Self & (RowDraggingReorderEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setComponent(value: dxDataGrid[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setDropInsideItem(value: Boolean): Self = StObject.set(x, "dropInsideItem", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: DxEvent[PointerEvent | MouseEvent | TouchEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setFromComponent(value: Sortable | Draggable): Self = StObject.set(x, "fromComponent", value.asInstanceOf[js.Any])
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: TRowData): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
      
      inline def setPromise(value: PromiseLike[Unit]): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      inline def setToComponent(value: Sortable | Draggable): Self = StObject.set(x, "toComponent", value.asInstanceOf[js.Any])
      
      inline def setToData(value: Any): Self = StObject.set(x, "toData", value.asInstanceOf[js.Any])
      
      inline def setToDataUndefined: Self = StObject.set(x, "toData", js.undefined)
      
      inline def setToIndex(value: Double): Self = StObject.set(x, "toIndex", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined devextreme.devextreme.DevExpress.events.Cancelable & devextreme.devextreme.DevExpress.common.ReducedNativeEventInfo<devextreme.devextreme.DevExpress.ui.dxDataGrid<TRowData, TKey>> & devextreme.devextreme.DevExpress.common.grids.DragStartEventInfo<TRowData> */
  trait RowDraggingStartEvent[TRowData, TKey] extends StObject {
    
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    var component: dxDataGrid[TRowData, TKey]
    
    var event: DxEvent[PointerEvent | MouseEvent | TouchEvent]
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val fromIndex: Double
    
    var itemData: js.UndefOr[TRowData] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
  }
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowDraggingStartEvent[?, ?], TRowData, TKey] (val x: Self & (RowDraggingStartEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setComponent(value: dxDataGrid[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: DxEvent[PointerEvent | MouseEvent | TouchEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: TRowData): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    }
  }
  
  type RowDraggingTemplateData = typings.devextreme.mod.DevExpress.common.grids.RowDraggingTemplateData[Any]
  
  type RowDraggingTemplateDataModel = typings.devextreme.mod.DevExpress.common.grids.RowDraggingTemplateData[Any]
  
  trait RowExpandedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with typings.devextreme.mod.DevExpress.common.grids.RowKeyInfo[TKey]
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
       with typings.devextreme.mod.DevExpress.common.grids.RowKeyInfo[TKey]
  object RowExpandingEvent {
    
    inline def apply[TRowData, TKey](component: dxDataGrid[TRowData, TKey], element: DxElement_[HTMLElement], key: TKey): RowExpandingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowExpandingEvent[TRowData, TKey]]
    }
  }
  
  trait RowInsertedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with typings.devextreme.mod.DevExpress.common.grids.RowInsertedInfo[TRowData, TKey]
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
  
  type RowInsertedInfo[TRowData, TKey] = typings.devextreme.mod.DevExpress.common.grids.RowInsertedInfo[TRowData, TKey]
  
  trait RowInsertingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with typings.devextreme.mod.DevExpress.common.grids.RowInsertingInfo[TRowData]
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
  
  type RowInsertingInfo[TRowData] = typings.devextreme.mod.DevExpress.common.grids.RowInsertingInfo[TRowData]
  
  type RowKeyInfo[TKey] = typings.devextreme.mod.DevExpress.common.grids.RowKeyInfo[TKey]
  
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
       with typings.devextreme.mod.DevExpress.common.grids.RowRemovedInfo[TRowData, TKey]
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
  
  type RowRemovedInfo[TRowData, TKey] = typings.devextreme.mod.DevExpress.common.grids.RowRemovedInfo[TRowData, TKey]
  
  trait RowRemovingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with typings.devextreme.mod.DevExpress.common.grids.RowRemovingInfo[TRowData, TKey]
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
  
  type RowRemovingInfo[TRowData, TKey] = typings.devextreme.mod.DevExpress.common.grids.RowRemovingInfo[TRowData, TKey]
  
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
       with typings.devextreme.mod.DevExpress.common.grids.RowUpdatedInfo[TRowData, TKey]
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
  
  type RowUpdatedInfo[TRowData, TKey] = typings.devextreme.mod.DevExpress.common.grids.RowUpdatedInfo[TRowData, TKey]
  
  trait RowUpdatingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with typings.devextreme.mod.DevExpress.common.grids.RowUpdatingInfo[TRowData, TKey]
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
  
  type RowUpdatingInfo[TRowData, TKey] = typings.devextreme.mod.DevExpress.common.grids.RowUpdatingInfo[TRowData, TKey]
  
  trait RowValidatingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with typings.devextreme.mod.DevExpress.common.grids.RowValidatingInfo[TRowData, TKey]
  object RowValidatingEvent {
    
    inline def apply[TRowData, TKey](
      brokenRules: js.Array[typings.devextreme.mod.DevExpress.common.ValidationRule],
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
  
  type RowValidatingInfo[TRowData, TKey] = typings.devextreme.mod.DevExpress.common.grids.RowValidatingInfo[TRowData, TKey]
  
  trait SavedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with typings.devextreme.mod.DevExpress.common.grids.DataChangeInfo[TRowData, TKey]
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
       with typings.devextreme.mod.DevExpress.common.grids.SavingInfo[TRowData, TKey]
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
  
  type SavingInfo[TRowData, TKey] = typings.devextreme.mod.DevExpress.common.grids.SavingInfo[TRowData, TKey]
  
  type Scrollable = typings.devextreme.mod.DevExpress.common.Scrollable
  
  trait Scrolling
    extends StObject
       with typings.devextreme.mod.DevExpress.common.grids.ScrollingBase {
    
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
  
  type ScrollingBase = typings.devextreme.mod.DevExpress.common.grids.ScrollingBase
  
  type SearchPanel = typings.devextreme.mod.DevExpress.common.grids.SearchPanel
  
  trait Selection
    extends StObject
       with typings.devextreme.mod.DevExpress.common.grids.SelectionBase {
    
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
  
  type SelectionBase = typings.devextreme.mod.DevExpress.common.grids.SelectionBase
  
  trait SelectionChangedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxDataGrid[TRowData, TKey]]
       with typings.devextreme.mod.DevExpress.common.grids.SelectionChangedInfo[TRowData, TKey]
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
  
  type SelectionChangedInfo[TRowData, TKey] = typings.devextreme.mod.DevExpress.common.grids.SelectionChangedInfo[TRowData, TKey]
  
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
       with typings.devextreme.mod.DevExpress.common.grids.ToolbarPreparingInfo
  object ToolbarPreparingEvent {
    
    inline def apply[TRowData, TKey](
      component: dxDataGrid[TRowData, TKey],
      element: DxElement_[HTMLElement],
      toolbarOptions: typings.devextreme.mod.DevExpress.ui.dxToolbar.Properties[Any, Any]
    ): ToolbarPreparingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], toolbarOptions = toolbarOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarPreparingEvent[TRowData, TKey]]
    }
  }
  
  type ToolbarPreparingInfo = typings.devextreme.mod.DevExpress.common.grids.ToolbarPreparingInfo
  
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
