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

