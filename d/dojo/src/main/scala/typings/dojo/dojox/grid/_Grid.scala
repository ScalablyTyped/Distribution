package typings.dojo.dojox.grid

import typings.dojo.Anon_Unwatch
import typings.dojo.dijit.Menu
import typings.dojo.dijit._Widget
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.autoHeight
import typings.dojo.dojoStrings.autoRender
import typings.dojo.dojoStrings.autoWidth
import typings.dojo.dojoStrings.cellOverClass
import typings.dojo.dojoStrings.classTag
import typings.dojo.dojoStrings.columnReordering
import typings.dojo.dojoStrings.defaultHeight
import typings.dojo.dojoStrings.delayScroll
import typings.dojo.dojoStrings.editable
import typings.dojo.dojoStrings.elasticView
import typings.dojo.dojoStrings.errorMessage
import typings.dojo.dojoStrings.escapeHTMLInData
import typings.dojo.dojoStrings.fastScroll
import typings.dojo.dojoStrings.formatterScope
import typings.dojo.dojoStrings.headerMenu
import typings.dojo.dojoStrings.height
import typings.dojo.dojoStrings.initialWidth
import typings.dojo.dojoStrings.invalidated
import typings.dojo.dojoStrings.keepRows
import typings.dojo.dojoStrings.loadingMessage
import typings.dojo.dojoStrings.noDataMessage
import typings.dojo.dojoStrings.placeholderLabel
import typings.dojo.dojoStrings.rowCount
import typings.dojo.dojoStrings.rowHeight
import typings.dojo.dojoStrings.rowSelector
import typings.dojo.dojoStrings.rowsPerPage
import typings.dojo.dojoStrings.scrollRedrawThreshold
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.selectable
import typings.dojo.dojoStrings.selectionMode
import typings.dojo.dojoStrings.singleClickEdit
import typings.dojo.dojoStrings.sortInfo
import typings.dojo.dojoStrings.structure
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.summary
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.updating
import typings.std.Event
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/grid/_Grid.html
  *
  * A grid widget with virtual scrolling, cell editing, complex rows,
  * sorting, fixed columns, sizeable columns, etc.
  * _Grid provides the full set of grid features without any
  * direct connection to a data store.
  *
  * The grid exposes a get function for the grid, or optionally
  * individual columns, to populate cell contents.
  *
  * The grid is rendered based on its structure, an object describing
  * column and cell layout.
  *
  * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
  * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
