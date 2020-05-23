package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AllowDropInsideItem
import typings.devextreme.anon.AllowedPageSizes
import typings.devextreme.anon.ApplyFilter
import typings.devextreme.anon.AscendingText
import typings.devextreme.anon.BrokenRules
import typings.devextreme.anon.CancelComponent
import typings.devextreme.anon.CellElementColumn
import typings.devextreme.anon.ColumnIndexComponent
import typings.devextreme.anon.ComponentData
import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.CurrentDeselectedRowKeys
import typings.devextreme.anon.CustomLoad
import typings.devextreme.anon.CustomizeText
import typings.devextreme.anon.DataDisplayValue
import typings.devextreme.anon.DataElement
import typings.devextreme.anon.EditOnKeyPress
import typings.devextreme.anon.Element
import typings.devextreme.anon.ElementKey
import typings.devextreme.anon.EmptyPanelText
import typings.devextreme.anon.Enabled
import typings.devextreme.anon.Error
import typings.devextreme.anon.EventType
import typings.devextreme.anon.FormOptions
import typings.devextreme.anon.Grouping
import typings.devextreme.anon.Handled
import typings.devextreme.anon.Height
import typings.devextreme.anon.HighlightCaseSensitive
import typings.devextreme.anon.IndicatorSrc
import typings.devextreme.anon.IsHighlighted
import typings.devextreme.anon.Key
import typings.devextreme.anon.KeyModel
import typings.devextreme.anon.Level
import typings.devextreme.anon.Model
import typings.devextreme.anon.ModelRow
import typings.devextreme.anon.Name
import typings.devextreme.anon.NewData
import typings.devextreme.anon.Node
import typings.devextreme.anon.ParentType
import typings.devextreme.anon.PrevRowIndex
import typings.devextreme.anon.Promise
import typings.devextreme.anon.ReadOnly
import typings.devextreme.anon.Root
import typings.devextreme.anon.RowRowElement
import typings.devextreme.anon.Target
import typings.devextreme.anon.ToolbarOptions
import typings.devextreme.anon.Values
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.fullBranch
import typings.devextreme.devextremeStrings.matchOnly
import typings.devextreme.devextremeStrings.nextColumn
import typings.devextreme.devextremeStrings.plain
import typings.devextreme.devextremeStrings.tree
import typings.devextreme.devextremeStrings.widget
import typings.devextreme.devextremeStrings.withAncestors
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxTreeListOptions extends GridBaseOptions[dxTreeList] {
  /** @name dxTreeList.Options.autoExpandAll */
  var autoExpandAll: js.UndefOr[Boolean] = js.undefined
  /** @name dxTreeList.Options.columns */
  @JSName("columns")
  var columns_dxTreeListOptions: js.UndefOr[js.Array[dxTreeListColumn | String]] = js.undefined
  /** @name dxTreeList.Options.customizeColumns */
  var customizeColumns: js.UndefOr[js.Function1[/* columns */ js.Array[dxTreeListColumn], _]] = js.undefined
  /** @name dxTreeList.Options.dataStructure */
  var dataStructure: js.UndefOr[plain | tree] = js.undefined
  /** @name dxTreeList.Options.editing */
  @JSName("editing")
  var editing_dxTreeListOptions: js.UndefOr[dxTreeListEditing] = js.undefined
  /** @name dxTreeList.Options.expandNodesOnFiltering */
  var expandNodesOnFiltering: js.UndefOr[Boolean] = js.undefined
  /** @name dxTreeList.Options.expandedRowKeys */
  var expandedRowKeys: js.UndefOr[js.Array[_]] = js.undefined
  /** @name dxTreeList.Options.filterMode */
  var filterMode: js.UndefOr[fullBranch | withAncestors | matchOnly] = js.undefined
  /** @name dxTreeList.Options.hasItemsExpr */
  var hasItemsExpr: js.UndefOr[String | js.Function] = js.undefined
  /** @name dxTreeList.Options.itemsExpr */
  var itemsExpr: js.UndefOr[String | js.Function] = js.undefined
  /** @name dxTreeList.Options.keyExpr */
  var keyExpr: js.UndefOr[String | js.Function] = js.undefined
  /** @name dxTreeList.Options.onCellClick */
  var onCellClick: js.UndefOr[(js.Function1[/* e */ CellElementColumn, _]) | String] = js.undefined
  /** @name dxTreeList.Options.onCellDblClick */
  var onCellDblClick: js.UndefOr[js.Function1[/* e */ ColumnIndexComponent, _]] = js.undefined
  /** @name dxTreeList.Options.onCellHoverChanged */
  var onCellHoverChanged: js.UndefOr[js.Function1[/* e */ EventType, _]] = js.undefined
  /** @name dxTreeList.Options.onCellPrepared */
  var onCellPrepared: js.UndefOr[js.Function1[/* e */ DataDisplayValue, _]] = js.undefined
  /** @name dxTreeList.Options.onContextMenuPreparing */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ Target, _]] = js.undefined
  /** @name dxTreeList.Options.onEditingStart */
  var onEditingStart: js.UndefOr[js.Function1[/* e */ KeyModel, _]] = js.undefined
  /** @name dxTreeList.Options.onEditorPrepared */
  var onEditorPrepared: js.UndefOr[js.Function1[/* options */ ParentType, _]] = js.undefined
  /** @name dxTreeList.Options.onEditorPreparing */
  var onEditorPreparing: js.UndefOr[js.Function1[/* e */ ReadOnly, _]] = js.undefined
  /** @name dxTreeList.Options.onFocusedCellChanged */
  var onFocusedCellChanged: js.UndefOr[js.Function1[/* e */ ModelRow, _]] = js.undefined
  /** @name dxTreeList.Options.onFocusedCellChanging */
  var onFocusedCellChanging: js.UndefOr[js.Function1[/* e */ IsHighlighted, _]] = js.undefined
  /** @name dxTreeList.Options.onFocusedRowChanged */
  var onFocusedRowChanged: js.UndefOr[js.Function1[/* e */ RowRowElement, _]] = js.undefined
  /** @name dxTreeList.Options.onFocusedRowChanging */
  var onFocusedRowChanging: js.UndefOr[js.Function1[/* e */ PrevRowIndex, _]] = js.undefined
  /** @name dxTreeList.Options.onNodesInitialized */
  var onNodesInitialized: js.UndefOr[js.Function1[/* e */ Root, _]] = js.undefined
  /** @name dxTreeList.Options.onRowClick */
  var onRowClick: js.UndefOr[(js.Function1[/* e */ Level, _]) | String] = js.undefined
  /** @name dxTreeList.Options.onRowDblClick */
  var onRowDblClick: js.UndefOr[js.Function1[/* e */ Values, _]] = js.undefined
  /** @name dxTreeList.Options.onRowPrepared */
  var onRowPrepared: js.UndefOr[js.Function1[/* e */ Node, _]] = js.undefined
  /** @name dxTreeList.Options.paging */
  @JSName("paging")
  var paging_dxTreeListOptions: js.UndefOr[dxTreeListPaging] = js.undefined
  /** @name dxTreeList.Options.parentIdExpr */
  var parentIdExpr: js.UndefOr[String | js.Function] = js.undefined
  /** @name dxTreeList.Options.remoteOperations */
  var remoteOperations: js.UndefOr[Grouping | auto] = js.undefined
  /** @name dxTreeList.Options.rootValue */
  var rootValue: js.UndefOr[js.Any] = js.undefined
  /** @name dxTreeList.Options.scrolling */
  @JSName("scrolling")
  var scrolling_dxTreeListOptions: js.UndefOr[dxTreeListScrolling] = js.undefined
  /** @name dxTreeList.Options.selection */
  @JSName("selection")
  var selection_dxTreeListOptions: js.UndefOr[dxTreeListSelection] = js.undefined
}

object dxTreeListOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    allowColumnReordering: js.UndefOr[Boolean] = js.undefined,
    allowColumnResizing: js.UndefOr[Boolean] = js.undefined,
    autoExpandAll: js.UndefOr[Boolean] = js.undefined,
    autoNavigateToFocusedRow: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    cacheEnabled: js.UndefOr[Boolean] = js.undefined,
    cellHintEnabled: js.UndefOr[Boolean] = js.undefined,
    columnAutoWidth: js.UndefOr[Boolean] = js.undefined,
    columnChooser: EmptyPanelText = null,
    columnFixing: Enabled = null,
    columnHidingEnabled: js.UndefOr[Boolean] = js.undefined,
    columnMinWidth: js.UndefOr[Double] = js.undefined,
    columnResizingMode: nextColumn | widget = null,
    columnWidth: js.UndefOr[Double] = js.undefined,
    columns: js.Array[dxTreeListColumn | String] = null,
    customizeColumns: /* columns */ js.Array[dxTreeListColumn] => _ = null,
    dataSource: String | js.Array[_] | DataSource | DataSourceOptions = null,
    dataStructure: plain | tree = null,
    dateSerializationFormat: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editing: dxTreeListEditing = null,
    elementAttr: js.Any = null,
    errorRowEnabled: js.UndefOr[Boolean] = js.undefined,
    expandNodesOnFiltering: js.UndefOr[Boolean] = js.undefined,
    expandedRowKeys: js.Array[_] = null,
    filterBuilder: dxFilterBuilderOptions = null,
    filterBuilderPopup: dxPopupOptions[dxPopup] = null,
    filterMode: fullBranch | withAncestors | matchOnly = null,
    filterPanel: CustomizeText[dxTreeList] = null,
    filterRow: ApplyFilter = null,
    filterSyncEnabled: Boolean | auto = null,
    filterValue: String | js.Array[_] | js.Function = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    focusedColumnIndex: js.UndefOr[Double] = js.undefined,
    focusedRowEnabled: js.UndefOr[Boolean] = js.undefined,
    focusedRowIndex: js.UndefOr[Double] = js.undefined,
    focusedRowKey: js.Any = null,
    hasItemsExpr: String | js.Function = null,
    headerFilter: Height = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    highlightChanges: js.UndefOr[Boolean] = js.undefined,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    itemsExpr: String | js.Function = null,
    keyExpr: String | js.Function = null,
    keyboardNavigation: EditOnKeyPress = null,
    loadPanel: IndicatorSrc = null,
    noDataText: String = null,
    onAdaptiveDetailRowPreparing: /* e */ FormOptions[dxTreeList] => _ = null,
    onCellClick: (js.Function1[/* e */ CellElementColumn, _]) | String = null,
    onCellDblClick: /* e */ ColumnIndexComponent => _ = null,
    onCellHoverChanged: /* e */ EventType => _ = null,
    onCellPrepared: /* e */ DataDisplayValue => _ = null,
    onContentReady: /* e */ ComponentElement[dxTreeList] => _ = null,
    onContextMenuPreparing: /* e */ Target => _ = null,
    onDataErrorOccurred: /* e */ Error[dxTreeList] => _ = null,
    onDisposing: /* e */ Model[dxTreeList] => _ = null,
    onEditingStart: /* e */ KeyModel => _ = null,
    onEditorPrepared: /* options */ ParentType => _ = null,
    onEditorPreparing: /* e */ ReadOnly => _ = null,
    onFocusedCellChanged: /* e */ ModelRow => _ = null,
    onFocusedCellChanging: /* e */ IsHighlighted => _ = null,
    onFocusedRowChanged: /* e */ RowRowElement => _ = null,
    onFocusedRowChanging: /* e */ PrevRowIndex => _ = null,
    onInitNewRow: /* e */ Promise[dxTreeList] => _ = null,
    onInitialized: /* e */ Element[dxTreeList] => _ = null,
    onKeyDown: /* e */ Handled[dxTreeList] => _ = null,
    onNodesInitialized: /* e */ Root => _ = null,
    onOptionChanged: /* e */ Name[dxTreeList] => _ = null,
    onRowClick: (js.Function1[/* e */ Level, _]) | String = null,
    onRowCollapsed: /* e */ Key[dxTreeList] => _ = null,
    onRowCollapsing: /* e */ CancelComponent[dxTreeList] => _ = null,
    onRowDblClick: /* e */ Values => _ = null,
    onRowExpanded: /* e */ Key[dxTreeList] => _ = null,
    onRowExpanding: /* e */ CancelComponent[dxTreeList] => _ = null,
    onRowInserted: /* e */ ComponentData[dxTreeList] => _ = null,
    onRowInserting: /* e */ DataElement[dxTreeList] => _ = null,
    onRowPrepared: /* e */ Node => _ = null,
    onRowRemoved: /* e */ ComponentData[dxTreeList] => _ = null,
    onRowRemoving: /* e */ ElementKey[dxTreeList] => _ = null,
    onRowUpdated: /* e */ ComponentData[dxTreeList] => _ = null,
    onRowUpdating: /* e */ NewData[dxTreeList] => _ = null,
    onRowValidating: /* e */ BrokenRules[dxTreeList] => _ = null,
    onSelectionChanged: /* e */ CurrentDeselectedRowKeys[dxTreeList] => _ = null,
    onToolbarPreparing: /* e */ ToolbarOptions[dxTreeList] => _ = null,
    pager: AllowedPageSizes = null,
    paging: dxTreeListPaging = null,
    parentIdExpr: String | js.Function = null,
    remoteOperations: Grouping | auto = null,
    renderAsync: js.UndefOr[Boolean] = js.undefined,
    repaintChangesOnly: js.UndefOr[Boolean] = js.undefined,
    rootValue: js.Any = null,
    rowAlternationEnabled: js.UndefOr[Boolean] = js.undefined,
    rowDragging: AllowDropInsideItem = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrolling: dxTreeListScrolling = null,
    searchPanel: HighlightCaseSensitive = null,
    selectedRowKeys: js.Array[_] = null,
    selection: dxTreeListSelection = null,
    showBorders: js.UndefOr[Boolean] = js.undefined,
    showColumnHeaders: js.UndefOr[Boolean] = js.undefined,
    showColumnLines: js.UndefOr[Boolean] = js.undefined,
    showRowLines: js.UndefOr[Boolean] = js.undefined,
    sorting: AscendingText = null,
    stateStoring: CustomLoad = null,
    tabIndex: js.UndefOr[Double] = js.undefined,
    twoWayBindingEnabled: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
  ): dxTreeListOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowColumnReordering)) __obj.updateDynamic("allowColumnReordering")(allowColumnReordering.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowColumnResizing)) __obj.updateDynamic("allowColumnResizing")(allowColumnResizing.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoExpandAll)) __obj.updateDynamic("autoExpandAll")(autoExpandAll.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoNavigateToFocusedRow)) __obj.updateDynamic("autoNavigateToFocusedRow")(autoNavigateToFocusedRow.get.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheEnabled)) __obj.updateDynamic("cacheEnabled")(cacheEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(cellHintEnabled)) __obj.updateDynamic("cellHintEnabled")(cellHintEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnAutoWidth)) __obj.updateDynamic("columnAutoWidth")(columnAutoWidth.get.asInstanceOf[js.Any])
    if (columnChooser != null) __obj.updateDynamic("columnChooser")(columnChooser.asInstanceOf[js.Any])
    if (columnFixing != null) __obj.updateDynamic("columnFixing")(columnFixing.asInstanceOf[js.Any])
    if (!js.isUndefined(columnHidingEnabled)) __obj.updateDynamic("columnHidingEnabled")(columnHidingEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(columnMinWidth)) __obj.updateDynamic("columnMinWidth")(columnMinWidth.get.asInstanceOf[js.Any])
    if (columnResizingMode != null) __obj.updateDynamic("columnResizingMode")(columnResizingMode.asInstanceOf[js.Any])
    if (!js.isUndefined(columnWidth)) __obj.updateDynamic("columnWidth")(columnWidth.get.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (customizeColumns != null) __obj.updateDynamic("customizeColumns")(js.Any.fromFunction1(customizeColumns))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataStructure != null) __obj.updateDynamic("dataStructure")(dataStructure.asInstanceOf[js.Any])
    if (dateSerializationFormat != null) __obj.updateDynamic("dateSerializationFormat")(dateSerializationFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (editing != null) __obj.updateDynamic("editing")(editing.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(errorRowEnabled)) __obj.updateDynamic("errorRowEnabled")(errorRowEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(expandNodesOnFiltering)) __obj.updateDynamic("expandNodesOnFiltering")(expandNodesOnFiltering.get.asInstanceOf[js.Any])
    if (expandedRowKeys != null) __obj.updateDynamic("expandedRowKeys")(expandedRowKeys.asInstanceOf[js.Any])
    if (filterBuilder != null) __obj.updateDynamic("filterBuilder")(filterBuilder.asInstanceOf[js.Any])
    if (filterBuilderPopup != null) __obj.updateDynamic("filterBuilderPopup")(filterBuilderPopup.asInstanceOf[js.Any])
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode.asInstanceOf[js.Any])
    if (filterPanel != null) __obj.updateDynamic("filterPanel")(filterPanel.asInstanceOf[js.Any])
    if (filterRow != null) __obj.updateDynamic("filterRow")(filterRow.asInstanceOf[js.Any])
    if (filterSyncEnabled != null) __obj.updateDynamic("filterSyncEnabled")(filterSyncEnabled.asInstanceOf[js.Any])
    if (filterValue != null) __obj.updateDynamic("filterValue")(filterValue.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focusedColumnIndex)) __obj.updateDynamic("focusedColumnIndex")(focusedColumnIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focusedRowEnabled)) __obj.updateDynamic("focusedRowEnabled")(focusedRowEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(focusedRowIndex)) __obj.updateDynamic("focusedRowIndex")(focusedRowIndex.get.asInstanceOf[js.Any])
    if (focusedRowKey != null) __obj.updateDynamic("focusedRowKey")(focusedRowKey.asInstanceOf[js.Any])
    if (hasItemsExpr != null) __obj.updateDynamic("hasItemsExpr")(hasItemsExpr.asInstanceOf[js.Any])
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightChanges)) __obj.updateDynamic("highlightChanges")(highlightChanges.get.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.get.asInstanceOf[js.Any])
    if (itemsExpr != null) __obj.updateDynamic("itemsExpr")(itemsExpr.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (keyboardNavigation != null) __obj.updateDynamic("keyboardNavigation")(keyboardNavigation.asInstanceOf[js.Any])
    if (loadPanel != null) __obj.updateDynamic("loadPanel")(loadPanel.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onAdaptiveDetailRowPreparing != null) __obj.updateDynamic("onAdaptiveDetailRowPreparing")(js.Any.fromFunction1(onAdaptiveDetailRowPreparing))
    if (onCellClick != null) __obj.updateDynamic("onCellClick")(onCellClick.asInstanceOf[js.Any])
    if (onCellDblClick != null) __obj.updateDynamic("onCellDblClick")(js.Any.fromFunction1(onCellDblClick))
    if (onCellHoverChanged != null) __obj.updateDynamic("onCellHoverChanged")(js.Any.fromFunction1(onCellHoverChanged))
    if (onCellPrepared != null) __obj.updateDynamic("onCellPrepared")(js.Any.fromFunction1(onCellPrepared))
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onContextMenuPreparing != null) __obj.updateDynamic("onContextMenuPreparing")(js.Any.fromFunction1(onContextMenuPreparing))
    if (onDataErrorOccurred != null) __obj.updateDynamic("onDataErrorOccurred")(js.Any.fromFunction1(onDataErrorOccurred))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onEditingStart != null) __obj.updateDynamic("onEditingStart")(js.Any.fromFunction1(onEditingStart))
    if (onEditorPrepared != null) __obj.updateDynamic("onEditorPrepared")(js.Any.fromFunction1(onEditorPrepared))
    if (onEditorPreparing != null) __obj.updateDynamic("onEditorPreparing")(js.Any.fromFunction1(onEditorPreparing))
    if (onFocusedCellChanged != null) __obj.updateDynamic("onFocusedCellChanged")(js.Any.fromFunction1(onFocusedCellChanged))
    if (onFocusedCellChanging != null) __obj.updateDynamic("onFocusedCellChanging")(js.Any.fromFunction1(onFocusedCellChanging))
    if (onFocusedRowChanged != null) __obj.updateDynamic("onFocusedRowChanged")(js.Any.fromFunction1(onFocusedRowChanged))
    if (onFocusedRowChanging != null) __obj.updateDynamic("onFocusedRowChanging")(js.Any.fromFunction1(onFocusedRowChanging))
    if (onInitNewRow != null) __obj.updateDynamic("onInitNewRow")(js.Any.fromFunction1(onInitNewRow))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onNodesInitialized != null) __obj.updateDynamic("onNodesInitialized")(js.Any.fromFunction1(onNodesInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onRowClick != null) __obj.updateDynamic("onRowClick")(onRowClick.asInstanceOf[js.Any])
    if (onRowCollapsed != null) __obj.updateDynamic("onRowCollapsed")(js.Any.fromFunction1(onRowCollapsed))
    if (onRowCollapsing != null) __obj.updateDynamic("onRowCollapsing")(js.Any.fromFunction1(onRowCollapsing))
    if (onRowDblClick != null) __obj.updateDynamic("onRowDblClick")(js.Any.fromFunction1(onRowDblClick))
    if (onRowExpanded != null) __obj.updateDynamic("onRowExpanded")(js.Any.fromFunction1(onRowExpanded))
    if (onRowExpanding != null) __obj.updateDynamic("onRowExpanding")(js.Any.fromFunction1(onRowExpanding))
    if (onRowInserted != null) __obj.updateDynamic("onRowInserted")(js.Any.fromFunction1(onRowInserted))
    if (onRowInserting != null) __obj.updateDynamic("onRowInserting")(js.Any.fromFunction1(onRowInserting))
    if (onRowPrepared != null) __obj.updateDynamic("onRowPrepared")(js.Any.fromFunction1(onRowPrepared))
    if (onRowRemoved != null) __obj.updateDynamic("onRowRemoved")(js.Any.fromFunction1(onRowRemoved))
    if (onRowRemoving != null) __obj.updateDynamic("onRowRemoving")(js.Any.fromFunction1(onRowRemoving))
    if (onRowUpdated != null) __obj.updateDynamic("onRowUpdated")(js.Any.fromFunction1(onRowUpdated))
    if (onRowUpdating != null) __obj.updateDynamic("onRowUpdating")(js.Any.fromFunction1(onRowUpdating))
    if (onRowValidating != null) __obj.updateDynamic("onRowValidating")(js.Any.fromFunction1(onRowValidating))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (onToolbarPreparing != null) __obj.updateDynamic("onToolbarPreparing")(js.Any.fromFunction1(onToolbarPreparing))
    if (pager != null) __obj.updateDynamic("pager")(pager.asInstanceOf[js.Any])
    if (paging != null) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (parentIdExpr != null) __obj.updateDynamic("parentIdExpr")(parentIdExpr.asInstanceOf[js.Any])
    if (remoteOperations != null) __obj.updateDynamic("remoteOperations")(remoteOperations.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAsync)) __obj.updateDynamic("renderAsync")(renderAsync.get.asInstanceOf[js.Any])
    if (!js.isUndefined(repaintChangesOnly)) __obj.updateDynamic("repaintChangesOnly")(repaintChangesOnly.get.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (!js.isUndefined(rowAlternationEnabled)) __obj.updateDynamic("rowAlternationEnabled")(rowAlternationEnabled.get.asInstanceOf[js.Any])
    if (rowDragging != null) __obj.updateDynamic("rowDragging")(rowDragging.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.get.asInstanceOf[js.Any])
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling.asInstanceOf[js.Any])
    if (searchPanel != null) __obj.updateDynamic("searchPanel")(searchPanel.asInstanceOf[js.Any])
    if (selectedRowKeys != null) __obj.updateDynamic("selectedRowKeys")(selectedRowKeys.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (!js.isUndefined(showBorders)) __obj.updateDynamic("showBorders")(showBorders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnHeaders)) __obj.updateDynamic("showColumnHeaders")(showColumnHeaders.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnLines)) __obj.updateDynamic("showColumnLines")(showColumnLines.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowLines)) __obj.updateDynamic("showRowLines")(showRowLines.get.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    if (stateStoring != null) __obj.updateDynamic("stateStoring")(stateStoring.asInstanceOf[js.Any])
    if (!js.isUndefined(tabIndex)) __obj.updateDynamic("tabIndex")(tabIndex.get.asInstanceOf[js.Any])
    if (!js.isUndefined(twoWayBindingEnabled)) __obj.updateDynamic("twoWayBindingEnabled")(twoWayBindingEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrapEnabled)) __obj.updateDynamic("wordWrapEnabled")(wordWrapEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeListOptions]
  }
}

