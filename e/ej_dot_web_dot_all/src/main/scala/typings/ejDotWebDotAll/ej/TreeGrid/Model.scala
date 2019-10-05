package typings.ejDotWebDotAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggered before every success event of TreeGrid action.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
  /** Triggered for every TreeGrid action success event.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.undefined
  /** Enables or disables the option for column reordering
    * @Default {false}
    */
  var allowColumnReordering: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the ability to resize the column width interactively.
    * @Default {false}
    */
  var allowColumnResize: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the ability to drag and drop the row interactively to reorder the rows.
    * @Default {false}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the ability to filter the data on all the columns. Enabling this property will display a row with editor controls corresponding to each column. You can
    * restrict filtering on particular column by disabling this property directly on that column instance itself.
    * @Default {false}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables keyboard navigation.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the ability to sort the rows based on multiple columns/fields by clicking on each column header. Rows will be sorted recursively on clicking the column headers.
    * @Default {false}
    */
  var allowMultiSorting: js.UndefOr[Boolean] = js.undefined
  /** Enables/disables pagination of rows in TreeGrid
    * @Default {false}
    */
  var allowPaging: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the toolbar searching in TreeGrid.
    * @Default {false}
    */
  var allowSearching: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the ability to select a row interactively.
    * @Default {true}
    */
  var allowSelection: js.UndefOr[Boolean] = js.undefined
  /** Enables or disables the ability to sort the rows based on a single field/column by clicking on that column header. When enabled, rows can be sorted only by single field/column.
    * @Default {false}
    */
  var allowSorting: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether the Content will wrap to the next line if the content exceeds the boundary of the Column Cells.
    * @Default {false}
    */
  var allowTextWrap: js.UndefOr[Boolean] = js.undefined
  /** Specifies the id of the template that has to be applied for alternate rows.
    */
  var altRowTemplateID: js.UndefOr[String] = js.undefined
  /** Triggered before the printing initiated in TreeGrid.
    */
  var beforePrint: js.UndefOr[js.Function1[/* e */ BeforePrintEventArgs, Unit]] = js.undefined
  /** Triggered while enter the edit mode in the TreeGrid cell
    */
  var beginEdit: js.UndefOr[js.Function1[/* e */ BeginEditEventArgs, Unit]] = js.undefined
  /** Triggered after selected a cell
    */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, Unit]] = js.undefined
  /** Triggered before selecting a cell
    */
  var cellSelecting: js.UndefOr[js.Function1[/* e */ CellSelectingEventArgs, Unit]] = js.undefined
  /** Specifies the template for cell tooltip
    * @Default {null}
    */
  var cellTooltipTemplate: js.UndefOr[String] = js.undefined
  /** Specifies the mapping property path for sub tasks in datasource
    */
  var childMapping: js.UndefOr[String] = js.undefined
  /** Triggered after collapsed the TreeGrid record
    */
  var collapsed: js.UndefOr[js.Function1[/* e */ CollapsedEventArgs, Unit]] = js.undefined
  /** Enables or disables the expandable/collapsible footer summary row. By default expander icon for footer summary will be rendered in first column of first summary row.
    * @Default {false}
    */
  var collapsibleTotalSummary: js.UndefOr[Boolean] = js.undefined
  /** Triggered while collapsing the TreeGrid record
    */
  var collapsing: js.UndefOr[js.Function1[/* e */ CollapsingEventArgs, Unit]] = js.undefined
  /** To Specify the column fields to be displayed in the dialog while inserting a column using column menu.
    * @Default {[]}
    */
  var columnDialogFields: js.UndefOr[js.Array[_]] = js.undefined
  /** Triggered while dragging a column
    */
  var columnDrag: js.UndefOr[js.Function1[/* e */ ColumnDragEventArgs, Unit]] = js.undefined
  /** Triggered  when you start to drag a column
    */
  var columnDragStart: js.UndefOr[js.Function1[/* e */ ColumnDragStartEventArgs, Unit]] = js.undefined
  /** Triggered when a column is dropped
    */
  var columnDrop: js.UndefOr[js.Function1[/* e */ ColumnDropEventArgs, Unit]] = js.undefined
  /** Triggered when a column has been resized
    */
  var columnResizeEnd: js.UndefOr[js.Function1[/* e */ ColumnResizeEndEventArgs, Unit]] = js.undefined
  /** Specifies the settings for column resize
    */
  var columnResizeSettings: js.UndefOr[ColumnResizeSettings] = js.undefined
  /** Triggered while start to resize a column
    */
  var columnResizeStart: js.UndefOr[js.Function1[/* e */ ColumnResizeStartEventArgs, Unit]] = js.undefined
  /** Triggered after a column resized
    */
  var columnResized: js.UndefOr[js.Function1[/* e */ ColumnResizedEventArgs, Unit]] = js.undefined
  /** Option for adding columns; each column has the option to bind to a field in the dataSource.
    */
  var columns: js.UndefOr[js.Array[Column]] = js.undefined
  /** Defines the common width for all the columns in TreeGrid
    * @Default {150}
    */
  var commonWidth: js.UndefOr[Double] = js.undefined
  /** Triggered while Context Menu is rendered in TreeGrid control
    */
  var contextMenuOpen: js.UndefOr[js.Function1[/* e */ ContextMenuOpenEventArgs, Unit]] = js.undefined
  /** Options for displaying and customizing context menu items.
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.undefined
  /** Triggered when TreeGrid is rendered completely
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Specify the CSS class for TreeGrid to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Specifies hierarchical or self-referential data to populate the TreeGrid.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Array[_]] = js.undefined
  /** Triggered while rendering details template in TreeGrid
    */
  var detailsDataBound: js.UndefOr[js.Function1[/* e */ DetailsDataBoundEventArgs, Unit]] = js.undefined
  /** Triggered when details template pop-up is hidden.
    */
  var detailsHidden: js.UndefOr[js.Function1[/* e */ DetailsHiddenEventArgs, Unit]] = js.undefined
  /** Specifies the row height of the details view
    * @Default {100}
    */
  var detailsRowHeight: js.UndefOr[Double] = js.undefined
  /** Triggered when details template pop-up is shown.
    */
  var detailsShown: js.UndefOr[js.Function1[/* e */ DetailsShownEventArgs, Unit]] = js.undefined
  /** Specifies the template for details view
    */
  var detailsTemplate: js.UndefOr[String] = js.undefined
  /** Options for displaying and customizing the tooltip. This tooltip will show the preview of the row that is being dragged.
    */
  var dragTooltip: js.UndefOr[DragTooltip] = js.undefined
  /** Options for enabling and configuring the editing related operations.
    */
  var editSettings: js.UndefOr[EditSettings] = js.undefined
  /** Specifies whether to render alternate rows in different background colors.
    * @Default {true}
    */
  var enableAltRow: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to load all the rows in collapsed state when the TreeGrid is rendered for the first time.
    * @Default {false}
    */
  var enableCollapseAll: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable load on demand approach, for rendering child records and page records.
    * @Default {false}
    */
  var enableLoadOnDemand: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to resize TreeGrid whenever window size changes.
    * @Default {false}
    */
  var enableResize: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to render only the visual elements that are visible in the UI. When you enable this property, it will reduce the loading time for loading large number of records.
    * @Default {false}
    */
  var enableVirtualization: js.UndefOr[Boolean] = js.undefined
  /** Triggered after saved the modified cellValue in TreeGrid
    */
  var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, Unit]] = js.undefined
  /** Specifies the mapping property path for the expand status of a record in data source.
    */
  var expandStateMapping: js.UndefOr[String] = js.undefined
  /** Triggered after expand the record
    */
  var expanded: js.UndefOr[js.Function1[/* e */ ExpandedEventArgs, Unit]] = js.undefined
  /** Triggered while expanding the TreeGrid record
    */
  var expanding: js.UndefOr[js.Function1[/* e */ ExpandingEventArgs, Unit]] = js.undefined
  /** Options for filtering and customizing filter actions.
    */
  var filterSettings: js.UndefOr[FilterSettings] = js.undefined
  /** Specifies whether to wrap the header text when it is overflown i.e., when it exceeds the header width.
    * @Default {ej.TreeGrid.HeaderTextOverflow.None}
    */
  var headerTextOverflow: js.UndefOr[HeaderTextOverflow | String] = js.undefined
  /** Specifies the name of the field in the dataSource, which contains the id of that row.
    */
  var idMapping: js.UndefOr[String] = js.undefined
  /** Enables or disables the responsiveness of TreeGrid
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.undefined
  /** Triggered while Treegrid is loaded
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
  /** Specifies the localization information to customize the User Interface (UI) to support regional language and culture
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Specifies the options for customizing the pager.
    */
  var pageSettings: js.UndefOr[PageSettings] = js.undefined
  /** Specifies the name of the field in the dataSource, which contains the parent's id. This is necessary to form a parent-child hierarchy, if the dataSource contains self-referential
    * data.
    */
  var parentIdMapping: js.UndefOr[String] = js.undefined
  /** Enables or disables internal parsing of a row. When disabled this property, row will be displayed using the defined template without any internal event bindings.
    * @Default {true}
    */
  var parseRowTemplate: js.UndefOr[Boolean] = js.undefined
  /** Specifies ej.Query to select data from the dataSource. This property is applicable only when the dataSource is ej.DataManager.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.undefined
  /** Triggered while rendering each cell in the TreeGrid
    */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.undefined
  /** Triggered while clicking a row, even when allowSelection property is disabled.
    */
  var recordClick: js.UndefOr[js.Function1[/* e */ RecordClickEventArgs, Unit]] = js.undefined
  /** Triggered during record double click action, even when allowSelection property is disabled.
    */
  var recordDoubleClick: js.UndefOr[js.Function1[/* e */ RecordDoubleClickEventArgs, Unit]] = js.undefined
  /** Triggered while rendering each row
    */
  var rowDataBound: js.UndefOr[js.Function1[/* e */ RowDataBoundEventArgs, Unit]] = js.undefined
  /** Triggered while dragging a row in TreeGrid control
    */
  var rowDrag: js.UndefOr[js.Function1[/* e */ RowDragEventArgs, Unit]] = js.undefined
  /** Triggered while start to drag row in TreeGrid control
    */
  var rowDragStart: js.UndefOr[js.Function1[/* e */ RowDragStartEventArgs, Unit]] = js.undefined
  /** Triggered while drop a row in TreeGrid control
    */
  var rowDragStop: js.UndefOr[js.Function1[/* e */ RowDragStopEventArgs, Unit]] = js.undefined
  /** Triggered before row drop action begins.
    */
  var rowDropActionBegin: js.UndefOr[js.Function1[/* e */ RowDropActionBeginEventArgs, Unit]] = js.undefined
  /** Specifies the height of a single row in tree grid. Also, we need to set same height in the CSS style with class name e-rowcell.
    * @Default {30}
    */
  var rowHeight: js.UndefOr[Double] = js.undefined
  /** Triggered after the row is selected.
    */
  var rowSelected: js.UndefOr[js.Function1[/* e */ RowSelectedEventArgs, Unit]] = js.undefined
  /** Triggered before the row is going to be selected.
    */
  var rowSelecting: js.UndefOr[js.Function1[/* e */ RowSelectingEventArgs, Unit]] = js.undefined
  /** Specifies the id of the template to be applied for all the rows.
    */
  var rowTemplateID: js.UndefOr[String] = js.undefined
  /** Specifies the toolbar searching customizations.
    */
  var searchSettings: js.UndefOr[SearchSettings] = js.undefined
  /** Specifies the selected cell information on rendering TreeGrid.
    */
  var selectedCellIndexes: js.UndefOr[js.Array[SelectedCellIndex]] = js.undefined
  /** Specifies the index of the selected row.
    * @Default {-1}
    */
  var selectedRowIndex: js.UndefOr[Double] = js.undefined
  /** Specifies the settings for row and cell selection.
    */
  var selectionSettings: js.UndefOr[SelectionSettings] = js.undefined
  /** Controls the visibility of the menu button, which is displayed on the column header. Clicking on this button will show a popup menu. When you choose Columns item from this popup,
    * a list box with column names will be shown, from which you can select/deselect a column name to control the visibility of the respective columns.
    * @Default {false}
    */
  var showColumnChooser: js.UndefOr[Boolean] = js.undefined
  /** Enables/disables the options for inserting , deleting and renaming  columns.
    * @Default {false}
    */
  var showColumnOptions: js.UndefOr[Boolean] = js.undefined
  /** Specifies the visibility of details view
    * @Default {false}
    */
  var showDetailsRow: js.UndefOr[Boolean] = js.undefined
  /** Specifies the visibility of the expander column which is used to expand or collapse the details view
    * @Default {false}
    */
  var showDetailsRowInfoColumn: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to show tooltip when mouse is hovered on the cell.
    * @Default {true}
    */
  var showGridCellTooltip: js.UndefOr[Boolean] = js.undefined
  /** Specifies whether to show tooltip for the cells, which has expander button.
    * @Default {true}
    */
  var showGridExpandCellTooltip: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates stacked header should be shown on TreeGrid layout when the property â€œstackedHeaderRowsâ€ is set.
    * @Default {false}
    */
  var showStackedHeader: js.UndefOr[Boolean] = js.undefined
  /** Specifies the visibility of summary row
    * @Default {false}
    */
  var showSummaryRow: js.UndefOr[Boolean] = js.undefined
  /** Specifies the visibility of total summary row for the corresponding summary column
    * @Default {false}
    */
  var showTotalSummary: js.UndefOr[Boolean] = js.undefined
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
  var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.undefined
  /** Options for displaying and customizing the toolbar items.
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
  /** Specifies the height of footer summary container.
    * @Default {90}
    */
  var totalSummaryHeight: js.UndefOr[Double] = js.undefined
  /** Specifies the index of the column that needs to have the expander button. By default, cells in the first column contain the expander button.
    * @Default {0}
    */
  var treeColumnIndex: js.UndefOr[Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    actionBegin: /* e */ ActionBeginEventArgs => Unit = null,
    actionComplete: /* e */ ActionCompleteEventArgs => Unit = null,
    allowColumnReordering: js.UndefOr[Boolean] = js.undefined,
    allowColumnResize: js.UndefOr[Boolean] = js.undefined,
    allowDragAndDrop: js.UndefOr[Boolean] = js.undefined,
    allowFiltering: js.UndefOr[Boolean] = js.undefined,
    allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined,
    allowMultiSorting: js.UndefOr[Boolean] = js.undefined,
    allowPaging: js.UndefOr[Boolean] = js.undefined,
    allowSearching: js.UndefOr[Boolean] = js.undefined,
    allowSelection: js.UndefOr[Boolean] = js.undefined,
    allowSorting: js.UndefOr[Boolean] = js.undefined,
    allowTextWrap: js.UndefOr[Boolean] = js.undefined,
    altRowTemplateID: String = null,
    beforePrint: /* e */ BeforePrintEventArgs => Unit = null,
    beginEdit: /* e */ BeginEditEventArgs => Unit = null,
    cellSelected: /* e */ CellSelectedEventArgs => Unit = null,
    cellSelecting: /* e */ CellSelectingEventArgs => Unit = null,
    cellTooltipTemplate: String = null,
    childMapping: String = null,
    collapsed: /* e */ CollapsedEventArgs => Unit = null,
    collapsibleTotalSummary: js.UndefOr[Boolean] = js.undefined,
    collapsing: /* e */ CollapsingEventArgs => Unit = null,
    columnDialogFields: js.Array[_] = null,
    columnDrag: /* e */ ColumnDragEventArgs => Unit = null,
    columnDragStart: /* e */ ColumnDragStartEventArgs => Unit = null,
    columnDrop: /* e */ ColumnDropEventArgs => Unit = null,
    columnResizeEnd: /* e */ ColumnResizeEndEventArgs => Unit = null,
    columnResizeSettings: ColumnResizeSettings = null,
    columnResizeStart: /* e */ ColumnResizeStartEventArgs => Unit = null,
    columnResized: /* e */ ColumnResizedEventArgs => Unit = null,
    columns: js.Array[Column] = null,
    commonWidth: Int | Double = null,
    contextMenuOpen: /* e */ ContextMenuOpenEventArgs => Unit = null,
    contextMenuSettings: ContextMenuSettings = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    dataSource: js.Array[_] = null,
    detailsDataBound: /* e */ DetailsDataBoundEventArgs => Unit = null,
    detailsHidden: /* e */ DetailsHiddenEventArgs => Unit = null,
    detailsRowHeight: Int | Double = null,
    detailsShown: /* e */ DetailsShownEventArgs => Unit = null,
    detailsTemplate: String = null,
    dragTooltip: DragTooltip = null,
    editSettings: EditSettings = null,
    enableAltRow: js.UndefOr[Boolean] = js.undefined,
    enableCollapseAll: js.UndefOr[Boolean] = js.undefined,
    enableLoadOnDemand: js.UndefOr[Boolean] = js.undefined,
    enableResize: js.UndefOr[Boolean] = js.undefined,
    enableVirtualization: js.UndefOr[Boolean] = js.undefined,
    endEdit: /* e */ EndEditEventArgs => Unit = null,
    expandStateMapping: String = null,
    expanded: /* e */ ExpandedEventArgs => Unit = null,
    expanding: /* e */ ExpandingEventArgs => Unit = null,
    filterSettings: FilterSettings = null,
    headerTextOverflow: HeaderTextOverflow | String = null,
    idMapping: String = null,
    isResponsive: js.UndefOr[Boolean] = js.undefined,
    load: /* e */ LoadEventArgs => Unit = null,
    locale: String = null,
    pageSettings: PageSettings = null,
    parentIdMapping: String = null,
    parseRowTemplate: js.UndefOr[Boolean] = js.undefined,
    query: js.Any = null,
    queryCellInfo: /* e */ QueryCellInfoEventArgs => Unit = null,
    recordClick: /* e */ RecordClickEventArgs => Unit = null,
    recordDoubleClick: /* e */ RecordDoubleClickEventArgs => Unit = null,
    rowDataBound: /* e */ RowDataBoundEventArgs => Unit = null,
    rowDrag: /* e */ RowDragEventArgs => Unit = null,
    rowDragStart: /* e */ RowDragStartEventArgs => Unit = null,
    rowDragStop: /* e */ RowDragStopEventArgs => Unit = null,
    rowDropActionBegin: /* e */ RowDropActionBeginEventArgs => Unit = null,
    rowHeight: Int | Double = null,
    rowSelected: /* e */ RowSelectedEventArgs => Unit = null,
    rowSelecting: /* e */ RowSelectingEventArgs => Unit = null,
    rowTemplateID: String = null,
    searchSettings: SearchSettings = null,
    selectedCellIndexes: js.Array[SelectedCellIndex] = null,
    selectedRowIndex: Int | Double = null,
    selectionSettings: SelectionSettings = null,
    showColumnChooser: js.UndefOr[Boolean] = js.undefined,
    showColumnOptions: js.UndefOr[Boolean] = js.undefined,
    showDetailsRow: js.UndefOr[Boolean] = js.undefined,
    showDetailsRowInfoColumn: js.UndefOr[Boolean] = js.undefined,
    showGridCellTooltip: js.UndefOr[Boolean] = js.undefined,
    showGridExpandCellTooltip: js.UndefOr[Boolean] = js.undefined,
    showStackedHeader: js.UndefOr[Boolean] = js.undefined,
    showSummaryRow: js.UndefOr[Boolean] = js.undefined,
    showTotalSummary: js.UndefOr[Boolean] = js.undefined,
    sizeSettings: SizeSettings = null,
    sortSettings: SortSettings = null,
    stackedHeaderRows: js.Array[StackedHeaderRow] = null,
    summaryRows: js.Array[SummaryRow] = null,
    toolbarClick: /* e */ ToolbarClickEventArgs => Unit = null,
    toolbarSettings: ToolbarSettings = null,
    totalSummaryHeight: Int | Double = null,
    treeColumnIndex: Int | Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionBegin != null) __obj.updateDynamic("actionBegin")(js.Any.fromFunction1(actionBegin))
    if (actionComplete != null) __obj.updateDynamic("actionComplete")(js.Any.fromFunction1(actionComplete))
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
    if (beforePrint != null) __obj.updateDynamic("beforePrint")(js.Any.fromFunction1(beforePrint))
    if (beginEdit != null) __obj.updateDynamic("beginEdit")(js.Any.fromFunction1(beginEdit))
    if (cellSelected != null) __obj.updateDynamic("cellSelected")(js.Any.fromFunction1(cellSelected))
    if (cellSelecting != null) __obj.updateDynamic("cellSelecting")(js.Any.fromFunction1(cellSelecting))
    if (cellTooltipTemplate != null) __obj.updateDynamic("cellTooltipTemplate")(cellTooltipTemplate)
    if (childMapping != null) __obj.updateDynamic("childMapping")(childMapping)
    if (collapsed != null) __obj.updateDynamic("collapsed")(js.Any.fromFunction1(collapsed))
    if (!js.isUndefined(collapsibleTotalSummary)) __obj.updateDynamic("collapsibleTotalSummary")(collapsibleTotalSummary)
    if (collapsing != null) __obj.updateDynamic("collapsing")(js.Any.fromFunction1(collapsing))
    if (columnDialogFields != null) __obj.updateDynamic("columnDialogFields")(columnDialogFields)
    if (columnDrag != null) __obj.updateDynamic("columnDrag")(js.Any.fromFunction1(columnDrag))
    if (columnDragStart != null) __obj.updateDynamic("columnDragStart")(js.Any.fromFunction1(columnDragStart))
    if (columnDrop != null) __obj.updateDynamic("columnDrop")(js.Any.fromFunction1(columnDrop))
    if (columnResizeEnd != null) __obj.updateDynamic("columnResizeEnd")(js.Any.fromFunction1(columnResizeEnd))
    if (columnResizeSettings != null) __obj.updateDynamic("columnResizeSettings")(columnResizeSettings)
    if (columnResizeStart != null) __obj.updateDynamic("columnResizeStart")(js.Any.fromFunction1(columnResizeStart))
    if (columnResized != null) __obj.updateDynamic("columnResized")(js.Any.fromFunction1(columnResized))
    if (columns != null) __obj.updateDynamic("columns")(columns)
    if (commonWidth != null) __obj.updateDynamic("commonWidth")(commonWidth.asInstanceOf[js.Any])
    if (contextMenuOpen != null) __obj.updateDynamic("contextMenuOpen")(js.Any.fromFunction1(contextMenuOpen))
    if (contextMenuSettings != null) __obj.updateDynamic("contextMenuSettings")(contextMenuSettings)
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (dataSource != null) __obj.updateDynamic("dataSource")(dataSource)
    if (detailsDataBound != null) __obj.updateDynamic("detailsDataBound")(js.Any.fromFunction1(detailsDataBound))
    if (detailsHidden != null) __obj.updateDynamic("detailsHidden")(js.Any.fromFunction1(detailsHidden))
    if (detailsRowHeight != null) __obj.updateDynamic("detailsRowHeight")(detailsRowHeight.asInstanceOf[js.Any])
    if (detailsShown != null) __obj.updateDynamic("detailsShown")(js.Any.fromFunction1(detailsShown))
    if (detailsTemplate != null) __obj.updateDynamic("detailsTemplate")(detailsTemplate)
    if (dragTooltip != null) __obj.updateDynamic("dragTooltip")(dragTooltip)
    if (editSettings != null) __obj.updateDynamic("editSettings")(editSettings)
    if (!js.isUndefined(enableAltRow)) __obj.updateDynamic("enableAltRow")(enableAltRow)
    if (!js.isUndefined(enableCollapseAll)) __obj.updateDynamic("enableCollapseAll")(enableCollapseAll)
    if (!js.isUndefined(enableLoadOnDemand)) __obj.updateDynamic("enableLoadOnDemand")(enableLoadOnDemand)
    if (!js.isUndefined(enableResize)) __obj.updateDynamic("enableResize")(enableResize)
    if (!js.isUndefined(enableVirtualization)) __obj.updateDynamic("enableVirtualization")(enableVirtualization)
    if (endEdit != null) __obj.updateDynamic("endEdit")(js.Any.fromFunction1(endEdit))
    if (expandStateMapping != null) __obj.updateDynamic("expandStateMapping")(expandStateMapping)
    if (expanded != null) __obj.updateDynamic("expanded")(js.Any.fromFunction1(expanded))
    if (expanding != null) __obj.updateDynamic("expanding")(js.Any.fromFunction1(expanding))
    if (filterSettings != null) __obj.updateDynamic("filterSettings")(filterSettings)
    if (headerTextOverflow != null) __obj.updateDynamic("headerTextOverflow")(headerTextOverflow.asInstanceOf[js.Any])
    if (idMapping != null) __obj.updateDynamic("idMapping")(idMapping)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (pageSettings != null) __obj.updateDynamic("pageSettings")(pageSettings)
    if (parentIdMapping != null) __obj.updateDynamic("parentIdMapping")(parentIdMapping)
    if (!js.isUndefined(parseRowTemplate)) __obj.updateDynamic("parseRowTemplate")(parseRowTemplate)
    if (query != null) __obj.updateDynamic("query")(query)
    if (queryCellInfo != null) __obj.updateDynamic("queryCellInfo")(js.Any.fromFunction1(queryCellInfo))
    if (recordClick != null) __obj.updateDynamic("recordClick")(js.Any.fromFunction1(recordClick))
    if (recordDoubleClick != null) __obj.updateDynamic("recordDoubleClick")(js.Any.fromFunction1(recordDoubleClick))
    if (rowDataBound != null) __obj.updateDynamic("rowDataBound")(js.Any.fromFunction1(rowDataBound))
    if (rowDrag != null) __obj.updateDynamic("rowDrag")(js.Any.fromFunction1(rowDrag))
    if (rowDragStart != null) __obj.updateDynamic("rowDragStart")(js.Any.fromFunction1(rowDragStart))
    if (rowDragStop != null) __obj.updateDynamic("rowDragStop")(js.Any.fromFunction1(rowDragStop))
    if (rowDropActionBegin != null) __obj.updateDynamic("rowDropActionBegin")(js.Any.fromFunction1(rowDropActionBegin))
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (rowSelected != null) __obj.updateDynamic("rowSelected")(js.Any.fromFunction1(rowSelected))
    if (rowSelecting != null) __obj.updateDynamic("rowSelecting")(js.Any.fromFunction1(rowSelecting))
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
    if (toolbarClick != null) __obj.updateDynamic("toolbarClick")(js.Any.fromFunction1(toolbarClick))
    if (toolbarSettings != null) __obj.updateDynamic("toolbarSettings")(toolbarSettings)
    if (totalSummaryHeight != null) __obj.updateDynamic("totalSummaryHeight")(totalSummaryHeight.asInstanceOf[js.Any])
    if (treeColumnIndex != null) __obj.updateDynamic("treeColumnIndex")(treeColumnIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

