package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonAllowDropInsideItem
import typings.devextreme.AnonAllowedPageSizes
import typings.devextreme.AnonApplyFilter
import typings.devextreme.AnonAscendingText
import typings.devextreme.AnonBrokenRules
import typings.devextreme.AnonCancelComponent
import typings.devextreme.AnonComponentData
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonCurrentDeselectedRowKeys
import typings.devextreme.AnonCustomLoad
import typings.devextreme.AnonCustomizeText
import typings.devextreme.AnonDataElement
import typings.devextreme.AnonEditOnKeyPress
import typings.devextreme.AnonElement
import typings.devextreme.AnonElementKey
import typings.devextreme.AnonEmptyPanelText
import typings.devextreme.AnonEnabled
import typings.devextreme.AnonError
import typings.devextreme.AnonFormOptions
import typings.devextreme.AnonHandled
import typings.devextreme.AnonHeight
import typings.devextreme.AnonHighlightCaseSensitive
import typings.devextreme.AnonIndicatorSrc
import typings.devextreme.AnonKey
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.AnonNewData
import typings.devextreme.AnonPromise
import typings.devextreme.AnonToolbarOptions
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.nextColumn
import typings.devextreme.devextremeStrings.widget
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridBaseOptions[T] extends WidgetOptions[T] {
  /** @name GridBase.Options.allowColumnReordering */
  var allowColumnReordering: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.allowColumnResizing */
  var allowColumnResizing: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.autoNavigateToFocusedRow */
  var autoNavigateToFocusedRow: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.cacheEnabled */
  var cacheEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.cellHintEnabled */
  var cellHintEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.columnAutoWidth */
  var columnAutoWidth: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.columnChooser */
  var columnChooser: js.UndefOr[AnonEmptyPanelText] = js.undefined
  /** @name GridBase.Options.columnFixing */
  var columnFixing: js.UndefOr[AnonEnabled] = js.undefined
  /** @name GridBase.Options.columnHidingEnabled */
  var columnHidingEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.columnMinWidth */
  var columnMinWidth: js.UndefOr[Double] = js.undefined
  /** @name GridBase.Options.columnResizingMode */
  var columnResizingMode: js.UndefOr[nextColumn | widget] = js.undefined
  /** @name GridBase.Options.columnWidth */
  var columnWidth: js.UndefOr[Double] = js.undefined
  /** @name GridBase.Options.columns */
  var columns: js.UndefOr[js.Array[GridBaseColumn | String]] = js.undefined
  /** @name GridBase.Options.dataSource */
  var dataSource: js.UndefOr[String | js.Array[_] | DataSource | DataSourceOptions] = js.undefined
  /** @name GridBase.Options.dateSerializationFormat */
  var dateSerializationFormat: js.UndefOr[String] = js.undefined
  /** @name GridBase.Options.editing */
  var editing: js.UndefOr[GridBaseEditing] = js.undefined
  /** @name GridBase.Options.errorRowEnabled */
  var errorRowEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.filterBuilder */
  var filterBuilder: js.UndefOr[dxFilterBuilderOptions] = js.undefined
  /** @name GridBase.Options.filterBuilderPopup */
  var filterBuilderPopup: js.UndefOr[dxPopupOptions[dxPopup]] = js.undefined
  /** @name GridBase.Options.filterPanel */
  var filterPanel: js.UndefOr[AnonCustomizeText[T]] = js.undefined
  /** @name GridBase.Options.filterRow */
  var filterRow: js.UndefOr[AnonApplyFilter] = js.undefined
  /** @name GridBase.Options.filterSyncEnabled */
  var filterSyncEnabled: js.UndefOr[Boolean | auto] = js.undefined
  /** @name GridBase.Options.filterValue */
  var filterValue: js.UndefOr[String | js.Array[_] | js.Function] = js.undefined
  /** @name GridBase.Options.focusedColumnIndex */
  var focusedColumnIndex: js.UndefOr[Double] = js.undefined
  /** @name GridBase.Options.focusedRowEnabled */
  var focusedRowEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.focusedRowIndex */
  var focusedRowIndex: js.UndefOr[Double] = js.undefined
  /** @name GridBase.Options.focusedRowKey */
  var focusedRowKey: js.UndefOr[js.Any] = js.undefined
  /** @name GridBase.Options.headerFilter */
  var headerFilter: js.UndefOr[AnonHeight] = js.undefined
  /** @name GridBase.Options.highlightChanges */
  var highlightChanges: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.keyboardNavigation */
  var keyboardNavigation: js.UndefOr[AnonEditOnKeyPress] = js.undefined
  /** @name GridBase.Options.loadPanel */
  var loadPanel: js.UndefOr[AnonIndicatorSrc] = js.undefined
  /** @name GridBase.Options.noDataText */
  var noDataText: js.UndefOr[String] = js.undefined
  /** @name GridBase.Options.onAdaptiveDetailRowPreparing */
  var onAdaptiveDetailRowPreparing: js.UndefOr[js.Function1[/* e */ AnonFormOptions[T], _]] = js.undefined
  /** @name GridBase.Options.onDataErrorOccurred */
  var onDataErrorOccurred: js.UndefOr[js.Function1[/* e */ AnonError[T], _]] = js.undefined
  /** @name GridBase.Options.onInitNewRow */
  var onInitNewRow: js.UndefOr[js.Function1[/* e */ AnonPromise[T], _]] = js.undefined
  /** @name GridBase.Options.onKeyDown */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ AnonHandled[T], _]] = js.undefined
  /** @name GridBase.Options.onRowCollapsed */
  var onRowCollapsed: js.UndefOr[js.Function1[/* e */ AnonKey[T], _]] = js.undefined
  /** @name GridBase.Options.onRowCollapsing */
  var onRowCollapsing: js.UndefOr[js.Function1[/* e */ AnonCancelComponent[T], _]] = js.undefined
  /** @name GridBase.Options.onRowExpanded */
  var onRowExpanded: js.UndefOr[js.Function1[/* e */ AnonKey[T], _]] = js.undefined
  /** @name GridBase.Options.onRowExpanding */
  var onRowExpanding: js.UndefOr[js.Function1[/* e */ AnonCancelComponent[T], _]] = js.undefined
  /** @name GridBase.Options.onRowInserted */
  var onRowInserted: js.UndefOr[js.Function1[/* e */ AnonComponentData[T], _]] = js.undefined
  /** @name GridBase.Options.onRowInserting */
  var onRowInserting: js.UndefOr[js.Function1[/* e */ AnonDataElement[T], _]] = js.undefined
  /** @name GridBase.Options.onRowRemoved */
  var onRowRemoved: js.UndefOr[js.Function1[/* e */ AnonComponentData[T], _]] = js.undefined
  /** @name GridBase.Options.onRowRemoving */
  var onRowRemoving: js.UndefOr[js.Function1[/* e */ AnonElementKey[T], _]] = js.undefined
  /** @name GridBase.Options.onRowUpdated */
  var onRowUpdated: js.UndefOr[js.Function1[/* e */ AnonComponentData[T], _]] = js.undefined
  /** @name GridBase.Options.onRowUpdating */
  var onRowUpdating: js.UndefOr[js.Function1[/* e */ AnonNewData[T], _]] = js.undefined
  /** @name GridBase.Options.onRowValidating */
  var onRowValidating: js.UndefOr[js.Function1[/* e */ AnonBrokenRules[T], _]] = js.undefined
  /** @name GridBase.Options.onSelectionChanged */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ AnonCurrentDeselectedRowKeys[T], _]] = js.undefined
  /** @name GridBase.Options.onToolbarPreparing */
  var onToolbarPreparing: js.UndefOr[js.Function1[/* e */ AnonToolbarOptions[T], _]] = js.undefined
  /** @name GridBase.Options.pager */
  var pager: js.UndefOr[AnonAllowedPageSizes] = js.undefined
  /** @name GridBase.Options.paging */
  var paging: js.UndefOr[GridBasePaging] = js.undefined
  /** @name GridBase.Options.renderAsync */
  var renderAsync: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.repaintChangesOnly */
  var repaintChangesOnly: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.rowAlternationEnabled */
  var rowAlternationEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.rowDragging */
  var rowDragging: js.UndefOr[AnonAllowDropInsideItem] = js.undefined
  /** @name GridBase.Options.scrolling */
  var scrolling: js.UndefOr[GridBaseScrolling] = js.undefined
  /** @name GridBase.Options.searchPanel */
  var searchPanel: js.UndefOr[AnonHighlightCaseSensitive] = js.undefined
  /** @name GridBase.Options.selectedRowKeys */
  var selectedRowKeys: js.UndefOr[js.Array[_]] = js.undefined
  /** @name GridBase.Options.selection */
  var selection: js.UndefOr[GridBaseSelection] = js.undefined
  /** @name GridBase.Options.showBorders */
  var showBorders: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.showColumnHeaders */
  var showColumnHeaders: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.showColumnLines */
  var showColumnLines: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.showRowLines */
  var showRowLines: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.sorting */
  var sorting: js.UndefOr[AnonAscendingText] = js.undefined
  /** @name GridBase.Options.stateStoring */
  var stateStoring: js.UndefOr[AnonCustomLoad] = js.undefined
  /** @name GridBase.Options.twoWayBindingEnabled */
  var twoWayBindingEnabled: js.UndefOr[Boolean] = js.undefined
  /** @name GridBase.Options.wordWrapEnabled */
  var wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
}

