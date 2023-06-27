package typings.ejWebAll.ej

import typings.ejWebAll.ej.Ribbon.ApplicationTabType
import typings.ejWebAll.ej.Spreadsheet.BorderOptions
import typings.ejWebAll.ej.Spreadsheet.CellIndex
import typings.ejWebAll.ej.Spreadsheet.DataOptions
import typings.ejWebAll.ej.Spreadsheet.ImportingOptions
import typings.ejWebAll.ej.Spreadsheet.LinkOptions
import typings.ejWebAll.ej.Spreadsheet.RangeOptions
import typings.ejWebAll.ej.Spreadsheet.UndoRedoOptions
import typings.ejWebAll.ej.Spreadsheet.XLCFormat
import typings.ejWebAll.ej.Spreadsheet.XLCMenu
import typings.ejWebAll.ej.Spreadsheet.XLCellType
import typings.ejWebAll.ej.Spreadsheet.XLChart
import typings.ejWebAll.ej.Spreadsheet.XLClipboard
import typings.ejWebAll.ej.Spreadsheet.XLComment
import typings.ejWebAll.ej.Spreadsheet.XLDragDrop
import typings.ejWebAll.ej.Spreadsheet.XLDragFill
import typings.ejWebAll.ej.Spreadsheet.XLEdit
import typings.ejWebAll.ej.Spreadsheet.XLExport
import typings.ejWebAll.ej.Spreadsheet.XLFilter
import typings.ejWebAll.ej.Spreadsheet.XLFormat
import typings.ejWebAll.ej.Spreadsheet.XLFreeze
import typings.ejWebAll.ej.Spreadsheet.XLPivot
import typings.ejWebAll.ej.Spreadsheet.XLPrint
import typings.ejWebAll.ej.Spreadsheet.XLResize
import typings.ejWebAll.ej.Spreadsheet.XLRibbon
import typings.ejWebAll.ej.Spreadsheet.XLScroll
import typings.ejWebAll.ej.Spreadsheet.XLSearch
import typings.ejWebAll.ej.Spreadsheet.XLSelection
import typings.ejWebAll.ej.Spreadsheet.XLShape
import typings.ejWebAll.ej.Spreadsheet.XLSort
import typings.ejWebAll.ej.Spreadsheet.XLSparkline
import typings.ejWebAll.ej.Spreadsheet.XLValidate
import typings.ejWebAll.ej.datavisualization.Chart.Theme
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Spreadsheet
  extends StObject
     with Widget_ {
  
  var XLCFormat: XLCFormat = js.native
  
  var XLCMenu: XLCMenu = js.native
  
  var XLCellType: XLCellType = js.native
  
  var XLChart: XLChart = js.native
  
  var XLClipboard: XLClipboard = js.native
  
  var XLComment: XLComment = js.native
  
  var XLDragDrop: XLDragDrop = js.native
  
  var XLDragFill: XLDragFill = js.native
  
  var XLEdit: XLEdit = js.native
  
  var XLExport: XLExport = js.native
  
  var XLFilter: XLFilter = js.native
  
  var XLFormat: XLFormat = js.native
  
  var XLFreeze: XLFreeze = js.native
  
  var XLPivot: XLPivot = js.native
  
  var XLPrint: XLPrint = js.native
  
  var XLResize: XLResize = js.native
  
  var XLRibbon: XLRibbon = js.native
  
  var XLScroll: XLScroll = js.native
  
  var XLSearch: XLSearch = js.native
  
  var XLSelection: XLSelection = js.native
  
  var XLShape: XLShape = js.native
  
  var XLSort: XLSort = js.native
  
  var XLSparkline: XLSparkline = js.native
  
  var XLValidate: XLValidate = js.native
  
  /** This method is used to add custom formulas in Spreadsheet.
    * @param {string} Pass the name of the formula.
    * @param {string} Pass the name of the function.
    * @returns {void}
    */
  def addCustomFormula(formulaName: String, functionName: String): Unit = js.native
  
  /** This method is used to add a new sheet in the last position of the sheet container.
    * @returns {void}
    */
  def addNewSheet(): Unit = js.native
  
  /** This method is used to blank the workbook in Spreadsheet.
    * @returns {void}
    */
  def blankWorkbook(): Unit = js.native
  
  /** It is used to clear all the data and format in the specified range of cells in Spreadsheet.
    * @param {string|any[]} Optional. If range is specified, then it will clear all content in the specified range else it will use the current selected range.
    * @returns {void}
    */
  def clearAll(): Unit = js.native
  def clearAll(range: String): Unit = js.native
  def clearAll(range: js.Array[Any]): Unit = js.native
  
  /** This property is used to clear all the formats applied in the specified range in Spreadsheet.
    * @param {string|any[]} Optional. If range is specified, then it will clear all format in the specified range else it will use the current selected range.
    * @returns {void}
    */
  def clearAllFormat(): Unit = js.native
  def clearAllFormat(range: String): Unit = js.native
  def clearAllFormat(range: js.Array[Any]): Unit = js.native
  
  /** Used to clear the applied border in the specified range in Spreadsheet.
    * @param {string|any[]} Optional. If range is specified, then it will clear border in the specified range else it will use the current selected range.
    * @returns {void}
    */
  def clearBorder(): Unit = js.native
  def clearBorder(range: String): Unit = js.native
  def clearBorder(range: js.Array[Any]): Unit = js.native
  
  /** This property is used to clear the contents in the specified range in Spreadsheet.
    * @param {string|any[]} Optional. If the range is specified, then it will clear the content in the specified range else it will use the current selected range.
    * @returns {void}
    */
  def clearContents(): Unit = js.native
  def clearContents(range: String): Unit = js.native
  def clearContents(range: js.Array[Any]): Unit = js.native
  
  /** This method is used to remove only the data in the range denoted by the specified range name.
    * @param {string} Pass the defined rangeSettings property name.
    * @returns {void}
    */
  def clearRange(rangeName: String): Unit = js.native
  
  /** It is used to remove data in the specified range of cells based on the defined property.
    * @param {any[]|string} Optional. If range is specified, it will clear data for the specified range else it will use the current selected range.
    * @param {string} Optional. If property is specified, it will remove the specified property in the range else it will remove default properties
    * @param {HTMLElement} Optional.
    * @param {boolean} Optional. pass {{'`true`' | markdownify}}, if you want to skip the hidden rows
    * @param {string} Optional. Pass the status to perform undo and redo operation.
    * @param {boolean} Optional. It specifies whether to skip element processing or not.
    * @returns {void}
    */
  def clearRangeData(
    range: js.UndefOr[js.Array[Any] | String],
    property: js.UndefOr[String],
    cells: js.UndefOr[HTMLElement],
    skipHiddenRow: js.UndefOr[Boolean],
    status: js.UndefOr[String],
    skipCell: js.UndefOr[Boolean]
  ): Unit = js.native
  
  /** This method is used to clear undo and redo collections in the Spreadsheet.
    * @returns {void}
    */
  def clearUndoRedo(): Unit = js.native
  
  /** This method is used to copy or move the sheets in Spreadsheet.
    * @param {number} Pass the sheet index that you want to copy or move.
    * @param {number} Pass the position index where you want to copy or move.
    * @param {boolean} Pass {{'`true`' | markdownify}},If you want to copy sheet or else it will move sheet.
    * @returns {void}
    */
  def copySheet(fromIdx: Double, toIdx: Double, isCopySheet: Boolean): Unit = js.native
  
  var defaults: Model = js.native
  
  /** This method is used to delete the entire column which is selected.
    * @param {number} Pass the start column index.
    * @param {number} Pass the end column index.
    * @returns {void}
    */
  def deleteEntireColumn(startCol: Double, endCol: Double): Unit = js.native
  
  /** This method is used to delete the entire row which is selected.
    * @param {number} Pass the start row index.
    * @param {number} Pass the end row index.
    * @returns {void}
    */
  def deleteEntireRow(startRow: Double, endRow: Double): Unit = js.native
  
  /** This method is used to delete a particular sheet in the Spreadsheet.
    * @param {number} Pass the sheet index to perform delete action.
    * @returns {void}
    */
  def deleteSheet(idx: Double): Unit = js.native
  
  /** This method is used to delete the selected cells and shift the remaining cells to left.
    * @param {Spreadsheet.CellIndex} Pass the Object "CellIndex"
    * @param {Spreadsheet.CellIndex} Pass the Object "CellIndex"
    * @returns {void}
    */
  def deleteShiftLeft(startCell: CellIndex, endCell: CellIndex): Unit = js.native
  
  /** This method is used to delete the selected cells and shift the remaining cells up.
    * @param {Spreadsheet.CellIndex} Pass the Object "CellIndex"
    * @param {Spreadsheet.CellIndex} Pass the Object "CellIndex"
    * @returns {void}
    */
  def deleteShiftUp(startCell: CellIndex, endCell: CellIndex): Unit = js.native
  
  /** This method is used to edit data in the specified range of cells based on its corresponding rangeSettings.
    * @param {string} Pass the defined rangeSettings property name.
    * @param {() => void} Pass the function that you want to perform range edit.
    * @returns {void}
    */
  def editRange(rangeName: String, fn: js.Function0[Unit]): Unit = js.native
  
  /** This method is used to get the activation panel in the Spreadsheet.
    * @returns {HTMLElement}
    */
  def getActivationPanel(): HTMLElement = js.native
  
  /** This method is used to get the active cell object in Spreadsheet. It will returns object which contains rowIndex and colIndex of the active cell.
    * @param {number} Optional. If sheetIdx is specified, it will return the active cell object in specified sheet index else it will use the current sheet index
    * @returns {any}
    */
  def getActiveCell(): Any = js.native
  def getActiveCell(sheetIdx: Double): Any = js.native
  
  /** This method is used to get the active cell element based on the given sheet index in the Spreadsheet.
    * @param {number} Optional. If sheetIndex is specified, it will return the active cell element in specified sheet index else it will use the current active sheet index.
    * @returns {HTMLElement}
    */
  def getActiveCellElem(): HTMLElement = js.native
  def getActiveCellElem(sheetIdx: Double): HTMLElement = js.native
  
  /** This method is used to get the current active sheet index in Spreadsheet.
    * @returns {number}
    */
  def getActiveSheetIndex(): Double = js.native
  
  /** This method is used to get the alpha range of the given index in Spreadsheet.
    * @param {number} Pass the start row index.
    * @param {number} Pass the start column index.
    * @param {number} Pass the end row index.
    * @param {number} Pass the end column index.
    * @returns {String}
    */
  def getAlphaRange(sRIndex: Double, sCIndex: Double, eRIndex: Double, eCIndex: Double): String = js.native
  
  /** This method is used to get the auto fill element in Spreadsheet.
    * @returns {HTMLElement}
    */
  def getAutoFillElem(): HTMLElement = js.native
  
  /** This method is used to get the cell element based on specified row and column index in the Spreadsheet.
    * @param {number} Pass the row index.
    * @param {number} Pass the column index.
    * @param {number} Optional. Pass the sheet index that you want to get cell.
    * @returns {HTMLElement}
    */
  def getCell(rowIdx: Double, colIdx: Double): HTMLElement = js.native
  def getCell(rowIdx: Double, colIdx: Double, sheetIdx: Double): HTMLElement = js.native
  
  /** This method is used to get the data settings in the Spreadsheet.
    * @param {number} Pass the sheet index.
    * @returns {number}
    */
  def getDataSettings(sheetIdx: Double): Double = js.native
  
  /** This method is used to get the frozen columns index in the Spreadsheet.
    * @param {number} Pass the sheet index.
    * @returns {number}
    */
  def getFrozenColumns(sheetIdx: Double): Double = js.native
  
  /** This method is used to get the frozen row index in Spreadsheet.
    * @param {number} Pass the sheet index.
    * @returns {number}
    */
  def getFrozenRows(sheetIdx: Double): Double = js.native
  
  /** This method is used to get the hyperlink data as object from the specified cell in Spreadsheet.
    * @param {HTMLElement} Pass the DOM element to get hyperlink
    * @returns {any}
    */
  def getHyperlink(cell: HTMLElement): Any = js.native
  
  /** This method is used to get the keys from the given object in Spreadsheet.
    * @param {any} Pass the Object
    * @returns {any[]}
    */
  def getObjectKeys(obj: Any): js.Array[Any] = js.native
  
  /** This method is used to get all cell elements in the specified range.
    * @param {string} Pass the range that you want to get the cells.
    * @param {number} Pass the index of the sheet.
    * @param {boolean} Optional. Pass {{'`true`' | markdownify}}, if you want to skip the hidden rows.
    * @returns {HTMLElement}
    */
  def getRange(range: String, sheetIdx: Double): HTMLElement = js.native
  def getRange(range: String, sheetIdx: Double, skipHiddenRow: Boolean): HTMLElement = js.native
  
  /** This method is used to get the data in specified range in Spreadsheet.
    * @param {any} Optional. Pass the range, property, sheetIdx, valueOnly in options
    * @returns {any[]}
    */
  def getRangeData(): js.Array[Any] = js.native
  def getRangeData(options: Any): js.Array[Any] = js.native
  
  /** This method is used to get the data as object in the specified range.
    * @param {Spreadsheet.CellIndex} Pass the Object "CellIndex"
    * @param {Spreadsheet.CellIndex} Pass the Object "CellIndex"
    * @param {boolean} Optional. Pass {{'`true`' | markdownify}}, if you want to skip the hidden rows.
    * @returns {any}
    */
  def getRangeDataAsObject(startcell: CellIndex, endcell: CellIndex): Any = js.native
  def getRangeDataAsObject(startcell: CellIndex, endcell: CellIndex, skipHiddenRow: Boolean): Any = js.native
  
  /** This method is used to get the range indices array based on the specified alpha range in Spreadsheet.
    * @param {string} Pass the alpha range that you want to get range indices.
    * @returns {any[]}
    */
  def getRangeIndices(range: String): js.Array[Any] = js.native
  
  /** This method is used to get the sheet details based on the given sheet index in Spreadsheet.
    * @param {number} Pass the sheet index to get the sheet object.
    * @returns {any}
    */
  def getSheet(sheetIdx: Double): Any = js.native
  
  /** This method is used to get the sheet content div element of Spreadsheet.
    * @param {number} Pass the sheet index to get the sheet content.
    * @returns {HTMLElement}
    */
  def getSheetElement(sheetIdx: Double): HTMLElement = js.native
  
  /** This method is used to get all the sheets in workbook.
    * @returns {any[]}
    */
  def getSheets(): js.Array[Any] = js.native
  
  /** This method is used to get the visible cell details in Spreadsheet.
    * @returns {void}
    */
  def getVisibleCellDetails(): Unit = js.native
  
  /** This method is used to send a paging request to the specified sheet Index in the Spreadsheet.
    * @param {number} Pass the sheet index to perform paging at specified sheet index
    * @param {boolean} Pass {{'`true`' | markdownify}} to create a new sheet. If the specified sheet index is already exist, it navigate to that sheet else it create a new sheet.
    * @returns {void}
    */
  def gotoPage(sheetIdx: Double, newSheet: Boolean): Unit = js.native
  
  /** This method is used to hide the pivot table activationPanel in the Spreadsheet.
    * @returns {void}
    */
  def hideActivationPanel(): Unit = js.native
  
  /** This method is used to hide the entire columns from the specified range (startCol, endCol) in Spreadsheet.
    * @param {number} Index of the start column.
    * @param {number} Optional. Index of the end column.
    * @returns {void}
    */
  def hideColumn(startCol: Double, endCol: Double): Unit = js.native
  
  /** This method is used to hide the formula bar in Spreadsheet.
    * @returns {void}
    */
  def hideFormulaBar(): Unit = js.native
  
  /** This method is used to hide the rows, based on the specified row index in Spreadsheet.
    * @param {number} Index of the start row.
    * @param {number}  Optional. Index of the end row.
    * @returns {void}
    */
  def hideRow(startRow: Double, endRow: Double): Unit = js.native
  
  /** This method is used to hide the sheet based on the specified sheetIndex or sheet name in the Spreadsheet.
    * @param {string|number} Pass the sheet name or index that you want to hide.
    * @returns {void}
    */
  def hideSheet(sheetIdx: String): Unit = js.native
  def hideSheet(sheetIdx: Double): Unit = js.native
  
  /** This method is used to hide the displayed waiting pop-up in Spreadsheet.
    * @returns {void}
    */
  def hideWaitingPopUp(): Unit = js.native
  
  /** This method is used to import excel file manually by using form data.
    * @param {Spreadsheet.ImportingOptions} Pass the form data object to import files manually.
    * @returns {void}
    */
  def `import`(importRequest: ImportingOptions): Unit = js.native
  
  /** This method is used to insert a column before the active cell's column in the Spreadsheet.
    * @param {number} Pass start column.
    * @param {number} Pass end column.
    * @returns {void}
    */
  def insertEntireColumn(startCol: Double, endCol: Double): Unit = js.native
  
  /** This method is used to insert a row before the active cell's row in the Spreadsheet.
    * @param {number} Pass start row.
    * @param {number} Pass end row.
    * @returns {void}
    */
  def insertEntireRow(startRow: Double, endRow: Double): Unit = js.native
  
  /** This method is used to insert a new sheet to the left of the current active sheet.
    * @returns {void}
    */
  def insertSheet(): Unit = js.native
  
  /** This method is used to insert cells in the selected or specified range and shift remaining cells to bottom.
    * @param {Spreadsheet.CellIndex} Pass the Object "CellIndex"
    * @param {Spreadsheet.CellIndex} Pass the Object "CellIndex"
    * @returns {void}
    */
  def insertShiftBottom(startCell: CellIndex, endCell: CellIndex): Unit = js.native
  
  /** This method is used to insert cells in the selected or specified range and shift remaining cells to right.
    * @param {Spreadsheet.CellIndex} Pass the Object "CellIndex"
    * @param {Spreadsheet.CellIndex} Pass the Object "CellIndex"
    * @returns {void}
    */
  def insertShiftRight(startCell: CellIndex, endCell: CellIndex): Unit = js.native
  
  /** This method is used to load JSON data in Spreadsheet.
    * @param {HTMLElement} Pass the response that you want to load.
    * @returns {void}
    */
  def loadFromJSON(response: HTMLElement): Unit = js.native
  
  /** This method is used to lock/unlock the range of cells in active sheet. Lock cells are activated only after the sheet is protected. Once the sheet is protected it is unable to
    * lock/unlock cells.
    * @param {string|any[]} Pass the alpha range cells or array range of cells.
    * @param {string} Optional. By default is {{'`true`' | markdownify}}. If it is {{'`false`' | markdownify}} locked cells are unlocked.
    * @returns {void}
    */
  def lockCells(range: String): Unit = js.native
  def lockCells(range: String, isLocked: String): Unit = js.native
  def lockCells(range: js.Array[Any]): Unit = js.native
  def lockCells(range: js.Array[Any], isLocked: String): Unit = js.native
  
  /** This method is used to merge cells by across in the Spreadsheet.
    * @param {string} Optional. To pass the cell range or selected cells are process.
    * @param {boolean} Optional. If pass {{'`true`' | markdownify}} it does not show alert.
    * @returns {void}
    */
  def mergeAcrossCells(): Unit = js.native
  def mergeAcrossCells(range: String): Unit = js.native
  def mergeAcrossCells(range: String, alertStatus: Boolean): Unit = js.native
  def mergeAcrossCells(range: Unit, alertStatus: Boolean): Unit = js.native
  
  /** This method is used to merge the selected cells in the Spreadsheet.
    * @param {string|any[]} Optional. To pass the cell range or selected cells are process.
    * @param {boolean} Optional. If pass {{'`true`' | markdownify}} it does not show alert.
    * @returns {void}
    */
  def mergeCells(): Unit = js.native
  def mergeCells(range: String): Unit = js.native
  def mergeCells(range: String, alertStatus: Boolean): Unit = js.native
  def mergeCells(range: js.Array[Any]): Unit = js.native
  def mergeCells(range: js.Array[Any], alertStatus: Boolean): Unit = js.native
  def mergeCells(range: Unit, alertStatus: Boolean): Unit = js.native
  
  @JSName("model")
  var model_Spreadsheet: Model = js.native
  
  /** This method is used to select a cell or range in the Spreadsheet.
    * @param {Spreadsheet.CellIndex} Pass the Object "CellIndex"
    * @param {Spreadsheet.CellIndex} Pass the Object "CellIndex"
    * @returns {void}
    */
  def performSelection(startCell: CellIndex, endCell: CellIndex): Unit = js.native
  
  /** This method is used to protect or unprotect active sheet.
    * @param {boolean} Optional. By default is {{'`true`' | markdownify}}. If it is {{'`false`' | markdownify}} active sheet is unprotected.
    * @returns {void}
    */
  def protectSheet(): Unit = js.native
  def protectSheet(isProtected: Boolean): Unit = js.native
  
  /** This method is used to perform the redo action in Spreadsheet.
    * @returns {void}
    */
  def redo(): Unit = js.native
  
  /** This method destroys and re-creates the entire Spreadsheet control.
    * @returns {void}
    */
  def refresh(): Unit = js.native
  
  /** This method is used to refresh the Spreadsheet based on the sheet model values.
    * @param {number} Pass the index of the sheet.
    * @returns {void}
    */
  def refreshContent(sheetIdx: Double): Unit = js.native
  
  /** This method is used to refresh the Spreadsheet element based on the page layout.
    * @returns {void}
    */
  def refreshSpreadsheet(): Unit = js.native
  
  /** This method is used to remove custom formulae in Spreadsheet.
    * @param {string} Pass the name of the formula.
    * @param {string} Pass the name of the function.
    * @returns {void}
    */
  def removeCustomFormula(formulaName: String, functionName: String): Unit = js.native
  
  /** This method is used to remove the hyperlink from selected cells of current sheet.
    * @param {string} Hyperlink remove from the specified range.
    * @param {boolean} Optional. If it is {{'`true`' | markdownify}}, It will clear link only not format.
    * @param {boolean} Optional. Pass the status to perform undo and redo operations.
    * @param {string|any[]} Optional. Pass the cells that you want to remove hyperlink.
    * @param {boolean} Optional. Pass {{'`true`' | markdownify}}, if you want to skip the hidden rows.
    * @returns {void}
    */
  def removeHyperlink(range: String): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Boolean): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Boolean, status: Boolean): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Boolean, status: Boolean, cells: String): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Boolean, status: Boolean, cells: String, skipHiddenRow: Boolean): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Boolean, status: Boolean, cells: js.Array[Any]): Unit = js.native
  def removeHyperlink(
    range: String,
    isClearHLink: Boolean,
    status: Boolean,
    cells: js.Array[Any],
    skipHiddenRow: Boolean
  ): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Boolean, status: Boolean, cells: Unit, skipHiddenRow: Boolean): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Boolean, status: Unit, cells: String): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Boolean, status: Unit, cells: String, skipHiddenRow: Boolean): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Boolean, status: Unit, cells: js.Array[Any]): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Boolean, status: Unit, cells: js.Array[Any], skipHiddenRow: Boolean): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Boolean, status: Unit, cells: Unit, skipHiddenRow: Boolean): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Unit, status: Boolean): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Unit, status: Boolean, cells: String): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Unit, status: Boolean, cells: String, skipHiddenRow: Boolean): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Unit, status: Boolean, cells: js.Array[Any]): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Unit, status: Boolean, cells: js.Array[Any], skipHiddenRow: Boolean): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Unit, status: Boolean, cells: Unit, skipHiddenRow: Boolean): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Unit, status: Unit, cells: String): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Unit, status: Unit, cells: String, skipHiddenRow: Boolean): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Unit, status: Unit, cells: js.Array[Any]): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Unit, status: Unit, cells: js.Array[Any], skipHiddenRow: Boolean): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Unit, status: Unit, cells: Unit, skipHiddenRow: Boolean): Unit = js.native
  
  /** This method is used to remove the range data and its defined rangeSettings property based on the specified range name.
    * @param {string} Pass the defined rangeSetting property name.
    * @returns {void}
    */
  def removeRange(rangeName: String): Unit = js.native
  
  /** This method is used to remove the readonly option for the specified range.
    * @param {string|any[]} Pass the range.
    * @returns {void}
    */
  def removeReadOnly(): Unit = js.native
  def removeReadOnly(range: String): Unit = js.native
  def removeReadOnly(range: js.Array[Any]): Unit = js.native
  
  /** This method is used to save JSON data in Spreadsheet.
    * @returns {any}
    */
  def saveAsJSON(): Any = js.native
  
  /** This method is used to save batch changes in Spreadsheet.
    * @param {number} Pass the sheet index for Spreadsheet.
    * @returns {void}
    */
  def saveBatchChanges(sheetIdx: Double): Unit = js.native
  
  /** This method is used to set the active cell in the Spreadsheet.
    * @param {number} Pass the row index.
    * @param {number} Pass the column index.
    * @param {number} Pass the index of the sheet.
    * @returns {void}
    */
  def setActiveCell(rowIdx: Double, colIdx: Double, sheetIdx: Double): Unit = js.native
  
  /** This method is used to set active sheet index for the Spreadsheet.
    * @param {number} Pass the active sheet index for Spreadsheet.
    * @returns {void}
    */
  def setActiveSheetIndex(sheetIdx: Double): Unit = js.native
  
  /** This method is used to set border for the specified range of cells in the Spreadsheet.
    * @param {Spreadsheet.BorderOptions} Pass the Object "BorderOptions".
    * @param {string} Optional. If range is specified, it will set border for the specified range else it will use the selected range.
    * @returns {void}
    */
  def setBorder(property: BorderOptions): Unit = js.native
  def setBorder(property: BorderOptions, range: String): Unit = js.native
  
  /** This method is used to set the height for the rows in the Spreadsheet.
    * @param {any[]|any} Pass the row index and height of the rows.
    * @returns {void}
    */
  def setHeightToRows(heightColl: js.Array[Any]): Unit = js.native
  def setHeightToRows(heightColl: Any): Unit = js.native
  
  /** This method is used to set the hyperlink in selected cells of the current sheet.
    * @param {string|any[]} If range is specified, it will set the hyperlink in range of the cells.
    * @param {Spreadsheet.LinkOptions} Pass the Object "LinkOptions"
    * @param {number} If we pass cellAddress then which sheet to be navigate in the applied link.
    * @returns {void}
    */
  def setHyperlink(range: String, link: LinkOptions, sheetIdx: Double): Unit = js.native
  def setHyperlink(range: js.Array[Any], link: LinkOptions, sheetIdx: Double): Unit = js.native
  
  /** This method is used to set the readonly option for the specified range.
    * @param {string|any[]} Pass the range.
    * @returns {void}
    */
  def setReadOnly(): Unit = js.native
  def setReadOnly(range: String): Unit = js.native
  def setReadOnly(range: js.Array[Any]): Unit = js.native
  
  /** This method is used to set the focus to the Spreadsheet.
    * @returns {void}
    */
  def setSheetFocus(): Unit = js.native
  
  /** This method is used to set the width for the columns in the Spreadsheet.
    * @param {any[]|any} Pass the column index and width of the columns.
    * @param {number} Optional. If sheetIdx is specified, it will set the width for columns to the specified sheet else it will use active sheet.
    * @returns {void}
    */
  def setWidthToColumns(widthColl: js.Array[Any]): Unit = js.native
  def setWidthToColumns(widthColl: js.Array[Any], sheetIndex: Double): Unit = js.native
  def setWidthToColumns(widthColl: Any): Unit = js.native
  def setWidthToColumns(widthColl: Any, sheetIndex: Double): Unit = js.native
  
  /** This method is used to rename the active sheet.
    * @param {string} Pass the sheet name that you want to change the current active sheet name.
    * @returns {void}
    */
  def sheetRename(sheetName: String): Unit = js.native
  
  /** This method is used to display the activationPanel for the specified range name.
    * @param {string} Pass the range name that you want to display the activation panel.
    * @returns {void}
    */
  def showActivationPanel(rangeName: String): Unit = js.native
  
  /** This method is used to show the hidden columns within the specified range in the Spreadsheet.
    * @param {number} Index of the start column.
    * @param {number} Optional. Index of the end column.
    * @returns {void}
    */
  def showColumn(startColIdx: Double, endColIdx: Double): Unit = js.native
  
  /** This method is used to show the formula bar in Spreadsheet.
    * @returns {void}
    */
  def showFormulaBar(): Unit = js.native
  
  /** This method is used to show/hide gridlines in active sheet in the Spreadsheet.
    * @param {boolean} Pass {{'`true`' | markdownify}} to show the gridlines
    * @returns {void}
    */
  def showGridlines(status: Boolean): Unit = js.native
  
  /** This method is used to show/hide the headers in active sheet in the Spreadsheet.
    * @param {boolean} Pass {{'`true`' | markdownify}} to show the sheet headers.
    * @returns {void}
    */
  def showHeadings(startRow: Boolean): Unit = js.native
  
  /** This method is used to show/hide pager in the Spreadsheet.
    * @param {boolean} Pass {{'`true`' | markdownify}} to show pager.
    * @returns {void}
    */
  def showPager(status: Boolean): Unit = js.native
  
  /** This method is used to show the hidden rows in the specified range in the Spreadsheet.
    * @param {number} Index of the start row.
    * @param {number} Optional. Index of the end row.
    * @returns {void}
    */
  def showRow(startRow: Double, endRow: Double): Unit = js.native
  
  /** This method is used to show waiting pop-up in Spreadsheet.
    * @returns {void}
    */
  def showWaitingPopUp(): Unit = js.native
  
  /** This method is used to unwrap the selected range of cells in the Spreadsheet.
    * @param {any[]|string} Optional. If the range is specified, then it will update unwrap in the specified range else it will use the current selected range.
    * @returns {void}
    */
  def unWrapText(): Unit = js.native
  def unWrapText(range: String): Unit = js.native
  def unWrapText(range: js.Array[Any]): Unit = js.native
  
  /** This method is used to perform the undo action in Spreadsheet.
    * @returns {void}
    */
  def undo(): Unit = js.native
  
  /** This method is used to unhide the sheet based on specified sheet name or sheet index.
    * @param {string|number} Pass the sheet name or index that you want to unhide.
    * @returns {void}
    */
  def unhideSheet(sheetInfo: String): Unit = js.native
  def unhideSheet(sheetInfo: Double): Unit = js.native
  
  /** This method is used to unmerge the selected range of cells in the Spreadsheet.
    * @param {string} Optional. If the range is specified, then it will un merge the specified range else it will use the current selected range.
    * @returns {void}
    */
  def unmergeCells(): Unit = js.native
  def unmergeCells(range: String): Unit = js.native
  
  /** This method is used to update the data for the specified range of cells in the Spreadsheet.
    * @param {Spreadsheet.DataOptions} Pass the Object "DataOptions"
    * @param {any[]|string} Optional. If range is specified, it will update data for the specified range  else it will use the current selected range.
    * @returns {void}
    */
  def updateData(data: DataOptions): Unit = js.native
  def updateData(data: DataOptions, range: String): Unit = js.native
  def updateData(data: DataOptions, range: js.Array[Any]): Unit = js.native
  
  /** This method is used to update the formula bar in the Spreadsheet.
    * @returns {void}
    */
  def updateFormulaBar(): Unit = js.native
  
  /** This method is used to update the range of cells based on the specified settings which we want to update in the Spreadsheet.
    * @param {number} Pass the sheet index that you want to update.
    * @param {Spreadsheet.RangeOptions} Pass the Object "RangeOptions"
    * @returns {void}
    */
  def updateRange(sheetIdx: Double, settings: RangeOptions): Unit = js.native
  
  /** This method is used to update the details for custom undo and redo operations.
    * @param {Spreadsheet.UndoRedoOptions} Pass the Object "UndoRedoOptions"
    * @returns {void}
    */
  def updateUndoRedoCollection(details: UndoRedoOptions): Unit = js.native
  
  /** This method is used to update the unique data for the specified range of cells in Spreadsheet.
    * @param {Spreadsheet.DataOptions} Pass the Object "DataOptions"
    * @param {any[]|string} Optional. If range is specified, it will update data for the specified range else it will use the current selected range.
    * @param {boolean} Optional. It specifies whether to skip element processing or not.
    * @returns {void}
    */
  def updateUniqueData(data: DataOptions): Unit = js.native
  def updateUniqueData(data: DataOptions, range: String): Unit = js.native
  def updateUniqueData(data: DataOptions, range: String, skipCell: Boolean): Unit = js.native
  def updateUniqueData(data: DataOptions, range: js.Array[Any]): Unit = js.native
  def updateUniqueData(data: DataOptions, range: js.Array[Any], skipCell: Boolean): Unit = js.native
  def updateUniqueData(data: DataOptions, range: Unit, skipCell: Boolean): Unit = js.native
  
  /** This method is used to wrap the selected range of cells in the Spreadsheet.
    * @param {any[]|string} Optional. If the range is specified, then it will update wrap in the specified  range else it will use the current selected range.
    * @returns {void}
    */
  def wrapText(): Unit = js.native
  def wrapText(range: String): Unit = js.native
  def wrapText(range: js.Array[Any]): Unit = js.native
}
object Spreadsheet {
  
