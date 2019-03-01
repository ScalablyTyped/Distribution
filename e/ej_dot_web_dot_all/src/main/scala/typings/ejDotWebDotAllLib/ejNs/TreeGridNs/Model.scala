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

object Model {
  @scala.inline
  def apply(
    actionBegin: js.Function1[/* e */ ActionBeginEventArgs, scala.Unit] = null,
    actionComplete: js.Function1[/* e */ ActionCompleteEventArgs, scala.Unit] = null,
    allowColumnReordering: js.UndefOr[scala.Boolean] = js.undefined,
    allowColumnResize: js.UndefOr[scala.Boolean] = js.undefined,
    allowDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined,
    allowFiltering: js.UndefOr[scala.Boolean] = js.undefined,
    allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    allowMultiSorting: js.UndefOr[scala.Boolean] = js.undefined,
    allowPaging: js.UndefOr[scala.Boolean] = js.undefined,
    allowSearching: js.UndefOr[scala.Boolean] = js.undefined,
    allowSelection: js.UndefOr[scala.Boolean] = js.undefined,
    allowSorting: js.UndefOr[scala.Boolean] = js.undefined,
    allowTextWrap: js.UndefOr[scala.Boolean] = js.undefined,
    altRowTemplateID: java.lang.String = null,
    beforePrint: js.Function1[/* e */ BeforePrintEventArgs, scala.Unit] = null,
    beginEdit: js.Function1[/* e */ BeginEditEventArgs, scala.Unit] = null,
    cellSelected: js.Function1[/* e */ CellSelectedEventArgs, scala.Unit] = null,
    cellSelecting: js.Function1[/* e */ CellSelectingEventArgs, scala.Unit] = null,
    cellTooltipTemplate: java.lang.String = null,
    childMapping: java.lang.String = null,
    collapsed: js.Function1[/* e */ CollapsedEventArgs, scala.Unit] = null,
    collapsibleTotalSummary: js.UndefOr[scala.Boolean] = js.undefined,
    collapsing: js.Function1[/* e */ CollapsingEventArgs, scala.Unit] = null,
    columnDialogFields: js.Array[_] = null,
    columnDrag: js.Function1[/* e */ ColumnDragEventArgs, scala.Unit] = null,
    columnDragStart: js.Function1[/* e */ ColumnDragStartEventArgs, scala.Unit] = null,
    columnDrop: js.Function1[/* e */ ColumnDropEventArgs, scala.Unit] = null,
    columnResizeEnd: js.Function1[/* e */ ColumnResizeEndEventArgs, scala.Unit] = null,
    columnResizeSettings: ColumnResizeSettings = null,
    columnResizeStart: js.Function1[/* e */ ColumnResizeStartEventArgs, scala.Unit] = null,
    columnResized: js.Function1[/* e */ ColumnResizedEventArgs, scala.Unit] = null,
    columns: js.Array[Column] = null,
    commonWidth: scala.Int | scala.Double = null,
    contextMenuOpen: js.Function1[/* e */ ContextMenuOpenEventArgs, scala.Unit] = null,
    contextMenuSettings: ContextMenuSettings = null,
    create: js.Function1[/* e */ CreateEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    dataSource: js.Array[_] = null,
    detailsDataBound: js.Function1[/* e */ DetailsDataBoundEventArgs, scala.Unit] = null,
    detailsHidden: js.Function1[/* e */ DetailsHiddenEventArgs, scala.Unit] = null,
    detailsRowHeight: scala.Int | scala.Double = null,
    detailsShown: js.Function1[/* e */ DetailsShownEventArgs, scala.Unit] = null,
    detailsTemplate: java.lang.String = null,
    dragTooltip: DragTooltip = null,
    editSettings: EditSettings = null,
    enableAltRow: js.UndefOr[scala.Boolean] = js.undefined,
    enableCollapseAll: js.UndefOr[scala.Boolean] = js.undefined,
    enableLoadOnDemand: js.UndefOr[scala.Boolean] = js.undefined,
    enableResize: js.UndefOr[scala.Boolean] = js.undefined,
    enableVirtualization: js.UndefOr[scala.Boolean] = js.undefined,
    endEdit: js.Function1[/* e */ EndEditEventArgs, scala.Unit] = null,
    expandStateMapping: java.lang.String = null,
    expanded: js.Function1[/* e */ ExpandedEventArgs, scala.Unit] = null,
    expanding: js.Function1[/* e */ ExpandingEventArgs, scala.Unit] = null,
    filterSettings: FilterSettings = null,
    headerTextOverflow: HeaderTextOverflow | java.lang.String = null,
    idMapping: java.lang.String = null,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    load: js.Function1[/* e */ LoadEventArgs, scala.Unit] = null,
    locale: java.lang.String = null,
    pageSettings: PageSettings = null,
    parentIdMapping: java.lang.String = null,
    parseRowTemplate: js.UndefOr[scala.Boolean] = js.undefined,
    query: js.Any = null,
    queryCellInfo: js.Function1[/* e */ QueryCellInfoEventArgs, scala.Unit] = null,
    recordClick: js.Function1[/* e */ RecordClickEventArgs, scala.Unit] = null,
    recordDoubleClick: js.Function1[/* e */ RecordDoubleClickEventArgs, scala.Unit] = null,
    rowDataBound: js.Function1[/* e */ RowDataBoundEventArgs, scala.Unit] = null,
    rowDrag: js.Function1[/* e */ RowDragEventArgs, scala.Unit] = null,
    rowDragStart: js.Function1[/* e */ RowDragStartEventArgs, scala.Unit] = null,
    rowDragStop: js.Function1[/* e */ RowDragStopEventArgs, scala.Unit] = null,
    rowDropActionBegin: js.Function1[/* e */ RowDropActionBeginEventArgs, scala.Unit] = null,
    rowHeight: scala.Int | scala.Double = null,
    rowSelected: js.Function1[/* e */ RowSelectedEventArgs, scala.Unit] = null,
    rowSelecting: js.Function1[/* e */ RowSelectingEventArgs, scala.Unit] = null,
    rowTemplateID: java.lang.String = null,
    searchSettings: SearchSettings = null,
    selectedCellIndexes: js.Array[SelectedCellIndex] = null,
    selectedRowIndex: scala.Int | scala.Double = null,
    selectionSettings: SelectionSettings = null,
    showColumnChooser: js.UndefOr[scala.Boolean] = js.undefined,
    showColumnOptions: js.UndefOr[scala.Boolean] = js.undefined,
    showDetailsRow: js.UndefOr[scala.Boolean] = js.undefined,
    showDetailsRowInfoColumn: js.UndefOr[scala.Boolean] = js.undefined,
    showGridCellTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    showGridExpandCellTooltip: js.UndefOr[scala.Boolean] = js.undefined,
    showStackedHeader: js.UndefOr[scala.Boolean] = js.undefined,
    showSummaryRow: js.UndefOr[scala.Boolean] = js.undefined,
    showTotalSummary: js.UndefOr[scala.Boolean] = js.undefined,
    sizeSettings: SizeSettings = null,
    sortSettings: SortSettings = null,
    stackedHeaderRows: js.Array[StackedHeaderRow] = null,
    summaryRows: js.Array[SummaryRow] = null,
    toolbarClick: js.Function1[/* e */ ToolbarClickEventArgs, scala.Unit] = null,
    toolbarSettings: ToolbarSettings = null,
    totalSummaryHeight: scala.Int | scala.Double = null,
    treeColumnIndex: scala.Int | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionBegin != null) __obj.updateDynamic("actionBegin")(actionBegin)
    if (actionComplete != null) __obj.updateDynamic("actionComplete")(actionComplete)
    if (!js.isUndefined(allowColumnReordering)) __obj.updateDynamic("allowColumnReordering")(allowColumnReordering)
    if (!js.isUndefined(allowColumnResize)) __obj.updateDynamic("allowColumnResize")(allowColumnResize)
    if (!js.isUndefined(allowDragAndDrop)) __obj.updateDynamic("allowDragAndDrop")(allowDragAndDrop)
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering)
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation)
    if (!js.isUndefined(allowMultiSorting)) __obj.updateDynamic("allowMultiSorting")(allowMultiSorting)
    if (!js.isUndefined(allowPaging)) __obj.updateDynamic("allowPaging")(allowPaging)
    if (!js.isUndefined(allowSearching)) __obj.updateDynamic("allowSearching")(allowSearching)
    if (!js.isUndefined(allowSelection)) __obj.updateDynamic("allowSelection")(allowSelection)
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting)
    if (!js.isUndefined(allowTextWrap)) __obj.updateDynamic("allowTextWrap")(allowTextWrap)
    if (altRowTemplateID != null) __obj.updateDynamic("altRowTemplateID")(altRowTemplateID)
    if (beforePrint != null) __obj.updateDynamic("beforePrint")(beforePrint)
    if (beginEdit != null) __obj.updateDynamic("beginEdit")(beginEdit)
    if (cellSelected != null) __obj.updateDynamic("cellSelected")(cellSelected)
    if (cellSelecting != null) __obj.updateDynamic("cellSelecting")(cellSelecting)
    if (cellTooltipTemplate != null) __obj.updateDynamic("cellTooltipTemplate")(cellTooltipTemplate)
    if (childMapping != null) __obj.updateDynamic("childMapping")(childMapping)
    if (collapsed != null) __obj.updateDynamic("collapsed")(collapsed)
    if (!js.isUndefined(collapsibleTotalSummary)) __obj.updateDynamic("collapsibleTotalSummary")(collapsibleTotalSummary)
    if (collapsing != null) __obj.updateDynamic("collapsing")(collapsing)
    if (columnDialogFields != null) __obj.updateDynamic("columnDialogFields")(columnDialogFields)
    if (columnDrag != null) __obj.updateDynamic("columnDrag")(columnDrag)
    if (columnDragStart != null) __obj.updateDynamic("columnDragStart")(columnDragStart)
    if (columnDrop != null) __obj.updateDynamic("columnDrop")(columnDrop)
    if (columnResizeEnd != null) __obj.updateDynamic("columnResizeEnd")(columnResizeEnd)
    if (columnResizeSettings != null) __obj.updateDynamic("columnResizeSettings")(columnResizeSettings)
    if (columnResizeStart != null) __obj.updateDynamic("columnResizeStart")(columnResizeStart)
    if (columnResized != null) __obj.updateDynamic("columnResized")(columnResized)
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (commonWidth != null) __obj.updateDynamic("commonWidth")(commonWidth.asInstanceOf[js.Any])
    if (contextMenuOpen != null) __obj.updateDynamic("contextMenuOpen")(contextMenuOpen)
    if (contextMenuSettings != null) __obj.updateDynamic("contextMenuSettings")(contextMenuSettings)
    if (create != null) __obj.updateDynamic("create")(create)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (detailsDataBound != null) __obj.updateDynamic("detailsDataBound")(detailsDataBound)
    if (detailsHidden != null) __obj.updateDynamic("detailsHidden")(detailsHidden)
    if (detailsRowHeight != null) __obj.updateDynamic("detailsRowHeight")(detailsRowHeight.asInstanceOf[js.Any])
    if (detailsShown != null) __obj.updateDynamic("detailsShown")(detailsShown)
    if (detailsTemplate != null) __obj.updateDynamic("detailsTemplate")(detailsTemplate)
    if (dragTooltip != null) __obj.updateDynamic("dragTooltip")(dragTooltip)
    if (editSettings != null) __obj.updateDynamic("editSettings")(editSettings)
    if (!js.isUndefined(enableAltRow)) __obj.updateDynamic("enableAltRow")(enableAltRow)
    if (!js.isUndefined(enableCollapseAll)) __obj.updateDynamic("enableCollapseAll")(enableCollapseAll)
    if (!js.isUndefined(enableLoadOnDemand)) __obj.updateDynamic("enableLoadOnDemand")(enableLoadOnDemand)
    if (!js.isUndefined(enableResize)) __obj.updateDynamic("enableResize")(enableResize)
    if (!js.isUndefined(enableVirtualization)) __obj.updateDynamic("enableVirtualization")(enableVirtualization)
    if (endEdit != null) __obj.updateDynamic("endEdit")(endEdit)
    if (expandStateMapping != null) __obj.updateDynamic("expandStateMapping")(expandStateMapping)
    if (expanded != null) __obj.updateDynamic("expanded")(expanded)
    if (expanding != null) __obj.updateDynamic("expanding")(expanding)
    if (filterSettings != null) __obj.updateDynamic("filterSettings")(filterSettings)
    if (headerTextOverflow != null) __obj.updateDynamic("headerTextOverflow")(headerTextOverflow.asInstanceOf[js.Any])
    if (idMapping != null) __obj.updateDynamic("idMapping")(idMapping)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (load != null) __obj.updateDynamic("load")(load)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (pageSettings != null) __obj.updateDynamic("pageSettings")(pageSettings)
    if (parentIdMapping != null) __obj.updateDynamic("parentIdMapping")(parentIdMapping)
    if (!js.isUndefined(parseRowTemplate)) __obj.updateDynamic("parseRowTemplate")(parseRowTemplate)
    if (query != null) __obj.updateDynamic("query")(query)
    if (queryCellInfo != null) __obj.updateDynamic("queryCellInfo")(queryCellInfo)
    if (recordClick != null) __obj.updateDynamic("recordClick")(recordClick)
    if (recordDoubleClick != null) __obj.updateDynamic("recordDoubleClick")(recordDoubleClick)
    if (rowDataBound != null) __obj.updateDynamic("rowDataBound")(rowDataBound)
    if (rowDrag != null) __obj.updateDynamic("rowDrag")(rowDrag)
    if (rowDragStart != null) __obj.updateDynamic("rowDragStart")(rowDragStart)
    if (rowDragStop != null) __obj.updateDynamic("rowDragStop")(rowDragStop)
    if (rowDropActionBegin != null) __obj.updateDynamic("rowDropActionBegin")(rowDropActionBegin)
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowSelected != null) __obj.updateDynamic("rowSelected")(rowSelected)
    if (rowSelecting != null) __obj.updateDynamic("rowSelecting")(rowSelecting)
    if (rowTemplateID != null) __obj.updateDynamic("rowTemplateID")(rowTemplateID)
    if (searchSettings != null) __obj.updateDynamic("searchSettings")(searchSettings)
    if (selectedCellIndexes != null) __obj.updateDynamic("selectedCellIndexes")(selectedCellIndexes)
    if (selectedRowIndex != null) __obj.updateDynamic("selectedRowIndex")(selectedRowIndex.asInstanceOf[js.Any])
    if (selectionSettings != null) __obj.updateDynamic("selectionSettings")(selectionSettings)
    if (!js.isUndefined(showColumnChooser)) __obj.updateDynamic("showColumnChooser")(showColumnChooser)
    if (!js.isUndefined(showColumnOptions)) __obj.updateDynamic("showColumnOptions")(showColumnOptions)
    if (!js.isUndefined(showDetailsRow)) __obj.updateDynamic("showDetailsRow")(showDetailsRow)
    if (!js.isUndefined(showDetailsRowInfoColumn)) __obj.updateDynamic("showDetailsRowInfoColumn")(showDetailsRowInfoColumn)
    if (!js.isUndefined(showGridCellTooltip)) __obj.updateDynamic("showGridCellTooltip")(showGridCellTooltip)
    if (!js.isUndefined(showGridExpandCellTooltip)) __obj.updateDynamic("showGridExpandCellTooltip")(showGridExpandCellTooltip)
    if (!js.isUndefined(showStackedHeader)) __obj.updateDynamic("showStackedHeader")(showStackedHeader)
    if (!js.isUndefined(showSummaryRow)) __obj.updateDynamic("showSummaryRow")(showSummaryRow)
    if (!js.isUndefined(showTotalSummary)) __obj.updateDynamic("showTotalSummary")(showTotalSummary)
    if (sizeSettings != null) __obj.updateDynamic("sizeSettings")(sizeSettings)
    if (sortSettings != null) __obj.updateDynamic("sortSettings")(sortSettings)
    if (stackedHeaderRows != null) __obj.updateDynamic("stackedHeaderRows")(stackedHeaderRows)
    if (summaryRows != null) __obj.updateDynamic("summaryRows")(summaryRows)
    if (toolbarClick != null) __obj.updateDynamic("toolbarClick")(toolbarClick)
    if (toolbarSettings != null) __obj.updateDynamic("toolbarSettings")(toolbarSettings)
    if (totalSummaryHeight != null) __obj.updateDynamic("totalSummaryHeight")(totalSummaryHeight.asInstanceOf[js.Any])
    if (treeColumnIndex != null) __obj.updateDynamic("treeColumnIndex")(treeColumnIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