object GridBaseOptions {
  @scala.inline
  def apply[T](
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
    columns: js.Array[GridBaseColumn | String] = null,
    dataSource: String | js.Array[_] | DataSource | DataSourceOptions = null,
    dateSerializationFormat: String = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    editing: GridBaseEditing = null,
    elementAttr: js.Any = null,
    errorRowEnabled: js.UndefOr[Boolean] = js.undefined,
    filterBuilder: dxFilterBuilderOptions = null,
    filterBuilderPopup: dxPopupOptions[dxPopup] = null,
    filterPanel: AnonCustomizeText[T] = null,
    filterRow: AnonApplyFilter = null,
    filterSyncEnabled: Boolean | auto = null,
    filterValue: String | js.Array[_] | js.Function = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    focusedColumnIndex: Int | Double = null,
    focusedRowEnabled: js.UndefOr[Boolean] = js.undefined,
    focusedRowIndex: Int | Double = null,
    focusedRowKey: js.Any = null,
    headerFilter: AnonHeight = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    highlightChanges: js.UndefOr[Boolean] = js.undefined,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    keyboardNavigation: AnonEditOnKeyPress = null,
    loadPanel: AnonIndicatorSrc = null,
    noDataText: String = null,
    onAdaptiveDetailRowPreparing: /* e */ AnonFormOptions[T] => _ = null,
    onContentReady: /* e */ AnonComponentElement[T] => _ = null,
    onDataErrorOccurred: /* e */ AnonError[T] => _ = null,
    onDisposing: /* e */ AnonModel[T] => _ = null,
    onInitNewRow: /* e */ AnonPromise[T] => _ = null,
    onInitialized: /* e */ AnonElement[T] => _ = null,
    onKeyDown: /* e */ AnonHandled[T] => _ = null,
    onOptionChanged: /* e */ AnonName[T] => _ = null,
    onRowCollapsed: /* e */ AnonKey[T] => _ = null,
    onRowCollapsing: /* e */ AnonCancelComponent[T] => _ = null,
    onRowExpanded: /* e */ AnonKey[T] => _ = null,
    onRowExpanding: /* e */ AnonCancelComponent[T] => _ = null,
    onRowInserted: /* e */ AnonComponentData[T] => _ = null,
    onRowInserting: /* e */ AnonDataElement[T] => _ = null,
    onRowRemoved: /* e */ AnonComponentData[T] => _ = null,
    onRowRemoving: /* e */ AnonElementKey[T] => _ = null,
    onRowUpdated: /* e */ AnonComponentData[T] => _ = null,
    onRowUpdating: /* e */ AnonNewData[T] => _ = null,
    onRowValidating: /* e */ AnonBrokenRules[T] => _ = null,
    onSelectionChanged: /* e */ AnonCurrentDeselectedRowKeys[T] => _ = null,
    onToolbarPreparing: /* e */ AnonToolbarOptions[T] => _ = null,
    pager: AnonAllowedPageSizes = null,
    paging: GridBasePaging = null,
    renderAsync: js.UndefOr[Boolean] = js.undefined,
    repaintChangesOnly: js.UndefOr[Boolean] = js.undefined,
    rowAlternationEnabled: js.UndefOr[Boolean] = js.undefined,
    rowDragging: AnonAllowDropInsideItem = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    scrolling: GridBaseScrolling = null,
    searchPanel: AnonHighlightCaseSensitive = null,
    selectedRowKeys: js.Array[_] = null,
    selection: GridBaseSelection = null,
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
  ): GridBaseOptions[T] = {
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
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource.asInstanceOf[js.Any])
    if (dateSerializationFormat != null) __obj.updateDynamic("dateSerializationFormat")(dateSerializationFormat.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (editing != null) __obj.updateDynamic("editing")(editing.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(errorRowEnabled)) __obj.updateDynamic("errorRowEnabled")(errorRowEnabled.asInstanceOf[js.Any])
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
    if (headerFilter != null) __obj.updateDynamic("headerFilter")(headerFilter.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(highlightChanges)) __obj.updateDynamic("highlightChanges")(highlightChanges.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (keyboardNavigation != null) __obj.updateDynamic("keyboardNavigation")(keyboardNavigation.asInstanceOf[js.Any])
    if (loadPanel != null) __obj.updateDynamic("loadPanel")(loadPanel.asInstanceOf[js.Any])
    if (noDataText != null) __obj.updateDynamic("noDataText")(noDataText.asInstanceOf[js.Any])
    if (onAdaptiveDetailRowPreparing != null) __obj.updateDynamic("onAdaptiveDetailRowPreparing")(js.Any.fromFunction1(onAdaptiveDetailRowPreparing))
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDataErrorOccurred != null) __obj.updateDynamic("onDataErrorOccurred")(js.Any.fromFunction1(onDataErrorOccurred))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitNewRow != null) __obj.updateDynamic("onInitNewRow")(js.Any.fromFunction1(onInitNewRow))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onKeyDown != null) __obj.updateDynamic("onKeyDown")(js.Any.fromFunction1(onKeyDown))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onRowCollapsed != null) __obj.updateDynamic("onRowCollapsed")(js.Any.fromFunction1(onRowCollapsed))
    if (onRowCollapsing != null) __obj.updateDynamic("onRowCollapsing")(js.Any.fromFunction1(onRowCollapsing))
    if (onRowExpanded != null) __obj.updateDynamic("onRowExpanded")(js.Any.fromFunction1(onRowExpanded))
    if (onRowExpanding != null) __obj.updateDynamic("onRowExpanding")(js.Any.fromFunction1(onRowExpanding))
    if (onRowInserted != null) __obj.updateDynamic("onRowInserted")(js.Any.fromFunction1(onRowInserted))
    if (onRowInserting != null) __obj.updateDynamic("onRowInserting")(js.Any.fromFunction1(onRowInserting))
    if (onRowRemoved != null) __obj.updateDynamic("onRowRemoved")(js.Any.fromFunction1(onRowRemoved))
    if (onRowRemoving != null) __obj.updateDynamic("onRowRemoving")(js.Any.fromFunction1(onRowRemoving))
    if (onRowUpdated != null) __obj.updateDynamic("onRowUpdated")(js.Any.fromFunction1(onRowUpdated))
    if (onRowUpdating != null) __obj.updateDynamic("onRowUpdating")(js.Any.fromFunction1(onRowUpdating))
    if (onRowValidating != null) __obj.updateDynamic("onRowValidating")(js.Any.fromFunction1(onRowValidating))
    if (onSelectionChanged != null) __obj.updateDynamic("onSelectionChanged")(js.Any.fromFunction1(onSelectionChanged))
    if (onToolbarPreparing != null) __obj.updateDynamic("onToolbarPreparing")(js.Any.fromFunction1(onToolbarPreparing))
    if (pager != null) __obj.updateDynamic("pager")(pager.asInstanceOf[js.Any])
    if (paging != null) __obj.updateDynamic("paging")(paging.asInstanceOf[js.Any])
    if (!js.isUndefined(renderAsync)) __obj.updateDynamic("renderAsync")(renderAsync.asInstanceOf[js.Any])
    if (!js.isUndefined(repaintChangesOnly)) __obj.updateDynamic("repaintChangesOnly")(repaintChangesOnly.asInstanceOf[js.Any])
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
    __obj.asInstanceOf[GridBaseOptions[T]]
  }
}