- typings.dojo.dojox.grid._Events because Inheritance from two classes. Inlined cellOverClass, onApplyCellEdit, onApplyEdit, onCancelEdit, onCanDeselect, onCanSelect, onCellClick, onCellContextMenu, onCellDblClick, onCellFocus, onCellMouseDown, onCellMouseOut, onCellMouseOver, onContentEvent, onDeselected, onHeaderCellClick, onHeaderCellContextMenu, onHeaderCellDblClick, onHeaderCellMouseDown, onHeaderCellMouseOut, onHeaderCellMouseOver, onHeaderClick, onHeaderContextMenu, onHeaderDblClick, onHeaderEvent, onHeaderMouseOut, onHeaderMouseOver, onKeyDown, onKeyEvent, onMouseDown, onMouseDownRow, onMouseOut, onMouseOutRow, onMouseOver, onMouseOverRow, onRowClick, onRowContextMenu, onRowDblClick, onRowMouseDown, onRowMouseOut, onRowMouseOver, onSelected, onSelectionChanged, onStartEdit, onStyleRow
- typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @JSGlobal("dojox.grid._Grid")
@js.native
class _Grid () extends _Widget {
  def this(params: js.Object) = this()
  def this(params: js.Object, srcNodeRef: HTMLElement) = this()
  /**
    * Object to which attach points and events will be scoped.  Defaults
    * to 'this'.
    *
    */
  var attachScope: js.Object = js.native
  /**
    * If autoHeight is true, grid height is automatically set to fit the data.
    * If it is an integer, the height will be automatically set to fit the data
    * if there are fewer than that many rows - and the height will be set to show
    * that many rows if there are more
    *
    */
  var autoHeight: Boolean = js.native
  /**
    * If autoRender is true, grid will render itself after initialization.
    *
    */
  var autoRender: Boolean = js.native
  /**
    * If autoWidth is true, grid width is automatically set to fit the data.
    *
    */
  var autoWidth: Boolean = js.native
  /**
    * css class to apply to grid cells over which the cursor is placed.
    *
    */
  var cellOverClass: String = js.native
  /**
    * CSS class applied to the grid's domNode
    *
    */
  var classTag: String = js.native
  /**
    * If set to true, will add drag and drop reordering to views with one row of columns.
    *
    */
  var columnReordering: Boolean = js.native
  /**
    * default height of the grid, measured in any valid css unit.
    *
    */
  var defaultHeight: String = js.native
  /**
    *
    */
  var delayScroll: Boolean = js.native
  /**
    * indicates if the grid contains editable cells, default is false
    * set to true if editable cell encountered during rendering
    *
    */
  var editable: Boolean = js.native
  /**
    * Override defaults and make the indexed grid view elastic, thus filling available horizontal space.
    *
    */
  var elasticView: Double = js.native
  /**
    * Message that shows when the grid encounters an error loading
    *
    */
  var errorMessage: String = js.native
  /**
    * This will escape HTML brackets from the data to prevent HTML from
    * user-inputted data being rendered with may contain JavaScript and result in
    * XSS attacks. This is true by default, and it is recommended that it remain
    * true. Setting this to false will allow data to be displayed in the grid without
    * filtering, and should be only used if it is known that the data won't contain
    * malicious scripts. If HTML is needed in grid cells, it is recommended that
    * you use the formatter function to generate the HTML (the output of
    * formatter functions is not filtered, even with escapeHTMLInData set to true).
    *
    */
  var escapeHTMLInData: Boolean = js.native
  /**
    * flag modifies vertical scrolling behavior. Defaults to true but set to false for slower
    * scroll performance but more immediate scrolling feedback
    *
    */
  var fastScroll: Boolean = js.native
  /**
    * An object to execute format functions within.  If not set, the
    * format functions will execute within the scope of the cell that
    * has a format function.
    *
    */
  var formatterScope: js.Object = js.native
  /**
    * If set to a dijit.Menu, will use this as a context menu for the grid headers.
    *
    */
  var headerMenu: js.Object = js.native
  /**
    * explicit height of the grid, measured in any valid css unit.  This will be populated (and overridden)
    * if the height: css attribute exists on the source node.
    *
    */
  var height: String = js.native
  /**
    * A css string to use to set our initial width (only used if autoWidth
    * is true).  The first rendering of the grid will be this width, any
    * resizing of columns, etc will result in the grid switching to
    * autoWidth mode.  Note, this width will override any styling in a
    * stylesheet or directly on the node.
    *
    */
  var initialWidth: String = js.native
  /**
    *
    */
  var invalidated: js.Object = js.native
  /**
    * Number of rows to keep in the rendering cache.
    *
    */
  var keepRows: Double = js.native
  /**
    * Message that shows while the grid is loading
    *
    */
  var loadingMessage: String = js.native
  /**
    * Message that shows if the grid has no data - wrap it in a
    * span with class 'dojoxGridNoData' if you want it to be
    * styled similar to the loading and error messages
    *
    */
  var noDataMessage: String = js.native
  /**
    * Label of placeholders to search for in the header menu to replace with column toggling
    * menu items.
    *
    */
  var placeholderLabel: String = js.native
  /**
    *
    */
  var rowCount: Double = js.native
  /**
    * If rowHeight is set to a positive number, it will define the height of the rows
    * in pixels. This can provide a significant performance advantage, since it
    * eliminates the need to measure row sizes during rendering, which is one
    * the primary bottlenecks in the DataGrid's performance.
    *
    */
  var rowHeight: Double = js.native
  /**
    * If set to true, will add a row selector view to this grid.  If set to a CSS width, will add
    * a row selector of that width to this grid.
    *
    */
  var rowSelector: Boolean = js.native
  /**
    * Number of rows to render at a time.
    *
    */
  var rowsPerPage: Double = js.native
  /**
    * pixel distance a user must scroll vertically to trigger grid scrolling.
    *
    */
  var scrollRedrawThreshold: Double = js.native
  /**
    *
    */
  var searchContainerNode: Boolean = js.native
  /**
    * Set to true if you want to be able to select the text within the grid.
    *
    */
  var selectable: Boolean = js.native
  /**
    * Set the selection mode of grid's Selection.  Value must be 'single', 'multiple',
    * or 'extended'.  Default is 'extended'.
    *
    */
  var selectionMode: String = js.native
  /**
    * Single-click starts editing. Default is double-click
    *
    */
  var singleClickEdit: Boolean = js.native
  /**
    *
    */
  var sortInfo: Double = js.native
  /**
    * View layout defintion.
    *
    */
  var structure: js.Object = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style__Grid: String = js.native
  /**
    * Customizable summary descriptions which will be added to grid.domNode
    *
    */
  var summary: String = js.native
  /**
    * Path to template (HTML file) for this widget relative to dojo.baseUrl.
    * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
    *
    */
  var templatePath: String = js.native
  /**
    *
    */
  var templateString: String = js.native
  /**
    *
    */
  var updating: Boolean = js.native
  /**
    * Add a row to the grid.
    *
    */
  def addRow(): Unit = js.native
  /**
    * Use to make multiple changes to rows while queueing row updating.
    *
    */
  def beginUpdate(): Unit = js.native
  /**
    *
    */
  def buildViews(): Unit = js.native
  /**
    * Determines if the grid can be sorted
    *
    * @param inSortInfo Sort information, 1-based index of column on which to sort, positive for an ascending sortand negative for a descending sort
    */
  def canSort(inSortInfo: Double): Boolean = js.native
  /**
    * Creates a new Grid layout
    *
    */
  def createLayout(): Unit = js.native
  /**
    * create grid managers for various tasks including rows, focus, selection, editing
    *
    */
  def createManagers(): Unit = js.native
  /**
    * Creates a new virtual scroller
    *
    */
  def createScroller(): Unit = js.native
  /**
    *
    */
  def createSelection(): Unit = js.native
  /**
    *
    * @param inClass
    * @param idx
    */
  def createView(inClass: js.Any, idx: js.Any): js.Any = js.native
  /**
    *
    */
  def createViews(): Unit = js.native
  /**
    *
    */
  def defaultUpdate(): Unit = js.native
  /**
    *
    * @param e
    */
  def dispatchContentEvent(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def dispatchHeaderEvent(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def dispatchKeyEvent(e: js.Any): Unit = js.native
  /**
    *
    * @param inValue
    * @param inRowIndex
    * @param inFieldIndex
    */
  def doApplyCellEdit(inValue: js.Any, inRowIndex: js.Any, inFieldIndex: js.Any): Unit = js.native
  /**
    *
    * @param inRowIndex
    */
  def doApplyEdit(inRowIndex: js.Any): Unit = js.native
  /**
    *
    * @param inRowIndex
    */
  def doCancelEdit(inRowIndex: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def doKeyEvent(e: js.Any): Unit = js.native
  /**
    *
    * @param inCell
    * @param inRowIndex
    */
  def doStartEdit(inCell: js.Any, inRowIndex: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def doclick(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def docontextmenu(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def dodblclick(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def doheaderclick(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def doheadercontextmenu(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def doheaderdblclick(e: js.Any): Unit = js.native
  /**
    *
    * @param e
    */
  def dokeydown(e: js.Any): Unit = js.native
  /**
    * Use after calling beginUpdate to render any changes made to rows.
    *
    */
  def endUpdate(): Unit = js.native
  /**
    *
    */
  def finishScrollJob(): Unit = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    */
  def getCachedTemplate(): js.Any = js.native
  /**
    * Static method to get a template based on the templatePath or
    * templateString key
    * 
    * @param templateString The template             
    * @param alwaysUseString Don't cache the DOM tree for this template, even if it doesn't have any variables             
    * @param doc               OptionalThe target document.   Defaults to document global if unspecified.             
    */
  def getCachedTemplate(templateString: String, alwaysUseString: Boolean): js.Any = js.native
  def getCachedTemplate(templateString: String, alwaysUseString: Boolean, doc: HTMLDocument): js.Any = js.native
  /**
    * Retrieves the cell object for a given grid column.
    *
    * @param inIndex Grid column index of cell to retrieve
    */
  def getCell(inIndex: Double): js.Any = js.native
  /**
    * Returns the cell name of a passed cell
    *
    * @param inCell
    */
  def getCellName(inCell: js.Any): String = js.native
  /**
    *
    * @param inColIndex
    * @param inRowIndex
    */
  def getCellNodeTextDirection(inColIndex: js.Any, inRowIndex: js.Any): js.Any = js.native
  /**
    * returns an array of dijit.CheckedMenuItem widgets that can be
    * added to a menu for toggling columns on and off.
    *
    */
  def getColumnTogglingItems(): js.Any = js.native
  /**
    *
    * @param inRowIndex
    */
  def getItem(inRowIndex: js.Any): js.Any = js.native
  /**
    * find the rowNode that is not a rowSelector
    *
    * @param inRowIndex
    */
  def getRowNode(inRowIndex: js.Any): js.Any = js.native
  /**
    * Returns true if grid is sorted in an ascending direction.
    *
    * @param inSortInfo
    */
  def getSortAsc(inSortInfo: js.Any): js.Any = js.native
  /**
    * Returns the index of the column on which the grid is sorted
    *
    * @param inSortInfo
    */
  def getSortIndex(inSortInfo: js.Any): Double = js.native
  @JSName("get")
  def get_attachScope(property: attachScope): js.Object = js.native
  @JSName("get")
  def get_autoHeight(property: autoHeight): Boolean = js.native
  @JSName("get")
  def get_autoRender(property: autoRender): Boolean = js.native
  @JSName("get")
  def get_autoWidth(property: autoWidth): Boolean = js.native
  @JSName("get")
  def get_cellOverClass(property: cellOverClass): String = js.native
  @JSName("get")
  def get_classTag(property: classTag): String = js.native
  @JSName("get")
  def get_columnReordering(property: columnReordering): Boolean = js.native
  @JSName("get")
  def get_defaultHeight(property: defaultHeight): String = js.native
  @JSName("get")
  def get_delayScroll(property: delayScroll): Boolean = js.native
  @JSName("get")
  def get_editable(property: editable): Boolean = js.native
  @JSName("get")
  def get_elasticView(property: elasticView): Double = js.native
  @JSName("get")
  def get_errorMessage(property: errorMessage): String = js.native
  @JSName("get")
  def get_escapeHTMLInData(property: escapeHTMLInData): Boolean = js.native
  @JSName("get")
  def get_fastScroll(property: fastScroll): Boolean = js.native
  @JSName("get")
  def get_formatterScope(property: formatterScope): js.Object = js.native
  @JSName("get")
  def get_headerMenu(property: headerMenu): js.Object = js.native
  @JSName("get")
  def get_height(property: height): String = js.native
  @JSName("get")
  def get_initialWidth(property: initialWidth): String = js.native
  @JSName("get")
  def get_invalidated(property: invalidated): js.Object = js.native
  @JSName("get")
  def get_keepRows(property: keepRows): Double = js.native
  @JSName("get")
  def get_loadingMessage(property: loadingMessage): String = js.native
  @JSName("get")
  def get_noDataMessage(property: noDataMessage): String = js.native
  @JSName("get")
  def get_placeholderLabel(property: placeholderLabel): String = js.native
  @JSName("get")
  def get_rowCount(property: rowCount): Double = js.native
  @JSName("get")
  def get_rowHeight(property: rowHeight): Double = js.native
  @JSName("get")
  def get_rowSelector(property: rowSelector): Boolean = js.native
  @JSName("get")
  def get_rowsPerPage(property: rowsPerPage): Double = js.native
  @JSName("get")
  def get_scrollRedrawThreshold(property: scrollRedrawThreshold): Double = js.native
  @JSName("get")
  def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
  @JSName("get")
  def get_selectable(property: selectable): Boolean = js.native
  @JSName("get")
  def get_selectionMode(property: selectionMode): String = js.native
  @JSName("get")
  def get_singleClickEdit(property: singleClickEdit): Boolean = js.native
  @JSName("get")
  def get_sortInfo(property: sortInfo): Double = js.native
  @JSName("get")
  def get_structure(property: structure): js.Object = js.native
  @JSName("get")
  def get_summary(property: summary): String = js.native
  @JSName("get")
  def get_templatePath(property: templatePath): String = js.native
  @JSName("get")
  def get_templateString(property: templateString): String = js.native
  @JSName("get")
  def get_updating(property: updating): Boolean = js.native
  /**
    *
    */
  def hasLayout(): js.Any = js.native
  /**
    *
    * @param props
    * @param node
    * @param ctor
    * @param cellFunc
    */
  def markupFactory(props: js.Any, node: js.Any, ctor: js.Any, cellFunc: js.Any): Unit = js.native
  /**
    * Event fired when editing is applied for a given grid cell
    *
    * @param inValue Value from cell editor
    * @param inRowIndex Index of the grid row
    * @param inFieldIndex Index in the grid's data store
    */
  def onApplyCellEdit(inValue: String, inRowIndex: Double, inFieldIndex: Double): Unit = js.native
  /**
    * Event fired when editing is applied for a given grid row
    *
    * @param inRowIndex Index of the grid row
    */
  def onApplyEdit(inRowIndex: Double): Unit = js.native
  /**
    * Event to determine if a grid row may be deselected
    *
    * @param inRowIndex Index of the grid row
    */
  def onCanDeselect(inRowIndex: Double): js.Any = js.native
  /**
    * Event to determine if a grid row may be selected
    *
    * @param inRowIndex Index of the grid row
    */
  def onCanSelect(inRowIndex: Double): js.Any = js.native
  /**
    * Event fired when editing is cancelled for a given grid cell
    *
    * @param inRowIndex Index of the grid row
    */
  def onCancelEdit(inRowIndex: Double): Unit = js.native
  /**
    * Event fired when a cell is clicked.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onCellClick(e: Event): Unit = js.native
  /**
    * Event fired when a cell context menu is accessed via mouse right click.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onCellContextMenu(e: Event): Unit = js.native
  /**
    * Event fired when a cell is double-clicked.
    *
    * @param e Decorated event object contains reference to grid, cell, and rowIndex
    */
  def onCellDblClick(e: Event): Unit = js.native
  /**
    * Event fired when a cell receives focus.
    *
    * @param inCell Cell object containing properties of the grid column.
    * @param inRowIndex Index of the grid row
    */
  def onCellFocus(inCell: js.Object, inRowIndex: Double): Unit = js.native
  /**
    * Event fired when mouse is down in a header cell.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onCellMouseDown(e: Event): Unit = js.native
  /**
    * Event fired when mouse moves out of a cell.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onCellMouseOut(e: Event): Unit = js.native
  /**
    * Event fired when mouse is over a cell.
    *
    * @param e Decorated event object contains reference to grid, cell, and rowIndex
    */
  def onCellMouseOver(e: Event): Unit = js.native
  /**
    * Top level handler for Content events
    *
    * @param e
    */
  def onContentEvent(e: js.Any): Unit = js.native
  /**
    * Event fired when a grid row is deselected
    *
    * @param inRowIndex Index of the grid row
    */
  def onDeselected(inRowIndex: Double): Unit = js.native
  /**
    * Event fired when a header cell is clicked.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderCellClick(e: Event): Unit = js.native
  /**
    * Event fired when a header cell context menu is accessed via mouse right click.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderCellContextMenu(e: Event): Unit = js.native
  /**
    * Event fired when a header cell is double clicked.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderCellDblClick(e: Event): Unit = js.native
  /**
    * Event fired when mouse is down in a header cell.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderCellMouseDown(e: Event): Unit = js.native
  /**
    * Event fired when mouse moves out of a header cell.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderCellMouseOut(e: Event): Unit = js.native
  /**
    * Event fired when mouse moves over a header cell.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderCellMouseOver(e: Event): Unit = js.native
  /**
    * Event fired when the grid header is clicked.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderClick(e: Event): Unit = js.native
  /**
    * Event fired when the grid header context menu is accessed via mouse right click.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderContextMenu(e: Event): Unit = js.native
  /**
    * Event fired when the grid header is double clicked.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderDblClick(e: Event): Unit = js.native
  /**
    * Top level handler for header events
    *
    * @param e
    */
  def onHeaderEvent(e: js.Any): Unit = js.native
  /**
    * Event fired when mouse moves out of the grid header.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onHeaderMouseOut(e: Event): Unit = js.native
  /**
    * Event fired when mouse moves over the grid header.
    *
    * @param e Decorated event object contains reference to grid, cell, and rowIndex
    */
  def onHeaderMouseOver(e: Event): Unit = js.native
  /**
    * top level handler for Key Events
    *
    * @param e
    */
  def onKeyEvent(e: js.Any): Unit = js.native
  /**
    * Event fired when mouse is down inside grid.
    *
    * @param e Decorated event object that contains reference to grid, cell, and rowIndex
    */
  def onMouseDown(e: Event): Unit = js.native
  /**
    * Event fired when mouse is down inside grid row
    *
    * @param e Decorated event object that contains reference to grid, cell, and rowIndex
    */
  def onMouseDownRow(e: Event): Unit = js.native
  /**
    * Event fired when mouse moves out of the grid.
    *
    * @param e Decorated event object that contains reference to grid, cell, and rowIndex
    */
  def onMouseOut(e: Event): Unit = js.native
  /**
    * Event fired when mouse moves out of any row (data or header).
    *
    * @param e Decorated event object contains reference to grid, cell, and rowIndex
    */
  def onMouseOutRow(e: Event): Unit = js.native
  /**
    * Event fired when mouse is over the grid.
    *
    * @param e Decorated event object contains reference to grid, cell, and rowIndex
    */
  def onMouseOver(e: Event): Unit = js.native
  /**
    * Event fired when mouse is over any row (data or header).
    *
    * @param e Decorated event object contains reference to grid, cell, and rowIndex
    */
  def onMouseOverRow(e: Event): Unit = js.native
  /**
    *
    */
  def onMoveColumn(): Unit = js.native
  /**
    *
    * @param cellIdx
    */
  def onResizeColumn(cellIdx: Double): Unit = js.native
  /**
    * Event fired when a row is clicked.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onRowClick(e: Event): Unit = js.native
  /**
    * Event fired when a row context menu is accessed via mouse right click.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onRowContextMenu(e: Event): Unit = js.native
  /**
    * Event fired when a row is double clicked.
    *
    * @param e decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onRowDblClick(e: Event): Unit = js.native
  /**
    * Event fired when mouse is down in a row.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onRowMouseDown(e: Event): Unit = js.native
  /**
    * Event fired when mouse moves out of a data row.
    *
    * @param e Decorated event object contains reference to grid, cell, and rowIndex
    */
  def onRowMouseOut(e: Event): Unit = js.native
  /**
    * Event fired when mouse moves over a data row.
    *
    * @param e Decorated event object which contains reference to grid, cell, and rowIndex
    */
  def onRowMouseOver(e: Event): Unit = js.native
  /**
    * Event fired when a grid row is selected
    *
    * @param inRowIndex Index of the grid row
    */
  def onSelected(inRowIndex: Double): Unit = js.native
  /**
    *
    */
  def onSelectionChanged(): Unit = js.native
  /**
    * Event fired when editing is started for a given grid cell
    *
    * @param inCell Cell object containing properties of the grid column.
    * @param inRowIndex Index of the grid row
    */
  def onStartEdit(inCell: js.Object, inRowIndex: Double): Unit = js.native
  /**
    * Perform row styling on a given row. Called whenever row styling is updated.
    *
    * @param inRow Object containing row state information: selected, true if the row is selcted; over:true of the mouse is over the row; odd: true if the row is odd. Use customClasses andcustomStyles to control row css classes and styles; both properties are strings.
    */
  def onStyleRow(inRow: js.Object): Unit = js.native
  /**
    *
    */
  def postrender(): Unit = js.native
  /**
    *
    */
  def postresize(): Unit = js.native
  /**
    *
    */
  def prerender(): Unit = js.native
  /**
    * Remove the selected rows from the grid.
    *
    */
  def removeSelectedRows(): Unit = js.native
  /**
    * Render the grid, headers, and views. Edit and scrolling states are reset. To retain edit and
    * scrolling states, see Update.
    *
    */
  def render(): Unit = js.native
  /**
    * Update the grid's rendering dimensions and resize it
    *
    * @param changeSize
    * @param resultSize
    */
  def resize(changeSize: js.Any, resultSize: js.Any): Unit = js.native
  /**
    * Update grid when the height of a row has changed. Row height is handled automatically as rows
    * are rendered. Use this function only to update a row's height outside the normal rendering process.
    *
    * @param inRowIndex index of the row that has changed height
    */
  def rowHeightChanged(inRowIndex: Double): Unit = js.native
  /**
    * Vertically scroll the grid to a given pixel position
    *
    * @param inTop vertical position of the grid in pixels
    */
  def scrollTo(inTop: Double): Unit = js.native
  /**
    * Scroll the grid to a specific row.
    *
    * @param inRowIndex grid row index
    */
  def scrollToRow(inRowIndex: Double): Unit = js.native
  /**
    *
    * @param inColIndex
    * @param inRowIndex
    * @param textDir
    */
  def setCellNodeTextDirection(inColIndex: js.Any, inRowIndex: js.Any, textDir: js.Any): Unit = js.native
  /**
    *
    * @param inIndex
    * @param inUnitWidth
    */
  def setCellWidth(inIndex: js.Any, inUnitWidth: js.Any): Unit = js.native
  /**
    *
    * @param menu
    */
  def setHeaderMenu(menu: Menu): Unit = js.native
  /**
    *
    * @param inTop
    */
  def setScrollTop(inTop: js.Any): Unit = js.native
  /**
    * Sort the grid on a column in a specified direction
    *
    * @param inIndex Column index on which to sort.
    * @param inAsc If true, sort the grid in ascending order, otherwise in descending order
    */
  def setSortIndex(inIndex: Double, inAsc: Boolean): Unit = js.native
  /**
    *
    * @param inSortInfo
    */
  def setSortInfo(inSortInfo: js.Any): Unit = js.native
  /**
    * Install a new structure and rebuild the grid.
    *
    * @param inStructure
    */
  def setStructure(inStructure: js.Array[js.Object]): Unit = js.native
  /**
    * Install a new structure and rebuild the grid.
    *
    * @param inStructure
    */
  def setStructure(inStructure: js.Object): Unit = js.native
  @JSName("set")
  def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_autoHeight(property: autoHeight, value: Boolean): Unit = js.native
  @JSName("set")
  def set_autoRender(property: autoRender, value: Boolean): Unit = js.native
  @JSName("set")
  def set_autoWidth(property: autoWidth, value: Boolean): Unit = js.native
  @JSName("set")
  def set_cellOverClass(property: cellOverClass, value: String): Unit = js.native
  @JSName("set")
  def set_classTag(property: classTag, value: String): Unit = js.native
  @JSName("set")
  def set_columnReordering(property: columnReordering, value: Boolean): Unit = js.native
  @JSName("set")
  def set_defaultHeight(property: defaultHeight, value: String): Unit = js.native
  @JSName("set")
  def set_delayScroll(property: delayScroll, value: Boolean): Unit = js.native
  @JSName("set")
  def set_editable(property: editable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_elasticView(property: elasticView, value: Double): Unit = js.native
  @JSName("set")
  def set_errorMessage(property: errorMessage, value: String): Unit = js.native
  @JSName("set")
  def set_escapeHTMLInData(property: escapeHTMLInData, value: Boolean): Unit = js.native
  @JSName("set")
  def set_fastScroll(property: fastScroll, value: Boolean): Unit = js.native
  @JSName("set")
  def set_formatterScope(property: formatterScope, value: js.Object): Unit = js.native
  @JSName("set")
  def set_headerMenu(property: headerMenu, value: js.Object): Unit = js.native
  @JSName("set")
  def set_height(property: height, value: String): Unit = js.native
  @JSName("set")
  def set_initialWidth(property: initialWidth, value: String): Unit = js.native
  @JSName("set")
  def set_invalidated(property: invalidated, value: js.Object): Unit = js.native
  @JSName("set")
  def set_keepRows(property: keepRows, value: Double): Unit = js.native
  @JSName("set")
  def set_loadingMessage(property: loadingMessage, value: String): Unit = js.native
  @JSName("set")
  def set_noDataMessage(property: noDataMessage, value: String): Unit = js.native
  @JSName("set")
  def set_placeholderLabel(property: placeholderLabel, value: String): Unit = js.native
  @JSName("set")
  def set_rowCount(property: rowCount, value: Double): Unit = js.native
  @JSName("set")
  def set_rowHeight(property: rowHeight, value: Double): Unit = js.native
  @JSName("set")
  def set_rowSelector(property: rowSelector, value: Boolean): Unit = js.native
  @JSName("set")
  def set_rowsPerPage(property: rowsPerPage, value: Double): Unit = js.native
  @JSName("set")
  def set_scrollRedrawThreshold(property: scrollRedrawThreshold, value: Double): Unit = js.native
  @JSName("set")
  def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
  @JSName("set")
  def set_selectable(property: selectable, value: Boolean): Unit = js.native
  @JSName("set")
  def set_selectionMode(property: selectionMode, value: String): Unit = js.native
  @JSName("set")
  def set_singleClickEdit(property: singleClickEdit, value: Boolean): Unit = js.native
  @JSName("set")
  def set_sortInfo(property: sortInfo, value: Double): Unit = js.native
  @JSName("set")
  def set_structure(property: structure, value: js.Object): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_summary(property: summary, value: String): Unit = js.native
  @JSName("set")
  def set_templatePath(property: templatePath, value: String): Unit = js.native
  @JSName("set")
  def set_templateString(property: templateString, value: String): Unit = js.native
  @JSName("set")
  def set_updating(property: updating, value: Boolean): Unit = js.native
  /**
    *
    */
  def setupHeaderMenu(): Unit = js.native
  /**
    *
    * @param message
    */
  def showMessage(message: js.Any): Unit = js.native
  /**
    *
    */
  def sizeChange(): Unit = js.native
  /**
    *
    */
  def sort(): Unit = js.native
  /**
    *
    */
  def textSizeChanged(): Unit = js.native
  /**
    * Update the grid, retaining edit and scrolling states.
    *
    */
  def update(): Unit = js.native
  /**
    * Render a single row.
    *
    * @param inRowIndex Index of the row to render
    */
  def updateRow(inRowIndex: Double): Unit = js.native
  /**
    * Change the number of rows.
    *
    * @param inRowCount Number of rows in the grid.
    */
  def updateRowCount(inRowCount: Double): Unit = js.native
  /**
    * Update the styles for a row after it's state has changed.
    *
    * @param inRowIndex
    */
  def updateRowStyles(inRowIndex: js.Any): Unit = js.native
  /**
    * Render consecutive rows at once.
    *
    * @param startIndex Index of the starting row to render
    * @param howMany How many rows to update.
    */
  def updateRows(startIndex: Double, howMany: Double): Unit = js.native
  @JSName("watch")
  def watch_attachScope(
    property: attachScope,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_autoHeight(
    property: autoHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_autoRender(
    property: autoRender,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_autoWidth(
    property: autoWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_cellOverClass(
    property: cellOverClass,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_classTag(
    property: classTag,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_columnReordering(
    property: columnReordering,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_defaultHeight(
    property: defaultHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_delayScroll(
    property: delayScroll,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_editable(
    property: editable,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_elasticView(
    property: elasticView,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_errorMessage(
    property: errorMessage,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_escapeHTMLInData(
    property: escapeHTMLInData,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_fastScroll(
    property: fastScroll,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_formatterScope(
    property: formatterScope,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_headerMenu(
    property: headerMenu,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_height(
    property: height,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_initialWidth(
    property: initialWidth,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_invalidated(
    property: invalidated,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_keepRows(
    property: keepRows,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_loadingMessage(
    property: loadingMessage,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_noDataMessage(
    property: noDataMessage,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_placeholderLabel(
    property: placeholderLabel,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_rowCount(
    property: rowCount,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_rowHeight(
    property: rowHeight,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_rowSelector(
    property: rowSelector,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_rowsPerPage(
    property: rowsPerPage,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_scrollRedrawThreshold(
    property: scrollRedrawThreshold,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_searchContainerNode(
    property: searchContainerNode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_selectable(
    property: selectable,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_selectionMode(
    property: selectionMode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_singleClickEdit(
    property: singleClickEdit,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_sortInfo(
    property: sortInfo,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_structure(
    property: structure,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_summary(
    property: summary,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templatePath(
    property: templatePath,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_templateString(
    property: templateString,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): Anon_Unwatch = js.native
  @JSName("watch")
  def watch_updating(
    property: updating,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): Anon_Unwatch = js.native
}

