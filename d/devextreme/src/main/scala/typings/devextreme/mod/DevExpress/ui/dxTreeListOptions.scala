package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.Grouping
import typings.devextreme.mod.DevExpress.common.DataStructure
import typings.devextreme.mod.DevExpress.common.Mode
import typings.devextreme.mod.DevExpress.ui.dxTreeList.CellClickEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.CellDblClickEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.CellHoverChangedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.CellPreparedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.Column
import typings.devextreme.mod.DevExpress.ui.dxTreeList.ContextMenuPreparingEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.Editing
import typings.devextreme.mod.DevExpress.ui.dxTreeList.EditingStartEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.EditorPreparedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.EditorPreparingEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.FocusedCellChangedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.FocusedCellChangingEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.FocusedRowChangedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.FocusedRowChangingEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.NodesInitializedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.Paging
import typings.devextreme.mod.DevExpress.ui.dxTreeList.RowClickEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.RowDblClickEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.RowPreparedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.Scrolling
import typings.devextreme.mod.DevExpress.ui.dxTreeList.Selection
import typings.devextreme.mod.DevExpress.ui.dxTreeList.Toolbar
import typings.devextreme.mod.DevExpress.ui.dxTreeList.TreeListFilterMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait dxTreeListOptions[TRowData, TKey]
  extends StObject
     with GridBaseOptions[dxTreeList[TRowData, TKey], TRowData, TKey] {
  
  /**
    * Specifies whether all rows are expanded initially.
    */
  var autoExpandAll: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures columns.
    */
  @JSName("columns")
  var columns_dxTreeListOptions: js.UndefOr[js.Array[(Column[TRowData, TKey]) | String]] = js.undefined
  
  /**
    * Customizes columns after they are created.
    */
  var customizeColumns: js.UndefOr[js.Function1[/* columns */ js.Array[Column[TRowData, TKey]], Unit]] = js.undefined
  
  /**
    * Notifies the UI component of the used data structure.
    */
  var dataStructure: js.UndefOr[DataStructure] = js.undefined
  
  /**
    * Configures editing.
    */
  @JSName("editing")
  var editing_dxTreeListOptions: js.UndefOr[Editing[TRowData, TKey]] = js.undefined
  
  /**
    * Specifies whether nodes appear expanded or collapsed after filtering is applied.
    */
  var expandNodesOnFiltering: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies keys of the initially expanded rows.
    */
  var expandedRowKeys: js.UndefOr[js.Array[TKey]] = js.undefined
  
  /**
    * Specifies whether filter and search results should include matching rows only, matching rows with ancestors, or matching rows with ancestors and descendants (full branch).
    */
  var filterMode: js.UndefOr[TreeListFilterMode] = js.undefined
  
  /**
    * Specifies which data field defines whether the node has children.
    */
  var hasItemsExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Specifies which data field contains nested items. Set this property when your data has a hierarchical structure.
    */
  var itemsExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Specifies the key property (or properties) that provide(s) key values to access data items. Each key value must be unique.
    */
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  
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
  
  /**
    * A function that is executed before the context menu is rendered.
    */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ ContextMenuPreparingEvent[TRowData, TKey], Unit]] = js.undefined
  
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
    * A function that is executed after the loaded nodes are initialized.
    */
  var onNodesInitialized: js.UndefOr[js.Function1[/* e */ NodesInitializedEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed when a grid row is clicked or tapped.
    */
  var onRowClick: js.UndefOr[js.Function1[/* e */ RowClickEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed when a row is double-clicked or double-tapped. Executed after onCellDblClick.
    */
  var onRowDblClick: js.UndefOr[js.Function1[/* e */ RowDblClickEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed after a row is created.
    */
  var onRowPrepared: js.UndefOr[js.Function1[/* e */ RowPreparedEvent[TRowData, TKey], Unit]] = js.undefined
  
  /**
    * Configures paging.
    */
  @JSName("paging")
  var paging_dxTreeListOptions: js.UndefOr[Paging] = js.undefined
  
  /**
    * Specifies which data field provides parent keys.
    */
  var parentIdExpr: js.UndefOr[String | js.Function] = js.undefined
  
  /**
    * Notifies the TreeList of the server&apos;s data processing operations. Applies only if data has a plain structure.
    */
  var remoteOperations: js.UndefOr[Grouping | Mode] = js.undefined
  
  /**
    * Specifies the root node&apos;s identifier. Applies if dataStructure is &apos;plain&apos;.
    */
  var rootValue: js.UndefOr[TKey] = js.undefined
  
  /**
    * Configures scrolling.
    */
  @JSName("scrolling")
  var scrolling_dxTreeListOptions: js.UndefOr[Scrolling] = js.undefined
  
  /**
    * Configures runtime selection.
    */
  @JSName("selection")
  var selection_dxTreeListOptions: js.UndefOr[Selection] = js.undefined
  
  /**
    * Configures the toolbar.
    */
  var toolbar: js.UndefOr[Toolbar] = js.undefined
}
object dxTreeListOptions {
  
  inline def apply[TRowData, TKey](): dxTreeListOptions[TRowData, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeListOptions[TRowData, TKey]]
  }
  
  extension [Self <: dxTreeListOptions[?, ?], TRowData, TKey](x: Self & (dxTreeListOptions[TRowData, TKey])) {
    
    inline def setAutoExpandAll(value: Boolean): Self = StObject.set(x, "autoExpandAll", value.asInstanceOf[js.Any])
    
    inline def setAutoExpandAllUndefined: Self = StObject.set(x, "autoExpandAll", js.undefined)
    
    inline def setColumns(value: js.Array[(Column[TRowData, TKey]) | String]): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: ((Column[TRowData, TKey]) | String)*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setCustomizeColumns(value: /* columns */ js.Array[Column[TRowData, TKey]] => Unit): Self = StObject.set(x, "customizeColumns", js.Any.fromFunction1(value))
    
    inline def setCustomizeColumnsUndefined: Self = StObject.set(x, "customizeColumns", js.undefined)
    
    inline def setDataStructure(value: DataStructure): Self = StObject.set(x, "dataStructure", value.asInstanceOf[js.Any])
    
    inline def setDataStructureUndefined: Self = StObject.set(x, "dataStructure", js.undefined)
    
    inline def setEditing(value: Editing[TRowData, TKey]): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    inline def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
    
    inline def setExpandNodesOnFiltering(value: Boolean): Self = StObject.set(x, "expandNodesOnFiltering", value.asInstanceOf[js.Any])
    
    inline def setExpandNodesOnFilteringUndefined: Self = StObject.set(x, "expandNodesOnFiltering", js.undefined)
    
    inline def setExpandedRowKeys(value: js.Array[TKey]): Self = StObject.set(x, "expandedRowKeys", value.asInstanceOf[js.Any])
    
    inline def setExpandedRowKeysUndefined: Self = StObject.set(x, "expandedRowKeys", js.undefined)
    
    inline def setExpandedRowKeysVarargs(value: TKey*): Self = StObject.set(x, "expandedRowKeys", js.Array(value*))
    
    inline def setFilterMode(value: TreeListFilterMode): Self = StObject.set(x, "filterMode", value.asInstanceOf[js.Any])
    
    inline def setFilterModeUndefined: Self = StObject.set(x, "filterMode", js.undefined)
    
    inline def setHasItemsExpr(value: String | js.Function): Self = StObject.set(x, "hasItemsExpr", value.asInstanceOf[js.Any])
    
    inline def setHasItemsExprUndefined: Self = StObject.set(x, "hasItemsExpr", js.undefined)
    
    inline def setItemsExpr(value: String | js.Function): Self = StObject.set(x, "itemsExpr", value.asInstanceOf[js.Any])
    
    inline def setItemsExprUndefined: Self = StObject.set(x, "itemsExpr", js.undefined)
    
    inline def setKeyExpr(value: String | js.Function): Self = StObject.set(x, "keyExpr", value.asInstanceOf[js.Any])
    
    inline def setKeyExprUndefined: Self = StObject.set(x, "keyExpr", js.undefined)
    
    inline def setOnCellClick(value: /* e */ CellClickEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onCellClick", js.Any.fromFunction1(value))
    
    inline def setOnCellClickUndefined: Self = StObject.set(x, "onCellClick", js.undefined)
    
    inline def setOnCellDblClick(value: /* e */ CellDblClickEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onCellDblClick", js.Any.fromFunction1(value))
    
    inline def setOnCellDblClickUndefined: Self = StObject.set(x, "onCellDblClick", js.undefined)
    
    inline def setOnCellHoverChanged(value: /* e */ CellHoverChangedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onCellHoverChanged", js.Any.fromFunction1(value))
    
    inline def setOnCellHoverChangedUndefined: Self = StObject.set(x, "onCellHoverChanged", js.undefined)
    
    inline def setOnCellPrepared(value: /* e */ CellPreparedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onCellPrepared", js.Any.fromFunction1(value))
    
    inline def setOnCellPreparedUndefined: Self = StObject.set(x, "onCellPrepared", js.undefined)
    
    inline def setOnContextMenuPreparing(value: /* e */ ContextMenuPreparingEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onContextMenuPreparing", js.Any.fromFunction1(value))
    
    inline def setOnContextMenuPreparingUndefined: Self = StObject.set(x, "onContextMenuPreparing", js.undefined)
    
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
    
    inline def setOnNodesInitialized(value: /* e */ NodesInitializedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onNodesInitialized", js.Any.fromFunction1(value))
    
    inline def setOnNodesInitializedUndefined: Self = StObject.set(x, "onNodesInitialized", js.undefined)
    
    inline def setOnRowClick(value: /* e */ RowClickEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onRowClick", js.Any.fromFunction1(value))
    
    inline def setOnRowClickUndefined: Self = StObject.set(x, "onRowClick", js.undefined)
    
    inline def setOnRowDblClick(value: /* e */ RowDblClickEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onRowDblClick", js.Any.fromFunction1(value))
    
    inline def setOnRowDblClickUndefined: Self = StObject.set(x, "onRowDblClick", js.undefined)
    
    inline def setOnRowPrepared(value: /* e */ RowPreparedEvent[TRowData, TKey] => Unit): Self = StObject.set(x, "onRowPrepared", js.Any.fromFunction1(value))
    
    inline def setOnRowPreparedUndefined: Self = StObject.set(x, "onRowPrepared", js.undefined)
    
    inline def setPaging(value: Paging): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    inline def setParentIdExpr(value: String | js.Function): Self = StObject.set(x, "parentIdExpr", value.asInstanceOf[js.Any])
    
    inline def setParentIdExprUndefined: Self = StObject.set(x, "parentIdExpr", js.undefined)
    
    inline def setRemoteOperations(value: Grouping | Mode): Self = StObject.set(x, "remoteOperations", value.asInstanceOf[js.Any])
    
    inline def setRemoteOperationsUndefined: Self = StObject.set(x, "remoteOperations", js.undefined)
    
    inline def setRootValue(value: TKey): Self = StObject.set(x, "rootValue", value.asInstanceOf[js.Any])
    
    inline def setRootValueUndefined: Self = StObject.set(x, "rootValue", js.undefined)
    
    inline def setScrolling(value: Scrolling): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
    
    inline def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
    
    inline def setSelection(value: Selection): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
    
    inline def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
    
    inline def setToolbar(value: Toolbar): Self = StObject.set(x, "toolbar", value.asInstanceOf[js.Any])
    
    inline def setToolbarUndefined: Self = StObject.set(x, "toolbar", js.undefined)
  }
}
