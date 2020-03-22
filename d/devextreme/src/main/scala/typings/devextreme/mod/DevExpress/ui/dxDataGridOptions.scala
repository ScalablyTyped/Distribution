package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonAllowCollapsing
import typings.devextreme.AnonAllowColumnDragging
import typings.devextreme.AnonAllowDropInsideItem
import typings.devextreme.AnonAllowExportSelectedData
import typings.devextreme.AnonAllowedPageSizes
import typings.devextreme.AnonApplyFilter
import typings.devextreme.AnonAscendingText
import typings.devextreme.AnonAutoExpandAll
import typings.devextreme.AnonBrokenRules
import typings.devextreme.AnonCalculateCustomSummary
import typings.devextreme.AnonCancelColumn
import typings.devextreme.AnonCancelComponent
import typings.devextreme.AnonCellElement
import typings.devextreme.AnonColumnIndex
import typings.devextreme.AnonColumns
import typings.devextreme.AnonComponentData
import typings.devextreme.AnonComponentDxDataGrid
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonCurrentDeselectedRowKeys
import typings.devextreme.AnonCustomLoad
import typings.devextreme.AnonCustomizeText
import typings.devextreme.AnonDataElement
import typings.devextreme.AnonDataField
import typings.devextreme.AnonDisabled
import typings.devextreme.AnonDisplayValue
import typings.devextreme.AnonEditOnKeyPress
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementFileName
import typings.devextreme.AnonElementKey
import typings.devextreme.AnonEmptyPanelText
import typings.devextreme.AnonEnabled
import typings.devextreme.AnonError
import typings.devextreme.AnonFiltering
import typings.devextreme.AnonFormOptions
import typings.devextreme.AnonFormat
import typings.devextreme.AnonGroupColumn
import typings.devextreme.AnonGroupIndex
import typings.devextreme.AnonHandled
import typings.devextreme.AnonHeight
import typings.devextreme.AnonHighlightCaseSensitive
import typings.devextreme.AnonIndicatorSrc
import typings.devextreme.AnonIsExpanded
import typings.devextreme.AnonIsNewRow
import typings.devextreme.AnonIsSelected
import typings.devextreme.AnonItems
import typings.devextreme.AnonKey
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.AnonNewData
import typings.devextreme.AnonNewRowIndex
import typings.devextreme.AnonPromise
import typings.devextreme.AnonRow
import typings.devextreme.AnonRowElement
import typings.devextreme.AnonToolbarOptions
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.nextColumn
import typings.devextreme.devextremeStrings.widget
import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxDataGridOptions extends GridBaseOptions[dxDataGrid] {
  /** An array of grid columns. */
  @JSName("columns")
  var columns_dxDataGridOptions: js.UndefOr[js.Array[dxDataGridColumn | String]] = js.undefined
  /** Customizes columns after they are created. */
  var customizeColumns: js.UndefOr[js.Function1[/* columns */ js.Array[dxDataGridColumn], _]] = js.undefined
  /** Customizes data before export. You can use the export.customizeExcelCell function instead. */
  var customizeExportData: js.UndefOr[
    js.Function2[
      /* columns */ js.Array[dxDataGridColumn], 
      /* rows */ js.Array[dxDataGridRowObject], 
      _
    ]
  ] = js.undefined
  /** Configures editing. */
  @JSName("editing")
  var editing_dxDataGridOptions: js.UndefOr[dxDataGridEditing] = js.undefined
  /** Configures client-side exporting. */
  var export: js.UndefOr[AnonAllowExportSelectedData] = js.undefined
  /** Configures the group panel. */
  var groupPanel: js.UndefOr[AnonAllowColumnDragging] = js.undefined
  /** Configures grouping. */
  var grouping: js.UndefOr[AnonAllowCollapsing] = js.undefined
  /** Specifies which data field provides keys for data items. Applies only if data is a simple array. */
  var keyExpr: js.UndefOr[String | js.Array[String]] = js.undefined
  /** Allows you to build a master-detail interface in the grid. */
  var masterDetail: js.UndefOr[AnonAutoExpandAll] = js.undefined
  /** A function that is executed when a cell is clicked or tapped. Executed before onRowClick. */
  var onCellClick: js.UndefOr[(js.Function1[/* e */ AnonCellElement, _]) | String] = js.undefined
  /** A function that is executed when a cell is double-clicked or double-tapped. Executed before onRowDblClick. */
  var onCellDblClick: js.UndefOr[js.Function1[/* e */ AnonColumnIndex, _]] = js.undefined
  /** A function that is executed after the pointer enters or leaves a cell. */
  var onCellHoverChanged: js.UndefOr[js.Function1[/* e */ AnonDisplayValue, _]] = js.undefined
  /** A function that is executed after a cell is created. */
  var onCellPrepared: js.UndefOr[js.Function1[/* e */ AnonIsExpanded, _]] = js.undefined
  /** A function that is executed before the context menu is rendered. */
  var onContextMenuPreparing: js.UndefOr[js.Function1[/* e */ AnonItems, _]] = js.undefined
  /** A function that is executed before a cell or row switches to the editing state. */
  var onEditingStart: js.UndefOr[js.Function1[/* e */ AnonCancelColumn, _]] = js.undefined
  /** A function that is executed after an editor is created. Not executed for cells with an editCellTemplate. */
  var onEditorPrepared: js.UndefOr[js.Function1[/* options */ AnonDataField, _]] = js.undefined
  /** A function used to customize or replace default editors. Not executed for cells with an editCellTemplate. */
  var onEditorPreparing: js.UndefOr[js.Function1[/* e */ AnonDisabled, _]] = js.undefined
  /** A function that is executed after data is exported. */
  var onExported: js.UndefOr[js.Function1[/* e */ AnonComponentDxDataGrid, _]] = js.undefined
  /** A function that is executed before data is exported. */
  var onExporting: js.UndefOr[js.Function1[/* e */ AnonElementFileName, _]] = js.undefined
  /** A function that is executed before a file with exported data is saved to the user's local storage. */
  var onFileSaving: js.UndefOr[js.Function1[/* e */ AnonFormat, _]] = js.undefined
  /** A function that is executed after the focused cell changes. */
  var onFocusedCellChanged: js.UndefOr[js.Function1[/* e */ AnonRow, _]] = js.undefined
  /** A function that is executed before the focused cell changes. */
  var onFocusedCellChanging: js.UndefOr[js.Function1[/* e */ AnonColumns, _]] = js.undefined
  /** A function that is executed after the focused row changes. Applies only when focusedRowEnabled is true. */
  var onFocusedRowChanged: js.UndefOr[js.Function1[/* e */ AnonRowElement, _]] = js.undefined
  /** A function that is executed before the focused row changes. Applies only when focusedRowEnabled is true. */
  var onFocusedRowChanging: js.UndefOr[js.Function1[/* e */ AnonNewRowIndex, _]] = js.undefined
  /** A function that is executed when a row is clicked or tapped. */
  var onRowClick: js.UndefOr[(js.Function1[/* e */ AnonGroupIndex, _]) | String] = js.undefined
  /** A function that is executed when a row is double-clicked or double-tapped. Executed after onCellDblClick. */
  var onRowDblClick: js.UndefOr[js.Function1[/* e */ AnonIsNewRow, _]] = js.undefined
  /** A function that is executed after a row is created. */
  var onRowPrepared: js.UndefOr[js.Function1[/* e */ AnonIsSelected, _]] = js.undefined
  /** Notifies the DataGrid of the server's data processing operations. */
  var remoteOperations: js.UndefOr[Boolean | AnonFiltering | auto] = js.undefined
  /** Specifies a custom template for rows. */
  var rowTemplate: js.UndefOr[
    typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* rowElement */ dxElement, /* rowInfo */ js.Any, _])
  ] = js.undefined
  /** Configures scrolling. */
  @JSName("scrolling")
  var scrolling_dxDataGridOptions: js.UndefOr[dxDataGridScrolling] = js.undefined
  /** Specifies filters for the rows that must be selected initially. Applies only if selection.deferred is true. */
  var selectionFilter: js.UndefOr[String | js.Array[_] | js.Function] = js.undefined
  /** Configures runtime selection. */
  @JSName("selection")
  var selection_dxDataGridOptions: js.UndefOr[dxDataGridSelection] = js.undefined
  /** Allows you to sort groups according to the values of group summary items. */
  var sortByGroupSummaryInfo: js.UndefOr[js.Array[AnonGroupColumn]] = js.undefined
  /** Specifies the options of the grid summary. */
  var summary: js.UndefOr[AnonCalculateCustomSummary] = js.undefined
}

object dxDataGridOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    allowColumnReordering: js.UndefOr[Boolean] = js.undefined,
    allowColumnResizing: js.UndefOr[Boolean] = js.undefined,
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
    columns: js.Array[dxDataGridColumn | String] = null,
    customizeColumns: /* columns */ js.Array[dxDataGridColumn] => _ = null,
    customizeExportData: (/* columns */ js.Array[dxDataGridColumn], /* rows */ js.Array[dxDataGridRowObject]) => _ = null,
    dataSource: String | js.Array[_] | DataSource | DataSourceOptions = null,
    dateSerializationFormat: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editing: dxDataGridEditing = null,
    elementAttr: js.Any = null,
    errorRowEnabled: js.UndefOr[Boolean] = js.undefined,
    export: AnonAllowExportSelectedData = null,
    filterBuilder: dxFilterBuilderOptions = null,
    filterBuilderPopup: dxPopupOptions[dxPopup] = null,
    filterPanel: AnonCustomizeText[dxDataGrid] = null,
    filterRow: AnonApplyFilter = null,
    filterSyncEnabled: Boolean | auto = null,
    filterValue: String | js.Array[_] | js.Function = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    focusedColumnIndex: Int | Double = null,
    focusedRowEnabled: js.UndefOr[Boolean] = js.undefined,
    focusedRowIndex: Int | Double = null,
    focusedRowKey: js.Any = null,
    groupPanel: AnonAllowColumnDragging = null,
    grouping: AnonAllowCollapsing = null,
    headerFilter: AnonHeight = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    highlightChanges: js.UndefOr[Boolean] = js.undefined,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    keyExpr: String | js.Array[String] = null,
    keyboardNavigation: AnonEditOnKeyPress = null,
    loadPanel: AnonIndicatorSrc = null,
    masterDetail: AnonAutoExpandAll = null,
    noDataText: String = null,
    onAdaptiveDetailRowPreparing: /* e */ AnonFormOptions[dxDataGrid] => _ = null,
    onCellClick: (js.Function1[/* e */ AnonCellElement, _]) | String = null,
    onCellDblClick: /* e */ AnonColumnIndex => _ = null,
    onCellHoverChanged: /* e */ AnonDisplayValue => _ = null,
    onCellPrepared: /* e */ AnonIsExpanded => _ = null,
    onContentReady: /* e */ AnonComponentElement[dxDataGrid] => _ = null,
    onContextMenuPreparing: /* e */ AnonItems => _ = null,
    onDataErrorOccurred: /* e */ AnonError[dxDataGrid] => _ = null,
    onDisposing: /* e */ AnonModel[dxDataGrid] => _ = null,
    onEditingStart: /* e */ AnonCancelColumn => _ = null,
    onEditorPrepared: /* options */ AnonDataField => _ = null,
    onEditorPreparing: /* e */ AnonDisabled => _ = null,
    onExported: /* e */ AnonComponentDxDataGrid => _ = null,
    onExporting: /* e */ AnonElementFileName => _ = null,
    onFileSaving: /* e */ AnonFormat => _ = null,
    onFocusedCellChanged: /* e */ AnonRow => _ = null,
    onFocusedCellChanging: /* e */ AnonColumns => _ = null,
    onFocusedRowChanged: /* e */ AnonRowElement => _ = null,
    onFocusedRowChanging: /* e */ AnonNewRowIndex => _ = null,
    onInitNewRow: /* e */ AnonPromise[dxDataGrid] => _ = null,
    onInitialized: /* e */ AnonElement[dxDataGrid] => _ = null,
    onKeyDown: /* e */ AnonHandled[dxDataGrid] => _ = null,
    onOptionChanged: /* e */ AnonName[dxDataGrid] => _ = null,
    onRowClick: (js.Function1[/* e */ AnonGroupIndex, _]) | String = null,
    onRowCollapsed: /* e */ AnonKey[dxDataGrid] => _ = null,
    onRowCollapsing: /* e */ AnonCancelComponent[dxDataGrid] => _ = null,
    onRowDblClick: /* e */ AnonIsNewRow => _ = null,
    onRowExpanded: /* e */ AnonKey[dxDataGrid] => _ = null,
    onRowExpanding: /* e */ AnonCancelComponent[dxDataGrid] => _ = null,
    onRowInserted: /* e */ AnonComponentData[dxDataGrid] => _ = null,
    onRowInserting: /* e */ AnonDataElement[dxDataGrid] => _ = null,
    onRowPrepared: /* e */ AnonIsSelected => _ = null,
    onRowRemoved: /* e */ AnonComponentData[dxDataGrid] => _ = null,
    onRowRemoving: /* e */ AnonElementKey[dxDataGrid] => _ = null,
    onRowUpdated: /* e */ AnonComponentData[dxDataGrid] => _ = null,
    onRowUpdating: /* e */ AnonNewData[dxDataGrid] => _ = null,
    onRowValidating: /* e */ AnonBrokenRules[dxDataGrid] => _ = null,
    onSelectionChanged: /* e */ AnonCurrentDeselectedRowKeys[dxDataGrid] => _ = null,
    onToolbarPreparing: /* e */ AnonToolbarOptions[dxDataGrid] => _ = null,
    pager: AnonAllowedPageSizes = null,
    paging: GridBasePaging = null,
    remoteOperations: Boolean | AnonFiltering | auto = null,
    renderAsync: js.UndefOr[Boolean] = js.undefined,
    repaintChangesOnly: js.UndefOr[Boolean] = js.undefined,
    rowAlternationEnabled: js.UndefOr[Boolean] = js.undefined,
    rowDragging: AnonAllowDropInsideItem = null,
    rowTemplate: typings.devextreme.mod.DevExpress.core.template | (js.Function2[/* rowElement */ dxElement, /* rowInfo */ js.Any, _]) = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrolling: dxDataGridScrolling = null,
    searchPanel: AnonHighlightCaseSensitive = null,
    selectedRowKeys: js.Array[_] = null,
    selection: dxDataGridSelection = null,
    selectionFilter: String | js.Array[_] | js.Function = null,
    showBorders: js.UndefOr[Boolean] = js.undefined,
    showColumnHeaders: js.UndefOr[Boolean] = js.undefined,
    showColumnLines: js.UndefOr[Boolean] = js.undefined,
    showRowLines: js.UndefOr[Boolean] = js.undefined,
    sortByGroupSummaryInfo: js.Array[AnonGroupColumn] = null,
    sorting: AnonAscendingText = null,
    stateStoring: AnonCustomLoad = null,
    summary: AnonCalculateCustomSummary = null,
    tabIndex: Int | Double = null,
    twoWayBindingEnabled: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
  ): dxDataGridOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(allowColumnReordering)) __obj.updateDynamic("allowColumnReordering")(allowColumnReordering.asInstanceOf[js.Any])
    if (!js.isUndefined(allowColumnResizing)) __obj.updateDynamic("allowColumnResizing")(allowColumnResizing.asInstanceOf[js.Any])
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
    if (customizeExportData != null) __obj.updateDynamic("customizeExportData")(js.Any.fromFunction2(customizeExportData))
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dateSerializationFormat != null) __obj.updateDynamic("dateSerializationFormat")(dateSerializationFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (editing != null) __obj.updateDynamic("editing")(editing.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(errorRowEnabled)) __obj.updateDynamic("errorRowEnabled")(errorRowEnabled.asInstanceOf[js.Any])
    if (export != null) __obj.updateDynamic("export")(export.asInstanceOf[js.Any])
    if (filterBuilder != null) __obj.updateDynamic("filterBuilder")(filterBuilder.asInstanceOf[js.Any])
    if (filterBuilderPopup != null) __obj.updateDynamic("filterBuilderPopup")(filterBuilderPopup.asInstanceOf[js.Any])
    if (filterPanel != null) __obj.updateDynamic("filterPanel")(filterPanel.asInstanceOf[js.Any])
    if (filterRow != null) __obj.updateDynamic("filterRow")(filterRow.asInstanceOf[js.Any])
    if (filterSyncEnabled != null) __obj.updateDynamic("filterSyncEnabled")(filterSyncEnabled.asInstanceOf[js.Any])
    if (filterValue != null) __obj.updateDynamic("filterValue")(filterValue.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (focusedColumnIndex != null) __obj.updateDynamic("focusedColumnIndex")(focusedColumnIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(focusedRowEnabled)) __obj.updateDynamic("focusedRowEnabled")(focusedRowEnabled.asInstanceOf[js.Any])
    if (focusedRowIndex != null) __obj.updateDynamic("focusedRowIndex")(focusedRowIndex.asInstanceOf[js.Any])
    if (focusedRowKey != null) __obj.updateDynamic("focusedRowKey")(focusedRowKey.asInstanceOf[js.Any])
    if (groupPanel != null) __obj.updateDynamic("groupPanel")(groupPanel.asInstanceOf[js.Any])
    if (grouping != null) __obj.updateDynamic("grouping")(grouping.asInstanceOf[js.Any])
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightChanges)) __obj.updateDynamic("highlightChanges")(highlightChanges.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (keyExpr != null) __obj.updateDynamic("keyExpr")(keyExpr.asInstanceOf[js.Any])
    if (keyboardNavigation != null) __obj.updateDynamic("keyboardNavigation")(keyboardNavigation.asInstanceOf[js.Any])
    if (loadPanel != null) __obj.updateDynamic("loadPanel")(loadPanel.asInstanceOf[js.Any])
    if (masterDetail != null) __obj.updateDynamic("masterDetail")(masterDetail.asInstanceOf[js.Any])
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
    if (onExported != null) __obj.updateDynamic("onExported")(js.Any.fromFunction1(onExported))
    if (onExporting != null) __obj.updateDynamic("onExporting")(js.Any.fromFunction1(onExporting))
    if (onFileSaving != null) __obj.updateDynamic("onFileSaving")(js.Any.fromFunction1(onFileSaving))
    if (onFocusedCellChanged != null) __obj.updateDynamic("onFocusedCellChanged")(js.Any.fromFunction1(onFocusedCellChanged))
    if (onFocusedCellChanging != null) __obj.updateDynamic("onFocusedCellChanging")(js.Any.fromFunction1(onFocusedCellChanging))
    if (onFocusedRowChanged != null) __obj.updateDynamic("onFocusedRowChanged")(js.Any.fromFunction1(onFocusedRowChanged))
    if (onFocusedRowChanging != null) __obj.updateDynamic("onFocusedRowChanging")(js.Any.fromFunction1(onFocusedRowChanging))
    if (onInitNewRow != null) __obj.updateDynamic("onInitNewRow")(js.Any.fromFunction1(onInitNewRow))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
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
    if (remoteOperations != null) __obj.updateDynamic("remoteOperations")(remoteOperations.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAsync)) __obj.updateDynamic("renderAsync")(renderAsync.asInstanceOf[js.Any])
    if (!js.isUndefined(repaintChangesOnly)) __obj.updateDynamic("repaintChangesOnly")(repaintChangesOnly.asInstanceOf[js.Any])
    if (!js.isUndefined(rowAlternationEnabled)) __obj.updateDynamic("rowAlternationEnabled")(rowAlternationEnabled.asInstanceOf[js.Any])
    if (rowDragging != null) __obj.updateDynamic("rowDragging")(rowDragging.asInstanceOf[js.Any])
    if (rowTemplate != null) __obj.updateDynamic("rowTemplate")(rowTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (scrolling != null) __obj.updateDynamic("scrolling")(scrolling.asInstanceOf[js.Any])
    if (searchPanel != null) __obj.updateDynamic("searchPanel")(searchPanel.asInstanceOf[js.Any])
    if (selectedRowKeys != null) __obj.updateDynamic("selectedRowKeys")(selectedRowKeys.asInstanceOf[js.Any])
    if (selection != null) __obj.updateDynamic("selection")(selection.asInstanceOf[js.Any])
    if (selectionFilter != null) __obj.updateDynamic("selectionFilter")(selectionFilter.asInstanceOf[js.Any])
    if (!js.isUndefined(showBorders)) __obj.updateDynamic("showBorders")(showBorders.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnHeaders)) __obj.updateDynamic("showColumnHeaders")(showColumnHeaders.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnLines)) __obj.updateDynamic("showColumnLines")(showColumnLines.asInstanceOf[js.Any])
    if (!js.isUndefined(showRowLines)) __obj.updateDynamic("showRowLines")(showRowLines.asInstanceOf[js.Any])
    if (sortByGroupSummaryInfo != null) __obj.updateDynamic("sortByGroupSummaryInfo")(sortByGroupSummaryInfo.asInstanceOf[js.Any])
    if (sorting != null) __obj.updateDynamic("sorting")(sorting.asInstanceOf[js.Any])
    if (stateStoring != null) __obj.updateDynamic("stateStoring")(stateStoring.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(twoWayBindingEnabled)) __obj.updateDynamic("twoWayBindingEnabled")(twoWayBindingEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrapEnabled)) __obj.updateDynamic("wordWrapEnabled")(wordWrapEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxDataGridOptions]
  }
}