  @js.native
  sealed trait AutoFillOptions extends StObject
  @JSGlobal("ej.Spreadsheet.AutoFillOptions")
  @js.native
  object AutoFillOptions extends StObject {
    
    ///Specifies the CopyCells property in AutoFillOptions.
    @js.native
    sealed trait CopyCells
      extends StObject
         with AutoFillOptions
    
    ///Specifies the FillFormattingOnly property in AutoFillOptions.
    @js.native
    sealed trait FillFormattingOnly
      extends StObject
         with AutoFillOptions
    
    ///Specifies the FillSeries property in AutoFillOptions.
    @js.native
    sealed trait FillSeries
      extends StObject
         with AutoFillOptions
    
    ///Specifies the FillWithoutFormatting property in AutoFillOptions.
    @js.native
    sealed trait FillWithoutFormatting
      extends StObject
         with AutoFillOptions
    
    ///Specifies the FlashFill property in AutoFillOptions.
    @js.native
    sealed trait FlashFill
      extends StObject
         with AutoFillOptions
  }
  
  @js.native
  sealed trait BorderType extends StObject
  @JSGlobal("ej.Spreadsheet.BorderType")
  @js.native
  object BorderType extends StObject {
    
    ///To apply all border for the given range of cell.
    @js.native
    sealed trait AllBorder
      extends StObject
         with BorderType
    
    ///To apply bottom border for the given range of cell.
    @js.native
    sealed trait Bottom
      extends StObject
         with BorderType
    
    ///To apply left border for the given range of cell.
    @js.native
    sealed trait Left
      extends StObject
         with BorderType
    
    ///To apply outside border for the given range of cell.
    @js.native
    sealed trait OutSide
      extends StObject
         with BorderType
    
    ///To apply right border for the given range of cell.
    @js.native
    sealed trait Right
      extends StObject
         with BorderType
    
    ///To apply thick bottom border for the given range of cell.
    @js.native
    sealed trait ThickBottom
      extends StObject
         with BorderType
    
    ///To apply thick box border for the given range of cell.
    @js.native
    sealed trait ThickBox
      extends StObject
         with BorderType
    
    ///To apply top border for the given range of cell.
    @js.native
    sealed trait Top
      extends StObject
         with BorderType
    
    ///To apply top and bottom border for the given range of cell.
    @js.native
    sealed trait TopandBottom
      extends StObject
         with BorderType
    
    ///To apply top and thick bottom border for the given range of cell.
    @js.native
    sealed trait TopandThickBottom
      extends StObject
         with BorderType
  }
  
  @js.native
  sealed trait CFormatHighlightColor extends StObject
  @JSGlobal("ej.Spreadsheet.CFormatHighlightColor")
  @js.native
  object CFormatHighlightColor extends StObject {
    
    ///Highlights green with dark green text color.
    @js.native
    sealed trait GreenFillwithDarkGreenText
      extends StObject
         with CFormatHighlightColor
    
    ///Highlights with red fill.
    @js.native
    sealed trait RedFill
      extends StObject
         with CFormatHighlightColor
    
    ///Highlights red with dark red text color.
    @js.native
    sealed trait RedFillwithDarkRedText
      extends StObject
         with CFormatHighlightColor
    
    ///Highlights with red text.
    @js.native
    sealed trait RedText
      extends StObject
         with CFormatHighlightColor
    
    ///Highlights yellow with dark yellow text color.
    @js.native
    sealed trait YellowFillwithDarkYellowText
      extends StObject
         with CFormatHighlightColor
  }
  
  @js.native
  sealed trait CFormatRule extends StObject
  @JSGlobal("ej.Spreadsheet.CFormatRule")
  @js.native
  object CFormatRule extends StObject {
    
    ///To identify in between values in the given range of cells.
    @js.native
    sealed trait Between
      extends StObject
         with CFormatRule
    
    ///To identify the specified date in the range of cells.
    @js.native
    sealed trait DateOccurs
      extends StObject
         with CFormatRule
    
    ///To identify the equal values in the given range of cells.
    @js.native
    sealed trait EqualTo
      extends StObject
         with CFormatRule
    
    ///To identify greater than values in the given range of cells.
    @js.native
    sealed trait GreaterThan
      extends StObject
         with CFormatRule
    
    ///To identify less than values in the given range of cells.
    @js.native
    sealed trait LessThan
      extends StObject
         with CFormatRule
    
    ///To identify the specified text in the range of cells.
    @js.native
    sealed trait TextContains
      extends StObject
         with CFormatRule
  }
  
  @js.native
  sealed trait ChartProperties extends StObject
  @JSGlobal("ej.Spreadsheet.ChartProperties")
  @js.native
  object ChartProperties extends StObject {
    
    ///Specifies to make the data label center of the chart.
    @js.native
    sealed trait DataLabelCenter
      extends StObject
         with ChartProperties
    
    ///Specifies to make the data label inside base of the chart.
    @js.native
    sealed trait DataLabelInsideBase
      extends StObject
         with ChartProperties
    
    ///Specifies to make the data label inside end of the chart.
    @js.native
    sealed trait DataLabelInsideEnd
      extends StObject
         with ChartProperties
    
    ///Specifies to make the data label none of the chart.
    @js.native
    sealed trait DataLabelNone
      extends StObject
         with ChartProperties
    
    ///Specifies to make the data label outside end of the chart.
    @js.native
    sealed trait DataLabelOutsideEnd
      extends StObject
         with ChartProperties
    
    ///Specifies to make the legends to bottom of the chart.
    @js.native
    sealed trait LegendsBottom
      extends StObject
         with ChartProperties
    
    ///Specifies to make the legends to left of the chart.
    @js.native
    sealed trait LegendsLeft
      extends StObject
         with ChartProperties
    
    ///Specifies to make the legends to none of the chart.
    @js.native
    sealed trait LegendsNone
      extends StObject
         with ChartProperties
    
    ///Specifies to make the legends to right of the chart.
    @js.native
    sealed trait LegendsRight
      extends StObject
         with ChartProperties
    
    ///Specifies to make the legends to top of the chart.
    @js.native
    sealed trait LegendsTop
      extends StObject
         with ChartProperties
    
    ///To set the primary horizontal of the chart.
    @js.native
    sealed trait PrimaryHorizontal
      extends StObject
         with ChartProperties
    
    ///To set the primary horizontal axis title of the chart.
    @js.native
    sealed trait PrimaryHorizontalAxisTitle
      extends StObject
         with ChartProperties
    
    ///To set the primary major horizontal of the chart.
    @js.native
    sealed trait PrimaryMajorHorizontal
      extends StObject
         with ChartProperties
    
    ///To set the primary major vertical of the chart.
    @js.native
    sealed trait PrimaryMajorVertical
      extends StObject
         with ChartProperties
    
    ///To set the primary minor horizontal of the chart.
    @js.native
    sealed trait PrimaryMinorHorizontal
      extends StObject
         with ChartProperties
    
    ///To set the primary minor vertical of the chart.
    @js.native
    sealed trait PrimaryMinorVertical
      extends StObject
         with ChartProperties
    
    ///To set the primary vertical of the chart.
    @js.native
    sealed trait PrimaryVertical
      extends StObject
         with ChartProperties
    
    ///To set the primary vertical axis title of the chart.
    @js.native
    sealed trait PrimaryVerticalAxisTitle
      extends StObject
         with ChartProperties
    
    ///Specifies to make the title to center of the chart.
    @js.native
    sealed trait TitleCenter
      extends StObject
         with ChartProperties
    
    ///Specifies to make the title to far of the chart.
    @js.native
    sealed trait TitleFar
      extends StObject
         with ChartProperties
    
    ///Specifies to make the title to near of the chart.
    @js.native
    sealed trait TitleNear
      extends StObject
         with ChartProperties
    
    ///Specifies to make the title to none of the chart.
    @js.native
    sealed trait TitleNone
      extends StObject
         with ChartProperties
  }
  
  @js.native
  sealed trait ContextMenuType extends StObject
  @JSGlobal("ej.Spreadsheet.ContextMenuType")
  @js.native
  object ContextMenuType extends StObject {
    
    ///To specify cell Context Menu.
    @js.native
    sealed trait Cell
      extends StObject
         with ContextMenuType
    
    ///To specify column header Context Menu.
    @js.native
    sealed trait ColumnHeader
      extends StObject
         with ContextMenuType
    
    ///To specify footer Context Menu.
    @js.native
    sealed trait Footer
      extends StObject
         with ContextMenuType
    
    ///To specify row header Context Menu.
    @js.native
    sealed trait RowHeader
      extends StObject
         with ContextMenuType
  }
  
  @js.native
  sealed trait CustomCellType extends StObject
  @JSGlobal("ej.Spreadsheet.CustomCellType")
  @js.native
  object CustomCellType extends StObject {
    
    ///To insert the Button in cell.
    @js.native
    sealed trait Button
      extends StObject
         with CustomCellType
    
    ///To insert the Checkbox in cell.
    @js.native
    sealed trait CheckBox
      extends StObject
         with CustomCellType
    
    ///To insert the Datepicker in cell.
    @js.native
    sealed trait DatePicker
      extends StObject
         with CustomCellType
    
    ///To insert the Dropdownlist in cell.
    @js.native
    sealed trait DropDownList
      extends StObject
         with CustomCellType
  }
  
  @js.native
  sealed trait ExportType extends StObject
  @JSGlobal("ej.Spreadsheet.ExportType")
  @js.native
  object ExportType extends StObject {
    
    ///Specifies to export the file in Csv format.
    @js.native
    sealed trait Csv
      extends StObject
         with ExportType
    
    ///Specifies to export the file in Excel format.
    @js.native
    sealed trait Excel
      extends StObject
         with ExportType
    
    ///Specifies to export the file in Pdf format.
    @js.native
    sealed trait Pdf
      extends StObject
         with ExportType
  }
  
  @js.native
  sealed trait SelectionType extends StObject
  @JSGlobal("ej.Spreadsheet.SelectionType")
  @js.native
  object SelectionType extends StObject {
    
    ///To select only Column in Spreadsheet.
    @js.native
    sealed trait Column
      extends StObject
         with SelectionType
    
    ///To select both Column/Row in Spreadsheet.
    @js.native
    sealed trait Default
      extends StObject
         with SelectionType
    
    ///To select only Row in Spreadsheet.
    @js.native
    sealed trait Row
      extends StObject
         with SelectionType
  }
  
  @js.native
  sealed trait SelectionUnit extends StObject
  @JSGlobal("ej.Spreadsheet.SelectionUnit")
  @js.native
  object SelectionUnit extends StObject {
    
    ///To enable MultiRange selection in Spreadsheet
    @js.native
    sealed trait MultiRange
      extends StObject
         with SelectionUnit
    
    ///To enable Range selection in Spreadsheet
    @js.native
    sealed trait Range
      extends StObject
         with SelectionUnit
    
    ///To enable Single selection in Spreadsheet
    @js.native
    sealed trait Single
      extends StObject
         with SelectionUnit
  }
  
  @js.native
  sealed trait scrollMode extends StObject
  @JSGlobal("ej.Spreadsheet.scrollMode")
  @js.native
  object scrollMode extends StObject {
    
    ///To enable Infinite scroll mode for Spreadsheet.
    @js.native
    sealed trait Infinite
      extends StObject
         with scrollMode
    
    ///To enable Normal scroll mode for Spreadsheet.
    @js.native
    sealed trait Normal
      extends StObject
         with scrollMode
  }
  
  trait ActionBeginEventArgs extends StObject {
    
    /** Returns the applied style format object.
      */
    var afterFormat: js.UndefOr[Any] = js.undefined
    
    /** Returns the applied style format object.
      */
    var beforeFormat: js.UndefOr[Any] = js.undefined
    
    /** Returns selected columns while sorting or filtering begins.
      */
    var colSelected: js.UndefOr[Double] = js.undefined
    
    /** Return column name while sorting.
      */
    var columnName: js.UndefOr[String] = js.undefined
    
    /** Returns goto index while paging.
      */
    var gotoIdx: js.UndefOr[Double] = js.undefined
    
    /** Returns boolean value. If create new sheet it returns true.
      */
    var newSheet: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the cell range.
      */
    var range: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Returns the action format.
      */
    var reqType: js.UndefOr[String] = js.undefined
    
    /** Returns the sheet index.
      */
    var sheetIdx: js.UndefOr[Double] = js.undefined
    
    /** Returns sort direction while sort action begins.
      */
    var sortDirection: js.UndefOr[String] = js.undefined
  }
  object ActionBeginEventArgs {
    
    inline def apply(): ActionBeginEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionBeginEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionBeginEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAfterFormat(value: Any): Self = StObject.set(x, "afterFormat", value.asInstanceOf[js.Any])
      
      inline def setAfterFormatUndefined: Self = StObject.set(x, "afterFormat", js.undefined)
      
      inline def setBeforeFormat(value: Any): Self = StObject.set(x, "beforeFormat", value.asInstanceOf[js.Any])
      
      inline def setBeforeFormatUndefined: Self = StObject.set(x, "beforeFormat", js.undefined)
      
      inline def setColSelected(value: Double): Self = StObject.set(x, "colSelected", value.asInstanceOf[js.Any])
      
      inline def setColSelectedUndefined: Self = StObject.set(x, "colSelected", js.undefined)
      
      inline def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      inline def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
      
      inline def setGotoIdx(value: Double): Self = StObject.set(x, "gotoIdx", value.asInstanceOf[js.Any])
      
      inline def setGotoIdxUndefined: Self = StObject.set(x, "gotoIdx", js.undefined)
      
      inline def setNewSheet(value: Boolean): Self = StObject.set(x, "newSheet", value.asInstanceOf[js.Any])
      
      inline def setNewSheetUndefined: Self = StObject.set(x, "newSheet", js.undefined)
      
      inline def setRange(value: js.Array[Any]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setRangeVarargs(value: Any*): Self = StObject.set(x, "range", js.Array(value*))
      
      inline def setReqType(value: String): Self = StObject.set(x, "reqType", value.asInstanceOf[js.Any])
      
      inline def setReqTypeUndefined: Self = StObject.set(x, "reqType", js.undefined)
      
      inline def setSheetIdx(value: Double): Self = StObject.set(x, "sheetIdx", value.asInstanceOf[js.Any])
      
      inline def setSheetIdxUndefined: Self = StObject.set(x, "sheetIdx", js.undefined)
      
      inline def setSortDirection(value: String): Self = StObject.set(x, "sortDirection", value.asInstanceOf[js.Any])
      
      inline def setSortDirectionUndefined: Self = StObject.set(x, "sortDirection", js.undefined)
    }
  }
  
  trait ActionCompleteEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the request type.
      */
    var reqType: js.UndefOr[String] = js.undefined
    
    /** Returns the applied cell format object.
      */
    var selectedCell: js.UndefOr[js.Array[Any] | Any] = js.undefined
    
