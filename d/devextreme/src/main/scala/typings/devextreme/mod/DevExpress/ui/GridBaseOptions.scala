package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.common.Mode
import typings.devextreme.mod.DevExpress.common.grids.ColumnChooser
import typings.devextreme.mod.DevExpress.common.grids.ColumnFixing
import typings.devextreme.mod.DevExpress.common.grids.FilterRow
import typings.devextreme.mod.DevExpress.common.grids.HeaderFilter
import typings.devextreme.mod.DevExpress.common.grids.KeyboardNavigation
import typings.devextreme.mod.DevExpress.common.grids.LoadPanel
import typings.devextreme.mod.DevExpress.common.grids.Pager
import typings.devextreme.mod.DevExpress.common.grids.SearchPanel
import typings.devextreme.mod.DevExpress.common.grids.Sorting
import typings.devextreme.mod.DevExpress.common.grids.StateStoring
import typings.devextreme.mod.DevExpress.data.DataSource.DataSourceLike
import typings.devextreme.mod.DevExpress.events.Cancelable
import typings.devextreme.mod.DevExpress.events.EventInfo
import typings.devextreme.mod.DevExpress.events.NativeEventInfo
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.AdaptiveDetailRowPreparingInfo
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnBase
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.ColumnResizeMode
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.DataChangeInfo
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.DataErrorOccurredInfo
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.EditingBase
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.FilterPanel
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.KeyDownInfo
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.NewRowInfo
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.PagingBase
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowDragging
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowInsertedInfo
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowInsertingInfo
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowKeyInfo
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowRemovedInfo
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowRemovingInfo
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowUpdatedInfo
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowUpdatingInfo
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.RowValidatingInfo
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.SavingInfo
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.ScrollingBase
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.SelectionBase
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.SelectionChangedInfo
import typings.devextreme.mod.DevExpress.ui.dxDataGrid.ToolbarPreparingInfo
import typings.devextreme.mod.DevExpress.ui.dxPopup.Properties
import typings.std.KeyboardEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridBaseOptions[TComponent /* <: GridBase[TRowData, TKey] */, TRowData, TKey]
  extends StObject
     with WidgetOptions[TComponent] {
  
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
  var columns: js.UndefOr[js.Array[ColumnBase[TRowData] | String]] = js.undefined
  
  /**
    * Binds the UI component to data.
    */
  var dataSource: js.UndefOr[(DataSourceLike[TRowData, TKey]) | Null] = js.undefined
  
  /**
    * Specifies the format in which date-time values should be sent to the server.
    */
  var dateSerializationFormat: js.UndefOr[String] = js.undefined
  
  /**
    * Overriden.
    */
  var editing: js.UndefOr[EditingBase[TRowData, TKey]] = js.undefined
  
  /**
    * Indicates whether to show the error row.
    */
  var errorRowEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Configures the integrated filter builder.
    */
  var filterBuilder: js.UndefOr[dxFilterBuilderOptions] = js.undefined
  
  /**
    * Configures the popup in which the integrated filter builder is shown.
    */
  var filterBuilderPopup: js.UndefOr[Properties] = js.undefined
  
  /**
    * Configures the filter panel.
    */
  var filterPanel: js.UndefOr[FilterPanel[TComponent, TRowData, TKey]] = js.undefined
  
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
    * Configures the header filter feature.
    */
  var headerFilter: js.UndefOr[HeaderFilter] = js.undefined
  
  /**
    * Specifies whether to highlight rows and cells with edited data. repaintChangesOnly should be true.
    */
  var highlightChanges: js.UndefOr[Boolean] = js.undefined
  
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
    js.Function1[/* e */ EventInfo[TComponent] & AdaptiveDetailRowPreparingInfo, Unit]
  ] = js.undefined
  
  /**
    * A function that is executed when an error occurs in the data source.
    */
  var onDataErrorOccurred: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent] & DataErrorOccurredInfo, Unit]] = js.undefined
  
  /**
    * A function that is executed after row changes are discarded.
    */
  var onEditCanceled: js.UndefOr[
    js.Function1[/* e */ EventInfo[TComponent] & (DataChangeInfo[TRowData, TKey]), Unit]
  ] = js.undefined
  
  /**
    * A function that is executed when the edit operation is canceled, but row changes are not yet discarded.
    */
  var onEditCanceling: js.UndefOr[
    js.Function1[
      /* e */ Cancelable & EventInfo[TComponent] & (DataChangeInfo[TRowData, TKey]), 
      Unit
    ]
  ] = js.undefined
  
  /**
    * A function that is executed before a new row is added to the UI component.
    */
  var onInitNewRow: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent] & NewRowInfo[TRowData], Unit]] = js.undefined
  
  /**
    * A function that is executed when the UI component is in focus and a key has been pressed down.
    */
  var onKeyDown: js.UndefOr[
    js.Function1[/* e */ (NativeEventInfo[TComponent, KeyboardEvent]) & KeyDownInfo, Unit]
  ] = js.undefined
  
  /**
    * A function that is executed after a row is collapsed.
    */
  var onRowCollapsed: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent] & RowKeyInfo[TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed before a row is collapsed.
    */
  var onRowCollapsing: js.UndefOr[
    js.Function1[/* e */ Cancelable & EventInfo[TComponent] & RowKeyInfo[TKey], Unit]
  ] = js.undefined
  
  /**
    * A function that is executed after a row is expanded.
    */
  var onRowExpanded: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent] & RowKeyInfo[TKey], Unit]] = js.undefined
  
  /**
    * A function that is executed before a row is expanded.
    */
  var onRowExpanding: js.UndefOr[
    js.Function1[/* e */ Cancelable & EventInfo[TComponent] & RowKeyInfo[TKey], Unit]
  ] = js.undefined
  
  /**
    * A function that is executed after a new row has been inserted into the data source.
    */
  var onRowInserted: js.UndefOr[
    js.Function1[/* e */ EventInfo[TComponent] & (RowInsertedInfo[TRowData, TKey]), Unit]
  ] = js.undefined
  
  /**
    * A function that is executed before a new row is inserted into the data source.
    */
  var onRowInserting: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent] & RowInsertingInfo[TRowData], Unit]] = js.undefined
  
  /**
    * A function that is executed after a row has been removed from the data source.
    */
  var onRowRemoved: js.UndefOr[
    js.Function1[/* e */ EventInfo[TComponent] & (RowRemovedInfo[TRowData, TKey]), Unit]
  ] = js.undefined
  
  /**
    * A function that is executed before a row is removed from the data source.
    */
  var onRowRemoving: js.UndefOr[
    js.Function1[/* e */ EventInfo[TComponent] & (RowRemovingInfo[TRowData, TKey]), Unit]
  ] = js.undefined
  
  /**
    * A function that is executed after a row has been updated in the data source.
    */
  var onRowUpdated: js.UndefOr[
    js.Function1[/* e */ EventInfo[TComponent] & (RowUpdatedInfo[TRowData, TKey]), Unit]
  ] = js.undefined
  
  /**
    * A function that is executed before a row is updated in the data source.
    */
  var onRowUpdating: js.UndefOr[
    js.Function1[/* e */ EventInfo[TComponent] & (RowUpdatingInfo[TRowData, TKey]), Unit]
  ] = js.undefined
  
  /**
    * A function that is executed after cells in a row are validated against validation rules.
    */
  var onRowValidating: js.UndefOr[
    js.Function1[/* e */ EventInfo[TComponent] & (RowValidatingInfo[TRowData, TKey]), Unit]
  ] = js.undefined
  
  /**
    * A function that is executed after row changes are saved.
    */
  var onSaved: js.UndefOr[
    js.Function1[/* e */ EventInfo[TComponent] & (DataChangeInfo[TRowData, TKey]), Unit]
  ] = js.undefined
  
  /**
    * A function that is executed before pending row changes are saved.
    */
  var onSaving: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent] & (SavingInfo[TRowData, TKey]), Unit]] = js.undefined
  
  /**
    * A function that is executed after selecting a row or clearing its selection.
    */
  var onSelectionChanged: js.UndefOr[
    js.Function1[/* e */ EventInfo[TComponent] & (SelectionChangedInfo[TRowData, TKey]), Unit]
  ] = js.undefined
  
  /**
    * A function that is executed before the toolbar is created.
    */
  var onToolbarPreparing: js.UndefOr[js.Function1[/* e */ EventInfo[TComponent] & ToolbarPreparingInfo, Unit]] = js.undefined
  
  /**
    * Configures the pager.
    */
  var pager: js.UndefOr[Pager] = js.undefined
  
  /**
    * Configures paging.
    */
  var paging: js.UndefOr[PagingBase] = js.undefined
  
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
  var rowDragging: js.UndefOr[RowDragging[TComponent, TRowData, TKey]] = js.undefined
  
  /**
    * 
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
  
  /**
    * Specifies whether to enable two-way data binding.
    */
  var twoWayBindingEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies whether text that does not fit into a column should be wrapped.
    */
  var wordWrapEnabled: js.UndefOr[Boolean] = js.undefined
}
object GridBaseOptions {
  
