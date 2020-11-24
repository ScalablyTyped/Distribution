package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Triggered for every action before its starts.
    */
  var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.native
  
  /** Triggered for every action complete.
    */
  var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.native
  
  /** Gets or sets an active sheet index in the Spreadsheet. By defining this value, you can specify which sheet should be active in workbook.
    * @Default {1}
    */
  var activeSheetIndex: js.UndefOr[Double] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable auto rendering of cell type in the Spreadsheet.
    * @Default {false}
    */
  var allowAutoCellType: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable auto fill feature in the Spreadsheet.
    * @Default {true}
    */
  var allowAutoFill: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable auto sum feature in the Spreadsheet.
    * @Default {true}
    */
  var allowAutoSum: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable cell format feature in the Spreadsheet. By enabling this, you can customize styles and number formats.
    * @Default {true}
    */
  var allowCellFormatting: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable cell type feature in the Spreadsheet.
    * @Default {false}
    */
  var allowCellType: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable chart feature in the Spreadsheet. By enabling this feature, you can create and customize charts in Spreadsheet.
    * @Default {true}
    */
  var allowCharts: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable clear feature in the Spreadsheet.
    * @Default {true}
    */
  var allowClear: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable clipboard feature in the Spreadsheet. By enabling this feature, you can perform cut/copy and paste operations in
    * Spreadsheet.
    * @Default {true}
    */
  var allowClipboard: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable comment feature in the Spreadsheet. By enabling this, you can add/delete/modify comments in Spreadsheet.
    * @Default {true}
    */
  var allowComments: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable Conditional Format feature in the Spreadsheet. By enabling this, you can apply formatting to the selected range of
    * cells based on the provided conditions (Greater than, Less than, Equal, Between, Contains, etc.).
    * @Default {true}
    */
  var allowConditionalFormats: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable data validation feature in the Spreadsheet.
    * @Default {true}
    */
  var allowDataValidation: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable the delete action in the Spreadsheet. By enabling this feature, you can delete existing rows, columns, cells and
    * sheet.
    * @Default {true}
    */
  var allowDelete: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable drag and drop feature in the Spreadsheet.
    * @Default {true}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable the edit action in the Spreadsheet.
    * @Default {true}
    */
  var allowEditing: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable filtering feature in the Spreadsheet. Filtering can be used to limit the data displayed using required criteria.
    * @Default {true}
    */
  var allowFiltering: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable table feature in the Spreadsheet. By enabling this, you can render table in selected range.
    * @Default {true}
    */
  var allowFormatAsTable: js.UndefOr[Boolean] = js.native
  
  /** Get or sets a value that indicates whether to enable or disable format painter feature in the Spreadsheet. By enabling this feature, you can copy the format from the selected
    * range and apply it to another range.
    * @Default {true}
    */
  var allowFormatPainter: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable formula bar in the Spreadsheet.
    * @Default {true}
    */
  var allowFormulaBar: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable freeze pane support in Spreadsheet. By enabling this feature, you can use freeze top row, freeze first column and
    * freeze panes options.
    * @Default {true}
    */
  var allowFreezing: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable hyperlink feature in the Spreadsheet. By enabling this feature, you can add hyperlink which is used to easily
    * navigate to the cell reference from one sheet to another or a web page.
    * @Default {true}
    */
  var allowHyperlink: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable import feature in the Spreadsheet. By enabling this feature, you can open existing Spreadsheet documents.
    * @Default {true}
    */
  var allowImport: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable the insert action in the Spreadsheet. By enabling this feature, you can insert new rows, columns, cells and sheet.
    * @Default {true}
    */
  var allowInsert: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable keyboard navigation feature in the Spreadsheet.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable lock cell feature in the Spreadsheet.
    * @Default {true}
    */
  var allowLockCell: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable merge feature in the Spreadsheet.
    * @Default {true}
    */
  var allowMerging: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable overflow feature in the Spreadsheet.
    * @Default {true}
    */
  var allowOverflow: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable resizing feature in the Spreadsheet. By enabling this feature, you can change the column width and row height by
    * dragging its header boundaries.
    * @Default {true}
    */
  var allowResizing: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable find and replace feature in the Spreadsheet. By enabling this, you can easily find and replace a specific value in
    * the sheet or workbook. By using goto behavior, you can select and highlight all cells that contains specific data or data types.
    * @Default {true}
    */
  var allowSearching: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable selection in the Spreadsheet. By enabling this feature, selected items will be highlighted.
    * @Default {true}
    */
  var allowSelection: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable the sorting feature in the Spreadsheet.
    * @Default {true}
    */
  var allowSorting: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable the sparkline feature in the Spreadsheet.
    * @Default {false}
    */
  var allowSparkline: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable undo and redo feature in the Spreadsheet.
    * @Default {true}
    */
  var allowUndoRedo: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable wrap text feature in the Spreadsheet. By enabling this, cell content can wrap to the next line, if the cell
    * content exceeds the boundary of the cell.
    * @Default {true}
    */
  var allowWrap: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates to define the width of the activation panel in Spreadsheet.
    * @Default {300}
    */
  var apWidth: js.UndefOr[Double] = js.native
  
  /** Triggered when the auto fill operation begins.
    */
  var autoFillBegin: js.UndefOr[js.Function1[/* e */ AutoFillBeginEventArgs, Unit]] = js.native
  
  /** Triggered when the auto fill operation completes.
    */
  var autoFillComplete: js.UndefOr[js.Function1[/* e */ AutoFillCompleteEventArgs, Unit]] = js.native
  
  /** Gets or sets an object that indicates to customize the auto fill behavior in the Spreadsheet.
    */
  var autoFillSettings: js.UndefOr[AutoFillSettings] = js.native
  
  /** Triggered before the batch save.
    */
  var beforeBatchSave: js.UndefOr[js.Function1[/* e */ BeforeBatchSaveEventArgs, Unit]] = js.native
  
  /** Triggered before the cells to be formatted.
    */
  var beforeCellFormat: js.UndefOr[js.Function1[/* e */ BeforeCellFormatEventArgs, Unit]] = js.native
  
  /** Triggered before the cell selection.
    */
  var beforeCellSelect: js.UndefOr[js.Function1[/* e */ BeforeCellSelectEventArgs, Unit]] = js.native
  
  /** Triggered before the selected cells are dropped.
    */
  var beforeDrop: js.UndefOr[js.Function1[/* e */ BeforeDropEventArgs, Unit]] = js.native
  
  /** Triggered while start to edit the comment.
    */
  var beforeEditComment: js.UndefOr[js.Function1[/* e */ BeforeEditCommentEventArgs, Unit]] = js.native
  
  /** Triggered before the contextmenu is open.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.native
  
  /** Triggered before the activation panel is open.
    */
  var beforePanelOpen: js.UndefOr[js.Function1[/* e */ BeforePanelOpenEventArgs, Unit]] = js.native
  
  /** Triggered when click on sheet cell.
    */
  var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.native
  
  /** Triggered when the cell is edited.
    */
  var cellEdit: js.UndefOr[js.Function1[/* e */ CellEditEventArgs, Unit]] = js.native
  
  /** Triggered while cell is formatting.
    */
  var cellFormatting: js.UndefOr[js.Function1[/* e */ CellFormattingEventArgs, Unit]] = js.native
  
  /** Triggered when mouse hover on cell in sheets.
    */
  var cellHover: js.UndefOr[js.Function1[/* e */ CellHoverEventArgs, Unit]] = js.native
  
  /** Triggered when save the edited cell.
    */
  var cellSave: js.UndefOr[js.Function1[/* e */ CellSaveEventArgs, Unit]] = js.native
  
  /** Triggered when the cell is selected.
    */
  var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, Unit]] = js.native
  
  /** Gets or sets an object that indicates to customize the chart behavior in the Spreadsheet.
    */
  var chartSettings: js.UndefOr[ChartSettings] = js.native
  
  /** Gets or sets a value that defines the number of columns displayed in the sheet.
    * @Default {21}
    */
  var columnCount: js.UndefOr[Double] = js.native
  
  /** Gets or sets a value that indicates to define the common width for each column in the Spreadsheet.
    * @Default {64}
    */
  var columnWidth: js.UndefOr[Double] = js.native
  
  /** Triggered when click the contextmenu items.
    */
  var contextMenuClick: js.UndefOr[js.Function1[/* e */ ContextMenuClickEventArgs, Unit]] = js.native
  
  /** Gets or sets a value to add root CSS class for customizing Spreadsheet skins.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Gets or sets a value that indicates custom formulas in Spreadsheet.
    * @Default {[]}
    */
  var customFormulas: js.UndefOr[js.Array[_]] = js.native
  
  /** Triggered when the selected cells are being dragged.
    */
  var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.native
  
  /** Triggered when you start to drag the picture or chart.
    */
  var dragShape: js.UndefOr[js.Function1[/* e */ DragShapeEventArgs, Unit]] = js.native
  
  /** Triggered when the selected cells are initiated to drag.
    */
  var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, Unit]] = js.native
  
  /** Triggered when the selected cells are dropped.
    */
  var drop: js.UndefOr[js.Function1[/* e */ DropEventArgs, Unit]] = js.native
  
  /** Triggered before the range editing starts.
    */
  var editRangeBegin: js.UndefOr[js.Function1[/* e */ EditRangeBeginEventArgs, Unit]] = js.native
  
  /** Triggered after range editing completes.
    */
  var editRangeComplete: js.UndefOr[js.Function1[/* e */ EditRangeCompleteEventArgs, Unit]] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable context menu in the Spreadsheet.
    * @Default {true}
    */
  var enableContextMenu: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable pivot table in the Spreadsheet.
    * @Default {false}
    */
  var enablePivotTable: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable touch support in the Spreadsheet.
    * @Default {true}
    */
  var enableTouch: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets an object that indicates to customize the exporting behavior in Spreadsheet.
    */
  var exportSettings: js.UndefOr[ExportSettings] = js.native
  
  /** Gets or sets an object that indicates to customize the format behavior in the Spreadsheet.
    */
  var formatSettings: js.UndefOr[FormatSettings] = js.native
  
  /** Gets or sets an object that indicates to customize the import behavior in the Spreadsheet.
    */
  var importSettings: js.UndefOr[ImportSettings] = js.native
  
  /** Gets a value that indicates whether importing or not while loading the sheets in Spreadsheet.
    * @Default {false}
    */
  var isImport: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to enable or disable readonly support in the Spreadsheet.
    * @Default {false}
    */
  var isReadOnly: js.UndefOr[Boolean] = js.native
  
  /** Triggered when the key is pressed down.
    */
  var keyDown: js.UndefOr[js.Function1[/* e */ KeyDownEventArgs, Unit]] = js.native
  
  /** Triggered when the key is released.
    */
  var keyUp: js.UndefOr[js.Function1[/* e */ KeyUpEventArgs, Unit]] = js.native
  
  /** Triggered before the sheet is loaded.
    */
  var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.native
  
  /** Triggered after the sheet is loaded.
    */
  var loadComplete: js.UndefOr[js.Function1[/* e */ LoadCompleteEventArgs, Unit]] = js.native
  
  /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data (i.e.) in a language and culture specific
    * to a particular country or region.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Triggered every click of the menu item.
    */
  var menuClick: js.UndefOr[js.Function1[/* e */ MenuClickEventArgs, Unit]] = js.native
  
  /** Gets or sets a value that indicates name manager in Spreadsheet.
    */
  var nameManager: js.UndefOr[js.Array[NameManager]] = js.native
  
  /** Triggered when a file is imported.
    */
  var onImport: js.UndefOr[js.Function1[/* e */ OnImportEventArgs, Unit]] = js.native
  
  /** Triggered when import sheet is failed to open.
    */
  var openFailure: js.UndefOr[js.Function1[/* e */ OpenFailureEventArgs, Unit]] = js.native
  
  /** Triggered when pager item is clicked in the Spreadsheet.
    */
  var pagerClick: js.UndefOr[js.Function1[/* e */ PagerClickEventArgs, Unit]] = js.native
  
  /** Gets or sets an object that indicates to customize the picture behavior in the Spreadsheet.
    */
  var pictureSettings: js.UndefOr[PictureSettings] = js.native
  
  /** Gets or sets an object that indicates to customize the print option in Spreadsheet.
    */
  var printSettings: js.UndefOr[PrintSettings] = js.native
  
  /** Triggered after end of resizing the chart, picture, row and column.
    */
  var resizeEnd: js.UndefOr[js.Function1[/* e */ ResizeEndEventArgs, Unit]] = js.native
  
  /** Triggered when you start resizing the chart, picture, row and column.
    */
  var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, Unit]] = js.native
  
  /** Triggered when click on the ribbon.
    */
  var ribbonClick: js.UndefOr[js.Function1[/* e */ RibbonClickEventArgs, Unit]] = js.native
  
  /** Gets or sets an object that indicates to customize the ribbon settings in Spreadsheet.
    */
  var ribbonSettings: js.UndefOr[RibbonSettings] = js.native
  
  /** Gets or sets a value that indicates whether to define the number of rows to be displayed in the sheet.
    * @Default {20}
    */
  var rowCount: js.UndefOr[Double] = js.native
  
  /** Gets or sets a value that indicates to define the common height for each row in the sheet.
    * @Default {20}
    */
  var rowHeight: js.UndefOr[Double] = js.native
  
  /** Gets or sets an object that indicates to customize the scroll options in the Spreadsheet.
    */
  var scrollSettings: js.UndefOr[ScrollSettings] = js.native
  
  /** Triggered after end of vertical and horizontal scrolling.
    */
  var scrollStop: js.UndefOr[js.Function1[/* e */ ScrollStopEventArgs, Unit]] = js.native
  
  /** Gets or sets an object that indicates to customize the selection options in the Spreadsheet.
    */
  var selectionSettings: js.UndefOr[SelectionSettings] = js.native
  
  /** Gets or sets a value that indicates to define the number of sheets to be created at the initial load.
    * @Default {1}
    */
  var sheetCount: js.UndefOr[Double] = js.native
  
  /** Gets or sets an object that indicates to customize the sheet behavior in Spreadsheet.
    */
  var sheets: js.UndefOr[js.Array[Sheet]] = js.native
  
  /** Gets or sets a value that indicates whether to show or hide pager in the Spreadsheet.
    * @Default {true}
    */
  var showPager: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to show or hide ribbon in the Spreadsheet.
    * @Default {true}
    */
  var showRibbon: js.UndefOr[Boolean] = js.native
  
  /** Triggered when click the ribbon tab.
    */
  var tabClick: js.UndefOr[js.Function1[/* e */ TabClickEventArgs, Unit]] = js.native
  
  /** Triggered when select the ribbon tab.
    */
  var tabSelect: js.UndefOr[js.Function1[/* e */ TabSelectEventArgs, Unit]] = js.native
  
  /** This is used to set the number of undo-redo steps in the Spreadsheet.
    * @Default {20}
    */
  var undoRedoStep: js.UndefOr[Double] = js.native
  
  /** Define the username for the Spreadsheet which is displayed in comment.
    * @Default {User Name}
    */
  var userName: js.UndefOr[String] = js.native
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
    def setActiveSheetIndex(value: Double): Self = this.set("activeSheetIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveSheetIndex: Self = this.set("activeSheetIndex", js.undefined)
    
    @scala.inline
    def setAllowAutoCellType(value: Boolean): Self = this.set("allowAutoCellType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAutoCellType: Self = this.set("allowAutoCellType", js.undefined)
    
    @scala.inline
    def setAllowAutoFill(value: Boolean): Self = this.set("allowAutoFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAutoFill: Self = this.set("allowAutoFill", js.undefined)
    
    @scala.inline
    def setAllowAutoSum(value: Boolean): Self = this.set("allowAutoSum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowAutoSum: Self = this.set("allowAutoSum", js.undefined)
    
    @scala.inline
    def setAllowCellFormatting(value: Boolean): Self = this.set("allowCellFormatting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCellFormatting: Self = this.set("allowCellFormatting", js.undefined)
    
    @scala.inline
    def setAllowCellType(value: Boolean): Self = this.set("allowCellType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCellType: Self = this.set("allowCellType", js.undefined)
    
    @scala.inline
    def setAllowCharts(value: Boolean): Self = this.set("allowCharts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowCharts: Self = this.set("allowCharts", js.undefined)
    
    @scala.inline
    def setAllowClear(value: Boolean): Self = this.set("allowClear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowClear: Self = this.set("allowClear", js.undefined)
    
    @scala.inline
    def setAllowClipboard(value: Boolean): Self = this.set("allowClipboard", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowClipboard: Self = this.set("allowClipboard", js.undefined)
    
    @scala.inline
    def setAllowComments(value: Boolean): Self = this.set("allowComments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowComments: Self = this.set("allowComments", js.undefined)
    
    @scala.inline
    def setAllowConditionalFormats(value: Boolean): Self = this.set("allowConditionalFormats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowConditionalFormats: Self = this.set("allowConditionalFormats", js.undefined)
    
    @scala.inline
    def setAllowDataValidation(value: Boolean): Self = this.set("allowDataValidation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDataValidation: Self = this.set("allowDataValidation", js.undefined)
    
    @scala.inline
    def setAllowDelete(value: Boolean): Self = this.set("allowDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDelete: Self = this.set("allowDelete", js.undefined)
    
    @scala.inline
    def setAllowDragAndDrop(value: Boolean): Self = this.set("allowDragAndDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDragAndDrop: Self = this.set("allowDragAndDrop", js.undefined)
    
    @scala.inline
    def setAllowEditing(value: Boolean): Self = this.set("allowEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowEditing: Self = this.set("allowEditing", js.undefined)
    
    @scala.inline
    def setAllowFiltering(value: Boolean): Self = this.set("allowFiltering", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFiltering: Self = this.set("allowFiltering", js.undefined)
    
    @scala.inline
    def setAllowFormatAsTable(value: Boolean): Self = this.set("allowFormatAsTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFormatAsTable: Self = this.set("allowFormatAsTable", js.undefined)
    
    @scala.inline
    def setAllowFormatPainter(value: Boolean): Self = this.set("allowFormatPainter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFormatPainter: Self = this.set("allowFormatPainter", js.undefined)
    
    @scala.inline
    def setAllowFormulaBar(value: Boolean): Self = this.set("allowFormulaBar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFormulaBar: Self = this.set("allowFormulaBar", js.undefined)
    
    @scala.inline
    def setAllowFreezing(value: Boolean): Self = this.set("allowFreezing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowFreezing: Self = this.set("allowFreezing", js.undefined)
    
    @scala.inline
    def setAllowHyperlink(value: Boolean): Self = this.set("allowHyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowHyperlink: Self = this.set("allowHyperlink", js.undefined)
    
    @scala.inline
    def setAllowImport(value: Boolean): Self = this.set("allowImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowImport: Self = this.set("allowImport", js.undefined)
    
    @scala.inline
    def setAllowInsert(value: Boolean): Self = this.set("allowInsert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowInsert: Self = this.set("allowInsert", js.undefined)
    
    @scala.inline
    def setAllowKeyboardNavigation(value: Boolean): Self = this.set("allowKeyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowKeyboardNavigation: Self = this.set("allowKeyboardNavigation", js.undefined)
    
    @scala.inline
    def setAllowLockCell(value: Boolean): Self = this.set("allowLockCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowLockCell: Self = this.set("allowLockCell", js.undefined)
    
    @scala.inline
    def setAllowMerging(value: Boolean): Self = this.set("allowMerging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowMerging: Self = this.set("allowMerging", js.undefined)
    
    @scala.inline
    def setAllowOverflow(value: Boolean): Self = this.set("allowOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowOverflow: Self = this.set("allowOverflow", js.undefined)
    
    @scala.inline
    def setAllowResizing(value: Boolean): Self = this.set("allowResizing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowResizing: Self = this.set("allowResizing", js.undefined)
    
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
    def setAllowSparkline(value: Boolean): Self = this.set("allowSparkline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSparkline: Self = this.set("allowSparkline", js.undefined)
    
    @scala.inline
    def setAllowUndoRedo(value: Boolean): Self = this.set("allowUndoRedo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowUndoRedo: Self = this.set("allowUndoRedo", js.undefined)
    
    @scala.inline
    def setAllowWrap(value: Boolean): Self = this.set("allowWrap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowWrap: Self = this.set("allowWrap", js.undefined)
    
    @scala.inline
    def setApWidth(value: Double): Self = this.set("apWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApWidth: Self = this.set("apWidth", js.undefined)
    
    @scala.inline
    def setAutoFillBegin(value: /* e */ AutoFillBeginEventArgs => Unit): Self = this.set("autoFillBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAutoFillBegin: Self = this.set("autoFillBegin", js.undefined)
    
    @scala.inline
    def setAutoFillComplete(value: /* e */ AutoFillCompleteEventArgs => Unit): Self = this.set("autoFillComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAutoFillComplete: Self = this.set("autoFillComplete", js.undefined)
    
    @scala.inline
    def setAutoFillSettings(value: AutoFillSettings): Self = this.set("autoFillSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoFillSettings: Self = this.set("autoFillSettings", js.undefined)
    
    @scala.inline
    def setBeforeBatchSave(value: /* e */ BeforeBatchSaveEventArgs => Unit): Self = this.set("beforeBatchSave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeBatchSave: Self = this.set("beforeBatchSave", js.undefined)
    
    @scala.inline
    def setBeforeCellFormat(value: /* e */ BeforeCellFormatEventArgs => Unit): Self = this.set("beforeCellFormat", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeCellFormat: Self = this.set("beforeCellFormat", js.undefined)
    
    @scala.inline
    def setBeforeCellSelect(value: /* e */ BeforeCellSelectEventArgs => Unit): Self = this.set("beforeCellSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeCellSelect: Self = this.set("beforeCellSelect", js.undefined)
    
    @scala.inline
    def setBeforeDrop(value: /* e */ BeforeDropEventArgs => Unit): Self = this.set("beforeDrop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeDrop: Self = this.set("beforeDrop", js.undefined)
    
    @scala.inline
    def setBeforeEditComment(value: /* e */ BeforeEditCommentEventArgs => Unit): Self = this.set("beforeEditComment", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeEditComment: Self = this.set("beforeEditComment", js.undefined)
    
    @scala.inline
    def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = this.set("beforeOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeOpen: Self = this.set("beforeOpen", js.undefined)
    
    @scala.inline
    def setBeforePanelOpen(value: /* e */ BeforePanelOpenEventArgs => Unit): Self = this.set("beforePanelOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforePanelOpen: Self = this.set("beforePanelOpen", js.undefined)
    
    @scala.inline
    def setCellClick(value: /* e */ CellClickEventArgs => Unit): Self = this.set("cellClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellClick: Self = this.set("cellClick", js.undefined)
    
    @scala.inline
    def setCellEdit(value: /* e */ CellEditEventArgs => Unit): Self = this.set("cellEdit", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellEdit: Self = this.set("cellEdit", js.undefined)
    
    @scala.inline
    def setCellFormatting(value: /* e */ CellFormattingEventArgs => Unit): Self = this.set("cellFormatting", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellFormatting: Self = this.set("cellFormatting", js.undefined)
    
    @scala.inline
    def setCellHover(value: /* e */ CellHoverEventArgs => Unit): Self = this.set("cellHover", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellHover: Self = this.set("cellHover", js.undefined)
    
    @scala.inline
    def setCellSave(value: /* e */ CellSaveEventArgs => Unit): Self = this.set("cellSave", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellSave: Self = this.set("cellSave", js.undefined)
    
    @scala.inline
    def setCellSelected(value: /* e */ CellSelectedEventArgs => Unit): Self = this.set("cellSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCellSelected: Self = this.set("cellSelected", js.undefined)
    
    @scala.inline
    def setChartSettings(value: ChartSettings): Self = this.set("chartSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartSettings: Self = this.set("chartSettings", js.undefined)
    
    @scala.inline
    def setColumnCount(value: Double): Self = this.set("columnCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnCount: Self = this.set("columnCount", js.undefined)
    
    @scala.inline
    def setColumnWidth(value: Double): Self = this.set("columnWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumnWidth: Self = this.set("columnWidth", js.undefined)
    
    @scala.inline
    def setContextMenuClick(value: /* e */ ContextMenuClickEventArgs => Unit): Self = this.set("contextMenuClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteContextMenuClick: Self = this.set("contextMenuClick", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setCustomFormulasVarargs(value: js.Any*): Self = this.set("customFormulas", js.Array(value :_*))
    
    @scala.inline
    def setCustomFormulas(value: js.Array[_]): Self = this.set("customFormulas", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFormulas: Self = this.set("customFormulas", js.undefined)
    
    @scala.inline
    def setDrag(value: /* e */ DragEventArgs => Unit): Self = this.set("drag", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrag: Self = this.set("drag", js.undefined)
    
    @scala.inline
    def setDragShape(value: /* e */ DragShapeEventArgs => Unit): Self = this.set("dragShape", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragShape: Self = this.set("dragShape", js.undefined)
    
    @scala.inline
    def setDragStart(value: /* e */ DragStartEventArgs => Unit): Self = this.set("dragStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDragStart: Self = this.set("dragStart", js.undefined)
    
    @scala.inline
    def setDrop(value: /* e */ DropEventArgs => Unit): Self = this.set("drop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDrop: Self = this.set("drop", js.undefined)
    
    @scala.inline
    def setEditRangeBegin(value: /* e */ EditRangeBeginEventArgs => Unit): Self = this.set("editRangeBegin", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEditRangeBegin: Self = this.set("editRangeBegin", js.undefined)
    
    @scala.inline
    def setEditRangeComplete(value: /* e */ EditRangeCompleteEventArgs => Unit): Self = this.set("editRangeComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteEditRangeComplete: Self = this.set("editRangeComplete", js.undefined)
    
    @scala.inline
    def setEnableContextMenu(value: Boolean): Self = this.set("enableContextMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableContextMenu: Self = this.set("enableContextMenu", js.undefined)
    
    @scala.inline
    def setEnablePivotTable(value: Boolean): Self = this.set("enablePivotTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnablePivotTable: Self = this.set("enablePivotTable", js.undefined)
    
    @scala.inline
    def setEnableTouch(value: Boolean): Self = this.set("enableTouch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableTouch: Self = this.set("enableTouch", js.undefined)
    
    @scala.inline
    def setExportSettings(value: ExportSettings): Self = this.set("exportSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportSettings: Self = this.set("exportSettings", js.undefined)
    
    @scala.inline
    def setFormatSettings(value: FormatSettings): Self = this.set("formatSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormatSettings: Self = this.set("formatSettings", js.undefined)
    
    @scala.inline
    def setImportSettings(value: ImportSettings): Self = this.set("importSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportSettings: Self = this.set("importSettings", js.undefined)
    
    @scala.inline
    def setIsImport(value: Boolean): Self = this.set("isImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsImport: Self = this.set("isImport", js.undefined)
    
    @scala.inline
    def setIsReadOnly(value: Boolean): Self = this.set("isReadOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsReadOnly: Self = this.set("isReadOnly", js.undefined)
    
    @scala.inline
    def setKeyDown(value: /* e */ KeyDownEventArgs => Unit): Self = this.set("keyDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteKeyDown: Self = this.set("keyDown", js.undefined)
    
    @scala.inline
    def setKeyUp(value: /* e */ KeyUpEventArgs => Unit): Self = this.set("keyUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteKeyUp: Self = this.set("keyUp", js.undefined)
    
    @scala.inline
    def setLoad(value: /* e */ LoadEventArgs => Unit): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setLoadComplete(value: /* e */ LoadCompleteEventArgs => Unit): Self = this.set("loadComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoadComplete: Self = this.set("loadComplete", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMenuClick(value: /* e */ MenuClickEventArgs => Unit): Self = this.set("menuClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMenuClick: Self = this.set("menuClick", js.undefined)
    
    @scala.inline
    def setNameManagerVarargs(value: NameManager*): Self = this.set("nameManager", js.Array(value :_*))
    
    @scala.inline
    def setNameManager(value: js.Array[NameManager]): Self = this.set("nameManager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNameManager: Self = this.set("nameManager", js.undefined)
    
    @scala.inline
    def setOnImport(value: /* e */ OnImportEventArgs => Unit): Self = this.set("onImport", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnImport: Self = this.set("onImport", js.undefined)
    
    @scala.inline
    def setOpenFailure(value: /* e */ OpenFailureEventArgs => Unit): Self = this.set("openFailure", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpenFailure: Self = this.set("openFailure", js.undefined)
    
    @scala.inline
    def setPagerClick(value: /* e */ PagerClickEventArgs => Unit): Self = this.set("pagerClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deletePagerClick: Self = this.set("pagerClick", js.undefined)
    
    @scala.inline
    def setPictureSettings(value: PictureSettings): Self = this.set("pictureSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePictureSettings: Self = this.set("pictureSettings", js.undefined)
    
    @scala.inline
    def setPrintSettings(value: PrintSettings): Self = this.set("printSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrintSettings: Self = this.set("printSettings", js.undefined)
    
    @scala.inline
    def setResizeEnd(value: /* e */ ResizeEndEventArgs => Unit): Self = this.set("resizeEnd", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResizeEnd: Self = this.set("resizeEnd", js.undefined)
    
    @scala.inline
    def setResizeStart(value: /* e */ ResizeStartEventArgs => Unit): Self = this.set("resizeStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteResizeStart: Self = this.set("resizeStart", js.undefined)
    
    @scala.inline
    def setRibbonClick(value: /* e */ RibbonClickEventArgs => Unit): Self = this.set("ribbonClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRibbonClick: Self = this.set("ribbonClick", js.undefined)
    
    @scala.inline
    def setRibbonSettings(value: RibbonSettings): Self = this.set("ribbonSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRibbonSettings: Self = this.set("ribbonSettings", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
    
    @scala.inline
    def setRowHeight(value: Double): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    
    @scala.inline
    def setScrollSettings(value: ScrollSettings): Self = this.set("scrollSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollSettings: Self = this.set("scrollSettings", js.undefined)
    
    @scala.inline
    def setScrollStop(value: /* e */ ScrollStopEventArgs => Unit): Self = this.set("scrollStop", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteScrollStop: Self = this.set("scrollStop", js.undefined)
    
    @scala.inline
    def setSelectionSettings(value: SelectionSettings): Self = this.set("selectionSettings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectionSettings: Self = this.set("selectionSettings", js.undefined)
    
    @scala.inline
    def setSheetCount(value: Double): Self = this.set("sheetCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetCount: Self = this.set("sheetCount", js.undefined)
    
    @scala.inline
    def setSheetsVarargs(value: Sheet*): Self = this.set("sheets", js.Array(value :_*))
    
    @scala.inline
    def setSheets(value: js.Array[Sheet]): Self = this.set("sheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheets: Self = this.set("sheets", js.undefined)
    
    @scala.inline
    def setShowPager(value: Boolean): Self = this.set("showPager", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowPager: Self = this.set("showPager", js.undefined)
    
    @scala.inline
    def setShowRibbon(value: Boolean): Self = this.set("showRibbon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRibbon: Self = this.set("showRibbon", js.undefined)
    
    @scala.inline
    def setTabClick(value: /* e */ TabClickEventArgs => Unit): Self = this.set("tabClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTabClick: Self = this.set("tabClick", js.undefined)
    
    @scala.inline
    def setTabSelect(value: /* e */ TabSelectEventArgs => Unit): Self = this.set("tabSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTabSelect: Self = this.set("tabSelect", js.undefined)
    
    @scala.inline
    def setUndoRedoStep(value: Double): Self = this.set("undoRedoStep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUndoRedoStep: Self = this.set("undoRedoStep", js.undefined)
    
    @scala.inline
    def setUserName(value: String): Self = this.set("userName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserName: Self = this.set("userName", js.undefined)
  }
}
