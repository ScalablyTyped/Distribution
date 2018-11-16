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

