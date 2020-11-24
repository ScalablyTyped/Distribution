package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Triggered before every success event of TreeGrid action.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  
  /** Triggered for every TreeGrid action success event.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  
  /** Enables or disables the option for column reordering
    * @Default {false}
    */
  var allowColumnReordering: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the ability to resize the column width interactively.
    * @Default {false}
    */
  var allowColumnResize: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the ability to drag and drop the row interactively to reorder the rows.
    * @Default {false}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the ability to filter the data on all the columns. Enabling this property will display a row with editor controls corresponding to each column. You can
    * restrict filtering on particular column by disabling this property directly on that column instance itself.
    * @Default {false}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables keyboard navigation.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the ability to sort the rows based on multiple columns/fields by clicking on each column header. Rows will be sorted recursively on clicking the column headers.
    * @Default {false}
    */
  var allowMultiSorting: js.UndefOr[Boolean] = js.native
  
  /** Enables/disables pagination of rows in TreeGrid
    * @Default {false}
    */
  var allowPaging: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the toolbar searching in TreeGrid.
    * @Default {false}
    */
  var allowSearching: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the ability to select a row interactively.
    * @Default {true}
    */
  var allowSelection: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the ability to sort the rows based on a single field/column by clicking on that column header. When enabled, rows can be sorted only by single field/column.
    * @Default {false}
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether the Content will wrap to the next line if the content exceeds the boundary of the Column Cells.
    * @Default {false}
    */
  var allowTextWrap: js.UndefOr[Boolean] = js.native
  
  /** Specifies the id of the template that has to be applied for alternate rows.
    */
  var altRowTemplateID: js.UndefOr[String] = js.native
  
  /** Triggered before the printing initiated in TreeGrid.
    */
  var beforePrint: js.UndefOr[js.Function1[/* e */ BeforePrintEventArgs, Unit]] = js.native
  
  /** Triggered while enter the edit mode in the TreeGrid cell
    */
  var beginEdit: js.UndefOr[js.Function1[/* e */ BeginEditEventArgs, Unit]] = js.native
  
  /** Triggered after selected a cell
    */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, Unit]] = js.native
  
  /** Triggered before selecting a cell
    */
  var cellSelecting: js.UndefOr[js.Function1[/* e */ CellSelectingEventArgs, Unit]] = js.native
  
  /** Specifies the template for cell tooltip
    * @Default {null}
    */
  var cellTooltipTemplate: js.UndefOr[String] = js.native
  
  /** Specifies the mapping property path for sub tasks in datasource
    */
  var childMapping: js.UndefOr[String] = js.native
  
  /** Triggered after collapsed the TreeGrid record
    */
  var collapsed: js.UndefOr[js.Function1[/* e */ CollapsedEventArgs, Unit]] = js.native
  
  /** Enables or disables the expandable/collapsible footer summary row. By default expander icon for footer summary will be rendered in first column of first summary row.
    * @Default {false}
    */
  var collapsibleTotalSummary: js.UndefOr[Boolean] = js.native
  
  /** Triggered while collapsing the TreeGrid record
    */
  var collapsing: js.UndefOr[js.Function1[/* e */ CollapsingEventArgs, Unit]] = js.native
  
  /** To Specify the column fields to be displayed in the dialog while inserting a column using column menu.
    * @Default {[]}
    */
  var columnDialogFields: js.UndefOr[js.Array[_]] = js.native
  
  /** Triggered while dragging a column
    */
  var columnDrag: js.UndefOr[js.Function1[/* e */ ColumnDragEventArgs, Unit]] = js.native
  
  /** Triggered  when you start to drag a column
    */
  var columnDragStart: js.UndefOr[js.Function1[/* e */ ColumnDragStartEventArgs, Unit]] = js.native
  
  /** Triggered when a column is dropped
    */
  var columnDrop: js.UndefOr[js.Function1[/* e */ ColumnDropEventArgs, Unit]] = js.native
  
  /** Triggered when a column has been resized
    */
  var columnResizeEnd: js.UndefOr[js.Function1[/* e */ ColumnResizeEndEventArgs, Unit]] = js.native
  
  /** Specifies the settings for column resize
    */
  var columnResizeSettings: js.UndefOr[ColumnResizeSettings] = js.native
  
  /** Triggered while start to resize a column
    */
  var columnResizeStart: js.UndefOr[js.Function1[/* e */ ColumnResizeStartEventArgs, Unit]] = js.native
  
  /** Triggered after a column resized
    */
  var columnResized: js.UndefOr[js.Function1[/* e */ ColumnResizedEventArgs, Unit]] = js.native
  
  /** Option for adding columns; each column has the option to bind to a field in the dataSource.
    */
  var columns: js.UndefOr[js.Array[Column]] = js.native
  
  /** Defines the common width for all the columns in TreeGrid
    * @Default {150}
    */
  var commonWidth: js.UndefOr[Double] = js.native
  
  /** Triggered while Context Menu is rendered in TreeGrid control
    */
  var contextMenuOpen: js.UndefOr[js.Function1[/* e */ ContextMenuOpenEventArgs, Unit]] = js.native
  
  /** Options for displaying and customizing context menu items.
    */
  var contextMenuSettings: js.UndefOr[ContextMenuSettings] = js.native
  
  /** Triggered when TreeGrid is rendered completely
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** Specify the CSS class for TreeGrid to achieve custom theme.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Specifies hierarchical or self-referential data to populate the TreeGrid.
    * @Default {null}
    */
  var dataSource: js.UndefOr[js.Array[_]] = js.native
  
  /** Triggered while rendering details template in TreeGrid
    */
  var detailsDataBound: js.UndefOr[js.Function1[/* e */ DetailsDataBoundEventArgs, Unit]] = js.native
  
  /** Triggered when details template pop-up is hidden.
    */
  var detailsHidden: js.UndefOr[js.Function1[/* e */ DetailsHiddenEventArgs, Unit]] = js.native
  
  /** Specifies the row height of the details view
    * @Default {100}
    */
  var detailsRowHeight: js.UndefOr[Double] = js.native
  
  /** Triggered when details template pop-up is shown.
    */
  var detailsShown: js.UndefOr[js.Function1[/* e */ DetailsShownEventArgs, Unit]] = js.native
  
  /** Specifies the template for details view
    */
  var detailsTemplate: js.UndefOr[String] = js.native
  
  /** Options for displaying and customizing the tooltip. This tooltip will show the preview of the row that is being dragged.
    */
  var dragTooltip: js.UndefOr[DragTooltip] = js.native
  
  /** Options for enabling and configuring the editing related operations.
    */
  var editSettings: js.UndefOr[EditSettings] = js.native
  
  /** Specifies whether to render alternate rows in different background colors.
    * @Default {true}
    */
  var enableAltRow: js.UndefOr[Boolean] = js.native
  
  /** Specifies whether to load all the rows in collapsed state when the TreeGrid is rendered for the first time.
    * @Default {false}
    */
  var enableCollapseAll: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable load on demand approach, for rendering child records and page records.
    * @Default {false}
    */
  var enableLoadOnDemand: js.UndefOr[Boolean] = js.native
  
  /** Specifies whether to resize TreeGrid whenever window size changes.
    * @Default {false}
    */
  var enableResize: js.UndefOr[Boolean] = js.native
  
  /** Specifies whether to render only the visual elements that are visible in the UI. When you enable this property, it will reduce the loading time for loading large number of records.
    * @Default {false}
    */
  var enableVirtualization: js.UndefOr[Boolean] = js.native
  
  /** Triggered after saved the modified cellValue in TreeGrid
    */
  var endEdit: js.UndefOr[js.Function1[/* e */ EndEditEventArgs, Unit]] = js.native
  
  /** Specifies the mapping property path for the expand status of a record in data source.
    */
  var expandStateMapping: js.UndefOr[String] = js.native
  
  /** Triggered after expand the record
    */
  var expanded: js.UndefOr[js.Function1[/* e */ ExpandedEventArgs, Unit]] = js.native
  
  /** Triggered while expanding the TreeGrid record
    */
  var expanding: js.UndefOr[js.Function1[/* e */ ExpandingEventArgs, Unit]] = js.native
  
  /** Options for filtering and customizing filter actions.
    */
  var filterSettings: js.UndefOr[FilterSettings] = js.native
  
  /** Specifies whether to wrap the header text when it is overflown i.e., when it exceeds the header width.
    * @Default {ej.TreeGrid.HeaderTextOverflow.None}
    */
  var headerTextOverflow: js.UndefOr[HeaderTextOverflow | String] = js.native
  
  /** Specifies the name of the field in the dataSource, which contains the id of that row.
    */
  var idMapping: js.UndefOr[String] = js.native
  
  /** Enables or disables the responsiveness of TreeGrid
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  
  /** Triggered while Treegrid is loaded
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  
  /** Specifies the localization information to customize the User Interface (UI) to support regional language and culture
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Specifies the options for customizing the pager.
    */
  var pageSettings: js.UndefOr[PageSettings] = js.native
  
  /** Specifies the name of the field in the dataSource, which contains the parent's id. This is necessary to form a parent-child hierarchy, if the dataSource contains self-referential
    * data.
    */
  var parentIdMapping: js.UndefOr[String] = js.native
  
  /** Enables or disables internal parsing of a row. When disabled this property, row will be displayed using the defined template without any internal event bindings.
    * @Default {true}
    */
  var parseRowTemplate: js.UndefOr[Boolean] = js.native
  
  /** Specifies ej.Query to select data from the dataSource. This property is applicable only when the dataSource is ej.DataManager.
    * @Default {null}
    */
  var query: js.UndefOr[js.Any] = js.native
  
  /** Triggered while rendering each cell in the TreeGrid
    */
  var queryCellInfo: js.UndefOr[js.Function1[/* e */ QueryCellInfoEventArgs, Unit]] = js.native
  
  /** Triggered while clicking a row, even when allowSelection property is disabled.
    */
  var recordClick: js.UndefOr[js.Function1[/* e */ RecordClickEventArgs, Unit]] = js.native
  
  /** Triggered during record double click action, even when allowSelection property is disabled.
    */
  var recordDoubleClick: js.UndefOr[js.Function1[/* e */ RecordDoubleClickEventArgs, Unit]] = js.native
  
  /** Triggered while rendering each row
    */
  var rowDataBound: js.UndefOr[js.Function1[/* e */ RowDataBoundEventArgs, Unit]] = js.native
  
  /** Triggered while dragging a row in TreeGrid control
    */
  var rowDrag: js.UndefOr[js.Function1[/* e */ RowDragEventArgs, Unit]] = js.native
  
  /** Triggered while start to drag row in TreeGrid control
    */
  var rowDragStart: js.UndefOr[js.Function1[/* e */ RowDragStartEventArgs, Unit]] = js.native
  
  /** Triggered while drop a row in TreeGrid control
    */
  var rowDragStop: js.UndefOr[js.Function1[/* e */ RowDragStopEventArgs, Unit]] = js.native
  
  /** Triggered before row drop action begins.
    */
  var rowDropActionBegin: js.UndefOr[js.Function1[/* e */ RowDropActionBeginEventArgs, Unit]] = js.native
  
  /** Specifies the height of a single row in tree grid. Also, we need to set same height in the CSS style with class name e-rowcell.
    * @Default {30}
    */
  var rowHeight: js.UndefOr[Double] = js.native
  
  /** Triggered after the row is selected.
    */
  var rowSelected: js.UndefOr[js.Function1[/* e */ RowSelectedEventArgs, Unit]] = js.native
  
  /** Triggered before the row is going to be selected.
    */
  var rowSelecting: js.UndefOr[js.Function1[/* e */ RowSelectingEventArgs, Unit]] = js.native
  
  /** Specifies the id of the template to be applied for all the rows.
    */
  var rowTemplateID: js.UndefOr[String] = js.native
  
  /** Specifies the toolbar searching customizations.
    */
  var searchSettings: js.UndefOr[SearchSettings] = js.native
  
  /** Specifies the selected cell information on rendering TreeGrid.
    */
  var selectedCellIndexes: js.UndefOr[js.Array[SelectedCellIndex]] = js.native
  
  /** Specifies the index of the selected row.
    * @Default {-1}
    */
  var selectedRowIndex: js.UndefOr[Double] = js.native
  
  /** Specifies the settings for row and cell selection.
    */
  var selectionSettings: js.UndefOr[SelectionSettings] = js.native
  
  /** Controls the visibility of the menu button, which is displayed on the column header. Clicking on this button will show a popup menu. When you choose Columns item from this popup,
    * a list box with column names will be shown, from which you can select/deselect a column name to control the visibility of the respective columns.
    * @Default {false}
    */
  var showColumnChooser: js.UndefOr[Boolean] = js.native
  
  /** Enables/disables the options for inserting , deleting and renaming  columns.
    * @Default {false}
    */
  var showColumnOptions: js.UndefOr[Boolean] = js.native
  
  /** Specifies the visibility of details view
    * @Default {false}
    */
  var showDetailsRow: js.UndefOr[Boolean] = js.native
  
  /** Specifies the visibility of the expander column which is used to expand or collapse the details view
    * @Default {false}
    */
  var showDetailsRowInfoColumn: js.UndefOr[Boolean] = js.native
  
  /** Specifies whether to show tooltip when mouse is hovered on the cell.
    * @Default {true}
    */
  var showGridCellTooltip: js.UndefOr[Boolean] = js.native
  
  /** Specifies whether to show tooltip for the cells, which has expander button.
    * @Default {true}
    */
  var showGridExpandCellTooltip: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates stacked header should be shown on TreeGrid layout when the property â€œstackedHeaderRowsâ€ is set.
    * @Default {false}
    */
  var showStackedHeader: js.UndefOr[Boolean] = js.native
  
  /** Specifies the visibility of summary row
    * @Default {false}
    */
  var showSummaryRow: js.UndefOr[Boolean] = js.native
  
  /** Specifies the visibility of total summary row for the corresponding summary column
    * @Default {false}
    */
  var showTotalSummary: js.UndefOr[Boolean] = js.native
  
  /** Options for setting width and height for TreeGrid.
    */
  var sizeSettings: js.UndefOr[SizeSettings] = js.native
  
  /** Options for sorting the rows.
    */
  var sortSettings: js.UndefOr[SortSettings] = js.native
  
  /** Gets or sets an object that indicates to managing the collection of stacked header rows for the TreeGrid.
    * @Default {[]}
    */
  var stackedHeaderRows: js.UndefOr[js.Array[StackedHeaderRow]] = js.native
  
  /** Specifies the summary row collection object to be displayed
    * @Default {[]}
    */
  var summaryRows: js.UndefOr[js.Array[SummaryRow]] = js.native
  
  /** Triggered when toolbar item is clicked in TreeGrid.
    */
  var toolbarClick: js.UndefOr[js.Function1[/* e */ ToolbarClickEventArgs, Unit]] = js.native
  
  /** Options for displaying and customizing the toolbar items.
    */
  var toolbarSettings: js.UndefOr[ToolbarSettings] = js.native
  
  /** Specifies the height of footer summary container.
    * @Default {90}
    */
  var totalSummaryHeight: js.UndefOr[Double] = js.native
  
  /** Specifies the index of the column that needs to have the expander button. By default, cells in the first column contain the expander button.
    * @Default {0}
    */
  var treeColumnIndex: js.UndefOr[Double] = js.native
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
    def setAllowColumnReordering(value: Boolean): Self = this.set("allowColumnReordering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowColumnReordering: Self = this.set("allowColumnReordering", js.undefined)
    
    @scala.inline
    def setAllowColumnResize(value: Boolean): Self = this.set("allowColumnResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowColumnResize: Self = this.set("allowColumnResize", js.undefined)
    
    @scala.inline
    def setAllowDragAndDrop(value: Boolean): Self = this.set("allowDragAndDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDragAndDrop: Self = this.set("allowDragAndDrop", js.undefined)
    
    @scala.inline
    def setAllowFiltering(value: Boolean): Self = this.set("allowFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFiltering: Self = this.set("allowFiltering", js.undefined)
    
    @scala.inline
    def setAllowKeyboardNavigation(value: Boolean): Self = this.set("allowKeyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowKeyboardNavigation: Self = this.set("allowKeyboardNavigation", js.undefined)
    
    @scala.inline
    def setAllowMultiSorting(value: Boolean): Self = this.set("allowMultiSorting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMultiSorting: Self = this.set("allowMultiSorting", js.undefined)
    
    @scala.inline
    def setAllowPaging(value: Boolean): Self = this.set("allowPaging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowPaging: Self = this.set("allowPaging", js.undefined)
    
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
    def setAltRowTemplateID(value: String): Self = this.set("altRowTemplateID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAltRowTemplateID: Self = this.set("altRowTemplateID", js.undefined)
    
    @scala.inline
    def setBeforePrint(value: /* e */ BeforePrintEventArgs => Unit): Self = this.set("beforePrint", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforePrint: Self = this.set("beforePrint", js.undefined)
    
    @scala.inline
    def setBeginEdit(value: /* e */ BeginEditEventArgs => Unit): Self = this.set("beginEdit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeginEdit: Self = this.set("beginEdit", js.undefined)
    
    @scala.inline
    def setCellSelected(value: /* e */ CellSelectedEventArgs => Unit): Self = this.set("cellSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellSelected: Self = this.set("cellSelected", js.undefined)
    
    @scala.inline
    def setCellSelecting(value: /* e */ CellSelectingEventArgs => Unit): Self = this.set("cellSelecting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellSelecting: Self = this.set("cellSelecting", js.undefined)
    
    @scala.inline
    def setCellTooltipTemplate(value: String): Self = this.set("cellTooltipTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellTooltipTemplate: Self = this.set("cellTooltipTemplate", js.undefined)
    
    @scala.inline
    def setChildMapping(value: String): Self = this.set("childMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildMapping: Self = this.set("childMapping", js.undefined)
    
    @scala.inline
    def setCollapsed(value: /* e */ CollapsedEventArgs => Unit): Self = this.set("collapsed", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    
    @scala.inline
    def setCollapsibleTotalSummary(value: Boolean): Self = this.set("collapsibleTotalSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollapsibleTotalSummary: Self = this.set("collapsibleTotalSummary", js.undefined)
    
    @scala.inline
    def setCollapsing(value: /* e */ CollapsingEventArgs => Unit): Self = this.set("collapsing", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCollapsing: Self = this.set("collapsing", js.undefined)
    
    @scala.inline
    def setColumnDialogFieldsVarargs(value: js.Any*): Self = this.set("columnDialogFields", js.Array(value :_*))
    
    @scala.inline
    def setColumnDialogFields(value: js.Array[_]): Self = this.set("columnDialogFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnDialogFields: Self = this.set("columnDialogFields", js.undefined)
    
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
    def setColumnResizeEnd(value: /* e */ ColumnResizeEndEventArgs => Unit): Self = this.set("columnResizeEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnResizeEnd: Self = this.set("columnResizeEnd", js.undefined)
    
    @scala.inline
    def setColumnResizeSettings(value: ColumnResizeSettings): Self = this.set("columnResizeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnResizeSettings: Self = this.set("columnResizeSettings", js.undefined)
    
    @scala.inline
    def setColumnResizeStart(value: /* e */ ColumnResizeStartEventArgs => Unit): Self = this.set("columnResizeStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnResizeStart: Self = this.set("columnResizeStart", js.undefined)
    
    @scala.inline
    def setColumnResized(value: /* e */ ColumnResizedEventArgs => Unit): Self = this.set("columnResized", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteColumnResized: Self = this.set("columnResized", js.undefined)
    
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
    def setContextMenuOpen(value: /* e */ ContextMenuOpenEventArgs => Unit): Self = this.set("contextMenuOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteContextMenuOpen: Self = this.set("contextMenuOpen", js.undefined)
    
    @scala.inline
    def setContextMenuSettings(value: ContextMenuSettings): Self = this.set("contextMenuSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContextMenuSettings: Self = this.set("contextMenuSettings", js.undefined)
    
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDataSourceVarargs(value: js.Any*): Self = this.set("dataSource", js.Array(value :_*))
    
    @scala.inline
    def setDataSource(value: js.Array[_]): Self = this.set("dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataSource: Self = this.set("dataSource", js.undefined)
    
    @scala.inline
    def setDetailsDataBound(value: /* e */ DetailsDataBoundEventArgs => Unit): Self = this.set("detailsDataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDetailsDataBound: Self = this.set("detailsDataBound", js.undefined)
    
    @scala.inline
    def setDetailsHidden(value: /* e */ DetailsHiddenEventArgs => Unit): Self = this.set("detailsHidden", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDetailsHidden: Self = this.set("detailsHidden", js.undefined)
    
    @scala.inline
    def setDetailsRowHeight(value: Double): Self = this.set("detailsRowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailsRowHeight: Self = this.set("detailsRowHeight", js.undefined)
    
    @scala.inline
    def setDetailsShown(value: /* e */ DetailsShownEventArgs => Unit): Self = this.set("detailsShown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDetailsShown: Self = this.set("detailsShown", js.undefined)
    
    @scala.inline
    def setDetailsTemplate(value: String): Self = this.set("detailsTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetailsTemplate: Self = this.set("detailsTemplate", js.undefined)
    
    @scala.inline
    def setDragTooltip(value: DragTooltip): Self = this.set("dragTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDragTooltip: Self = this.set("dragTooltip", js.undefined)
    
    @scala.inline
    def setEditSettings(value: EditSettings): Self = this.set("editSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEditSettings: Self = this.set("editSettings", js.undefined)
    
    @scala.inline
    def setEnableAltRow(value: Boolean): Self = this.set("enableAltRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAltRow: Self = this.set("enableAltRow", js.undefined)
    
    @scala.inline
    def setEnableCollapseAll(value: Boolean): Self = this.set("enableCollapseAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableCollapseAll: Self = this.set("enableCollapseAll", js.undefined)
    
    @scala.inline
    def setEnableLoadOnDemand(value: Boolean): Self = this.set("enableLoadOnDemand", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableLoadOnDemand: Self = this.set("enableLoadOnDemand", js.undefined)
    
    @scala.inline
    def setEnableResize(value: Boolean): Self = this.set("enableResize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableResize: Self = this.set("enableResize", js.undefined)
    
    @scala.inline
    def setEnableVirtualization(value: Boolean): Self = this.set("enableVirtualization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableVirtualization: Self = this.set("enableVirtualization", js.undefined)
    
    @scala.inline
    def setEndEdit(value: /* e */ EndEditEventArgs => Unit): Self = this.set("endEdit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEndEdit: Self = this.set("endEdit", js.undefined)
    
    @scala.inline
    def setExpandStateMapping(value: String): Self = this.set("expandStateMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandStateMapping: Self = this.set("expandStateMapping", js.undefined)
    
    @scala.inline
    def setExpanded(value: /* e */ ExpandedEventArgs => Unit): Self = this.set("expanded", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    
    @scala.inline
    def setExpanding(value: /* e */ ExpandingEventArgs => Unit): Self = this.set("expanding", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteExpanding: Self = this.set("expanding", js.undefined)
    
    @scala.inline
    def setFilterSettings(value: FilterSettings): Self = this.set("filterSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterSettings: Self = this.set("filterSettings", js.undefined)
    
    @scala.inline
    def setHeaderTextOverflow(value: HeaderTextOverflow | String): Self = this.set("headerTextOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaderTextOverflow: Self = this.set("headerTextOverflow", js.undefined)
    
    @scala.inline
    def setIdMapping(value: String): Self = this.set("idMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdMapping: Self = this.set("idMapping", js.undefined)
    
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    
    @scala.inline
    def setLoad(value: /* e */ LoadEventArgs => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setPageSettings(value: PageSettings): Self = this.set("pageSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageSettings: Self = this.set("pageSettings", js.undefined)
    
    @scala.inline
    def setParentIdMapping(value: String): Self = this.set("parentIdMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentIdMapping: Self = this.set("parentIdMapping", js.undefined)
    
    @scala.inline
    def setParseRowTemplate(value: Boolean): Self = this.set("parseRowTemplate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParseRowTemplate: Self = this.set("parseRowTemplate", js.undefined)
    
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
    def setRowDataBound(value: /* e */ RowDataBoundEventArgs => Unit): Self = this.set("rowDataBound", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowDataBound: Self = this.set("rowDataBound", js.undefined)
    
    @scala.inline
    def setRowDrag(value: /* e */ RowDragEventArgs => Unit): Self = this.set("rowDrag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowDrag: Self = this.set("rowDrag", js.undefined)
    
    @scala.inline
    def setRowDragStart(value: /* e */ RowDragStartEventArgs => Unit): Self = this.set("rowDragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowDragStart: Self = this.set("rowDragStart", js.undefined)
    
    @scala.inline
    def setRowDragStop(value: /* e */ RowDragStopEventArgs => Unit): Self = this.set("rowDragStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowDragStop: Self = this.set("rowDragStop", js.undefined)
    
    @scala.inline
    def setRowDropActionBegin(value: /* e */ RowDropActionBeginEventArgs => Unit): Self = this.set("rowDropActionBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowDropActionBegin: Self = this.set("rowDropActionBegin", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    
    @scala.inline
    def setRowSelected(value: /* e */ RowSelectedEventArgs => Unit): Self = this.set("rowSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowSelected: Self = this.set("rowSelected", js.undefined)
    
    @scala.inline
    def setRowSelecting(value: /* e */ RowSelectingEventArgs => Unit): Self = this.set("rowSelecting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRowSelecting: Self = this.set("rowSelecting", js.undefined)
    
    @scala.inline
    def setRowTemplateID(value: String): Self = this.set("rowTemplateID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowTemplateID: Self = this.set("rowTemplateID", js.undefined)
    
    @scala.inline
    def setSearchSettings(value: SearchSettings): Self = this.set("searchSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSearchSettings: Self = this.set("searchSettings", js.undefined)
    
    @scala.inline
    def setSelectedCellIndexesVarargs(value: SelectedCellIndex*): Self = this.set("selectedCellIndexes", js.Array(value :_*))
    
    @scala.inline
    def setSelectedCellIndexes(value: js.Array[SelectedCellIndex]): Self = this.set("selectedCellIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedCellIndexes: Self = this.set("selectedCellIndexes", js.undefined)
    
    @scala.inline
    def setSelectedRowIndex(value: Double): Self = this.set("selectedRowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedRowIndex: Self = this.set("selectedRowIndex", js.undefined)
    
    @scala.inline
    def setSelectionSettings(value: SelectionSettings): Self = this.set("selectionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionSettings: Self = this.set("selectionSettings", js.undefined)
    
    @scala.inline
    def setShowColumnChooser(value: Boolean): Self = this.set("showColumnChooser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowColumnChooser: Self = this.set("showColumnChooser", js.undefined)
    
    @scala.inline
    def setShowColumnOptions(value: Boolean): Self = this.set("showColumnOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowColumnOptions: Self = this.set("showColumnOptions", js.undefined)
    
    @scala.inline
    def setShowDetailsRow(value: Boolean): Self = this.set("showDetailsRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDetailsRow: Self = this.set("showDetailsRow", js.undefined)
    
    @scala.inline
    def setShowDetailsRowInfoColumn(value: Boolean): Self = this.set("showDetailsRowInfoColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowDetailsRowInfoColumn: Self = this.set("showDetailsRowInfoColumn", js.undefined)
    
    @scala.inline
    def setShowGridCellTooltip(value: Boolean): Self = this.set("showGridCellTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGridCellTooltip: Self = this.set("showGridCellTooltip", js.undefined)
    
    @scala.inline
    def setShowGridExpandCellTooltip(value: Boolean): Self = this.set("showGridExpandCellTooltip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGridExpandCellTooltip: Self = this.set("showGridExpandCellTooltip", js.undefined)
    
    @scala.inline
    def setShowStackedHeader(value: Boolean): Self = this.set("showStackedHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowStackedHeader: Self = this.set("showStackedHeader", js.undefined)
    
    @scala.inline
    def setShowSummaryRow(value: Boolean): Self = this.set("showSummaryRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowSummaryRow: Self = this.set("showSummaryRow", js.undefined)
    
    @scala.inline
    def setShowTotalSummary(value: Boolean): Self = this.set("showTotalSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTotalSummary: Self = this.set("showTotalSummary", js.undefined)
    
    @scala.inline
    def setSizeSettings(value: SizeSettings): Self = this.set("sizeSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeSettings: Self = this.set("sizeSettings", js.undefined)
    
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
    def setToolbarClick(value: /* e */ ToolbarClickEventArgs => Unit): Self = this.set("toolbarClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteToolbarClick: Self = this.set("toolbarClick", js.undefined)
    
    @scala.inline
    def setToolbarSettings(value: ToolbarSettings): Self = this.set("toolbarSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToolbarSettings: Self = this.set("toolbarSettings", js.undefined)
    
    @scala.inline
    def setTotalSummaryHeight(value: Double): Self = this.set("totalSummaryHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalSummaryHeight: Self = this.set("totalSummaryHeight", js.undefined)
    
    @scala.inline
    def setTreeColumnIndex(value: Double): Self = this.set("treeColumnIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTreeColumnIndex: Self = this.set("treeColumnIndex", js.undefined)
  }
}
