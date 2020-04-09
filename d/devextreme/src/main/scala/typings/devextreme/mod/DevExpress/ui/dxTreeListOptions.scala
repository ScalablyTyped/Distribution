package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonAllowDropInsideItem
import typings.devextreme.AnonAllowedPageSizes
import typings.devextreme.AnonApplyFilter
import typings.devextreme.AnonAscendingText
import typings.devextreme.AnonBrokenRules
import typings.devextreme.AnonCancelComponent
import typings.devextreme.AnonCellElementColumn
import typings.devextreme.AnonColumnIndexComponent
import typings.devextreme.AnonComponentData
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonCurrentDeselectedRowKeys
import typings.devextreme.AnonCustomLoad
import typings.devextreme.AnonCustomizeText
import typings.devextreme.AnonDataDisplayValue
import typings.devextreme.AnonDataElement
import typings.devextreme.AnonEditOnKeyPress
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementKey
import typings.devextreme.AnonEmptyPanelText
import typings.devextreme.AnonEnabled
import typings.devextreme.AnonError
import typings.devextreme.AnonEventType
import typings.devextreme.AnonFormOptions
import typings.devextreme.AnonGrouping
import typings.devextreme.AnonHandled
import typings.devextreme.AnonHeight
import typings.devextreme.AnonHighlightCaseSensitive
import typings.devextreme.AnonIndicatorSrc
import typings.devextreme.AnonIsHighlighted
import typings.devextreme.AnonKey
import typings.devextreme.AnonKeyModel
import typings.devextreme.AnonLevel
import typings.devextreme.AnonModel
import typings.devextreme.AnonModelRow
import typings.devextreme.AnonName
import typings.devextreme.AnonNewData
import typings.devextreme.AnonNode
import typings.devextreme.AnonParentType
import typings.devextreme.AnonPrevRowIndex
import typings.devextreme.AnonPromise
import typings.devextreme.AnonReadOnly
import typings.devextreme.AnonRoot
import typings.devextreme.AnonRowRowElement
import typings.devextreme.AnonTarget
import typings.devextreme.AnonToolbarOptions
import typings.devextreme.AnonValues
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
  var onCellClick: js.UndefOr[(js.Function1[/* e */ AnonCellElementColumn, _]) | String] = js.undefined
  /** @name dxTreeList.Options.onCellDblClick */
  var onCellDblClick: js.UndefOr[js.Function1[/* e */ AnonColumnIndexComponent, _]] = js.undefined
  /** @name dxTreeList.Options.onCellHoverChanged */
  var onCellHoverChanged: js.UndefOr[js.Function1[/* e */ AnonEventType, _]] = js.undefined
  /** @name dxTreeList.Options.onCellPrepared */
  var onCellPrepared: js.UndefOr[js.Function1[/* e */ AnonDataDisplayValue, _]] = js.undefined
  /** @name dxTreeList.Options.onContextMenuPreparing */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ AnonTarget, _]] = js.undefined
  /** @name dxTreeList.Options.onEditingStart */
  var onEditingStart: js.UndefOr[js.Function1[/* e */ AnonKeyModel, _]] = js.undefined
  /** @name dxTreeList.Options.onEditorPrepared */
  var onEditorPrepared: js.UndefOr[js.Function1[/* options */ AnonParentType, _]] = js.undefined
  /** @name dxTreeList.Options.onEditorPreparing */
  var onEditorPreparing: js.UndefOr[js.Function1[/* e */ AnonReadOnly, _]] = js.undefined
  /** @name dxTreeList.Options.onFocusedCellChanged */
  var onFocusedCellChanged: js.UndefOr[js.Function1[/* e */ AnonModelRow, _]] = js.undefined
  /** @name dxTreeList.Options.onFocusedCellChanging */
  var onFocusedCellChanging: js.UndefOr[js.Function1[/* e */ AnonIsHighlighted, _]] = js.undefined
  /** @name dxTreeList.Options.onFocusedRowChanged */
  var onFocusedRowChanged: js.UndefOr[js.Function1[/* e */ AnonRowRowElement, _]] = js.undefined
  /** @name dxTreeList.Options.onFocusedRowChanging */
  var onFocusedRowChanging: js.UndefOr[js.Function1[/* e */ AnonPrevRowIndex, _]] = js.undefined
  /** @name dxTreeList.Options.onNodesInitialized */
  var onNodesInitialized: js.UndefOr[js.Function1[/* e */ AnonRoot, _]] = js.undefined
  /** @name dxTreeList.Options.onRowClick */
  var onRowClick: js.UndefOr[(js.Function1[/* e */ AnonLevel, _]) | String] = js.undefined
  /** @name dxTreeList.Options.onRowDblClick */
  var onRowDblClick: js.UndefOr[js.Function1[/* e */ AnonValues, _]] = js.undefined
  /** @name dxTreeList.Options.onRowPrepared */
  var onRowPrepared: js.UndefOr[js.Function1[/* e */ AnonNode, _]] = js.undefined
  /** @name dxTreeList.Options.paging */
  @JSName("paging")
  var paging_dxTreeListOptions: js.UndefOr[dxTreeListPaging] = js.undefined
  /** @name dxTreeList.Options.parentIdExpr */
  var parentIdExpr: js.UndefOr[String | js.Function] = js.undefined
  /** @name dxTreeList.Options.remoteOperations */
  var remoteOperations: js.UndefOr[AnonGrouping | auto] = js.undefined
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
    columnChooser: AnonEmptyPanelText = null,
    columnFixing: AnonEnabled = null,
    columnHidingEnabled: js.UndefOr[Boolean] = js.undefined,
    columnMinWidth: Int | Double = null,
    columnResizingMode: nextColumn | widget = null,
    columnWidth: Int | Double = null,
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
    filterPanel: AnonCustomizeText[dxTreeList] = null,
    filterRow: AnonApplyFilter = null,
    filterSyncEnabled: Boolean | auto = null,
    filterValue: String | js.Array[_] | js.Function = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    focusedColumnIndex: Int | Double = null,
    focusedRowEnabled: js.UndefOr[Boolean] = js.undefined,
    focusedRowIndex: Int | Double = null,
    focusedRowKey: js.Any = null,
    hasItemsExpr: String | js.Function = null,
    headerFilter: AnonHeight = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    highlightChanges: js.UndefOr[Boolean] = js.undefined,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    itemsExpr: String | js.Function = null,
    keyExpr: String | js.Function = null,
    keyboardNavigation: AnonEditOnKeyPress = null,
    loadPanel: AnonIndicatorSrc = null,
    noDataText: String = null,
    onAdaptiveDetailRowPreparing: /* e */ AnonFormOptions[dxTreeList] => _ = null,
    onCellClick: (js.Function1[/* e */ AnonCellElementColumn, _]) | String = null,
    onCellDblClick: /* e */ AnonColumnIndexComponent => _ = null,
    onCellHoverChanged: /* e */ AnonEventType => _ = null,
    onCellPrepared: /* e */ AnonDataDisplayValue => _ = null,
    onContentReady: /* e */ AnonComponentElement[dxTreeList] => _ = null,
    onContextMenuPreparing: /* e */ AnonTarget => _ = null,
    onDataErrorOccurred: /* e */ AnonError[dxTreeList] => _ = null,
    onDisposing: /* e */ AnonModel[dxTreeList] => _ = null,
    onEditingStart: /* e */ AnonKeyModel => _ = null,
    onEditorPrepared: /* options */ AnonParentType => _ = null,
    onEditorPreparing: /* e */ AnonReadOnly => _ = null,
    onFocusedCellChanged: /* e */ AnonModelRow => _ = null,
    onFocusedCellChanging: /* e */ AnonIsHighlighted => _ = null,
    onFocusedRowChanged: /* e */ AnonRowRowElement => _ = null,
    onFocusedRowChanging: /* e */ AnonPrevRowIndex => _ = null,
    onInitNewRow: /* e */ AnonPromise[dxTreeList] => _ = null,
    onInitialized: /* e */ AnonElement[dxTreeList] => _ = null,
    onKeyDown: /* e */ AnonHandled[dxTreeList] => _ = null,
    onNodesInitialized: /* e */ AnonRoot => _ = null,
    onOptionChanged: /* e */ AnonName[dxTreeList] => _ = null,
    onRowClick: (js.Function1[/* e */ AnonLevel, _]) | String = null,
    onRowCollapsed: /* e */ AnonKey[dxTreeList] => _ = null,
    onRowCollapsing: /* e */ AnonCancelComponent[dxTreeList] => _ = null,
    onRowDblClick: /* e */ AnonValues => _ = null,
    onRowExpanded: /* e */ AnonKey[dxTreeList] => _ = null,
    onRowExpanding: /* e */ AnonCancelComponent[dxTreeList] => _ = null,
    onRowInserted: /* e */ AnonComponentData[dxTreeList] => _ = null,
    onRowInserting: /* e */ AnonDataElement[dxTreeList] => _ = null,
    onRowPrepared: /* e */ AnonNode => _ = null,
    onRowRemoved: /* e */ AnonComponentData[dxTreeList] => _ = null,
    onRowRemoving: /* e */ AnonElementKey[dxTreeList] => _ = null,
    onRowUpdated: /* e */ AnonComponentData[dxTreeList] => _ = null,
    onRowUpdating: /* e */ AnonNewData[dxTreeList] => _ = null,
    onRowValidating: /* e */ AnonBrokenRules[dxTreeList] => _ = null,
    onSelectionChanged: /* e */ AnonCurrentDeselectedRowKeys[dxTreeList] => _ = null,
    onToolbarPreparing: /* e */ AnonToolbarOptions[dxTreeList] => _ = null,
    pager: AnonAllowedPageSizes = null,
    paging: dxTreeListPaging = null,
    parentIdExpr: String | js.Function = null,
    remoteOperations: AnonGrouping | auto = null,
    renderAsync: js.UndefOr[Boolean] = js.undefined,
    repaintChangesOnly: js.UndefOr[Boolean] = js.undefined,
    rootValue: js.Any = null,
    rowAlternationEnabled: js.UndefOr[Boolean] = js.undefined,
    rowDragging: AnonAllowDropInsideItem = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrolling: dxTreeListScrolling = null,
    searchPanel: AnonHighlightCaseSensitive = null,
    selectedRowKeys: js.Array[_] = null,
    selection: dxTreeListSelection = null,
    showBorders: js.UndefOr[Boolean] = js.undefined,
    showColumnHeaders: js.UndefOr[Boolean] = js.undefined,
    showColumnLines: js.UndefOr[Boolean] = js.undefined,
    showRowLines: js.UndefOr[Boolean] = js.undefined,
    sorting: AnonAscendingText = null,
    stateStoring: AnonCustomLoad = null,
    tabIndex: Int | Double = null,
    twoWayBindingEnabled: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
  ): dxTreeListOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(allowColumnReordering)) __obj.updateDynamic("allowColumnReordering")(allowColumnReordering.asInstanceOf[js.Any])
    if (!js.isUndefined(allowColumnResizing)) __obj.updateDynamic("allowColumnResizing")(allowColumnResizing.asInstanceOf[js.Any])
    if (!js.isUndefined(autoExpandAll)) __obj.updateDynamic("autoExpandAll")(autoExpandAll.asInstanceOf[js.Any])
    if (!js.isUndefined(autoNavigateToFocusedRow)) __obj.updateDynamic("autoNavigateToFocusedRow")(autoNavigateToFocusedRow.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(cacheEnabled)) __obj.updateDynamic("cacheEnabled")(cacheEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(cellHintEnabled)) __obj.updateDynamic("cellHintEnabled")(cellHintEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(columnAutoWidth)) __obj.updateDynamic("columnAutoWidth")(columnAutoWidth.asInstanceOf[js.Any])
    if (columnChooser != null) __obj.updateDynamic("columnChooser")(columnChooser.asInstanceOf[js.Any])
    if (columnFixing != null) __obj.updateDynamic("columnFixing")(columnFixing.asInstanceOf[js.Any])
    if (!js.isUndefined(columnHidingEnabled)) __obj.updateDynamic("columnHidingEnabled")(columnHidingEnabled.asInstanceOf[js.Any])
    if (columnMinWidth != null) __obj.updateDynamic("columnMinWidth")(columnMinWidth.asInstanceOf[js.Any])
    if (columnResizingMode != null) __obj.updateDynamic("columnResizingMode")(columnResizingMode.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (customizeColumns != null) __obj.updateDynamic("customizeColumns")(js.Any.fromFunction1(customizeColumns))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dataStructure != null) __obj.updateDynamic("dataStructure")(dataStructure.asInstanceOf[js.Any])
    if (dateSerializationFormat != null) __obj.updateDynamic("dateSerializationFormat")(dateSerializationFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (editing != null) __obj.updateDynamic("editing")(editing.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(errorRowEnabled)) __obj.updateDynamic("errorRowEnabled")(errorRowEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(expandNodesOnFiltering)) __obj.updateDynamic("expandNodesOnFiltering")(expandNodesOnFiltering.asInstanceOf[js.Any])
    if (expandedRowKeys != null) __obj.updateDynamic("expandedRowKeys")(expandedRowKeys.asInstanceOf[js.Any])
    if (filterBuilder != null) __obj.updateDynamic("filterBuilder")(filterBuilder.asInstanceOf[js.Any])
    if (filterBuilderPopup != null) __obj.updateDynamic("filterBuilderPopup")(filterBuilderPopup.asInstanceOf[js.Any])
    if (filterMode != null) __obj.updateDynamic("filterMode")(filterMode.asInstanceOf[js.Any])
    if (filterPanel != null) __obj.updateDynamic("filterPanel")(filterPanel.asInstanceOf[js.Any])
    if (filterRow != null) __obj.updateDynamic("filterRow")(filterRow.asInstanceOf[js.Any])
    if (filterSyncEnabled != null) __obj.updateDynamic("filterSyncEnabled")(filterSyncEnabled.asInstanceOf[js.Any])
    if (filterValue != null) __obj.updateDynamic("filterValue")(filterValue.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (focusedColumnIndex != null) __obj.updateDynamic("focusedColumnIndex")(focusedColumnIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(focusedRowEnabled)) __obj.updateDynamic("focusedRowEnabled")(focusedRowEnabled.asInstanceOf[js.Any])
    if (focusedRowIndex != null) __obj.updateDynamic("focusedRowIndex")(focusedRowIndex.asInstanceOf[js.Any])
    if (focusedRowKey != null) __obj.updateDynamic("focusedRowKey")(focusedRowKey.asInstanceOf[js.Any])
    if (hasItemsExpr != null) __obj.updateDynamic("hasItemsExpr")(hasItemsExpr.asInstanceOf[js.Any])
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightChanges)) __obj.updateDynamic("highlightChanges")(highlightChanges.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
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
    if (!js.isUndefined(renderAsync)) __obj.updateDynamic("renderAsync")(renderAsync.asInstanceOf[js.Any])
    if (!js.isUndefined(repaintChangesOnly)) __obj.updateDynamic("repaintChangesOnly")(repaintChangesOnly.asInstanceOf[js.Any])
    if (rootValue != null) __obj.updateDynamic("rootValue")(rootValue.asInstanceOf[js.Any])
    if (!js.isUndefined(rowAlternationEnabled)) __obj.updateDynamic("rowAlternationEnabled")(rowAlternationEnabled.asInstanceOf[js.Any])
    if (rowDragging != null) __obj.updateDynamic("rowDragging")(rowDragging.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling.asInstanceOf[js.Any])
    if (searchPanel != null) __obj.updateDynamic("searchPanel")(searchPanel.asInstanceOf[js.Any])
    if (selectedRowKeys != null) __obj.updateDynamic("selectedRowKeys")(selectedRowKeys.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (!js.isUndefined(showBorders)) __obj.updateDynamic("showBorders")(showBorders.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnHeaders)) __obj.updateDynamic("showColumnHeaders")(showColumnHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnLines)) __obj.updateDynamic("showColumnLines")(showColumnLines.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowLines)) __obj.updateDynamic("showRowLines")(showRowLines.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    if (stateStoring != null) __obj.updateDynamic("stateStoring")(stateStoring.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(twoWayBindingEnabled)) __obj.updateDynamic("twoWayBindingEnabled")(twoWayBindingEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrapEnabled)) __obj.updateDynamic("wordWrapEnabled")(wordWrapEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxTreeListOptions]
  }
}

