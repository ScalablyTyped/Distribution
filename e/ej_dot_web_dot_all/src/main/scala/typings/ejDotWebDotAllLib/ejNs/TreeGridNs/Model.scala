package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Model extends js.Object {
  /** Triggered before every success event of TreeGrid action.
               */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, scala.Unit]] = js.undefined
  /** Triggered for every TreeGrid action success event.
               */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, scala.Unit]] = js.undefined
  /** Enables or disables the option for column reordering
               * @Default {false}
               */
  var allowColumnReordering: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the ability to resize the column width interactively.
               * @Default {false}
               */
  var allowColumnResize: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the ability to drag and drop the row interactively to reorder the rows.
               * @Default {false}
               */
  var allowDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the ability to filter the data on all the columns. Enabling this property will display a row with editor controls corresponding to each column. You can
               * restrict filtering on particular column by disabling this property directly on that column instance itself.
               * @Default {false}
               */
  var allowFiltering: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables keyboard navigation.
               * @Default {true}
               */
  var allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the ability to sort the rows based on multiple columns/fields by clicking on each column header. Rows will be sorted recursively on clicking the column headers.
               * @Default {false}
               */
  var allowMultiSorting: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables pagination of rows in TreeGrid
               * @Default {false}
               */
  var allowPaging: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the toolbar searching in TreeGrid.
               * @Default {false}
               */
  var allowSearching: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the ability to select a row interactively.
               * @Default {true}
               */
  var allowSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the ability to sort the rows based on a single field/column by clicking on that column header. When enabled, rows can be sorted only by single field/column.
               * @Default {false}
               */
  var allowSorting: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether the Content will wrap to the next line if the content exceeds the boundary of the Column Cells.
               * @Default {false}
               */
  var allowTextWrap: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the id of the template that has to be applied for alternate rows.
               */
  var altRowTemplateID: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered before the printing initiated in TreeGrid.
               */
  var beforePrint: js.UndefOr[js.Function1[/* e */ BeforePrintEventArgs, scala.Unit]] = js.undefined
  /** Triggered while enter the edit mode in the TreeGrid cell
               */
  var beginEdit: js.UndefOr[js.Function1[/* e */ BeginEditEventArgs, scala.Unit]] = js.undefined
  /** Triggered after selected a cell
               */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, scala.Unit]] = js.undefined
  /** Triggered before selecting a cell
               */
  var cellSelecting: js.UndefOr[js.Function1[/* e */ CellSelectingEventArgs, scala.Unit]] = js.undefined
  /** Specifies the template for cell tooltip
               * @Default {null}
               */
  var cellTooltipTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the mapping property path for sub tasks in datasource
               */
  var childMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered after collapsed the TreeGrid record
               */
  var collapsed: js.UndefOr[js.Function1[/* e */ CollapsedEventArgs, scala.Unit]] = js.undefined
  /** Enables or disables the expandable/collapsible footer summary row. By default expander icon for footer summary will be rendered in first column of first summary row.
               * @Default {false}
               */
  var collapsibleTotalSummary: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggered while collapsing the TreeGrid record
               */
  var collapsing: js.UndefOr[js.Function1[/* e */ CollapsingEventArgs, scala.Unit]] = js.undefined
  /** To Specify the column fields to be displayed in the dialog while inserting a column using column menu.
               * @Default {[]}
               */
  var columnDialogFields: js.UndefOr[js.Array[_]] = js.undefined
  /** Triggered while dragging a column
               */
  var columnDrag: js.UndefOr[js.Function1[/* e */ ColumnDragEventArgs, scala.Unit]] = js.undefined
  /** Triggered  when you start to drag a column
               */
  var columnDragStart: js.UndefOr[js.Function1[/* e */ ColumnDragStartEventArgs, scala.Unit]] = js.undefined
  /** Triggered when a column is dropped
               */
  var columnDrop: js.UndefOr[js.Function1[/* e */ ColumnDropEventArgs, scala.Unit]] = js.undefined
  /** Triggered when a column has been resized
               */
  var columnResizeEnd: js.UndefOr[js.Function1[/* e */ ColumnResizeEndEventArgs, scala.Unit]] = js.undefined
  /** Specifies the settings for column resize
               */
  var columnResizeSettings: js.UndefOr[ColumnResizeSettings] = js.undefined
  /** Triggered while start to resize a column
               */
  var columnResizeStart: js.UndefOr[js.Function1[/* e */ ColumnResizeStartEventArgs, scala.Unit]] = js.undefined
  /** Triggered after a column resized
               */
  var columnResized: js.UndefOr[js.Function1[/* e */ ColumnResizedEventArgs, scala.Unit]] = js.undefined
  /** Option for adding columns; each column has the option to bind to a field in the dataSource.
               */
  var columns: js.UndefOr[js.Array[Column]] = js.undefined
  /** Defines the common width for all the columns in TreeGrid
               * @Default {150}
               */
  var commonWidth: js.UndefOr[scala.Double] = js.undefined
  /** Triggered while Context Menu is rendered in TreeGrid control
               */
  var contextMenuOpen: js.UndefOr[js.Function1[/* e */ ContextMenuOpenEventArgs, scala.Unit]] = js.undefined
  /** Options for displaying and customizing context menu items.
               */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
  /** Triggered when TreeGrid is rendered completely
               */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Specify the CSS class for TreeGrid to achieve custom theme.
               */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies hierarchical or self-referential data to populate the TreeGrid.
               * @Default {null}
               */
  var dataSource: js.UndefOr[js.Array[_]] = js.undefined
  /** Triggered while rendering details template in TreeGrid
               */
  var detailsDataBound: js.UndefOr[js.Function1[/* e */ DetailsDataBoundEventArgs, scala.Unit]] = js.undefined
  /** Triggered when details template pop-up is hidden.
               */
  var detailsHidden: js.UndefOr[js.Function1[/* e */ DetailsHiddenEventArgs, scala.Unit]] = js.undefined
  /** Specifies the row height of the details view
               * @Default {100}
               */
  var detailsRowHeight: js.UndefOr[scala.Double] = js.undefined
  /** Triggered when details template pop-up is shown.
               */
  var detailsShown: js.UndefOr[js.Function1[/* e */ DetailsShownEventArgs, scala.Unit]] = js.undefined
  /** Specifies the template for details view
               */
  var detailsTemplate: js.UndefOr[java.lang.String] = js.undefined
  /** Options for displaying and customizing the tooltip. This tooltip will show the preview of the row that is being dragged.
               */
  var dragTooltip: js.UndefOr[DragTooltip] = js.undefined
  /** Options for enabling and configuring the editing related operations.
               */
  var editSettings: js.UndefOr[EditSettings] = js.undefined
  /** Specifies whether to render alternate rows in different background colors.
               * @Default {true}
               */
  var enableAltRow: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to load all the rows in collapsed state when the TreeGrid is rendered for the first time.
               * @Default {false}
               */
  var enableCollapseAll: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable load on demand approach, for rendering child records and page records.
               * @Default {false}
               */
  var enableLoadOnDemand: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to resize TreeGrid whenever window size changes.
               * @Default {false}
               */
  var enableResize: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to render only the visual elements that are visible in the UI. When you enable this property, it will reduce the loading time for loading large number of records.
               * @Default {false}
               */
  var enableVirtualization: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggered after saved the modified cellValue in TreeGrid
               */
  var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, scala.Unit]] = js.undefined
  /** Specifies the mapping property path for the expand status of a record in data source.
               */
  var expandStateMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered after expand the record
               */
  var expanded: js.UndefOr[js.Function1[/* e */ ExpandedEventArgs, scala.Unit]] = js.undefined
  /** Triggered while expanding the TreeGrid record
               */
  var expanding: js.UndefOr[js.Function1[/* e */ ExpandingEventArgs, scala.Unit]] = js.undefined
  /** Options for filtering and customizing filter actions.
               */
  var filterSettings: js.UndefOr[FilterSettings] = js.undefined
  /** Specifies whether to wrap the header text when it is overflown i.e., when it exceeds the header width.
               * @Default {ej.TreeGrid.HeaderTextOverflow.None}
               */
  var headerTextOverflow: js.UndefOr[HeaderTextOverflow | java.lang.String] = js.undefined
  /** Specifies the name of the field in the dataSource, which contains the id of that row.
               */
  var idMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Enables or disables the responsiveness of TreeGrid
               * @Default {false}
               */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggered while Treegrid is loaded
               */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Specifies the localization information to customize the User Interface (UI) to support regional language and culture
               * @Default {en-US}
               */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the options for customizing the pager.
               */
  var pageSettings: js.UndefOr[PageSettings] = js.undefined
  /** Specifies the name of the field in the dataSource, which contains the parent's id. This is necessary to form a parent-child hierarchy, if the dataSource contains self-referential
               * data.
               */
  var parentIdMapping: js.UndefOr[java.lang.String] = js.undefined
  /** Enables or disables internal parsing of a row. When disabled this property, row will be displayed using the defined template without any internal event bindings.
               * @Default {true}
               */
  var parseRowTemplate: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies ej.Query to select data from the dataSource. This property is applicable only when the dataSource is ej.DataManager.
               * @Default {null}
               */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Triggered while rendering each cell in the TreeGrid
               */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, scala.Unit]] = js.undefined
  /** Triggered while clicking a row, even when allowSelection property is disabled.
               */
  var recordClick: js.UndefOr[js.Function1[/* e */ RecordClickEventArgs, scala.Unit]] = js.undefined
  /** Triggered during record double click action, even when allowSelection property is disabled.
               */
  var recordDoubleClick: js.UndefOr[js.Function1[/* e */ RecordDoubleClickEventArgs, scala.Unit]] = js.undefined
  /** Triggered while rendering each row
               */
  var rowDataBound: js.UndefOr[js.Function1[/* e */ RowDataBoundEventArgs, scala.Unit]] = js.undefined
  /** Triggered while dragging a row in TreeGrid control
               */
  var rowDrag: js.UndefOr[js.Function1[/* e */ RowDragEventArgs, scala.Unit]] = js.undefined
  /** Triggered while start to drag row in TreeGrid control
               */
  var rowDragStart: js.UndefOr[js.Function1[/* e */ RowDragStartEventArgs, scala.Unit]] = js.undefined
  /** Triggered while drop a row in TreeGrid control
               */
  var rowDragStop: js.UndefOr[js.Function1[/* e */ RowDragStopEventArgs, scala.Unit]] = js.undefined
  /** Triggered before row drop action begins.
               */
  var rowDropActionBegin: js.UndefOr[js.Function1[/* e */ RowDropActionBeginEventArgs, scala.Unit]] = js.undefined
  /** Specifies the height of a single row in tree grid. Also, we need to set same height in the CSS style with class name e-rowcell.
               * @Default {30}
               */
  var rowHeight: js.UndefOr[scala.Double] = js.undefined
  /** Triggered after the row is selected.
               */
  var rowSelected: js.UndefOr[js.Function1[/* e */ RowSelectedEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the row is going to be selected.
               */
  var rowSelecting: js.UndefOr[js.Function1[/* e */ RowSelectingEventArgs, scala.Unit]] = js.undefined
  /** Specifies the id of the template to be applied for all the rows.
               */
  var rowTemplateID: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the toolbar searching customizations.
               */
  var searchSettings: js.UndefOr[SearchSettings] = js.undefined
  /** Specifies the selected cell information on rendering TreeGrid.
               */
  var selectedCellIndexes: js.UndefOr[js.Array[SelectedCellIndex]] = js.undefined
  /** Specifies the index of the selected row.
               * @Default {-1}
               */
  var selectedRowIndex: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the settings for row and cell selection.
               */
  var selectionSettings: js.UndefOr[SelectionSettings] = js.undefined
  /** Controls the visibility of the menu button, which is displayed on the column header. Clicking on this button will show a popup menu. When you choose Columns item from this popup,
               * a list box with column names will be shown, from which you can select/deselect a column name to control the visibility of the respective columns.
               * @Default {false}
               */
  var showColumnChooser: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables/disables the options for inserting , deleting and renaming  columns.
               * @Default {false}
               */
  var showColumnOptions: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the visibility of details view
               * @Default {false}
               */
  var showDetailsRow: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the visibility of the expander column which is used to expand or collapse the details view
               * @Default {false}
               */
  var showDetailsRowInfoColumn: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to show tooltip when mouse is hovered on the cell.
               * @Default {true}
               */
  var showGridCellTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies whether to show tooltip for the cells, which has expander button.
               * @Default {true}
               */
  var showGridExpandCellTooltip: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates stacked header should be shown on TreeGrid layout when the property â€œstackedHeaderRowsâ€ is set.
               * @Default {false}
               */
  var showStackedHeader: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the visibility of summary row
               * @Default {false}
               */
  var showSummaryRow: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the visibility of total summary row for the corresponding summary column
               * @Default {false}
               */
  var showTotalSummary: js.UndefOr[scala.Boolean] = js.undefined
  /** Options for setting width and height for TreeGrid.
               */
  var sizeSettings: js.UndefOr[SizeSettings] = js.undefined
  /** Options for sorting the rows.
               */
  var sortSettings: js.UndefOr[SortSettings] = js.undefined
  /** Gets or sets an object that indicates to managing the collection of stacked header rows for the TreeGrid.
               * @Default {[]}
               */
  var stackedHeaderRows: js.UndefOr[js.Array[StackedHeaderRow]] = js.undefined
  /** Specifies the summary row collection object to be displayed
               * @Default {[]}
               */
  var summaryRows: js.UndefOr[js.Array[SummaryRow]] = js.undefined
  /** Triggered when toolbar item is clicked in TreeGrid.
               */
  var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, scala.Unit]] = js.undefined
  /** Options for displaying and customizing the toolbar items.
               */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
  /** Specifies the height of footer summary container.
               * @Default {90}
               */
  var totalSummaryHeight: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the index of the column that needs to have the expander button. By default, cells in the first column contain the expander button.
               * @Default {0}
               */
  var treeColumnIndex: js.UndefOr[scala.Double] = js.undefined
}

