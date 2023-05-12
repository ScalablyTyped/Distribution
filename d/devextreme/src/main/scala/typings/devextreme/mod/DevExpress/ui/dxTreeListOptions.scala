package typings.devextreme.mod.DevExpress.ui

import org.scalablytyped.runtime.StringDictionary
import typings.devextreme.anon.Grouping
import typings.devextreme.mod.DevExpress.DOMComponent.OptionChangedEventInfo
import typings.devextreme.mod.DevExpress.common.DataStructure
import typings.devextreme.mod.DevExpress.common.Mode
import typings.devextreme.mod.DevExpress.common.grids.AdaptiveDetailRowPreparingInfo
import typings.devextreme.mod.DevExpress.common.grids.ColumnBase
import typings.devextreme.mod.DevExpress.common.grids.ColumnChooser
import typings.devextreme.mod.DevExpress.common.grids.ColumnFixing
import typings.devextreme.mod.DevExpress.common.grids.ColumnResizeMode
import typings.devextreme.mod.DevExpress.common.grids.DataChangeInfo
import typings.devextreme.mod.DevExpress.common.grids.DataErrorOccurredInfo
import typings.devextreme.mod.DevExpress.common.grids.EditingBase
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
import typings.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextreme.mod.DevExpress.events.Cancelable
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.InitializedEventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.dxFilterBuilder.Properties
import typings.devextreme.mod.DevExpress.ui.dxTreeList.CellClickEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.CellDblClickEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.CellHoverChangedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.CellPreparedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.Column
import typings.devextreme.mod.DevExpress.ui.dxTreeList.ContextMenuPreparingEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.EditingStartEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.EditorPreparedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.EditorPreparingEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.FocusedCellChangedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.FocusedCellChangingEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.FocusedRowChangedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.FocusedRowChangingEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.NodesInitializedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.RowClickEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.RowDblClickEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.RowPreparedEvent
import typings.devextreme.mod.DevExpress.ui.dxTreeList.Toolbar
import typings.devextreme.mod.DevExpress.ui.dxTreeList.TreeListFilterMode
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined devextreme.devextreme.DevExpress.common.grids.GridBaseOptions<devextreme.devextreme.DevExpress.ui.dxTreeList<TRowData, TKey>, TRowData, TKey> & {  autoExpandAll :boolean | undefined,   columns :std.Array<devextreme.devextreme.DevExpress.ui.dxTreeList.Column<TRowData, TKey> | string> | undefined,   customizeColumns :(columns : std.Array<devextreme.devextreme.DevExpress.ui.dxTreeList.Column<TRowData, TKey>>): void | undefined,   dataStructure :devextreme.devextreme.DevExpress.common.DataStructure | undefined,   editing :devextreme.devextreme.DevExpress.ui.dxTreeList.Editing<TRowData, TKey> | undefined,   expandNodesOnFiltering :boolean | undefined,   expandedRowKeys :std.Array<TKey> | undefined,   filterMode :devextreme.devextreme.DevExpress.ui.dxTreeList.TreeListFilterMode | undefined,   hasItemsExpr :string | std.Function | undefined,   itemsExpr :string | std.Function | undefined,   keyExpr :string | std.Function | undefined,   onCellClick :(e : devextreme.devextreme.DevExpress.ui.dxTreeList.CellClickEvent<TRowData, TKey>): void | undefined,   onCellDblClick :(e : devextreme.devextreme.DevExpress.ui.dxTreeList.CellDblClickEvent<TRowData, TKey>): void | undefined,   onCellHoverChanged :(e : devextreme.devextreme.DevExpress.ui.dxTreeList.CellHoverChangedEvent<TRowData, TKey>): void | undefined,   onCellPrepared :(e : devextreme.devextreme.DevExpress.ui.dxTreeList.CellPreparedEvent<TRowData, TKey>): void | undefined,   onContextMenuPreparing :(e : devextreme.devextreme.DevExpress.ui.dxTreeList.ContextMenuPreparingEvent<TRowData, TKey>): void | undefined,   onEditingStart :(e : devextreme.devextreme.DevExpress.ui.dxTreeList.EditingStartEvent<TRowData, TKey>): void | undefined,   onEditorPrepared :(options : devextreme.devextreme.DevExpress.ui.dxTreeList.EditorPreparedEvent<TRowData, TKey>): void | undefined,   onEditorPreparing :(e : devextreme.devextreme.DevExpress.ui.dxTreeList.EditorPreparingEvent<TRowData, TKey>): void | undefined,   onFocusedCellChanged :(e : devextreme.devextreme.DevExpress.ui.dxTreeList.FocusedCellChangedEvent<TRowData, TKey>): void | undefined,   onFocusedCellChanging :(e : devextreme.devextreme.DevExpress.ui.dxTreeList.FocusedCellChangingEvent<TRowData, TKey>): void | undefined,   onFocusedRowChanged :(e : devextreme.devextreme.DevExpress.ui.dxTreeList.FocusedRowChangedEvent<TRowData, TKey>): void | undefined,   onFocusedRowChanging :(e : devextreme.devextreme.DevExpress.ui.dxTreeList.FocusedRowChangingEvent<TRowData, TKey>): void | undefined,   onNodesInitialized :(e : devextreme.devextreme.DevExpress.ui.dxTreeList.NodesInitializedEvent<TRowData, TKey>): void | undefined,   onRowClick :(e : devextreme.devextreme.DevExpress.ui.dxTreeList.RowClickEvent<TRowData, TKey>): void | undefined,   onRowDblClick :(e : devextreme.devextreme.DevExpress.ui.dxTreeList.RowDblClickEvent<TRowData, TKey>): void | undefined,   onRowPrepared :(e : devextreme.devextreme.DevExpress.ui.dxTreeList.RowPreparedEvent<TRowData, TKey>): void | undefined,   paging :devextreme.devextreme.DevExpress.ui.dxTreeList.Paging | undefined,   parentIdExpr :string | std.Function | undefined,   remoteOperations :{  filtering :boolean | undefined,   grouping :boolean | undefined,   sorting :boolean | undefined} | devextreme.devextreme.DevExpress.common.Mode | undefined,   rootValue :TKey | undefined,   scrolling :devextreme.devextreme.DevExpress.ui.dxTreeList.Scrolling | undefined,   selection :devextreme.devextreme.DevExpress.ui.dxTreeList.Selection | undefined,   toolbar :devextreme.devextreme.DevExpress.ui.dxTreeList.Toolbar | undefined} */
trait dxTreeListOptions[TRowData, TKey] extends StObject {
  
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
  var filterBuilder: js.UndefOr[Properties] = js.undefined
  
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
object dxTreeListOptions {
  
  inline def apply[TRowData, TKey](): dxTreeListOptions[TRowData, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeListOptions[TRowData, TKey]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: dxTreeListOptions[?, ?], TRowData, TKey] (val x: Self & (dxTreeListOptions[TRowData, TKey])) extends AnyVal {
    
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
    
    inline def setFilterBuilder(value: Properties): Self = StObject.set(x, "filterBuilder", value.asInstanceOf[js.Any])
    
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
