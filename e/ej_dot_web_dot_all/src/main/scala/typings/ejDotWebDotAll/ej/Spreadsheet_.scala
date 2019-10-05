package typings.ejDotWebDotAll.ej

import typings.ejDotWebDotAll.JQuery
import typings.ejDotWebDotAll.ej.Spreadsheet.BorderOptions
import typings.ejDotWebDotAll.ej.Spreadsheet.CellIndex
import typings.ejDotWebDotAll.ej.Spreadsheet.DataOptions
import typings.ejDotWebDotAll.ej.Spreadsheet.ImportingOptions
import typings.ejDotWebDotAll.ej.Spreadsheet.LinkOptions
import typings.ejDotWebDotAll.ej.Spreadsheet.RangeOptions
import typings.ejDotWebDotAll.ej.Spreadsheet.UndoRedoOptions
import typings.ejDotWebDotAll.ej.Spreadsheet.XLCFormat
import typings.ejDotWebDotAll.ej.Spreadsheet.XLCMenu
import typings.ejDotWebDotAll.ej.Spreadsheet.XLCellType
import typings.ejDotWebDotAll.ej.Spreadsheet.XLChart
import typings.ejDotWebDotAll.ej.Spreadsheet.XLClipboard
import typings.ejDotWebDotAll.ej.Spreadsheet.XLComment
import typings.ejDotWebDotAll.ej.Spreadsheet.XLDragDrop
import typings.ejDotWebDotAll.ej.Spreadsheet.XLDragFill
import typings.ejDotWebDotAll.ej.Spreadsheet.XLEdit
import typings.ejDotWebDotAll.ej.Spreadsheet.XLExport
import typings.ejDotWebDotAll.ej.Spreadsheet.XLFilter
import typings.ejDotWebDotAll.ej.Spreadsheet.XLFormat
import typings.ejDotWebDotAll.ej.Spreadsheet.XLFreeze
import typings.ejDotWebDotAll.ej.Spreadsheet.XLPivot
import typings.ejDotWebDotAll.ej.Spreadsheet.XLPrint
import typings.ejDotWebDotAll.ej.Spreadsheet.XLResize
import typings.ejDotWebDotAll.ej.Spreadsheet.XLRibbon
import typings.ejDotWebDotAll.ej.Spreadsheet.XLScroll
import typings.ejDotWebDotAll.ej.Spreadsheet.XLSearch
import typings.ejDotWebDotAll.ej.Spreadsheet.XLSelection
import typings.ejDotWebDotAll.ej.Spreadsheet.XLShape
import typings.ejDotWebDotAll.ej.Spreadsheet.XLSort
import typings.ejDotWebDotAll.ej.Spreadsheet.XLSparkline
import typings.ejDotWebDotAll.ej.Spreadsheet.XLValidate
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Spreadsheet")
@js.native
class Spreadsheet_ protected () extends Widget {
  def this(element: JQuery) = this()
  def this(element: Element) = this()
  def this(element: JQuery, options: typings.ejDotWebDotAll.ej.Spreadsheet.Model) = this()
  def this(element: Element, options: typings.ejDotWebDotAll.ej.Spreadsheet.Model) = this()
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
  var defaults: typings.ejDotWebDotAll.ej.Spreadsheet.Model = js.native
  @JSName("model")
  var model_Spreadsheet_ : typings.ejDotWebDotAll.ej.Spreadsheet.Model = js.native
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
  def clearAll(range: js.Array[_]): Unit = js.native
  /** This property is used to clear all the formats applied in the specified range in Spreadsheet.
    * @param {string|any[]} Optional. If range is specified, then it will clear all format in the specified range else it will use the current selected range.
    * @returns {void}
    */
  def clearAllFormat(): Unit = js.native
  def clearAllFormat(range: String): Unit = js.native
  def clearAllFormat(range: js.Array[_]): Unit = js.native
  /** Used to clear the applied border in the specified range in Spreadsheet.
    * @param {string|any[]} Optional. If range is specified, then it will clear border in the specified range else it will use the current selected range.
    * @returns {void}
    */
  def clearBorder(): Unit = js.native
  def clearBorder(range: String): Unit = js.native
  def clearBorder(range: js.Array[_]): Unit = js.native
  /** This property is used to clear the contents in the specified range in Spreadsheet.
    * @param {string|any[]} Optional. If the range is specified, then it will clear the content in the specified range else it will use the current selected range.
    * @returns {void}
    */
  def clearContents(): Unit = js.native
  def clearContents(range: String): Unit = js.native
  def clearContents(range: js.Array[_]): Unit = js.native
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
    range: js.UndefOr[js.Array[_] | String],
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
  def getActiveCell(): js.Any = js.native
  def getActiveCell(sheetIdx: Double): js.Any = js.native
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
  def getHyperlink(cell: HTMLElement): js.Any = js.native
  /** This method is used to get the keys from the given object in Spreadsheet.
    * @param {any} Pass the Object
    * @returns {any[]}
    */
  def getObjectKeys(obj: js.Any): js.Array[_] = js.native
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
  def getRangeData(): js.Array[_] = js.native
  def getRangeData(options: js.Any): js.Array[_] = js.native
  /** This method is used to get the data as object in the specified range.
    * @param {Spreadsheet.CellIndex} Pass the Object "CellIndex"
    * @param {Spreadsheet.CellIndex} Pass the Object "CellIndex"
    * @param {boolean} Optional. Pass {{'`true`' | markdownify}}, if you want to skip the hidden rows.
    * @returns {any}
    */
  def getRangeDataAsObject(startcell: CellIndex, endcell: CellIndex): js.Any = js.native
  def getRangeDataAsObject(startcell: CellIndex, endcell: CellIndex, skipHiddenRow: Boolean): js.Any = js.native
  /** This method is used to get the range indices array based on the specified alpha range in Spreadsheet.
    * @param {string} Pass the alpha range that you want to get range indices.
    * @returns {any[]}
    */
  def getRangeIndices(range: String): js.Array[_] = js.native
  /** This method is used to get the sheet details based on the given sheet index in Spreadsheet.
    * @param {number} Pass the sheet index to get the sheet object.
    * @returns {any}
    */
  def getSheet(sheetIdx: Double): js.Any = js.native
  /** This method is used to get the sheet content div element of Spreadsheet.
    * @param {number} Pass the sheet index to get the sheet content.
    * @returns {HTMLElement}
    */
  def getSheetElement(sheetIdx: Double): HTMLElement = js.native
  /** This method is used to get all the sheets in workbook.
    * @returns {any[]}
    */
  def getSheets(): js.Array[_] = js.native
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
  def lockCells(range: js.Array[_]): Unit = js.native
  def lockCells(range: js.Array[_], isLocked: String): Unit = js.native
  /** This method is used to merge cells by across in the Spreadsheet.
    * @param {string} Optional. To pass the cell range or selected cells are process.
    * @param {boolean} Optional. If pass {{'`true`' | markdownify}} it does not show alert.
    * @returns {void}
    */
  def mergeAcrossCells(): Unit = js.native
  def mergeAcrossCells(range: String): Unit = js.native
  def mergeAcrossCells(range: String, alertStatus: Boolean): Unit = js.native
  /** This method is used to merge the selected cells in the Spreadsheet.
    * @param {string|any[]} Optional. To pass the cell range or selected cells are process.
    * @param {boolean} Optional. If pass {{'`true`' | markdownify}} it does not show alert.
    * @returns {void}
    */
  def mergeCells(): Unit = js.native
  def mergeCells(range: String): Unit = js.native
  def mergeCells(range: String, alertStatus: Boolean): Unit = js.native
  def mergeCells(range: js.Array[_]): Unit = js.native
  def mergeCells(range: js.Array[_], alertStatus: Boolean): Unit = js.native
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
  def removeHyperlink(range: String, isClearHLink: Boolean, status: Boolean, cells: js.Array[_]): Unit = js.native
  def removeHyperlink(range: String, isClearHLink: Boolean, status: Boolean, cells: js.Array[_], skipHiddenRow: Boolean): Unit = js.native
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
  def removeReadOnly(range: js.Array[_]): Unit = js.native
  /** This method is used to save JSON data in Spreadsheet.
    * @returns {any}
    */
  def saveAsJSON(): js.Any = js.native
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
  def setHeightToRows(heightColl: js.Any): Unit = js.native
  /** This method is used to set the height for the rows in the Spreadsheet.
    * @param {any[]|any} Pass the row index and height of the rows.
    * @returns {void}
    */
  def setHeightToRows(heightColl: js.Array[_]): Unit = js.native
  /** This method is used to set the hyperlink in selected cells of the current sheet.
    * @param {string|any[]} If range is specified, it will set the hyperlink in range of the cells.
    * @param {Spreadsheet.LinkOptions} Pass the Object "LinkOptions"
    * @param {number} If we pass cellAddress then which sheet to be navigate in the applied link.
    * @returns {void}
    */
  def setHyperlink(range: String, link: LinkOptions, sheetIdx: Double): Unit = js.native
  def setHyperlink(range: js.Array[_], link: LinkOptions, sheetIdx: Double): Unit = js.native
  /** This method is used to set the readonly option for the specified range.
    * @param {string|any[]} Pass the range.
    * @returns {void}
    */
  def setReadOnly(): Unit = js.native
  def setReadOnly(range: String): Unit = js.native
  def setReadOnly(range: js.Array[_]): Unit = js.native
  /** This method is used to set the focus to the Spreadsheet.
    * @returns {void}
    */
  def setSheetFocus(): Unit = js.native
  def setWidthToColumns(widthColl: js.Any): Unit = js.native
  def setWidthToColumns(widthColl: js.Any, sheetIndex: Double): Unit = js.native
  /** This method is used to set the width for the columns in the Spreadsheet.
    * @param {any[]|any} Pass the column index and width of the columns.
    * @param {number} Optional. If sheetIdx is specified, it will set the width for columns to the specified sheet else it will use active sheet.
    * @returns {void}
    */
  def setWidthToColumns(widthColl: js.Array[_]): Unit = js.native
  def setWidthToColumns(widthColl: js.Array[_], sheetIndex: Double): Unit = js.native
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
  def unWrapText(range: js.Array[_]): Unit = js.native
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
  def updateData(data: DataOptions, range: js.Array[_]): Unit = js.native
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
  def updateUniqueData(data: DataOptions, range: js.Array[_]): Unit = js.native
  def updateUniqueData(data: DataOptions, range: js.Array[_], skipCell: Boolean): Unit = js.native
  /** This method is used to wrap the selected range of cells in the Spreadsheet.
    * @param {any[]|string} Optional. If the range is specified, then it will update wrap in the specified  range else it will use the current selected range.
    * @returns {void}
    */
  def wrapText(): Unit = js.native
  def wrapText(range: String): Unit = js.native
  def wrapText(range: js.Array[_]): Unit = js.native
}

