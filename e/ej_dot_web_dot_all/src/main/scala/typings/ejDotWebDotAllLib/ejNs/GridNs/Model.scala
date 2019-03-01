package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggered for every grid action before its starts.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, scala.Unit]] = js.undefined
  /** Triggered for every grid action success event.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, scala.Unit]] = js.undefined
  /** Triggered for every grid action server failure event.
    */
  var actionFailure: js.UndefOr[js.Function1[/* e */ ActionFailureEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets a value that indicates whether to customizing cell based on our needs.
    * @Default {false}
    */
  var allowCellMerging: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable dynamic filtering behavior on grid. Filtering can be used to limit the records displayed using required criteria and this can
    * be further customized through â€œfilterSettingsâ€ property
    * @Default {false}
    */
  var allowFiltering: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable dynamic grouping behavior. Grouping can be done by drag on drop desired columns to gridâ€™s GroupDropArea. This can be
    * further customized through â€œgroupSettingsâ€ property.
    * @Default {false}
    */
  var allowGrouping: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable keyboard support for performing grid actions. selectionType â€“ Gets or sets a value that indicates whether to enable single
    * row or multiple rows selection behavior in grid. Multiple selection can be done through by holding CTRL and clicking the grid rows
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable multi columns sorting behavior in grid. Sort multiple columns by holding CTRL and click on the corresponding column header.
    * @Default {false}
    */
  var allowMultiSorting: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the multiple exporting behavior on grid data.
    * @Default {false}
    */
  var allowMultipleExporting: js.UndefOr[scala.Boolean] = js.undefined
  /** This specifies the grid to show the paginated data. Also enables pager control at the bottom of grid for dynamic navigation through data source. Paging can be further customized
    * through â€œpageSettingsâ€ property.
    * @Default {false}
    */
  var allowPaging: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the columns reordering behavior in the grid. Reordering can be done through by drag and drop the particular column from one
    * index to another index within the grid.
    * @Default {false}
    */
  var allowReordering: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether the column is non resizable. Column width is set automatically based on the content or header text which is large.
    * @Default {false}
    */
  var allowResizeToFit: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable dynamic resizable of columns. Resize the width of the columns by simply click and move the particular column header line
    * @Default {false}
    */
  var allowResizing: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the rows reordering in Grid and drag &amp; drop rows between multiple Grid.
    * @Default {false}
    */
  var allowRowDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the scrollbar in the grid and view the records by scroll through the grid manually
    * @Default {false}
    */
  var allowScrolling: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable dynamic searching behavior in grid. Currently search box can be enabled through â€œtoolbarSettingsâ€
    * @Default {false}
    */
  var allowSearching: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether user can select rows on grid. On enabling feature, selected row will be highlighted.
    * @Default {true}
    */
  var allowSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the dynamic sorting behavior on grid data. Sorting can be done through clicking on particular column header.
    * @Default {false}
    */
  var allowSorting: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether the Content will wrap to the next line if the content exceeds the boundary of the Column Cells.
    * @Default {false}
    */
  var allowTextWrap: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggered when record batch add.
    */
  var batchAdd: js.UndefOr[js.Function1[/* e */ BatchAddEventArgs, scala.Unit]] = js.undefined
  /** Triggered when record batch delete.
    */
  var batchDelete: js.UndefOr[js.Function1[/* e */ BatchDeleteEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the batch add.
    */
  var beforeBatchAdd: js.UndefOr[js.Function1[/* e */ BeforeBatchAddEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the batch delete.
    */
  var beforeBatchDelete: js.UndefOr[js.Function1[/* e */ BeforeBatchDeleteEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the batch save.
    */
  var beforeBatchSave: js.UndefOr[js.Function1[/* e */ BeforeBatchSaveEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the print.
    */
  var beforePrint: js.UndefOr[js.Function1[/* e */ BeforePrintEventArgs, scala.Unit]] = js.undefined
  /** Triggered before row drop in the grid
    */
  var beforeRowDrop: js.UndefOr[js.Function1[/* e */ BeforeRowDropEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the record is going to be edited.
    */
  var beginEdit: js.UndefOr[js.Function1[/* e */ BeginEditEventArgs, scala.Unit]] = js.undefined
  /** Triggered after the cell is deselected.
    */
  var cellDeselected: js.UndefOr[js.Function1[/* e */ CellDeselectedEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the cell is going to be deselected.
    */
  var cellDeselecting: js.UndefOr[js.Function1[/* e */ CellDeselectingEventArgs, scala.Unit]] = js.undefined
  /** Triggered when record cell edit.
    */
  var cellEdit: js.UndefOr[js.Function1[/* e */ CellEditEventArgs, scala.Unit]] = js.undefined
  /** Triggered when record cell save.
    */
  var cellSave: js.UndefOr[js.Function1[/* e */ CellSaveEventArgs, scala.Unit]] = js.undefined
  /** Triggered after the cell is selected.
    */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the cell is going to be selected.
    */
  var cellSelecting: js.UndefOr[js.Function1[/* e */ CellSelectingEventArgs, scala.Unit]] = js.undefined
  /** This specifies the grid to add the grid control inside the grid row of the parent with expand/collapse options
    * @Default {null}
    */
  var childGrid: js.UndefOr[js.Any] = js.undefined
  /** Triggered after the column is deselected.
    */
  var columnDeselected: js.UndefOr[js.Function1[/* e */ ColumnDeselectedEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the column is going to be deselected.
    */
  var columnDeselecting: js.UndefOr[js.Function1[/* e */ ColumnDeselectingEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the column is being dragged.
    */
  var columnDrag: js.UndefOr[js.Function1[/* e */ ColumnDragEventArgs, scala.Unit]] = js.undefined
  /** Triggered when column dragging begins.
    */
  var columnDragStart: js.UndefOr[js.Function1[/* e */ ColumnDragStartEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the column is dropped.
    */
  var columnDrop: js.UndefOr[js.Function1[/* e */ ColumnDropEventArgs, scala.Unit]] = js.undefined
  /** Used to enable or disable static width settings for column. If the columnLayout is set as fixed, then column width will be static.
    * @Default {ej.Grid.ColumnLayout.Auto}
    */
  var columnLayout: js.UndefOr[ColumnLayout | java.lang.String] = js.undefined
  /** Triggered after the column is selected.
    */
  var columnSelected: js.UndefOr[js.Function1[/* e */ ColumnSelectedEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the column is going to be selected.
    */
  var columnSelecting: js.UndefOr[js.Function1[/* e */ ColumnSelectingEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets an object that indicates to render the grid with specified columns
    * @Default {[]}
    */
  var columns: js.UndefOr[js.Array[Column]] = js.undefined
  /** Gets or sets a value that indicates to define common width for all the columns in the grid.
    */
  var commonWidth: js.UndefOr[scala.Double] = js.undefined
  /** Triggered when context menu item is clicked
    */
  var contextClick: js.UndefOr[js.Function1[/* e */ ContextClickEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets an object that indicates whether to customize the context menu behavior of the grid.
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
  /** Triggered before the context menu is opened.
    */
  var contextOpen: js.UndefOr[js.Function1[/* e */ ContextOpenEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the grid is rendered completely.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets a value that indicates to render the grid with custom theme.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered when the grid is bound with data during initial rendering.
    */
  var dataBound: js.UndefOr[js.Function1[/* e */ DataBoundEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets the data to render the grid with records
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Any] = js.undefined
  /** Triggered when grid going to destroy.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Triggered when detail template row is clicked to collapse.
    */
  var detailsCollapse: js.UndefOr[js.Function1[/* e */ DetailsCollapseEventArgs, scala.Unit]] = js.undefined
  /** Triggered detail template row is initialized.
    */
  var detailsDataBound: js.UndefOr[js.Function1[/* e */ DetailsDataBoundEventArgs, scala.Unit]] = js.undefined
  /** Triggered when detail template row is clicked to expand.
    */
  var detailsExpand: js.UndefOr[js.Function1[/* e */ DetailsExpandEventArgs, scala.Unit]] = js.undefined
  /** Default Value:
    * @Default {null}
    */
  var detailsTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets an object that indicates whether to customize the editing behavior of the grid.
    */
  var editSettings: js.UndefOr[EditSettings] = js.undefined
  /** Gets or sets a value that indicates whether to enable the alternative rows differentiation in the grid records based on corresponding theme.
    * @Default {true}
    */
  var enableAltRow: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the save action in the grid through row selection
    * @Default {true}
    */
  var enableAutoSaveOnSelectionChange: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable mouse over effect on the corresponding column header cell of the grid
    * @Default {false}
    */
  var enableHeaderHover: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to persist the grid model state in page using applicable medium i.e., HTML5 localStorage or cookies
    * @Default {false}
    */
  var enablePersistence: js.UndefOr[scala.Boolean] = js.undefined
  /** Align content in the grid control from right to left by setting the property as true.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether the grid rows has to be rendered as detail view in mobile mode
    * @Default {false}
    */
  var enableResponsiveRow: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable mouse over effect on corresponding grid row.
    * @Default {true}
    */
  var enableRowHover: js.UndefOr[scala.Boolean] = js.undefined
  /** It sets a value that indicates whether to enable toolbar items, when allowEditing, allowAdding and allowDeleting property set as false in the grid.
    * @Default {false}
    */
  var enableToolbarItems: js.UndefOr[scala.Boolean] = js.undefined
  /** To Disable the mouse swipe property as false.
    * @Default {true}
    */
  var enableTouch: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggered after the record is added.
    */
  var endAdd: js.UndefOr[js.Function1[/* e */ EndAddEventArgs, scala.Unit]] = js.undefined
  /** Triggered after the record is deleted.
    */
  var endDelete: js.UndefOr[js.Function1[/* e */ EndDeleteEventArgs, scala.Unit]] = js.undefined
  /** Triggered after the record is edited.
    */
  var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, scala.Unit]] = js.undefined
  /** Act as mapper for the excel exporting URL.
    * @Default {ExportToExcel}
    */
  var exportToExcelAction: js.UndefOr[java.lang.String] = js.undefined
  /** Act as mapper for the PDF exporting URL.
    * @Default {ExportToPdf}
    */
  var exportToPdfAction: js.UndefOr[java.lang.String] = js.undefined
  /** Act as mapper for the Word exporting URL.
    * @Default {ExportToWord}
    */
  var exportToWordAction: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets an object that indicates whether to customize the filtering behavior of the grid
    */
  var filterSettings: js.UndefOr[FilterSettings] = js.undefined
  /** Gets or sets a value that indicates to enable the visibility of the grid lines.
    * @Default {ej.Grid.GridLines.Both}
    */
  var gridLines: js.UndefOr[GridLines | java.lang.String] = js.undefined
  /** Gets or sets an object that indicates whether to customize the grouping behavior of the grid.
    */
  var groupSettings: js.UndefOr[GroupSettings] = js.undefined
  /** Gets or sets a value that indicates whether the grid design has be to made responsive.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** This specifies to change the key in keyboard interaction to grid control
    * @Default {null}
    */
  var keySettings: js.UndefOr[js.Any] = js.undefined
  /** Triggered initial load.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data i.e. in a language and culture specific to
    * a particular country or region.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered every time a request is made to access particular cell information, element and data.
    */
  var mergeCellInfo: js.UndefOr[js.Function1[/* e */ MergeCellInfoEventArgs, scala.Unit]] = js.undefined
  /** Triggered every time a request is made to access particular header cell information, element and data.
    */
  var mergeHeaderCellInfo: js.UndefOr[js.Function1[/* e */ MergeHeaderCellInfoEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets a value that indicates whether to set the minimum width of the responsive grid while isResponsive property is true and enableResponsiveRow property is set as false.
    * @Default {0}
    */
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets an object that indicates whether to modify the pager default configuration.
    */
  var pageSettings: js.UndefOr[PageSettings] = js.undefined
  /** Query the dataSource from the table for Grid.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Triggered every time a request is made to access particular cell information, element and data.
    */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, scala.Unit]] = js.undefined
  /** Triggered when record is clicked.
    */
  var recordClick: js.UndefOr[js.Function1[/* e */ RecordClickEventArgs, scala.Unit]] = js.undefined
  /** Triggered when record is double clicked.
    */
  var recordDoubleClick: js.UndefOr[js.Function1[/* e */ RecordDoubleClickEventArgs, scala.Unit]] = js.undefined
  /** Triggered when column resize end.
    */
  var resizeEnd: js.UndefOr[js.Function1[/* e */ ResizeEndEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets an object that indicates whether to modify the resizing behavior.
    */
  var resizeSettings: js.UndefOr[ResizeSettings] = js.undefined
  /** Triggered when column resize start.
    */
  var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, scala.Unit]] = js.undefined
  /** Triggered after column resized.
    */
  var resized: js.UndefOr[js.Function1[/* e */ ResizedEventArgs, scala.Unit]] = js.undefined
  /** Triggered when right clicked on grid element.
    */
  var rightClick: js.UndefOr[js.Function1[/* e */ RightClickEventArgs, scala.Unit]] = js.undefined
  /** Triggered every time a request is made to access row information, element and data.
    */
  var rowDataBound: js.UndefOr[js.Function1[/* e */ RowDataBoundEventArgs, scala.Unit]] = js.undefined
  /** Triggered after the row is deselected.
    */
  var rowDeselected: js.UndefOr[js.Function1[/* e */ RowDeselectedEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the row is going to be deselected.
    */
  var rowDeselecting: js.UndefOr[js.Function1[/* e */ RowDeselectingEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the row is being dragged.
    */
  var rowDrag: js.UndefOr[js.Function1[/* e */ RowDragEventArgs, scala.Unit]] = js.undefined
  /** Triggered when row dragging begins.
    */
  var rowDragStart: js.UndefOr[js.Function1[/* e */ RowDragStartEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the row is dropped.
    */
  var rowDrop: js.UndefOr[js.Function1[/* e */ RowDropEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets an object that indicates whether to customize the drag and drop behavior of the grid rows
    */
  var rowDropSettings: js.UndefOr[RowDropSettings] = js.undefined
  /** Triggered while hover the grid row.
    */
  var rowHover: js.UndefOr[js.Function1[/* e */ RowHoverEventArgs, scala.Unit]] = js.undefined
  /** Triggered after the row is selected.
    */
  var rowSelected: js.UndefOr[js.Function1[/* e */ RowSelectedEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the row is going to be selected.
    */
  var rowSelecting: js.UndefOr[js.Function1[/* e */ RowSelectingEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets a value that indicates to render the grid with template rows. The template row must be a table row. That table row must have the JavaScript render binding format
    * ({{:columnName}}) then the grid data source binds the data to the corresponding table row of the template.
    * @Default {null}
    */
  var rowTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets an object that indicates whether to customize the scrolling behavior of the grid.
    */
  var scrollSettings: js.UndefOr[ScrollSettings] = js.undefined
  /** Gets or sets an object that indicates whether to customize the searching behavior of the grid
    */
  var searchSettings: js.UndefOr[SearchSettings] = js.undefined
  /** Gets a value that display the array of selected records in the Grid.
    * @Default {null}
    */
  var selectedRecords: js.UndefOr[js.Array[_]] = js.undefined
  /** Gets or sets a value that indicates to select the row while initializing the grid
    * @Default {-1}
    */
  var selectedRowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets a value that indicates the selected rows in grid
    * @Default {[]}
    */
  var selectedRowIndices: js.UndefOr[js.Array[_]] = js.undefined
  /** This property is used to configure the selection behavior of the grid.
    */
  var selectionSettings: js.UndefOr[SelectionSettings] = js.undefined
  /** The row selection behavior of grid. Accepting types are &quot;single&quot; and &quot;multiple&quot;.
    * @Default {ej.Grid.SelectionType.Single}
    */
  var selectionType: js.UndefOr[SelectionType | java.lang.String] = js.undefined
  /** Default Value:
    * @Default {false}
    */
  var showColumnChooser: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates stacked header should be shown on grid layout when the property â€œstackedHeaderRowsâ€ is set.
    * @Default {false}
    */
  var showStackedHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates summary rows should be shown on grid layout when the property â€œsummaryRowsâ€ is set
    * @Default {false}
    */
  var showSummary: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to customize the sorting behavior of the grid.
    */
  var sortSettings: js.UndefOr[SortSettings] = js.undefined
  /** Gets or sets an object that indicates to managing the collection of stacked header rows for the grid.
    * @Default {[]}
    */
  var stackedHeaderRows: js.UndefOr[js.Array[StackedHeaderRow]] = js.undefined
  /** Gets or sets an object that indicates to managing the collection of summary rows for the grid.
    * @Default {[]}
    */
  var summaryRows: js.UndefOr[js.Array[SummaryRow]] = js.undefined
  /** Triggered when refresh the template column elements in the Grid.
    */
  var templateRefresh: js.UndefOr[js.Function1[/* e */ TemplateRefreshEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets an object that indicates whether to auto wrap the grid header or content or both
    */
  var textWrapSettings: js.UndefOr[TextWrapSettings] = js.undefined
  /** Triggered when toolbar item is clicked in grid.
    */
  var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets an object that indicates whether to enable the toolbar in the grid and add toolbar items
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    actionBegin: js.Function1[/* e */ ActionBeginEventArgs, scala.Unit] = null,
    actionComplete: js.Function1[/* e */ ActionCompleteEventArgs, scala.Unit] = null,
    actionFailure: js.Function1[/* e */ ActionFailureEventArgs, scala.Unit] = null,
    allowCellMerging: js.UndefOr[scala.Boolean] = js.undefined,
    allowFiltering: js.UndefOr[scala.Boolean] = js.undefined,
    allowGrouping: js.UndefOr[scala.Boolean] = js.undefined,
    allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    allowMultiSorting: js.UndefOr[scala.Boolean] = js.undefined,
    allowMultipleExporting: js.UndefOr[scala.Boolean] = js.undefined,
    allowPaging: js.UndefOr[scala.Boolean] = js.undefined,
    allowReordering: js.UndefOr[scala.Boolean] = js.undefined,
    allowResizeToFit: js.UndefOr[scala.Boolean] = js.undefined,
    allowResizing: js.UndefOr[scala.Boolean] = js.undefined,
    allowRowDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined,
    allowScrolling: js.UndefOr[scala.Boolean] = js.undefined,
    allowSearching: js.UndefOr[scala.Boolean] = js.undefined,
    allowSelection: js.UndefOr[scala.Boolean] = js.undefined,
    allowSorting: js.UndefOr[scala.Boolean] = js.undefined,
    allowTextWrap: js.UndefOr[scala.Boolean] = js.undefined,
    batchAdd: js.Function1[/* e */ BatchAddEventArgs, scala.Unit] = null,
    batchDelete: js.Function1[/* e */ BatchDeleteEventArgs, scala.Unit] = null,
    beforeBatchAdd: js.Function1[/* e */ BeforeBatchAddEventArgs, scala.Unit] = null,
    beforeBatchDelete: js.Function1[/* e */ BeforeBatchDeleteEventArgs, scala.Unit] = null,
    beforeBatchSave: js.Function1[/* e */ BeforeBatchSaveEventArgs, scala.Unit] = null,
    beforePrint: js.Function1[/* e */ BeforePrintEventArgs, scala.Unit] = null,
    beforeRowDrop: js.Function1[/* e */ BeforeRowDropEventArgs, scala.Unit] = null,
    beginEdit: js.Function1[/* e */ BeginEditEventArgs, scala.Unit] = null,
    cellDeselected: js.Function1[/* e */ CellDeselectedEventArgs, scala.Unit] = null,
    cellDeselecting: js.Function1[/* e */ CellDeselectingEventArgs, scala.Unit] = null,
    cellEdit: js.Function1[/* e */ CellEditEventArgs, scala.Unit] = null,
    cellSave: js.Function1[/* e */ CellSaveEventArgs, scala.Unit] = null,
    cellSelected: js.Function1[/* e */ CellSelectedEventArgs, scala.Unit] = null,
    cellSelecting: js.Function1[/* e */ CellSelectingEventArgs, scala.Unit] = null,
    childGrid: js.Any = null,
    columnDeselected: js.Function1[/* e */ ColumnDeselectedEventArgs, scala.Unit] = null,
    columnDeselecting: js.Function1[/* e */ ColumnDeselectingEventArgs, scala.Unit] = null,
    columnDrag: js.Function1[/* e */ ColumnDragEventArgs, scala.Unit] = null,
    columnDragStart: js.Function1[/* e */ ColumnDragStartEventArgs, scala.Unit] = null,
    columnDrop: js.Function1[/* e */ ColumnDropEventArgs, scala.Unit] = null,
    columnLayout: ColumnLayout | java.lang.String = null,
    columnSelected: js.Function1[/* e */ ColumnSelectedEventArgs, scala.Unit] = null,
    columnSelecting: js.Function1[/* e */ ColumnSelectingEventArgs, scala.Unit] = null,
    columns: js.Array[Column] = null,
    commonWidth: scala.Int | scala.Double = null,
    contextClick: js.Function1[/* e */ ContextClickEventArgs, scala.Unit] = null,
    contextMenuSettings: ContextMenuSettings = null,
    contextOpen: js.Function1[/* e */ ContextOpenEventArgs, scala.Unit] = null,
    create: js.Function1[/* e */ CreateEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    dataBound: js.Function1[/* e */ DataBoundEventArgs, scala.Unit] = null,
    dataSource: js.Any = null,
    destroy: js.Function1[/* e */ DestroyEventArgs, scala.Unit] = null,
    detailsCollapse: js.Function1[/* e */ DetailsCollapseEventArgs, scala.Unit] = null,
    detailsDataBound: js.Function1[/* e */ DetailsDataBoundEventArgs, scala.Unit] = null,
    detailsExpand: js.Function1[/* e */ DetailsExpandEventArgs, scala.Unit] = null,
    detailsTemplate: java.lang.String = null,
    editSettings: EditSettings = null,
    enableAltRow: js.UndefOr[scala.Boolean] = js.undefined,
    enableAutoSaveOnSelectionChange: js.UndefOr[scala.Boolean] = js.undefined,
    enableHeaderHover: js.UndefOr[scala.Boolean] = js.undefined,
    enablePersistence: js.UndefOr[scala.Boolean] = js.undefined,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enableResponsiveRow: js.UndefOr[scala.Boolean] = js.undefined,
    enableRowHover: js.UndefOr[scala.Boolean] = js.undefined,
    enableToolbarItems: js.UndefOr[scala.Boolean] = js.undefined,
    enableTouch: js.UndefOr[scala.Boolean] = js.undefined,
    endAdd: js.Function1[/* e */ EndAddEventArgs, scala.Unit] = null,
    endDelete: js.Function1[/* e */ EndDeleteEventArgs, scala.Unit] = null,
    endEdit: js.Function1[/* e */ EndEditEventArgs, scala.Unit] = null,
    exportToExcelAction: java.lang.String = null,
    exportToPdfAction: java.lang.String = null,
    exportToWordAction: java.lang.String = null,
    filterSettings: FilterSettings = null,
    gridLines: GridLines | java.lang.String = null,
    groupSettings: GroupSettings = null,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    keySettings: js.Any = null,
    load: js.Function1[/* e */ LoadEventArgs, scala.Unit] = null,
    locale: java.lang.String = null,
    mergeCellInfo: js.Function1[/* e */ MergeCellInfoEventArgs, scala.Unit] = null,
    mergeHeaderCellInfo: js.Function1[/* e */ MergeHeaderCellInfoEventArgs, scala.Unit] = null,
    minWidth: scala.Int | scala.Double = null,
    pageSettings: PageSettings = null,
    query: js.Any = null,
    queryCellInfo: js.Function1[/* e */ QueryCellInfoEventArgs, scala.Unit] = null,
    recordClick: js.Function1[/* e */ RecordClickEventArgs, scala.Unit] = null,
    recordDoubleClick: js.Function1[/* e */ RecordDoubleClickEventArgs, scala.Unit] = null,
    resizeEnd: js.Function1[/* e */ ResizeEndEventArgs, scala.Unit] = null,
    resizeSettings: ResizeSettings = null,
    resizeStart: js.Function1[/* e */ ResizeStartEventArgs, scala.Unit] = null,
    resized: js.Function1[/* e */ ResizedEventArgs, scala.Unit] = null,
    rightClick: js.Function1[/* e */ RightClickEventArgs, scala.Unit] = null,
    rowDataBound: js.Function1[/* e */ RowDataBoundEventArgs, scala.Unit] = null,
    rowDeselected: js.Function1[/* e */ RowDeselectedEventArgs, scala.Unit] = null,
    rowDeselecting: js.Function1[/* e */ RowDeselectingEventArgs, scala.Unit] = null,
    rowDrag: js.Function1[/* e */ RowDragEventArgs, scala.Unit] = null,
    rowDragStart: js.Function1[/* e */ RowDragStartEventArgs, scala.Unit] = null,
    rowDrop: js.Function1[/* e */ RowDropEventArgs, scala.Unit] = null,
    rowDropSettings: RowDropSettings = null,
    rowHover: js.Function1[/* e */ RowHoverEventArgs, scala.Unit] = null,
    rowSelected: js.Function1[/* e */ RowSelectedEventArgs, scala.Unit] = null,
    rowSelecting: js.Function1[/* e */ RowSelectingEventArgs, scala.Unit] = null,
    rowTemplate: java.lang.String = null,
    scrollSettings: ScrollSettings = null,
    searchSettings: SearchSettings = null,
    selectedRecords: js.Array[_] = null,
    selectedRowIndex: scala.Int | scala.Double = null,
    selectedRowIndices: js.Array[_] = null,
    selectionSettings: SelectionSettings = null,
    selectionType: SelectionType | java.lang.String = null,
    showColumnChooser: js.UndefOr[scala.Boolean] = js.undefined,
    showStackedHeader: js.UndefOr[scala.Boolean] = js.undefined,
    showSummary: js.UndefOr[scala.Boolean] = js.undefined,
    sortSettings: SortSettings = null,
    stackedHeaderRows: js.Array[StackedHeaderRow] = null,
    summaryRows: js.Array[SummaryRow] = null,
    templateRefresh: js.Function1[/* e */ TemplateRefreshEventArgs, scala.Unit] = null,
    textWrapSettings: TextWrapSettings = null,
    toolbarClick: js.Function1[/* e */ ToolbarClickEventArgs, scala.Unit] = null,
    toolbarSettings: ToolbarSettings = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionBegin != null) __obj.updateDynamic("actionBegin")(actionBegin)
    if (actionComplete != null) __obj.updateDynamic("actionComplete")(actionComplete)
    if (actionFailure != null) __obj.updateDynamic("actionFailure")(actionFailure)
    if (!js.isUndefined(allowCellMerging)) __obj.updateDynamic("allowCellMerging")(allowCellMerging)
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering)
    if (!js.isUndefined(allowGrouping)) __obj.updateDynamic("allowGrouping")(allowGrouping)
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation)
    if (!js.isUndefined(allowMultiSorting)) __obj.updateDynamic("allowMultiSorting")(allowMultiSorting)
    if (!js.isUndefined(allowMultipleExporting)) __obj.updateDynamic("allowMultipleExporting")(allowMultipleExporting)
    if (!js.isUndefined(allowPaging)) __obj.updateDynamic("allowPaging")(allowPaging)
    if (!js.isUndefined(allowReordering)) __obj.updateDynamic("allowReordering")(allowReordering)
    if (!js.isUndefined(allowResizeToFit)) __obj.updateDynamic("allowResizeToFit")(allowResizeToFit)
    if (!js.isUndefined(allowResizing)) __obj.updateDynamic("allowResizing")(allowResizing)
    if (!js.isUndefined(allowRowDragAndDrop)) __obj.updateDynamic("allowRowDragAndDrop")(allowRowDragAndDrop)
    if (!js.isUndefined(allowScrolling)) __obj.updateDynamic("allowScrolling")(allowScrolling)
    if (!js.isUndefined(allowSearching)) __obj.updateDynamic("allowSearching")(allowSearching)
    if (!js.isUndefined(allowSelection)) __obj.updateDynamic("allowSelection")(allowSelection)
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting)
    if (!js.isUndefined(allowTextWrap)) __obj.updateDynamic("allowTextWrap")(allowTextWrap)
    if (batchAdd != null) __obj.updateDynamic("batchAdd")(batchAdd)
    if (batchDelete != null) __obj.updateDynamic("batchDelete")(batchDelete)
    if (beforeBatchAdd != null) __obj.updateDynamic("beforeBatchAdd")(beforeBatchAdd)
    if (beforeBatchDelete != null) __obj.updateDynamic("beforeBatchDelete")(beforeBatchDelete)
    if (beforeBatchSave != null) __obj.updateDynamic("beforeBatchSave")(beforeBatchSave)
    if (beforePrint != null) __obj.updateDynamic("beforePrint")(beforePrint)
    if (beforeRowDrop != null) __obj.updateDynamic("beforeRowDrop")(beforeRowDrop)
    if (beginEdit != null) __obj.updateDynamic("beginEdit")(beginEdit)
    if (cellDeselected != null) __obj.updateDynamic("cellDeselected")(cellDeselected)
    if (cellDeselecting != null) __obj.updateDynamic("cellDeselecting")(cellDeselecting)
    if (cellEdit != null) __obj.updateDynamic("cellEdit")(cellEdit)
    if (cellSave != null) __obj.updateDynamic("cellSave")(cellSave)
    if (cellSelected != null) __obj.updateDynamic("cellSelected")(cellSelected)
    if (cellSelecting != null) __obj.updateDynamic("cellSelecting")(cellSelecting)
    if (childGrid != null) __obj.updateDynamic("childGrid")(childGrid)
    if (columnDeselected != null) __obj.updateDynamic("columnDeselected")(columnDeselected)
    if (columnDeselecting != null) __obj.updateDynamic("columnDeselecting")(columnDeselecting)
    if (columnDrag != null) __obj.updateDynamic("columnDrag")(columnDrag)
    if (columnDragStart != null) __obj.updateDynamic("columnDragStart")(columnDragStart)
    if (columnDrop != null) __obj.updateDynamic("columnDrop")(columnDrop)
    if (columnLayout != null) __obj.updateDynamic("columnLayout")(columnLayout.asInstanceOf[js.Any])
    if (columnSelected != null) __obj.updateDynamic("columnSelected")(columnSelected)
    if (columnSelecting != null) __obj.updateDynamic("columnSelecting")(columnSelecting)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (commonWidth != null) __obj.updateDynamic("commonWidth")(commonWidth.asInstanceOf[js.Any])
    if (contextClick != null) __obj.updateDynamic("contextClick")(contextClick)
    if (contextMenuSettings != null) __obj.updateDynamic("contextMenuSettings")(contextMenuSettings)
    if (contextOpen != null) __obj.updateDynamic("contextOpen")(contextOpen)
    if (create != null) __obj.updateDynamic("create")(create)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (dataBound != null) __obj.updateDynamic("dataBound")(dataBound)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (detailsCollapse != null) __obj.updateDynamic("detailsCollapse")(detailsCollapse)
    if (detailsDataBound != null) __obj.updateDynamic("detailsDataBound")(detailsDataBound)
    if (detailsExpand != null) __obj.updateDynamic("detailsExpand")(detailsExpand)
    if (detailsTemplate != null) __obj.updateDynamic("detailsTemplate")(detailsTemplate)
    if (editSettings != null) __obj.updateDynamic("editSettings")(editSettings)
    if (!js.isUndefined(enableAltRow)) __obj.updateDynamic("enableAltRow")(enableAltRow)
    if (!js.isUndefined(enableAutoSaveOnSelectionChange)) __obj.updateDynamic("enableAutoSaveOnSelectionChange")(enableAutoSaveOnSelectionChange)
    if (!js.isUndefined(enableHeaderHover)) __obj.updateDynamic("enableHeaderHover")(enableHeaderHover)
    if (!js.isUndefined(enablePersistence)) __obj.updateDynamic("enablePersistence")(enablePersistence)
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enableResponsiveRow)) __obj.updateDynamic("enableResponsiveRow")(enableResponsiveRow)
    if (!js.isUndefined(enableRowHover)) __obj.updateDynamic("enableRowHover")(enableRowHover)
    if (!js.isUndefined(enableToolbarItems)) __obj.updateDynamic("enableToolbarItems")(enableToolbarItems)
    if (!js.isUndefined(enableTouch)) __obj.updateDynamic("enableTouch")(enableTouch)
    if (endAdd != null) __obj.updateDynamic("endAdd")(endAdd)
    if (endDelete != null) __obj.updateDynamic("endDelete")(endDelete)
    if (endEdit != null) __obj.updateDynamic("endEdit")(endEdit)
    if (exportToExcelAction != null) __obj.updateDynamic("exportToExcelAction")(exportToExcelAction)
    if (exportToPdfAction != null) __obj.updateDynamic("exportToPdfAction")(exportToPdfAction)
    if (exportToWordAction != null) __obj.updateDynamic("exportToWordAction")(exportToWordAction)
    if (filterSettings != null) __obj.updateDynamic("filterSettings")(filterSettings)
    if (gridLines != null) __obj.updateDynamic("gridLines")(gridLines.asInstanceOf[js.Any])
    if (groupSettings != null) __obj.updateDynamic("groupSettings")(groupSettings)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (keySettings != null) __obj.updateDynamic("keySettings")(keySettings)
    if (load != null) __obj.updateDynamic("load")(load)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (mergeCellInfo != null) __obj.updateDynamic("mergeCellInfo")(mergeCellInfo)
    if (mergeHeaderCellInfo != null) __obj.updateDynamic("mergeHeaderCellInfo")(mergeHeaderCellInfo)
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (pageSettings != null) __obj.updateDynamic("pageSettings")(pageSettings)
    if (query != null) __obj.updateDynamic("query")(query)
    if (queryCellInfo != null) __obj.updateDynamic("queryCellInfo")(queryCellInfo)
    if (recordClick != null) __obj.updateDynamic("recordClick")(recordClick)
    if (recordDoubleClick != null) __obj.updateDynamic("recordDoubleClick")(recordDoubleClick)
    if (resizeEnd != null) __obj.updateDynamic("resizeEnd")(resizeEnd)
    if (resizeSettings != null) __obj.updateDynamic("resizeSettings")(resizeSettings)
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(resizeStart)
    if (resized != null) __obj.updateDynamic("resized")(resized)
    if (rightClick != null) __obj.updateDynamic("rightClick")(rightClick)
    if (rowDataBound != null) __obj.updateDynamic("rowDataBound")(rowDataBound)
    if (rowDeselected != null) __obj.updateDynamic("rowDeselected")(rowDeselected)
    if (rowDeselecting != null) __obj.updateDynamic("rowDeselecting")(rowDeselecting)
    if (rowDrag != null) __obj.updateDynamic("rowDrag")(rowDrag)
    if (rowDragStart != null) __obj.updateDynamic("rowDragStart")(rowDragStart)
    if (rowDrop != null) __obj.updateDynamic("rowDrop")(rowDrop)
    if (rowDropSettings != null) __obj.updateDynamic("rowDropSettings")(rowDropSettings)
    if (rowHover != null) __obj.updateDynamic("rowHover")(rowHover)
    if (rowSelected != null) __obj.updateDynamic("rowSelected")(rowSelected)
    if (rowSelecting != null) __obj.updateDynamic("rowSelecting")(rowSelecting)
    if (rowTemplate != null) __obj.updateDynamic("rowTemplate")(rowTemplate)
    if (scrollSettings != null) __obj.updateDynamic("scrollSettings")(scrollSettings)
    if (searchSettings != null) __obj.updateDynamic("searchSettings")(searchSettings)
    if (selectedRecords != null) __obj.updateDynamic("selectedRecords")(selectedRecords)
    if (selectedRowIndex != null) __obj.updateDynamic("selectedRowIndex")(selectedRowIndex.asInstanceOf[js.Any])
    if (selectedRowIndices != null) __obj.updateDynamic("selectedRowIndices")(selectedRowIndices)
    if (selectionSettings != null) __obj.updateDynamic("selectionSettings")(selectionSettings)
    if (selectionType != null) __obj.updateDynamic("selectionType")(selectionType.asInstanceOf[js.Any])
    if (!js.isUndefined(showColumnChooser)) __obj.updateDynamic("showColumnChooser")(showColumnChooser)
    if (!js.isUndefined(showStackedHeader)) __obj.updateDynamic("showStackedHeader")(showStackedHeader)
    if (!js.isUndefined(showSummary)) __obj.updateDynamic("showSummary")(showSummary)
    if (sortSettings != null) __obj.updateDynamic("sortSettings")(sortSettings)
    if (stackedHeaderRows != null) __obj.updateDynamic("stackedHeaderRows")(stackedHeaderRows)
    if (summaryRows != null) __obj.updateDynamic("summaryRows")(summaryRows)
    if (templateRefresh != null) __obj.updateDynamic("templateRefresh")(templateRefresh)
    if (textWrapSettings != null) __obj.updateDynamic("textWrapSettings")(textWrapSettings)
    if (toolbarClick != null) __obj.updateDynamic("toolbarClick")(toolbarClick)
    if (toolbarSettings != null) __obj.updateDynamic("toolbarSettings")(toolbarSettings)
    __obj.asInstanceOf[Model]
  }
}