    /** Returns the sheet index.
      */
    var sheetIdx: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ActionCompleteEventArgs {
    
    inline def apply(): ActionCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActionCompleteEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionCompleteEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setReqType(value: String): Self = StObject.set(x, "reqType", value.asInstanceOf[js.Any])
      
      inline def setReqTypeUndefined: Self = StObject.set(x, "reqType", js.undefined)
      
      inline def setSelectedCell(value: js.Array[Any] | Any): Self = StObject.set(x, "selectedCell", value.asInstanceOf[js.Any])
      
      inline def setSelectedCellUndefined: Self = StObject.set(x, "selectedCell", js.undefined)
      
      inline def setSelectedCellVarargs(value: Any*): Self = StObject.set(x, "selectedCell", js.Array(value*))
      
      inline def setSheetIdx(value: Double): Self = StObject.set(x, "sheetIdx", value.asInstanceOf[js.Any])
      
      inline def setSheetIdxUndefined: Self = StObject.set(x, "sheetIdx", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AutoFillBeginEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns auto fill begin cell range.
      */
    var dataRange: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Returns which direction drag the auto fill.
      */
    var direction: js.UndefOr[String] = js.undefined
    
    /** Returns fill cells range.
      */
    var fillRange: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Returns the auto fill type.
      */
    var fillType: js.UndefOr[String] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the sheet index.
      */
    var sheetIdx: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AutoFillBeginEventArgs {
    
    inline def apply(): AutoFillBeginEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoFillBeginEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoFillBeginEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDataRange(value: js.Array[Any]): Self = StObject.set(x, "dataRange", value.asInstanceOf[js.Any])
      
      inline def setDataRangeUndefined: Self = StObject.set(x, "dataRange", js.undefined)
      
      inline def setDataRangeVarargs(value: Any*): Self = StObject.set(x, "dataRange", js.Array(value*))
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setFillRange(value: js.Array[Any]): Self = StObject.set(x, "fillRange", value.asInstanceOf[js.Any])
      
      inline def setFillRangeUndefined: Self = StObject.set(x, "fillRange", js.undefined)
      
      inline def setFillRangeVarargs(value: Any*): Self = StObject.set(x, "fillRange", js.Array(value*))
      
      inline def setFillType(value: String): Self = StObject.set(x, "fillType", value.asInstanceOf[js.Any])
      
      inline def setFillTypeUndefined: Self = StObject.set(x, "fillType", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSheetIdx(value: Double): Self = StObject.set(x, "sheetIdx", value.asInstanceOf[js.Any])
      
      inline def setSheetIdxUndefined: Self = StObject.set(x, "sheetIdx", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AutoFillCompleteEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns auto fill begin cell range.
      */
    var dataRange: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Returns which direction to drag the auto fill.
      */
    var direction: js.UndefOr[String] = js.undefined
    
    /** Returns fill cells range.
      */
    var fillRange: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Returns the auto fill type.
      */
    var fillType: js.UndefOr[String] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the sheet index.
      */
    var sheetIdx: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AutoFillCompleteEventArgs {
    
    inline def apply(): AutoFillCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoFillCompleteEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoFillCompleteEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setDataRange(value: js.Array[Any]): Self = StObject.set(x, "dataRange", value.asInstanceOf[js.Any])
      
      inline def setDataRangeUndefined: Self = StObject.set(x, "dataRange", js.undefined)
      
      inline def setDataRangeVarargs(value: Any*): Self = StObject.set(x, "dataRange", js.Array(value*))
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setFillRange(value: js.Array[Any]): Self = StObject.set(x, "fillRange", value.asInstanceOf[js.Any])
      
      inline def setFillRangeUndefined: Self = StObject.set(x, "fillRange", js.undefined)
      
      inline def setFillRangeVarargs(value: Any*): Self = StObject.set(x, "fillRange", js.Array(value*))
      
      inline def setFillType(value: String): Self = StObject.set(x, "fillType", value.asInstanceOf[js.Any])
      
      inline def setFillTypeUndefined: Self = StObject.set(x, "fillType", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSheetIdx(value: Double): Self = StObject.set(x, "sheetIdx", value.asInstanceOf[js.Any])
      
      inline def setSheetIdxUndefined: Self = StObject.set(x, "sheetIdx", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AutoFillObject extends StObject {
    
    /** Pass the data range to autofill
      */
    var dataRange: js.UndefOr[String] = js.undefined
    
    /** Pass the direction to autofill
      */
    var direction: js.UndefOr[String] = js.undefined
    
    /** Pass the fill range to autofill
      */
    var fillRange: js.UndefOr[String] = js.undefined
    
    /** Pass the fill type to perform autofill in spreadsheet
      */
    var fillType: js.UndefOr[String] = js.undefined
  }
  object AutoFillObject {
    
    inline def apply(): AutoFillObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoFillObject]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoFillObject] (val x: Self) extends AnyVal {
      
      inline def setDataRange(value: String): Self = StObject.set(x, "dataRange", value.asInstanceOf[js.Any])
      
      inline def setDataRangeUndefined: Self = StObject.set(x, "dataRange", js.undefined)
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setFillRange(value: String): Self = StObject.set(x, "fillRange", value.asInstanceOf[js.Any])
      
      inline def setFillRangeUndefined: Self = StObject.set(x, "fillRange", js.undefined)
      
      inline def setFillType(value: String): Self = StObject.set(x, "fillType", value.asInstanceOf[js.Any])
      
      inline def setFillTypeUndefined: Self = StObject.set(x, "fillType", js.undefined)
    }
  }
  
  trait AutoFillSettings extends StObject {
    
    /** This property is used to set fillType unit in Spreadsheet. It has five types which are CopyCells, FillSeries, FillFormattingOnly, FillWithoutFormatting and FlashFill.
      * @default {ej.Spreadsheet.AutoFillOptions.FillSeries}
      */
    var fillType: js.UndefOr[AutoFillOptions | String] = js.undefined
    
    /** Gets or sets a value that indicates to enable or disable auto fill options in the Spreadsheet.
      * @default {true}
      */
    var showFillOptions: js.UndefOr[Boolean] = js.undefined
  }
  object AutoFillSettings {
    
    inline def apply(): AutoFillSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AutoFillSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AutoFillSettings] (val x: Self) extends AnyVal {
      
      inline def setFillType(value: AutoFillOptions | String): Self = StObject.set(x, "fillType", value.asInstanceOf[js.Any])
      
      inline def setFillTypeUndefined: Self = StObject.set(x, "fillType", js.undefined)
      
      inline def setShowFillOptions(value: Boolean): Self = StObject.set(x, "showFillOptions", value.asInstanceOf[js.Any])
      
      inline def setShowFillOptionsUndefined: Self = StObject.set(x, "showFillOptions", js.undefined)
    }
  }
  
  trait BackstageOptions extends StObject {
    
    /** Pass the id to added in backstage
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Pass the item type to added in backstage
      */
    var itemType: js.UndefOr[HTMLElement] = js.undefined
    
    /** Pass the text to added in backstage
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object BackstageOptions {
    
    inline def apply(): BackstageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackstageOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BackstageOptions] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setItemType(value: HTMLElement): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      inline def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait BeforeBatchSaveEventArgs extends StObject {
    
    /** Returns the changed record object.
      */
    var batchChanges: js.UndefOr[Any] = js.undefined
    
    /** Returns the query, primary key,batch changes for the data Source.
      */
    var dataSetting: js.UndefOr[Any] = js.undefined
    
    /** Returns the sheet index.
      */
    var sheetIdx: js.UndefOr[Double] = js.undefined
  }
  object BeforeBatchSaveEventArgs {
    
    inline def apply(): BeforeBatchSaveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeBatchSaveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeBatchSaveEventArgs] (val x: Self) extends AnyVal {
      
      inline def setBatchChanges(value: Any): Self = StObject.set(x, "batchChanges", value.asInstanceOf[js.Any])
      
      inline def setBatchChangesUndefined: Self = StObject.set(x, "batchChanges", js.undefined)
      
      inline def setDataSetting(value: Any): Self = StObject.set(x, "dataSetting", value.asInstanceOf[js.Any])
      
      inline def setDataSettingUndefined: Self = StObject.set(x, "dataSetting", js.undefined)
      
      inline def setSheetIdx(value: Double): Self = StObject.set(x, "sheetIdx", value.asInstanceOf[js.Any])
      
      inline def setSheetIdxUndefined: Self = StObject.set(x, "sheetIdx", js.undefined)
    }
  }
  
  trait BeforeCellFormatEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the selected cells.
      */
    var cells: js.UndefOr[js.Array[Any] | Any] = js.undefined
    
    /** Returns the applied style format object.
      */
    var format: js.UndefOr[Any] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the sheet index.
      */
    var sheetIdx: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeCellFormatEventArgs {
    
    inline def apply(): BeforeCellFormatEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeCellFormatEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeCellFormatEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCells(value: js.Array[Any] | Any): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
      
      inline def setCellsVarargs(value: Any*): Self = StObject.set(x, "cells", js.Array(value*))
      
      inline def setFormat(value: Any): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSheetIdx(value: Double): Self = StObject.set(x, "sheetIdx", value.asInstanceOf[js.Any])
      
      inline def setSheetIdxUndefined: Self = StObject.set(x, "sheetIdx", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeCellSelectEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current cell range.
      */
    var currRange: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the previous cell range.
      */
    var prevRange: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeCellSelectEventArgs {
    
    inline def apply(): BeforeCellSelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeCellSelectEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeCellSelectEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrRange(value: js.Array[Any]): Self = StObject.set(x, "currRange", value.asInstanceOf[js.Any])
      
      inline def setCurrRangeUndefined: Self = StObject.set(x, "currRange", js.undefined)
      
      inline def setCurrRangeVarargs(value: Any*): Self = StObject.set(x, "currRange", js.Array(value*))
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrevRange(value: js.Array[Any]): Self = StObject.set(x, "prevRange", value.asInstanceOf[js.Any])
      
      inline def setPrevRangeUndefined: Self = StObject.set(x, "prevRange", js.undefined)
      
      inline def setPrevRangeVarargs(value: Any*): Self = StObject.set(x, "prevRange", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeDropEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current cell row and column index.
      */
    var currentCell: js.UndefOr[Any] = js.undefined
    
    /** Returns the drag cells range object.
      */
    var dragAndDropRange: js.UndefOr[Any] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the cell Overwriting alert option value.
      */
    var preventAlert: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the sheet index.
      */
    var sheetIdx: js.UndefOr[Double] = js.undefined
    
    /** Returns the target item.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeDropEventArgs {
    
    inline def apply(): BeforeDropEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeDropEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeDropEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentCell(value: Any): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
      
      inline def setCurrentCellUndefined: Self = StObject.set(x, "currentCell", js.undefined)
      
      inline def setDragAndDropRange(value: Any): Self = StObject.set(x, "dragAndDropRange", value.asInstanceOf[js.Any])
      
      inline def setDragAndDropRangeUndefined: Self = StObject.set(x, "dragAndDropRange", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPreventAlert(value: Boolean): Self = StObject.set(x, "preventAlert", value.asInstanceOf[js.Any])
      
      inline def setPreventAlertUndefined: Self = StObject.set(x, "preventAlert", js.undefined)
      
      inline def setSheetIdx(value: Double): Self = StObject.set(x, "sheetIdx", value.asInstanceOf[js.Any])
      
      inline def setSheetIdxUndefined: Self = StObject.set(x, "sheetIdx", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforeEditCommentEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the comment cell index.
      */
    var cellIndex: js.UndefOr[Any] = js.undefined
    
    /** Returns the disable option value.
      */
    var disable: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the sheet index.
      */
    var sheetIdx: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Returns the value of the comment
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object BeforeEditCommentEventArgs {
    
    inline def apply(): BeforeEditCommentEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeEditCommentEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeEditCommentEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCellIndex(value: Any): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
      
      inline def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
      
      inline def setDisable(value: Boolean): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      inline def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSheetIdx(value: Double): Self = StObject.set(x, "sheetIdx", value.asInstanceOf[js.Any])
      
      inline def setSheetIdxUndefined: Self = StObject.set(x, "sheetIdx", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait BeforeOpenEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the target element.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforeOpenEventArgs {
    
    inline def apply(): BeforeOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeOpenEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeOpenEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforePanelOpenEventArgs extends StObject {
    
    /** Returns the activation panel element.
      */
    var activationPanel: js.UndefOr[Any] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the range option value.
      */
    var range: js.UndefOr[Any] = js.undefined
    
    /** Returns the sheet index.
      */
    var sheetIdx: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforePanelOpenEventArgs {
    
    inline def apply(): BeforePanelOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforePanelOpenEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforePanelOpenEventArgs] (val x: Self) extends AnyVal {
      
      inline def setActivationPanel(value: Any): Self = StObject.set(x, "activationPanel", value.asInstanceOf[js.Any])
      
      inline def setActivationPanelUndefined: Self = StObject.set(x, "activationPanel", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRange(value: Any): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setSheetIdx(value: Double): Self = StObject.set(x, "sheetIdx", value.asInstanceOf[js.Any])
      
      inline def setSheetIdxUndefined: Self = StObject.set(x, "sheetIdx", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BorderOptions extends StObject {
    
    /** Pass the color to set border of the cell
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Pass the style to set border of the cell
      */
    var style: js.UndefOr[String] = js.undefined
    
    /** Pass the type to set border of the cell
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BorderOptions {
    
    inline def apply(): BorderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BorderOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BorderOptions] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CFormatOptions extends StObject {
    
    /** Pass the condition to set the conditional formatting
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** Pass the bgColor to set the conditional formatting
      */
    var bgColor: js.UndefOr[String] = js.undefined
    
    /** Pass the color to set the conditional formatting
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Pass the inputs to set the conditional formatting
      */
    var inputs: js.UndefOr[js.Array[Any] | String] = js.undefined
    
    /** Pass the range to set the conditional formatting
      */
    var range: js.UndefOr[String] = js.undefined
  }
  object CFormatOptions {
    
    inline def apply(): CFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CFormatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CFormatOptions] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setBgColor(value: String): Self = StObject.set(x, "bgColor", value.asInstanceOf[js.Any])
      
      inline def setBgColorUndefined: Self = StObject.set(x, "bgColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setInputs(value: js.Array[Any] | String): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      inline def setInputsVarargs(value: Any*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    }
  }
  
  trait CellClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the click cell element.
      */
    var cell: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the column index of clicked cell.
      */
    var columnIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the column name of clicked cell.
      */
    var columnName: js.UndefOr[String] = js.undefined
    
    /** Returns the column information.
      */
    var columnObject: js.UndefOr[Any] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the row index of clicked cell.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the target element.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Returns the value of the cell.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object CellClickEventArgs {
    
    inline def apply(): CellClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCell(value: HTMLElement): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setColumnIndex(value: Double): Self = StObject.set(x, "columnIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnIndexUndefined: Self = StObject.set(x, "columnIndex", js.undefined)
      
      inline def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      inline def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
      
      inline def setColumnObject(value: Any): Self = StObject.set(x, "columnObject", value.asInstanceOf[js.Any])
      
      inline def setColumnObjectUndefined: Self = StObject.set(x, "columnObject", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CellEditEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the click cell element.
      */
    var cell: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the columnName of clicked cell.
      */
    var columnName: js.UndefOr[String] = js.undefined
    
    /** Returns the column field information.
      */
    var columnObject: js.UndefOr[Any] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the target element.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CellEditEventArgs {
    
    inline def apply(): CellEditEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellEditEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellEditEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCell(value: HTMLElement): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      inline def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
      
      inline def setColumnObject(value: Any): Self = StObject.set(x, "columnObject", value.asInstanceOf[js.Any])
      
      inline def setColumnObjectUndefined: Self = StObject.set(x, "columnObject", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CellFormattingEventArgs extends StObject {
    
    /** Returns the cell index.
      */
    var Cell: js.UndefOr[Double] = js.undefined
    
    /** Returns the applied style format object
      */
    var Format: js.UndefOr[Any] = js.undefined
    
    /** Returns the sheet index
      */
    var SheetIdx: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the CSS theme.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the target element.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CellFormattingEventArgs {
    
    inline def apply(): CellFormattingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellFormattingEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellFormattingEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCell(value: Double): Self = StObject.set(x, "Cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "Cell", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setFormat(value: Any): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSheetIdx(value: Double): Self = StObject.set(x, "SheetIdx", value.asInstanceOf[js.Any])
      
      inline def setSheetIdxUndefined: Self = StObject.set(x, "SheetIdx", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CellHoverEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the target element.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CellHoverEventArgs {
    
    inline def apply(): CellHoverEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellHoverEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellHoverEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CellIndex extends StObject {
    
    /** Pass the column index of the starting cell
      */
    var colIndex: js.UndefOr[Double] = js.undefined
    
    /** Pass the row index of the starting cell
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
  }
  object CellIndex {
    
    inline def apply(): CellIndex = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellIndex]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellIndex] (val x: Self) extends AnyVal {
      
      inline def setColIndex(value: Double): Self = StObject.set(x, "colIndex", value.asInstanceOf[js.Any])
      
      inline def setColIndexUndefined: Self = StObject.set(x, "colIndex", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    }
  }
  
  trait CellSaveEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the save cell element.
      */
    var cell: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the index of the column.
      */
    var colIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the columnName of clicked cell.
      */
    var columnName: js.UndefOr[String] = js.undefined
    
    /** Returns the column field information.
      */
    var columnObject: js.UndefOr[Any] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the cell previous value.
      */
    var prevValue: js.UndefOr[String] = js.undefined
    
    /** Returns the index of the row.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the target element.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Returns the cell value.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object CellSaveEventArgs {
    
    inline def apply(): CellSaveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellSaveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellSaveEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCell(value: HTMLElement): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setColIndex(value: Double): Self = StObject.set(x, "colIndex", value.asInstanceOf[js.Any])
      
      inline def setColIndexUndefined: Self = StObject.set(x, "colIndex", js.undefined)
      
      inline def setColumnName(value: String): Self = StObject.set(x, "columnName", value.asInstanceOf[js.Any])
      
      inline def setColumnNameUndefined: Self = StObject.set(x, "columnName", js.undefined)
      
      inline def setColumnObject(value: Any): Self = StObject.set(x, "columnObject", value.asInstanceOf[js.Any])
      
      inline def setColumnObjectUndefined: Self = StObject.set(x, "columnObject", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrevValue(value: String): Self = StObject.set(x, "prevValue", value.asInstanceOf[js.Any])
      
      inline def setPrevValueUndefined: Self = StObject.set(x, "prevValue", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait CellSelectedEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the selected range.
      */
    var selectedRange: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Returns the active sheet index.
      */
    var sheetIdx: js.UndefOr[Double] = js.undefined
    
    /** Returns the target element.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CellSelectedEventArgs {
    
    inline def apply(): CellSelectedEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellSelectedEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellSelectedEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSelectedRange(value: js.Array[Any]): Self = StObject.set(x, "selectedRange", value.asInstanceOf[js.Any])
      
      inline def setSelectedRangeUndefined: Self = StObject.set(x, "selectedRange", js.undefined)
      
      inline def setSelectedRangeVarargs(value: Any*): Self = StObject.set(x, "selectedRange", js.Array(value*))
      
      inline def setSheetIdx(value: Double): Self = StObject.set(x, "sheetIdx", value.asInstanceOf[js.Any])
      
      inline def setSheetIdxUndefined: Self = StObject.set(x, "sheetIdx", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CellTypeSettings extends StObject {
    
    /** Specifies the button background color of Custom Cell type.
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the dropdown list data source range of Custom Cell type.
      */
    var dataSourceRange: js.UndefOr[String] = js.undefined
    
    /** Specifies the dropdown list data source sheet index of Custom Cell type.
      */
    var dataSourceSheetIndex: js.UndefOr[Double] = js.undefined
    
    /** Specifies the text and value of field in dropdown list.
      */
    var field: js.UndefOr[Any] = js.undefined
    
    /** Specifies the checkbox is set true or false of Custom Cell type.
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the button text of Custom Cell type.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specifies the button type of Custom Cell type.
      */
    var `type`: js.UndefOr[CustomCellType] = js.undefined
    
    /** Specifies the datepicker of Custom Cell type.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object CellTypeSettings {
    
    inline def apply(): CellTypeSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellTypeSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CellTypeSettings] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setDataSourceRange(value: String): Self = StObject.set(x, "dataSourceRange", value.asInstanceOf[js.Any])
      
      inline def setDataSourceRangeUndefined: Self = StObject.set(x, "dataSourceRange", js.undefined)
      
      inline def setDataSourceSheetIndex(value: Double): Self = StObject.set(x, "dataSourceSheetIndex", value.asInstanceOf[js.Any])
      
      inline def setDataSourceSheetIndexUndefined: Self = StObject.set(x, "dataSourceSheetIndex", js.undefined)
      
      inline def setField(value: Any): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
      
      inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: CustomCellType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ChartOptions extends StObject {
    
    /** Pass the enable3D condition
      */
    var enable3D: js.UndefOr[Boolean] = js.undefined
    
    /** Pass the marker object to change type
      */
    var marker: js.UndefOr[Any] = js.undefined
    
    /** Pass the chart type
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ChartOptions {
    
    inline def apply(): ChartOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChartOptions] (val x: Self) extends AnyVal {
      
      inline def setEnable3D(value: Boolean): Self = StObject.set(x, "enable3D", value.asInstanceOf[js.Any])
      
      inline def setEnable3DUndefined: Self = StObject.set(x, "enable3D", js.undefined)
      
      inline def setMarker(value: Any): Self = StObject.set(x, "marker", value.asInstanceOf[js.Any])
      
      inline def setMarkerUndefined: Self = StObject.set(x, "marker", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ChartSettings extends StObject {
    
    /** Gets or sets a value that defines the chart height in Spreadsheet.
      * @default {220}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets a value that defines the chart width in the Spreadsheet.
      * @default {440}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object ChartSettings {
    
    inline def apply(): ChartSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChartSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChartSettings] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ColorOptions extends StObject {
    
    /** Pass the background color to sort the cell
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Pass the color to sort the cell
      */
    var color: js.UndefOr[String] = js.undefined
  }
  object ColorOptions {
    
    inline def apply(): ColorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColorOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColorOptions] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    }
  }
  
  trait ContextMenuClickEventArgs extends StObject {
    
    /** Returns target element Id.
      */
    var Id: js.UndefOr[String] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the target element.
      */
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns event information.
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** Returns target element and event information.
      */
    var events: js.UndefOr[Any] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns target element parent Id.
      */
    var parentId: js.UndefOr[String] = js.undefined
    
    /** Returns target element parent text.
      */
    var parentText: js.UndefOr[String] = js.undefined
    
    /** Returns target element text.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ContextMenuClickEventArgs {
    
    inline def apply(): ContextMenuClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextMenuClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextMenuClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setEvents(value: Any): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setParentText(value: String): Self = StObject.set(x, "parentText", value.asInstanceOf[js.Any])
      
      inline def setParentTextUndefined: Self = StObject.set(x, "parentText", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ContextualTabOptions extends StObject {
    
    /** Pass the background color
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Pass the border color
      */
    var borderColor: js.UndefOr[String] = js.undefined
    
    /** Pass the tabs object to add in ribbon
      */
    var tabs: js.UndefOr[Any] = js.undefined
  }
  object ContextualTabOptions {
    
    inline def apply(): ContextualTabOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContextualTabOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ContextualTabOptions] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBorderColor(value: String): Self = StObject.set(x, "borderColor", value.asInstanceOf[js.Any])
      
      inline def setBorderColorUndefined: Self = StObject.set(x, "borderColor", js.undefined)
      
      inline def setTabs(value: Any): Self = StObject.set(x, "tabs", value.asInstanceOf[js.Any])
      
      inline def setTabsUndefined: Self = StObject.set(x, "tabs", js.undefined)
    }
  }
  
  trait CustomStyleOptions extends StObject {
    
    /** Pass the number format object
      */
    var NumFormat: js.UndefOr[Any] = js.undefined
    
    /** Pass the style object
      */
    var style: js.UndefOr[Any] = js.undefined
  }
  object CustomStyleOptions {
    
    inline def apply(): CustomStyleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomStyleOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomStyleOptions] (val x: Self) extends AnyVal {
      
      inline def setNumFormat(value: Any): Self = StObject.set(x, "NumFormat", value.asInstanceOf[js.Any])
      
      inline def setNumFormatUndefined: Self = StObject.set(x, "NumFormat", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait DataOptions extends StObject {
    
    /** Pass the type to update
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** Pass the value to update
      */
    var value: js.UndefOr[Double] = js.undefined
    
    /** Pass the value2 to update
      */
    var value2: js.UndefOr[Double] = js.undefined
  }
  object DataOptions {
    
    inline def apply(): DataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DataOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DataOptions] (val x: Self) extends AnyVal {
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValue2(value: Double): Self = StObject.set(x, "value2", value.asInstanceOf[js.Any])
      
      inline def setValue2Undefined: Self = StObject.set(x, "value2", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait DragEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current cell row and column index.
      */
    var currentCell: js.UndefOr[Any] = js.undefined
    
    /** Returns the drag cells range object.
      */
    var dragAndDropRange: js.UndefOr[Any] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the sheet index.
      */
    var sheetIdx: js.UndefOr[Double] = js.undefined
    
    /** Returns the target item.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DragEventArgs {
    
    inline def apply(): DragEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentCell(value: Any): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
      
      inline def setCurrentCellUndefined: Self = StObject.set(x, "currentCell", js.undefined)
      
      inline def setDragAndDropRange(value: Any): Self = StObject.set(x, "dragAndDropRange", value.asInstanceOf[js.Any])
      
      inline def setDragAndDropRangeUndefined: Self = StObject.set(x, "dragAndDropRange", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSheetIdx(value: Double): Self = StObject.set(x, "sheetIdx", value.asInstanceOf[js.Any])
      
      inline def setSheetIdxUndefined: Self = StObject.set(x, "sheetIdx", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DragShapeEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the target element.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DragShapeEventArgs {
    
    inline def apply(): DragShapeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragShapeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragShapeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DragStartEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current cell row and column index.
      */
    var currentCell: js.UndefOr[Any] = js.undefined
    
    /** Returns the drag cells range object.
      */
    var dragAndDropRange: js.UndefOr[Any] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the sheet index.
      */
    var sheetIdx: js.UndefOr[Double] = js.undefined
    
    /** Returns the target item.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DragStartEventArgs {
    
    inline def apply(): DragStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DragStartEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DragStartEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentCell(value: Any): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
      
      inline def setCurrentCellUndefined: Self = StObject.set(x, "currentCell", js.undefined)
      
      inline def setDragAndDropRange(value: Any): Self = StObject.set(x, "dragAndDropRange", value.asInstanceOf[js.Any])
      
      inline def setDragAndDropRangeUndefined: Self = StObject.set(x, "dragAndDropRange", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSheetIdx(value: Double): Self = StObject.set(x, "sheetIdx", value.asInstanceOf[js.Any])
      
      inline def setSheetIdxUndefined: Self = StObject.set(x, "sheetIdx", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DropEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current cell row and column index.
      */
    var currentCell: js.UndefOr[Any] = js.undefined
    
    /** Returns the drag cells range object.
      */
    var dragAndDropRange: js.UndefOr[Any] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the sheet index.
      */
    var sheetIdx: js.UndefOr[Double] = js.undefined
    
    /** Returns the target item.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DropEventArgs {
    
    inline def apply(): DropEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DropEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DropEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentCell(value: Any): Self = StObject.set(x, "currentCell", value.asInstanceOf[js.Any])
      
      inline def setCurrentCellUndefined: Self = StObject.set(x, "currentCell", js.undefined)
      
      inline def setDragAndDropRange(value: Any): Self = StObject.set(x, "dragAndDropRange", value.asInstanceOf[js.Any])
      
      inline def setDragAndDropRangeUndefined: Self = StObject.set(x, "dragAndDropRange", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSheetIdx(value: Double): Self = StObject.set(x, "sheetIdx", value.asInstanceOf[js.Any])
      
      inline def setSheetIdxUndefined: Self = StObject.set(x, "sheetIdx", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait EditRangeBeginEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the range option value.
      */
    var range: js.UndefOr[Any] = js.undefined
    
    /** Returns the sheet index.
      */
    var sheetIdx: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object EditRangeBeginEventArgs {
    
    inline def apply(): EditRangeBeginEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditRangeBeginEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditRangeBeginEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRange(value: Any): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setSheetIdx(value: Double): Self = StObject.set(x, "sheetIdx", value.asInstanceOf[js.Any])
      
      inline def setSheetIdxUndefined: Self = StObject.set(x, "sheetIdx", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait EditRangeCompleteEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the range option value.
      */
    var range: js.UndefOr[Any] = js.undefined
    
    /** Returns the sheet index.
      */
    var sheetIdx: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object EditRangeCompleteEventArgs {
    
    inline def apply(): EditRangeCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditRangeCompleteEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EditRangeCompleteEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setRange(value: Any): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setSheetIdx(value: Double): Self = StObject.set(x, "sheetIdx", value.asInstanceOf[js.Any])
      
      inline def setSheetIdxUndefined: Self = StObject.set(x, "sheetIdx", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ExportSettings extends StObject {
    
    /** Gets or sets a value that indicates whether to enable or disable save feature in Spreadsheet. By enabling this feature, you can save existing Spreadsheet.
      * @default {true}
      */
    var allowExporting: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates to define csvUrl for export to CSV format.
      * @default {null}
      */
    var csvUrl: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable formula calculation in Spreadsheet. By enabling this feature, formula calculated while export the Spreadsheet in
      * protected mode.
      * @default {false}
      */
    var enableFormulaCalculation: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates to define excelUrl for export to excel format.
      * @default {null}
      */
    var excelUrl: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates to define password while export to excel format.
      * @default {null}
      */
    var password: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates to define pdfUrl for export to PDF format.
      * @default {null}
      */
    var pdfUrl: js.UndefOr[String] = js.undefined
  }
  object ExportSettings {
    
    inline def apply(): ExportSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExportSettings] (val x: Self) extends AnyVal {
      
      inline def setAllowExporting(value: Boolean): Self = StObject.set(x, "allowExporting", value.asInstanceOf[js.Any])
      
      inline def setAllowExportingUndefined: Self = StObject.set(x, "allowExporting", js.undefined)
      
      inline def setCsvUrl(value: String): Self = StObject.set(x, "csvUrl", value.asInstanceOf[js.Any])
      
      inline def setCsvUrlUndefined: Self = StObject.set(x, "csvUrl", js.undefined)
      
      inline def setEnableFormulaCalculation(value: Boolean): Self = StObject.set(x, "enableFormulaCalculation", value.asInstanceOf[js.Any])
      
      inline def setEnableFormulaCalculationUndefined: Self = StObject.set(x, "enableFormulaCalculation", js.undefined)
      
      inline def setExcelUrl(value: String): Self = StObject.set(x, "excelUrl", value.asInstanceOf[js.Any])
      
      inline def setExcelUrlUndefined: Self = StObject.set(x, "excelUrl", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setPdfUrl(value: String): Self = StObject.set(x, "pdfUrl", value.asInstanceOf[js.Any])
      
      inline def setPdfUrlUndefined: Self = StObject.set(x, "pdfUrl", js.undefined)
    }
  }
  
  trait FontOptions extends StObject {
    
    /** Pass the color
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Pass the font family
      */
    var fontFamily: js.UndefOr[Any] = js.undefined
    
    /** Pass the font size
      */
    var fontSize: js.UndefOr[String] = js.undefined
    
    /** Pass the font style
      */
    var fontStyle: js.UndefOr[String] = js.undefined
    
    /** Pass the font weight
      */
    var fontWeight: js.UndefOr[String] = js.undefined
    
    /** Pass the text decoration
      */
    var textDecoration: js.UndefOr[String] = js.undefined
  }
  object FontOptions {
    
    inline def apply(): FontOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FontOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FontOptions] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontFamily(value: Any): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      inline def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      inline def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      inline def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      inline def setFontStyle(value: String): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      inline def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      inline def setTextDecoration(value: String): Self = StObject.set(x, "textDecoration", value.asInstanceOf[js.Any])
      
      inline def setTextDecorationUndefined: Self = StObject.set(x, "textDecoration", js.undefined)
    }
  }
  
  trait FormatObjectOptions extends StObject {
    
    /** Pass the decimal places in cell
      */
    var decimalPlaces: js.UndefOr[String] = js.undefined
    
    /** Pass the format str in cell
      */
    var formatStr: js.UndefOr[String] = js.undefined
    
    /** Pass the style object in a cell
      */
    var style: js.UndefOr[Any] = js.undefined
    
    /** Pass the thousand separator in cell
      */
    var thousandSeparator: js.UndefOr[String] = js.undefined
    
    /** Pass the type of cell
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object FormatObjectOptions {
    
    inline def apply(): FormatObjectOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatObjectOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatObjectOptions] (val x: Self) extends AnyVal {
      
      inline def setDecimalPlaces(value: String): Self = StObject.set(x, "decimalPlaces", value.asInstanceOf[js.Any])
      
      inline def setDecimalPlacesUndefined: Self = StObject.set(x, "decimalPlaces", js.undefined)
      
      inline def setFormatStr(value: String): Self = StObject.set(x, "formatStr", value.asInstanceOf[js.Any])
      
      inline def setFormatStrUndefined: Self = StObject.set(x, "formatStr", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setThousandSeparator(value: String): Self = StObject.set(x, "thousandSeparator", value.asInstanceOf[js.Any])
      
      inline def setThousandSeparatorUndefined: Self = StObject.set(x, "thousandSeparator", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait FormatOptions extends StObject {
    
    /** Pass the border condition
      */
    var border: js.UndefOr[Boolean] = js.undefined
    
    /** Pass the cell style to be removed
      */
    var cellStyle: js.UndefOr[Boolean] = js.undefined
    
    /** Pass the format
      */
    var format: js.UndefOr[Boolean] = js.undefined
    
    /** Pass the table style to be removed
      */
    var tableStyle: js.UndefOr[Boolean] = js.undefined
  }
  object FormatOptions {
    
    inline def apply(): FormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatOptions] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: Boolean): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setCellStyle(value: Boolean): Self = StObject.set(x, "cellStyle", value.asInstanceOf[js.Any])
      
      inline def setCellStyleUndefined: Self = StObject.set(x, "cellStyle", js.undefined)
      
      inline def setFormat(value: Boolean): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setTableStyle(value: Boolean): Self = StObject.set(x, "tableStyle", value.asInstanceOf[js.Any])
      
      inline def setTableStyleUndefined: Self = StObject.set(x, "tableStyle", js.undefined)
    }
  }
  
  trait FormatSettings extends StObject {
    
    /** Gets or sets a value that indicates whether to enable or disable cell border feature in the Spreadsheet.
      * @default {true}
      */
    var allowCellBorder: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable decimal places in the Spreadsheet.
      * @default {true}
      */
    var allowDecimalPlaces: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable font family feature in Spreadsheet.
      * @default {true}
      */
    var allowFontFamily: js.UndefOr[Boolean] = js.undefined
  }
  object FormatSettings {
    
    inline def apply(): FormatSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormatSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FormatSettings] (val x: Self) extends AnyVal {
      
      inline def setAllowCellBorder(value: Boolean): Self = StObject.set(x, "allowCellBorder", value.asInstanceOf[js.Any])
      
      inline def setAllowCellBorderUndefined: Self = StObject.set(x, "allowCellBorder", js.undefined)
      
      inline def setAllowDecimalPlaces(value: Boolean): Self = StObject.set(x, "allowDecimalPlaces", value.asInstanceOf[js.Any])
      
      inline def setAllowDecimalPlacesUndefined: Self = StObject.set(x, "allowDecimalPlaces", js.undefined)
      
      inline def setAllowFontFamily(value: Boolean): Self = StObject.set(x, "allowFontFamily", value.asInstanceOf[js.Any])
      
      inline def setAllowFontFamilyUndefined: Self = StObject.set(x, "allowFontFamily", js.undefined)
    }
  }
  
  trait ImportSettings extends StObject {
    
    /** Sets import mapper to perform import feature in Spreadsheet.
      */
    var importMapper: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable import while initial loading.
      * @default {false}
      */
    var importOnLoad: js.UndefOr[Boolean] = js.undefined
    
    /** Sets import URL to access the online files in the Spreadsheet.
      */
    var importUrl: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates to define password while importing in the Spreadsheet.
      */
    var password: js.UndefOr[String] = js.undefined
  }
  object ImportSettings {
    
    inline def apply(): ImportSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportSettings] (val x: Self) extends AnyVal {
      
      inline def setImportMapper(value: String): Self = StObject.set(x, "importMapper", value.asInstanceOf[js.Any])
      
      inline def setImportMapperUndefined: Self = StObject.set(x, "importMapper", js.undefined)
      
      inline def setImportOnLoad(value: Boolean): Self = StObject.set(x, "importOnLoad", value.asInstanceOf[js.Any])
      
      inline def setImportOnLoadUndefined: Self = StObject.set(x, "importOnLoad", js.undefined)
      
      inline def setImportUrl(value: String): Self = StObject.set(x, "importUrl", value.asInstanceOf[js.Any])
      
      inline def setImportUrlUndefined: Self = StObject.set(x, "importUrl", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    }
  }
  
  trait ImportingOptions extends StObject {
    
    /** Pass the url to import manually
      */
    var Url: js.UndefOr[String] = js.undefined
    
    /** Pass the file to import manually
      */
    var file: js.UndefOr[String] = js.undefined
    
    /** Pass the file stream to import manually
      */
    var fileStream: js.UndefOr[String] = js.undefined
    
    /** Pass the filetype to import manually
      */
    var fileType: js.UndefOr[String] = js.undefined
    
    /** Pass the password to import manually
      */
    var password: js.UndefOr[String] = js.undefined
  }
  object ImportingOptions {
    
    inline def apply(): ImportingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportingOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportingOptions] (val x: Self) extends AnyVal {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setFileStream(value: String): Self = StObject.set(x, "fileStream", value.asInstanceOf[js.Any])
      
      inline def setFileStreamUndefined: Self = StObject.set(x, "fileStream", js.undefined)
      
      inline def setFileType(value: String): Self = StObject.set(x, "fileType", value.asInstanceOf[js.Any])
      
      inline def setFileTypeUndefined: Self = StObject.set(x, "fileType", js.undefined)
      
      inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
    }
  }
  
  trait KeyDownEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the boolean value.
      */
    var isCommentEdit: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the boolean value.
      */
    var isEdit: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the boolean value.
      */
    var isSheetRename: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the sheet index.
      */
    var sheetIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the target element.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object KeyDownEventArgs {
    
    inline def apply(): KeyDownEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyDownEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyDownEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIsCommentEdit(value: Boolean): Self = StObject.set(x, "isCommentEdit", value.asInstanceOf[js.Any])
      
      inline def setIsCommentEditUndefined: Self = StObject.set(x, "isCommentEdit", js.undefined)
      
      inline def setIsEdit(value: Boolean): Self = StObject.set(x, "isEdit", value.asInstanceOf[js.Any])
      
      inline def setIsEditUndefined: Self = StObject.set(x, "isEdit", js.undefined)
      
      inline def setIsSheetRename(value: Boolean): Self = StObject.set(x, "isSheetRename", value.asInstanceOf[js.Any])
      
      inline def setIsSheetRenameUndefined: Self = StObject.set(x, "isSheetRename", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSheetIndex(value: Double): Self = StObject.set(x, "sheetIndex", value.asInstanceOf[js.Any])
      
      inline def setSheetIndexUndefined: Self = StObject.set(x, "sheetIndex", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait KeyUpEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the boolean value.
      */
    var isCommentEdit: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the boolean value.
      */
    var isEdit: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the boolean value.
      */
    var isSheetRename: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the sheet index.
      */
    var sheetIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the target element.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object KeyUpEventArgs {
    
    inline def apply(): KeyUpEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[KeyUpEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: KeyUpEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIsCommentEdit(value: Boolean): Self = StObject.set(x, "isCommentEdit", value.asInstanceOf[js.Any])
      
      inline def setIsCommentEditUndefined: Self = StObject.set(x, "isCommentEdit", js.undefined)
      
      inline def setIsEdit(value: Boolean): Self = StObject.set(x, "isEdit", value.asInstanceOf[js.Any])
      
      inline def setIsEditUndefined: Self = StObject.set(x, "isEdit", js.undefined)
      
      inline def setIsSheetRename(value: Boolean): Self = StObject.set(x, "isSheetRename", value.asInstanceOf[js.Any])
      
      inline def setIsSheetRenameUndefined: Self = StObject.set(x, "isSheetRename", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSheetIndex(value: Double): Self = StObject.set(x, "sheetIndex", value.asInstanceOf[js.Any])
      
      inline def setSheetIndexUndefined: Self = StObject.set(x, "sheetIndex", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait LinkOptions extends StObject {
    
    /** Pass the cell address in the cell
      */
    var cellAddress: js.UndefOr[String] = js.undefined
    
    /** Pass the text address in the cell
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Pass the web address in the cell
      */
    var webAddress: js.UndefOr[String] = js.undefined
  }
  object LinkOptions {
    
    inline def apply(): LinkOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinkOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LinkOptions] (val x: Self) extends AnyVal {
      
      inline def setCellAddress(value: String): Self = StObject.set(x, "cellAddress", value.asInstanceOf[js.Any])
      
      inline def setCellAddressUndefined: Self = StObject.set(x, "cellAddress", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setWebAddress(value: String): Self = StObject.set(x, "webAddress", value.asInstanceOf[js.Any])
      
      inline def setWebAddressUndefined: Self = StObject.set(x, "webAddress", js.undefined)
    }
  }
  
  trait LoadCompleteEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LoadCompleteEventArgs {
    
    inline def apply(): LoadCompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadCompleteEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadCompleteEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait LoadEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the active sheet index.
      */
    var sheetIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object LoadEventArgs {
    
    inline def apply(): LoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LoadEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LoadEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setSheetIndex(value: Double): Self = StObject.set(x, "sheetIndex", value.asInstanceOf[js.Any])
      
      inline def setSheetIndexUndefined: Self = StObject.set(x, "sheetIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MenuClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns menu click element.
      */
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the event information.
      */
    var event: js.UndefOr[Any] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns target element parent Id.
      */
    var parentId: js.UndefOr[String] = js.undefined
    
    /** Returns target element parent text.
      */
    var parentText: js.UndefOr[String] = js.undefined
    
    /** Returns target element text.
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object MenuClickEventArgs {
    
    inline def apply(): MenuClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setEvent(value: Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setParentText(value: String): Self = StObject.set(x, "parentText", value.asInstanceOf[js.Any])
      
      inline def setParentTextUndefined: Self = StObject.set(x, "parentText", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait MenuItemOptions extends StObject {
    
    /** Pass the id to update the menu item
      */
    var id: js.UndefOr[String] = js.undefined
    
    /** Pass the parent id to update the menu item
      */
    var parentId: js.UndefOr[String] = js.undefined
    
    /** Pass the sprite css class to update the menu item
      */
    var spriteCssClass: js.UndefOr[String] = js.undefined
    
    /** Pass the text to update the menu item
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object MenuItemOptions {
    
    inline def apply(): MenuItemOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuItemOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuItemOptions] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setParentId(value: String): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setSpriteCssClass(value: String): Self = StObject.set(x, "spriteCssClass", value.asInstanceOf[js.Any])
      
      inline def setSpriteCssClassUndefined: Self = StObject.set(x, "spriteCssClass", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Triggered for every action before its starts.
      */
    var actionBegin: js.UndefOr[js.Function1[/* e */ ActionBeginEventArgs, Unit]] = js.undefined
    
    /** Triggered for every action complete.
      */
    var actionComplete: js.UndefOr[js.Function1[/* e */ ActionCompleteEventArgs, Unit]] = js.undefined
    
    /** Gets or sets an active sheet index in the Spreadsheet. By defining this value, you can specify which sheet should be active in workbook.
      * @default {1}
      */
    var activeSheetIndex: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable auto rendering of cell type in the Spreadsheet.
      * @default {false}
      */
    var allowAutoCellType: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable auto fill feature in the Spreadsheet.
      * @default {true}
      */
    var allowAutoFill: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable auto sum feature in the Spreadsheet.
      * @default {true}
      */
    var allowAutoSum: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable cell format feature in the Spreadsheet. By enabling this, you can customize styles and number formats.
      * @default {true}
      */
    var allowCellFormatting: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable cell type feature in the Spreadsheet.
      * @default {false}
      */
    var allowCellType: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable chart feature in the Spreadsheet. By enabling this feature, you can create and customize charts in Spreadsheet.
      * @default {true}
      */
    var allowCharts: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable clear feature in the Spreadsheet.
      * @default {true}
      */
    var allowClear: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable clipboard feature in the Spreadsheet. By enabling this feature, you can perform cut/copy and paste operations in
      * Spreadsheet.
      * @default {true}
      */
    var allowClipboard: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable comment feature in the Spreadsheet. By enabling this, you can add/delete/modify comments in Spreadsheet.
      * @default {true}
      */
    var allowComments: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable Conditional Format feature in the Spreadsheet. By enabling this, you can apply formatting to the selected range of
      * cells based on the provided conditions (Greater than, Less than, Equal, Between, Contains, etc.).
      * @default {true}
      */
    var allowConditionalFormats: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable data validation feature in the Spreadsheet.
      * @default {true}
      */
    var allowDataValidation: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable the delete action in the Spreadsheet. By enabling this feature, you can delete existing rows, columns, cells and
      * sheet.
      * @default {true}
      */
    var allowDelete: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable drag and drop feature in the Spreadsheet.
      * @default {true}
      */
    var allowDragAndDrop: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable the edit action in the Spreadsheet.
      * @default {true}
      */
    var allowEditing: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable filtering feature in the Spreadsheet. Filtering can be used to limit the data displayed using required criteria.
      * @default {true}
      */
    var allowFiltering: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable table feature in the Spreadsheet. By enabling this, you can render table in selected range.
      * @default {true}
      */
    var allowFormatAsTable: js.UndefOr[Boolean] = js.undefined
    
    /** Get or sets a value that indicates whether to enable or disable format painter feature in the Spreadsheet. By enabling this feature, you can copy the format from the selected
      * range and apply it to another range.
      * @default {true}
      */
    var allowFormatPainter: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable formula bar in the Spreadsheet.
      * @default {true}
      */
    var allowFormulaBar: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable freeze pane support in Spreadsheet. By enabling this feature, you can use freeze top row, freeze first column and
      * freeze panes options.
      * @default {true}
      */
    var allowFreezing: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable hyperlink feature in the Spreadsheet. By enabling this feature, you can add hyperlink which is used to easily
      * navigate to the cell reference from one sheet to another or a web page.
      * @default {true}
      */
    var allowHyperlink: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable import feature in the Spreadsheet. By enabling this feature, you can open existing Spreadsheet documents.
      * @default {true}
      */
    var allowImport: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable the insert action in the Spreadsheet. By enabling this feature, you can insert new rows, columns, cells and sheet.
      * @default {true}
      */
    var allowInsert: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable keyboard navigation feature in the Spreadsheet.
      * @default {true}
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable lock cell feature in the Spreadsheet.
      * @default {true}
      */
    var allowLockCell: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable merge feature in the Spreadsheet.
      * @default {true}
      */
    var allowMerging: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable overflow feature in the Spreadsheet.
      * @default {true}
      */
    var allowOverflow: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable resizing feature in the Spreadsheet. By enabling this feature, you can change the column width and row height by
      * dragging its header boundaries.
      * @default {true}
      */
    var allowResizing: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable find and replace feature in the Spreadsheet. By enabling this, you can easily find and replace a specific value in
      * the sheet or workbook. By using goto behavior, you can select and highlight all cells that contains specific data or data types.
      * @default {true}
      */
    var allowSearching: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable selection in the Spreadsheet. By enabling this feature, selected items will be highlighted.
      * @default {true}
      */
    var allowSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the sorting feature in the Spreadsheet.
      * @default {true}
      */
    var allowSorting: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable the sparkline feature in the Spreadsheet.
      * @default {false}
      */
    var allowSparkline: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable undo and redo feature in the Spreadsheet.
      * @default {true}
      */
    var allowUndoRedo: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable wrap text feature in the Spreadsheet. By enabling this, cell content can wrap to the next line, if the cell
      * content exceeds the boundary of the cell.
      * @default {true}
      */
    var allowWrap: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates to define the width of the activation panel in Spreadsheet.
      * @default {300}
      */
    var apWidth: js.UndefOr[Double] = js.undefined
    
    /** Triggered when the auto fill operation begins.
      */
    var autoFillBegin: js.UndefOr[js.Function1[/* e */ AutoFillBeginEventArgs, Unit]] = js.undefined
    
    /** Triggered when the auto fill operation completes.
      */
    var autoFillComplete: js.UndefOr[js.Function1[/* e */ AutoFillCompleteEventArgs, Unit]] = js.undefined
    
    /** Gets or sets an object that indicates to customize the auto fill behavior in the Spreadsheet.
      */
    var autoFillSettings: js.UndefOr[AutoFillSettings] = js.undefined
    
    /** Triggered before the batch save.
      */
    var beforeBatchSave: js.UndefOr[js.Function1[/* e */ BeforeBatchSaveEventArgs, Unit]] = js.undefined
    
    /** Triggered before the cells to be formatted.
      */
    var beforeCellFormat: js.UndefOr[js.Function1[/* e */ BeforeCellFormatEventArgs, Unit]] = js.undefined
    
    /** Triggered before the cell selection.
      */
    var beforeCellSelect: js.UndefOr[js.Function1[/* e */ BeforeCellSelectEventArgs, Unit]] = js.undefined
    
    /** Triggered before the selected cells are dropped.
      */
    var beforeDrop: js.UndefOr[js.Function1[/* e */ BeforeDropEventArgs, Unit]] = js.undefined
    
    /** Triggered while start to edit the comment.
      */
    var beforeEditComment: js.UndefOr[js.Function1[/* e */ BeforeEditCommentEventArgs, Unit]] = js.undefined
    
    /** Triggered before the contextmenu is open.
      */
    var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.undefined
    
    /** Triggered before the activation panel is open.
      */
    var beforePanelOpen: js.UndefOr[js.Function1[/* e */ BeforePanelOpenEventArgs, Unit]] = js.undefined
    
    /** Triggered when click on sheet cell.
      */
    var cellClick: js.UndefOr[js.Function1[/* e */ CellClickEventArgs, Unit]] = js.undefined
    
    /** Triggered when the cell is edited.
      */
    var cellEdit: js.UndefOr[js.Function1[/* e */ CellEditEventArgs, Unit]] = js.undefined
    
    /** Triggered while cell is formatting.
      */
    var cellFormatting: js.UndefOr[js.Function1[/* e */ CellFormattingEventArgs, Unit]] = js.undefined
    
    /** Triggered when mouse hover on cell in sheets.
      */
    var cellHover: js.UndefOr[js.Function1[/* e */ CellHoverEventArgs, Unit]] = js.undefined
    
    /** Triggered when save the edited cell.
      */
    var cellSave: js.UndefOr[js.Function1[/* e */ CellSaveEventArgs, Unit]] = js.undefined
    
    /** Triggered when the cell is selected.
      */
    var cellSelected: js.UndefOr[js.Function1[/* e */ CellSelectedEventArgs, Unit]] = js.undefined
    
    /** Gets or sets an object that indicates to customize the chart behavior in the Spreadsheet.
      */
    var chartSettings: js.UndefOr[ChartSettings] = js.undefined
    
    /** Gets or sets a value that defines the number of columns displayed in the sheet.
      * @default {21}
      */
    var columnCount: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets a value that indicates to define the common width for each column in the Spreadsheet.
      * @default {64}
      */
    var columnWidth: js.UndefOr[Double] = js.undefined
    
    /** Triggered when click the contextmenu items.
      */
    var contextMenuClick: js.UndefOr[js.Function1[/* e */ ContextMenuClickEventArgs, Unit]] = js.undefined
    
    /** Gets or sets a value to add root CSS class for customizing Spreadsheet skins.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates custom formulas in Spreadsheet.
      * @default {[]}
      */
    var customFormulas: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Triggered when the selected cells are being dragged.
      */
    var drag: js.UndefOr[js.Function1[/* e */ DragEventArgs, Unit]] = js.undefined
    
    /** Triggered when you start to drag the picture or chart.
      */
    var dragShape: js.UndefOr[js.Function1[/* e */ DragShapeEventArgs, Unit]] = js.undefined
    
    /** Triggered when the selected cells are initiated to drag.
      */
    var dragStart: js.UndefOr[js.Function1[/* e */ DragStartEventArgs, Unit]] = js.undefined
    
    /** Triggered when the selected cells are dropped.
      */
    var drop: js.UndefOr[js.Function1[/* e */ DropEventArgs, Unit]] = js.undefined
    
    /** Triggered before the range editing starts.
      */
    var editRangeBegin: js.UndefOr[js.Function1[/* e */ EditRangeBeginEventArgs, Unit]] = js.undefined
    
    /** Triggered after range editing completes.
      */
    var editRangeComplete: js.UndefOr[js.Function1[/* e */ EditRangeCompleteEventArgs, Unit]] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable context menu in the Spreadsheet.
      * @default {true}
      */
    var enableContextMenu: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable pivot table in the Spreadsheet.
      * @default {false}
      */
    var enablePivotTable: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable touch support in the Spreadsheet.
      * @default {true}
      */
    var enableTouch: js.UndefOr[Boolean] = js.undefined
    
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
      * @default {false}
      */
    var isImport: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable readonly support in the Spreadsheet.
      * @default {false}
      */
    var isReadOnly: js.UndefOr[Boolean] = js.undefined
    
    /** Triggered when the key is pressed down.
      */
    var keyDown: js.UndefOr[js.Function1[/* e */ KeyDownEventArgs, Unit]] = js.undefined
    
    /** Triggered when the key is released.
      */
    var keyUp: js.UndefOr[js.Function1[/* e */ KeyUpEventArgs, Unit]] = js.undefined
    
    /** Triggered before the sheet is loaded.
      */
    var load: js.UndefOr[js.Function1[/* e */ LoadEventArgs, Unit]] = js.undefined
    
    /** Triggered after the sheet is loaded.
      */
    var loadComplete: js.UndefOr[js.Function1[/* e */ LoadCompleteEventArgs, Unit]] = js.undefined
    
    /** Gets or sets a value that indicates whether to customizing the user interface (UI) as locale-specific in order to display regional data (i.e.) in a language and culture specific
      * to a particular country or region.
      * @default {en-US}
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Triggered every click of the menu item.
      */
    var menuClick: js.UndefOr[js.Function1[/* e */ MenuClickEventArgs, Unit]] = js.undefined
    
    /** Gets or sets a value that indicates name manager in Spreadsheet.
      */
    var nameManager: js.UndefOr[js.Array[NameManager]] = js.undefined
    
    /** Triggered when a file is imported.
      */
    var onImport: js.UndefOr[js.Function1[/* e */ OnImportEventArgs, Unit]] = js.undefined
    
    /** Triggered when import sheet is failed to open.
      */
    var openFailure: js.UndefOr[js.Function1[/* e */ OpenFailureEventArgs, Unit]] = js.undefined
    
    /** Triggered when pager item is clicked in the Spreadsheet.
      */
    var pagerClick: js.UndefOr[js.Function1[/* e */ PagerClickEventArgs, Unit]] = js.undefined
    
    /** Gets or sets an object that indicates to customize the picture behavior in the Spreadsheet.
      */
    var pictureSettings: js.UndefOr[PictureSettings] = js.undefined
    
    /** Gets or sets an object that indicates to customize the print option in Spreadsheet.
      */
    var printSettings: js.UndefOr[PrintSettings] = js.undefined
    
    /** Triggered after end of resizing the chart, picture, row and column.
      */
    var resizeEnd: js.UndefOr[js.Function1[/* e */ ResizeEndEventArgs, Unit]] = js.undefined
    
    /** Triggered when you start resizing the chart, picture, row and column.
      */
    var resizeStart: js.UndefOr[js.Function1[/* e */ ResizeStartEventArgs, Unit]] = js.undefined
    
    /** Triggered when click on the ribbon.
      */
    var ribbonClick: js.UndefOr[js.Function1[/* e */ RibbonClickEventArgs, Unit]] = js.undefined
    
    /** Gets or sets an object that indicates to customize the ribbon settings in Spreadsheet.
      */
    var ribbonSettings: js.UndefOr[RibbonSettings] = js.undefined
    
    /** Gets or sets a value that indicates whether to define the number of rows to be displayed in the sheet.
      * @default {20}
      */
    var rowCount: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets a value that indicates to define the common height for each row in the sheet.
      * @default {20}
      */
    var rowHeight: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets an object that indicates to customize the scroll options in the Spreadsheet.
      */
    var scrollSettings: js.UndefOr[ScrollSettings] = js.undefined
    
    /** Triggered after end of vertical and horizontal scrolling.
      */
    var scrollStop: js.UndefOr[js.Function1[/* e */ ScrollStopEventArgs, Unit]] = js.undefined
    
    /** Gets or sets an object that indicates to customize the selection options in the Spreadsheet.
      */
    var selectionSettings: js.UndefOr[SelectionSettings] = js.undefined
    
    /** Gets or sets a value that indicates to define the number of sheets to be created at the initial load.
      * @default {1}
      */
    var sheetCount: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets an object that indicates to customize the sheet behavior in Spreadsheet.
      */
    var sheets: js.UndefOr[js.Array[Sheet]] = js.undefined
    
    /** Gets or sets a value that indicates whether to show or hide pager in the Spreadsheet.
      * @default {true}
      */
    var showPager: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to show or hide ribbon in the Spreadsheet.
      * @default {true}
      */
    var showRibbon: js.UndefOr[Boolean] = js.undefined
    
    /** Triggered when click the ribbon tab.
      */
    var tabClick: js.UndefOr[js.Function1[/* e */ TabClickEventArgs, Unit]] = js.undefined
    
    /** Triggered when select the ribbon tab.
      */
    var tabSelect: js.UndefOr[js.Function1[/* e */ TabSelectEventArgs, Unit]] = js.undefined
    
    /** This is used to set the number of undo-redo steps in the Spreadsheet.
      * @default {20}
      */
    var undoRedoStep: js.UndefOr[Double] = js.undefined
    
    /** Define the username for the Spreadsheet which is displayed in comment.
      * @default {User Name}
      */
    var userName: js.UndefOr[String] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.Spreadsheet.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Spreadsheet.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.Spreadsheet.Model] (val x: Self) extends AnyVal {
      
      inline def setActionBegin(value: /* e */ ActionBeginEventArgs => Unit): Self = StObject.set(x, "actionBegin", js.Any.fromFunction1(value))
      
      inline def setActionBeginUndefined: Self = StObject.set(x, "actionBegin", js.undefined)
      
      inline def setActionComplete(value: /* e */ ActionCompleteEventArgs => Unit): Self = StObject.set(x, "actionComplete", js.Any.fromFunction1(value))
      
      inline def setActionCompleteUndefined: Self = StObject.set(x, "actionComplete", js.undefined)
      
      inline def setActiveSheetIndex(value: Double): Self = StObject.set(x, "activeSheetIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveSheetIndexUndefined: Self = StObject.set(x, "activeSheetIndex", js.undefined)
      
      inline def setAllowAutoCellType(value: Boolean): Self = StObject.set(x, "allowAutoCellType", value.asInstanceOf[js.Any])
      
      inline def setAllowAutoCellTypeUndefined: Self = StObject.set(x, "allowAutoCellType", js.undefined)
      
      inline def setAllowAutoFill(value: Boolean): Self = StObject.set(x, "allowAutoFill", value.asInstanceOf[js.Any])
      
      inline def setAllowAutoFillUndefined: Self = StObject.set(x, "allowAutoFill", js.undefined)
      
      inline def setAllowAutoSum(value: Boolean): Self = StObject.set(x, "allowAutoSum", value.asInstanceOf[js.Any])
      
      inline def setAllowAutoSumUndefined: Self = StObject.set(x, "allowAutoSum", js.undefined)
      
      inline def setAllowCellFormatting(value: Boolean): Self = StObject.set(x, "allowCellFormatting", value.asInstanceOf[js.Any])
      
      inline def setAllowCellFormattingUndefined: Self = StObject.set(x, "allowCellFormatting", js.undefined)
      
      inline def setAllowCellType(value: Boolean): Self = StObject.set(x, "allowCellType", value.asInstanceOf[js.Any])
      
      inline def setAllowCellTypeUndefined: Self = StObject.set(x, "allowCellType", js.undefined)
      
      inline def setAllowCharts(value: Boolean): Self = StObject.set(x, "allowCharts", value.asInstanceOf[js.Any])
      
      inline def setAllowChartsUndefined: Self = StObject.set(x, "allowCharts", js.undefined)
      
      inline def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      inline def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      inline def setAllowClipboard(value: Boolean): Self = StObject.set(x, "allowClipboard", value.asInstanceOf[js.Any])
      
      inline def setAllowClipboardUndefined: Self = StObject.set(x, "allowClipboard", js.undefined)
      
      inline def setAllowComments(value: Boolean): Self = StObject.set(x, "allowComments", value.asInstanceOf[js.Any])
      
      inline def setAllowCommentsUndefined: Self = StObject.set(x, "allowComments", js.undefined)
      
      inline def setAllowConditionalFormats(value: Boolean): Self = StObject.set(x, "allowConditionalFormats", value.asInstanceOf[js.Any])
      
      inline def setAllowConditionalFormatsUndefined: Self = StObject.set(x, "allowConditionalFormats", js.undefined)
      
      inline def setAllowDataValidation(value: Boolean): Self = StObject.set(x, "allowDataValidation", value.asInstanceOf[js.Any])
      
      inline def setAllowDataValidationUndefined: Self = StObject.set(x, "allowDataValidation", js.undefined)
      
      inline def setAllowDelete(value: Boolean): Self = StObject.set(x, "allowDelete", value.asInstanceOf[js.Any])
      
      inline def setAllowDeleteUndefined: Self = StObject.set(x, "allowDelete", js.undefined)
      
      inline def setAllowDragAndDrop(value: Boolean): Self = StObject.set(x, "allowDragAndDrop", value.asInstanceOf[js.Any])
      
      inline def setAllowDragAndDropUndefined: Self = StObject.set(x, "allowDragAndDrop", js.undefined)
      
      inline def setAllowEditing(value: Boolean): Self = StObject.set(x, "allowEditing", value.asInstanceOf[js.Any])
      
      inline def setAllowEditingUndefined: Self = StObject.set(x, "allowEditing", js.undefined)
      
      inline def setAllowFiltering(value: Boolean): Self = StObject.set(x, "allowFiltering", value.asInstanceOf[js.Any])
      
      inline def setAllowFilteringUndefined: Self = StObject.set(x, "allowFiltering", js.undefined)
      
      inline def setAllowFormatAsTable(value: Boolean): Self = StObject.set(x, "allowFormatAsTable", value.asInstanceOf[js.Any])
      
      inline def setAllowFormatAsTableUndefined: Self = StObject.set(x, "allowFormatAsTable", js.undefined)
      
      inline def setAllowFormatPainter(value: Boolean): Self = StObject.set(x, "allowFormatPainter", value.asInstanceOf[js.Any])
      
      inline def setAllowFormatPainterUndefined: Self = StObject.set(x, "allowFormatPainter", js.undefined)
      
      inline def setAllowFormulaBar(value: Boolean): Self = StObject.set(x, "allowFormulaBar", value.asInstanceOf[js.Any])
      
      inline def setAllowFormulaBarUndefined: Self = StObject.set(x, "allowFormulaBar", js.undefined)
      
      inline def setAllowFreezing(value: Boolean): Self = StObject.set(x, "allowFreezing", value.asInstanceOf[js.Any])
      
      inline def setAllowFreezingUndefined: Self = StObject.set(x, "allowFreezing", js.undefined)
      
      inline def setAllowHyperlink(value: Boolean): Self = StObject.set(x, "allowHyperlink", value.asInstanceOf[js.Any])
      
      inline def setAllowHyperlinkUndefined: Self = StObject.set(x, "allowHyperlink", js.undefined)
      
      inline def setAllowImport(value: Boolean): Self = StObject.set(x, "allowImport", value.asInstanceOf[js.Any])
      
      inline def setAllowImportUndefined: Self = StObject.set(x, "allowImport", js.undefined)
      
      inline def setAllowInsert(value: Boolean): Self = StObject.set(x, "allowInsert", value.asInstanceOf[js.Any])
      
      inline def setAllowInsertUndefined: Self = StObject.set(x, "allowInsert", js.undefined)
      
      inline def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      inline def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      inline def setAllowLockCell(value: Boolean): Self = StObject.set(x, "allowLockCell", value.asInstanceOf[js.Any])
      
      inline def setAllowLockCellUndefined: Self = StObject.set(x, "allowLockCell", js.undefined)
      
      inline def setAllowMerging(value: Boolean): Self = StObject.set(x, "allowMerging", value.asInstanceOf[js.Any])
      
      inline def setAllowMergingUndefined: Self = StObject.set(x, "allowMerging", js.undefined)
      
      inline def setAllowOverflow(value: Boolean): Self = StObject.set(x, "allowOverflow", value.asInstanceOf[js.Any])
      
      inline def setAllowOverflowUndefined: Self = StObject.set(x, "allowOverflow", js.undefined)
      
      inline def setAllowResizing(value: Boolean): Self = StObject.set(x, "allowResizing", value.asInstanceOf[js.Any])
      
      inline def setAllowResizingUndefined: Self = StObject.set(x, "allowResizing", js.undefined)
      
      inline def setAllowSearching(value: Boolean): Self = StObject.set(x, "allowSearching", value.asInstanceOf[js.Any])
      
      inline def setAllowSearchingUndefined: Self = StObject.set(x, "allowSearching", js.undefined)
      
      inline def setAllowSelection(value: Boolean): Self = StObject.set(x, "allowSelection", value.asInstanceOf[js.Any])
      
      inline def setAllowSelectionUndefined: Self = StObject.set(x, "allowSelection", js.undefined)
      
      inline def setAllowSorting(value: Boolean): Self = StObject.set(x, "allowSorting", value.asInstanceOf[js.Any])
      
      inline def setAllowSortingUndefined: Self = StObject.set(x, "allowSorting", js.undefined)
      
      inline def setAllowSparkline(value: Boolean): Self = StObject.set(x, "allowSparkline", value.asInstanceOf[js.Any])
      
      inline def setAllowSparklineUndefined: Self = StObject.set(x, "allowSparkline", js.undefined)
      
      inline def setAllowUndoRedo(value: Boolean): Self = StObject.set(x, "allowUndoRedo", value.asInstanceOf[js.Any])
      
      inline def setAllowUndoRedoUndefined: Self = StObject.set(x, "allowUndoRedo", js.undefined)
      
      inline def setAllowWrap(value: Boolean): Self = StObject.set(x, "allowWrap", value.asInstanceOf[js.Any])
      
      inline def setAllowWrapUndefined: Self = StObject.set(x, "allowWrap", js.undefined)
      
      inline def setApWidth(value: Double): Self = StObject.set(x, "apWidth", value.asInstanceOf[js.Any])
      
      inline def setApWidthUndefined: Self = StObject.set(x, "apWidth", js.undefined)
      
      inline def setAutoFillBegin(value: /* e */ AutoFillBeginEventArgs => Unit): Self = StObject.set(x, "autoFillBegin", js.Any.fromFunction1(value))
      
      inline def setAutoFillBeginUndefined: Self = StObject.set(x, "autoFillBegin", js.undefined)
      
      inline def setAutoFillComplete(value: /* e */ AutoFillCompleteEventArgs => Unit): Self = StObject.set(x, "autoFillComplete", js.Any.fromFunction1(value))
      
      inline def setAutoFillCompleteUndefined: Self = StObject.set(x, "autoFillComplete", js.undefined)
      
      inline def setAutoFillSettings(value: AutoFillSettings): Self = StObject.set(x, "autoFillSettings", value.asInstanceOf[js.Any])
      
      inline def setAutoFillSettingsUndefined: Self = StObject.set(x, "autoFillSettings", js.undefined)
      
      inline def setBeforeBatchSave(value: /* e */ BeforeBatchSaveEventArgs => Unit): Self = StObject.set(x, "beforeBatchSave", js.Any.fromFunction1(value))
      
      inline def setBeforeBatchSaveUndefined: Self = StObject.set(x, "beforeBatchSave", js.undefined)
      
      inline def setBeforeCellFormat(value: /* e */ BeforeCellFormatEventArgs => Unit): Self = StObject.set(x, "beforeCellFormat", js.Any.fromFunction1(value))
      
      inline def setBeforeCellFormatUndefined: Self = StObject.set(x, "beforeCellFormat", js.undefined)
      
      inline def setBeforeCellSelect(value: /* e */ BeforeCellSelectEventArgs => Unit): Self = StObject.set(x, "beforeCellSelect", js.Any.fromFunction1(value))
      
      inline def setBeforeCellSelectUndefined: Self = StObject.set(x, "beforeCellSelect", js.undefined)
      
      inline def setBeforeDrop(value: /* e */ BeforeDropEventArgs => Unit): Self = StObject.set(x, "beforeDrop", js.Any.fromFunction1(value))
      
      inline def setBeforeDropUndefined: Self = StObject.set(x, "beforeDrop", js.undefined)
      
      inline def setBeforeEditComment(value: /* e */ BeforeEditCommentEventArgs => Unit): Self = StObject.set(x, "beforeEditComment", js.Any.fromFunction1(value))
      
      inline def setBeforeEditCommentUndefined: Self = StObject.set(x, "beforeEditComment", js.undefined)
      
      inline def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      inline def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      inline def setBeforePanelOpen(value: /* e */ BeforePanelOpenEventArgs => Unit): Self = StObject.set(x, "beforePanelOpen", js.Any.fromFunction1(value))
      
      inline def setBeforePanelOpenUndefined: Self = StObject.set(x, "beforePanelOpen", js.undefined)
      
      inline def setCellClick(value: /* e */ CellClickEventArgs => Unit): Self = StObject.set(x, "cellClick", js.Any.fromFunction1(value))
      
      inline def setCellClickUndefined: Self = StObject.set(x, "cellClick", js.undefined)
      
      inline def setCellEdit(value: /* e */ CellEditEventArgs => Unit): Self = StObject.set(x, "cellEdit", js.Any.fromFunction1(value))
      
      inline def setCellEditUndefined: Self = StObject.set(x, "cellEdit", js.undefined)
      
      inline def setCellFormatting(value: /* e */ CellFormattingEventArgs => Unit): Self = StObject.set(x, "cellFormatting", js.Any.fromFunction1(value))
      
      inline def setCellFormattingUndefined: Self = StObject.set(x, "cellFormatting", js.undefined)
      
      inline def setCellHover(value: /* e */ CellHoverEventArgs => Unit): Self = StObject.set(x, "cellHover", js.Any.fromFunction1(value))
      
      inline def setCellHoverUndefined: Self = StObject.set(x, "cellHover", js.undefined)
      
      inline def setCellSave(value: /* e */ CellSaveEventArgs => Unit): Self = StObject.set(x, "cellSave", js.Any.fromFunction1(value))
      
      inline def setCellSaveUndefined: Self = StObject.set(x, "cellSave", js.undefined)
      
      inline def setCellSelected(value: /* e */ CellSelectedEventArgs => Unit): Self = StObject.set(x, "cellSelected", js.Any.fromFunction1(value))
      
      inline def setCellSelectedUndefined: Self = StObject.set(x, "cellSelected", js.undefined)
      
      inline def setChartSettings(value: ChartSettings): Self = StObject.set(x, "chartSettings", value.asInstanceOf[js.Any])
      
      inline def setChartSettingsUndefined: Self = StObject.set(x, "chartSettings", js.undefined)
      
      inline def setColumnCount(value: Double): Self = StObject.set(x, "columnCount", value.asInstanceOf[js.Any])
      
      inline def setColumnCountUndefined: Self = StObject.set(x, "columnCount", js.undefined)
      
      inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setContextMenuClick(value: /* e */ ContextMenuClickEventArgs => Unit): Self = StObject.set(x, "contextMenuClick", js.Any.fromFunction1(value))
      
      inline def setContextMenuClickUndefined: Self = StObject.set(x, "contextMenuClick", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCustomFormulas(value: js.Array[Any]): Self = StObject.set(x, "customFormulas", value.asInstanceOf[js.Any])
      
      inline def setCustomFormulasUndefined: Self = StObject.set(x, "customFormulas", js.undefined)
      
      inline def setCustomFormulasVarargs(value: Any*): Self = StObject.set(x, "customFormulas", js.Array(value*))
      
      inline def setDrag(value: /* e */ DragEventArgs => Unit): Self = StObject.set(x, "drag", js.Any.fromFunction1(value))
      
      inline def setDragShape(value: /* e */ DragShapeEventArgs => Unit): Self = StObject.set(x, "dragShape", js.Any.fromFunction1(value))
      
      inline def setDragShapeUndefined: Self = StObject.set(x, "dragShape", js.undefined)
      
      inline def setDragStart(value: /* e */ DragStartEventArgs => Unit): Self = StObject.set(x, "dragStart", js.Any.fromFunction1(value))
      
      inline def setDragStartUndefined: Self = StObject.set(x, "dragStart", js.undefined)
      
      inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      inline def setDrop(value: /* e */ DropEventArgs => Unit): Self = StObject.set(x, "drop", js.Any.fromFunction1(value))
      
      inline def setDropUndefined: Self = StObject.set(x, "drop", js.undefined)
      
      inline def setEditRangeBegin(value: /* e */ EditRangeBeginEventArgs => Unit): Self = StObject.set(x, "editRangeBegin", js.Any.fromFunction1(value))
      
      inline def setEditRangeBeginUndefined: Self = StObject.set(x, "editRangeBegin", js.undefined)
      
      inline def setEditRangeComplete(value: /* e */ EditRangeCompleteEventArgs => Unit): Self = StObject.set(x, "editRangeComplete", js.Any.fromFunction1(value))
      
      inline def setEditRangeCompleteUndefined: Self = StObject.set(x, "editRangeComplete", js.undefined)
      
      inline def setEnableContextMenu(value: Boolean): Self = StObject.set(x, "enableContextMenu", value.asInstanceOf[js.Any])
      
      inline def setEnableContextMenuUndefined: Self = StObject.set(x, "enableContextMenu", js.undefined)
      
      inline def setEnablePivotTable(value: Boolean): Self = StObject.set(x, "enablePivotTable", value.asInstanceOf[js.Any])
      
      inline def setEnablePivotTableUndefined: Self = StObject.set(x, "enablePivotTable", js.undefined)
      
      inline def setEnableTouch(value: Boolean): Self = StObject.set(x, "enableTouch", value.asInstanceOf[js.Any])
      
      inline def setEnableTouchUndefined: Self = StObject.set(x, "enableTouch", js.undefined)
      
      inline def setExportSettings(value: ExportSettings): Self = StObject.set(x, "exportSettings", value.asInstanceOf[js.Any])
      
      inline def setExportSettingsUndefined: Self = StObject.set(x, "exportSettings", js.undefined)
      
      inline def setFormatSettings(value: FormatSettings): Self = StObject.set(x, "formatSettings", value.asInstanceOf[js.Any])
      
      inline def setFormatSettingsUndefined: Self = StObject.set(x, "formatSettings", js.undefined)
      
      inline def setImportSettings(value: ImportSettings): Self = StObject.set(x, "importSettings", value.asInstanceOf[js.Any])
      
      inline def setImportSettingsUndefined: Self = StObject.set(x, "importSettings", js.undefined)
      
      inline def setIsImport(value: Boolean): Self = StObject.set(x, "isImport", value.asInstanceOf[js.Any])
      
      inline def setIsImportUndefined: Self = StObject.set(x, "isImport", js.undefined)
      
      inline def setIsReadOnly(value: Boolean): Self = StObject.set(x, "isReadOnly", value.asInstanceOf[js.Any])
      
      inline def setIsReadOnlyUndefined: Self = StObject.set(x, "isReadOnly", js.undefined)
      
      inline def setKeyDown(value: /* e */ KeyDownEventArgs => Unit): Self = StObject.set(x, "keyDown", js.Any.fromFunction1(value))
      
      inline def setKeyDownUndefined: Self = StObject.set(x, "keyDown", js.undefined)
      
      inline def setKeyUp(value: /* e */ KeyUpEventArgs => Unit): Self = StObject.set(x, "keyUp", js.Any.fromFunction1(value))
      
      inline def setKeyUpUndefined: Self = StObject.set(x, "keyUp", js.undefined)
      
      inline def setLoad(value: /* e */ LoadEventArgs => Unit): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
      
      inline def setLoadComplete(value: /* e */ LoadCompleteEventArgs => Unit): Self = StObject.set(x, "loadComplete", js.Any.fromFunction1(value))
      
      inline def setLoadCompleteUndefined: Self = StObject.set(x, "loadComplete", js.undefined)
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMenuClick(value: /* e */ MenuClickEventArgs => Unit): Self = StObject.set(x, "menuClick", js.Any.fromFunction1(value))
      
      inline def setMenuClickUndefined: Self = StObject.set(x, "menuClick", js.undefined)
      
      inline def setNameManager(value: js.Array[NameManager]): Self = StObject.set(x, "nameManager", value.asInstanceOf[js.Any])
      
      inline def setNameManagerUndefined: Self = StObject.set(x, "nameManager", js.undefined)
      
      inline def setNameManagerVarargs(value: NameManager*): Self = StObject.set(x, "nameManager", js.Array(value*))
      
      inline def setOnImport(value: /* e */ OnImportEventArgs => Unit): Self = StObject.set(x, "onImport", js.Any.fromFunction1(value))
      
      inline def setOnImportUndefined: Self = StObject.set(x, "onImport", js.undefined)
      
      inline def setOpenFailure(value: /* e */ OpenFailureEventArgs => Unit): Self = StObject.set(x, "openFailure", js.Any.fromFunction1(value))
      
      inline def setOpenFailureUndefined: Self = StObject.set(x, "openFailure", js.undefined)
      
      inline def setPagerClick(value: /* e */ PagerClickEventArgs => Unit): Self = StObject.set(x, "pagerClick", js.Any.fromFunction1(value))
      
      inline def setPagerClickUndefined: Self = StObject.set(x, "pagerClick", js.undefined)
      
      inline def setPictureSettings(value: PictureSettings): Self = StObject.set(x, "pictureSettings", value.asInstanceOf[js.Any])
      
      inline def setPictureSettingsUndefined: Self = StObject.set(x, "pictureSettings", js.undefined)
      
      inline def setPrintSettings(value: PrintSettings): Self = StObject.set(x, "printSettings", value.asInstanceOf[js.Any])
      
      inline def setPrintSettingsUndefined: Self = StObject.set(x, "printSettings", js.undefined)
      
      inline def setResizeEnd(value: /* e */ ResizeEndEventArgs => Unit): Self = StObject.set(x, "resizeEnd", js.Any.fromFunction1(value))
      
      inline def setResizeEndUndefined: Self = StObject.set(x, "resizeEnd", js.undefined)
      
      inline def setResizeStart(value: /* e */ ResizeStartEventArgs => Unit): Self = StObject.set(x, "resizeStart", js.Any.fromFunction1(value))
      
      inline def setResizeStartUndefined: Self = StObject.set(x, "resizeStart", js.undefined)
      
      inline def setRibbonClick(value: /* e */ RibbonClickEventArgs => Unit): Self = StObject.set(x, "ribbonClick", js.Any.fromFunction1(value))
      
      inline def setRibbonClickUndefined: Self = StObject.set(x, "ribbonClick", js.undefined)
      
      inline def setRibbonSettings(value: RibbonSettings): Self = StObject.set(x, "ribbonSettings", value.asInstanceOf[js.Any])
      
      inline def setRibbonSettingsUndefined: Self = StObject.set(x, "ribbonSettings", js.undefined)
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
      
      inline def setRowHeight(value: Double): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
      
      inline def setScrollSettings(value: ScrollSettings): Self = StObject.set(x, "scrollSettings", value.asInstanceOf[js.Any])
      
      inline def setScrollSettingsUndefined: Self = StObject.set(x, "scrollSettings", js.undefined)
      
      inline def setScrollStop(value: /* e */ ScrollStopEventArgs => Unit): Self = StObject.set(x, "scrollStop", js.Any.fromFunction1(value))
      
      inline def setScrollStopUndefined: Self = StObject.set(x, "scrollStop", js.undefined)
      
      inline def setSelectionSettings(value: SelectionSettings): Self = StObject.set(x, "selectionSettings", value.asInstanceOf[js.Any])
      
      inline def setSelectionSettingsUndefined: Self = StObject.set(x, "selectionSettings", js.undefined)
      
      inline def setSheetCount(value: Double): Self = StObject.set(x, "sheetCount", value.asInstanceOf[js.Any])
      
      inline def setSheetCountUndefined: Self = StObject.set(x, "sheetCount", js.undefined)
      
      inline def setSheets(value: js.Array[Sheet]): Self = StObject.set(x, "sheets", value.asInstanceOf[js.Any])
      
      inline def setSheetsUndefined: Self = StObject.set(x, "sheets", js.undefined)
      
      inline def setSheetsVarargs(value: Sheet*): Self = StObject.set(x, "sheets", js.Array(value*))
      
      inline def setShowPager(value: Boolean): Self = StObject.set(x, "showPager", value.asInstanceOf[js.Any])
      
      inline def setShowPagerUndefined: Self = StObject.set(x, "showPager", js.undefined)
      
      inline def setShowRibbon(value: Boolean): Self = StObject.set(x, "showRibbon", value.asInstanceOf[js.Any])
      
      inline def setShowRibbonUndefined: Self = StObject.set(x, "showRibbon", js.undefined)
      
      inline def setTabClick(value: /* e */ TabClickEventArgs => Unit): Self = StObject.set(x, "tabClick", js.Any.fromFunction1(value))
      
      inline def setTabClickUndefined: Self = StObject.set(x, "tabClick", js.undefined)
      
      inline def setTabSelect(value: /* e */ TabSelectEventArgs => Unit): Self = StObject.set(x, "tabSelect", js.Any.fromFunction1(value))
      
      inline def setTabSelectUndefined: Self = StObject.set(x, "tabSelect", js.undefined)
      
      inline def setUndoRedoStep(value: Double): Self = StObject.set(x, "undoRedoStep", value.asInstanceOf[js.Any])
      
      inline def setUndoRedoStepUndefined: Self = StObject.set(x, "undoRedoStep", js.undefined)
      
      inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
      
      inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    }
  }
  
  trait NameManager extends StObject {
    
    /** Specifies the name for the cell or a range.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** Specifies the address for the cell or a range.
      */
    var refersto: js.UndefOr[String] = js.undefined
  }
  object NameManager {
    
    inline def apply(): NameManager = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NameManager]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NameManager] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRefersto(value: String): Self = StObject.set(x, "refersto", value.asInstanceOf[js.Any])
      
      inline def setReferstoUndefined: Self = StObject.set(x, "refersto", js.undefined)
    }
  }
  
  trait NumberFormatOptions extends StObject {
    
    /** Pass the number format object
      */
    var NumFormat: js.UndefOr[Any] = js.undefined
    
    /** Pass the style object
      */
    var style: js.UndefOr[Any] = js.undefined
  }
  object NumberFormatOptions {
    
    inline def apply(): NumberFormatOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NumberFormatOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: NumberFormatOptions] (val x: Self) extends AnyVal {
      
      inline def setNumFormat(value: Any): Self = StObject.set(x, "NumFormat", value.asInstanceOf[js.Any])
      
      inline def setNumFormatUndefined: Self = StObject.set(x, "NumFormat", js.undefined)
      
      inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait OnImportEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the imported data.
      */
    var importData: js.UndefOr[Any] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object OnImportEventArgs {
    
    inline def apply(): OnImportEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OnImportEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnImportEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setImportData(value: Any): Self = StObject.set(x, "importData", value.asInstanceOf[js.Any])
      
      inline def setImportDataUndefined: Self = StObject.set(x, "importData", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait OpenFailureEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the failure type.
      */
    var failureType: js.UndefOr[String] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the status index.
      */
    var status: js.UndefOr[Double] = js.undefined
    
    /** Returns the status in text.
      */
    var statusText: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object OpenFailureEventArgs {
    
    inline def apply(): OpenFailureEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenFailureEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OpenFailureEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setFailureType(value: String): Self = StObject.set(x, "failureType", value.asInstanceOf[js.Any])
      
      inline def setFailureTypeUndefined: Self = StObject.set(x, "failureType", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
      
      inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait PagerClickEventArgs extends StObject {
    
    /** Returns the active sheet index.
      */
    var activeSheet: js.UndefOr[Double] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the new sheet index.
      */
    var gotoSheet: js.UndefOr[Double] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns whether new sheet icon is clicked.
      */
    var newSheet: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the target element.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PagerClickEventArgs {
    
    inline def apply(): PagerClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PagerClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PagerClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setActiveSheet(value: Double): Self = StObject.set(x, "activeSheet", value.asInstanceOf[js.Any])
      
      inline def setActiveSheetUndefined: Self = StObject.set(x, "activeSheet", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setGotoSheet(value: Double): Self = StObject.set(x, "gotoSheet", value.asInstanceOf[js.Any])
      
      inline def setGotoSheetUndefined: Self = StObject.set(x, "gotoSheet", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setNewSheet(value: Boolean): Self = StObject.set(x, "newSheet", value.asInstanceOf[js.Any])
      
      inline def setNewSheetUndefined: Self = StObject.set(x, "newSheet", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait PictureSettings extends StObject {
    
    /** Gets or sets a value that indicates whether to enable or disable picture feature in Spreadsheet. By enabling this, you can add pictures in Spreadsheet.
      * @default {true}
      */
    var allowPictures: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates to define height to picture in the Spreadsheet.
      * @default {220}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets a value that indicates to define width to picture in the Spreadsheet.
      * @default {440}
      */
    var width: js.UndefOr[Double] = js.undefined
  }
  object PictureSettings {
    
    inline def apply(): PictureSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PictureSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PictureSettings] (val x: Self) extends AnyVal {
      
      inline def setAllowPictures(value: Boolean): Self = StObject.set(x, "allowPictures", value.asInstanceOf[js.Any])
      
      inline def setAllowPicturesUndefined: Self = StObject.set(x, "allowPictures", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait PivotOptions extends StObject {
    
    /** Pass the column object to create pivot table
      */
    var columns: js.UndefOr[Any] = js.undefined
    
    /** Pass the filter object to create pivot table
      */
    var filter: js.UndefOr[Any] = js.undefined
    
    /** Pass the rows object to create pivot table
      */
    var rows: js.UndefOr[Any] = js.undefined
    
    /** Pass the values to create pivot table
      */
    var values: js.UndefOr[Any] = js.undefined
  }
  object PivotOptions {
    
    inline def apply(): PivotOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PivotOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PivotOptions] (val x: Self) extends AnyVal {
      
      inline def setColumns(value: Any): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
      inline def setFilter(value: Any): Self = StObject.set(x, "filter", value.asInstanceOf[js.Any])
      
      inline def setFilterUndefined: Self = StObject.set(x, "filter", js.undefined)
      
      inline def setRows(value: Any): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setValues(value: Any): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
  
  trait PrintSettings extends StObject {
    
    /** Gets or sets a value that indicates whether to enable or disable page setup support for printing in Spreadsheet.
      * @default {true}
      */
    var allowPageSetup: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable page size support for printing in Spreadsheet.
      * @default {false}
      */
    var allowPageSize: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable print feature in the Spreadsheet.
      * @default {true}
      */
    var allowPrinting: js.UndefOr[Boolean] = js.undefined
  }
  object PrintSettings {
    
    inline def apply(): PrintSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PrintSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PrintSettings] (val x: Self) extends AnyVal {
      
      inline def setAllowPageSetup(value: Boolean): Self = StObject.set(x, "allowPageSetup", value.asInstanceOf[js.Any])
      
      inline def setAllowPageSetupUndefined: Self = StObject.set(x, "allowPageSetup", js.undefined)
      
      inline def setAllowPageSize(value: Boolean): Self = StObject.set(x, "allowPageSize", value.asInstanceOf[js.Any])
      
      inline def setAllowPageSizeUndefined: Self = StObject.set(x, "allowPageSize", js.undefined)
      
      inline def setAllowPrinting(value: Boolean): Self = StObject.set(x, "allowPrinting", value.asInstanceOf[js.Any])
      
      inline def setAllowPrintingUndefined: Self = StObject.set(x, "allowPrinting", js.undefined)
    }
  }
  
  trait RangeOptions extends StObject {
    
    /** Pass the datasource object values as settings
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Pass the showheader condition as settings
      */
    var showHeader: js.UndefOr[Boolean] = js.undefined
    
    /** Pass the startcell values as settings
      */
    var startCell: js.UndefOr[String] = js.undefined
  }
  object RangeOptions {
    
    inline def apply(): RangeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RangeOptions] (val x: Self) extends AnyVal {
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setStartCell(value: String): Self = StObject.set(x, "startCell", value.asInstanceOf[js.Any])
      
      inline def setStartCellUndefined: Self = StObject.set(x, "startCell", js.undefined)
    }
  }
  
  trait ResizeEndEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the column index which you resized.
      */
    var colIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns new height of the row or shape.
      */
    var newHeight: js.UndefOr[Double] = js.undefined
    
    /** Returns new width of the column or shape.
      */
    var newWidth: js.UndefOr[Double] = js.undefined
    
    /** Returns old height of the row or shape.
      */
    var oldHeight: js.UndefOr[Double] = js.undefined
    
    /** Returns old width of the column or shape.
      */
    var oldWidth: js.UndefOr[Double] = js.undefined
    
    /** Returns type of the request.
      */
    var reqType: js.UndefOr[String] = js.undefined
    
    /** Returns the row index which you resized.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ResizeEndEventArgs {
    
    inline def apply(): ResizeEndEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeEndEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizeEndEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setColIndex(value: Double): Self = StObject.set(x, "colIndex", value.asInstanceOf[js.Any])
      
      inline def setColIndexUndefined: Self = StObject.set(x, "colIndex", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setNewHeight(value: Double): Self = StObject.set(x, "newHeight", value.asInstanceOf[js.Any])
      
      inline def setNewHeightUndefined: Self = StObject.set(x, "newHeight", js.undefined)
      
      inline def setNewWidth(value: Double): Self = StObject.set(x, "newWidth", value.asInstanceOf[js.Any])
      
      inline def setNewWidthUndefined: Self = StObject.set(x, "newWidth", js.undefined)
      
      inline def setOldHeight(value: Double): Self = StObject.set(x, "oldHeight", value.asInstanceOf[js.Any])
      
      inline def setOldHeightUndefined: Self = StObject.set(x, "oldHeight", js.undefined)
      
      inline def setOldWidth(value: Double): Self = StObject.set(x, "oldWidth", value.asInstanceOf[js.Any])
      
      inline def setOldWidthUndefined: Self = StObject.set(x, "oldWidth", js.undefined)
      
      inline def setReqType(value: String): Self = StObject.set(x, "reqType", value.asInstanceOf[js.Any])
      
      inline def setReqTypeUndefined: Self = StObject.set(x, "reqType", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ResizeStartEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the column index which column you start to resize.
      */
    var colIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns type of the request.
      */
    var reqType: js.UndefOr[String] = js.undefined
    
    /** Returns the row index which row you start to resize.
      */
    var rowIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ResizeStartEventArgs {
    
    inline def apply(): ResizeStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResizeStartEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResizeStartEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setColIndex(value: Double): Self = StObject.set(x, "colIndex", value.asInstanceOf[js.Any])
      
      inline def setColIndexUndefined: Self = StObject.set(x, "colIndex", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setReqType(value: String): Self = StObject.set(x, "reqType", value.asInstanceOf[js.Any])
      
      inline def setReqTypeUndefined: Self = StObject.set(x, "reqType", js.undefined)
      
      inline def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
      
      inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RibbonClickEventArgs extends StObject {
    
    /** Returns element Id.
      */
    var Id: js.UndefOr[String] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns isChecked in boolean.
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns target information.
      */
    var prop: js.UndefOr[Any] = js.undefined
    
    /** Returns status.
      */
    var status: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the target element.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RibbonClickEventArgs {
    
    inline def apply(): RibbonClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RibbonClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RibbonClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setProp(value: Any): Self = StObject.set(x, "prop", value.asInstanceOf[js.Any])
      
      inline def setPropUndefined: Self = StObject.set(x, "prop", js.undefined)
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RibbonSettings extends StObject {
    
    /** Gets or sets an object that indicates application tab settings in Spreadsheet.
      */
    var applicationTab: js.UndefOr[RibbonSettingsApplicationTab] = js.undefined
  }
  object RibbonSettings {
    
    inline def apply(): RibbonSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RibbonSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RibbonSettings] (val x: Self) extends AnyVal {
      
      inline def setApplicationTab(value: RibbonSettingsApplicationTab): Self = StObject.set(x, "applicationTab", value.asInstanceOf[js.Any])
      
      inline def setApplicationTabUndefined: Self = StObject.set(x, "applicationTab", js.undefined)
    }
  }
  
  trait RibbonSettingsApplicationTab extends StObject {
    
    /** Gets or sets an object that indicates menu settings for application tab in Spreadsheet.
      */
    var menuSettings: js.UndefOr[RibbonSettingsApplicationTabMenuSettings] = js.undefined
    
    /** Gets or sets a value that indicates to set application tab type in Spreadsheet. It has two types, Menu and Backstage.
      * @default {ej.Ribbon.ApplicationTabType.Backstage}
      */
    var `type`: js.UndefOr[ApplicationTabType | String] = js.undefined
  }
  object RibbonSettingsApplicationTab {
    
    inline def apply(): RibbonSettingsApplicationTab = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RibbonSettingsApplicationTab]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RibbonSettingsApplicationTab] (val x: Self) extends AnyVal {
      
      inline def setMenuSettings(value: RibbonSettingsApplicationTabMenuSettings): Self = StObject.set(x, "menuSettings", value.asInstanceOf[js.Any])
      
      inline def setMenuSettingsUndefined: Self = StObject.set(x, "menuSettings", js.undefined)
      
      inline def setType(value: ApplicationTabType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait RibbonSettingsApplicationTabMenuSettings extends StObject {
    
    /** Specifies the data source to append in application tab.
      * @default {[]}
      */
    var dataSource: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable isAppend property in ribbon settings.
      * @default {false}
      */
    var isAppend: js.UndefOr[Boolean] = js.undefined
  }
  object RibbonSettingsApplicationTabMenuSettings {
    
    inline def apply(): RibbonSettingsApplicationTabMenuSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RibbonSettingsApplicationTabMenuSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RibbonSettingsApplicationTabMenuSettings] (val x: Self) extends AnyVal {
      
      inline def setDataSource(value: js.Array[Any]): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setDataSourceVarargs(value: Any*): Self = StObject.set(x, "dataSource", js.Array(value*))
      
      inline def setIsAppend(value: Boolean): Self = StObject.set(x, "isAppend", value.asInstanceOf[js.Any])
      
      inline def setIsAppendUndefined: Self = StObject.set(x, "isAppend", js.undefined)
    }
  }
  
  trait ScrollSettings extends StObject {
    
    /** Gets or sets a value that indicates whether to enable or disable scrolling in Spreadsheet.
      * @default {true}
      */
    var allowScrolling: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable sheet on demand. By enabling this, it render only the active sheet element while paging remaining sheets are
      * created one by one.
      * @default {false}
      */
    var allowSheetOnDemand: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable virtual scrolling feature in the Spreadsheet.
      * @default {true}
      */
    var allowVirtualScrolling: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets the value that indicates to define the height of spreadsheet.
      * @default {100%}
      */
    var height: js.UndefOr[Double | String] = js.undefined
    
    /** Gets or sets the value that indicates whether to enable or disable responsive mode in the Spreadsheet.
      * @default {true}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates to set scroll mode in Spreadsheet. It has two scroll modes, Normal and Infinite.
      * @default {ej.Spreadsheet.scrollMode.Infinite}
      */
    var scrollMode: js.UndefOr[typings.ejWebAll.ej.Spreadsheet.scrollMode | String] = js.undefined
    
    /** Gets or sets the value that indicates to define the height of the spreadsheet.
      * @default {100%}
      */
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object ScrollSettings {
    
    inline def apply(): ScrollSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollSettings] (val x: Self) extends AnyVal {
      
      inline def setAllowScrolling(value: Boolean): Self = StObject.set(x, "allowScrolling", value.asInstanceOf[js.Any])
      
      inline def setAllowScrollingUndefined: Self = StObject.set(x, "allowScrolling", js.undefined)
      
      inline def setAllowSheetOnDemand(value: Boolean): Self = StObject.set(x, "allowSheetOnDemand", value.asInstanceOf[js.Any])
      
      inline def setAllowSheetOnDemandUndefined: Self = StObject.set(x, "allowSheetOnDemand", js.undefined)
      
      inline def setAllowVirtualScrolling(value: Boolean): Self = StObject.set(x, "allowVirtualScrolling", value.asInstanceOf[js.Any])
      
      inline def setAllowVirtualScrollingUndefined: Self = StObject.set(x, "allowVirtualScrolling", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setScrollMode(value: scrollMode | String): Self = StObject.set(x, "scrollMode", value.asInstanceOf[js.Any])
      
      inline def setScrollModeUndefined: Self = StObject.set(x, "scrollMode", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait ScrollStopEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns the scrolled position.
      */
    var position: js.UndefOr[Double] = js.undefined
    
    /** Returns the request type.
      */
    var reqType: js.UndefOr[String] = js.undefined
    
    /** Returns the scrolling data
      */
    var scrollData: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ScrollStopEventArgs {
    
    inline def apply(): ScrollStopEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScrollStopEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScrollStopEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setReqType(value: String): Self = StObject.set(x, "reqType", value.asInstanceOf[js.Any])
      
      inline def setReqTypeUndefined: Self = StObject.set(x, "reqType", js.undefined)
      
      inline def setScrollData(value: Any): Self = StObject.set(x, "scrollData", value.asInstanceOf[js.Any])
      
      inline def setScrollDataUndefined: Self = StObject.set(x, "scrollData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SelectionSettings extends StObject {
    
    /** Gets or sets a value that indicates to define active cell in spreadsheet.
      */
    var activeCell: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates to define animation time while selection in the Spreadsheet.
      * @default {0.001}
      */
    var animationTime: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets a value that indicates to enable or disable animation while selection.
      * @default {false}
      */
    var enableAnimation: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates to set selection type in Spreadsheet. It has three types which are Column, Row and Default.
      * @default {ej.Spreadsheet.SelectionType.Default}
      */
    var selectionType: js.UndefOr[SelectionType | String] = js.undefined
    
    /** Gets or sets a value that indicates to set selection unit in Spreadsheet. It has three types which are Single, Range and MultiRange.
      * @default {ej.Spreadsheet.SelectionUnit.MultiRange}
      */
    var selectionUnit: js.UndefOr[SelectionUnit | String] = js.undefined
  }
  object SelectionSettings {
    
    inline def apply(): SelectionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SelectionSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SelectionSettings] (val x: Self) extends AnyVal {
      
      inline def setActiveCell(value: String): Self = StObject.set(x, "activeCell", value.asInstanceOf[js.Any])
      
      inline def setActiveCellUndefined: Self = StObject.set(x, "activeCell", js.undefined)
      
      inline def setAnimationTime(value: Double): Self = StObject.set(x, "animationTime", value.asInstanceOf[js.Any])
      
      inline def setAnimationTimeUndefined: Self = StObject.set(x, "animationTime", js.undefined)
      
      inline def setEnableAnimation(value: Boolean): Self = StObject.set(x, "enableAnimation", value.asInstanceOf[js.Any])
      
      inline def setEnableAnimationUndefined: Self = StObject.set(x, "enableAnimation", js.undefined)
      
      inline def setSelectionType(value: SelectionType | String): Self = StObject.set(x, "selectionType", value.asInstanceOf[js.Any])
      
      inline def setSelectionTypeUndefined: Self = StObject.set(x, "selectionType", js.undefined)
      
      inline def setSelectionUnit(value: SelectionUnit | String): Self = StObject.set(x, "selectionUnit", value.asInstanceOf[js.Any])
      
      inline def setSelectionUnitUndefined: Self = StObject.set(x, "selectionUnit", js.undefined)
    }
  }
  
  trait Sheet extends StObject {
    
    /** Specifies the border for the cell in the Spreadsheet.
      * @default {[]}
      */
    var border: js.UndefOr[js.Array[SheetsBorder]] = js.undefined
    
    /** Specifies the conditional formatting for the range of cell in Spreadsheet.
      * @default {[]}
      */
    var cFormatRule: js.UndefOr[js.Array[SheetsCFormatRule]] = js.undefined
    
    /** Specifies the cell types for a cell or range in Spreadsheet.
      * @default {[]}
      */
    var cellTypes: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Gets or sets a value that indicates to define column count in the Spreadsheet.
      * @default {21}
      */
    var colCount: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets a value that indicates to define column width in the Spreadsheet.
      * @default {64}
      */
    var columnWidth: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets the data to render the Spreadsheet.
      * @default {null}
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable field as column header in the Spreadsheet.
      * @default {false}
      */
    var fieldAsColumnHeader: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value to freeze columns in the Spreadsheet.
      * @default {0}
      */
    var frozenColumns: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets a value to freeze rows in the Spreadsheet.
      * @default {0}
      */
    var frozenRows: js.UndefOr[Double] = js.undefined
    
    /** Specifies the header styles for the headers in datasource range.
      * @default {null}
      */
    var headerStyles: js.UndefOr[Any] = js.undefined
    
    /** To hide the specified columns in Spreadsheet.
      * @default {[]}
      */
    var hideColumns: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** To hide the specified rows in Spreadsheet.
      * @default {[]}
      */
    var hideRows: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** To merge specified ranges in Spreadsheet.
      * @default {[]}
      */
    var mergeCells: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the primary key for the datasource in Spreadsheet.
      */
    var primaryKey: js.UndefOr[String] = js.undefined
    
    /** Specifies the query for the dataSource in Spreadsheet.
      * @default {null}
      */
    var query: js.UndefOr[Any] = js.undefined
    
    /** Specifies single range or multiple range settings for a sheet in Spreadsheet.
      * @default {[]}
      */
    var rangeSettings: js.UndefOr[js.Array[SheetsRangeSetting]] = js.undefined
    
    /** Gets or sets a value that indicates to define row count in the Spreadsheet.
      * @default {20}
      */
    var rowCount: js.UndefOr[Double] = js.undefined
    
    /** Specifies the rows for a sheet in Spreadsheet.
      * @default {[]}
      */
    var rows: js.UndefOr[js.Array[SheetsRow]] = js.undefined
    
    /** Specifies the name for sheet in the Spreadsheet.
      * @default {string}
      */
    var sheetName: js.UndefOr[String] = js.undefined
    
    /** Gets or sets a value that indicates whether to show or hide grid lines in the Spreadsheet.
      * @default {true}
      */
    var showGridlines: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable the datasource header in Spreadsheet.
      * @default {true}
      */
    var showHeader: js.UndefOr[Boolean] = js.undefined
    
    /** Gets or sets a value that indicates whether to show or hide headings in the Spreadsheet.
      * @default {true}
      */
    var showHeadings: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the start cell for the datasource range in Spreadsheet.
      * @default {A1}
      */
    var startCell: js.UndefOr[String] = js.undefined
  }
  object Sheet {
    
    inline def apply(): Sheet = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Sheet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sheet] (val x: Self) extends AnyVal {
      
      inline def setBorder(value: js.Array[SheetsBorder]): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setBorderVarargs(value: SheetsBorder*): Self = StObject.set(x, "border", js.Array(value*))
      
      inline def setCFormatRule(value: js.Array[SheetsCFormatRule]): Self = StObject.set(x, "cFormatRule", value.asInstanceOf[js.Any])
      
      inline def setCFormatRuleUndefined: Self = StObject.set(x, "cFormatRule", js.undefined)
      
      inline def setCFormatRuleVarargs(value: SheetsCFormatRule*): Self = StObject.set(x, "cFormatRule", js.Array(value*))
      
      inline def setCellTypes(value: js.Array[Any]): Self = StObject.set(x, "cellTypes", value.asInstanceOf[js.Any])
      
      inline def setCellTypesUndefined: Self = StObject.set(x, "cellTypes", js.undefined)
      
      inline def setCellTypesVarargs(value: Any*): Self = StObject.set(x, "cellTypes", js.Array(value*))
      
      inline def setColCount(value: Double): Self = StObject.set(x, "colCount", value.asInstanceOf[js.Any])
      
      inline def setColCountUndefined: Self = StObject.set(x, "colCount", js.undefined)
      
      inline def setColumnWidth(value: Double): Self = StObject.set(x, "columnWidth", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthUndefined: Self = StObject.set(x, "columnWidth", js.undefined)
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setFieldAsColumnHeader(value: Boolean): Self = StObject.set(x, "fieldAsColumnHeader", value.asInstanceOf[js.Any])
      
      inline def setFieldAsColumnHeaderUndefined: Self = StObject.set(x, "fieldAsColumnHeader", js.undefined)
      
      inline def setFrozenColumns(value: Double): Self = StObject.set(x, "frozenColumns", value.asInstanceOf[js.Any])
      
      inline def setFrozenColumnsUndefined: Self = StObject.set(x, "frozenColumns", js.undefined)
      
      inline def setFrozenRows(value: Double): Self = StObject.set(x, "frozenRows", value.asInstanceOf[js.Any])
      
      inline def setFrozenRowsUndefined: Self = StObject.set(x, "frozenRows", js.undefined)
      
      inline def setHeaderStyles(value: Any): Self = StObject.set(x, "headerStyles", value.asInstanceOf[js.Any])
      
      inline def setHeaderStylesUndefined: Self = StObject.set(x, "headerStyles", js.undefined)
      
      inline def setHideColumns(value: js.Array[Any]): Self = StObject.set(x, "hideColumns", value.asInstanceOf[js.Any])
      
      inline def setHideColumnsUndefined: Self = StObject.set(x, "hideColumns", js.undefined)
      
      inline def setHideColumnsVarargs(value: Any*): Self = StObject.set(x, "hideColumns", js.Array(value*))
      
      inline def setHideRows(value: js.Array[Any]): Self = StObject.set(x, "hideRows", value.asInstanceOf[js.Any])
      
      inline def setHideRowsUndefined: Self = StObject.set(x, "hideRows", js.undefined)
      
      inline def setHideRowsVarargs(value: Any*): Self = StObject.set(x, "hideRows", js.Array(value*))
      
      inline def setMergeCells(value: js.Array[Any]): Self = StObject.set(x, "mergeCells", value.asInstanceOf[js.Any])
      
      inline def setMergeCellsUndefined: Self = StObject.set(x, "mergeCells", js.undefined)
      
      inline def setMergeCellsVarargs(value: Any*): Self = StObject.set(x, "mergeCells", js.Array(value*))
      
      inline def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setRangeSettings(value: js.Array[SheetsRangeSetting]): Self = StObject.set(x, "rangeSettings", value.asInstanceOf[js.Any])
      
      inline def setRangeSettingsUndefined: Self = StObject.set(x, "rangeSettings", js.undefined)
      
      inline def setRangeSettingsVarargs(value: SheetsRangeSetting*): Self = StObject.set(x, "rangeSettings", js.Array(value*))
      
      inline def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      inline def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
      
      inline def setRows(value: js.Array[SheetsRow]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: SheetsRow*): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setSheetName(value: String): Self = StObject.set(x, "sheetName", value.asInstanceOf[js.Any])
      
      inline def setSheetNameUndefined: Self = StObject.set(x, "sheetName", js.undefined)
      
      inline def setShowGridlines(value: Boolean): Self = StObject.set(x, "showGridlines", value.asInstanceOf[js.Any])
      
      inline def setShowGridlinesUndefined: Self = StObject.set(x, "showGridlines", js.undefined)
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setShowHeadings(value: Boolean): Self = StObject.set(x, "showHeadings", value.asInstanceOf[js.Any])
      
      inline def setShowHeadingsUndefined: Self = StObject.set(x, "showHeadings", js.undefined)
      
      inline def setStartCell(value: String): Self = StObject.set(x, "startCell", value.asInstanceOf[js.Any])
      
      inline def setStartCellUndefined: Self = StObject.set(x, "startCell", js.undefined)
    }
  }
  
  trait SheetsBorder extends StObject {
    
    /** Specifies border color for range of cells in Spreadsheet.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** To apply border for the specified range of cell.
      */
    var range: js.UndefOr[String] = js.undefined
    
    /** Specifies border type in the Spreadsheet.
      */
    var `type`: js.UndefOr[BorderType | String] = js.undefined
  }
  object SheetsBorder {
    
    inline def apply(): SheetsBorder = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SheetsBorder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SheetsBorder] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setType(value: BorderType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SheetsCFormatRule extends StObject {
    
    /** Specifies the conditions to apply for the range of cells in Spreadsheet.
      */
    var action: js.UndefOr[CFormatRule | String] = js.undefined
    
    /** Specifies the color to apply for the range of cell while conditional formatting.
      */
    var color: js.UndefOr[CFormatHighlightColor | String] = js.undefined
    
    /** Specifies the inputs for conditional formatting in Spreadsheet.
      * @default {[]}
      */
    var inputs: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Specifies the range for conditional formatting in Spreadsheet.
      */
    var range: js.UndefOr[String] = js.undefined
  }
  object SheetsCFormatRule {
    
    inline def apply(): SheetsCFormatRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SheetsCFormatRule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SheetsCFormatRule] (val x: Self) extends AnyVal {
      
      inline def setAction(value: CFormatRule | String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setColor(value: CFormatHighlightColor | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setInputs(value: js.Array[Any]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
      
      inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
      
      inline def setInputsVarargs(value: Any*): Self = StObject.set(x, "inputs", js.Array(value*))
      
      inline def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
    }
  }
  
  trait SheetsRangeSetting extends StObject {
    
    /** Gets or sets the data to render the Spreadsheet.
      * @default {null}
      */
    var dataSource: js.UndefOr[Any] = js.undefined
    
    /** Specifies the header styles for the headers in datasource range.
      * @default {null}
      */
    var headerStyles: js.UndefOr[Any] = js.undefined
    
    /** Specifies the primary key for the datasource in Spreadsheet.
      */
    var primaryKey: js.UndefOr[String] = js.undefined
    
    /** Specifies the query for the datasource in Spreadsheet.
      * @default {null}
      */
    var query: js.UndefOr[Any] = js.undefined
    
    /** Gets or sets a value that indicates whether to enable or disable the datasource header in Spreadsheet.
      * @default {true}
      */
    var showHeader: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the start cell for the datasource range in Spreadsheet.
      * @default {A1}
      */
    var startCell: js.UndefOr[String] = js.undefined
  }
  object SheetsRangeSetting {
    
    inline def apply(): SheetsRangeSetting = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SheetsRangeSetting]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SheetsRangeSetting] (val x: Self) extends AnyVal {
      
      inline def setDataSource(value: Any): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
      
      inline def setDataSourceUndefined: Self = StObject.set(x, "dataSource", js.undefined)
      
      inline def setHeaderStyles(value: Any): Self = StObject.set(x, "headerStyles", value.asInstanceOf[js.Any])
      
      inline def setHeaderStylesUndefined: Self = StObject.set(x, "headerStyles", js.undefined)
      
      inline def setPrimaryKey(value: String): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
      
      inline def setPrimaryKeyUndefined: Self = StObject.set(x, "primaryKey", js.undefined)
      
      inline def setQuery(value: Any): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
      
      inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
      
      inline def setShowHeader(value: Boolean): Self = StObject.set(x, "showHeader", value.asInstanceOf[js.Any])
      
      inline def setShowHeaderUndefined: Self = StObject.set(x, "showHeader", js.undefined)
      
      inline def setStartCell(value: String): Self = StObject.set(x, "startCell", value.asInstanceOf[js.Any])
      
      inline def setStartCellUndefined: Self = StObject.set(x, "startCell", js.undefined)
    }
  }
  
  trait SheetsRow extends StObject {
    
    /** Specifies the cells of a row in Spreadsheet.
      * @default {[]}
      */
    var cells: js.UndefOr[js.Array[SheetsRowsCell]] = js.undefined
    
    /** Gets or sets the height of a row in Spreadsheet.
      * @default {20}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** Gets or sets the index of a row in Spreadsheet.
      * @default {0}
      */
    var index: js.UndefOr[Double] = js.undefined
  }
  object SheetsRow {
    
    inline def apply(): SheetsRow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SheetsRow]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SheetsRow] (val x: Self) extends AnyVal {
      
      inline def setCells(value: js.Array[SheetsRowsCell]): Self = StObject.set(x, "cells", value.asInstanceOf[js.Any])
      
      inline def setCellsUndefined: Self = StObject.set(x, "cells", js.undefined)
      
      inline def setCellsVarargs(value: SheetsRowsCell*): Self = StObject.set(x, "cells", js.Array(value*))
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    }
  }
  
  trait SheetsRowsCell extends StObject {
    
    /** Specifies the comment for a cell in Spreadsheet.
      * @default {null}
      */
    var comment: js.UndefOr[SheetsRowsCellsComment] = js.undefined
    
    /** Specifies the format of a cell in Spreadsheet.
      * @default {null}
      */
    var format: js.UndefOr[SheetsRowsCellsFormat] = js.undefined
    
    /** Specifies the hyperlink for a cell in Spreadsheet.
      * @default {null}
      */
    var hyperlink: js.UndefOr[SheetsRowsCellsHyperlink] = js.undefined
    
    /** Specifies the index of a cell in Spreadsheet.
      * @default {0}
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /** Specifies whether to lock or unlock a particular cell.
      * @default {false}
      */
    var isLocked: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the styles of a cell in Spreadsheet.
      * @default {null}
      */
    var style: js.UndefOr[SheetsRowsCellsStyle] = js.undefined
    
    /** Specifies the value for a cell in Spreadsheet.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object SheetsRowsCell {
    
    inline def apply(): SheetsRowsCell = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SheetsRowsCell]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SheetsRowsCell] (val x: Self) extends AnyVal {
      
      inline def setComment(value: SheetsRowsCellsComment): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setFormat(value: SheetsRowsCellsFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
      
      inline def setHyperlink(value: SheetsRowsCellsHyperlink): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
      
      inline def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
      
      inline def setIsLockedUndefined: Self = StObject.set(x, "isLocked", js.undefined)
      
      inline def setStyle(value: SheetsRowsCellsStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SheetsRowsCellsComment extends StObject {
    
    /** Get or sets the value that indicates whether to show or hide comments in Spreadsheet.
      * @default {false}
      */
    var isVisible: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the value for the comment in Spreadsheet.
      */
    var value: js.UndefOr[String] = js.undefined
  }
  object SheetsRowsCellsComment {
    
    inline def apply(): SheetsRowsCellsComment = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SheetsRowsCellsComment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SheetsRowsCellsComment] (val x: Self) extends AnyVal {
      
      inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
      
      inline def setIsVisibleUndefined: Self = StObject.set(x, "isVisible", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait SheetsRowsCellsFormat extends StObject {
    
    /** Specifies the number of decimal places for the given input.
      * @default {2}
      */
    var decimalPlaces: js.UndefOr[Double] = js.undefined
    
    /** Specifies the string format for the given input.
      */
    var formatStr: js.UndefOr[String] = js.undefined
    
    /** Specifies the thousand separator for the given input.
      * @default {false}
      */
    var thousandSeparator: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the type of the format in Spreadsheet.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SheetsRowsCellsFormat {
    
    inline def apply(): SheetsRowsCellsFormat = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SheetsRowsCellsFormat]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SheetsRowsCellsFormat] (val x: Self) extends AnyVal {
      
      inline def setDecimalPlaces(value: Double): Self = StObject.set(x, "decimalPlaces", value.asInstanceOf[js.Any])
      
      inline def setDecimalPlacesUndefined: Self = StObject.set(x, "decimalPlaces", js.undefined)
      
      inline def setFormatStr(value: String): Self = StObject.set(x, "formatStr", value.asInstanceOf[js.Any])
      
      inline def setFormatStrUndefined: Self = StObject.set(x, "formatStr", js.undefined)
      
      inline def setThousandSeparator(value: Boolean): Self = StObject.set(x, "thousandSeparator", value.asInstanceOf[js.Any])
      
      inline def setThousandSeparatorUndefined: Self = StObject.set(x, "thousandSeparator", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SheetsRowsCellsHyperlink extends StObject {
    
    /** Specifies the cell address for the hyperlink of a cell.
      */
    var cellAddr: js.UndefOr[String] = js.undefined
    
    /** Specifies the sheet index to which the cell is referred.
      * @default {1}
      */
    var sheetIndex: js.UndefOr[Double] = js.undefined
    
    /** Specifies the web address for the hyperlink of a cell.
      */
    var webAddr: js.UndefOr[String] = js.undefined
  }
  object SheetsRowsCellsHyperlink {
    
    inline def apply(): SheetsRowsCellsHyperlink = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SheetsRowsCellsHyperlink]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SheetsRowsCellsHyperlink] (val x: Self) extends AnyVal {
      
      inline def setCellAddr(value: String): Self = StObject.set(x, "cellAddr", value.asInstanceOf[js.Any])
      
      inline def setCellAddrUndefined: Self = StObject.set(x, "cellAddr", js.undefined)
      
      inline def setSheetIndex(value: Double): Self = StObject.set(x, "sheetIndex", value.asInstanceOf[js.Any])
      
      inline def setSheetIndexUndefined: Self = StObject.set(x, "sheetIndex", js.undefined)
      
      inline def setWebAddr(value: String): Self = StObject.set(x, "webAddr", value.asInstanceOf[js.Any])
      
      inline def setWebAddrUndefined: Self = StObject.set(x, "webAddr", js.undefined)
    }
  }
  
  trait SheetsRowsCellsStyle extends StObject {
    
    /** Specifies the background color of a cell in the Spreadsheet.
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** Specifies the font color of a cell in the Spreadsheet.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Specifies the font weight of a cell in the Spreadsheet.
      */
    var fontWeight: js.UndefOr[String] = js.undefined
  }
  object SheetsRowsCellsStyle {
    
    inline def apply(): SheetsRowsCellsStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SheetsRowsCellsStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SheetsRowsCellsStyle] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setFontWeight(value: String): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      inline def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
    }
  }
  
  trait SparklineOptions extends StObject {
    
    /** Pass the high point color to create sparkline
      */
    var highPointColor: js.UndefOr[String] = js.undefined
    
    /** Pass the marker settings object to create sparkline
      */
    var markerSettings: js.UndefOr[Any] = js.undefined
    
    /** Pass the negative point color to create sparkline
      */
    var negativePointColor: js.UndefOr[String] = js.undefined
    
    /** Pass the start point color to create sparkline
      */
    var startPointColor: js.UndefOr[String] = js.undefined
  }
  object SparklineOptions {
    
    inline def apply(): SparklineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SparklineOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SparklineOptions] (val x: Self) extends AnyVal {
      
      inline def setHighPointColor(value: String): Self = StObject.set(x, "highPointColor", value.asInstanceOf[js.Any])
      
      inline def setHighPointColorUndefined: Self = StObject.set(x, "highPointColor", js.undefined)
      
      inline def setMarkerSettings(value: Any): Self = StObject.set(x, "markerSettings", value.asInstanceOf[js.Any])
      
      inline def setMarkerSettingsUndefined: Self = StObject.set(x, "markerSettings", js.undefined)
      
      inline def setNegativePointColor(value: String): Self = StObject.set(x, "negativePointColor", value.asInstanceOf[js.Any])
      
      inline def setNegativePointColorUndefined: Self = StObject.set(x, "negativePointColor", js.undefined)
      
      inline def setStartPointColor(value: String): Self = StObject.set(x, "startPointColor", value.asInstanceOf[js.Any])
      
      inline def setStartPointColorUndefined: Self = StObject.set(x, "startPointColor", js.undefined)
    }
  }
  
  trait TabClickEventArgs extends StObject {
    
    /** Returns active tab header element.
      */
    var activeHeader: js.UndefOr[Any] = js.undefined
    
    /** Returns the active tab index.
      */
    var activeIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns previous active tab header element.
      */
    var prevActiveHeader: js.UndefOr[Any] = js.undefined
    
    /** Returns previous active tab index.
      */
    var prevActiveIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the target element.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TabClickEventArgs {
    
    inline def apply(): TabClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setActiveHeader(value: Any): Self = StObject.set(x, "activeHeader", value.asInstanceOf[js.Any])
      
      inline def setActiveHeaderUndefined: Self = StObject.set(x, "activeHeader", js.undefined)
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrevActiveHeader(value: Any): Self = StObject.set(x, "prevActiveHeader", value.asInstanceOf[js.Any])
      
      inline def setPrevActiveHeaderUndefined: Self = StObject.set(x, "prevActiveHeader", js.undefined)
      
      inline def setPrevActiveIndex(value: Double): Self = StObject.set(x, "prevActiveIndex", value.asInstanceOf[js.Any])
      
      inline def setPrevActiveIndexUndefined: Self = StObject.set(x, "prevActiveIndex", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait TabOptions extends StObject {
    
    /** Pass the align type
      */
    var alignType: js.UndefOr[HTMLElement] = js.undefined
    
    /** Pass the content object to be displayed in ribbon tab
      */
    var contents: js.UndefOr[Any] = js.undefined
    
    /** Pass the defaults object to be displayed in ribbon tab
      */
    var defaults: js.UndefOr[Any] = js.undefined
    
    /** Pass the text to displayed in ribbon tab
      */
    var text: js.UndefOr[String] = js.undefined
  }
  object TabOptions {
    
    inline def apply(): TabOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabOptions] (val x: Self) extends AnyVal {
      
      inline def setAlignType(value: HTMLElement): Self = StObject.set(x, "alignType", value.asInstanceOf[js.Any])
      
      inline def setAlignTypeUndefined: Self = StObject.set(x, "alignType", js.undefined)
      
      inline def setContents(value: Any): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      inline def setDefaults(value: Any): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
  
  trait TabSelectEventArgs extends StObject {
    
    /** Returns active tab header element.
      */
    var activeHeader: js.UndefOr[Any] = js.undefined
    
    /** Returns the active tab index.
      */
    var activeIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the Spreadsheet model.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Returns previous active tab header element.
      */
    var prevActiveHeader: js.UndefOr[Any] = js.undefined
    
    /** Returns previous active tab index.
      */
    var prevActiveIndex: js.UndefOr[Double] = js.undefined
    
    /** Returns the target element.
      */
    var target: js.UndefOr[HTMLElement] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object TabSelectEventArgs {
    
    inline def apply(): TabSelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TabSelectEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabSelectEventArgs] (val x: Self) extends AnyVal {
      
      inline def setActiveHeader(value: Any): Self = StObject.set(x, "activeHeader", value.asInstanceOf[js.Any])
      
      inline def setActiveHeaderUndefined: Self = StObject.set(x, "activeHeader", js.undefined)
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPrevActiveHeader(value: Any): Self = StObject.set(x, "prevActiveHeader", value.asInstanceOf[js.Any])
      
      inline def setPrevActiveHeaderUndefined: Self = StObject.set(x, "prevActiveHeader", js.undefined)
      
      inline def setPrevActiveIndex(value: Double): Self = StObject.set(x, "prevActiveIndex", value.asInstanceOf[js.Any])
      
      inline def setPrevActiveIndexUndefined: Self = StObject.set(x, "prevActiveIndex", js.undefined)
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait TableIDOptions extends StObject {
    
    /** Pass the sheet index
      */
    var sheetIdx: js.UndefOr[Double] = js.undefined
    
    /** Pass the table id
      */
    var tableId: js.UndefOr[Double] = js.undefined
  }
  object TableIDOptions {
    
    inline def apply(): TableIDOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableIDOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableIDOptions] (val x: Self) extends AnyVal {
      
      inline def setSheetIdx(value: Double): Self = StObject.set(x, "sheetIdx", value.asInstanceOf[js.Any])
      
      inline def setSheetIdxUndefined: Self = StObject.set(x, "sheetIdx", js.undefined)
      
      inline def setTableId(value: Double): Self = StObject.set(x, "tableId", value.asInstanceOf[js.Any])
      
      inline def setTableIdUndefined: Self = StObject.set(x, "tableId", js.undefined)
    }
  }
  
  trait TableOptions extends StObject {
    
    /** Pass the format name of table
      */
    var formatName: js.UndefOr[String] = js.undefined
    
    /** Pass the header boolean condition of table
      */
    var header: js.UndefOr[Boolean] = js.undefined
    
    /** Pass the name of the table
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object TableOptions {
    
    inline def apply(): TableOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableOptions] (val x: Self) extends AnyVal {
      
      inline def setFormatName(value: String): Self = StObject.set(x, "formatName", value.asInstanceOf[js.Any])
      
      inline def setFormatNameUndefined: Self = StObject.set(x, "formatName", js.undefined)
      
      inline def setHeader(value: Boolean): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
      
      inline def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait UndoRedoOptions extends StObject {
    
    /** Pass the action to update undo and redo collection
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** Pass the cell to update undo and redo collection
      */
    var cell: js.UndefOr[HTMLElement] = js.undefined
    
    /** Pass the sheet index to update undo and redo collection
      */
    var sheetIndex: js.UndefOr[Double] = js.undefined
  }
  object UndoRedoOptions {
    
    inline def apply(): UndoRedoOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UndoRedoOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UndoRedoOptions] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setCell(value: HTMLElement): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
      
      inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
      
      inline def setSheetIndex(value: Double): Self = StObject.set(x, "sheetIndex", value.asInstanceOf[js.Any])
      
      inline def setSheetIndexUndefined: Self = StObject.set(x, "sheetIndex", js.undefined)
    }
  }
  
  @js.native
  trait XLCFormat extends StObject {
    
    def clearCF(range: String): Unit = js.native
    /** This method is used to clear the applied conditional formatting rules in the Spreadsheet.
      * @param {any[]|string} Optional. If range is specified, it will clear rules for the specified range else it will use the current selected range.
      * @returns {void}
      */
    def clearCF(range: js.Array[Any]): Unit = js.native
    
    /** This method is used to get the applied conditional formatting rules as array of objects based on the specified row Index and column Index in the Spreadsheet.
      * @param {number} Pass the row index.
      * @param {number} Pass the column index.
      * @returns {any[]}
      */
    def getCFRule(rowIdx: Double, colIdx: Double): js.Array[Any] = js.native
    
    /** This method is used to set the conditional formatting rule in the Spreadsheet.
      * @param {Spreadsheet.CFormatOptions} Pass the Object "CFormatOptions"
      * @returns {void}
      */
    def setCFRule(rule: CFormatOptions): Unit = js.native
  }
  
  trait XLCMenu extends StObject {
    
    /** This method is used to dynamically add items in the context menu.
      * @param {ej.Spreadsheet.ContextMenuType} Specifies the context menu type in which the item to be inserted.
      * @param {any[]} Pass the items to be inserted
      * @param {string} Specifies the type of operation to be performed
      * @param {number} Specifies the item index
      * @returns {void}
      */
    def addItem(target: ContextMenuType, itemColl: js.Array[Any], operation: String, itemIdx: Double): Unit
    
    /** This method is used to change data source in the context menu.
      * @param {string} Specifies the context menu type to bind the data source.
      * @param {any[]} Pass the data source to be binded
      * @returns {void}
      */
    def changeDataSource(target: String, data: js.Array[Any]): Unit
    
    /** This method is used to disable the items in the context menu.
      * @param {string} Specifies the context menu type in which the item to be disabled.
      * @param {any[]} Specifies the Menu Item id collection to be disabled
      * @returns {void}
      */
    def disableItem(target: String, idxColl: js.Array[Any]): Unit
    
    /** This method is used to enable the items in the context menu.
      * @param {string} Specifies the context menu type in which the item to be enabled.
      * @param {any[]} Specifies the Menu Item id collection to be enabled
      * @returns {void}
      */
    def enableItem(target: String, idxColl: js.Array[Any]): Unit
    
    /** This method is used to hide the items in the context menu.
      * @param {string} Specifies the context menu type in which the item to be hides.
      * @param {any[]} Specifies the Menu Item id collection to be hides
      * @returns {void}
      */
    def hideItem(cMenuType: String, idxColl: js.Array[Any]): Unit
    
    /** This method is used to remove the items in the context menu.
      * @param {string} Specifies the context menu type in which the item to be removed.
      * @param {any[]} Specifies the Menu Item id collection to be removed
      * @returns {void}
      */
    def removeItem(target: String, idxColl: js.Array[Any]): Unit
    
    /** This method is used to show the items in the context menu.
      * @param {string} Specifies the context menu type in which the item to be shown.
      * @param {any[]} Specifies the Menu Item id collection to be shown
      * @returns {void}
      */
    def showItem(cMenuType: String, idxColl: js.Array[Any]): Unit
  }
  object XLCMenu {
    
    inline def apply(
      addItem: (ContextMenuType, js.Array[Any], String, Double) => Unit,
      changeDataSource: (String, js.Array[Any]) => Unit,
      disableItem: (String, js.Array[Any]) => Unit,
      enableItem: (String, js.Array[Any]) => Unit,
      hideItem: (String, js.Array[Any]) => Unit,
      removeItem: (String, js.Array[Any]) => Unit,
      showItem: (String, js.Array[Any]) => Unit
    ): XLCMenu = {
      val __obj = js.Dynamic.literal(addItem = js.Any.fromFunction4(addItem), changeDataSource = js.Any.fromFunction2(changeDataSource), disableItem = js.Any.fromFunction2(disableItem), enableItem = js.Any.fromFunction2(enableItem), hideItem = js.Any.fromFunction2(hideItem), removeItem = js.Any.fromFunction2(removeItem), showItem = js.Any.fromFunction2(showItem))
      __obj.asInstanceOf[XLCMenu]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XLCMenu] (val x: Self) extends AnyVal {
      
      inline def setAddItem(value: (ContextMenuType, js.Array[Any], String, Double) => Unit): Self = StObject.set(x, "addItem", js.Any.fromFunction4(value))
      
      inline def setChangeDataSource(value: (String, js.Array[Any]) => Unit): Self = StObject.set(x, "changeDataSource", js.Any.fromFunction2(value))
      
      inline def setDisableItem(value: (String, js.Array[Any]) => Unit): Self = StObject.set(x, "disableItem", js.Any.fromFunction2(value))
      
      inline def setEnableItem(value: (String, js.Array[Any]) => Unit): Self = StObject.set(x, "enableItem", js.Any.fromFunction2(value))
      
      inline def setHideItem(value: (String, js.Array[Any]) => Unit): Self = StObject.set(x, "hideItem", js.Any.fromFunction2(value))
      
      inline def setRemoveItem(value: (String, js.Array[Any]) => Unit): Self = StObject.set(x, "removeItem", js.Any.fromFunction2(value))
      
      inline def setShowItem(value: (String, js.Array[Any]) => Unit): Self = StObject.set(x, "showItem", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait XLCellType extends StObject {
    
    /** This method is used to set a cell type from the specified range of cells in the spreadsheet.
      * @param {string} Pass the range where you want apply cell type.
      * @param {Spreadsheet.CellTypeSettings} Pass the Object "CellTypeSettings"
      * @param {number} Optional. Pass sheet index.
      * @returns {void}
      */
    def addCellTypes(range: String, settings: CellTypeSettings, sheetIdx: Double): Unit = js.native
    
    /** This method is used to remove cell type from the specified range of cells in the Spreadsheet.
      * @param {string|any[]} Pass the range where you want remove cell type.
      * @param {number} Optional. Pass sheet index.
      * @returns {void}
      */
    def removeCellTypes(range: String, sheetIdx: Double): Unit = js.native
    def removeCellTypes(range: js.Array[Any], sheetIdx: Double): Unit = js.native
  }
  
  @js.native
  trait XLChart extends StObject {
    
    /** This method is used to change the data range of the chart in the Spreadsheet.
      * @param {string} Pass the chart id.
      * @param {string} X axis range of chart data.
      * @param {string} Y axis range of chart data.
      * @param {string} Legend range of chart data.
      * @returns {void}
      */
    def changeDataRange(chartId: String, xRange: String, yRange: String, lRange: String): Unit = js.native
    
    /** This method is used to change the theme of the chart in the Spreadsheet.
      * @param {string} Pass the chart id.
      * @param {ej.datavisualization.Chart.Theme} Pass the chart theme which want to update.
      * @returns {void}
      */
    def changeTheme(chartId: String, theme: Theme): Unit = js.native
    
    /** This method is used to change the type of the chart in the Spreadsheet.
      * @param {string} Pass the chart id.
      * @param {Spreadsheet.ChartOptions} Pass Object ChartOptions.
      * @returns {void}
      */
    def changeType(chartId: String, option: ChartOptions): Unit = js.native
    
    /** This method is used to create a chart for specified range in Spreadsheet.
      * @param {string|any[]} Optional. If range is specified, it will create chart for the specified range else it will use the current selected range.
      * @param {Spreadsheet.ChartOptions} Optional.
      * @returns {void}
      */
    def createChart(range: String, options: ChartOptions): Unit = js.native
    def createChart(range: js.Array[Any], options: ChartOptions): Unit = js.native
    
    /** This method is used to refresh the chart in the Spreadsheet.
      * @param {string} To pass the chart Id.
      * @param {Spreadsheet.ChartOptions} NameTypeDescriptiontypestringPass the chart typeenable3DbooleanPass the enable3D conditionmarkerobjectPass the marker object
      * @returns {void}
      */
    def refreshChart(id: String, options: ChartOptions): Unit = js.native
    
    /** This method is used to resize the chart of specified id in the Spreadsheet.
      * @param {string} To pass the chart id.
      * @param {number} To pass height value.
      * @param {number} To pass the width value.
      * @returns {void}
      */
    def resizeChart(id: String, height: Double, width: Double): Unit = js.native
    
    /** This method is used switch row to columns and vice versa for chart in the Spreadsheet. So that the data is displayed in the chart the way you want.
      * @param {string} Pass the chart id.
      * @returns {void}
      */
    def switchRowColumn(chartId: String): Unit = js.native
    
    /** This method is used to update the chart element, such as axes, titles, data labels, grid lines and legends in the Spreadsheet.
      * @param {string} Pass the chart id.
      * @param {ej.Spreadsheet.ChartProperties} Pass chart element value which you want to update.
      * @returns {void}
      */
    def updateChartElement(chartId: String, value: ChartProperties): Unit = js.native
  }
  
  trait XLClipboard extends StObject {
    
    /** This method is used to copy the selected cells in the Spreadsheet.
      * @returns {void}
      */
    def copy(): Unit
    
    /** This method is used to cut the selected cells in the Spreadsheet.
      * @returns {void}
      */
    def cut(): Unit
    
    /** This method is used to paste the cut or copied cells data in the Spreadsheet.
      * @returns {void}
      */
    def paste(): Unit
  }
  object XLClipboard {
    
    inline def apply(copy: () => Unit, cut: () => Unit, paste: () => Unit): XLClipboard = {
      val __obj = js.Dynamic.literal(copy = js.Any.fromFunction0(copy), cut = js.Any.fromFunction0(cut), paste = js.Any.fromFunction0(paste))
      __obj.asInstanceOf[XLClipboard]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XLClipboard] (val x: Self) extends AnyVal {
      
      inline def setCopy(value: () => Unit): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
      
      inline def setCut(value: () => Unit): Self = StObject.set(x, "cut", js.Any.fromFunction0(value))
      
      inline def setPaste(value: () => Unit): Self = StObject.set(x, "paste", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait XLComment extends StObject {
    
    def deleteComment(range: String, sheetIdx: Double, skipHiddenRow: Boolean): Unit = js.native
    /** This method is used to delete the comment in the specified range in Spreadsheet.
      * @param {any[]|string} Optional. If range is specified, it will delete comments for the specified range else it will use the current selected range.
      * @param {number} Optional. If sheetIdx is specified, it will delete comment in specified sheet else it will use active sheet.
      * @param {boolean} Optional. Pass {{'`true`' | markdownify}}, if you want to skip the hidden rows data.
      * @returns {void}
      */
    def deleteComment(range: js.Array[Any], sheetIdx: Double, skipHiddenRow: Boolean): Unit = js.native
    
    /** This method is used to edit the comment in the target Cell in Spreadsheet.
      * @param {Spreadsheet.CellIndex} Optional.
      * @returns {void}
      */
    def editComment(targetCell: CellIndex): Unit = js.native
    
    /** This method is used to find the next comment from the active cell in Spreadsheet.
      * @returns {boolean}
      */
    def findNextComment(): Boolean = js.native
    
    /** This method is used to find the previous comment from the active cell in Spreadsheet.
      * @returns {boolean}
      */
    def findPrevComment(): Boolean = js.native
    
    /** This method is used to get comment data for the specified cell.
      * @param {HTMLElement} Pass the DOM element to get comment data as object.
      * @returns {any}
      */
    def getComment(cell: HTMLElement): Any = js.native
    
    /** This method is used to set new comment in Spreadsheet.
      * @param {string|any[]} Optional. If we pass the range comment will set in the range otherwise it will set with selected cells.
      * @param {string} Optional. Pass the comment data.
      * @param {boolean} Optional. Pass {{'`true`' | markdownify}} to show comment in edit mode
      * @param {boolean} Optional. Pass {{'`true`' | markdownify}} to show the user name
      * @returns {void}
      */
    def setComment(range: String, data: String, showEditPanel: Boolean, showUserName: Boolean): Unit = js.native
    def setComment(range: js.Array[Any], data: String, showEditPanel: Boolean, showUserName: Boolean): Unit = js.native
    
    /** This method is used to show all the comments in the Spreadsheet.
      * @returns {void}
      */
    def showAllComments(): Unit = js.native
    
    /** This method is used to show or hide the specific comment in the Spreadsheet.
      * @param {HTMLElement} Optional. Pass the cell DOM element to show or hide its comment. If pass empty argument active cell will processed.
      * @returns {void}
      */
    def showHideComment(targetCell: HTMLElement): Unit = js.native
  }
  
  @js.native
  trait XLDragDrop extends StObject {
    
    def moveRangeTo(sourceRange: js.Array[Any], destinationRange: js.Array[Any]): Unit = js.native
    def moveRangeTo(sourceRange: js.Array[Any], destinationRange: Any): Unit = js.native
    def moveRangeTo(sourceRange: Any, destinationRange: js.Array[Any]): Unit = js.native
    /** This method is used to drag and drop the selected range of cells to destination range in the Spreadsheet.
      * @param {any|any[]} Pass the source range to perform drag and drop.
      * @param {any|any[]} Pass the destination range to drop the dragged cells.
      * @returns {void}
      */
    def moveRangeTo(sourceRange: Any, destinationRange: Any): Unit = js.native
  }
  
  trait XLDragFill extends StObject {
    
    /** This method is used to perform auto fill in Spreadsheet.
      * @param {Spreadsheet.AutoFillObject} Pass Object AutoFillObject.
      * @returns {void}
      */
    def autoFill(options: AutoFillObject): Unit
    
    /** This method is used to hide the auto fill element in the Spreadsheet.
      * @returns {void}
      */
    def hideAutoFillElement(): Unit
    
    /** This method is used to hide the auto fill options in the Spreadsheet.
      * @returns {void}
      */
    def hideAutoFillOptions(): Unit
    
    /** This method is used to set position of the auto fill element in the Spreadsheet.
      * @param {boolean} Pass the isDragFill option as {{'`boolean`' | markdownify}} value to show auto fill options in Spreadsheet.
      * @returns {void}
      */
    def positionAutoFillElement(isDragFill: Boolean): Unit
  }
  object XLDragFill {
    
    inline def apply(
      autoFill: AutoFillObject => Unit,
      hideAutoFillElement: () => Unit,
      hideAutoFillOptions: () => Unit,
      positionAutoFillElement: Boolean => Unit
    ): XLDragFill = {
      val __obj = js.Dynamic.literal(autoFill = js.Any.fromFunction1(autoFill), hideAutoFillElement = js.Any.fromFunction0(hideAutoFillElement), hideAutoFillOptions = js.Any.fromFunction0(hideAutoFillOptions), positionAutoFillElement = js.Any.fromFunction1(positionAutoFillElement))
      __obj.asInstanceOf[XLDragFill]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XLDragFill] (val x: Self) extends AnyVal {
      
      inline def setAutoFill(value: AutoFillObject => Unit): Self = StObject.set(x, "autoFill", js.Any.fromFunction1(value))
      
      inline def setHideAutoFillElement(value: () => Unit): Self = StObject.set(x, "hideAutoFillElement", js.Any.fromFunction0(value))
      
      inline def setHideAutoFillOptions(value: () => Unit): Self = StObject.set(x, "hideAutoFillOptions", js.Any.fromFunction0(value))
      
      inline def setPositionAutoFillElement(value: Boolean => Unit): Self = StObject.set(x, "positionAutoFillElement", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait XLEdit extends StObject {
    
    /** This method is used to calculate formulas in the specified sheet.
      * @param {number} Optional. If sheet index is specified, then it will calculate formulas in the specified sheet only else it will calculate formulas in all sheets.
      * @returns {void}
      */
    def calcNow(sheetIdx: Double): Unit = js.native
    
    /** This method is used to edit a particular cell based on the row index and column index in the Spreadsheet.
      * @param {number} Pass the row index to edit particular cell.
      * @param {number} Pass the column index to edit particular cell.
      * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to maintain previous cell value.
      * @returns {void}
      */
    def editCell(rowIdx: Double, colIdx: Double, oldData: Boolean): Unit = js.native
    
    /** This method is used to get the column index with specified field value in Spreadsheet.
      * @param {string} Pass the column field value
      * @returns {void}
      */
    def getColumnIndexByField(field: String): Unit = js.native
    
    /** This method is used to get the property value of particular cell, based on the row and column index in the Spreadsheet.
      * @param {number} Pass the row index to get the property value.
      * @param {number} Pass the column index to get the property value.
      * @param {string} Optional. Pass the property name that you want("value", "value2", "type", "cFormatRule", "range", "thousandSeparator", "rule", "format", "border", "picture",
      * "chart", "calcValue", "align", "hyperlink", "formats", "borders", "tformats", "tborders", "isFilterHeader",  "filterState", "tableName", "comment", "formatStr", "decimalPlaces",
      * "cellType").
      * @param {number} Optional. Pass the index of the sheet.
      * @returns {any|string|any[]}
      */
    def getPropertyValue(rowIdx: Double, colIdx: Double, prop: String, sheetIdx: Double): Any | String | js.Array[Any] = js.native
    
    /** This method is used to get the property value in specified cell in Spreadsheet.
      * @param {HTMLElement} Pass the cell element to get property value.
      * @param {string} Pass the property name that you want ("value", "value2", "type", "cFormatRule", "range", "thousandSeparator", "rule", "format", "border", "picture", "chart",
      * "calcValue", "align", "hyperlink", "formats", "borders", "tformats", "tborders", "isFilterHeader", "filterState", "tableName", "comment", "formatStr", "decimalPlaces",
      * "cellType").
      * @param {number} Pass the index of sheet.
      * @returns {any|string|any[]}
      */
    def getPropertyValueByElem(elem: HTMLElement, property: String, sheetIdx: Double): Any | String | js.Array[Any] = js.native
    
    /** This method is used to save the edited cell value in the Spreadsheet.
      * @returns {void}
      */
    def saveCell(): Unit = js.native
    
    /** This method is used to update a particular cell value in the Spreadsheet.
      * @param {Spreadsheet.CellIndex} Pass Object CellIndex.
      * @param {string|number} Pass the cell value.
      * @returns {void}
      */
    def updateCell(cell: CellIndex, value: String): Unit = js.native
    def updateCell(cell: CellIndex, value: Double): Unit = js.native
    
    /** This method is used to update a particular cell value and its format in the Spreadsheet.
      * @param {Spreadsheet.CellIndex} Pass Object CellIndex.
      * @param {string|number} Pass the cell value.
      * @param {string} Pass the class name to update format.
      * @param {number} Pass sheet index.
      * @returns {void}
      */
    def updateCellValue(cellIdx: CellIndex, `val`: String, formatClass: String, sheetIdx: Double): Unit = js.native
    def updateCellValue(cellIdx: CellIndex, `val`: Double, formatClass: String, sheetIdx: Double): Unit = js.native
    
    /** This method is used to update a particular cell value and its format in the Spreadsheet.
      * @param {string} Pass the range.
      * @param {string|number} Pass the cell value.
      * @param {string} Pass the class name to update format.
      * @param {number} Pass sheet index.
      * @returns {void}
      */
    def updateValue(aRange: String, `val`: String, formatClass: String, sheetIdx: Double): Unit = js.native
    def updateValue(aRange: String, `val`: Double, formatClass: String, sheetIdx: Double): Unit = js.native
  }
  
  trait XLExport extends StObject {
    
    /** This method is used to save the sheet data as Excel ,CSV or PDF document (.xls, .xlsx .csv, .pdf) in Spreadsheet.
      * @param {string} Pass the export type that you want.
      * @param {ej.Spreadsheet.ExportType} Pass the export filename that you want.
      * @returns {void}
      */
    def `export`(`type`: String, fileName: ExportType): Unit
    
    /** This method is used to get the export properties in the Spreadsheet.
      * @returns {any}
      */
    def getExportProps(): Any
  }
  object XLExport {
    
    inline def apply(`export`: (String, ExportType) => Unit, getExportProps: () => Any): XLExport = {
      val __obj = js.Dynamic.literal(getExportProps = js.Any.fromFunction0(getExportProps))
      __obj.updateDynamic("export")(js.Any.fromFunction2(`export`))
      __obj.asInstanceOf[XLExport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XLExport] (val x: Self) extends AnyVal {
      
      inline def setExport(value: (String, ExportType) => Unit): Self = StObject.set(x, "export", js.Any.fromFunction2(value))
      
      inline def setGetExportProps(value: () => Any): Self = StObject.set(x, "getExportProps", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait XLFilter extends StObject {
    
    /** This method is used to clear the filter in filtered columns in the Spreadsheet.
      * @returns {void}
      */
    def clearFilter(): Unit = js.native
    
    /** This method is used to apply filter for the selected range of cells in the Spreadsheet.
      * @param {string|any[]} Pass the range of the selected cells.
      * @returns {void}
      */
    def filter(range: String): Unit = js.native
    def filter(range: js.Array[Any]): Unit = js.native
    
    /** This method is used to apply filter for the column by active cell's value in the Spreadsheet.
      * @returns {void}
      */
    def filterByActiveCell(): Unit = js.native
  }
  
  @js.native
  trait XLFormat extends StObject {
    
    /** This method is used to add the custom Date &amp; Time format and recognize it as a preferred pattern in spreadsheet.
      * @param {string} Pass the name for custom format.
      * @param {string} Pass the custom format string.
      * @param {string} Pass the type for custom format.
      * @returns {void}
      */
    def addCustomFormatSpecifier(name: String, formatSpecifier: String, `type`: String): Unit = js.native
    
    /** This method is used to add the font to the Ribbon font family dropdown.
      * @param {string} Font name which needs to add into the font family option.
      * @returns {void}
      */
    def addFontFamily(fontName: String): Unit = js.native
    
    /** This method is used to add the new custom cell style in spreadsheet.
      * @param {string} Pass the style name.
      * @param {Spreadsheet.NumberFormatOptions} Pass Object NumberFormatOptions.
      * @returns {void}
      */
    def addNewCustomStyle(styleName: String, options: NumberFormatOptions): Unit = js.native
    
    /** This method is used to apply the custom cell style in the specified range.
      * @param {string} Pass the style name.
      * @param {string} Pass the range to applied.
      * @returns {void}
      */
    def applyCustomCellStyle(styleName: String, range: String): Unit = js.native
    
    /** This method is used to convert table range to normal range.
      * @param {Spreadsheet.TableIDOptions} Pass Object TableIDOptions.
      * @returns {void}
      */
    def convertToRange(options: TableIDOptions): Unit = js.native
    
    /** This method is used to create a table for the selected range of cells in the Spreadsheet.
      * @param {Spreadsheet.TableOptions} Pass Object TableOptions.
      * @param {string|any[]} Optional. If the range is specified, then it will create table in the specified range else it will use the current selected range.
      * @returns {string}
      */
    def createTable(tableObject: TableOptions, range: String): String = js.native
    def createTable(tableObject: TableOptions, range: js.Array[Any]): String = js.native
    
    /** This method is used to delete the added custom cell style in spreadsheet.
      * @param {string} Pass the cell style name
      * @returns {void}
      */
    def deleteCustomStyle(styleName: String): Unit = js.native
    
    /** This method is used to set format style and values in a cell or range of cells.
      * @param {Spreadsheet.FormatObjectOptions} Pass Object FormatObjectOptions.
      * @param {string} Pass the range to format cells.
      * @returns {void}
      */
    def format(formatObj: FormatObjectOptions, range: String): Unit = js.native
    
    /** This method is used to get the border from hashcode in the Spreadsheet.
      * @param {string} Pass the border hashcode.
      * @param {boolean} Optional. pass `true` to get the complete border object
      * @returns {any}
      */
    def getBorderFromHashCode(code: String, isComplete: Boolean): Any = js.native
    
    /** This method is used to get the format class in spreadsheet.
      * @param {string} Pass the style name.
      * @param {boolean} Optional. Pass true to get the border class.
      * @returns {void}
      */
    def getFormatClass(classname: String, isborder: Boolean): Unit = js.native
    
    /** This method is used to get the format from the given hashcode in spreadsheet.
      * @param {string} Pass the hashcode.
      * @returns {void}
      */
    def getFormatFromHashCode(hashCode: String): Unit = js.native
    
    /** This method is used to get the hashcode from the given style object in spreadsheet.
      * @param {Spreadsheet.FontOptions} Pass Object FontOptions.
      * @returns {void}
      */
    def getFormatHashCode(style: FontOptions): Unit = js.native
    
    /** This method is used to get the format as array from the given specified range in spreadsheet.
      * @param {string} Pass the range.
      * @returns {void}
      */
    def getHashCodeClassAsArray(range: String): Unit = js.native
    
    /** This method is used to modify the added custom cell style in spreadsheet.
      * @param {string} pass the old style name
      * @param {Spreadsheet.CustomStyleOptions} Pass Object CustomStyleOptions.
      * @param {string} pass the new style name
      * @returns {void}
      */
    def modifyCustomStyle(oldStyleName: String, options: CustomStyleOptions, newStyleName: String): Unit = js.native
    
    /** This method is used to remove the font from the Ribbon font family dropdown.
      * @param {string} Font name which needs to remove from the font family drop down.
      * @returns {void}
      */
    def removeFontFamily(fontName: String): Unit = js.native
    
    def removeStyle(range: String, options: FormatOptions): Unit = js.native
    /** This method is used to remove the style in the specified range.
      * @param {any[]|string} Pass the cell range .
      * @param {Spreadsheet.FormatOptions} Optional.
      * @returns {void}
      */
    def removeStyle(range: js.Array[Any], options: FormatOptions): Unit = js.native
    
    /** This method is used to remove table with specified tableId in the Spreadsheet.
      * @param {number} Pass the tableId that you want to remove.
      * @returns {void}
      */
    def removeTable(tableId: Double): Unit = js.native
    
    /** This method is used to update the decimal places for numeric value for the selected range of cells in the Spreadsheet.
      * @param {string} Pass the decimal places type in IncreaseDecimal/DecreaseDecimal.
      * @param {string|any[]} Pass the range.
      * @returns {void}
      */
    def updateDecimalPlaces(`type`: String, range: String): Unit = js.native
    def updateDecimalPlaces(`type`: String, range: js.Array[Any]): Unit = js.native
    
    /** This method is used to update the format for the selected range of cells in the Spreadsheet.
      * @param {Spreadsheet.BorderOptions} Pass Object BorderOptions.
      * @param {any[]} Optional. If the range is specified, then it will update format in the specified range else it will use the current selected range.
      * @returns {void}
      */
    def updateFormat(formatObj: BorderOptions, range: js.Array[Any]): Unit = js.native
    
    /** This method is used to update the unique format for selected range of cells in the Spreadsheet.
      * @param {string} Pass the unique format class.
      * @param {any[]} Optional. If the range is specified, then it will update format in the specified range else it will use the current selected range.
      * @returns {void}
      */
    def updateUniqueFormat(formatClass: String, range: js.Array[Any]): Unit = js.native
  }
  
  trait XLFreeze extends StObject {
    
    /** This method is used to freeze columns upto the specified column index in the Spreadsheet.
      * @param {number} Index of the column to be freeze.
      * @returns {void}
      */
    def freezeColumns(colIdx: Double): Unit
    
    /** This method is used to freeze the first column in the Spreadsheet.
      * @returns {void}
      */
    def freezeLeftColumn(): Unit
    
    /** This method is used to freeze rows and columns before the specified cell in the Spreadsheet.
      * @param {number} Index of the row to be freeze.
      * @param {number} Index of the column to be freeze.
      * @returns {void}
      */
    def freezePanes(rowIdx: Double, colIdx: Double): Unit
    
    /** This method is used to freeze rows upto the specified row index in the Spreadsheet.
      * @param {number} Index of the row to be freeze.
      * @returns {void}
      */
    def freezeRows(rowIdx: Double): Unit
    
    /** This method is used to freeze the top row in the Spreadsheet.
      * @returns {void}
      */
    def freezeTopRow(): Unit
    
    /** This method is used to unfreeze the frozen rows and columns in the Spreadsheet.
      * @returns {void}
      */
    def unfreezePanes(): Unit
  }
  object XLFreeze {
    
    inline def apply(
      freezeColumns: Double => Unit,
      freezeLeftColumn: () => Unit,
      freezePanes: (Double, Double) => Unit,
      freezeRows: Double => Unit,
      freezeTopRow: () => Unit,
      unfreezePanes: () => Unit
    ): XLFreeze = {
      val __obj = js.Dynamic.literal(freezeColumns = js.Any.fromFunction1(freezeColumns), freezeLeftColumn = js.Any.fromFunction0(freezeLeftColumn), freezePanes = js.Any.fromFunction2(freezePanes), freezeRows = js.Any.fromFunction1(freezeRows), freezeTopRow = js.Any.fromFunction0(freezeTopRow), unfreezePanes = js.Any.fromFunction0(unfreezePanes))
      __obj.asInstanceOf[XLFreeze]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XLFreeze] (val x: Self) extends AnyVal {
      
      inline def setFreezeColumns(value: Double => Unit): Self = StObject.set(x, "freezeColumns", js.Any.fromFunction1(value))
      
      inline def setFreezeLeftColumn(value: () => Unit): Self = StObject.set(x, "freezeLeftColumn", js.Any.fromFunction0(value))
      
      inline def setFreezePanes(value: (Double, Double) => Unit): Self = StObject.set(x, "freezePanes", js.Any.fromFunction2(value))
      
      inline def setFreezeRows(value: Double => Unit): Self = StObject.set(x, "freezeRows", js.Any.fromFunction1(value))
      
      inline def setFreezeTopRow(value: () => Unit): Self = StObject.set(x, "freezeTopRow", js.Any.fromFunction0(value))
      
      inline def setUnfreezePanes(value: () => Unit): Self = StObject.set(x, "unfreezePanes", js.Any.fromFunction0(value))
    }
  }
  
  trait XLPivot extends StObject {
    
    /** This property is used to clear the pivot table list in Spreadsheet.
      * @param {string} Pass the name of the pivot table.
      * @returns {void}
      */
    def clearPivotFieldList(pivotName: String): Unit
    
    /** This method is used to create pivot table.
      * @param {string} It specifies the range for which the pivot table is created.
      * @param {string} It specifies the location in which the pivot table is created.
      * @param {string} It specifies the name of the pivot table.
      * @param {Spreadsheet.PivotOptions} Pass Object PivotOptions.
      * @param {any} Pass the pivot range, sheet index, address and data source .
      * @returns {string}
      */
    def createPivotTable(range: String, location: String, name: String, settings: PivotOptions, pvt: Any): String
    
    /** This method is used to delete the pivot table which is selected.
      * @param {string} Pass the name of the pivot table.
      * @returns {void}
      */
    def deletePivotTable(pivotName: String): Unit
    
    /** This method is used to refresh data in pivot table.
      * @param {string} Optional. Pass the name of the pivot table.
      * @param {number} Optional. Pass the index of the sheet.
      * @returns {void}
      */
    def refreshDataSource(name: String, sheetIdx: Double): Unit
  }
  object XLPivot {
    
    inline def apply(
      clearPivotFieldList: String => Unit,
      createPivotTable: (String, String, String, PivotOptions, Any) => String,
      deletePivotTable: String => Unit,
      refreshDataSource: (String, Double) => Unit
    ): XLPivot = {
      val __obj = js.Dynamic.literal(clearPivotFieldList = js.Any.fromFunction1(clearPivotFieldList), createPivotTable = js.Any.fromFunction5(createPivotTable), deletePivotTable = js.Any.fromFunction1(deletePivotTable), refreshDataSource = js.Any.fromFunction2(refreshDataSource))
      __obj.asInstanceOf[XLPivot]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XLPivot] (val x: Self) extends AnyVal {
      
      inline def setClearPivotFieldList(value: String => Unit): Self = StObject.set(x, "clearPivotFieldList", js.Any.fromFunction1(value))
      
      inline def setCreatePivotTable(value: (String, String, String, PivotOptions, Any) => String): Self = StObject.set(x, "createPivotTable", js.Any.fromFunction5(value))
      
      inline def setDeletePivotTable(value: String => Unit): Self = StObject.set(x, "deletePivotTable", js.Any.fromFunction1(value))
      
      inline def setRefreshDataSource(value: (String, Double) => Unit): Self = StObject.set(x, "refreshDataSource", js.Any.fromFunction2(value))
    }
  }
  
  trait XLPrint extends StObject {
    
    /** This method is used to print the selected contents in the Spreadsheet.
      * @returns {void}
      */
    def printSelection(): Unit
    
    /** This method is used to print the entire contents in the active sheet.
      * @returns {void}
      */
    def printSheet(): Unit
  }
  object XLPrint {
    
    inline def apply(printSelection: () => Unit, printSheet: () => Unit): XLPrint = {
      val __obj = js.Dynamic.literal(printSelection = js.Any.fromFunction0(printSelection), printSheet = js.Any.fromFunction0(printSheet))
      __obj.asInstanceOf[XLPrint]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XLPrint] (val x: Self) extends AnyVal {
      
      inline def setPrintSelection(value: () => Unit): Self = StObject.set(x, "printSelection", js.Any.fromFunction0(value))
      
      inline def setPrintSheet(value: () => Unit): Self = StObject.set(x, "printSheet", js.Any.fromFunction0(value))
    }
  }
  
  trait XLResize extends StObject {
    
    /** This method is used to fit the height of rows in the Spreadsheet.
      * @param {any[]} Optional. Pass row index collection that you want to fit its height.
      * @returns {void}
      */
    def fitHeight(rowIndexes: js.Array[Any]): Unit
    
    /** This method is used to fit the width of columns in the Spreadsheet.
      * @param {any[]} Optional. Pass column index collection that you want to fit its width.
      * @returns {void}
      */
    def fitWidth(colIndexes: js.Array[Any]): Unit
    
    /** This method is used to get the column width of the specified column index in the Spreadsheet.
      * @param {number} Pass the column index.
      * @returns {number}
      */
    def getColWidth(colIdx: Double): Double
    
    /** This method is used to get the row height of the specified row index in the Spreadsheet.
      * @param {number} Pass the row index which you want to find its height.
      * @returns {number}
      */
    def getRowHeight(rowIdx: Double): Double
    
    /** This method is used to set the column width of the specified column index in the Spreadsheet.
      * @param {number} Pass the column index.
      * @param {number} Pass the width value that you want to set.
      * @returns {void}
      */
    def setColWidth(colIdx: Double, size: Double): Unit
    
    /** This method is used to set the row height of the specified row index in the Spreadsheet.
      * @param {number} Pass the row index.
      * @param {number} Pass the height value that you want to set.
      * @returns {void}
      */
    def setRowHeight(rowIdx: Double, size: Double): Unit
  }
  object XLResize {
    
    inline def apply(
      fitHeight: js.Array[Any] => Unit,
      fitWidth: js.Array[Any] => Unit,
      getColWidth: Double => Double,
      getRowHeight: Double => Double,
      setColWidth: (Double, Double) => Unit,
      setRowHeight: (Double, Double) => Unit
    ): XLResize = {
      val __obj = js.Dynamic.literal(fitHeight = js.Any.fromFunction1(fitHeight), fitWidth = js.Any.fromFunction1(fitWidth), getColWidth = js.Any.fromFunction1(getColWidth), getRowHeight = js.Any.fromFunction1(getRowHeight), setColWidth = js.Any.fromFunction2(setColWidth), setRowHeight = js.Any.fromFunction2(setRowHeight))
      __obj.asInstanceOf[XLResize]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XLResize] (val x: Self) extends AnyVal {
      
      inline def setFitHeight(value: js.Array[Any] => Unit): Self = StObject.set(x, "fitHeight", js.Any.fromFunction1(value))
      
      inline def setFitWidth(value: js.Array[Any] => Unit): Self = StObject.set(x, "fitWidth", js.Any.fromFunction1(value))
      
      inline def setGetColWidth(value: Double => Double): Self = StObject.set(x, "getColWidth", js.Any.fromFunction1(value))
      
      inline def setGetRowHeight(value: Double => Double): Self = StObject.set(x, "getRowHeight", js.Any.fromFunction1(value))
      
      inline def setSetColWidth(value: (Double, Double) => Unit): Self = StObject.set(x, "setColWidth", js.Any.fromFunction2(value))
      
      inline def setSetRowHeight(value: (Double, Double) => Unit): Self = StObject.set(x, "setRowHeight", js.Any.fromFunction2(value))
    }
  }
  
  @js.native
  trait XLRibbon extends StObject {
    
    /** This method is used to add a new item in the backstage.
      * @param {Spreadsheet.BackstageOptions} Pass Object BackstageOptions.
      * @param {number} pass the index of the item to be added in the backstage.
      * @returns {void}
      */
    def addBackStageItem(pageItem: BackstageOptions, index: Double): Unit = js.native
    
    /** This method is used to dynamically add the contextual tabs in the ribbon.
      * @param {Spreadsheet.ContextualTabOptions} Pass Object ContextualTabOptions.
      * @param {number} pass the index of the contextual tab.
      * @returns {void}
      */
    def addContextualTabs(contextualTabSet: ContextualTabOptions, index: Double): Unit = js.native
    
    /** This method is used to dynamically add the menu item in the file menu.
      * @param {any[]} Specifies the item to be added
      * @param {number} pass the index of the menu item.
      * @returns {void}
      */
    def addMenuItem(item: js.Array[Any], index: Double): Unit = js.native
    
    /** This method is used to add a new name in the Spreadsheet name manager.
      * @param {string} Pass the name that you want to define in name manager.
      * @param {string} Pass the cell reference.
      * @param {string} Optional. Pass comment, if you want.
      * @param {number} Optional. Pass the sheet index.
      * @param {string} Optional. Pass the scope of the name manager.
      * @returns {void}
      */
    def addNamedRange(name: String, refersTo: String, comment: String, sheetIdx: Double, scope: String): Unit = js.native
    
    /** This method is used to dynamically add the tab in the ribbon.
      * @param {string} Specifies the text to be displayed in the tab.
      * @param {any[]} pass the groups to be displayed in the ribbon tab.
      * @param {number} pass the index of the tab.
      * @returns {void}
      */
    def addTab(tabText: String, ribbonGroups: js.Array[Any], index: Double): Unit = js.native
    
    /** This method is used to dynamically add the tab group in the ribbon.
      * @param {number} Specifies the ribbon tab index.
      * @param {Spreadsheet.TabOptions} Pass Object TabOptions.
      * @param {number} pass the index of the ribbon group.
      * @returns {void}
      */
    def addTabGroup(tabIndex: Double, tabGroup: TabOptions, groupIndex: Double): Unit = js.native
    
    /** This method is used to insert the few type (SUM, MAX, MIN, AVG, COUNT) of formulas in the selected range of cells in the Spreadsheet.
      * @param {string} To pass the type("SUM","MAX","MIN","AVG","COUNT").
      * @param {string|any[]} If range is specified, it will apply auto sum for the specified range else it will use the current selected range.
      * @returns {void}
      */
    def autoSum(`type`: String, range: String): Unit = js.native
    def autoSum(`type`: String, range: js.Array[Any]): Unit = js.native
    
    /** This method is used to hide the file menu in the ribbon tab.
      * @returns {void}
      */
    def hideMenu(): Unit = js.native
    
    /** This method is used to remove the item from the backstage in the spreadsheet.
      * @param {number} Specifies the index of the item to be removed from backstage.
      * @returns {void}
      */
    def removeBackStageItem(index: Double): Unit = js.native
    
    /** This method is used to remove the menu item form file menu in spreadsheet.
      * @param {number} Specifies the index of the item to be removed from the file menu.
      * @returns {void}
      */
    def removeMenuItem(index: Double): Unit = js.native
    
    /** This method is used to delete the defined name in the Spreadsheet name manager.
      * @param {string} Pass the defined name that you want to remove from name manager.
      * @param {string} Optional. Pass the scope of the name manager.
      * @returns {void}
      */
    def removeNamedRange(name: String, scope: String): Unit = js.native
    
    /** This method is used to remove the tab form ribbon in the spreadsheet.
      * @param {number} Specifies the index of the tab to be removed from the ribbon.
      * @param {boolean} pass the boolean value to remove the tab from ribbon
      * @returns {void}
      */
    def removeTab(index: Double, isRemoveMenu: Boolean): Unit = js.native
    
    /** This method is used to remove the tab group form ribbon in the spreadsheet.
      * @param {number} Specifies the index of the tab group to be removed from the ribbon.
      * @param {string} Specifies the text to be displayed in the tab group
      * @returns {void}
      */
    def removeTabGroup(tabIndex: Double, groupText: String): Unit = js.native
    
    /** This method is used to show the file menu in the ribbon tab.
      * @returns {void}
      */
    def showMenu(): Unit = js.native
    
    /** This method is used to update the menu item in the file menu.
      * @param {Spreadsheet.MenuItemOptions} Pass Object MenuItemOptions.
      * @param {number} pass the index of the item to be updated
      * @returns {void}
      */
    def updateMenuItem(item: MenuItemOptions, index: Double): Unit = js.native
    
    /** This method is used to update the ribbon icons in the Spreadsheet.
      * @returns {void}
      */
    def updateRibbonIcons(): Unit = js.native
  }
  
  trait XLScroll extends StObject {
    
    /** This method is used to scroll the sheet content to the specified cell address in the Spreadsheet.
      * @param {string} Pass the cell address that you want to scroll to it.
      * @returns {void}
      */
    def scrollToCell(range: String): Unit
  }
  object XLScroll {
    
    inline def apply(scrollToCell: String => Unit): XLScroll = {
      val __obj = js.Dynamic.literal(scrollToCell = js.Any.fromFunction1(scrollToCell))
      __obj.asInstanceOf[XLScroll]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XLScroll] (val x: Self) extends AnyVal {
      
      inline def setScrollToCell(value: String => Unit): Self = StObject.set(x, "scrollToCell", js.Any.fromFunction1(value))
    }
  }
  
  trait XLSearch extends StObject {
    
    /** This method is used to find and replace all data by workbook in the Spreadsheet.
      * @param {string} Pass the search data.
      * @param {string} Pass the replace data.
      * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with case-sensitive.
      * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with entire cell contents.
      * @returns {void}
      */
    def replaceAllByBook(findData: String, replaceData: String, isCSen: Boolean, isEMatch: Boolean): Unit
    
    /** This method is used to find and replace all data by sheet in Spreadsheet.
      * @param {string} Pass the search data.
      * @param {string} Pass the replace data.
      * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with case-sensitive.
      * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to match with entire cell contents.
      * @returns {void}
      */
    def replaceAllBySheet(findData: String, replaceData: String, isCSen: Boolean, isEMatch: Boolean): Unit
  }
  object XLSearch {
    
    inline def apply(
      replaceAllByBook: (String, String, Boolean, Boolean) => Unit,
      replaceAllBySheet: (String, String, Boolean, Boolean) => Unit
    ): XLSearch = {
      val __obj = js.Dynamic.literal(replaceAllByBook = js.Any.fromFunction4(replaceAllByBook), replaceAllBySheet = js.Any.fromFunction4(replaceAllBySheet))
      __obj.asInstanceOf[XLSearch]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XLSearch] (val x: Self) extends AnyVal {
      
      inline def setReplaceAllByBook(value: (String, String, Boolean, Boolean) => Unit): Self = StObject.set(x, "replaceAllByBook", js.Any.fromFunction4(value))
      
      inline def setReplaceAllBySheet(value: (String, String, Boolean, Boolean) => Unit): Self = StObject.set(x, "replaceAllBySheet", js.Any.fromFunction4(value))
    }
  }
  
  @js.native
  trait XLSelection extends StObject {
    
    /** This method is used to clear the selection of the active sheet in the Spreadsheet.
      * @returns {void}
      */
    def clearAll(): Unit = js.native
    
    /** This method is used to get the selected cells element based on specified sheet index in the Spreadsheet.
      * @param {number} Pass the sheet index to get the cells element.
      * @returns {HTMLElement}
      */
    def getSelectedCells(sheetIdx: Double): HTMLElement = js.native
    
    def refreshSelection(range: String): Unit = js.native
    /** This method is used to refresh the selection in the Spreadsheet.
      * @param {any[]|string} Optional. Pass range to refresh selection.
      * @returns {void}
      */
    def refreshSelection(range: js.Array[Any]): Unit = js.native
    
    /** This method is used to select a single column in the Spreadsheet.
      * @param {number} Pass the column index value.
      * @returns {void}
      */
    def selectColumn(colIdx: Double): Unit = js.native
    
    /** This method is used to select entire columns in a specified range (start index and end index) in the Spreadsheet.
      * @param {number} Pass the column start index.
      * @param {number} Pass the column end index.
      * @returns {void}
      */
    def selectColumns(startIdx: Double, endIdx: Double): Unit = js.native
    
    /** This method is used to select the specified range of cells in the Spreadsheet.
      * @param {string} Pass range which want to select.
      * @returns {void}
      */
    def selectRange(range: String): Unit = js.native
    
    /** This method is used to select a single row in the Spreadsheet.
      * @param {number} Pass the row index value.
      * @returns {void}
      */
    def selectRow(rowIdx: Double): Unit = js.native
    
    /** This method is used to select entire rows in a specified range (start index and end index) in the Spreadsheet.
      * @param {number} Pass the start row index.
      * @param {number} Pass the end row index.
      * @returns {void}
      */
    def selectRows(startIdx: Double, endIdx: Double): Unit = js.native
    
    /** This method is used to select all cells in active sheet.
      * @returns {void}
      */
    def selectSheet(): Unit = js.native
  }
  
  trait XLShape extends StObject {
    
    /** This method is used to set a picture in the Spreadsheet.
      * @param {string} Pass the range of the cell.
      * @param {string} Pass the path of the specified image.
      * @param {number} Optional. Pass the width of the image that you want to set.
      * @param {number} Optional. Pass the height of the image that you want to set.
      * @param {number} Optional. Pass the top of the image that you want to set.
      * @param {number} Optional. Pass the left of the image that you want to set.
      * @returns {string}
      */
    def setPicture(range: String, url: String, width: Double, height: Double, top: Double, left: Double): String
  }
  object XLShape {
    
    inline def apply(setPicture: (String, String, Double, Double, Double, Double) => String): XLShape = {
      val __obj = js.Dynamic.literal(setPicture = js.Any.fromFunction6(setPicture))
      __obj.asInstanceOf[XLShape]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XLShape] (val x: Self) extends AnyVal {
      
      inline def setSetPicture(value: (String, String, Double, Double, Double, Double) => String): Self = StObject.set(x, "setPicture", js.Any.fromFunction6(value))
    }
  }
  
  @js.native
  trait XLSort extends StObject {
    
    /** This method is used to sort a particular range of cells based on its cell or font color in the Spreadsheet.
      * @param {string} Pass {{'`PutCellColor`' | markdownify}} to sort by cell color or {{'`PutFontColor`' | markdownify}} for sort by font color.
      * @param {Spreadsheet.ColorOptions} Pass Object ColorOptions.
      * @param {string} Pass the range
      * @returns {void}
      */
    def sortByColor(operation: String, color: ColorOptions, range: String): Unit = js.native
    
    def sortByRange(range: String, columnName: String, direction: String): Boolean = js.native
    /** This method is used to sort a particular range of cells based on its values in the Spreadsheet.
      * @param {any[]|string} Pass the range to sort.
      * @param {string} Pass the column name.
      * @param {string} Pass the direction to sort
      * @returns {boolean}
      */
    def sortByRange(range: js.Array[Any], columnName: String, direction: String): Boolean = js.native
  }
  
  trait XLSparkline extends StObject {
    
    /** This method used to change the sparkline color and marker point color in the spreadsheet.
      * @param {string} Pass the sparkline ID
      * @param {any}  pass the high point color as object.
      * @param {number} Optional. Pass the sheet index
      * @returns {void}
      */
    def changePointColor(sparklineId: String, option: Any, sheetIdx: Double): Unit
    
    /** This method used to change the sparkline type in the spreadsheet.
      * @param {string} Pass the sparkline ID
      * @param {string} Pass the sparkline type
      * @param {number} Optional. Pass the sheet index
      * @returns {void}
      */
    def changeType(sparklineId: String, `type`: String, sheetIdx: Double): Unit
    
    /** This method used for creating the sparkline chart for specified range in spreadsheet.
      * @param {string} Pass the data range
      * @param {string} Pass the location range
      * @param {string} Pass the sparkline chart type
      * @param {Spreadsheet.SparklineOptions} Pass Object SparklineOptions.
      * @param {number} Pass the sheetIndex
      * @returns {void}
      */
    def createSparkline(
      dataRange: String,
      locationRange: String,
      `type`: String,
      options: SparklineOptions,
      sheetIndex: Double
    ): Unit
  }
  object XLSparkline {
    
    inline def apply(
      changePointColor: (String, Any, Double) => Unit,
      changeType: (String, String, Double) => Unit,
      createSparkline: (String, String, String, SparklineOptions, Double) => Unit
    ): XLSparkline = {
      val __obj = js.Dynamic.literal(changePointColor = js.Any.fromFunction3(changePointColor), changeType = js.Any.fromFunction3(changeType), createSparkline = js.Any.fromFunction5(createSparkline))
      __obj.asInstanceOf[XLSparkline]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: XLSparkline] (val x: Self) extends AnyVal {
      
      inline def setChangePointColor(value: (String, Any, Double) => Unit): Self = StObject.set(x, "changePointColor", js.Any.fromFunction3(value))
      
      inline def setChangeType(value: (String, String, Double) => Unit): Self = StObject.set(x, "changeType", js.Any.fromFunction3(value))
      
      inline def setCreateSparkline(value: (String, String, String, SparklineOptions, Double) => Unit): Self = StObject.set(x, "createSparkline", js.Any.fromFunction5(value))
    }
  }
  
  @js.native
  trait XLValidate extends StObject {
    
    /** This method is used to apply data validation rules in a selected range of cells based on the defined condition in the Spreadsheet.
      * @param {string|any[]} If range is specified, it will apply rules for the specified range else it will use the current selected range.
      * @param {any[]} Pass the validation condition, value1 and value2.
      * @param {string} Pass the data type.
      * @param {boolean} Pass {{'`true`' | markdownify}} if you ignore blank values.
      * @param {boolean} Pass {{'`true`' | markdownify}} if you want to show an error alert.
      * @returns {void}
      */
    def applyDVRules(range: String, values: js.Array[Any], `type`: String, required: Boolean, showErrorAlert: Boolean): Unit = js.native
    def applyDVRules(
      range: js.Array[Any],
      values: js.Array[Any],
      `type`: String,
      required: Boolean,
      showErrorAlert: Boolean
    ): Unit = js.native
    
    /** This method is used to clear the applied validation rules in a specified range of cells in the Spreadsheet.
      * @param {string|any[]} Optional. If range is specified, it will clear rules for the specified range else it will use the current selected range.
      * @returns {void}
      */
    def clearDV(range: String): Unit = js.native
    def clearDV(range: js.Array[Any]): Unit = js.native
    
    /** This method is used to highlight invalid data in a specified range of cells in the Spreadsheet.
      * @param {string|any[]} Optional. If range is specified, it will clear rules for the specified range else it will use the current selected range.
      * @returns {void}
      */
    def highlightInvalidData(range: String): Unit = js.native
    def highlightInvalidData(range: js.Array[Any]): Unit = js.native
  }
}
