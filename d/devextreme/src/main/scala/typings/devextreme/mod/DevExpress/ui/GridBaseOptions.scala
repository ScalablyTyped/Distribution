package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.AllowDropInsideItem
import typings.devextreme.anon.AllowedPageSizes
import typings.devextreme.anon.ApplyFilter
import typings.devextreme.anon.AscendingText
import typings.devextreme.anon.BrokenRules
import typings.devextreme.anon.CancelChanges
import typings.devextreme.anon.CancelComponent
import typings.devextreme.anon.ChangesComponent
import typings.devextreme.anon.ComponentData
import typings.devextreme.anon.ComponentElement
import typings.devextreme.anon.CurrentDeselectedRowKeys
import typings.devextreme.anon.CustomLoad
import typings.devextreme.anon.CustomizeText
import typings.devextreme.anon.DataElement
import typings.devextreme.anon.EditOnKeyPress
import typings.devextreme.anon.ElementKey
import typings.devextreme.anon.EmptyPanelText
import typings.devextreme.anon.Enabled
import typings.devextreme.anon.Error
import typings.devextreme.anon.FormOptions
import typings.devextreme.anon.Handled
import typings.devextreme.anon.Height
import typings.devextreme.anon.HighlightCaseSensitive
import typings.devextreme.anon.IndicatorSrc
import typings.devextreme.anon.Key
import typings.devextreme.anon.NewData
import typings.devextreme.anon.Promise
import typings.devextreme.anon.ToolbarOptions
import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.nextColumn
import typings.devextreme.devextremeStrings.widget
import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.DevExpress.data.DataSourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridBaseOptions[T] extends WidgetOptions[T] {
  
  /**
    * [descr:GridBase.Options.allowColumnReordering]
    */
  var allowColumnReordering: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.allowColumnResizing]
    */
  var allowColumnResizing: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.autoNavigateToFocusedRow]
    */
  var autoNavigateToFocusedRow: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.cacheEnabled]
    */
  var cacheEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.cellHintEnabled]
    */
  var cellHintEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.columnAutoWidth]
    */
  var columnAutoWidth: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.columnChooser]
    */
  var columnChooser: js.UndefOr[EmptyPanelText] = js.native
  
  /**
    * [descr:GridBase.Options.columnFixing]
    */
  var columnFixing: js.UndefOr[Enabled] = js.native
  
  /**
    * [descr:GridBase.Options.columnHidingEnabled]
    */
  var columnHidingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.columnMinWidth]
    */
  var columnMinWidth: js.UndefOr[Double] = js.native
  
  /**
    * [descr:GridBase.Options.columnResizingMode]
    */
  var columnResizingMode: js.UndefOr[nextColumn | widget] = js.native
  
  /**
    * [descr:GridBase.Options.columnWidth]
    */
  var columnWidth: js.UndefOr[Double] = js.native
  
  /**
    * [descr:GridBase.Options.columns]
    */
  var columns: js.UndefOr[js.Array[GridBaseColumn | String]] = js.native
  
  /**
    * [descr:GridBase.Options.dataSource]
    */
  var dataSource: js.UndefOr[String | js.Array[_] | DataSource | DataSourceOptions] = js.native
  
  /**
    * [descr:GridBase.Options.dateSerializationFormat]
    */
  var dateSerializationFormat: js.UndefOr[String] = js.native
  
  /**
    * [descr:GridBase.Options.editing]
    */
  var editing: js.UndefOr[GridBaseEditing] = js.native
  
  /**
    * [descr:GridBase.Options.errorRowEnabled]
    */
  var errorRowEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.filterBuilder]
    */
  var filterBuilder: js.UndefOr[dxFilterBuilderOptions] = js.native
  
  /**
    * [descr:GridBase.Options.filterBuilderPopup]
    */
  var filterBuilderPopup: js.UndefOr[dxPopupOptions[dxPopup]] = js.native
  
  /**
    * [descr:GridBase.Options.filterPanel]
    */
  var filterPanel: js.UndefOr[CustomizeText[T]] = js.native
  
  /**
    * [descr:GridBase.Options.filterRow]
    */
  var filterRow: js.UndefOr[ApplyFilter] = js.native
  
  /**
    * [descr:GridBase.Options.filterSyncEnabled]
    */
  var filterSyncEnabled: js.UndefOr[Boolean | auto] = js.native
  
  /**
    * [descr:GridBase.Options.filterValue]
    */
  var filterValue: js.UndefOr[String | js.Array[_] | js.Function] = js.native
  
  /**
    * [descr:GridBase.Options.focusedColumnIndex]
    */
  var focusedColumnIndex: js.UndefOr[Double] = js.native
  
  /**
    * [descr:GridBase.Options.focusedRowEnabled]
    */
  var focusedRowEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.focusedRowIndex]
    */
  var focusedRowIndex: js.UndefOr[Double] = js.native
  
  /**
    * [descr:GridBase.Options.focusedRowKey]
    */
  var focusedRowKey: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:GridBase.Options.headerFilter]
    */
  var headerFilter: js.UndefOr[Height] = js.native
  
  /**
    * [descr:GridBase.Options.highlightChanges]
    */
  var highlightChanges: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.keyboardNavigation]
    */
  var keyboardNavigation: js.UndefOr[EditOnKeyPress] = js.native
  
  /**
    * [descr:GridBase.Options.loadPanel]
    */
  var loadPanel: js.UndefOr[IndicatorSrc] = js.native
  
  /**
    * [descr:GridBase.Options.noDataText]
    */
  var noDataText: js.UndefOr[String] = js.native
  
  /**
    * [descr:GridBase.Options.onAdaptiveDetailRowPreparing]
    */
  var onAdaptiveDetailRowPreparing: js.UndefOr[js.Function1[/* e */ FormOptions[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onDataErrorOccurred]
    */
  var onDataErrorOccurred: js.UndefOr[js.Function1[/* e */ Error[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onEditCanceled]
    */
  var onEditCanceled: js.UndefOr[js.Function1[/* e */ ChangesComponent[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onEditCanceling]
    */
  var onEditCanceling: js.UndefOr[js.Function1[/* e */ CancelChanges[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onInitNewRow]
    */
  var onInitNewRow: js.UndefOr[js.Function1[/* e */ Promise[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onKeyDown]
    */
  var onKeyDown: js.UndefOr[js.Function1[/* e */ Handled[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onRowCollapsed]
    */
  var onRowCollapsed: js.UndefOr[js.Function1[/* e */ Key[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onRowCollapsing]
    */
  var onRowCollapsing: js.UndefOr[js.Function1[/* e */ CancelComponent[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onRowExpanded]
    */
  var onRowExpanded: js.UndefOr[js.Function1[/* e */ Key[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onRowExpanding]
    */
  var onRowExpanding: js.UndefOr[js.Function1[/* e */ CancelComponent[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onRowInserted]
    */
  var onRowInserted: js.UndefOr[js.Function1[/* e */ ComponentData[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onRowInserting]
    */
  var onRowInserting: js.UndefOr[js.Function1[/* e */ DataElement[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onRowRemoved]
    */
  var onRowRemoved: js.UndefOr[js.Function1[/* e */ ComponentData[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onRowRemoving]
    */
  var onRowRemoving: js.UndefOr[js.Function1[/* e */ ElementKey[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onRowUpdated]
    */
  var onRowUpdated: js.UndefOr[js.Function1[/* e */ ComponentData[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onRowUpdating]
    */
  var onRowUpdating: js.UndefOr[js.Function1[/* e */ NewData[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onRowValidating]
    */
  var onRowValidating: js.UndefOr[js.Function1[/* e */ BrokenRules[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onSaved]
    */
  var onSaved: js.UndefOr[js.Function1[/* e */ ChangesComponent[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onSaving]
    */
  var onSaving: js.UndefOr[js.Function1[/* e */ ComponentElement[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onSelectionChanged]
    */
  var onSelectionChanged: js.UndefOr[js.Function1[/* e */ CurrentDeselectedRowKeys[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.onToolbarPreparing]
    */
  var onToolbarPreparing: js.UndefOr[js.Function1[/* e */ ToolbarOptions[T], _]] = js.native
  
  /**
    * [descr:GridBase.Options.pager]
    */
  var pager: js.UndefOr[AllowedPageSizes] = js.native
  
  /**
    * [descr:GridBase.Options.paging]
    */
  var paging: js.UndefOr[GridBasePaging] = js.native
  
  /**
    * [descr:GridBase.Options.renderAsync]
    */
  var renderAsync: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.repaintChangesOnly]
    */
  var repaintChangesOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.rowAlternationEnabled]
    */
  var rowAlternationEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.rowDragging]
    */
  var rowDragging: js.UndefOr[AllowDropInsideItem] = js.native
  
  /**
    * [descr:GridBase.Options.scrolling]
    */
  var scrolling: js.UndefOr[GridBaseScrolling] = js.native
  
  /**
    * [descr:GridBase.Options.searchPanel]
    */
  var searchPanel: js.UndefOr[HighlightCaseSensitive] = js.native
  
  /**
    * [descr:GridBase.Options.selectedRowKeys]
    */
  var selectedRowKeys: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * [descr:GridBase.Options.selection]
    */
  var selection: js.UndefOr[GridBaseSelection] = js.native
  
  /**
    * [descr:GridBase.Options.showBorders]
    */
  var showBorders: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.showColumnHeaders]
    */
  var showColumnHeaders: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.showColumnLines]
    */
  var showColumnLines: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.showRowLines]
    */
  var showRowLines: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.sorting]
    */
  var sorting: js.UndefOr[AscendingText] = js.native
  
  /**
    * [descr:GridBase.Options.stateStoring]
    */
  var stateStoring: js.UndefOr[CustomLoad] = js.native
  
  /**
    * [descr:GridBase.Options.twoWayBindingEnabled]
    */
  var twoWayBindingEnabled: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.wordWrapEnabled]
    */
  var wordWrapEnabled: js.UndefOr[Boolean] = js.native
}
object GridBaseOptions {
  
  @scala.inline
  def apply[T](): GridBaseOptions[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridBaseOptions[T]]
  }
  
  @scala.inline
  implicit class GridBaseOptionsOps[Self <: GridBaseOptions[_], T] (val x: Self with GridBaseOptions[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllowColumnReordering(value: Boolean): Self = this.set("allowColumnReordering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowColumnReordering: Self = this.set("allowColumnReordering", js.undefined)
    
    @scala.inline
    def setAllowColumnResizing(value: Boolean): Self = this.set("allowColumnResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowColumnResizing: Self = this.set("allowColumnResizing", js.undefined)
    
    @scala.inline
    def setAutoNavigateToFocusedRow(value: Boolean): Self = this.set("autoNavigateToFocusedRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoNavigateToFocusedRow: Self = this.set("autoNavigateToFocusedRow", js.undefined)
    
    @scala.inline
    def setCacheEnabled(value: Boolean): Self = this.set("cacheEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheEnabled: Self = this.set("cacheEnabled", js.undefined)
    
    @scala.inline
    def setCellHintEnabled(value: Boolean): Self = this.set("cellHintEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellHintEnabled: Self = this.set("cellHintEnabled", js.undefined)
    
    @scala.inline
    def setColumnAutoWidth(value: Boolean): Self = this.set("columnAutoWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnAutoWidth: Self = this.set("columnAutoWidth", js.undefined)
    
    @scala.inline
    def setColumnChooser(value: EmptyPanelText): Self = this.set("columnChooser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnChooser: Self = this.set("columnChooser", js.undefined)
    
    @scala.inline
    def setColumnFixing(value: Enabled): Self = this.set("columnFixing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnFixing: Self = this.set("columnFixing", js.undefined)
    
    @scala.inline
    def setColumnHidingEnabled(value: Boolean): Self = this.set("columnHidingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnHidingEnabled: Self = this.set("columnHidingEnabled", js.undefined)
    
    @scala.inline
    def setColumnMinWidth(value: Double): Self = this.set("columnMinWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnMinWidth: Self = this.set("columnMinWidth", js.undefined)
    
    @scala.inline
    def setColumnResizingMode(value: nextColumn | widget): Self = this.set("columnResizingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnResizingMode: Self = this.set("columnResizingMode", js.undefined)
    
    @scala.inline
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    
    @scala.inline
    def setColumnsVarargs(value: (GridBaseColumn | String)*): Self = this.set("columns", js.Array(value :_*))
    
    @scala.inline
    def setColumns(value: js.Array[GridBaseColumn | String]): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: String | js.Array[_] | DataSource | DataSourceOptions): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDateSerializationFormat(value: String): Self = this.set("dateSerializationFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateSerializationFormat: Self = this.set("dateSerializationFormat", js.undefined)
    
    @scala.inline
    def setEditing(value: GridBaseEditing): Self = this.set("editing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditing: Self = this.set("editing", js.undefined)
    
    @scala.inline
    def setErrorRowEnabled(value: Boolean): Self = this.set("errorRowEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorRowEnabled: Self = this.set("errorRowEnabled", js.undefined)
    
    @scala.inline
    def setFilterBuilder(value: dxFilterBuilderOptions): Self = this.set("filterBuilder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterBuilder: Self = this.set("filterBuilder", js.undefined)
    
    @scala.inline
    def setFilterBuilderPopup(value: dxPopupOptions[dxPopup]): Self = this.set("filterBuilderPopup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterBuilderPopup: Self = this.set("filterBuilderPopup", js.undefined)
    
    @scala.inline
    def setFilterPanel(value: CustomizeText[T]): Self = this.set("filterPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterPanel: Self = this.set("filterPanel", js.undefined)
    
    @scala.inline
    def setFilterRow(value: ApplyFilter): Self = this.set("filterRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterRow: Self = this.set("filterRow", js.undefined)
    
    @scala.inline
    def setFilterSyncEnabled(value: Boolean | auto): Self = this.set("filterSyncEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterSyncEnabled: Self = this.set("filterSyncEnabled", js.undefined)
    
    @scala.inline
    def setFilterValueVarargs(value: js.Any*): Self = this.set("filterValue", js.Array(value :_*))
    
    @scala.inline
    def setFilterValue(value: String | js.Array[_] | js.Function): Self = this.set("filterValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterValue: Self = this.set("filterValue", js.undefined)
    
    @scala.inline
    def setFocusedColumnIndex(value: Double): Self = this.set("focusedColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusedColumnIndex: Self = this.set("focusedColumnIndex", js.undefined)
    
    @scala.inline
    def setFocusedRowEnabled(value: Boolean): Self = this.set("focusedRowEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusedRowEnabled: Self = this.set("focusedRowEnabled", js.undefined)
    
    @scala.inline
    def setFocusedRowIndex(value: Double): Self = this.set("focusedRowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusedRowIndex: Self = this.set("focusedRowIndex", js.undefined)
    
    @scala.inline
    def setFocusedRowKey(value: js.Any): Self = this.set("focusedRowKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFocusedRowKey: Self = this.set("focusedRowKey", js.undefined)
    
    @scala.inline
    def setHeaderFilter(value: Height): Self = this.set("headerFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderFilter: Self = this.set("headerFilter", js.undefined)
    
    @scala.inline
    def setHighlightChanges(value: Boolean): Self = this.set("highlightChanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightChanges: Self = this.set("highlightChanges", js.undefined)
    
    @scala.inline
    def setKeyboardNavigation(value: EditOnKeyPress): Self = this.set("keyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyboardNavigation: Self = this.set("keyboardNavigation", js.undefined)
    
    @scala.inline
    def setLoadPanel(value: IndicatorSrc): Self = this.set("loadPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadPanel: Self = this.set("loadPanel", js.undefined)
    
    @scala.inline
    def setNoDataText(value: String): Self = this.set("noDataText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDataText: Self = this.set("noDataText", js.undefined)
    
    @scala.inline
    def setOnAdaptiveDetailRowPreparing(value: /* e */ FormOptions[T] => _): Self = this.set("onAdaptiveDetailRowPreparing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnAdaptiveDetailRowPreparing: Self = this.set("onAdaptiveDetailRowPreparing", js.undefined)
    
    @scala.inline
    def setOnDataErrorOccurred(value: /* e */ Error[T] => _): Self = this.set("onDataErrorOccurred", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnDataErrorOccurred: Self = this.set("onDataErrorOccurred", js.undefined)
    
    @scala.inline
    def setOnEditCanceled(value: /* e */ ChangesComponent[T] => _): Self = this.set("onEditCanceled", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEditCanceled: Self = this.set("onEditCanceled", js.undefined)
    
    @scala.inline
    def setOnEditCanceling(value: /* e */ CancelChanges[T] => _): Self = this.set("onEditCanceling", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnEditCanceling: Self = this.set("onEditCanceling", js.undefined)
    
    @scala.inline
    def setOnInitNewRow(value: /* e */ Promise[T] => _): Self = this.set("onInitNewRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInitNewRow: Self = this.set("onInitNewRow", js.undefined)
    
    @scala.inline
    def setOnKeyDown(value: /* e */ Handled[T] => _): Self = this.set("onKeyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnKeyDown: Self = this.set("onKeyDown", js.undefined)
    
    @scala.inline
    def setOnRowCollapsed(value: /* e */ Key[T] => _): Self = this.set("onRowCollapsed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowCollapsed: Self = this.set("onRowCollapsed", js.undefined)
    
    @scala.inline
    def setOnRowCollapsing(value: /* e */ CancelComponent[T] => _): Self = this.set("onRowCollapsing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowCollapsing: Self = this.set("onRowCollapsing", js.undefined)
    
    @scala.inline
    def setOnRowExpanded(value: /* e */ Key[T] => _): Self = this.set("onRowExpanded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowExpanded: Self = this.set("onRowExpanded", js.undefined)
    
    @scala.inline
    def setOnRowExpanding(value: /* e */ CancelComponent[T] => _): Self = this.set("onRowExpanding", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowExpanding: Self = this.set("onRowExpanding", js.undefined)
    
    @scala.inline
    def setOnRowInserted(value: /* e */ ComponentData[T] => _): Self = this.set("onRowInserted", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowInserted: Self = this.set("onRowInserted", js.undefined)
    
    @scala.inline
    def setOnRowInserting(value: /* e */ DataElement[T] => _): Self = this.set("onRowInserting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowInserting: Self = this.set("onRowInserting", js.undefined)
    
    @scala.inline
    def setOnRowRemoved(value: /* e */ ComponentData[T] => _): Self = this.set("onRowRemoved", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowRemoved: Self = this.set("onRowRemoved", js.undefined)
    
    @scala.inline
    def setOnRowRemoving(value: /* e */ ElementKey[T] => _): Self = this.set("onRowRemoving", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowRemoving: Self = this.set("onRowRemoving", js.undefined)
    
    @scala.inline
    def setOnRowUpdated(value: /* e */ ComponentData[T] => _): Self = this.set("onRowUpdated", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowUpdated: Self = this.set("onRowUpdated", js.undefined)
    
    @scala.inline
    def setOnRowUpdating(value: /* e */ NewData[T] => _): Self = this.set("onRowUpdating", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowUpdating: Self = this.set("onRowUpdating", js.undefined)
    
    @scala.inline
    def setOnRowValidating(value: /* e */ BrokenRules[T] => _): Self = this.set("onRowValidating", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnRowValidating: Self = this.set("onRowValidating", js.undefined)
    
    @scala.inline
    def setOnSaved(value: /* e */ ChangesComponent[T] => _): Self = this.set("onSaved", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSaved: Self = this.set("onSaved", js.undefined)
    
    @scala.inline
    def setOnSaving(value: /* e */ ComponentElement[T] => _): Self = this.set("onSaving", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSaving: Self = this.set("onSaving", js.undefined)
    
    @scala.inline
    def setOnSelectionChanged(value: /* e */ CurrentDeselectedRowKeys[T] => _): Self = this.set("onSelectionChanged", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSelectionChanged: Self = this.set("onSelectionChanged", js.undefined)
    
    @scala.inline
    def setOnToolbarPreparing(value: /* e */ ToolbarOptions[T] => _): Self = this.set("onToolbarPreparing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnToolbarPreparing: Self = this.set("onToolbarPreparing", js.undefined)
    
    @scala.inline
    def setPager(value: AllowedPageSizes): Self = this.set("pager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePager: Self = this.set("pager", js.undefined)
    
    @scala.inline
    def setPaging(value: GridBasePaging): Self = this.set("paging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePaging: Self = this.set("paging", js.undefined)
    
    @scala.inline
    def setRenderAsync(value: Boolean): Self = this.set("renderAsync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderAsync: Self = this.set("renderAsync", js.undefined)
    
    @scala.inline
    def setRepaintChangesOnly(value: Boolean): Self = this.set("repaintChangesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepaintChangesOnly: Self = this.set("repaintChangesOnly", js.undefined)
    
    @scala.inline
    def setRowAlternationEnabled(value: Boolean): Self = this.set("rowAlternationEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowAlternationEnabled: Self = this.set("rowAlternationEnabled", js.undefined)
    
    @scala.inline
    def setRowDragging(value: AllowDropInsideItem): Self = this.set("rowDragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowDragging: Self = this.set("rowDragging", js.undefined)
    
    @scala.inline
    def setScrolling(value: GridBaseScrolling): Self = this.set("scrolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrolling: Self = this.set("scrolling", js.undefined)
    
    @scala.inline
    def setSearchPanel(value: HighlightCaseSensitive): Self = this.set("searchPanel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchPanel: Self = this.set("searchPanel", js.undefined)
    
    @scala.inline
    def setSelectedRowKeysVarargs(value: js.Any*): Self = this.set("selectedRowKeys", js.Array(value :_*))
    
    @scala.inline
    def setSelectedRowKeys(value: js.Array[_]): Self = this.set("selectedRowKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRowKeys: Self = this.set("selectedRowKeys", js.undefined)
    
    @scala.inline
    def setSelection(value: GridBaseSelection): Self = this.set("selection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelection: Self = this.set("selection", js.undefined)
    
    @scala.inline
    def setShowBorders(value: Boolean): Self = this.set("showBorders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowBorders: Self = this.set("showBorders", js.undefined)
    
    @scala.inline
    def setShowColumnHeaders(value: Boolean): Self = this.set("showColumnHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowColumnHeaders: Self = this.set("showColumnHeaders", js.undefined)
    
    @scala.inline
    def setShowColumnLines(value: Boolean): Self = this.set("showColumnLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowColumnLines: Self = this.set("showColumnLines", js.undefined)
    
    @scala.inline
    def setShowRowLines(value: Boolean): Self = this.set("showRowLines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRowLines: Self = this.set("showRowLines", js.undefined)
    
    @scala.inline
    def setSorting(value: AscendingText): Self = this.set("sorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSorting: Self = this.set("sorting", js.undefined)
    
    @scala.inline
    def setStateStoring(value: CustomLoad): Self = this.set("stateStoring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStateStoring: Self = this.set("stateStoring", js.undefined)
    
    @scala.inline
    def setTwoWayBindingEnabled(value: Boolean): Self = this.set("twoWayBindingEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTwoWayBindingEnabled: Self = this.set("twoWayBindingEnabled", js.undefined)
    
    @scala.inline
    def setWordWrapEnabled(value: Boolean): Self = this.set("wordWrapEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWordWrapEnabled: Self = this.set("wordWrapEnabled", js.undefined)
  }
}