  inline def apply[TComponent /* <: GridBase[TRowData, TKey] */, TRowData, TKey](): GridBaseOptions[TComponent, TRowData, TKey] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridBaseOptions[TComponent, TRowData, TKey]]
  }
  
  extension [Self <: GridBaseOptions[?, ?, ?], TComponent /* <: GridBase[TRowData, TKey] */, TRowData, TKey](x: Self & (GridBaseOptions[TComponent, TRowData, TKey])) {
    
    inline def setAllowColumnReordering(value: Boolean): Self = StObject.set(x, "allowColumnReordering", value.asInstanceOf[js.Any])
    
    inline def setAllowColumnReorderingUndefined: Self = StObject.set(x, "allowColumnReordering", js.undefined)
    
    inline def setAllowColumnResizing(value: Boolean): Self = StObject.set(x, "allowColumnResizing", value.asInstanceOf[js.Any])
    
    inline def setAllowColumnResizingUndefined: Self = StObject.set(x, "allowColumnResizing", js.undefined)
    
    inline def setAutoNavigateToFocusedRow(value: Boolean): Self = StObject.set(x, "autoNavigateToFocusedRow", value.asInstanceOf[js.Any])
    
    inline def setAutoNavigateToFocusedRowUndefined: Self = StObject.set(x, "autoNavigateToFocusedRow", js.undefined)
    
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
    
    inline def setDataSource(value: DataSourceLike[TRowData, TKey]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceNull: Self = StObject.set(x, "dataSource", null)
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
    
    inline def setDataSourceVarargs(value: TRowData*): Self = StObject.set(x, "dataSource", js.Array(value*))
    
    inline def setDateSerializationFormat(value: String): Self = StObject.set(x, "dateSerializationFormat", value.asInstanceOf[js.Any])
    
    inline def setDateSerializationFormatUndefined: Self = StObject.set(x, "dateSerializationFormat", js.undefined)
    
    inline def setEditing(value: EditingBase[TRowData, TKey]): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    inline def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
    
    inline def setErrorRowEnabled(value: Boolean): Self = StObject.set(x, "errorRowEnabled", value.asInstanceOf[js.Any])
    
    inline def setErrorRowEnabledUndefined: Self = StObject.set(x, "errorRowEnabled", js.undefined)
    
    inline def setFilterBuilder(value: dxFilterBuilderOptions): Self = StObject.set(x, "filterBuilder", value.asInstanceOf[js.Any])
    
    inline def setFilterBuilderPopup(value: Properties): Self = StObject.set(x, "filterBuilderPopup", value.asInstanceOf[js.Any])
    
    inline def setFilterBuilderPopupUndefined: Self = StObject.set(x, "filterBuilderPopup", js.undefined)
    
    inline def setFilterBuilderUndefined: Self = StObject.set(x, "filterBuilder", js.undefined)
    
    inline def setFilterPanel(value: FilterPanel[TComponent, TRowData, TKey]): Self = StObject.set(x, "filterPanel", value.asInstanceOf[js.Any])
    
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
    
    inline def setHeaderFilter(value: HeaderFilter): Self = StObject.set(x, "headerFilter", value.asInstanceOf[js.Any])
    
    inline def setHeaderFilterUndefined: Self = StObject.set(x, "headerFilter", js.undefined)
    
    inline def setHighlightChanges(value: Boolean): Self = StObject.set(x, "highlightChanges", value.asInstanceOf[js.Any])
    
    inline def setHighlightChangesUndefined: Self = StObject.set(x, "highlightChanges", js.undefined)
    
    inline def setKeyboardNavigation(value: KeyboardNavigation): Self = StObject.set(x, "keyboardNavigation", value.asInstanceOf[js.Any])
    
    inline def setKeyboardNavigationUndefined: Self = StObject.set(x, "keyboardNavigation", js.undefined)
    
    inline def setLoadPanel(value: LoadPanel): Self = StObject.set(x, "loadPanel", value.asInstanceOf[js.Any])
    
    inline def setLoadPanelUndefined: Self = StObject.set(x, "loadPanel", js.undefined)
    
    inline def setNoDataText(value: String): Self = StObject.set(x, "noDataText", value.asInstanceOf[js.Any])
    
    inline def setNoDataTextUndefined: Self = StObject.set(x, "noDataText", js.undefined)
    
    inline def setOnAdaptiveDetailRowPreparing(value: /* e */ EventInfo[TComponent] & AdaptiveDetailRowPreparingInfo => Unit): Self = StObject.set(x, "onAdaptiveDetailRowPreparing", js.Any.fromFunction1(value))
    
    inline def setOnAdaptiveDetailRowPreparingUndefined: Self = StObject.set(x, "onAdaptiveDetailRowPreparing", js.undefined)
    
    inline def setOnDataErrorOccurred(value: /* e */ EventInfo[TComponent] & DataErrorOccurredInfo => Unit): Self = StObject.set(x, "onDataErrorOccurred", js.Any.fromFunction1(value))
    
    inline def setOnDataErrorOccurredUndefined: Self = StObject.set(x, "onDataErrorOccurred", js.undefined)
    
    inline def setOnEditCanceled(value: /* e */ EventInfo[TComponent] & (DataChangeInfo[TRowData, TKey]) => Unit): Self = StObject.set(x, "onEditCanceled", js.Any.fromFunction1(value))
    
    inline def setOnEditCanceledUndefined: Self = StObject.set(x, "onEditCanceled", js.undefined)
    
    inline def setOnEditCanceling(value: /* e */ Cancelable & EventInfo[TComponent] & (DataChangeInfo[TRowData, TKey]) => Unit): Self = StObject.set(x, "onEditCanceling", js.Any.fromFunction1(value))
    
    inline def setOnEditCancelingUndefined: Self = StObject.set(x, "onEditCanceling", js.undefined)
    
    inline def setOnInitNewRow(value: /* e */ EventInfo[TComponent] & NewRowInfo[TRowData] => Unit): Self = StObject.set(x, "onInitNewRow", js.Any.fromFunction1(value))
    
    inline def setOnInitNewRowUndefined: Self = StObject.set(x, "onInitNewRow", js.undefined)
    
    inline def setOnKeyDown(value: /* e */ (NativeEventInfo[TComponent, KeyboardEvent]) & KeyDownInfo => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnRowCollapsed(value: /* e */ EventInfo[TComponent] & RowKeyInfo[TKey] => Unit): Self = StObject.set(x, "onRowCollapsed", js.Any.fromFunction1(value))
    
    inline def setOnRowCollapsedUndefined: Self = StObject.set(x, "onRowCollapsed", js.undefined)
    
    inline def setOnRowCollapsing(value: /* e */ Cancelable & EventInfo[TComponent] & RowKeyInfo[TKey] => Unit): Self = StObject.set(x, "onRowCollapsing", js.Any.fromFunction1(value))
    
    inline def setOnRowCollapsingUndefined: Self = StObject.set(x, "onRowCollapsing", js.undefined)
    
    inline def setOnRowExpanded(value: /* e */ EventInfo[TComponent] & RowKeyInfo[TKey] => Unit): Self = StObject.set(x, "onRowExpanded", js.Any.fromFunction1(value))
    
    inline def setOnRowExpandedUndefined: Self = StObject.set(x, "onRowExpanded", js.undefined)
    
    inline def setOnRowExpanding(value: /* e */ Cancelable & EventInfo[TComponent] & RowKeyInfo[TKey] => Unit): Self = StObject.set(x, "onRowExpanding", js.Any.fromFunction1(value))
    
    inline def setOnRowExpandingUndefined: Self = StObject.set(x, "onRowExpanding", js.undefined)
    
    inline def setOnRowInserted(value: /* e */ EventInfo[TComponent] & (RowInsertedInfo[TRowData, TKey]) => Unit): Self = StObject.set(x, "onRowInserted", js.Any.fromFunction1(value))
    
    inline def setOnRowInsertedUndefined: Self = StObject.set(x, "onRowInserted", js.undefined)
    
    inline def setOnRowInserting(value: /* e */ EventInfo[TComponent] & RowInsertingInfo[TRowData] => Unit): Self = StObject.set(x, "onRowInserting", js.Any.fromFunction1(value))
    
    inline def setOnRowInsertingUndefined: Self = StObject.set(x, "onRowInserting", js.undefined)
    
    inline def setOnRowRemoved(value: /* e */ EventInfo[TComponent] & (RowRemovedInfo[TRowData, TKey]) => Unit): Self = StObject.set(x, "onRowRemoved", js.Any.fromFunction1(value))
    
    inline def setOnRowRemovedUndefined: Self = StObject.set(x, "onRowRemoved", js.undefined)
    
    inline def setOnRowRemoving(value: /* e */ EventInfo[TComponent] & (RowRemovingInfo[TRowData, TKey]) => Unit): Self = StObject.set(x, "onRowRemoving", js.Any.fromFunction1(value))
    
    inline def setOnRowRemovingUndefined: Self = StObject.set(x, "onRowRemoving", js.undefined)
    
    inline def setOnRowUpdated(value: /* e */ EventInfo[TComponent] & (RowUpdatedInfo[TRowData, TKey]) => Unit): Self = StObject.set(x, "onRowUpdated", js.Any.fromFunction1(value))
    
    inline def setOnRowUpdatedUndefined: Self = StObject.set(x, "onRowUpdated", js.undefined)
    
    inline def setOnRowUpdating(value: /* e */ EventInfo[TComponent] & (RowUpdatingInfo[TRowData, TKey]) => Unit): Self = StObject.set(x, "onRowUpdating", js.Any.fromFunction1(value))
    
    inline def setOnRowUpdatingUndefined: Self = StObject.set(x, "onRowUpdating", js.undefined)
    
    inline def setOnRowValidating(value: /* e */ EventInfo[TComponent] & (RowValidatingInfo[TRowData, TKey]) => Unit): Self = StObject.set(x, "onRowValidating", js.Any.fromFunction1(value))
    
    inline def setOnRowValidatingUndefined: Self = StObject.set(x, "onRowValidating", js.undefined)
    
    inline def setOnSaved(value: /* e */ EventInfo[TComponent] & (DataChangeInfo[TRowData, TKey]) => Unit): Self = StObject.set(x, "onSaved", js.Any.fromFunction1(value))
    
    inline def setOnSavedUndefined: Self = StObject.set(x, "onSaved", js.undefined)
    
    inline def setOnSaving(value: /* e */ EventInfo[TComponent] & (SavingInfo[TRowData, TKey]) => Unit): Self = StObject.set(x, "onSaving", js.Any.fromFunction1(value))
    
    inline def setOnSavingUndefined: Self = StObject.set(x, "onSaving", js.undefined)
    
    inline def setOnSelectionChanged(value: /* e */ EventInfo[TComponent] & (SelectionChangedInfo[TRowData, TKey]) => Unit): Self = StObject.set(x, "onSelectionChanged", js.Any.fromFunction1(value))
    
    inline def setOnSelectionChangedUndefined: Self = StObject.set(x, "onSelectionChanged", js.undefined)
    
    inline def setOnToolbarPreparing(value: /* e */ EventInfo[TComponent] & ToolbarPreparingInfo => Unit): Self = StObject.set(x, "onToolbarPreparing", js.Any.fromFunction1(value))
    
    inline def setOnToolbarPreparingUndefined: Self = StObject.set(x, "onToolbarPreparing", js.undefined)
    
    inline def setPager(value: Pager): Self = StObject.set(x, "pager", value.asInstanceOf[js.Any])
    
    inline def setPagerUndefined: Self = StObject.set(x, "pager", js.undefined)
    
    inline def setPaging(value: PagingBase): Self = StObject.set(x, "paging", value.asInstanceOf[js.Any])
    
    inline def setPagingUndefined: Self = StObject.set(x, "paging", js.undefined)
    
    inline def setRenderAsync(value: Boolean): Self = StObject.set(x, "renderAsync", value.asInstanceOf[js.Any])
    
    inline def setRenderAsyncUndefined: Self = StObject.set(x, "renderAsync", js.undefined)
    
    inline def setRepaintChangesOnly(value: Boolean): Self = StObject.set(x, "repaintChangesOnly", value.asInstanceOf[js.Any])
    
    inline def setRepaintChangesOnlyUndefined: Self = StObject.set(x, "repaintChangesOnly", js.undefined)
    
    inline def setRowAlternationEnabled(value: Boolean): Self = StObject.set(x, "rowAlternationEnabled", value.asInstanceOf[js.Any])
    
    inline def setRowAlternationEnabledUndefined: Self = StObject.set(x, "rowAlternationEnabled", js.undefined)
    
    inline def setRowDragging(value: RowDragging[TComponent, TRowData, TKey]): Self = StObject.set(x, "rowDragging", value.asInstanceOf[js.Any])
    
    inline def setRowDraggingUndefined: Self = StObject.set(x, "rowDragging", js.undefined)
    
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
    
    inline def setTwoWayBindingEnabled(value: Boolean): Self = StObject.set(x, "twoWayBindingEnabled", value.asInstanceOf[js.Any])
    
    inline def setTwoWayBindingEnabledUndefined: Self = StObject.set(x, "twoWayBindingEnabled", js.undefined)
    
    inline def setWordWrapEnabled(value: Boolean): Self = StObject.set(x, "wordWrapEnabled", value.asInstanceOf[js.Any])
    
    inline def setWordWrapEnabledUndefined: Self = StObject.set(x, "wordWrapEnabled", js.undefined)
  }
}
