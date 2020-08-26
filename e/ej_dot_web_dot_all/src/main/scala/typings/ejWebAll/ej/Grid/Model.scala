package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
  /** Triggered for every grid action before its starts.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  /** Triggered for every grid action success event.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  /** Triggered for every grid action server failure event.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates whether to customizing cell based on our needs.
    * @Default {false}
    */
  var allowCellMerging: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable dynamic filtering behavior on grid. Filtering can be used to limit the records displayed using required criteria and this can
    * be further customized through â€œfilterSettingsâ€ property
    * @Default {false}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable dynamic grouping behavior. Grouping can be done by drag on drop desired columns to gridâ€™s GroupDropArea. This can be
    * further customized through â€œgroupSettingsâ€ property.
    * @Default {false}
    */
  var allowGrouping: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable keyboard support for performing grid actions. selectionType â€“ Gets or sets a value that indicates whether to enable single
    * row or multiple rows selection behavior in grid. Multiple selection can be done through by holding CTRL and clicking the grid rows
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable multi columns sorting behavior in grid. Sort multiple columns by holding CTRL and click on the corresponding column header.
    * @Default {false}
    */
  var allowMultiSorting: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the multiple exporting behavior on grid data.
    * @Default {false}
    */
  var allowMultipleExporting: js.UndefOr[Boolean] = js.native
  /** This specifies the grid to show the paginated data. Also enables pager control at the bottom of grid for dynamic navigation through data source. Paging can be further customized
    * through â€œpageSettingsâ€ property.
    * @Default {false}
    */
  var allowPaging: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the columns reordering behavior in the grid. Reordering can be done through by drag and drop the particular column from one
    * index to another index within the grid.
    * @Default {false}
    */
  var allowReordering: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether the column is non resizable. Column width is set automatically based on the content or header text which is large.
    * @Default {false}
    */
  var allowResizeToFit: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable dynamic resizable of columns. Resize the width of the columns by simply click and move the particular column header line
    * @Default {false}
    */
  var allowResizing: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the rows reordering in Grid and drag &amp; drop rows between multiple Grid.
    * @Default {false}
    */
  var allowRowDragAndDrop: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the scrollbar in the grid and view the records by scroll through the grid manually
    * @Default {false}
    */
  var allowScrolling: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable dynamic searching behavior in grid. Currently search box can be enabled through â€œtoolbarSettingsâ€
    * @Default {false}
    */
  var allowSearching: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether user can select rows on grid. On enabling feature, selected row will be highlighted.
    * @Default {true}
    */
  var allowSelection: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the dynamic sorting behavior on grid data. Sorting can be done through clicking on particular column header.
    * @Default {false}
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether the Content will wrap to the next line if the content exceeds the boundary of the Column Cells.
    * @Default {false}
    */
  var allowTextWrap: js.UndefOr[Boolean] = js.native
  /** Triggered when record batch add.
    */
  var batchAdd: js.UndefOr[js.Function1[/* e */ BatchAddEventArgs, Unit]] = js.native
  /** Triggered when record batch delete.
    */
  var batchDelete: js.UndefOr[js.Function1[/* e */ BatchDeleteEventArgs, Unit]] = js.native
  /** Triggered before the batch add.
    */
  var beforeBatchAdd: js.UndefOr[js.Function1[/* e */ BeforeBatchAddEventArgs, Unit]] = js.native
  /** Triggered before the batch delete.
    */
  var beforeBatchDelete: js.UndefOr[js.Function1[/* e */ BeforeBatchDeleteEventArgs, Unit]] = js.native
  /** Triggered before the batch save.
    */
  var beforeBatchSave: js.UndefOr[js.Function1[/* e */ BeforeBatchSaveEventArgs, Unit]] = js.native
  /** Triggered before the print.
    */
  var beforePrint: js.UndefOr[js.Function1[/* e */ BeforePrintEventArgs, Unit]] = js.native
  /** Triggered before row drop in the grid
    */
  var beforeRowDrop: js.UndefOr[js.Function1[/* e */ BeforeRowDropEventArgs, Unit]] = js.native
  /** Triggered before the record is going to be edited.
    */
  var beginEdit: js.UndefOr[js.Function1[/* e */ BeginEditEventArgs, Unit]] = js.native
  /** Triggered after the cell is deselected.
    */
  var cellDeselected: js.UndefOr[js.Function1[/* e */ CellDeselectedEventArgs, Unit]] = js.native
  /** Triggered before the cell is going to be deselected.
    */
  var cellDeselecting: js.UndefOr[js.Function1[/* e */ CellDeselectingEventArgs, Unit]] = js.native
  /** Triggered when record cell edit.
    */
  var cellEdit: js.UndefOr[js.Function1[/* e */ CellEditEventArgs, Unit]] = js.native
  /** Triggered when record cell save.
    */
  var cellSave: js.UndefOr[js.Function1[/* e */ CellSaveEventArgs, Unit]] = js.native
  /** Triggered after the cell is selected.
    */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, Unit]] = js.native
  /** Triggered before the cell is going to be selected.
    */
  var cellSelecting: js.UndefOr[js.Function1[/* e */ CellSelectingEventArgs, Unit]] = js.native
  /** This specifies the grid to add the grid control inside the grid row of the parent with expand/collapse options
    * @Default {null}
    */
  var childGrid: js.UndefOr[js.Any] = js.native
  /** Triggered after the column is deselected.
    */
  var columnDeselected: js.UndefOr[js.Function1[/* e */ ColumnDeselectedEventArgs, Unit]] = js.native
  /** Triggered before the column is going to be deselected.
    */
  var columnDeselecting: js.UndefOr[js.Function1[/* e */ ColumnDeselectingEventArgs, Unit]] = js.native
  /** Triggered when the column is being dragged.
    */
  var columnDrag: js.UndefOr[js.Function1[/* e */ ColumnDragEventArgs, Unit]] = js.native
  /** Triggered when column dragging begins.
    */
  var columnDragStart: js.UndefOr[js.Function1[/* e */ ColumnDragStartEventArgs, Unit]] = js.native
  /** Triggered when the column is dropped.
    */
  var columnDrop: js.UndefOr[js.Function1[/* e */ ColumnDropEventArgs, Unit]] = js.native
  /** Used to enable or disable static width settings for column. If the columnLayout is set as fixed, then column width will be static.
    * @Default {ej.Grid.ColumnLayout.Auto}
    */
  var columnLayout: js.UndefOr[ColumnLayout | String] = js.native
  /** Triggered after the column is selected.
    */
  var columnSelected: js.UndefOr[js.Function1[/* e */ ColumnSelectedEventArgs, Unit]] = js.native
  /** Triggered before the column is going to be selected.
    */
  var columnSelecting: js.UndefOr[js.Function1[/* e */ ColumnSelectingEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates to render the grid with specified columns
    * @Default {[]}
    */
  var columns: js.UndefOr[js.Array[Column]] = js.native
  /** Gets or sets a value that indicates to define common width for all the columns in the grid.
    */
  var commonWidth: js.UndefOr[Double] = js.native
  /** Triggered when context menu item is clicked
    */
  var contextClick: js.UndefOr[js.Function1[/* e */ ContextClickEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates whether to customize the context menu behavior of the grid.
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.native
  /** Triggered before the context menu is opened.
    */
  var contextOpen: js.UndefOr[js.Function1[/* e */ ContextOpenEventArgs, Unit]] = js.native
  /** Triggered when the grid is rendered completely.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates to render the grid with custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  /** Triggered when the grid is bound with data during initial rendering.
    */
  var dataBound: js.UndefOr[js.Function1[/* e */ DataBoundEventArgs, Unit]] = js.native
  /** Gets or sets the data to render the grid with records
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.native
  /** Triggered when grid going to destroy.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  /** Triggered when detail template row is clicked to collapse.
    */
  var detailsCollapse: js.UndefOr[js.Function1[/* e */ DetailsCollapseEventArgs, Unit]] = js.native
  /** Triggered detail template row is initialized.
    */
  var detailsDataBound: js.UndefOr[js.Function1[/* e */ DetailsDataBoundEventArgs, Unit]] = js.native
  /** Triggered when detail template row is clicked to expand.
    */
  var detailsExpand: js.UndefOr[js.Function1[/* e */ DetailsExpandEventArgs, Unit]] = js.native
  /** Default Value:
    * @Default {null}
    */
  var detailsTemplate: js.UndefOr[String] = js.native
  /** Gets or sets an object that indicates whether to customize the editing behavior of the grid.
    */
  var editSettings: js.UndefOr[EditSettings] = js.native
  /** Gets or sets a value that indicates whether to enable the alternative rows differentiation in the grid records based on corresponding theme.
    * @Default {true}
    */
  var enableAltRow: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable the save action in the grid through row selection
    * @Default {true}
    */
  var enableAutoSaveOnSelectionChange: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable mouse over effect on the corresponding column header cell of the grid
    * @Default {false}
    */
  var enableHeaderHover: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to persist the grid model state in page using applicable medium i.e., HTML5 localStorage or cookies
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[Boolean] = js.native
  /** Align content in the grid control from right to left by setting the property as true.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether the grid rows has to be rendered as detail view in mobile mode
    * @Default {false}
    */
  var enableResponsiveRow: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to enable mouse over effect on corresponding grid row.
    * @Default {true}
    */
  var enableRowHover: js.UndefOr[Boolean] = js.native
  /** It sets a value that indicates whether to enable toolbar items, when allowEditing, allowAdding and allowDeleting property set as false in the grid.
    * @Default {false}
    */
  var enableToolbarItems: js.UndefOr[Boolean] = js.native
  /** To Disable the mouse swipe property as false.
    * @Default {true}
    */
  var enableTouch: js.UndefOr[Boolean] = js.native
  /** Triggered after the record is added.
    */
  var endAdd: js.UndefOr[js.Function1[/* e */ EndAddEventArgs, Unit]] = js.native
  /** Triggered after the record is deleted.
    */
  var endDelete: js.UndefOr[js.Function1[/* e */ EndDeleteEventArgs, Unit]] = js.native
  /** Triggered after the record is edited.
    */
  var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, Unit]] = js.native
  /** Act as mapper for the excel exporting URL.
    * @Default {ExportToExcel}
    */
  var exportToExcelAction: js.UndefOr[String] = js.native
  /** Act as mapper for the PDF exporting URL.
    * @Default {ExportToPdf}
    */
  var exportToPdfAction: js.UndefOr[String] = js.native
  /** Act as mapper for the Word exporting URL.
    * @Default {ExportToWord}
    */
  var exportToWordAction: js.UndefOr[String] = js.native
  /** Gets or sets an object that indicates whether to customize the filtering behavior of the grid
    */
  var filterSettings: js.UndefOr[FilterSettings] = js.native
  /** Gets or sets a value that indicates to enable the visibility of the grid lines.
    * @Default {ej.Grid.GridLines.Both}
    */
  var gridLines: js.UndefOr[GridLines | String] = js.native
  /** Gets or sets an object that indicates whether to customize the grouping behavior of the grid.
    */
  var groupSettings: js.UndefOr[GroupSettings] = js.native
  /** Gets or sets a value that indicates whether the grid design has be to made responsive.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  /** This specifies to change the key in keyboard interaction to grid control
    * @Default {null}
    */
  var keySettings: js.UndefOr[js.Any] = js.native
  /** Triggered initial load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data i.e. in a language and culture specific to
    * a particular country or region.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  /** Triggered every time a request is made to access particular cell information, element and data.
    */
  var mergeCellInfo: js.UndefOr[js.Function1[/* e */ MergeCellInfoEventArgs, Unit]] = js.native
  /** Triggered every time a request is made to access particular header cell information, element and data.
    */
  var mergeHeaderCellInfo: js.UndefOr[js.Function1[/* e */ MergeHeaderCellInfoEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates whether to set the minimum width of the responsive grid while isResponsive property is true and enableResponsiveRow property is set as false.
    * @Default {0}
    */
  var minWidth: js.UndefOr[Double] = js.native
  /** Gets or sets an object that indicates whether to modify the pager default configuration.
    */
  var pageSettings: js.UndefOr[PageSettings] = js.native
  /** Query the dataSource from the table for Grid.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  /** Triggered every time a request is made to access particular cell information, element and data.
    */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.native
  /** Triggered when record is clicked.
    */
  var recordClick: js.UndefOr[js.Function1[/* e */ RecordClickEventArgs, Unit]] = js.native
  /** Triggered when record is double clicked.
    */
  var recordDoubleClick: js.UndefOr[js.Function1[/* e */ RecordDoubleClickEventArgs, Unit]] = js.native
  /** Triggered when column resize end.
    */
  var resizeEnd: js.UndefOr[js.Function1[/* e */ ResizeEndEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates whether to modify the resizing behavior.
    */
  var resizeSettings: js.UndefOr[ResizeSettings] = js.native
  /** Triggered when column resize start.
    */
  var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, Unit]] = js.native
  /** Triggered after column resized.
    */
  var resized: js.UndefOr[js.Function1[/* e */ ResizedEventArgs, Unit]] = js.native
  /** Triggered when right clicked on grid element.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, Unit]] = js.native
  /** Triggered every time a request is made to access row information, element and data.
    */
  var rowDataBound: js.UndefOr[js.Function1[/* e */ RowDataBoundEventArgs, Unit]] = js.native
  /** Triggered after the row is deselected.
    */
  var rowDeselected: js.UndefOr[js.Function1[/* e */ RowDeselectedEventArgs, Unit]] = js.native
  /** Triggered before the row is going to be deselected.
    */
  var rowDeselecting: js.UndefOr[js.Function1[/* e */ RowDeselectingEventArgs, Unit]] = js.native
  /** Triggered when the row is being dragged.
    */
  var rowDrag: js.UndefOr[js.Function1[/* e */ RowDragEventArgs, Unit]] = js.native
  /** Triggered when row dragging begins.
    */
  var rowDragStart: js.UndefOr[js.Function1[/* e */ RowDragStartEventArgs, Unit]] = js.native
  /** Triggered when the row is dropped.
    */
  var rowDrop: js.UndefOr[js.Function1[/* e */ RowDropEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates whether to customize the drag and drop behavior of the grid rows
    */
  var rowDropSettings: js.UndefOr[RowDropSettings] = js.native
  /** Triggered while hover the grid row.
    */
  var rowHover: js.UndefOr[js.Function1[/* e */ RowHoverEventArgs, Unit]] = js.native
  /** Triggered after the row is selected.
    */
  var rowSelected: js.UndefOr[js.Function1[/* e */ RowSelectedEventArgs, Unit]] = js.native
  /** Triggered before the row is going to be selected.
    */
  var rowSelecting: js.UndefOr[js.Function1[/* e */ RowSelectingEventArgs, Unit]] = js.native
  /** Gets or sets a value that indicates to render the grid with template rows. The template row must be a table row. That table row must have the JavaScript render binding format
    * ({{:columnName}}) then the grid data source binds the data to the corresponding table row of the template.
    * @Default {null}
    */
  var rowTemplate: js.UndefOr[String] = js.native
  /** Gets or sets an object that indicates whether to customize the scrolling behavior of the grid.
    */
  var scrollSettings: js.UndefOr[ScrollSettings] = js.native
  /** Gets or sets an object that indicates whether to customize the searching behavior of the grid
    */
  var searchSettings: js.UndefOr[SearchSettings] = js.native
  /** Gets a value that display the array of selected records in the Grid.
    * @Default {null}
    */
  var selectedRecords: js.UndefOr[js.Array[_]] = js.native
  /** Gets or sets a value that indicates to select the row while initializing the grid
    * @Default {-1}
    */
  var selectedRowIndex: js.UndefOr[Double] = js.native
  /** Gets or sets a value that indicates the selected rows in grid
    * @Default {[]}
    */
  var selectedRowIndices: js.UndefOr[js.Array[_]] = js.native
  /** This property is used to configure the selection behavior of the grid.
    */
  var selectionSettings: js.UndefOr[SelectionSettings] = js.native
  /** The row selection behavior of grid. Accepting types are &quot;single&quot; and &quot;multiple&quot;.
    * @Default {ej.Grid.SelectionType.Single}
    */
  var selectionType: js.UndefOr[SelectionType | String] = js.native
  /** Default Value:
    * @Default {false}
    */
  var showColumnChooser: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates stacked header should be shown on grid layout when the property â€œstackedHeaderRowsâ€ is set.
    * @Default {false}
    */
  var showStackedHeader: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates summary rows should be shown on grid layout when the property â€œsummaryRowsâ€ is set
    * @Default {false}
    */
  var showSummary: js.UndefOr[Boolean] = js.native
  /** Gets or sets a value that indicates whether to customize the sorting behavior of the grid.
    */
  var sortSettings: js.UndefOr[SortSettings] = js.native
  /** Gets or sets an object that indicates to managing the collection of stacked header rows for the grid.
    * @Default {[]}
    */
  var stackedHeaderRows: js.UndefOr[js.Array[StackedHeaderRow]] = js.native
  /** Gets or sets an object that indicates to managing the collection of summary rows for the grid.
    * @Default {[]}
    */
  var summaryRows: js.UndefOr[js.Array[SummaryRow]] = js.native
  /** Triggered when refresh the template column elements in the Grid.
    */
  var templateRefresh: js.UndefOr[js.Function1[/* e */ TemplateRefreshEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates whether to auto wrap the grid header or content or both
    */
  var textWrapSettings: js.UndefOr[TextWrapSettings] = js.native
  /** Triggered when toolbar item is clicked in grid.
    */
  var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.native
  /** Gets or sets an object that indicates whether to enable the toolbar in the grid and add toolbar items
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.native
}

object Model {
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
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
    def setActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = this.set("actionBegin", js.Any.fromFunction1(value))
    @scala.inline
    def deleteActionBegin: Self = this.set("actionBegin", js.undefined)
    @scala.inline
    def setActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = this.set("actionComplete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteActionComplete: Self = this.set("actionComplete", js.undefined)
    @scala.inline
    def setActionFailure(value: /* e */ ActionFailureEventArgs => Unit): Self = this.set("actionFailure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteActionFailure: Self = this.set("actionFailure", js.undefined)
    @scala.inline
    def setAllowCellMerging(value: Boolean): Self = this.set("allowCellMerging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowCellMerging: Self = this.set("allowCellMerging", js.undefined)
    @scala.inline
    def setAllowFiltering(value: Boolean): Self = this.set("allowFiltering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowFiltering: Self = this.set("allowFiltering", js.undefined)
    @scala.inline
    def setAllowGrouping(value: Boolean): Self = this.set("allowGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowGrouping: Self = this.set("allowGrouping", js.undefined)
    @scala.inline
    def setAllowKeyboardNavigation(value: Boolean): Self = this.set("allowKeyboardNavigation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowKeyboardNavigation: Self = this.set("allowKeyboardNavigation", js.undefined)
    @scala.inline
    def setAllowMultiSorting(value: Boolean): Self = this.set("allowMultiSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMultiSorting: Self = this.set("allowMultiSorting", js.undefined)
    @scala.inline
    def setAllowMultipleExporting(value: Boolean): Self = this.set("allowMultipleExporting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowMultipleExporting: Self = this.set("allowMultipleExporting", js.undefined)
    @scala.inline
    def setAllowPaging(value: Boolean): Self = this.set("allowPaging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowPaging: Self = this.set("allowPaging", js.undefined)
    @scala.inline
    def setAllowReordering(value: Boolean): Self = this.set("allowReordering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowReordering: Self = this.set("allowReordering", js.undefined)
    @scala.inline
    def setAllowResizeToFit(value: Boolean): Self = this.set("allowResizeToFit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowResizeToFit: Self = this.set("allowResizeToFit", js.undefined)
    @scala.inline
    def setAllowResizing(value: Boolean): Self = this.set("allowResizing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowResizing: Self = this.set("allowResizing", js.undefined)
    @scala.inline
    def setAllowRowDragAndDrop(value: Boolean): Self = this.set("allowRowDragAndDrop", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowRowDragAndDrop: Self = this.set("allowRowDragAndDrop", js.undefined)
    @scala.inline
    def setAllowScrolling(value: Boolean): Self = this.set("allowScrolling", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowScrolling: Self = this.set("allowScrolling", js.undefined)
    @scala.inline
    def setAllowSearching(value: Boolean): Self = this.set("allowSearching", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSearching: Self = this.set("allowSearching", js.undefined)
    @scala.inline
    def setAllowSelection(value: Boolean): Self = this.set("allowSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSelection: Self = this.set("allowSelection", js.undefined)
    @scala.inline
    def setAllowSorting(value: Boolean): Self = this.set("allowSorting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowSorting: Self = this.set("allowSorting", js.undefined)
    @scala.inline
    def setAllowTextWrap(value: Boolean): Self = this.set("allowTextWrap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowTextWrap: Self = this.set("allowTextWrap", js.undefined)
    @scala.inline
    def setBatchAdd(value: /* e */ BatchAddEventArgs => Unit): Self = this.set("batchAdd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBatchAdd: Self = this.set("batchAdd", js.undefined)
    @scala.inline
    def setBatchDelete(value: /* e */ BatchDeleteEventArgs => Unit): Self = this.set("batchDelete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBatchDelete: Self = this.set("batchDelete", js.undefined)
    @scala.inline
    def setBeforeBatchAdd(value: /* e */ BeforeBatchAddEventArgs => Unit): Self = this.set("beforeBatchAdd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeBatchAdd: Self = this.set("beforeBatchAdd", js.undefined)
    @scala.inline
    def setBeforeBatchDelete(value: /* e */ BeforeBatchDeleteEventArgs => Unit): Self = this.set("beforeBatchDelete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeBatchDelete: Self = this.set("beforeBatchDelete", js.undefined)
    @scala.inline
    def setBeforeBatchSave(value: /* e */ BeforeBatchSaveEventArgs => Unit): Self = this.set("beforeBatchSave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeBatchSave: Self = this.set("beforeBatchSave", js.undefined)
    @scala.inline
    def setBeforePrint(value: /* e */ BeforePrintEventArgs => Unit): Self = this.set("beforePrint", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforePrint: Self = this.set("beforePrint", js.undefined)
    @scala.inline
    def setBeforeRowDrop(value: /* e */ BeforeRowDropEventArgs => Unit): Self = this.set("beforeRowDrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforeRowDrop: Self = this.set("beforeRowDrop", js.undefined)
    @scala.inline
    def setBeginEdit(value: /* e */ BeginEditEventArgs => Unit): Self = this.set("beginEdit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeginEdit: Self = this.set("beginEdit", js.undefined)
    @scala.inline
    def setCellDeselected(value: /* e */ CellDeselectedEventArgs => Unit): Self = this.set("cellDeselected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellDeselected: Self = this.set("cellDeselected", js.undefined)
    @scala.inline
    def setCellDeselecting(value: /* e */ CellDeselectingEventArgs => Unit): Self = this.set("cellDeselecting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellDeselecting: Self = this.set("cellDeselecting", js.undefined)
    @scala.inline
    def setCellEdit(value: /* e */ CellEditEventArgs => Unit): Self = this.set("cellEdit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellEdit: Self = this.set("cellEdit", js.undefined)
    @scala.inline
    def setCellSave(value: /* e */ CellSaveEventArgs => Unit): Self = this.set("cellSave", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellSave: Self = this.set("cellSave", js.undefined)
    @scala.inline
    def setCellSelected(value: /* e */ CellSelectedEventArgs => Unit): Self = this.set("cellSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellSelected: Self = this.set("cellSelected", js.undefined)
    @scala.inline
    def setCellSelecting(value: /* e */ CellSelectingEventArgs => Unit): Self = this.set("cellSelecting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCellSelecting: Self = this.set("cellSelecting", js.undefined)
    @scala.inline
    def setChildGrid(value: js.Any): Self = this.set("childGrid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildGrid: Self = this.set("childGrid", js.undefined)
    @scala.inline
    def setColumnDeselected(value: /* e */ ColumnDeselectedEventArgs => Unit): Self = this.set("columnDeselected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteColumnDeselected: Self = this.set("columnDeselected", js.undefined)
    @scala.inline
    def setColumnDeselecting(value: /* e */ ColumnDeselectingEventArgs => Unit): Self = this.set("columnDeselecting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteColumnDeselecting: Self = this.set("columnDeselecting", js.undefined)
    @scala.inline
    def setColumnDrag(value: /* e */ ColumnDragEventArgs => Unit): Self = this.set("columnDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteColumnDrag: Self = this.set("columnDrag", js.undefined)
    @scala.inline
    def setColumnDragStart(value: /* e */ ColumnDragStartEventArgs => Unit): Self = this.set("columnDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteColumnDragStart: Self = this.set("columnDragStart", js.undefined)
    @scala.inline
    def setColumnDrop(value: /* e */ ColumnDropEventArgs => Unit): Self = this.set("columnDrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteColumnDrop: Self = this.set("columnDrop", js.undefined)
    @scala.inline
    def setColumnLayout(value: ColumnLayout | String): Self = this.set("columnLayout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnLayout: Self = this.set("columnLayout", js.undefined)
    @scala.inline
    def setColumnSelected(value: /* e */ ColumnSelectedEventArgs => Unit): Self = this.set("columnSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteColumnSelected: Self = this.set("columnSelected", js.undefined)
    @scala.inline
    def setColumnSelecting(value: /* e */ ColumnSelectingEventArgs => Unit): Self = this.set("columnSelecting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteColumnSelecting: Self = this.set("columnSelecting", js.undefined)
    @scala.inline
    def setColumnsVarargs(value: Column*): Self = this.set("columns", js.Array(value :_*))
    @scala.inline
    def setColumns(value: js.Array[Column]): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    @scala.inline
    def setCommonWidth(value: Double): Self = this.set("commonWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonWidth: Self = this.set("commonWidth", js.undefined)
    @scala.inline
    def setContextClick(value: /* e */ ContextClickEventArgs => Unit): Self = this.set("contextClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContextClick: Self = this.set("contextClick", js.undefined)
    @scala.inline
    def setContextMenuSettings(value: ContextMenuSettings): Self = this.set("contextMenuSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenuSettings: Self = this.set("contextMenuSettings", js.undefined)
    @scala.inline
    def setContextOpen(value: /* e */ ContextOpenEventArgs => Unit): Self = this.set("contextOpen", js.Any.fromFunction1(value))
    @scala.inline
    def deleteContextOpen: Self = this.set("contextOpen", js.undefined)
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    @scala.inline
    def setDataBound(value: /* e */ DataBoundEventArgs => Unit): Self = this.set("dataBound", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDataBound: Self = this.set("dataBound", js.undefined)
    @scala.inline
    def setDataSource(value: js.Any): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setDetailsCollapse(value: /* e */ DetailsCollapseEventArgs => Unit): Self = this.set("detailsCollapse", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDetailsCollapse: Self = this.set("detailsCollapse", js.undefined)
    @scala.inline
    def setDetailsDataBound(value: /* e */ DetailsDataBoundEventArgs => Unit): Self = this.set("detailsDataBound", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDetailsDataBound: Self = this.set("detailsDataBound", js.undefined)
    @scala.inline
    def setDetailsExpand(value: /* e */ DetailsExpandEventArgs => Unit): Self = this.set("detailsExpand", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDetailsExpand: Self = this.set("detailsExpand", js.undefined)
    @scala.inline
    def setDetailsTemplate(value: String): Self = this.set("detailsTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetailsTemplate: Self = this.set("detailsTemplate", js.undefined)
    @scala.inline
    def setEditSettings(value: EditSettings): Self = this.set("editSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditSettings: Self = this.set("editSettings", js.undefined)
    @scala.inline
    def setEnableAltRow(value: Boolean): Self = this.set("enableAltRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAltRow: Self = this.set("enableAltRow", js.undefined)
    @scala.inline
    def setEnableAutoSaveOnSelectionChange(value: Boolean): Self = this.set("enableAutoSaveOnSelectionChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableAutoSaveOnSelectionChange: Self = this.set("enableAutoSaveOnSelectionChange", js.undefined)
    @scala.inline
    def setEnableHeaderHover(value: Boolean): Self = this.set("enableHeaderHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHeaderHover: Self = this.set("enableHeaderHover", js.undefined)
    @scala.inline
    def setEnablePersistence(value: Boolean): Self = this.set("enablePersistence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnablePersistence: Self = this.set("enablePersistence", js.undefined)
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    @scala.inline
    def setEnableResponsiveRow(value: Boolean): Self = this.set("enableResponsiveRow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableResponsiveRow: Self = this.set("enableResponsiveRow", js.undefined)
    @scala.inline
    def setEnableRowHover(value: Boolean): Self = this.set("enableRowHover", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRowHover: Self = this.set("enableRowHover", js.undefined)
    @scala.inline
    def setEnableToolbarItems(value: Boolean): Self = this.set("enableToolbarItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableToolbarItems: Self = this.set("enableToolbarItems", js.undefined)
    @scala.inline
    def setEnableTouch(value: Boolean): Self = this.set("enableTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTouch: Self = this.set("enableTouch", js.undefined)
    @scala.inline
    def setEndAdd(value: /* e */ EndAddEventArgs => Unit): Self = this.set("endAdd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEndAdd: Self = this.set("endAdd", js.undefined)
    @scala.inline
    def setEndDelete(value: /* e */ EndDeleteEventArgs => Unit): Self = this.set("endDelete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEndDelete: Self = this.set("endDelete", js.undefined)
    @scala.inline
    def setEndEdit(value: /* e */ EndEditEventArgs => Unit): Self = this.set("endEdit", js.Any.fromFunction1(value))
    @scala.inline
    def deleteEndEdit: Self = this.set("endEdit", js.undefined)
    @scala.inline
    def setExportToExcelAction(value: String): Self = this.set("exportToExcelAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportToExcelAction: Self = this.set("exportToExcelAction", js.undefined)
    @scala.inline
    def setExportToPdfAction(value: String): Self = this.set("exportToPdfAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportToPdfAction: Self = this.set("exportToPdfAction", js.undefined)
    @scala.inline
    def setExportToWordAction(value: String): Self = this.set("exportToWordAction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportToWordAction: Self = this.set("exportToWordAction", js.undefined)
    @scala.inline
    def setFilterSettings(value: FilterSettings): Self = this.set("filterSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilterSettings: Self = this.set("filterSettings", js.undefined)
    @scala.inline
    def setGridLines(value: GridLines | String): Self = this.set("gridLines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGridLines: Self = this.set("gridLines", js.undefined)
    @scala.inline
    def setGroupSettings(value: GroupSettings): Self = this.set("groupSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupSettings: Self = this.set("groupSettings", js.undefined)
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    @scala.inline
    def setKeySettings(value: js.Any): Self = this.set("keySettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeySettings: Self = this.set("keySettings", js.undefined)
    @scala.inline
    def setLoad(value: /* e */ LoadEventArgs => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setMergeCellInfo(value: /* e */ MergeCellInfoEventArgs => Unit): Self = this.set("mergeCellInfo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMergeCellInfo: Self = this.set("mergeCellInfo", js.undefined)
    @scala.inline
    def setMergeHeaderCellInfo(value: /* e */ MergeHeaderCellInfoEventArgs => Unit): Self = this.set("mergeHeaderCellInfo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMergeHeaderCellInfo: Self = this.set("mergeHeaderCellInfo", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setPageSettings(value: PageSettings): Self = this.set("pageSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageSettings: Self = this.set("pageSettings", js.undefined)
    @scala.inline
    def setQuery(value: js.Any): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    @scala.inline
    def setQueryCellInfo(value: /* e */ QueryCellInfoEventArgs => Unit): Self = this.set("queryCellInfo", js.Any.fromFunction1(value))
    @scala.inline
    def deleteQueryCellInfo: Self = this.set("queryCellInfo", js.undefined)
    @scala.inline
    def setRecordClick(value: /* e */ RecordClickEventArgs => Unit): Self = this.set("recordClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRecordClick: Self = this.set("recordClick", js.undefined)
    @scala.inline
    def setRecordDoubleClick(value: /* e */ RecordDoubleClickEventArgs => Unit): Self = this.set("recordDoubleClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRecordDoubleClick: Self = this.set("recordDoubleClick", js.undefined)
    @scala.inline
    def setResizeEnd(value: /* e */ ResizeEndEventArgs => Unit): Self = this.set("resizeEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResizeEnd: Self = this.set("resizeEnd", js.undefined)
    @scala.inline
    def setResizeSettings(value: ResizeSettings): Self = this.set("resizeSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResizeSettings: Self = this.set("resizeSettings", js.undefined)
    @scala.inline
    def setResizeStart(value: /* e */ ResizeStartEventArgs => Unit): Self = this.set("resizeStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResizeStart: Self = this.set("resizeStart", js.undefined)
    @scala.inline
    def setResized(value: /* e */ ResizedEventArgs => Unit): Self = this.set("resized", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResized: Self = this.set("resized", js.undefined)
    @scala.inline
    def setRightClick(value: /* e */ RightClickEventArgs => Unit): Self = this.set("rightClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRightClick: Self = this.set("rightClick", js.undefined)
    @scala.inline
    def setRowDataBound(value: /* e */ RowDataBoundEventArgs => Unit): Self = this.set("rowDataBound", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowDataBound: Self = this.set("rowDataBound", js.undefined)
    @scala.inline
    def setRowDeselected(value: /* e */ RowDeselectedEventArgs => Unit): Self = this.set("rowDeselected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowDeselected: Self = this.set("rowDeselected", js.undefined)
    @scala.inline
    def setRowDeselecting(value: /* e */ RowDeselectingEventArgs => Unit): Self = this.set("rowDeselecting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowDeselecting: Self = this.set("rowDeselecting", js.undefined)
    @scala.inline
    def setRowDrag(value: /* e */ RowDragEventArgs => Unit): Self = this.set("rowDrag", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowDrag: Self = this.set("rowDrag", js.undefined)
    @scala.inline
    def setRowDragStart(value: /* e */ RowDragStartEventArgs => Unit): Self = this.set("rowDragStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowDragStart: Self = this.set("rowDragStart", js.undefined)
    @scala.inline
    def setRowDrop(value: /* e */ RowDropEventArgs => Unit): Self = this.set("rowDrop", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowDrop: Self = this.set("rowDrop", js.undefined)
    @scala.inline
    def setRowDropSettings(value: RowDropSettings): Self = this.set("rowDropSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowDropSettings: Self = this.set("rowDropSettings", js.undefined)
    @scala.inline
    def setRowHover(value: /* e */ RowHoverEventArgs => Unit): Self = this.set("rowHover", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowHover: Self = this.set("rowHover", js.undefined)
    @scala.inline
    def setRowSelected(value: /* e */ RowSelectedEventArgs => Unit): Self = this.set("rowSelected", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowSelected: Self = this.set("rowSelected", js.undefined)
    @scala.inline
    def setRowSelecting(value: /* e */ RowSelectingEventArgs => Unit): Self = this.set("rowSelecting", js.Any.fromFunction1(value))
    @scala.inline
    def deleteRowSelecting: Self = this.set("rowSelecting", js.undefined)
    @scala.inline
    def setRowTemplate(value: String): Self = this.set("rowTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowTemplate: Self = this.set("rowTemplate", js.undefined)
    @scala.inline
    def setScrollSettings(value: ScrollSettings): Self = this.set("scrollSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSettings: Self = this.set("scrollSettings", js.undefined)
    @scala.inline
    def setSearchSettings(value: SearchSettings): Self = this.set("searchSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchSettings: Self = this.set("searchSettings", js.undefined)
    @scala.inline
    def setSelectedRecordsVarargs(value: js.Any*): Self = this.set("selectedRecords", js.Array(value :_*))
    @scala.inline
    def setSelectedRecords(value: js.Array[_]): Self = this.set("selectedRecords", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRecords: Self = this.set("selectedRecords", js.undefined)
    @scala.inline
    def setSelectedRowIndex(value: Double): Self = this.set("selectedRowIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRowIndex: Self = this.set("selectedRowIndex", js.undefined)
    @scala.inline
    def setSelectedRowIndicesVarargs(value: js.Any*): Self = this.set("selectedRowIndices", js.Array(value :_*))
    @scala.inline
    def setSelectedRowIndices(value: js.Array[_]): Self = this.set("selectedRowIndices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedRowIndices: Self = this.set("selectedRowIndices", js.undefined)
    @scala.inline
    def setSelectionSettings(value: SelectionSettings): Self = this.set("selectionSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionSettings: Self = this.set("selectionSettings", js.undefined)
    @scala.inline
    def setSelectionType(value: SelectionType | String): Self = this.set("selectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionType: Self = this.set("selectionType", js.undefined)
    @scala.inline
    def setShowColumnChooser(value: Boolean): Self = this.set("showColumnChooser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowColumnChooser: Self = this.set("showColumnChooser", js.undefined)
    @scala.inline
    def setShowStackedHeader(value: Boolean): Self = this.set("showStackedHeader", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowStackedHeader: Self = this.set("showStackedHeader", js.undefined)
    @scala.inline
    def setShowSummary(value: Boolean): Self = this.set("showSummary", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowSummary: Self = this.set("showSummary", js.undefined)
    @scala.inline
    def setSortSettings(value: SortSettings): Self = this.set("sortSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSortSettings: Self = this.set("sortSettings", js.undefined)
    @scala.inline
    def setStackedHeaderRowsVarargs(value: StackedHeaderRow*): Self = this.set("stackedHeaderRows", js.Array(value :_*))
    @scala.inline
    def setStackedHeaderRows(value: js.Array[StackedHeaderRow]): Self = this.set("stackedHeaderRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStackedHeaderRows: Self = this.set("stackedHeaderRows", js.undefined)
    @scala.inline
    def setSummaryRowsVarargs(value: SummaryRow*): Self = this.set("summaryRows", js.Array(value :_*))
    @scala.inline
    def setSummaryRows(value: js.Array[SummaryRow]): Self = this.set("summaryRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryRows: Self = this.set("summaryRows", js.undefined)
    @scala.inline
    def setTemplateRefresh(value: /* e */ TemplateRefreshEventArgs => Unit): Self = this.set("templateRefresh", js.Any.fromFunction1(value))
    @scala.inline
    def deleteTemplateRefresh: Self = this.set("templateRefresh", js.undefined)
    @scala.inline
    def setTextWrapSettings(value: TextWrapSettings): Self = this.set("textWrapSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextWrapSettings: Self = this.set("textWrapSettings", js.undefined)
    @scala.inline
    def setToolbarClick(value: /* e */ ToolbarClickEventArgs => Unit): Self = this.set("toolbarClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteToolbarClick: Self = this.set("toolbarClick", js.undefined)
    @scala.inline
    def setToolbarSettings(value: ToolbarSettings): Self = this.set("toolbarSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbarSettings: Self = this.set("toolbarSettings", js.undefined)
  }
  
}

