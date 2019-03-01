package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggered for every action before its starts.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, scala.Unit]] = js.undefined
  /** Triggered for every action complete.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets an active sheet index in the Spreadsheet. By defining this value, you can specify which sheet should be active in workbook.
    * @Default {1}
    */
  var activeSheetIndex: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable auto rendering of cell type in the Spreadsheet.
    * @Default {false}
    */
  var allowAutoCellType: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable auto fill feature in the Spreadsheet.
    * @Default {true}
    */
  var allowAutoFill: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable auto sum feature in the Spreadsheet.
    * @Default {true}
    */
  var allowAutoSum: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable cell format feature in the Spreadsheet. By enabling this, you can customize styles and number formats.
    * @Default {true}
    */
  var allowCellFormatting: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable cell type feature in the Spreadsheet.
    * @Default {false}
    */
  var allowCellType: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable chart feature in the Spreadsheet. By enabling this feature, you can create and customize charts in Spreadsheet.
    * @Default {true}
    */
  var allowCharts: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable clear feature in the Spreadsheet.
    * @Default {true}
    */
  var allowClear: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable clipboard feature in the Spreadsheet. By enabling this feature, you can perform cut/copy and paste operations in
    * Spreadsheet.
    * @Default {true}
    */
  var allowClipboard: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable comment feature in the Spreadsheet. By enabling this, you can add/delete/modify comments in Spreadsheet.
    * @Default {true}
    */
  var allowComments: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable Conditional Format feature in the Spreadsheet. By enabling this, you can apply formatting to the selected range of
    * cells based on the provided conditions (Greater than, Less than, Equal, Between, Contains, etc.).
    * @Default {true}
    */
  var allowConditionalFormats: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable data validation feature in the Spreadsheet.
    * @Default {true}
    */
  var allowDataValidation: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable the delete action in the Spreadsheet. By enabling this feature, you can delete existing rows, columns, cells and
    * sheet.
    * @Default {true}
    */
  var allowDelete: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable drag and drop feature in the Spreadsheet.
    * @Default {true}
    */
  var allowDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable the edit action in the Spreadsheet.
    * @Default {true}
    */
  var allowEditing: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable filtering feature in the Spreadsheet. Filtering can be used to limit the data displayed using required criteria.
    * @Default {true}
    */
  var allowFiltering: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable table feature in the Spreadsheet. By enabling this, you can render table in selected range.
    * @Default {true}
    */
  var allowFormatAsTable: js.UndefOr[scala.Boolean] = js.undefined
  /** Get or sets a value that indicates whether to enable or disable format painter feature in the Spreadsheet. By enabling this feature, you can copy the format from the selected
    * range and apply it to another range.
    * @Default {true}
    */
  var allowFormatPainter: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable formula bar in the Spreadsheet.
    * @Default {true}
    */
  var allowFormulaBar: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable freeze pane support in Spreadsheet. By enabling this feature, you can use freeze top row, freeze first column and
    * freeze panes options.
    * @Default {true}
    */
  var allowFreezing: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable hyperlink feature in the Spreadsheet. By enabling this feature, you can add hyperlink which is used to easily
    * navigate to the cell reference from one sheet to another or a web page.
    * @Default {true}
    */
  var allowHyperlink: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable import feature in the Spreadsheet. By enabling this feature, you can open existing Spreadsheet documents.
    * @Default {true}
    */
  var allowImport: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable the insert action in the Spreadsheet. By enabling this feature, you can insert new rows, columns, cells and sheet.
    * @Default {true}
    */
  var allowInsert: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable keyboard navigation feature in the Spreadsheet.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable lock cell feature in the Spreadsheet.
    * @Default {true}
    */
  var allowLockCell: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable merge feature in the Spreadsheet.
    * @Default {true}
    */
  var allowMerging: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable overflow feature in the Spreadsheet.
    * @Default {true}
    */
  var allowOverflow: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable resizing feature in the Spreadsheet. By enabling this feature, you can change the column width and row height by
    * dragging its header boundaries.
    * @Default {true}
    */
  var allowResizing: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable find and replace feature in the Spreadsheet. By enabling this, you can easily find and replace a specific value in
    * the sheet or workbook. By using goto behavior, you can select and highlight all cells that contains specific data or data types.
    * @Default {true}
    */
  var allowSearching: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable selection in the Spreadsheet. By enabling this feature, selected items will be highlighted.
    * @Default {true}
    */
  var allowSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the sorting feature in the Spreadsheet.
    * @Default {true}
    */
  var allowSorting: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable the sparkline feature in the Spreadsheet.
    * @Default {false}
    */
  var allowSparkline: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable undo and redo feature in the Spreadsheet.
    * @Default {true}
    */
  var allowUndoRedo: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable wrap text feature in the Spreadsheet. By enabling this, cell content can wrap to the next line, if the cell
    * content exceeds the boundary of the cell.
    * @Default {true}
    */
  var allowWrap: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates to define the width of the activation panel in Spreadsheet.
    * @Default {300}
    */
  var apWidth: js.UndefOr[scala.Double] = js.undefined
  /** Triggered when the auto fill operation begins.
    */
  var autoFillBegin: js.UndefOr[js.Function1[/* e */ AutoFillBeginEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the auto fill operation completes.
    */
  var autoFillComplete: js.UndefOr[js.Function1[/* e */ AutoFillCompleteEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets an object that indicates to customize the auto fill behavior in the Spreadsheet.
    */
  var autoFillSettings: js.UndefOr[AutoFillSettings] = js.undefined
  /** Triggered before the batch save.
    */
  var beforeBatchSave: js.UndefOr[js.Function1[/* e */ BeforeBatchSaveEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the cells to be formatted.
    */
  var beforeCellFormat: js.UndefOr[js.Function1[/* e */ BeforeCellFormatEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the cell selection.
    */
  var beforeCellSelect: js.UndefOr[js.Function1[/* e */ BeforeCellSelectEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the selected cells are dropped.
    */
  var beforeDrop: js.UndefOr[js.Function1[/* e */ BeforeDropEventArgs, scala.Unit]] = js.undefined
  /** Triggered while start to edit the comment.
    */
  var beforeEditComment: js.UndefOr[js.Function1[/* e */ BeforeEditCommentEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the contextmenu is open.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the activation panel is open.
    */
  var beforePanelOpen: js.UndefOr[js.Function1[/* e */ BeforePanelOpenEventArgs, scala.Unit]] = js.undefined
  /** Triggered when click on sheet cell.
    */
  var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the cell is edited.
    */
  var cellEdit: js.UndefOr[js.Function1[/* e */ CellEditEventArgs, scala.Unit]] = js.undefined
  /** Triggered while cell is formatting.
    */
  var cellFormatting: js.UndefOr[js.Function1[/* e */ CellFormattingEventArgs, scala.Unit]] = js.undefined
  /** Triggered when mouse hover on cell in sheets.
    */
  var cellHover: js.UndefOr[js.Function1[/* e */ CellHoverEventArgs, scala.Unit]] = js.undefined
  /** Triggered when save the edited cell.
    */
  var cellSave: js.UndefOr[js.Function1[/* e */ CellSaveEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the cell is selected.
    */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets an object that indicates to customize the chart behavior in the Spreadsheet.
    */
  var chartSettings: js.UndefOr[ChartSettings] = js.undefined
  /** Gets or sets a value that defines the number of columns displayed in the sheet.
    * @Default {21}
    */
  var columnCount: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets a value that indicates to define the common width for each column in the Spreadsheet.
    * @Default {64}
    */
  var columnWidth: js.UndefOr[scala.Double] = js.undefined
  /** Triggered when click the contextmenu items.
    */
  var contextMenuClick: js.UndefOr[js.Function1[/* e */ ContextMenuClickEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets a value to add root CSS class for customizing Spreadsheet skins.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates custom formulas in Spreadsheet.
    * @Default {[]}
    */
  var customFormulas: js.UndefOr[js.Array[_]] = js.undefined
  /** Triggered when the selected cells are being dragged.
    */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, scala.Unit]] = js.undefined
  /** Triggered when you start to drag the picture or chart.
    */
  var dragShape: js.UndefOr[js.Function1[/* e */ DragShapeEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the selected cells are initiated to drag.
    */
  var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the selected cells are dropped.
    */
  var drop: js.UndefOr[js.Function1[/* e */ DropEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the range editing starts.
    */
  var editRangeBegin: js.UndefOr[js.Function1[/* e */ EditRangeBeginEventArgs, scala.Unit]] = js.undefined
  /** Triggered after range editing completes.
    */
  var editRangeComplete: js.UndefOr[js.Function1[/* e */ EditRangeCompleteEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable context menu in the Spreadsheet.
    * @Default {true}
    */
  var enableContextMenu: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable pivot table in the Spreadsheet.
    * @Default {false}
    */
  var enablePivotTable: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable touch support in the Spreadsheet.
    * @Default {true}
    */
  var enableTouch: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets an object that indicates to customize the exporting behavior in Spreadsheet.
    */
  var exportSettings: js.UndefOr[ExportSettings] = js.undefined
  /** Gets or sets an object that indicates to customize the format behavior in the Spreadsheet.
    */
  var formatSettings: js.UndefOr[FormatSettings] = js.undefined
  /** Gets or sets an object that indicates to customize the import behavior in the Spreadsheet.
    */
  var importSettings: js.UndefOr[ImportSettings] = js.undefined
  /** Gets a value that indicates whether importing or not while loading the sheets in Spreadsheet.
    * @Default {false}
    */
  var isImport: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to enable or disable readonly support in the Spreadsheet.
    * @Default {false}
    */
  var isReadOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggered when the key is pressed down.
    */
  var keyDown: js.UndefOr[js.Function1[/* e */ KeyDownEventArgs, scala.Unit]] = js.undefined
  /** Triggered when the key is released.
    */
  var keyUp: js.UndefOr[js.Function1[/* e */ KeyUpEventArgs, scala.Unit]] = js.undefined
  /** Triggered before the sheet is loaded.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, scala.Unit]] = js.undefined
  /** Triggered after the sheet is loaded.
    */
  var loadComplete: js.UndefOr[js.Function1[/* e */ LoadCompleteEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data (i.e.) in a language and culture specific
    * to a particular country or region.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Triggered every click of the menu item.
    */
  var menuClick: js.UndefOr[js.Function1[/* e */ MenuClickEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets a value that indicates name manager in Spreadsheet.
    */
  var nameManager: js.UndefOr[js.Array[NameManager]] = js.undefined
  /** Triggered when a file is imported.
    */
  var onImport: js.UndefOr[js.Function1[/* e */ OnImportEventArgs, scala.Unit]] = js.undefined
  /** Triggered when import sheet is failed to open.
    */
  var openFailure: js.UndefOr[js.Function1[/* e */ OpenFailureEventArgs, scala.Unit]] = js.undefined
  /** Triggered when pager item is clicked in the Spreadsheet.
    */
  var pagerClick: js.UndefOr[js.Function1[/* e */ PagerClickEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets an object that indicates to customize the picture behavior in the Spreadsheet.
    */
  var pictureSettings: js.UndefOr[PictureSettings] = js.undefined
  /** Gets or sets an object that indicates to customize the print option in Spreadsheet.
    */
  var printSettings: js.UndefOr[PrintSettings] = js.undefined
  /** Triggered after end of resizing the chart, picture, row and column.
    */
  var resizeEnd: js.UndefOr[js.Function1[/* e */ ResizeEndEventArgs, scala.Unit]] = js.undefined
  /** Triggered when you start resizing the chart, picture, row and column.
    */
  var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, scala.Unit]] = js.undefined
  /** Triggered when click on the ribbon.
    */
  var ribbonClick: js.UndefOr[js.Function1[/* e */ RibbonClickEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets an object that indicates to customize the ribbon settings in Spreadsheet.
    */
  var ribbonSettings: js.UndefOr[RibbonSettings] = js.undefined
  /** Gets or sets a value that indicates whether to define the number of rows to be displayed in the sheet.
    * @Default {20}
    */
  var rowCount: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets a value that indicates to define the common height for each row in the sheet.
    * @Default {20}
    */
  var rowHeight: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets an object that indicates to customize the scroll options in the Spreadsheet.
    */
  var scrollSettings: js.UndefOr[ScrollSettings] = js.undefined
  /** Gets or sets an object that indicates to customize the selection options in the Spreadsheet.
    */
  var selectionSettings: js.UndefOr[SelectionSettings] = js.undefined
  /** Gets or sets a value that indicates to define the number of sheets to be created at the initial load.
    * @Default {1}
    */
  var sheetCount: js.UndefOr[scala.Double] = js.undefined
  /** Gets or sets an object that indicates to customize the sheet behavior in Spreadsheet.
    */
  var sheets: js.UndefOr[js.Array[Sheet]] = js.undefined
  /** Gets or sets a value that indicates whether to show or hide pager in the Spreadsheet.
    * @Default {true}
    */
  var showPager: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to show or hide ribbon in the Spreadsheet.
    * @Default {true}
    */
  var showRibbon: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggered when click the ribbon tab.
    */
  var tabClick: js.UndefOr[js.Function1[/* e */ TabClickEventArgs, scala.Unit]] = js.undefined
  /** Triggered when select the ribbon tab.
    */
  var tabSelect: js.UndefOr[js.Function1[/* e */ TabSelectEventArgs, scala.Unit]] = js.undefined
  /** This is used to set the number of undo-redo steps in the Spreadsheet.
    * @Default {20}
    */
  var undoRedoStep: js.UndefOr[scala.Double] = js.undefined
  /** Define the username for the Spreadsheet which is displayed in comment.
    * @Default {User Name}
    */
  var userName: js.UndefOr[java.lang.String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    actionBegin: js.Function1[/* e */ ActionBeginEventArgs, scala.Unit] = null,
    actionComplete: js.Function1[/* e */ ActionCompleteEventArgs, scala.Unit] = null,
    activeSheetIndex: scala.Int | scala.Double = null,
    allowAutoCellType: js.UndefOr[scala.Boolean] = js.undefined,
    allowAutoFill: js.UndefOr[scala.Boolean] = js.undefined,
    allowAutoSum: js.UndefOr[scala.Boolean] = js.undefined,
    allowCellFormatting: js.UndefOr[scala.Boolean] = js.undefined,
    allowCellType: js.UndefOr[scala.Boolean] = js.undefined,
    allowCharts: js.UndefOr[scala.Boolean] = js.undefined,
    allowClear: js.UndefOr[scala.Boolean] = js.undefined,
    allowClipboard: js.UndefOr[scala.Boolean] = js.undefined,
    allowComments: js.UndefOr[scala.Boolean] = js.undefined,
    allowConditionalFormats: js.UndefOr[scala.Boolean] = js.undefined,
    allowDataValidation: js.UndefOr[scala.Boolean] = js.undefined,
    allowDelete: js.UndefOr[scala.Boolean] = js.undefined,
    allowDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined,
    allowEditing: js.UndefOr[scala.Boolean] = js.undefined,
    allowFiltering: js.UndefOr[scala.Boolean] = js.undefined,
    allowFormatAsTable: js.UndefOr[scala.Boolean] = js.undefined,
    allowFormatPainter: js.UndefOr[scala.Boolean] = js.undefined,
    allowFormulaBar: js.UndefOr[scala.Boolean] = js.undefined,
    allowFreezing: js.UndefOr[scala.Boolean] = js.undefined,
    allowHyperlink: js.UndefOr[scala.Boolean] = js.undefined,
    allowImport: js.UndefOr[scala.Boolean] = js.undefined,
    allowInsert: js.UndefOr[scala.Boolean] = js.undefined,
    allowKeyboardNavigation: js.UndefOr[scala.Boolean] = js.undefined,
    allowLockCell: js.UndefOr[scala.Boolean] = js.undefined,
    allowMerging: js.UndefOr[scala.Boolean] = js.undefined,
    allowOverflow: js.UndefOr[scala.Boolean] = js.undefined,
    allowResizing: js.UndefOr[scala.Boolean] = js.undefined,
    allowSearching: js.UndefOr[scala.Boolean] = js.undefined,
    allowSelection: js.UndefOr[scala.Boolean] = js.undefined,
    allowSorting: js.UndefOr[scala.Boolean] = js.undefined,
    allowSparkline: js.UndefOr[scala.Boolean] = js.undefined,
    allowUndoRedo: js.UndefOr[scala.Boolean] = js.undefined,
    allowWrap: js.UndefOr[scala.Boolean] = js.undefined,
    apWidth: scala.Int | scala.Double = null,
    autoFillBegin: js.Function1[/* e */ AutoFillBeginEventArgs, scala.Unit] = null,
    autoFillComplete: js.Function1[/* e */ AutoFillCompleteEventArgs, scala.Unit] = null,
    autoFillSettings: AutoFillSettings = null,
    beforeBatchSave: js.Function1[/* e */ BeforeBatchSaveEventArgs, scala.Unit] = null,
    beforeCellFormat: js.Function1[/* e */ BeforeCellFormatEventArgs, scala.Unit] = null,
    beforeCellSelect: js.Function1[/* e */ BeforeCellSelectEventArgs, scala.Unit] = null,
    beforeDrop: js.Function1[/* e */ BeforeDropEventArgs, scala.Unit] = null,
    beforeEditComment: js.Function1[/* e */ BeforeEditCommentEventArgs, scala.Unit] = null,
    beforeOpen: js.Function1[/* e */ BeforeOpenEventArgs, scala.Unit] = null,
    beforePanelOpen: js.Function1[/* e */ BeforePanelOpenEventArgs, scala.Unit] = null,
    cellClick: js.Function1[/* e */ CellClickEventArgs, scala.Unit] = null,
    cellEdit: js.Function1[/* e */ CellEditEventArgs, scala.Unit] = null,
    cellFormatting: js.Function1[/* e */ CellFormattingEventArgs, scala.Unit] = null,
    cellHover: js.Function1[/* e */ CellHoverEventArgs, scala.Unit] = null,
    cellSave: js.Function1[/* e */ CellSaveEventArgs, scala.Unit] = null,
    cellSelected: js.Function1[/* e */ CellSelectedEventArgs, scala.Unit] = null,
    chartSettings: ChartSettings = null,
    columnCount: scala.Int | scala.Double = null,
    columnWidth: scala.Int | scala.Double = null,
    contextMenuClick: js.Function1[/* e */ ContextMenuClickEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    customFormulas: js.Array[_] = null,
    drag: js.Function1[/* e */ DragEventArgs, scala.Unit] = null,
    dragShape: js.Function1[/* e */ DragShapeEventArgs, scala.Unit] = null,
    dragStart: js.Function1[/* e */ DragStartEventArgs, scala.Unit] = null,
    drop: js.Function1[/* e */ DropEventArgs, scala.Unit] = null,
    editRangeBegin: js.Function1[/* e */ EditRangeBeginEventArgs, scala.Unit] = null,
    editRangeComplete: js.Function1[/* e */ EditRangeCompleteEventArgs, scala.Unit] = null,
    enableContextMenu: js.UndefOr[scala.Boolean] = js.undefined,
    enablePivotTable: js.UndefOr[scala.Boolean] = js.undefined,
    enableTouch: js.UndefOr[scala.Boolean] = js.undefined,
    exportSettings: ExportSettings = null,
    formatSettings: FormatSettings = null,
    importSettings: ImportSettings = null,
    isImport: js.UndefOr[scala.Boolean] = js.undefined,
    isReadOnly: js.UndefOr[scala.Boolean] = js.undefined,
    keyDown: js.Function1[/* e */ KeyDownEventArgs, scala.Unit] = null,
    keyUp: js.Function1[/* e */ KeyUpEventArgs, scala.Unit] = null,
    load: js.Function1[/* e */ LoadEventArgs, scala.Unit] = null,
    loadComplete: js.Function1[/* e */ LoadCompleteEventArgs, scala.Unit] = null,
    locale: java.lang.String = null,
    menuClick: js.Function1[/* e */ MenuClickEventArgs, scala.Unit] = null,
    nameManager: js.Array[NameManager] = null,
    onImport: js.Function1[/* e */ OnImportEventArgs, scala.Unit] = null,
    openFailure: js.Function1[/* e */ OpenFailureEventArgs, scala.Unit] = null,
    pagerClick: js.Function1[/* e */ PagerClickEventArgs, scala.Unit] = null,
    pictureSettings: PictureSettings = null,
    printSettings: PrintSettings = null,
    resizeEnd: js.Function1[/* e */ ResizeEndEventArgs, scala.Unit] = null,
    resizeStart: js.Function1[/* e */ ResizeStartEventArgs, scala.Unit] = null,
    ribbonClick: js.Function1[/* e */ RibbonClickEventArgs, scala.Unit] = null,
    ribbonSettings: RibbonSettings = null,
    rowCount: scala.Int | scala.Double = null,
    rowHeight: scala.Int | scala.Double = null,
    scrollSettings: ScrollSettings = null,
    selectionSettings: SelectionSettings = null,
    sheetCount: scala.Int | scala.Double = null,
    sheets: js.Array[Sheet] = null,
    showPager: js.UndefOr[scala.Boolean] = js.undefined,
    showRibbon: js.UndefOr[scala.Boolean] = js.undefined,
    tabClick: js.Function1[/* e */ TabClickEventArgs, scala.Unit] = null,
    tabSelect: js.Function1[/* e */ TabSelectEventArgs, scala.Unit] = null,
    undoRedoStep: scala.Int | scala.Double = null,
    userName: java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (actionBegin != null) __obj.updateDynamic("actionBegin")(actionBegin)
    if (actionComplete != null) __obj.updateDynamic("actionComplete")(actionComplete)
    if (activeSheetIndex != null) __obj.updateDynamic("activeSheetIndex")(activeSheetIndex.asInstanceOf[js.Any])
    if (!js.isUndefined(allowAutoCellType)) __obj.updateDynamic("allowAutoCellType")(allowAutoCellType)
    if (!js.isUndefined(allowAutoFill)) __obj.updateDynamic("allowAutoFill")(allowAutoFill)
    if (!js.isUndefined(allowAutoSum)) __obj.updateDynamic("allowAutoSum")(allowAutoSum)
    if (!js.isUndefined(allowCellFormatting)) __obj.updateDynamic("allowCellFormatting")(allowCellFormatting)
    if (!js.isUndefined(allowCellType)) __obj.updateDynamic("allowCellType")(allowCellType)
    if (!js.isUndefined(allowCharts)) __obj.updateDynamic("allowCharts")(allowCharts)
    if (!js.isUndefined(allowClear)) __obj.updateDynamic("allowClear")(allowClear)
    if (!js.isUndefined(allowClipboard)) __obj.updateDynamic("allowClipboard")(allowClipboard)
    if (!js.isUndefined(allowComments)) __obj.updateDynamic("allowComments")(allowComments)
    if (!js.isUndefined(allowConditionalFormats)) __obj.updateDynamic("allowConditionalFormats")(allowConditionalFormats)
    if (!js.isUndefined(allowDataValidation)) __obj.updateDynamic("allowDataValidation")(allowDataValidation)
    if (!js.isUndefined(allowDelete)) __obj.updateDynamic("allowDelete")(allowDelete)
    if (!js.isUndefined(allowDragAndDrop)) __obj.updateDynamic("allowDragAndDrop")(allowDragAndDrop)
    if (!js.isUndefined(allowEditing)) __obj.updateDynamic("allowEditing")(allowEditing)
    if (!js.isUndefined(allowFiltering)) __obj.updateDynamic("allowFiltering")(allowFiltering)
    if (!js.isUndefined(allowFormatAsTable)) __obj.updateDynamic("allowFormatAsTable")(allowFormatAsTable)
    if (!js.isUndefined(allowFormatPainter)) __obj.updateDynamic("allowFormatPainter")(allowFormatPainter)
    if (!js.isUndefined(allowFormulaBar)) __obj.updateDynamic("allowFormulaBar")(allowFormulaBar)
    if (!js.isUndefined(allowFreezing)) __obj.updateDynamic("allowFreezing")(allowFreezing)
    if (!js.isUndefined(allowHyperlink)) __obj.updateDynamic("allowHyperlink")(allowHyperlink)
    if (!js.isUndefined(allowImport)) __obj.updateDynamic("allowImport")(allowImport)
    if (!js.isUndefined(allowInsert)) __obj.updateDynamic("allowInsert")(allowInsert)
    if (!js.isUndefined(allowKeyboardNavigation)) __obj.updateDynamic("allowKeyboardNavigation")(allowKeyboardNavigation)
    if (!js.isUndefined(allowLockCell)) __obj.updateDynamic("allowLockCell")(allowLockCell)
    if (!js.isUndefined(allowMerging)) __obj.updateDynamic("allowMerging")(allowMerging)
    if (!js.isUndefined(allowOverflow)) __obj.updateDynamic("allowOverflow")(allowOverflow)
    if (!js.isUndefined(allowResizing)) __obj.updateDynamic("allowResizing")(allowResizing)
    if (!js.isUndefined(allowSearching)) __obj.updateDynamic("allowSearching")(allowSearching)
    if (!js.isUndefined(allowSelection)) __obj.updateDynamic("allowSelection")(allowSelection)
    if (!js.isUndefined(allowSorting)) __obj.updateDynamic("allowSorting")(allowSorting)
    if (!js.isUndefined(allowSparkline)) __obj.updateDynamic("allowSparkline")(allowSparkline)
    if (!js.isUndefined(allowUndoRedo)) __obj.updateDynamic("allowUndoRedo")(allowUndoRedo)
    if (!js.isUndefined(allowWrap)) __obj.updateDynamic("allowWrap")(allowWrap)
    if (apWidth != null) __obj.updateDynamic("apWidth")(apWidth.asInstanceOf[js.Any])
    if (autoFillBegin != null) __obj.updateDynamic("autoFillBegin")(autoFillBegin)
    if (autoFillComplete != null) __obj.updateDynamic("autoFillComplete")(autoFillComplete)
    if (autoFillSettings != null) __obj.updateDynamic("autoFillSettings")(autoFillSettings)
    if (beforeBatchSave != null) __obj.updateDynamic("beforeBatchSave")(beforeBatchSave)
    if (beforeCellFormat != null) __obj.updateDynamic("beforeCellFormat")(beforeCellFormat)
    if (beforeCellSelect != null) __obj.updateDynamic("beforeCellSelect")(beforeCellSelect)
    if (beforeDrop != null) __obj.updateDynamic("beforeDrop")(beforeDrop)
    if (beforeEditComment != null) __obj.updateDynamic("beforeEditComment")(beforeEditComment)
    if (beforeOpen != null) __obj.updateDynamic("beforeOpen")(beforeOpen)
    if (beforePanelOpen != null) __obj.updateDynamic("beforePanelOpen")(beforePanelOpen)
    if (cellClick != null) __obj.updateDynamic("cellClick")(cellClick)
    if (cellEdit != null) __obj.updateDynamic("cellEdit")(cellEdit)
    if (cellFormatting != null) __obj.updateDynamic("cellFormatting")(cellFormatting)
    if (cellHover != null) __obj.updateDynamic("cellHover")(cellHover)
    if (cellSave != null) __obj.updateDynamic("cellSave")(cellSave)
    if (cellSelected != null) __obj.updateDynamic("cellSelected")(cellSelected)
    if (chartSettings != null) __obj.updateDynamic("chartSettings")(chartSettings)
    if (columnCount != null) __obj.updateDynamic("columnCount")(columnCount.asInstanceOf[js.Any])
    if (columnWidth != null) __obj.updateDynamic("columnWidth")(columnWidth.asInstanceOf[js.Any])
    if (contextMenuClick != null) __obj.updateDynamic("contextMenuClick")(contextMenuClick)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (customFormulas != null) __obj.updateDynamic("customFormulas")(customFormulas)
    if (drag != null) __obj.updateDynamic("drag")(drag)
    if (dragShape != null) __obj.updateDynamic("dragShape")(dragShape)
    if (dragStart != null) __obj.updateDynamic("dragStart")(dragStart)
    if (drop != null) __obj.updateDynamic("drop")(drop)
    if (editRangeBegin != null) __obj.updateDynamic("editRangeBegin")(editRangeBegin)
    if (editRangeComplete != null) __obj.updateDynamic("editRangeComplete")(editRangeComplete)
    if (!js.isUndefined(enableContextMenu)) __obj.updateDynamic("enableContextMenu")(enableContextMenu)
    if (!js.isUndefined(enablePivotTable)) __obj.updateDynamic("enablePivotTable")(enablePivotTable)
    if (!js.isUndefined(enableTouch)) __obj.updateDynamic("enableTouch")(enableTouch)
    if (exportSettings != null) __obj.updateDynamic("exportSettings")(exportSettings)
    if (formatSettings != null) __obj.updateDynamic("formatSettings")(formatSettings)
    if (importSettings != null) __obj.updateDynamic("importSettings")(importSettings)
    if (!js.isUndefined(isImport)) __obj.updateDynamic("isImport")(isImport)
    if (!js.isUndefined(isReadOnly)) __obj.updateDynamic("isReadOnly")(isReadOnly)
    if (keyDown != null) __obj.updateDynamic("keyDown")(keyDown)
    if (keyUp != null) __obj.updateDynamic("keyUp")(keyUp)
    if (load != null) __obj.updateDynamic("load")(load)
    if (loadComplete != null) __obj.updateDynamic("loadComplete")(loadComplete)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (menuClick != null) __obj.updateDynamic("menuClick")(menuClick)
    if (nameManager != null) __obj.updateDynamic("nameManager")(nameManager)
    if (onImport != null) __obj.updateDynamic("onImport")(onImport)
    if (openFailure != null) __obj.updateDynamic("openFailure")(openFailure)
    if (pagerClick != null) __obj.updateDynamic("pagerClick")(pagerClick)
    if (pictureSettings != null) __obj.updateDynamic("pictureSettings")(pictureSettings)
    if (printSettings != null) __obj.updateDynamic("printSettings")(printSettings)
    if (resizeEnd != null) __obj.updateDynamic("resizeEnd")(resizeEnd)
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(resizeStart)
    if (ribbonClick != null) __obj.updateDynamic("ribbonClick")(ribbonClick)
    if (ribbonSettings != null) __obj.updateDynamic("ribbonSettings")(ribbonSettings)
    if (rowCount != null) __obj.updateDynamic("rowCount")(rowCount.asInstanceOf[js.Any])
    if (rowHeight != null) __obj.updateDynamic("rowHeight")(rowHeight.asInstanceOf[js.Any])
    if (scrollSettings != null) __obj.updateDynamic("scrollSettings")(scrollSettings)
    if (selectionSettings != null) __obj.updateDynamic("selectionSettings")(selectionSettings)
    if (sheetCount != null) __obj.updateDynamic("sheetCount")(sheetCount.asInstanceOf[js.Any])
    if (sheets != null) __obj.updateDynamic("sheets")(sheets)
    if (!js.isUndefined(showPager)) __obj.updateDynamic("showPager")(showPager)
    if (!js.isUndefined(showRibbon)) __obj.updateDynamic("showRibbon")(showRibbon)
    if (tabClick != null) __obj.updateDynamic("tabClick")(tabClick)
    if (tabSelect != null) __obj.updateDynamic("tabSelect")(tabSelect)
    if (undoRedoStep != null) __obj.updateDynamic("undoRedoStep")(undoRedoStep.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName)
    __obj.asInstanceOf[Model]
  }
}

