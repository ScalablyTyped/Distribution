package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StringDictionary
import typings.devextreme.anon.ComponentDxTreeList
import typings.devextreme.anon.Grouping
import typings.devextreme.mod.DevExpress.DOMComponent.OptionChangedEventInfo
import typings.devextreme.mod.DevExpress.common.DataStructure
import typings.devextreme.mod.DevExpress.common.Draggable
import typings.devextreme.mod.DevExpress.common.Mode
import typings.devextreme.mod.DevExpress.common.ScrollMode
import typings.devextreme.mod.DevExpress.common.Sortable
import typings.devextreme.mod.DevExpress.common.grids.AdaptiveDetailRowPreparingInfo
import typings.devextreme.mod.DevExpress.common.grids.ColumnBase
import typings.devextreme.mod.DevExpress.common.grids.ColumnChooser
import typings.devextreme.mod.DevExpress.common.grids.ColumnFixing
import typings.devextreme.mod.DevExpress.common.grids.ColumnResizeMode
import typings.devextreme.mod.DevExpress.common.grids.DataChange
import typings.devextreme.mod.DevExpress.common.grids.DataChangeInfo
import typings.devextreme.mod.DevExpress.common.grids.DataErrorOccurredInfo
import typings.devextreme.mod.DevExpress.common.grids.EditingBase
import typings.devextreme.mod.DevExpress.common.grids.EditingTextsBase
import typings.devextreme.mod.DevExpress.common.grids.FilterPanel
import typings.devextreme.mod.DevExpress.common.grids.FilterRow
import typings.devextreme.mod.DevExpress.common.grids.HeaderFilter
import typings.devextreme.mod.DevExpress.common.grids.KeyDownInfo
import typings.devextreme.mod.DevExpress.common.grids.KeyboardNavigation
import typings.devextreme.mod.DevExpress.common.grids.LoadPanel
import typings.devextreme.mod.DevExpress.common.grids.NewRowInfo
import typings.devextreme.mod.DevExpress.common.grids.Pager
import typings.devextreme.mod.DevExpress.common.grids.PagingBase
import typings.devextreme.mod.DevExpress.common.grids.RowDragging
import typings.devextreme.mod.DevExpress.common.grids.RowDraggingTemplateData
import typings.devextreme.mod.DevExpress.common.grids.RowInsertedInfo
import typings.devextreme.mod.DevExpress.common.grids.RowInsertingInfo
import typings.devextreme.mod.DevExpress.common.grids.RowKeyInfo
import typings.devextreme.mod.DevExpress.common.grids.RowRemovedInfo
import typings.devextreme.mod.DevExpress.common.grids.RowRemovingInfo
import typings.devextreme.mod.DevExpress.common.grids.RowUpdatedInfo
import typings.devextreme.mod.DevExpress.common.grids.RowUpdatingInfo
import typings.devextreme.mod.DevExpress.common.grids.RowValidatingInfo
import typings.devextreme.mod.DevExpress.common.grids.SavingInfo
import typings.devextreme.mod.DevExpress.common.grids.ScrollingBase
import typings.devextreme.mod.DevExpress.common.grids.SearchPanel
import typings.devextreme.mod.DevExpress.common.grids.SelectionBase
import typings.devextreme.mod.DevExpress.common.grids.SelectionChangedInfo
import typings.devextreme.mod.DevExpress.common.grids.Sorting
import typings.devextreme.mod.DevExpress.common.grids.StateStoring
import typings.devextreme.mod.DevExpress.common.grids.ToolbarPreparingInfo
import typings.devextreme.mod.DevExpress.core.DeepPartial
import typings.devextreme.mod.DevExpress.core.DxElement_
import typings.devextreme.mod.DevExpress.core.UserDefinedElement
import typings.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextreme.mod.DevExpress.events.Cancelable
import typings.devextreme.mod.DevExpress.events.ChangedOptionInfo
import typings.devextreme.mod.DevExpress.events.DxEvent
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.dxTreeList.Column
import typings.devextreme.mod.DevExpress.ui.dxTreeList.Node
import typings.devextreme.mod.DevExpress.ui.dxTreeList.Row
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
trait dxTreeList[TRowData, TKey]
  extends StObject
     with Widget[dxTreeListOptions[TRowData, TKey]]
     with typings.devextreme.mod.DevExpress.common.grids.GridBase[TRowData, TKey] {
  
  def addColumn(columnOptions: String): Unit = js.native
  /**
    * Adds a new column.
    */
  def addColumn(columnOptions: Column[TRowData, TKey]): Unit = js.native
  
  /**
    * Adds an empty data row to the highest hierarchical level and switches it to the editing state.
    */
  def addRow(): js.Promise[Unit] = js.native
  /**
    * Adds an empty data row to a specified parent row.
    */
  def addRow(parentId: TKey): js.Promise[Unit] = js.native
  
  /**
    * Collapses a row with a specific key.
    */
  def collapseRow(key: TKey): js.Promise[Unit] = js.native
  
  /**
    * Expands a row with a specific key.
    */
  def expandRow(key: TKey): js.Promise[Unit] = js.native
  
  /**
    * Sets focus on the UI component.
    */
  /* InferMemberOverrides */
  override def focus(): Unit = js.native
  
  /**
    * Performs a pre-order tree traversal, executing a function on each visited node. Starts traversing from the top level nodes.
    */
  def forEachNode(callback: js.Function): Unit = js.native
  /**
    * Performs a pre-order tree traversal, executing a function on each visited node. Starts traversing from the specified nodes.
    */
  def forEachNode(nodes: js.Array[Node[TRowData, TKey]], callback: js.Function): Unit = js.native
  
  /**
    * Gets a node with a specific key.
    */
  def getNodeByKey(key: TKey): Node[TRowData, TKey] = js.native
  
  /**
    * Gets the root node.
    */
  def getRootNode(): Node[TRowData, TKey] = js.native
  
  /**
    * Gets the keys of the rows selected explicitly via the API or via a click or tap.
    */
  def getSelectedRowKeys(): js.Array[TKey] = js.native
  /**
    * Gets the selected rows&apos; keys.
    */
  def getSelectedRowKeys(mode: String): js.Array[TKey] = js.native
  
  /**
    * Gets the data objects of the rows selected explicitly via the API or via a click or tap.
    */
  def getSelectedRowsData(): js.Array[TRowData] = js.native
  /**
    * Gets the selected rows&apos; data objects.
    */
  def getSelectedRowsData(mode: String): js.Array[TRowData] = js.native
  
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
    * Checks whether a row is expanded or collapsed.
    */
  def isRowExpanded(key: TKey): Boolean = js.native
  
  /**
    * Loads all root node descendants (all data items). Takes effect only if data has the plain structure and remoteOperations.filtering is true.
    */
  def loadDescendants(): js.Promise[Unit] = js.native
  /**
    * Loads a specific node&apos;s descendants. Takes effect only if data has the plain structure and remoteOperations.filtering is true.
    */
  def loadDescendants(keys: js.Array[TKey]): js.Promise[Unit] = js.native
  /**
    * Loads all or only direct descendants of specific nodes. Takes effect only if data has the plain structure and remoteOperations.filtering is true.
    */
  def loadDescendants(keys: js.Array[TKey], childrenOnly: Boolean): js.Promise[Unit] = js.native
}
object dxTreeList {
  
  trait AdaptiveDetailRowPreparingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with AdaptiveDetailRowPreparingInfo
  object AdaptiveDetailRowPreparingEvent {
    
    inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey], element: DxElement_[HTMLElement], formOptions: Any): AdaptiveDetailRowPreparingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], formOptions = formOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdaptiveDetailRowPreparingEvent[TRowData, TKey]]
    }
  }
  
  trait CellClickEvent[TRowData, TKey]
    extends StObject
       with NativeEventInfo[dxTreeList[TRowData, TKey], PointerEvent | MouseEvent]
       with CellInfo[TRowData, TKey]
  object CellClickEvent {
    
    inline def apply[TRowData, TKey](
      cellElement: DxElement_[HTMLElement],
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxTreeList[TRowData, TKey],
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
  }
  
  trait CellDblClickEvent[TRowData, TKey]
    extends StObject
       with NativeEventInfo[dxTreeList[TRowData, TKey], PointerEvent | MouseEvent]
       with CellInfo[TRowData, TKey]
  object CellDblClickEvent {
    
    inline def apply[TRowData, TKey](
      cellElement: DxElement_[HTMLElement],
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxTreeList[TRowData, TKey],
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
  }
  
  trait CellHoverChangedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with CellInfo[TRowData, TKey] {
    
    val eventType: String
  }
  object CellHoverChangedEvent {
    
    inline def apply[TRowData, TKey](
      cellElement: DxElement_[HTMLElement],
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxTreeList[TRowData, TKey],
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
      
      inline def setEventType(value: String): Self = StObject.set(x, "eventType", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * @deprecated Attention! This type is for internal purposes only. If you used it previously, please submit a ticket to our {@link https://supportcenter.devexpress.com/ticket/create Support Center}. We will check if there is an alternative solution.
    */
  trait CellInfo[TRowData, TKey] extends StObject {
    
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
  object CellInfo {
    
    inline def apply[TRowData, TKey](
      cellElement: DxElement_[HTMLElement],
      column: Column[TRowData, TKey],
      columnIndex: Double,
      data: TRowData,
      key: TKey,
      row: Row[TRowData, TKey],
      rowIndex: Double,
      rowType: String,
      text: String
    ): CellInfo[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cellElement = cellElement.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[CellInfo[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellInfo[?, ?], TRowData, TKey] (val x: Self & (CellInfo[TRowData, TKey])) extends AnyVal {
      
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
  
  trait CellPreparedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with CellInfo[TRowData, TKey] {
    
    val isExpanded: js.UndefOr[Boolean] = js.undefined
    
    val isNewRow: js.UndefOr[Boolean] = js.undefined
    
    val isSelected: js.UndefOr[Boolean] = js.undefined
    
    val oldValue: js.UndefOr[Any] = js.undefined
    
    val watch: js.UndefOr[js.Function] = js.undefined
  }
  object CellPreparedEvent {
    
    inline def apply[TRowData, TKey](
      cellElement: DxElement_[HTMLElement],
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxTreeList[TRowData, TKey],
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
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsNewRow(value: Boolean): Self = StObject.set(x, "isNewRow", value.asInstanceOf[js.Any])
      
      inline def setIsNewRowUndefined: Self = StObject.set(x, "isNewRow", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
      
      inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
      
      inline def setWatch(value: js.Function): Self = StObject.set(x, "watch", value.asInstanceOf[js.Any])
      
      inline def setWatchUndefined: Self = StObject.set(x, "watch", js.undefined)
    }
  }
  
  type Column[TRowData, TKey] = dxTreeListColumn[TRowData, TKey]
  
  type ColumnButton[TRowData, TKey] = dxTreeListColumnButton[TRowData, TKey]
  
  trait ColumnButtonClickEvent[TRowData, TKey]
    extends StObject
       with NativeEventInfo[dxTreeList[TRowData, TKey], PointerEvent | MouseEvent] {
    
    var column: js.UndefOr[Column[TRowData, TKey]] = js.undefined
    
    var row: js.UndefOr[Row[TRowData, TKey]] = js.undefined
  }
  object ColumnButtonClickEvent {
    
    inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey], element: DxElement_[HTMLElement]): ColumnButtonClickEvent[TRowData, TKey] = {
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
    
    val component: dxTreeList[TRowData, TKey]
    
    val data: TRowData
    
    val key: TKey
    
    val row: Row[TRowData, TKey]
    
    val rowIndex: Double
    
    val rowType: String
  }
  object ColumnButtonTemplateData {
    
    inline def apply[TRowData, TKey](
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      key: TKey,
      row: Row[TRowData, TKey],
      rowIndex: Double,
      rowType: String
    ): ColumnButtonTemplateData[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnButtonTemplateData[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnButtonTemplateData[?, ?], TRowData, TKey] (val x: Self & (ColumnButtonTemplateData[TRowData, TKey])) extends AnyVal {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: dxTreeList[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
    }
  }
  
  trait ColumnCellTemplateData[TRowData, TKey] extends StObject {
    
    val column: Column[TRowData, TKey]
    
    val columnIndex: Double
    
    val component: dxTreeList[TRowData, TKey]
    
    val data: TRowData
    
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
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      row: Row[TRowData, TKey],
      rowIndex: Double,
      rowType: String,
      text: String
    ): ColumnCellTemplateData[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnCellTemplateData[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnCellTemplateData[?, ?], TRowData, TKey] (val x: Self & (ColumnCellTemplateData[TRowData, TKey])) extends AnyVal {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: dxTreeList[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
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
  
  trait ColumnEditCellTemplateData[TRowData, TKey] extends StObject {
    
    val column: Column[TRowData, TKey]
    
    val columnIndex: Double
    
    val component: dxTreeList[TRowData, TKey]
    
    val data: TRowData
    
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
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      row: Row[TRowData, TKey],
      rowIndex: Double,
      rowType: String,
      text: String
    ): ColumnEditCellTemplateData[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnEditCellTemplateData[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnEditCellTemplateData[?, ?], TRowData, TKey] (val x: Self & (ColumnEditCellTemplateData[TRowData, TKey])) extends AnyVal {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: dxTreeList[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
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
  
  trait ColumnHeaderCellTemplateData[TRowData, TKey] extends StObject {
    
    val column: Column[TRowData, TKey]
    
    val columnIndex: Double
    
    val component: dxTreeList[TRowData, TKey]
  }
  object ColumnHeaderCellTemplateData {
    
    inline def apply[TRowData, TKey](column: Column[TRowData, TKey], columnIndex: Double, component: dxTreeList[TRowData, TKey]): ColumnHeaderCellTemplateData[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnHeaderCellTemplateData[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnHeaderCellTemplateData[?, ?], TRowData, TKey] (val x: Self & (ColumnHeaderCellTemplateData[TRowData, TKey])) extends AnyVal {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: dxTreeList[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    }
  }
  
  type ContentReadyEvent[TRowData, TKey] = EventInfo[dxTreeList[TRowData, TKey]]
  
  trait ContextMenuPreparingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]] {
    
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
      component: dxTreeList[TRowData, TKey],
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
  
  trait DataErrorOccurredEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with DataErrorOccurredInfo
  object DataErrorOccurredEvent {
    
    inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey], element: DxElement_[HTMLElement]): DataErrorOccurredEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataErrorOccurredEvent[TRowData, TKey]]
    }
  }
  
  type DisposingEvent[TRowData, TKey] = EventInfo[dxTreeList[TRowData, TKey]]
  
  trait EditCanceledEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with DataChangeInfo[TRowData, TKey]
  object EditCanceledEvent {
    
    inline def apply[TRowData, TKey](
      changes: js.Array[DataChange[TRowData, TKey]],
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement]
    ): EditCanceledEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditCanceledEvent[TRowData, TKey]]
    }
  }
  
  trait EditCancelingEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with EventInfo[dxTreeList[TRowData, TKey]]
       with DataChangeInfo[TRowData, TKey]
  object EditCancelingEvent {
    
    inline def apply[TRowData, TKey](
      changes: js.Array[DataChange[TRowData, TKey]],
      component: dxTreeList[TRowData, TKey],
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
      * Specifies whether a user can add new rows. It is called for each data row when defined as a function.
      */
    var allowAdding: js.UndefOr[
        Boolean | (js.Function1[/* options */ ComponentDxTreeList[TRowData, TKey], Boolean])
      ] = js.undefined
    
    /**
      * Specifies whether a user can delete rows. It is called for each data row when defined as a function.
      */
    var allowDeleting: js.UndefOr[
        Boolean | (js.Function1[/* options */ ComponentDxTreeList[TRowData, TKey], Boolean])
      ] = js.undefined
    
    /**
      * Specifies whether a user can update rows. It is called for each data row when defined as a function
      */
    var allowUpdating: js.UndefOr[
        Boolean | (js.Function1[/* options */ ComponentDxTreeList[TRowData, TKey], Boolean])
      ] = js.undefined
    
    /**
      * Contains properties that specify texts for editing-related UI elements.
      */
    @JSName("texts")
    var texts_Editing: js.UndefOr[EditingTexts] = js.undefined
  }
  object Editing {
    
    inline def apply[TRowData, TKey](): Editing[TRowData, TKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Editing[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Editing[?, ?], TRowData, TKey] (val x: Self & (Editing[TRowData, TKey])) extends AnyVal {
      
      inline def setAllowAdding(value: Boolean | (js.Function1[/* options */ ComponentDxTreeList[TRowData, TKey], Boolean])): Self = StObject.set(x, "allowAdding", value.asInstanceOf[js.Any])
      
      inline def setAllowAddingFunction1(value: /* options */ ComponentDxTreeList[TRowData, TKey] => Boolean): Self = StObject.set(x, "allowAdding", js.Any.fromFunction1(value))
      
      inline def setAllowAddingUndefined: Self = StObject.set(x, "allowAdding", js.undefined)
      
      inline def setAllowDeleting(value: Boolean | (js.Function1[/* options */ ComponentDxTreeList[TRowData, TKey], Boolean])): Self = StObject.set(x, "allowDeleting", value.asInstanceOf[js.Any])
      
      inline def setAllowDeletingFunction1(value: /* options */ ComponentDxTreeList[TRowData, TKey] => Boolean): Self = StObject.set(x, "allowDeleting", js.Any.fromFunction1(value))
      
      inline def setAllowDeletingUndefined: Self = StObject.set(x, "allowDeleting", js.undefined)
      
      inline def setAllowUpdating(value: Boolean | (js.Function1[/* options */ ComponentDxTreeList[TRowData, TKey], Boolean])): Self = StObject.set(x, "allowUpdating", value.asInstanceOf[js.Any])
      
      inline def setAllowUpdatingFunction1(value: /* options */ ComponentDxTreeList[TRowData, TKey] => Boolean): Self = StObject.set(x, "allowUpdating", js.Any.fromFunction1(value))
      
      inline def setAllowUpdatingUndefined: Self = StObject.set(x, "allowUpdating", js.undefined)
      
      inline def setTexts(value: EditingTexts): Self = StObject.set(x, "texts", value.asInstanceOf[js.Any])
      
      inline def setTextsUndefined: Self = StObject.set(x, "texts", js.undefined)
    }
  }
  
  trait EditingStartEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with EventInfo[dxTreeList[TRowData, TKey]] {
    
    val column: Column[TRowData, TKey]
    
    val data: TRowData
    
    val key: TKey
  }
  object EditingStartEvent {
    
    inline def apply[TRowData, TKey](
      column: Column[TRowData, TKey],
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      key: TKey
    ): EditingStartEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditingStartEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditingStartEvent[?, ?], TRowData, TKey] (val x: Self & (EditingStartEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditingTexts
    extends StObject
       with EditingTextsBase {
    
    /**
      * Specifies text for the button that adds a new nested row. Applies if the editing.mode is &apos;batch&apos; or &apos;cell&apos;.
      */
    var addRowToNode: js.UndefOr[String] = js.undefined
  }
  object EditingTexts {
    
    inline def apply(): EditingTexts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditingTexts]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditingTexts] (val x: Self) extends AnyVal {
      
      inline def setAddRowToNode(value: String): Self = StObject.set(x, "addRowToNode", value.asInstanceOf[js.Any])
      
      inline def setAddRowToNodeUndefined: Self = StObject.set(x, "addRowToNode", js.undefined)
    }
  }
  
  trait EditorPreparedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]] {
    
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
      component: dxTreeList[TRowData, TKey],
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
       with Cancelable
       with EventInfo[dxTreeList[TRowData, TKey]] {
    
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
    
    var updateValueTimeout: js.UndefOr[Double] = js.undefined
    
    val value: js.UndefOr[Any] = js.undefined
    
    val width: js.UndefOr[Double] = js.undefined
  }
  object EditorPreparingEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      disabled: Boolean,
      editorElement: DxElement_[HTMLElement],
      editorName: String,
      editorOptions: Any,
      element: DxElement_[HTMLElement],
      parentType: String,
      readOnly: Boolean,
      rtlEnabled: Boolean
    ): EditorPreparingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editorElement = editorElement.asInstanceOf[js.Any], editorName = editorName.asInstanceOf[js.Any], editorOptions = editorOptions.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], parentType = parentType.asInstanceOf[js.Any], readOnly = readOnly.asInstanceOf[js.Any], rtlEnabled = rtlEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditorPreparingEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditorPreparingEvent[?, ?], TRowData, TKey] (val x: Self & (EditorPreparingEvent[TRowData, TKey])) extends AnyVal {
      
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
    
    var AdaptiveDetailRowPreparingEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.AdaptiveDetailRowPreparingEvent[TRowData, TKey]
    
    var CellClickEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.CellClickEvent[TRowData, TKey]
    
    var CellDblClickEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.CellDblClickEvent[TRowData, TKey]
    
    var CellHoverChangedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.CellHoverChangedEvent[TRowData, TKey]
    
    var CellPreparedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.CellPreparedEvent[TRowData, TKey]
    
    var ColumnButtonClickEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.ColumnButtonClickEvent[TRowData, TKey]
    
    var ColumnButtonTemplateData: typings.devextreme.mod.DevExpress.ui.dxTreeList.ColumnButtonTemplateData[TRowData, TKey]
    
    var ColumnCellTemplateData: typings.devextreme.mod.DevExpress.ui.dxTreeList.ColumnCellTemplateData[TRowData, TKey]
    
    var ColumnEditCellTemplateData: typings.devextreme.mod.DevExpress.ui.dxTreeList.ColumnEditCellTemplateData[TRowData, TKey]
    
    var ContentReadyEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.ContentReadyEvent[TRowData, TKey]
    
    var ContextMenuPreparingEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.ContextMenuPreparingEvent[TRowData, TKey]
    
    var DataErrorOccurredEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.DataErrorOccurredEvent[TRowData, TKey]
    
    var DisposingEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.DisposingEvent[TRowData, TKey]
    
    var EditCanceledEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.EditCanceledEvent[TRowData, TKey]
    
    var EditCancelingEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.EditCancelingEvent[TRowData, TKey]
    
    var Editing: typings.devextreme.mod.DevExpress.ui.dxTreeList.Editing[TRowData, TKey]
    
    var EditingStartEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.EditingStartEvent[TRowData, TKey]
    
    var EditorPreparedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.EditorPreparedEvent[TRowData, TKey]
    
    var EditorPreparingEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.EditorPreparingEvent[TRowData, TKey]
    
    var FocusedCellChangedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.FocusedCellChangedEvent[TRowData, TKey]
    
    var FocusedCellChangingEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.FocusedCellChangingEvent[TRowData, TKey]
    
    var FocusedRowChangedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.FocusedRowChangedEvent[TRowData, TKey]
    
    var FocusedRowChangingEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.FocusedRowChangingEvent[TRowData, TKey]
    
    var InitNewRowEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.InitNewRowEvent[TRowData, TKey]
    
    var InitializedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.InitializedEvent[TRowData, TKey]
    
    var KeyDownEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.KeyDownEvent[TRowData, TKey]
    
    var NodesInitializedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.NodesInitializedEvent[TRowData, TKey]
    
    var OptionChangedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.OptionChangedEvent[TRowData, TKey]
    
    var Properties: typings.devextreme.mod.DevExpress.ui.dxTreeList.Properties[TRowData, TKey]
    
    var RowClickEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowClickEvent[TRowData, TKey]
    
    var RowCollapsedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowCollapsedEvent[TRowData, TKey]
    
    var RowCollapsingEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowCollapsingEvent[TRowData, TKey]
    
    var RowDblClickEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowDblClickEvent[TRowData, TKey]
    
    var RowDraggingAddEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowDraggingAddEvent[TRowData, TKey]
    
    var RowDraggingChangeEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowDraggingChangeEvent[TRowData, TKey]
    
    var RowDraggingEndEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowDraggingEndEvent[TRowData, TKey]
    
    var RowDraggingMoveEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowDraggingMoveEvent[TRowData, TKey]
    
    var RowDraggingRemoveEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowDraggingRemoveEvent[TRowData, TKey]
    
    var RowDraggingReorderEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowDraggingReorderEvent[TRowData, TKey]
    
    var RowDraggingStartEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowDraggingStartEvent[TRowData, TKey]
    
    var RowDraggingTemplateData: typings.devextreme.mod.DevExpress.common.grids.RowDraggingTemplateData[TRowData]
    
    var RowExpandedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowExpandedEvent[TRowData, TKey]
    
    var RowExpandingEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowExpandingEvent[TRowData, TKey]
    
    var RowInsertedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowInsertedEvent[TRowData, TKey]
    
    var RowInsertingEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowInsertingEvent[TRowData, TKey]
    
    var RowPreparedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowPreparedEvent[TRowData, TKey]
    
    var RowRemovedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowRemovedEvent[TRowData, TKey]
    
    var RowRemovingEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowRemovingEvent[TRowData, TKey]
    
    var RowUpdatedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowUpdatedEvent[TRowData, TKey]
    
    var RowUpdatingEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowUpdatingEvent[TRowData, TKey]
    
    var RowValidatingEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.RowValidatingEvent[TRowData, TKey]
    
    var SavedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.SavedEvent[TRowData, TKey]
    
    var SavingEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.SavingEvent[TRowData, TKey]
    
    var Scrolling: typings.devextreme.mod.DevExpress.ui.dxTreeList.Scrolling
    
    var Selection: typings.devextreme.mod.DevExpress.ui.dxTreeList.Selection
    
    var SelectionChangedEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.SelectionChangedEvent[TRowData, TKey]
    
    var Toolbar: typings.devextreme.mod.DevExpress.ui.dxTreeList.Toolbar
    
    var ToolbarItem: typings.devextreme.mod.DevExpress.ui.dxTreeList.ToolbarItem
    
    var ToolbarPreparingEvent: typings.devextreme.mod.DevExpress.ui.dxTreeList.ToolbarPreparingEvent[TRowData, TKey]
  }
  object ExplicitTypes {
    
    inline def apply[TRowData, TKey](
      AdaptiveDetailRowPreparingEvent: AdaptiveDetailRowPreparingEvent[TRowData, TKey],
      CellClickEvent: CellClickEvent[TRowData, TKey],
      CellDblClickEvent: CellDblClickEvent[TRowData, TKey],
      CellHoverChangedEvent: CellHoverChangedEvent[TRowData, TKey],
      CellPreparedEvent: CellPreparedEvent[TRowData, TKey],
      ColumnButtonClickEvent: ColumnButtonClickEvent[TRowData, TKey],
      ColumnButtonTemplateData: ColumnButtonTemplateData[TRowData, TKey],
      ColumnCellTemplateData: ColumnCellTemplateData[TRowData, TKey],
      ColumnEditCellTemplateData: ColumnEditCellTemplateData[TRowData, TKey],
      ContentReadyEvent: ContentReadyEvent[TRowData, TKey],
      ContextMenuPreparingEvent: ContextMenuPreparingEvent[TRowData, TKey],
      DataErrorOccurredEvent: DataErrorOccurredEvent[TRowData, TKey],
      DisposingEvent: DisposingEvent[TRowData, TKey],
      EditCanceledEvent: EditCanceledEvent[TRowData, TKey],
      EditCancelingEvent: EditCancelingEvent[TRowData, TKey],
      Editing: Editing[TRowData, TKey],
      EditingStartEvent: EditingStartEvent[TRowData, TKey],
      EditorPreparedEvent: EditorPreparedEvent[TRowData, TKey],
      EditorPreparingEvent: EditorPreparingEvent[TRowData, TKey],
      FocusedCellChangedEvent: FocusedCellChangedEvent[TRowData, TKey],
      FocusedCellChangingEvent: FocusedCellChangingEvent[TRowData, TKey],
      FocusedRowChangedEvent: FocusedRowChangedEvent[TRowData, TKey],
      FocusedRowChangingEvent: FocusedRowChangingEvent[TRowData, TKey],
      InitNewRowEvent: InitNewRowEvent[TRowData, TKey],
      InitializedEvent: InitializedEvent[TRowData, TKey],
      KeyDownEvent: KeyDownEvent[TRowData, TKey],
      NodesInitializedEvent: NodesInitializedEvent[TRowData, TKey],
      OptionChangedEvent: OptionChangedEvent[TRowData, TKey],
      Properties: Properties[TRowData, TKey],
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
      RowUpdatedEvent: RowUpdatedEvent[TRowData, TKey],
      RowUpdatingEvent: RowUpdatingEvent[TRowData, TKey],
      RowValidatingEvent: RowValidatingEvent[TRowData, TKey],
      SavedEvent: SavedEvent[TRowData, TKey],
      SavingEvent: SavingEvent[TRowData, TKey],
      Scrolling: Scrolling,
      Selection: Selection,
      SelectionChangedEvent: SelectionChangedEvent[TRowData, TKey],
      Toolbar: Toolbar,
      ToolbarItem: ToolbarItem,
      ToolbarPreparingEvent: ToolbarPreparingEvent[TRowData, TKey]
    ): ExplicitTypes[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(AdaptiveDetailRowPreparingEvent = AdaptiveDetailRowPreparingEvent.asInstanceOf[js.Any], CellClickEvent = CellClickEvent.asInstanceOf[js.Any], CellDblClickEvent = CellDblClickEvent.asInstanceOf[js.Any], CellHoverChangedEvent = CellHoverChangedEvent.asInstanceOf[js.Any], CellPreparedEvent = CellPreparedEvent.asInstanceOf[js.Any], ColumnButtonClickEvent = ColumnButtonClickEvent.asInstanceOf[js.Any], ColumnButtonTemplateData = ColumnButtonTemplateData.asInstanceOf[js.Any], ColumnCellTemplateData = ColumnCellTemplateData.asInstanceOf[js.Any], ColumnEditCellTemplateData = ColumnEditCellTemplateData.asInstanceOf[js.Any], ContentReadyEvent = ContentReadyEvent.asInstanceOf[js.Any], ContextMenuPreparingEvent = ContextMenuPreparingEvent.asInstanceOf[js.Any], DataErrorOccurredEvent = DataErrorOccurredEvent.asInstanceOf[js.Any], DisposingEvent = DisposingEvent.asInstanceOf[js.Any], EditCanceledEvent = EditCanceledEvent.asInstanceOf[js.Any], EditCancelingEvent = EditCancelingEvent.asInstanceOf[js.Any], Editing = Editing.asInstanceOf[js.Any], EditingStartEvent = EditingStartEvent.asInstanceOf[js.Any], EditorPreparedEvent = EditorPreparedEvent.asInstanceOf[js.Any], EditorPreparingEvent = EditorPreparingEvent.asInstanceOf[js.Any], FocusedCellChangedEvent = FocusedCellChangedEvent.asInstanceOf[js.Any], FocusedCellChangingEvent = FocusedCellChangingEvent.asInstanceOf[js.Any], FocusedRowChangedEvent = FocusedRowChangedEvent.asInstanceOf[js.Any], FocusedRowChangingEvent = FocusedRowChangingEvent.asInstanceOf[js.Any], InitNewRowEvent = InitNewRowEvent.asInstanceOf[js.Any], InitializedEvent = InitializedEvent.asInstanceOf[js.Any], KeyDownEvent = KeyDownEvent.asInstanceOf[js.Any], NodesInitializedEvent = NodesInitializedEvent.asInstanceOf[js.Any], OptionChangedEvent = OptionChangedEvent.asInstanceOf[js.Any], Properties = Properties.asInstanceOf[js.Any], RowClickEvent = RowClickEvent.asInstanceOf[js.Any], RowCollapsedEvent = RowCollapsedEvent.asInstanceOf[js.Any], RowCollapsingEvent = RowCollapsingEvent.asInstanceOf[js.Any], RowDblClickEvent = RowDblClickEvent.asInstanceOf[js.Any], RowDraggingAddEvent = RowDraggingAddEvent.asInstanceOf[js.Any], RowDraggingChangeEvent = RowDraggingChangeEvent.asInstanceOf[js.Any], RowDraggingEndEvent = RowDraggingEndEvent.asInstanceOf[js.Any], RowDraggingMoveEvent = RowDraggingMoveEvent.asInstanceOf[js.Any], RowDraggingRemoveEvent = RowDraggingRemoveEvent.asInstanceOf[js.Any], RowDraggingReorderEvent = RowDraggingReorderEvent.asInstanceOf[js.Any], RowDraggingStartEvent = RowDraggingStartEvent.asInstanceOf[js.Any], RowDraggingTemplateData = RowDraggingTemplateData.asInstanceOf[js.Any], RowExpandedEvent = RowExpandedEvent.asInstanceOf[js.Any], RowExpandingEvent = RowExpandingEvent.asInstanceOf[js.Any], RowInsertedEvent = RowInsertedEvent.asInstanceOf[js.Any], RowInsertingEvent = RowInsertingEvent.asInstanceOf[js.Any], RowPreparedEvent = RowPreparedEvent.asInstanceOf[js.Any], RowRemovedEvent = RowRemovedEvent.asInstanceOf[js.Any], RowRemovingEvent = RowRemovingEvent.asInstanceOf[js.Any], RowUpdatedEvent = RowUpdatedEvent.asInstanceOf[js.Any], RowUpdatingEvent = RowUpdatingEvent.asInstanceOf[js.Any], RowValidatingEvent = RowValidatingEvent.asInstanceOf[js.Any], SavedEvent = SavedEvent.asInstanceOf[js.Any], SavingEvent = SavingEvent.asInstanceOf[js.Any], Scrolling = Scrolling.asInstanceOf[js.Any], Selection = Selection.asInstanceOf[js.Any], SelectionChangedEvent = SelectionChangedEvent.asInstanceOf[js.Any], Toolbar = Toolbar.asInstanceOf[js.Any], ToolbarItem = ToolbarItem.asInstanceOf[js.Any], ToolbarPreparingEvent = ToolbarPreparingEvent.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExplicitTypes[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExplicitTypes[?, ?], TRowData, TKey] (val x: Self & (ExplicitTypes[TRowData, TKey])) extends AnyVal {
      
      inline def setAdaptiveDetailRowPreparingEvent(value: AdaptiveDetailRowPreparingEvent[TRowData, TKey]): Self = StObject.set(x, "AdaptiveDetailRowPreparingEvent", value.asInstanceOf[js.Any])
      
      inline def setCellClickEvent(value: CellClickEvent[TRowData, TKey]): Self = StObject.set(x, "CellClickEvent", value.asInstanceOf[js.Any])
      
      inline def setCellDblClickEvent(value: CellDblClickEvent[TRowData, TKey]): Self = StObject.set(x, "CellDblClickEvent", value.asInstanceOf[js.Any])
      
      inline def setCellHoverChangedEvent(value: CellHoverChangedEvent[TRowData, TKey]): Self = StObject.set(x, "CellHoverChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setCellPreparedEvent(value: CellPreparedEvent[TRowData, TKey]): Self = StObject.set(x, "CellPreparedEvent", value.asInstanceOf[js.Any])
      
      inline def setColumnButtonClickEvent(value: ColumnButtonClickEvent[TRowData, TKey]): Self = StObject.set(x, "ColumnButtonClickEvent", value.asInstanceOf[js.Any])
      
      inline def setColumnButtonTemplateData(value: ColumnButtonTemplateData[TRowData, TKey]): Self = StObject.set(x, "ColumnButtonTemplateData", value.asInstanceOf[js.Any])
      
      inline def setColumnCellTemplateData(value: ColumnCellTemplateData[TRowData, TKey]): Self = StObject.set(x, "ColumnCellTemplateData", value.asInstanceOf[js.Any])
      
      inline def setColumnEditCellTemplateData(value: ColumnEditCellTemplateData[TRowData, TKey]): Self = StObject.set(x, "ColumnEditCellTemplateData", value.asInstanceOf[js.Any])
      
      inline def setContentReadyEvent(value: ContentReadyEvent[TRowData, TKey]): Self = StObject.set(x, "ContentReadyEvent", value.asInstanceOf[js.Any])
      
      inline def setContextMenuPreparingEvent(value: ContextMenuPreparingEvent[TRowData, TKey]): Self = StObject.set(x, "ContextMenuPreparingEvent", value.asInstanceOf[js.Any])
      
      inline def setDataErrorOccurredEvent(value: DataErrorOccurredEvent[TRowData, TKey]): Self = StObject.set(x, "DataErrorOccurredEvent", value.asInstanceOf[js.Any])
      
      inline def setDisposingEvent(value: DisposingEvent[TRowData, TKey]): Self = StObject.set(x, "DisposingEvent", value.asInstanceOf[js.Any])
      
      inline def setEditCanceledEvent(value: EditCanceledEvent[TRowData, TKey]): Self = StObject.set(x, "EditCanceledEvent", value.asInstanceOf[js.Any])
      
      inline def setEditCancelingEvent(value: EditCancelingEvent[TRowData, TKey]): Self = StObject.set(x, "EditCancelingEvent", value.asInstanceOf[js.Any])
      
      inline def setEditing(value: Editing[TRowData, TKey]): Self = StObject.set(x, "Editing", value.asInstanceOf[js.Any])
      
      inline def setEditingStartEvent(value: EditingStartEvent[TRowData, TKey]): Self = StObject.set(x, "EditingStartEvent", value.asInstanceOf[js.Any])
      
      inline def setEditorPreparedEvent(value: EditorPreparedEvent[TRowData, TKey]): Self = StObject.set(x, "EditorPreparedEvent", value.asInstanceOf[js.Any])
      
      inline def setEditorPreparingEvent(value: EditorPreparingEvent[TRowData, TKey]): Self = StObject.set(x, "EditorPreparingEvent", value.asInstanceOf[js.Any])
      
      inline def setFocusedCellChangedEvent(value: FocusedCellChangedEvent[TRowData, TKey]): Self = StObject.set(x, "FocusedCellChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setFocusedCellChangingEvent(value: FocusedCellChangingEvent[TRowData, TKey]): Self = StObject.set(x, "FocusedCellChangingEvent", value.asInstanceOf[js.Any])
      
      inline def setFocusedRowChangedEvent(value: FocusedRowChangedEvent[TRowData, TKey]): Self = StObject.set(x, "FocusedRowChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setFocusedRowChangingEvent(value: FocusedRowChangingEvent[TRowData, TKey]): Self = StObject.set(x, "FocusedRowChangingEvent", value.asInstanceOf[js.Any])
      
      inline def setInitNewRowEvent(value: InitNewRowEvent[TRowData, TKey]): Self = StObject.set(x, "InitNewRowEvent", value.asInstanceOf[js.Any])
      
      inline def setInitializedEvent(value: InitializedEvent[TRowData, TKey]): Self = StObject.set(x, "InitializedEvent", value.asInstanceOf[js.Any])
      
      inline def setKeyDownEvent(value: KeyDownEvent[TRowData, TKey]): Self = StObject.set(x, "KeyDownEvent", value.asInstanceOf[js.Any])
      
      inline def setNodesInitializedEvent(value: NodesInitializedEvent[TRowData, TKey]): Self = StObject.set(x, "NodesInitializedEvent", value.asInstanceOf[js.Any])
      
      inline def setOptionChangedEvent(value: OptionChangedEvent[TRowData, TKey]): Self = StObject.set(x, "OptionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setProperties(value: Properties[TRowData, TKey]): Self = StObject.set(x, "Properties", value.asInstanceOf[js.Any])
      
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
      
      inline def setRowUpdatedEvent(value: RowUpdatedEvent[TRowData, TKey]): Self = StObject.set(x, "RowUpdatedEvent", value.asInstanceOf[js.Any])
      
      inline def setRowUpdatingEvent(value: RowUpdatingEvent[TRowData, TKey]): Self = StObject.set(x, "RowUpdatingEvent", value.asInstanceOf[js.Any])
      
      inline def setRowValidatingEvent(value: RowValidatingEvent[TRowData, TKey]): Self = StObject.set(x, "RowValidatingEvent", value.asInstanceOf[js.Any])
      
      inline def setSavedEvent(value: SavedEvent[TRowData, TKey]): Self = StObject.set(x, "SavedEvent", value.asInstanceOf[js.Any])
      
      inline def setSavingEvent(value: SavingEvent[TRowData, TKey]): Self = StObject.set(x, "SavingEvent", value.asInstanceOf[js.Any])
      
      inline def setScrolling(value: Scrolling): Self = StObject.set(x, "Scrolling", value.asInstanceOf[js.Any])
      
      inline def setSelection(value: Selection): Self = StObject.set(x, "Selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionChangedEvent(value: SelectionChangedEvent[TRowData, TKey]): Self = StObject.set(x, "SelectionChangedEvent", value.asInstanceOf[js.Any])
      
      inline def setToolbar(value: Toolbar): Self = StObject.set(x, "Toolbar", value.asInstanceOf[js.Any])
      
      inline def setToolbarItem(value: ToolbarItem): Self = StObject.set(x, "ToolbarItem", value.asInstanceOf[js.Any])
      
      inline def setToolbarPreparingEvent(value: ToolbarPreparingEvent[TRowData, TKey]): Self = StObject.set(x, "ToolbarPreparingEvent", value.asInstanceOf[js.Any])
    }
  }
  
  trait FocusedCellChangedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]] {
    
    val cellElement: DxElement_[HTMLElement]
    
    val column: Column[TRowData, TKey]
    
    val columnIndex: Double
    
    val row: Row[TRowData, TKey]
    
    val rowIndex: Double
  }
  object FocusedCellChangedEvent {
    
    inline def apply[TRowData, TKey](
      cellElement: DxElement_[HTMLElement],
      column: Column[TRowData, TKey],
      columnIndex: Double,
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement],
      row: Row[TRowData, TKey],
      rowIndex: Double
    ): FocusedCellChangedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cellElement = cellElement.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusedCellChangedEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusedCellChangedEvent[?, ?], TRowData, TKey] (val x: Self & (FocusedCellChangedEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setCellElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "cellElement", value.asInstanceOf[js.Any])
      
      inline def setColumn(value: Column[TRowData, TKey]): Self = StObject.set(x, "column", value.asInstanceOf[js.Any])
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait FocusedCellChangingEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with NativeEventInfo[dxTreeList[TRowData, TKey], KeyboardEvent | PointerEvent | MouseEvent | TouchEvent] {
    
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
      component: dxTreeList[TRowData, TKey],
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
       with EventInfo[dxTreeList[TRowData, TKey]] {
    
    val row: Row[TRowData, TKey]
    
    val rowElement: DxElement_[HTMLElement]
    
    val rowIndex: Double
  }
  object FocusedRowChangedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement],
      row: Row[TRowData, TKey],
      rowElement: DxElement_[HTMLElement],
      rowIndex: Double
    ): FocusedRowChangedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], rowElement = rowElement.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[FocusedRowChangedEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FocusedRowChangedEvent[?, ?], TRowData, TKey] (val x: Self & (FocusedRowChangedEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setRow(value: Row[TRowData, TKey]): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
      
      inline def setRowElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait FocusedRowChangingEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with NativeEventInfo[dxTreeList[TRowData, TKey], KeyboardEvent | PointerEvent | MouseEvent | TouchEvent] {
    
    var newRowIndex: Double
    
    val prevRowIndex: Double
    
    val rowElement: DxElement_[HTMLElement]
    
    val rows: js.Array[Row[TRowData, TKey]]
  }
  object FocusedRowChangingEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
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
  
  trait InitNewRowEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with NewRowInfo[TRowData]
  object InitNewRowEvent {
    
    inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey], data: TRowData, element: DxElement_[HTMLElement]): InitNewRowEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[InitNewRowEvent[TRowData, TKey]]
    }
  }
  
  type InitializedEvent[TRowData, TKey] = InitializedEventInfo[dxTreeList[TRowData, TKey]]
  
  trait KeyDownEvent[TRowData, TKey]
    extends StObject
       with NativeEventInfo[dxTreeList[TRowData, TKey], KeyboardEvent]
       with KeyDownInfo
  object KeyDownEvent {
    
    inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey], element: DxElement_[HTMLElement], handled: Boolean): KeyDownEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
      __obj.asInstanceOf[KeyDownEvent[TRowData, TKey]]
    }
  }
  
  trait Node[TRowData, TKey] extends StObject {
    
    /**
      * Contains all child nodes.
      */
    var children: js.UndefOr[js.Array[Node[TRowData, TKey]]] = js.undefined
    
    /**
      * The node&apos;s data object.
      */
    var data: js.UndefOr[TRowData] = js.undefined
    
    /**
      * Indicates whether the node has child nodes.
      */
    var hasChildren: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The node&apos;s key.
      */
    var key: TKey
    
    /**
      * The node&apos;s hierarchical level.
      */
    var level: Double
    
    /**
      * The parent node.
      */
    var parent: js.UndefOr[Node[TRowData, TKey]] = js.undefined
    
    /**
      * Indicates whether the node is visualized as a row.
      */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object Node {
    
    inline def apply[TRowData, TKey](key: TKey, level: Double): Node[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[Node[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Node[?, ?], TRowData, TKey] (val x: Self & (Node[TRowData, TKey])) extends AnyVal {
      
      inline def setChildren(value: js.Array[Node[TRowData, TKey]]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: (Node[TRowData, TKey])*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
      
      inline def setHasChildrenUndefined: Self = StObject.set(x, "hasChildren", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Node[TRowData, TKey]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  trait NodesInitializedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]] {
    
    val root: Node[TRowData, TKey]
  }
  object NodesInitializedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement],
      root: Node[TRowData, TKey]
    ): NodesInitializedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[NodesInitializedEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NodesInitializedEvent[?, ?], TRowData, TKey] (val x: Self & (NodesInitializedEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setRoot(value: Node[TRowData, TKey]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
  
  trait OptionChangedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with ChangedOptionInfo
  object OptionChangedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement],
      fullName: String,
      name: String
    ): OptionChangedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionChangedEvent[TRowData, TKey]]
    }
  }
  
  trait Paging
    extends StObject
       with PagingBase
  object Paging {
    
    inline def apply(): Paging = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Paging]
    }
  }
  
  /* Inlined devextreme.devextreme.DevExpress.ui.dxTreeListOptions<TRowData, TKey> */
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
      * Specifies whether all rows are expanded initially.
      */
    var autoExpandAll: js.UndefOr[Boolean] = js.undefined
    
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
    var columnChooser: js.UndefOr[ColumnChooser] = js.undefined
    
    /**
      * Configures column fixing.
      */
    var columnFixing: js.UndefOr[ColumnFixing] = js.undefined
    
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
      * Configures columns.
      */
    var columns: js.UndefOr[js.Array[ColumnBase[TRowData] | String]] = js.undefined
    
    /**
      * Customizes columns after they are created.
      */
    var customizeColumns: js.UndefOr[js.Function1[/* columns */ js.Array[Column[TRowData, TKey]], Unit]] = js.undefined
    
    /**
      * Binds the UI component to data.
      */
    var dataSource: js.UndefOr[(DataSourceLike[TRowData, TKey]) | Null] = js.undefined
    
    /**
      * Notifies the UI component of the used data structure.
      */
    var dataStructure: js.UndefOr[DataStructure] = js.undefined
    
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
    var editing: js.UndefOr[EditingBase[TRowData, TKey]] = js.undefined
    
    var elementAttr: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /**
      * Indicates whether to show the error row.
      */
    var errorRowEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether nodes appear expanded or collapsed after filtering is applied.
      */
    var expandNodesOnFiltering: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies keys of the initially expanded rows.
      */
    var expandedRowKeys: js.UndefOr[js.Array[TKey]] = js.undefined
    
    /**
      * Configures the integrated filter builder.
      */
    var filterBuilder: js.UndefOr[typings.devextreme.mod.DevExpress.ui.dxFilterBuilder.Properties] = js.undefined
    
    /**
      * Configures the popup in which the integrated filter builder is shown.
      */
    var filterBuilderPopup: js.UndefOr[typings.devextreme.mod.DevExpress.ui.dxPopup.Properties] = js.undefined
    
    /**
      * Specifies whether filter and search results should include matching rows only, matching rows with ancestors, or matching rows with ancestors and descendants (full branch).
      */
    var filterMode: js.UndefOr[TreeListFilterMode] = js.undefined
    
    /**
      * Configures the filter panel.
      */
    var filterPanel: js.UndefOr[FilterPanel[dxTreeList[TRowData, TKey], TRowData, TKey]] = js.undefined
    
    /**
      * Configures the filter row.
      */
    var filterRow: js.UndefOr[FilterRow] = js.undefined
    
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
      * Specifies which data field defines whether the node has children.
      */
    var hasItemsExpr: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * Configures the header filter feature.
      */
    var headerFilter: js.UndefOr[HeaderFilter] = js.undefined
    
    var height: js.UndefOr[Double | String | (js.Function0[Double | String])] = js.undefined
    
    /**
      * Specifies whether to highlight rows and cells with edited data. repaintChangesOnly should be true.
      */
    var highlightChanges: js.UndefOr[Boolean] = js.undefined
    
    var hint: js.UndefOr[String] = js.undefined
    
    var hoverStateEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies which data field contains nested items. Set this property when your data has a hierarchical structure.
      */
    var itemsExpr: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * Specifies the key property (or properties) that provide(s) key values to access data items. Each key value must be unique.
      */
    var keyExpr: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * Configures keyboard navigation.
      */
    var keyboardNavigation: js.UndefOr[KeyboardNavigation] = js.undefined
    
    /**
      * Configures the load panel.
      */
    var loadPanel: js.UndefOr[LoadPanel] = js.undefined
    
    /**
      * Specifies a text string shown when the widget does not display any data.
      */
    var noDataText: js.UndefOr[String] = js.undefined
    
    /**
      * A function that is executed before an adaptive detail row is rendered.
      */
    var onAdaptiveDetailRowPreparing: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & AdaptiveDetailRowPreparingInfo, 
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
    
    var onContentReady: js.UndefOr[js.Function1[/* e */ EventInfo[dxTreeList[TRowData, TKey]], Unit]] = js.undefined
    
    /**
      * A function that is executed before the context menu is rendered.
      */
    var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ ContextMenuPreparingEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is executed when an error occurs in the data source.
      */
    var onDataErrorOccurred: js.UndefOr[
        js.Function1[/* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & DataErrorOccurredInfo, Unit]
      ] = js.undefined
    
    var onDisposing: js.UndefOr[js.Function1[/* e */ EventInfo[dxTreeList[TRowData, TKey]], Unit]] = js.undefined
    
    /**
      * A function that is executed after row changes are discarded.
      */
    var onEditCanceled: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (DataChangeInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed when the edit operation is canceled, but row changes are not yet discarded.
      */
    var onEditCanceling: js.UndefOr[
        js.Function1[
          /* e */ Cancelable & (EventInfo[dxTreeList[TRowData, TKey]]) & (DataChangeInfo[TRowData, TKey]), 
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
      * A function that is executed after the focused cell changes. Applies only to cells in data rows.
      */
    var onFocusedCellChanged: js.UndefOr[js.Function1[/* e */ FocusedCellChangedEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is executed before the focused cell changes. Applies only to cells in data rows.
      */
    var onFocusedCellChanging: js.UndefOr[js.Function1[/* e */ FocusedCellChangingEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that executed when the focused row changes. Applies only to data rows. focusedRowEnabled should be true.
      */
    var onFocusedRowChanged: js.UndefOr[js.Function1[/* e */ FocusedRowChangedEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is executed before the focused row changes. Applies only to data rows. focusedRowEnabled should be true.
      */
    var onFocusedRowChanging: js.UndefOr[js.Function1[/* e */ FocusedRowChangingEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is executed before a new row is added to the UI component.
      */
    var onInitNewRow: js.UndefOr[
        js.Function1[/* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & NewRowInfo[TRowData], Unit]
      ] = js.undefined
    
    var onInitialized: js.UndefOr[js.Function1[/* e */ InitializedEventInfo[dxTreeList[TRowData, TKey]], Unit]] = js.undefined
    
    /**
      * A function that is executed when the UI component is in focus and a key has been pressed down.
      */
    var onKeyDown: js.UndefOr[
        js.Function1[
          /* e */ (NativeEventInfo[dxTreeList[TRowData, TKey], KeyboardEvent]) & KeyDownInfo, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed after the loaded nodes are initialized.
      */
    var onNodesInitialized: js.UndefOr[js.Function1[/* e */ NodesInitializedEvent[TRowData, TKey], Unit]] = js.undefined
    
    var onOptionChanged: js.UndefOr[js.Function1[/* e */ OptionChangedEventInfo[dxTreeList[TRowData, TKey]], Unit]] = js.undefined
    
    /**
      * A function that is executed when a grid row is clicked or tapped.
      */
    var onRowClick: js.UndefOr[js.Function1[/* e */ RowClickEvent[TRowData, TKey], Unit]] = js.undefined
    
    /**
      * A function that is executed after a row is collapsed.
      */
    var onRowCollapsed: js.UndefOr[
        js.Function1[/* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & RowKeyInfo[TKey], Unit]
      ] = js.undefined
    
    /**
      * A function that is executed before a row is collapsed.
      */
    var onRowCollapsing: js.UndefOr[
        js.Function1[
          /* e */ Cancelable & (EventInfo[dxTreeList[TRowData, TKey]]) & RowKeyInfo[TKey], 
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
        js.Function1[/* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & RowKeyInfo[TKey], Unit]
      ] = js.undefined
    
    /**
      * A function that is executed before a row is expanded.
      */
    var onRowExpanding: js.UndefOr[
        js.Function1[
          /* e */ Cancelable & (EventInfo[dxTreeList[TRowData, TKey]]) & RowKeyInfo[TKey], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed after a new row has been inserted into the data source.
      */
    var onRowInserted: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (RowInsertedInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed before a new row is inserted into the data source.
      */
    var onRowInserting: js.UndefOr[
        js.Function1[/* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & RowInsertingInfo[TRowData], Unit]
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
          /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (RowRemovedInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed before a row is removed from the data source.
      */
    var onRowRemoving: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (RowRemovingInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed after a row has been updated in the data source.
      */
    var onRowUpdated: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (RowUpdatedInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed before a row is updated in the data source.
      */
    var onRowUpdating: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (RowUpdatingInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed after cells in a row are validated against validation rules.
      */
    var onRowValidating: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (RowValidatingInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed after row changes are saved.
      */
    var onSaved: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (DataChangeInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed before pending row changes are saved.
      */
    var onSaving: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (SavingInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed after selecting a row or clearing its selection.
      */
    var onSelectionChanged: js.UndefOr[
        js.Function1[
          /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (SelectionChangedInfo[TRowData, TKey]), 
          Unit
        ]
      ] = js.undefined
    
    /**
      * A function that is executed before the toolbar is created.
      */
    var onToolbarPreparing: js.UndefOr[
        js.Function1[/* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & ToolbarPreparingInfo, Unit]
      ] = js.undefined
    
    /**
      * Configures the pager.
      */
    var pager: js.UndefOr[Pager] = js.undefined
    
    /**
      * Configures paging.
      */
    var paging: js.UndefOr[PagingBase] = js.undefined
    
    /**
      * Specifies which data field provides parent keys.
      */
    var parentIdExpr: js.UndefOr[String | js.Function] = js.undefined
    
    /**
      * Notifies the TreeList of the server&apos;s data processing operations. Applies only if data has a plain structure.
      */
    var remoteOperations: js.UndefOr[Grouping | Mode] = js.undefined
    
    /**
      * Specifies whether to render the filter row, command columns, and columns with showEditorAlways set to true after other elements.
      */
    var renderAsync: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies whether to repaint only those cells whose data changed.
      */
    var repaintChangesOnly: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Specifies the root node&apos;s identifier. Applies if dataStructure is &apos;plain&apos;.
      */
    var rootValue: js.UndefOr[TKey] = js.undefined
    
    /**
      * Specifies whether rows should be shaded differently.
      */
    var rowAlternationEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configures row reordering using drag and drop gestures.
      */
    var rowDragging: js.UndefOr[RowDragging[dxTreeList[TRowData, TKey], TRowData, TKey]] = js.undefined
    
    var rtlEnabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * 
      */
    /**
      * Configures scrolling.
      */
    var scrolling: js.UndefOr[ScrollingBase] = js.undefined
    
    /**
      * Configures the search panel.
      */
    var searchPanel: js.UndefOr[SearchPanel] = js.undefined
    
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
    var selection: js.UndefOr[SelectionBase] = js.undefined
    
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
      * Configures runtime sorting.
      */
    var sorting: js.UndefOr[Sorting] = js.undefined
    
    /**
      * Configures state storing.
      */
    var stateStoring: js.UndefOr[StateStoring] = js.undefined
    
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
      
      inline def setAutoExpandAll(value: Boolean): Self = StObject.set(x, "autoExpandAll", value.asInstanceOf[js.Any])
      
      inline def setAutoExpandAllUndefined: Self = StObject.set(x, "autoExpandAll", js.undefined)
      
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
      
      inline def setColumnChooser(value: ColumnChooser): Self = StObject.set(x, "columnChooser", value.asInstanceOf[js.Any])
      
      inline def setColumnChooserUndefined: Self = StObject.set(x, "columnChooser", js.undefined)
      
      inline def setColumnFixing(value: ColumnFixing): Self = StObject.set(x, "columnFixing", value.asInstanceOf[js.Any])
      
      inline def setColumnFixingUndefined: Self = StObject.set(x, "columnFixing", js.undefined)
      
      inline def setColumnHidingEnabled(value: Boolean): Self = StObject.set(x, "columnHidingEnabled", value.asInstanceOf[js.Any])
      
      inline def setColumnHidingEnabledUndefined: Self = StObject.set(x, "columnHidingEnabled", js.undefined)
      
      inline def setColumnMinWidth(value: Double): Self = StObject.set(x, "columnMinWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnMinWidthUndefined: Self = StObject.set(x, "columnMinWidth", js.undefined)
      
      inline def setColumnResizingMode(value: ColumnResizeMode): Self = StObject.set(x, "columnResizingMode", value.asInstanceOf[js.Any])
      
      inline def setColumnResizingModeUndefined: Self = StObject.set(x, "columnResizingMode", js.undefined)
      
      inline def setColumnWidth(value: Double | Mode): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setColumns(value: js.Array[ColumnBase[TRowData] | String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setColumnsVarargs(value: (ColumnBase[TRowData] | String)*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setCustomizeColumns(value: /* columns */ js.Array[Column[TRowData, TKey]] => Unit): Self = StObject.set(x, "customizeColumns", js.Any.fromFunction1(value))
      
      inline def setCustomizeColumnsUndefined: Self = StObject.set(x, "customizeColumns", js.undefined)
      
      inline def setDataSource(value: DataSourceLike[TRowData, TKey]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDataSourceVarargs(value: TRowData*): Self = StObject.set(x, "dataSource", js.Array(value*))
      
      inline def setDataStructure(value: DataStructure): Self = StObject.set(x, "dataStructure", value.asInstanceOf[js.Any])
      
      inline def setDataStructureUndefined: Self = StObject.set(x, "dataStructure", js.undefined)
      
      inline def setDateSerializationFormat(value: String): Self = StObject.set(x, "dateSerializationFormat", value.asInstanceOf[js.Any])
      
      inline def setDateSerializationFormatUndefined: Self = StObject.set(x, "dateSerializationFormat", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setEditing(value: EditingBase[TRowData, TKey]): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
      
      inline def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
      
      inline def setElementAttr(value: StringDictionary[Any]): Self = StObject.set(x, "elementAttr", value.asInstanceOf[js.Any])
      
      inline def setElementAttrUndefined: Self = StObject.set(x, "elementAttr", js.undefined)
      
      inline def setErrorRowEnabled(value: Boolean): Self = StObject.set(x, "errorRowEnabled", value.asInstanceOf[js.Any])
      
      inline def setErrorRowEnabledUndefined: Self = StObject.set(x, "errorRowEnabled", js.undefined)
      
      inline def setExpandNodesOnFiltering(value: Boolean): Self = StObject.set(x, "expandNodesOnFiltering", value.asInstanceOf[js.Any])
      
      inline def setExpandNodesOnFilteringUndefined: Self = StObject.set(x, "expandNodesOnFiltering", js.undefined)
      
      inline def setExpandedRowKeys(value: js.Array[TKey]): Self = StObject.set(x, "expandedRowKeys", value.asInstanceOf[js.Any])
      
      inline def setExpandedRowKeysUndefined: Self = StObject.set(x, "expandedRowKeys", js.undefined)
      
      inline def setExpandedRowKeysVarargs(value: TKey*): Self = StObject.set(x, "expandedRowKeys", js.Array(value*))
      
      inline def setFilterBuilder(value: typings.devextreme.mod.DevExpress.ui.dxFilterBuilder.Properties): Self = StObject.set(x, "filterBuilder", value.asInstanceOf[js.Any])
      
      inline def setFilterBuilderPopup(value: typings.devextreme.mod.DevExpress.ui.dxPopup.Properties): Self = StObject.set(x, "filterBuilderPopup", value.asInstanceOf[js.Any])
      
      inline def setFilterBuilderPopupUndefined: Self = StObject.set(x, "filterBuilderPopup", js.undefined)
      
      inline def setFilterBuilderUndefined: Self = StObject.set(x, "filterBuilder", js.undefined)
      
      inline def setFilterMode(value: TreeListFilterMode): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
      
      inline def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
      
      inline def setFilterPanel(value: FilterPanel[dxTreeList[TRowData, TKey], TRowData, TKey]): Self = StObject.set(x, "filterPanel", value.asInstanceOf[js.Any])
      
      inline def setFilterPanelUndefined: Self = StObject.set(x, "filterPanel", js.undefined)
      
      inline def setFilterRow(value: FilterRow): Self = StObject.set(x, "filterRow", value.asInstanceOf[js.Any])
      
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
      
      inline def setHasItemsExpr(value: String | js.Function): Self = StObject.set(x, "hasItemsExpr", value.asInstanceOf[js.Any])
      
      inline def setHasItemsExprUndefined: Self = StObject.set(x, "hasItemsExpr", js.undefined)
      
      inline def setHeaderFilter(value: HeaderFilter): Self = StObject.set(x, "headerFilter", value.asInstanceOf[js.Any])
      
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
      
      inline def setItemsExpr(value: String | js.Function): Self = StObject.set(x, "itemsExpr", value.asInstanceOf[js.Any])
      
      inline def setItemsExprUndefined: Self = StObject.set(x, "itemsExpr", js.undefined)
      
      inline def setKeyExpr(value: String | js.Function): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
      
      inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
      
      inline def setKeyboardNavigation(value: KeyboardNavigation): Self = StObject.set(x, "keyboardNavigation", value.asInstanceOf[js.Any])
      
      inline def setKeyboardNavigationUndefined: Self = StObject.set(x, "keyboardNavigation", js.undefined)
      
      inline def setLoadPanel(value: LoadPanel): Self = StObject.set(x, "loadPanel", value.asInstanceOf[js.Any])
      
      inline def setLoadPanelUndefined: Self = StObject.set(x, "loadPanel", js.undefined)
      
      inline def setNoDataText(value: String): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
      
      inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
      
      inline def setOnAdaptiveDetailRowPreparing(value: /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & AdaptiveDetailRowPreparingInfo => Unit): Self = StObject.set(x, "onAdaptiveDetailRowPreparing", js.Any.fromFunction1(value))
      
      inline def setOnAdaptiveDetailRowPreparingUndefined: Self = StObject.set(x, "onAdaptiveDetailRowPreparing", js.undefined)
      
      inline def setOnCellClick(value: /* e */ CellClickEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction1(value))
      
      inline def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
      
      inline def setOnCellDblClick(value: /* e */ CellDblClickEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onCellDblClick", js.Any.fromFunction1(value))
      
      inline def setOnCellDblClickUndefined: Self = StObject.set(x, "onCellDblClick", js.undefined)
      
      inline def setOnCellHoverChanged(value: /* e */ CellHoverChangedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onCellHoverChanged", js.Any.fromFunction1(value))
      
      inline def setOnCellHoverChangedUndefined: Self = StObject.set(x, "onCellHoverChanged", js.undefined)
      
      inline def setOnCellPrepared(value: /* e */ CellPreparedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onCellPrepared", js.Any.fromFunction1(value))
      
      inline def setOnCellPreparedUndefined: Self = StObject.set(x, "onCellPrepared", js.undefined)
      
      inline def setOnContentReady(value: /* e */ EventInfo[dxTreeList[TRowData, TKey]] => Unit): Self = StObject.set(x, "onContentReady", js.Any.fromFunction1(value))
      
      inline def setOnContentReadyUndefined: Self = StObject.set(x, "onContentReady", js.undefined)
      
      inline def setOnContextMenuPreparing(value: /* e */ ContextMenuPreparingEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onContextMenuPreparing", js.Any.fromFunction1(value))
      
      inline def setOnContextMenuPreparingUndefined: Self = StObject.set(x, "onContextMenuPreparing", js.undefined)
      
      inline def setOnDataErrorOccurred(value: /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & DataErrorOccurredInfo => Unit): Self = StObject.set(x, "onDataErrorOccurred", js.Any.fromFunction1(value))
      
      inline def setOnDataErrorOccurredUndefined: Self = StObject.set(x, "onDataErrorOccurred", js.undefined)
      
      inline def setOnDisposing(value: /* e */ EventInfo[dxTreeList[TRowData, TKey]] => Unit): Self = StObject.set(x, "onDisposing", js.Any.fromFunction1(value))
      
      inline def setOnDisposingUndefined: Self = StObject.set(x, "onDisposing", js.undefined)
      
      inline def setOnEditCanceled(value: /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (DataChangeInfo[TRowData, TKey]) => Unit): Self = StObject.set(x, "onEditCanceled", js.Any.fromFunction1(value))
      
      inline def setOnEditCanceledUndefined: Self = StObject.set(x, "onEditCanceled", js.undefined)
      
      inline def setOnEditCanceling(
        value: /* e */ Cancelable & (EventInfo[dxTreeList[TRowData, TKey]]) & (DataChangeInfo[TRowData, TKey]) => Unit
      ): Self = StObject.set(x, "onEditCanceling", js.Any.fromFunction1(value))
      
      inline def setOnEditCancelingUndefined: Self = StObject.set(x, "onEditCanceling", js.undefined)
      
      inline def setOnEditingStart(value: /* e */ EditingStartEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onEditingStart", js.Any.fromFunction1(value))
      
      inline def setOnEditingStartUndefined: Self = StObject.set(x, "onEditingStart", js.undefined)
      
      inline def setOnEditorPrepared(value: /* options */ EditorPreparedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onEditorPrepared", js.Any.fromFunction1(value))
      
      inline def setOnEditorPreparedUndefined: Self = StObject.set(x, "onEditorPrepared", js.undefined)
      
      inline def setOnEditorPreparing(value: /* e */ EditorPreparingEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onEditorPreparing", js.Any.fromFunction1(value))
      
      inline def setOnEditorPreparingUndefined: Self = StObject.set(x, "onEditorPreparing", js.undefined)
      
      inline def setOnFocusedCellChanged(value: /* e */ FocusedCellChangedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onFocusedCellChanged", js.Any.fromFunction1(value))
      
      inline def setOnFocusedCellChangedUndefined: Self = StObject.set(x, "onFocusedCellChanged", js.undefined)
      
      inline def setOnFocusedCellChanging(value: /* e */ FocusedCellChangingEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onFocusedCellChanging", js.Any.fromFunction1(value))
      
      inline def setOnFocusedCellChangingUndefined: Self = StObject.set(x, "onFocusedCellChanging", js.undefined)
      
      inline def setOnFocusedRowChanged(value: /* e */ FocusedRowChangedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onFocusedRowChanged", js.Any.fromFunction1(value))
      
      inline def setOnFocusedRowChangedUndefined: Self = StObject.set(x, "onFocusedRowChanged", js.undefined)
      
      inline def setOnFocusedRowChanging(value: /* e */ FocusedRowChangingEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onFocusedRowChanging", js.Any.fromFunction1(value))
      
      inline def setOnFocusedRowChangingUndefined: Self = StObject.set(x, "onFocusedRowChanging", js.undefined)
      
      inline def setOnInitNewRow(value: /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & NewRowInfo[TRowData] => Unit): Self = StObject.set(x, "onInitNewRow", js.Any.fromFunction1(value))
      
      inline def setOnInitNewRowUndefined: Self = StObject.set(x, "onInitNewRow", js.undefined)
      
      inline def setOnInitialized(value: /* e */ InitializedEventInfo[dxTreeList[TRowData, TKey]] => Unit): Self = StObject.set(x, "onInitialized", js.Any.fromFunction1(value))
      
      inline def setOnInitializedUndefined: Self = StObject.set(x, "onInitialized", js.undefined)
      
      inline def setOnKeyDown(value: /* e */ (NativeEventInfo[dxTreeList[TRowData, TKey], KeyboardEvent]) & KeyDownInfo => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnNodesInitialized(value: /* e */ NodesInitializedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onNodesInitialized", js.Any.fromFunction1(value))
      
      inline def setOnNodesInitializedUndefined: Self = StObject.set(x, "onNodesInitialized", js.undefined)
      
      inline def setOnOptionChanged(value: /* e */ OptionChangedEventInfo[dxTreeList[TRowData, TKey]] => Unit): Self = StObject.set(x, "onOptionChanged", js.Any.fromFunction1(value))
      
      inline def setOnOptionChangedUndefined: Self = StObject.set(x, "onOptionChanged", js.undefined)
      
      inline def setOnRowClick(value: /* e */ RowClickEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction1(value))
      
      inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
      
      inline def setOnRowCollapsed(value: /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & RowKeyInfo[TKey] => Unit): Self = StObject.set(x, "onRowCollapsed", js.Any.fromFunction1(value))
      
      inline def setOnRowCollapsedUndefined: Self = StObject.set(x, "onRowCollapsed", js.undefined)
      
      inline def setOnRowCollapsing(value: /* e */ Cancelable & (EventInfo[dxTreeList[TRowData, TKey]]) & RowKeyInfo[TKey] => Unit): Self = StObject.set(x, "onRowCollapsing", js.Any.fromFunction1(value))
      
      inline def setOnRowCollapsingUndefined: Self = StObject.set(x, "onRowCollapsing", js.undefined)
      
      inline def setOnRowDblClick(value: /* e */ RowDblClickEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onRowDblClick", js.Any.fromFunction1(value))
      
      inline def setOnRowDblClickUndefined: Self = StObject.set(x, "onRowDblClick", js.undefined)
      
      inline def setOnRowExpanded(value: /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & RowKeyInfo[TKey] => Unit): Self = StObject.set(x, "onRowExpanded", js.Any.fromFunction1(value))
      
      inline def setOnRowExpandedUndefined: Self = StObject.set(x, "onRowExpanded", js.undefined)
      
      inline def setOnRowExpanding(value: /* e */ Cancelable & (EventInfo[dxTreeList[TRowData, TKey]]) & RowKeyInfo[TKey] => Unit): Self = StObject.set(x, "onRowExpanding", js.Any.fromFunction1(value))
      
      inline def setOnRowExpandingUndefined: Self = StObject.set(x, "onRowExpanding", js.undefined)
      
      inline def setOnRowInserted(value: /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (RowInsertedInfo[TRowData, TKey]) => Unit): Self = StObject.set(x, "onRowInserted", js.Any.fromFunction1(value))
      
      inline def setOnRowInsertedUndefined: Self = StObject.set(x, "onRowInserted", js.undefined)
      
      inline def setOnRowInserting(value: /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & RowInsertingInfo[TRowData] => Unit): Self = StObject.set(x, "onRowInserting", js.Any.fromFunction1(value))
      
      inline def setOnRowInsertingUndefined: Self = StObject.set(x, "onRowInserting", js.undefined)
      
      inline def setOnRowPrepared(value: /* e */ RowPreparedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onRowPrepared", js.Any.fromFunction1(value))
      
      inline def setOnRowPreparedUndefined: Self = StObject.set(x, "onRowPrepared", js.undefined)
      
      inline def setOnRowRemoved(value: /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (RowRemovedInfo[TRowData, TKey]) => Unit): Self = StObject.set(x, "onRowRemoved", js.Any.fromFunction1(value))
      
      inline def setOnRowRemovedUndefined: Self = StObject.set(x, "onRowRemoved", js.undefined)
      
      inline def setOnRowRemoving(value: /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (RowRemovingInfo[TRowData, TKey]) => Unit): Self = StObject.set(x, "onRowRemoving", js.Any.fromFunction1(value))
      
      inline def setOnRowRemovingUndefined: Self = StObject.set(x, "onRowRemoving", js.undefined)
      
      inline def setOnRowUpdated(value: /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (RowUpdatedInfo[TRowData, TKey]) => Unit): Self = StObject.set(x, "onRowUpdated", js.Any.fromFunction1(value))
      
      inline def setOnRowUpdatedUndefined: Self = StObject.set(x, "onRowUpdated", js.undefined)
      
      inline def setOnRowUpdating(value: /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (RowUpdatingInfo[TRowData, TKey]) => Unit): Self = StObject.set(x, "onRowUpdating", js.Any.fromFunction1(value))
      
      inline def setOnRowUpdatingUndefined: Self = StObject.set(x, "onRowUpdating", js.undefined)
      
      inline def setOnRowValidating(
        value: /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (RowValidatingInfo[TRowData, TKey]) => Unit
      ): Self = StObject.set(x, "onRowValidating", js.Any.fromFunction1(value))
      
      inline def setOnRowValidatingUndefined: Self = StObject.set(x, "onRowValidating", js.undefined)
      
      inline def setOnSaved(value: /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (DataChangeInfo[TRowData, TKey]) => Unit): Self = StObject.set(x, "onSaved", js.Any.fromFunction1(value))
      
      inline def setOnSavedUndefined: Self = StObject.set(x, "onSaved", js.undefined)
      
      inline def setOnSaving(value: /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (SavingInfo[TRowData, TKey]) => Unit): Self = StObject.set(x, "onSaving", js.Any.fromFunction1(value))
      
      inline def setOnSavingUndefined: Self = StObject.set(x, "onSaving", js.undefined)
      
      inline def setOnSelectionChanged(
        value: /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & (SelectionChangedInfo[TRowData, TKey]) => Unit
      ): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1(value))
      
      inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
      
      inline def setOnToolbarPreparing(value: /* e */ (EventInfo[dxTreeList[TRowData, TKey]]) & ToolbarPreparingInfo => Unit): Self = StObject.set(x, "onToolbarPreparing", js.Any.fromFunction1(value))
      
      inline def setOnToolbarPreparingUndefined: Self = StObject.set(x, "onToolbarPreparing", js.undefined)
      
      inline def setPager(value: Pager): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
      
      inline def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
      
      inline def setPaging(value: PagingBase): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
      
      inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
      
      inline def setParentIdExpr(value: String | js.Function): Self = StObject.set(x, "parentIdExpr", value.asInstanceOf[js.Any])
      
      inline def setParentIdExprUndefined: Self = StObject.set(x, "parentIdExpr", js.undefined)
      
      inline def setRemoteOperations(value: Grouping | Mode): Self = StObject.set(x, "remoteOperations", value.asInstanceOf[js.Any])
      
      inline def setRemoteOperationsUndefined: Self = StObject.set(x, "remoteOperations", js.undefined)
      
      inline def setRenderAsync(value: Boolean): Self = StObject.set(x, "renderAsync", value.asInstanceOf[js.Any])
      
      inline def setRenderAsyncUndefined: Self = StObject.set(x, "renderAsync", js.undefined)
      
      inline def setRepaintChangesOnly(value: Boolean): Self = StObject.set(x, "repaintChangesOnly", value.asInstanceOf[js.Any])
      
      inline def setRepaintChangesOnlyUndefined: Self = StObject.set(x, "repaintChangesOnly", js.undefined)
      
      inline def setRootValue(value: TKey): Self = StObject.set(x, "rootValue", value.asInstanceOf[js.Any])
      
      inline def setRootValueUndefined: Self = StObject.set(x, "rootValue", js.undefined)
      
      inline def setRowAlternationEnabled(value: Boolean): Self = StObject.set(x, "rowAlternationEnabled", value.asInstanceOf[js.Any])
      
      inline def setRowAlternationEnabledUndefined: Self = StObject.set(x, "rowAlternationEnabled", js.undefined)
      
      inline def setRowDragging(value: RowDragging[dxTreeList[TRowData, TKey], TRowData, TKey]): Self = StObject.set(x, "rowDragging", value.asInstanceOf[js.Any])
      
      inline def setRowDraggingUndefined: Self = StObject.set(x, "rowDragging", js.undefined)
      
      inline def setRtlEnabled(value: Boolean): Self = StObject.set(x, "rtlEnabled", value.asInstanceOf[js.Any])
      
      inline def setRtlEnabledUndefined: Self = StObject.set(x, "rtlEnabled", js.undefined)
      
      inline def setScrolling(value: ScrollingBase): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
      
      inline def setSearchPanel(value: SearchPanel): Self = StObject.set(x, "searchPanel", value.asInstanceOf[js.Any])
      
      inline def setSearchPanelUndefined: Self = StObject.set(x, "searchPanel", js.undefined)
      
      inline def setSelectedRowKeys(value: js.Array[TKey]): Self = StObject.set(x, "selectedRowKeys", value.asInstanceOf[js.Any])
      
      inline def setSelectedRowKeysUndefined: Self = StObject.set(x, "selectedRowKeys", js.undefined)
      
      inline def setSelectedRowKeysVarargs(value: TKey*): Self = StObject.set(x, "selectedRowKeys", js.Array(value*))
      
      inline def setSelection(value: SelectionBase): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      inline def setShowBorders(value: Boolean): Self = StObject.set(x, "showBorders", value.asInstanceOf[js.Any])
      
      inline def setShowBordersUndefined: Self = StObject.set(x, "showBorders", js.undefined)
      
      inline def setShowColumnHeaders(value: Boolean): Self = StObject.set(x, "showColumnHeaders", value.asInstanceOf[js.Any])
      
      inline def setShowColumnHeadersUndefined: Self = StObject.set(x, "showColumnHeaders", js.undefined)
      
      inline def setShowColumnLines(value: Boolean): Self = StObject.set(x, "showColumnLines", value.asInstanceOf[js.Any])
      
      inline def setShowColumnLinesUndefined: Self = StObject.set(x, "showColumnLines", js.undefined)
      
      inline def setShowRowLines(value: Boolean): Self = StObject.set(x, "showRowLines", value.asInstanceOf[js.Any])
      
      inline def setShowRowLinesUndefined: Self = StObject.set(x, "showRowLines", js.undefined)
      
      inline def setSorting(value: Sorting): Self = StObject.set(x, "sorting", value.asInstanceOf[js.Any])
      
      inline def setSortingUndefined: Self = StObject.set(x, "sorting", js.undefined)
      
      inline def setStateStoring(value: StateStoring): Self = StObject.set(x, "stateStoring", value.asInstanceOf[js.Any])
      
      inline def setStateStoringUndefined: Self = StObject.set(x, "stateStoring", js.undefined)
      
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
      * A data object that the row visualizes.
      */
    val data: TRowData
    
    /**
      * Indicates whether the row is in the editing state.
      */
    val isEditing: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether the row is expanded or collapsed. Available if rowType is &apos;data&apos;.
      */
    val isExpanded: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates that the row is added, but not yet saved. Available if rowType is &apos;data&apos;.
      */
    val isNewRow: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Indicates whether the row is selected. Available if rowType is &apos;data&apos; or &apos;detail&apos;.
      */
    val isSelected: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The row&apos;s key. Available if rowType is &apos;data&apos;, &apos;detail&apos; or &apos;detailAdaptive&apos;.
      */
    val key: TKey
    
    /**
      * The row&apos;s hierarchical level. Available if rowType is &apos;data&apos; or &apos;detail&apos;.
      */
    val level: Double
    
    /**
      * The row&apos;s node. Available if rowType is &apos;data&apos; or &apos;detail&apos;.
      */
    val node: Node[TRowData, TKey]
    
    /**
      * The row&apos;s visible index. This index is zero-based and available if rowType is &apos;data&apos;, &apos;detail&apos; or &apos;detailAdaptive&apos;.
      */
    val rowIndex: Double
    
    /**
      * The row&apos;s type.
      */
    val rowType: String
    
    /**
      * Values displayed in the row&apos;s cells.
      */
    val values: js.Array[Any]
  }
  object Row {
    
    inline def apply[TRowData, TKey](
      data: TRowData,
      key: TKey,
      level: Double,
      node: Node[TRowData, TKey],
      rowIndex: Double,
      rowType: String,
      values: js.Array[Any]
    ): Row[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[Row[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Row[?, ?], TRowData, TKey] (val x: Self & (Row[TRowData, TKey])) extends AnyVal {
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
      
      inline def setIsEditingUndefined: Self = StObject.set(x, "isEditing", js.undefined)
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsNewRow(value: Boolean): Self = StObject.set(x, "isNewRow", value.asInstanceOf[js.Any])
      
      inline def setIsNewRowUndefined: Self = StObject.set(x, "isNewRow", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node[TRowData, TKey]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait RowClickEvent[TRowData, TKey]
    extends StObject
       with NativeEventInfo[dxTreeList[TRowData, TKey], PointerEvent | MouseEvent] {
    
    val columns: js.Array[Column[TRowData, TKey]]
    
    val data: TRowData
    
    val handled: Boolean
    
    val isExpanded: js.UndefOr[Boolean] = js.undefined
    
    val isNewRow: js.UndefOr[Boolean] = js.undefined
    
    val isSelected: js.UndefOr[Boolean] = js.undefined
    
    val key: TKey
    
    val level: Double
    
    val node: Node[TRowData, TKey]
    
    val rowElement: DxElement_[HTMLElement]
    
    val rowIndex: Double
    
    val rowType: String
    
    val values: js.Array[Any]
  }
  object RowClickEvent {
    
    inline def apply[TRowData, TKey](
      columns: js.Array[Column[TRowData, TKey]],
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      handled: Boolean,
      key: TKey,
      level: Double,
      node: Node[TRowData, TKey],
      rowElement: DxElement_[HTMLElement],
      rowIndex: Double,
      rowType: String,
      values: js.Array[Any]
    ): RowClickEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rowElement = rowElement.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowClickEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowClickEvent[?, ?], TRowData, TKey] (val x: Self & (RowClickEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setColumns(value: js.Array[Column[TRowData, TKey]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (Column[TRowData, TKey])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsNewRow(value: Boolean): Self = StObject.set(x, "isNewRow", value.asInstanceOf[js.Any])
      
      inline def setIsNewRowUndefined: Self = StObject.set(x, "isNewRow", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node[TRowData, TKey]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setRowElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait RowCollapsedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowKeyInfo[TKey]
  object RowCollapsedEvent {
    
    inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey], element: DxElement_[HTMLElement], key: TKey): RowCollapsedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowCollapsedEvent[TRowData, TKey]]
    }
  }
  
  trait RowCollapsingEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowKeyInfo[TKey]
  object RowCollapsingEvent {
    
    inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey], element: DxElement_[HTMLElement], key: TKey): RowCollapsingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowCollapsingEvent[TRowData, TKey]]
    }
  }
  
  trait RowDblClickEvent[TRowData, TKey]
    extends StObject
       with NativeEventInfo[dxTreeList[TRowData, TKey], PointerEvent | MouseEvent] {
    
    val columns: js.Array[Column[TRowData, TKey]]
    
    val data: TRowData
    
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
      component: dxTreeList[TRowData, TKey],
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
  
  /* Inlined devextreme.devextreme.DevExpress.common.ReducedNativeEventInfo<devextreme.devextreme.DevExpress.ui.dxTreeList<TRowData, TKey>> & devextreme.devextreme.DevExpress.common.grids.RowDraggingEventInfo<TRowData> & devextreme.devextreme.DevExpress.common.grids.DragDropInfo */
  trait RowDraggingAddEvent[TRowData, TKey] extends StObject {
    
    var component: dxTreeList[TRowData, TKey]
    
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
      component: dxTreeList[TRowData, TKey],
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
      
      inline def setComponent(value: dxTreeList[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined devextreme.devextreme.DevExpress.events.Cancelable & devextreme.devextreme.DevExpress.common.ReducedNativeEventInfo<devextreme.devextreme.DevExpress.ui.dxTreeList<TRowData, TKey>> & devextreme.devextreme.DevExpress.common.grids.RowDraggingEventInfo<TRowData> & devextreme.devextreme.DevExpress.common.grids.DragDropInfo */
  trait RowDraggingChangeEvent[TRowData, TKey] extends StObject {
    
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    var component: dxTreeList[TRowData, TKey]
    
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
      component: dxTreeList[TRowData, TKey],
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
      
      inline def setComponent(value: dxTreeList[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined devextreme.devextreme.DevExpress.events.Cancelable & devextreme.devextreme.DevExpress.common.ReducedNativeEventInfo<devextreme.devextreme.DevExpress.ui.dxTreeList<TRowData, TKey>> & devextreme.devextreme.DevExpress.common.grids.RowDraggingEventInfo<TRowData> & devextreme.devextreme.DevExpress.common.grids.DragDropInfo */
  trait RowDraggingEndEvent[TRowData, TKey] extends StObject {
    
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    var component: dxTreeList[TRowData, TKey]
    
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
      component: dxTreeList[TRowData, TKey],
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
      
      inline def setComponent(value: dxTreeList[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined devextreme.devextreme.DevExpress.events.Cancelable & devextreme.devextreme.DevExpress.common.ReducedNativeEventInfo<devextreme.devextreme.DevExpress.ui.dxTreeList<TRowData, TKey>> & devextreme.devextreme.DevExpress.common.grids.RowDraggingEventInfo<TRowData> & devextreme.devextreme.DevExpress.common.grids.DragDropInfo */
  trait RowDraggingMoveEvent[TRowData, TKey] extends StObject {
    
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    var component: dxTreeList[TRowData, TKey]
    
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
      component: dxTreeList[TRowData, TKey],
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
      
      inline def setComponent(value: dxTreeList[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined devextreme.devextreme.DevExpress.common.ReducedNativeEventInfo<devextreme.devextreme.DevExpress.ui.dxTreeList<TRowData, TKey>> & devextreme.devextreme.DevExpress.common.grids.RowDraggingEventInfo<TRowData> */
  trait RowDraggingRemoveEvent[TRowData, TKey] extends StObject {
    
    var component: dxTreeList[TRowData, TKey]
    
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
      component: dxTreeList[TRowData, TKey],
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
      
      inline def setComponent(value: dxTreeList[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined devextreme.devextreme.DevExpress.common.ReducedNativeEventInfo<devextreme.devextreme.DevExpress.ui.dxTreeList<TRowData, TKey>> & devextreme.devextreme.DevExpress.common.grids.RowDraggingEventInfo<TRowData> & devextreme.devextreme.DevExpress.common.grids.DragReorderInfo */
  trait RowDraggingReorderEvent[TRowData, TKey] extends StObject {
    
    var component: dxTreeList[TRowData, TKey]
    
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
      component: dxTreeList[TRowData, TKey],
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
      
      inline def setComponent(value: dxTreeList[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
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
  
  /* Inlined devextreme.devextreme.DevExpress.events.Cancelable & devextreme.devextreme.DevExpress.common.ReducedNativeEventInfo<devextreme.devextreme.DevExpress.ui.dxTreeList<TRowData, TKey>> & devextreme.devextreme.DevExpress.common.grids.DragStartEventInfo<TRowData> */
  trait RowDraggingStartEvent[TRowData, TKey] extends StObject {
    
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    var component: dxTreeList[TRowData, TKey]
    
    var event: DxEvent[PointerEvent | MouseEvent | TouchEvent]
    
    val fromData: js.UndefOr[Any] = js.undefined
    
    val fromIndex: Double
    
    var itemData: js.UndefOr[TRowData] = js.undefined
    
    val itemElement: DxElement_[HTMLElement]
  }
  object RowDraggingStartEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
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
      
      inline def setComponent(value: dxTreeList[TRowData, TKey]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: DxEvent[PointerEvent | MouseEvent | TouchEvent]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setFromData(value: Any): Self = StObject.set(x, "fromData", value.asInstanceOf[js.Any])
      
      inline def setFromDataUndefined: Self = StObject.set(x, "fromData", js.undefined)
      
      inline def setFromIndex(value: Double): Self = StObject.set(x, "fromIndex", value.asInstanceOf[js.Any])
      
      inline def setItemData(value: TRowData): Self = StObject.set(x, "itemData", value.asInstanceOf[js.Any])
      
      inline def setItemDataUndefined: Self = StObject.set(x, "itemData", js.undefined)
      
      inline def setItemElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "itemElement", value.asInstanceOf[js.Any])
    }
  }
  
  trait RowExpandedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowKeyInfo[TKey]
  object RowExpandedEvent {
    
    inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey], element: DxElement_[HTMLElement], key: TKey): RowExpandedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowExpandedEvent[TRowData, TKey]]
    }
  }
  
  trait RowExpandingEvent[TRowData, TKey]
    extends StObject
       with Cancelable
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowKeyInfo[TKey]
  object RowExpandingEvent {
    
    inline def apply[TRowData, TKey](component: dxTreeList[TRowData, TKey], element: DxElement_[HTMLElement], key: TKey): RowExpandingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowExpandingEvent[TRowData, TKey]]
    }
  }
  
  trait RowInsertedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowInsertedInfo[TRowData, TKey]
  object RowInsertedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      error: js.Error,
      key: TKey
    ): RowInsertedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowInsertedEvent[TRowData, TKey]]
    }
  }
  
  trait RowInsertingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowInsertingInfo[TRowData]
  object RowInsertingEvent {
    
    inline def apply[TRowData, TKey](
      cancel: Boolean | PromiseLike[Unit],
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement]
    ): RowInsertingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowInsertingEvent[TRowData, TKey]]
    }
  }
  
  trait RowPreparedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]] {
    
    val columns: js.Array[Column[TRowData, TKey]]
    
    val data: TRowData
    
    val isExpanded: js.UndefOr[Boolean] = js.undefined
    
    val isNewRow: js.UndefOr[Boolean] = js.undefined
    
    val isSelected: js.UndefOr[Boolean] = js.undefined
    
    val key: TKey
    
    val level: Double
    
    val node: Node[TRowData, TKey]
    
    val rowElement: DxElement_[HTMLElement]
    
    val rowIndex: Double
    
    val rowType: String
    
    val values: js.Array[Any]
  }
  object RowPreparedEvent {
    
    inline def apply[TRowData, TKey](
      columns: js.Array[Column[TRowData, TKey]],
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      key: TKey,
      level: Double,
      node: Node[TRowData, TKey],
      rowElement: DxElement_[HTMLElement],
      rowIndex: Double,
      rowType: String,
      values: js.Array[Any]
    ): RowPreparedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], rowElement = rowElement.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], rowType = rowType.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowPreparedEvent[TRowData, TKey]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RowPreparedEvent[?, ?], TRowData, TKey] (val x: Self & (RowPreparedEvent[TRowData, TKey])) extends AnyVal {
      
      inline def setColumns(value: js.Array[Column[TRowData, TKey]]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsVarargs(value: (Column[TRowData, TKey])*): Self = StObject.set(x, "columns", js.Array(value*))
      
      inline def setData(value: TRowData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setIsExpanded(value: Boolean): Self = StObject.set(x, "isExpanded", value.asInstanceOf[js.Any])
      
      inline def setIsExpandedUndefined: Self = StObject.set(x, "isExpanded", js.undefined)
      
      inline def setIsNewRow(value: Boolean): Self = StObject.set(x, "isNewRow", value.asInstanceOf[js.Any])
      
      inline def setIsNewRowUndefined: Self = StObject.set(x, "isNewRow", js.undefined)
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setKey(value: TKey): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Node[TRowData, TKey]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setRowElement(value: DxElement_[HTMLElement]): Self = StObject.set(x, "rowElement", value.asInstanceOf[js.Any])
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowType(value: String): Self = StObject.set(x, "rowType", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Any]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Any*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait RowRemovedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowRemovedInfo[TRowData, TKey]
  object RowRemovedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      error: js.Error,
      key: TKey
    ): RowRemovedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowRemovedEvent[TRowData, TKey]]
    }
  }
  
  trait RowRemovingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowRemovingInfo[TRowData, TKey]
  object RowRemovingEvent {
    
    inline def apply[TRowData, TKey](
      cancel: Boolean | PromiseLike[Unit],
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      key: TKey
    ): RowRemovingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowRemovingEvent[TRowData, TKey]]
    }
  }
  
  trait RowUpdatedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowUpdatedInfo[TRowData, TKey]
  object RowUpdatedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      data: TRowData,
      element: DxElement_[HTMLElement],
      error: js.Error,
      key: TKey
    ): RowUpdatedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], error = error.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowUpdatedEvent[TRowData, TKey]]
    }
  }
  
  trait RowUpdatingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowUpdatingInfo[TRowData, TKey]
  object RowUpdatingEvent {
    
    inline def apply[TRowData, TKey](
      cancel: Boolean | PromiseLike[Unit],
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement],
      key: TKey,
      newData: DeepPartial[TRowData],
      oldData: TRowData
    ): RowUpdatingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], newData = newData.asInstanceOf[js.Any], oldData = oldData.asInstanceOf[js.Any])
      __obj.asInstanceOf[RowUpdatingEvent[TRowData, TKey]]
    }
  }
  
  trait RowValidatingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with RowValidatingInfo[TRowData, TKey]
  object RowValidatingEvent {
    
    inline def apply[TRowData, TKey](
      brokenRules: js.Array[typings.devextreme.mod.DevExpress.common.ValidationRule],
      component: dxTreeList[TRowData, TKey],
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
  
  trait SavedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with DataChangeInfo[TRowData, TKey]
  object SavedEvent {
    
    inline def apply[TRowData, TKey](
      changes: js.Array[DataChange[TRowData, TKey]],
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement]
    ): SavedEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[SavedEvent[TRowData, TKey]]
    }
  }
  
  trait SavingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with SavingInfo[TRowData, TKey]
  object SavingEvent {
    
    inline def apply[TRowData, TKey](
      cancel: Boolean,
      changes: js.Array[DataChange[TRowData, TKey]],
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement]
    ): SavingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], changes = changes.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[SavingEvent[TRowData, TKey]]
    }
  }
  
  /* Inlined std.Omit<devextreme.devextreme.DevExpress.ui.dxScrollable<devextreme.devextreme.DevExpress.ui.dxScrollable.Properties>, '_templateManager' | '_cancelOptionChange' | '_getTemplate' | '_invalidate' | '_refresh' | '_notifyOptionChanged' | '_createElement'> */
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
    var mode: js.UndefOr[ScrollMode] = js.undefined
  }
  object Scrolling {
    
    inline def apply(): Scrolling = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Scrolling]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Scrolling] (val x: Self) extends AnyVal {
      
      inline def setMode(value: ScrollMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    }
  }
  
  trait Selection
    extends StObject
       with SelectionBase {
    
    /**
      * Specifies whether selection is recursive.
      */
    var recursive: js.UndefOr[Boolean] = js.undefined
  }
  object Selection {
    
    inline def apply(): Selection = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Selection]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Selection] (val x: Self) extends AnyVal {
      
      inline def setRecursive(value: Boolean): Self = StObject.set(x, "recursive", value.asInstanceOf[js.Any])
      
      inline def setRecursiveUndefined: Self = StObject.set(x, "recursive", js.undefined)
    }
  }
  
  trait SelectionChangedEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with SelectionChangedInfo[TRowData, TKey]
  object SelectionChangedEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
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
  
  trait Toolbar extends StObject {
    
    /**
      * Specifies whether the toolbar responds to user interaction.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Configures toolbar items.
      */
    var items: js.UndefOr[js.Array[TreeListPredefinedToolbarItem | ToolbarItem]] = js.undefined
    
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
      
      inline def setItems(value: js.Array[TreeListPredefinedToolbarItem | ToolbarItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: (TreeListPredefinedToolbarItem | ToolbarItem)*): Self = StObject.set(x, "items", js.Array(value*))
      
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
    var name: js.UndefOr[TreeListPredefinedToolbarItem | String] = js.undefined
  }
  object ToolbarItem {
    
    inline def apply(): ToolbarItem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarItem]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarItem] (val x: Self) extends AnyVal {
      
      inline def setName(value: TreeListPredefinedToolbarItem | String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait ToolbarPreparingEvent[TRowData, TKey]
    extends StObject
       with EventInfo[dxTreeList[TRowData, TKey]]
       with ToolbarPreparingInfo
  object ToolbarPreparingEvent {
    
    inline def apply[TRowData, TKey](
      component: dxTreeList[TRowData, TKey],
      element: DxElement_[HTMLElement],
      toolbarOptions: typings.devextreme.mod.DevExpress.ui.dxToolbar.Properties[Any, Any]
    ): ToolbarPreparingEvent[TRowData, TKey] = {
      val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], toolbarOptions = toolbarOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[ToolbarPreparingEvent[TRowData, TKey]]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.adaptive
    - typings.devextreme.devextremeStrings.buttons
    - typings.devextreme.devextremeStrings.drag
  */
  trait TreeListCommandColumnType extends StObject
  object TreeListCommandColumnType {
    
    inline def adaptive: typings.devextreme.devextremeStrings.adaptive = "adaptive".asInstanceOf[typings.devextreme.devextremeStrings.adaptive]
    
    inline def buttons: typings.devextreme.devextremeStrings.buttons = "buttons".asInstanceOf[typings.devextreme.devextremeStrings.buttons]
    
    inline def drag: typings.devextreme.devextremeStrings.drag = "drag".asInstanceOf[typings.devextreme.devextremeStrings.drag]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.fullBranch
    - typings.devextreme.devextremeStrings.withAncestors
    - typings.devextreme.devextremeStrings.matchOnly
  */
  trait TreeListFilterMode extends StObject
  object TreeListFilterMode {
    
    inline def fullBranch: typings.devextreme.devextremeStrings.fullBranch = "fullBranch".asInstanceOf[typings.devextreme.devextremeStrings.fullBranch]
    
    inline def matchOnly: typings.devextreme.devextremeStrings.matchOnly = "matchOnly".asInstanceOf[typings.devextreme.devextremeStrings.matchOnly]
    
    inline def withAncestors: typings.devextreme.devextremeStrings.withAncestors = "withAncestors".asInstanceOf[typings.devextreme.devextremeStrings.withAncestors]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devextreme.devextremeStrings.add
    - typings.devextreme.devextremeStrings.cancel
    - typings.devextreme.devextremeStrings.delete
    - typings.devextreme.devextremeStrings.edit
    - typings.devextreme.devextremeStrings.save
    - typings.devextreme.devextremeStrings.undelete
  */
  trait TreeListPredefinedColumnButton extends StObject
  object TreeListPredefinedColumnButton {
    
    inline def add: typings.devextreme.devextremeStrings.add = "add".asInstanceOf[typings.devextreme.devextremeStrings.add]
    
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
    - typings.devextreme.devextremeStrings.revertButton
    - typings.devextreme.devextremeStrings.saveButton
    - typings.devextreme.devextremeStrings.searchPanel
  */
  trait TreeListPredefinedToolbarItem extends StObject
  object TreeListPredefinedToolbarItem {
    
    inline def addRowButton: typings.devextreme.devextremeStrings.addRowButton = "addRowButton".asInstanceOf[typings.devextreme.devextremeStrings.addRowButton]
    
    inline def applyFilterButton: typings.devextreme.devextremeStrings.applyFilterButton = "applyFilterButton".asInstanceOf[typings.devextreme.devextremeStrings.applyFilterButton]
    
    inline def columnChooserButton: typings.devextreme.devextremeStrings.columnChooserButton = "columnChooserButton".asInstanceOf[typings.devextreme.devextremeStrings.columnChooserButton]
    
    inline def revertButton: typings.devextreme.devextremeStrings.revertButton = "revertButton".asInstanceOf[typings.devextreme.devextremeStrings.revertButton]
    
    inline def saveButton: typings.devextreme.devextremeStrings.saveButton = "saveButton".asInstanceOf[typings.devextreme.devextremeStrings.saveButton]
    
    inline def searchPanel: typings.devextreme.devextremeStrings.searchPanel = "searchPanel".asInstanceOf[typings.devextreme.devextremeStrings.searchPanel]
  }
  
  type dxTreeListToolbar = Toolbar
  
  type dxTreeListToolbarItem = ToolbarItem
}
