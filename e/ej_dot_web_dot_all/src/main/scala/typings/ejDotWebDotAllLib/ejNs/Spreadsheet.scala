package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("ej.Spreadsheet")
@js.native
class Spreadsheet protected () extends Widget {
  def this(element: ejDotWebDotAllLib.JQuery) = this()
  def this(element: stdLib.Element) = this()
  def this(element: ejDotWebDotAllLib.JQuery, options: ejDotWebDotAllLib.ejNs.SpreadsheetNs.Model) = this()
  def this(element: stdLib.Element, options: ejDotWebDotAllLib.ejNs.SpreadsheetNs.Model) = this()
  var XLCFormat: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLCFormat = js.native
  var XLCMenu: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLCMenu = js.native
  var XLCellType: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLCellType = js.native
  var XLChart: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLChart = js.native
  var XLClipboard: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLClipboard = js.native
  var XLComment: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLComment = js.native
  var XLDragDrop: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLDragDrop = js.native
  var XLDragFill: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLDragFill = js.native
  var XLEdit: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLEdit = js.native
  var XLExport: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLExport = js.native
  var XLFilter: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLFilter = js.native
  var XLFormat: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLFormat = js.native
  var XLFreeze: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLFreeze = js.native
  var XLPivot: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLPivot = js.native
  var XLPrint: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLPrint = js.native
  var XLResize: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLResize = js.native
  var XLRibbon: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLRibbon = js.native
  var XLScroll: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLScroll = js.native
  var XLSearch: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLSearch = js.native
  var XLSelection: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLSelection = js.native
  var XLShape: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLShape = js.native
  var XLSort: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLSort = js.native
  var XLSparkline: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLSparkline = js.native
  var XLValidate: ejDotWebDotAllLib.ejNs.SpreadsheetNs.XLValidate = js.native
  var defaults: ejDotWebDotAllLib.ejNs.SpreadsheetNs.Model = js.native
  @JSName("model")
  var model_Spreadsheet: ejDotWebDotAllLib.ejNs.SpreadsheetNs.Model = js.native
  /** This method is used to add custom formulas in Spreadsheet.
    * @param {string} Pass the name of the formula.
    * @param {string} Pass the name of the function.
    * @returns {void}
    */
  def addCustomFormula(formulaName: java.lang.String, functionName: java.lang.String): scala.Unit = js.native
  /** This method is used to add a new sheet in the last position of the sheet container.
    * @returns {void}
    */
  def addNewSheet(): scala.Unit = js.native
  /** This method is used to blank the workbook in Spreadsheet.
    * @returns {void}
    */
  def blankWorkbook(): scala.Unit = js.native
  /** It is used to clear all the data and format in the specified range of cells in Spreadsheet.
    * @param {string|any[]} Optional. If range is specified, then it will clear all content in the specified range else it will use the current selected range.
    * @returns {void}
    */
  def clearAll(): scala.Unit = js.native
  def clearAll(range: java.lang.String): scala.Unit = js.native
  def clearAll(range: js.Array[_]): scala.Unit = js.native
  /** This property is used to clear all the formats applied in the specified range in Spreadsheet.
    * @param {string|any[]} Optional. If range is specified, then it will clear all format in the specified range else it will use the current selected range.
    * @returns {void}
    */
  def clearAllFormat(): scala.Unit = js.native
  def clearAllFormat(range: java.lang.String): scala.Unit = js.native
  def clearAllFormat(range: js.Array[_]): scala.Unit = js.native
  /** Used to clear the applied border in the specified range in Spreadsheet.
    * @param {string|any[]} Optional. If range is specified, then it will clear border in the specified range else it will use the current selected range.
    * @returns {void}
    */
  def clearBorder(): scala.Unit = js.native
  def clearBorder(range: java.lang.String): scala.Unit = js.native
  def clearBorder(range: js.Array[_]): scala.Unit = js.native
  /** This property is used to clear the contents in the specified range in Spreadsheet.
    * @param {string|any[]} Optional. If the range is specified, then it will clear the content in the specified range else it will use the current selected range.
    * @returns {void}
    */
  def clearContents(): scala.Unit = js.native
  def clearContents(range: java.lang.String): scala.Unit = js.native
  def clearContents(range: js.Array[_]): scala.Unit = js.native
  /** This method is used to remove only the data in the range denoted by the specified range name.
    * @param {string} Pass the defined rangeSettings property name.
    * @returns {void}
    */
  def clearRange(rangeName: java.lang.String): scala.Unit = js.native
  /** It is used to remove data in the specified range of cells based on the defined property.
    * @param {any[]|string} Optional. If range is specified, it will clear data for the specified range else it will use the current selected range.
    * @param {string} Optional. If property is specified, it will remove the specified property in the range else it will remove default properties
    * @param {any} Optional.
    * @param {boolean} Optional. pass {{'`true`' | markdownify}}, if you want to skip the hidden rows
    * @param {any} Optional. Pass the status to perform undo and redo operation.
    * @param {any} Optional. It specifies whether to skip element processing or not.
    * @returns {void}
    */
  def clearRangeData(
    range: js.UndefOr[js.Array[_] | java.lang.String],
    property: js.UndefOr[java.lang.String],
    cells: js.UndefOr[js.Any],
    skipHiddenRow: js.UndefOr[scala.Boolean],
    status: js.UndefOr[js.Any],
    skipCell: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  /** This method is used to clear undo and redo collections in the Spreadsheet.
    * @returns {void}
    */
  def clearUndoRedo(): scala.Unit = js.native
  /** This method is used to copy or move the sheets in Spreadsheet.
    * @param {number} Pass the sheet index that you want to copy or move.
    * @param {number} Pass the position index where you want to copy or move.
    * @param {boolean} Pass {{'`true`' | markdownify}},If you want to copy sheet or else it will move sheet.
    * @returns {void}
    */
  def copySheet(fromIdx: scala.Double, toIdx: scala.Double, isCopySheet: scala.Boolean): scala.Unit = js.native
  /** This method is used to delete the entire column which is selected.
    * @param {number} Pass the start column index.
    * @param {number} Pass the end column index.
    * @returns {void}
    */
  def deleteEntireColumn(startCol: scala.Double, endCol: scala.Double): scala.Unit = js.native
  /** This method is used to delete the entire row which is selected.
    * @param {number} Pass the start row index.
    * @param {number} Pass the end row index.
    * @returns {void}
    */
  def deleteEntireRow(startRow: scala.Double, endRow: scala.Double): scala.Unit = js.native
  /** This method is used to delete a particular sheet in the Spreadsheet.
    * @param {number} Pass the sheet index to perform delete action.
    * @returns {void}
    */
  def deleteSheet(idx: scala.Double): scala.Unit = js.native
  /** This method is used to delete the selected cells and shift the remaining cells to left.
    * @param {any} Row index and column index of the starting cell.
    * @param {any} Row index and column index of the ending cell.
    * @returns {void}
    */
  def deleteShiftLeft(startCell: js.Any, endCell: js.Any): scala.Unit = js.native
  /** This method is used to delete the selected cells and shift the remaining cells up.
    * @param {any} Row index and column index of the start cell.
    * @param {any} Row index and column index of the end cell.
    * @returns {void}
    */
  def deleteShiftUp(startCell: js.Any, endCell: js.Any): scala.Unit = js.native
  /** This method is used to edit data in the specified range of cells based on its corresponding rangeSettings.
    * @param {string} Pass the defined rangeSettings property name.
    * @param {() => void} Pass the function that you want to perform range edit.
    * @returns {void}
    */
  def editRange(rangeName: java.lang.String, fn: js.Function0[scala.Unit]): scala.Unit = js.native
  /** This method is used to get the activation panel in the Spreadsheet.
    * @returns {HTMLElement}
    */
  def getActivationPanel(): stdLib.HTMLElement = js.native
  /** This method is used to get the active cell object in Spreadsheet. It will returns object which contains rowIndex and colIndex of the active cell.
    * @param {number} Optional. If sheetIdx is specified, it will return the active cell object in specified sheet index else it will use the current sheet index
    * @returns {any}
    */
  def getActiveCell(): js.Any = js.native
  def getActiveCell(sheetIdx: scala.Double): js.Any = js.native
  /** This method is used to get the active cell element based on the given sheet index in the Spreadsheet.
    * @param {number} Optional. If sheetIndex is specified, it will return the active cell element in specified sheet index else it will use the current active sheet index.
    * @returns {HTMLElement}
    */
  def getActiveCellElem(): stdLib.HTMLElement = js.native
  def getActiveCellElem(sheetIdx: scala.Double): stdLib.HTMLElement = js.native
  /** This method is used to get the current active sheet index in Spreadsheet.
    * @returns {number}
    */
  def getActiveSheetIndex(): scala.Double = js.native
  /** This method is used to get the alpha range of the given index in Spreadsheet.
    * @param {number} Pass the start row index.
    * @param {number} Pass the start column index.
    * @param {number} Pass the end row index.
    * @param {number} Pass the end column index.
    * @returns {String}
    */
  def getAlphaRange(sRIndex: scala.Double, sCIndex: scala.Double, eRIndex: scala.Double, eCIndex: scala.Double): java.lang.String = js.native
  /** This method is used to get the auto fill element in Spreadsheet.
    * @returns {HTMLElement}
    */
  def getAutoFillElem(): stdLib.HTMLElement = js.native
  /** This method is used to get the cell element based on specified row and column index in the Spreadsheet.
    * @param {number} Pass the row index.
    * @param {number} Pass the column index.
    * @param {number} Optional. Pass the sheet index that you want to get cell.
    * @returns {HTMLElement}
    */
  def getCell(rowIdx: scala.Double, colIdx: scala.Double): stdLib.HTMLElement = js.native
  def getCell(rowIdx: scala.Double, colIdx: scala.Double, sheetIdx: scala.Double): stdLib.HTMLElement = js.native
  /** This method is used to get the data settings in the Spreadsheet.
    * @param {number} Pass the sheet index.
    * @returns {number}
    */
  def getDataSettings(sheetIdx: scala.Double): scala.Double = js.native
  /** This method is used to get the export properties in the Spreadsheet.
    * @returns {any}
    */
  def getExportProps(): js.Any = js.native
  /** This method is used to get the frozen columns index in the Spreadsheet.
    * @param {number} Pass the sheet index.
    * @returns {number}
    */
  def getFrozenColumns(sheetIdx: scala.Double): scala.Double = js.native
  /** This method is used to get the frozen row index in Spreadsheet.
    * @param {number} Pass the sheet index.
    * @returns {number}
    */
  def getFrozenRows(sheetIdx: scala.Double): scala.Double = js.native
  /** This method is used to get the hyperlink data as object from the specified cell in Spreadsheet.
    * @param {HTMLElement} Pass the DOM element to get hyperlink
    * @returns {any}
    */
  def getHyperlink(cell: stdLib.HTMLElement): js.Any = js.native
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
  def getRange(range: java.lang.String, sheetIdx: scala.Double): stdLib.HTMLElement = js.native
  def getRange(range: java.lang.String, sheetIdx: scala.Double, skipHiddenRow: scala.Boolean): stdLib.HTMLElement = js.native
  /** This method is used to get the data in specified range in Spreadsheet.
    * @param {any} Optional. Pass the range, property, sheetIdx, valueOnly in options.
    * @returns {any[]}
    */
  def getRangeData(): js.Array[_] = js.native
  def getRangeData(options: js.Any): js.Array[_] = js.native
  /** This method is used to get the data as object in the specified range.
    * @param {any} Pass the start cell.
    * @param {any} Pass the end cell.
    * @param {boolean} Optional. Pass {{'`true`' | markdownify}}, if you want to skip the hidden rows.
    * @returns {any}
    */
  def getRangeDataAsObject(startcell: js.Any, endcell: js.Any): js.Any = js.native
  def getRangeDataAsObject(startcell: js.Any, endcell: js.Any, skipHiddenRow: scala.Boolean): js.Any = js.native
  /** This method is used to get the range indices array based on the specified alpha range in Spreadsheet.
    * @param {string} Pass the alpha range that you want to get range indices.
    * @returns {any[]}
    */
  def getRangeIndices(range: java.lang.String): js.Array[_] = js.native
  /** This method is used to get the sheet details based on the given sheet index in Spreadsheet.
    * @param {number} Pass the sheet index to get the sheet object.
    * @returns {any}
    */
  def getSheet(sheetIdx: scala.Double): js.Any = js.native
  /** This method is used to get the sheet content div element of Spreadsheet.
    * @param {number} Pass the sheet index to get the sheet content.
    * @returns {HTMLElement}
    */
  def getSheetElement(sheetIdx: scala.Double): stdLib.HTMLElement = js.native
  /** This method is used to get all the sheets in workbook.
    * @returns {any[]}
    */
  def getSheets(): js.Array[_] = js.native
  /** This method is used to send a paging request to the specified sheet Index in the Spreadsheet.
    * @param {number} Pass the sheet index to perform paging at specified sheet index
    * @param {boolean} Pass {{'`true`' | markdownify}} to create a new sheet. If the specified sheet index is already exist, it navigate to that sheet else it create a new sheet.
    * @returns {void}
    */
  def gotoPage(sheetIdx: scala.Double, newSheet: scala.Boolean): scala.Unit = js.native
  /** This method is used to hide the pivot table activationPanel in the Spreadsheet.
    * @returns {void}
    */
  def hideActivationPanel(): scala.Unit = js.native
  /** This method is used to hide the entire columns from the specified range (startCol, endCol) in Spreadsheet.
    * @param {number} Index of the start column.
    * @param {number} Optional. Index of the end column.
    * @returns {void}
    */
  def hideColumn(startCol: scala.Double, endCol: scala.Double): scala.Unit = js.native
  /** This method is used to hide the formula bar in Spreadsheet.
    * @returns {void}
    */
  def hideFormulaBar(): scala.Unit = js.native
  /** This method is used to hide the rows, based on the specified row index in Spreadsheet.
    * @param {number} Index of the start row.
    * @param {number}  Optional. Index of the end row.
    * @returns {void}
    */
  def hideRow(startRow: scala.Double, endRow: scala.Double): scala.Unit = js.native
  /** This method is used to hide the sheet based on the specified sheetIndex or sheet name in the Spreadsheet.
    * @param {string|number} Pass the sheet name or index that you want to hide.
    * @returns {void}
    */
  def hideSheet(sheetIdx: java.lang.String): scala.Unit = js.native
  def hideSheet(sheetIdx: scala.Double): scala.Unit = js.native
  /** This method is used to hide the displayed waiting pop-up in Spreadsheet.
    * @returns {void}
    */
  def hideWaitingPopUp(): scala.Unit = js.native
  /** This method is used to import excel file manually by using form data.
    * @param {any} Pass the form data object to import files manually.
    * @returns {void}
    */
  def `import`(importRequest: js.Any): scala.Unit = js.native
  /** This method is used to insert a column before the active cell's column in the Spreadsheet.
    * @param {number} Pass start column.
    * @param {number} Pass end column.
    * @returns {void}
    */
  def insertEntireColumn(startCol: scala.Double, endCol: scala.Double): scala.Unit = js.native
  /** This method is used to insert a row before the active cell's row in the Spreadsheet.
    * @param {number} Pass start row.
    * @param {number} Pass end row.
    * @returns {void}
    */
  def insertEntireRow(startRow: scala.Double, endRow: scala.Double): scala.Unit = js.native
  /** This method is used to insert a new sheet to the left of the current active sheet.
    * @returns {void}
    */
  def insertSheet(): scala.Unit = js.native
  /** This method is used to insert cells in the selected or specified range and shift remaining cells to bottom.
    * @param {any} Row index and column index of the start cell.
    * @param {any} Row index and column index of the end cell.
    * @returns {void}
    */
  def insertShiftBottom(startCell: js.Any, endCell: js.Any): scala.Unit = js.native
  /** This method is used to insert cells in the selected or specified range and shift remaining cells to right.
    * @param {any} Row index and column index of the start cell.
    * @param {any} Row index and column index of the end cell.
    * @returns {void}
    */
  def insertShiftRight(startCell: js.Any, endCell: js.Any): scala.Unit = js.native
  /** This method is used to load JSON data in Spreadsheet.
    * @param {any} Pass the response that you want to load.
    * @returns {void}
    */
  def loadFromJSON(response: js.Any): scala.Unit = js.native
  /** This method is used to lock/unlock the range of cells in active sheet. Lock cells are activated only after the sheet is protected. Once the sheet is protected it is unable to
    * lock/unlock cells.
    * @param {string|any[]} Pass the alpha range cells or array range of cells.
    * @param {string} Optional. By default is {{'`true`' | markdownify}}. If it is {{'`false`' | markdownify}} locked cells are unlocked.
    * @returns {void}
    */
  def lockCells(range: java.lang.String): scala.Unit = js.native
  def lockCells(range: java.lang.String, isLocked: java.lang.String): scala.Unit = js.native
  def lockCells(range: js.Array[_]): scala.Unit = js.native
  def lockCells(range: js.Array[_], isLocked: java.lang.String): scala.Unit = js.native
  /** This method is used to merge cells by across in the Spreadsheet.
    * @param {string} Optional. To pass the cell range or selected cells are process.
    * @param {boolean} Optional. If pass {{'`true`' | markdownify}} it does not show alert.
    * @returns {void}
    */
  def mergeAcrossCells(): scala.Unit = js.native
  def mergeAcrossCells(range: java.lang.String): scala.Unit = js.native
  def mergeAcrossCells(range: java.lang.String, alertStatus: scala.Boolean): scala.Unit = js.native
  /** This method is used to merge the selected cells in the Spreadsheet.
    * @param {string|any[]} Optional. To pass the cell range or selected cells are process.
    * @param {boolean} Optional. If pass {{'`true`' | markdownify}} it does not show alert.
    * @returns {void}
    */
  def mergeCells(): scala.Unit = js.native
  def mergeCells(range: java.lang.String): scala.Unit = js.native
  def mergeCells(range: java.lang.String, alertStatus: scala.Boolean): scala.Unit = js.native
  def mergeCells(range: js.Array[_]): scala.Unit = js.native
  def mergeCells(range: js.Array[_], alertStatus: scala.Boolean): scala.Unit = js.native
  /** This method is used to select a cell or range in the Spreadsheet.
    * @param {any} Pass the start cell to perform selection.
    * @param {any} Pass the end cell to perform selection.
    * @returns {void}
    */
  def performSelection(startCell: js.Any, endCell: js.Any): scala.Unit = js.native
  /** This method is used to protect or unprotect active sheet.
    * @param {boolean} Optional. By default is {{'`true`' | markdownify}}. If it is {{'`false`' | markdownify}} active sheet is unprotected.
    * @returns {void}
    */
  def protectSheet(): scala.Unit = js.native
  def protectSheet(isProtected: scala.Boolean): scala.Unit = js.native
  /** This method is used to perform the redo action in Spreadsheet.
    * @returns {void}
    */
  def redo(): scala.Unit = js.native
  /** This method destroys and re-creates the entire Spreadsheet control.
    * @returns {void}
    */
  def refresh(): scala.Unit = js.native
  /** This method is used to refresh the Spreadsheet based on the sheet model values.
    * @param {number} Pass the index of the sheet.
    * @returns {void}
    */
  def refreshContent(sheetIdx: scala.Double): scala.Unit = js.native
  /** This method is used to refresh the Spreadsheet element based on the page layout.
    * @returns {void}
    */
  def refreshSpreadsheet(): scala.Unit = js.native
  /** This method is used to remove custom formulae in Spreadsheet.
    * @param {string} Pass the name of the formula.
    * @param {string} Pass the name of the function.
    * @returns {void}
    */
  def removeCustomFormula(formulaName: java.lang.String, functionName: java.lang.String): scala.Unit = js.native
  /** This method is used to remove the hyperlink from selected cells of current sheet.
    * @param {string} Hyperlink remove from the specified range.
    * @param {boolean} Optional. If it is {{'`true`' | markdownify}}, It will clear link only not format.
    * @param {boolean} Optional. Pass the status to perform undo and redo operations.
    * @param {any} Optional. Pass the cells that you want to remove hyperlink.
    * @param {boolean} Optional. Pass {{'`true`' | markdownify}}, if you want to skip the hidden rows.
    * @returns {void}
    */
  def removeHyperlink(range: java.lang.String): scala.Unit = js.native
  def removeHyperlink(range: java.lang.String, isClearHLink: scala.Boolean): scala.Unit = js.native
  def removeHyperlink(range: java.lang.String, isClearHLink: scala.Boolean, status: scala.Boolean): scala.Unit = js.native
  def removeHyperlink(range: java.lang.String, isClearHLink: scala.Boolean, status: scala.Boolean, cells: js.Any): scala.Unit = js.native
  def removeHyperlink(
    range: java.lang.String,
    isClearHLink: scala.Boolean,
    status: scala.Boolean,
    cells: js.Any,
    skipHiddenRow: scala.Boolean
  ): scala.Unit = js.native
  /** This method is used to remove the range data and its defined rangeSettings property based on the specified range name.
    * @param {string} Pass the defined rangeSetting property name.
    * @returns {void}
    */
  def removeRange(rangeName: java.lang.String): scala.Unit = js.native
  /** This method is used to remove the readonly option for the specified range.
    * @param {string|any[]} Pass the range.
    * @returns {void}
    */
  def removeReadOnly(): scala.Unit = js.native
  def removeReadOnly(range: java.lang.String): scala.Unit = js.native
  def removeReadOnly(range: js.Array[_]): scala.Unit = js.native
  /** This method is used to save JSON data in Spreadsheet.
    * @returns {any}
    */
  def saveAsJSON(): js.Any = js.native
  /** This method is used to save batch changes in Spreadsheet.
    * @param {number} Pass the sheet index for Spreadsheet.
    * @returns {void}
    */
  def saveBatchChanges(sheetIdx: scala.Double): scala.Unit = js.native
  /** This method is used to set the active cell in the Spreadsheet.
    * @param {number} Pass the row index.
    * @param {number} Pass the column index.
    * @param {number} Pass the index of the sheet.
    * @returns {void}
    */
  def setActiveCell(rowIdx: scala.Double, colIdx: scala.Double, sheetIdx: scala.Double): scala.Unit = js.native
  /** This method is used to set active sheet index for the Spreadsheet.
    * @param {number} Pass the active sheet index for Spreadsheet.
    * @returns {void}
    */
  def setActiveSheetIndex(sheetIdx: scala.Double): scala.Unit = js.native
  /** This method is used to set border for the specified range of cells in the Spreadsheet.
    * @param {any} Pass the border properties that you want to set.
    * @param {string} Optional. If range is specified, it will set border for the specified range else it will use the selected range.
    * @returns {void}
    */
  def setBorder(property: js.Any): scala.Unit = js.native
  def setBorder(property: js.Any, range: java.lang.String): scala.Unit = js.native
  def setHeightToRows(heightColl: js.Any): scala.Unit = js.native
  /** This method is used to set the height for the rows in the Spreadsheet.
    * @param {any[]|any} Pass the row index and height of the rows.
    * @returns {void}
    */
  def setHeightToRows(heightColl: js.Array[_]): scala.Unit = js.native
  /** This method is used to set the hyperlink in selected cells of the current sheet.
    * @param {string|any[]} If range is specified, it will set the hyperlink in range of the cells.
    * @param {any} Pass cellAddress or webAddress
    * @param {number} If we pass cellAddress then which sheet to be navigate in the applied link.
    * @returns {void}
    */
  def setHyperlink(range: java.lang.String, link: js.Any, sheetIdx: scala.Double): scala.Unit = js.native
  def setHyperlink(range: js.Array[_], link: js.Any, sheetIdx: scala.Double): scala.Unit = js.native
  /** This method is used to set the readonly option for the specified range.
    * @param {string|any[]} Pass the range.
    * @returns {void}
    */
  def setReadOnly(): scala.Unit = js.native
  def setReadOnly(range: java.lang.String): scala.Unit = js.native
  def setReadOnly(range: js.Array[_]): scala.Unit = js.native
  /** This method is used to set the focus to the Spreadsheet.
    * @returns {void}
    */
  def setSheetFocus(): scala.Unit = js.native
  def setWidthToColumns(widthColl: js.Any): scala.Unit = js.native
  def setWidthToColumns(widthColl: js.Any, sheetIndex: scala.Double): scala.Unit = js.native
  /** This method is used to set the width for the columns in the Spreadsheet.
    * @param {any[]|any} Pass the column index and width of the columns.
    * @param {number} Optional. If sheetIdx is specified, it will set the width for columns to the specified sheet else it will use active sheet.
    * @returns {void}
    */
  def setWidthToColumns(widthColl: js.Array[_]): scala.Unit = js.native
  def setWidthToColumns(widthColl: js.Array[_], sheetIndex: scala.Double): scala.Unit = js.native
  /** This method is used to rename the active sheet.
    * @param {string} Pass the sheet name that you want to change the current active sheet name.
    * @returns {void}
    */
  def sheetRename(sheetName: java.lang.String): scala.Unit = js.native
  /** This method is used to display the activationPanel for the specified range name.
    * @param {string} Pass the range name that you want to display the activation panel.
    * @returns {void}
    */
  def showActivationPanel(rangeName: java.lang.String): scala.Unit = js.native
  /** This method is used to show the hidden columns within the specified range in the Spreadsheet.
    * @param {number} Index of the start column.
    * @param {number} Optional. Index of the end column.
    * @returns {void}
    */
  def showColumn(startColIdx: scala.Double, endColIdx: scala.Double): scala.Unit = js.native
  /** This method is used to show the formula bar in Spreadsheet.
    * @returns {void}
    */
  def showFormulaBar(): scala.Unit = js.native
  /** This method is used to show/hide gridlines in active sheet in the Spreadsheet.
    * @param {boolean} Pass {{'`true`' | markdownify}} to show the gridlines
    * @returns {void}
    */
  def showGridlines(status: scala.Boolean): scala.Unit = js.native
  /** This method is used to show/hide the headers in active sheet in the Spreadsheet.
    * @param {boolean} Pass {{'`true`' | markdownify}} to show the sheet headers.
    * @returns {void}
    */
  def showHeadings(startRow: scala.Boolean): scala.Unit = js.native
  /** This method is used to show/hide pager in the Spreadsheet.
    * @param {boolean} Pass {{'`true`' | markdownify}} to show pager.
    * @returns {void}
    */
  def showPager(status: scala.Boolean): scala.Unit = js.native
  /** This method is used to show the hidden rows in the specified range in the Spreadsheet.
    * @param {number} Index of the start row.
    * @param {number} Optional. Index of the end row.
    * @returns {void}
    */
  def showRow(startRow: scala.Double, endRow: scala.Double): scala.Unit = js.native
  /** This method is used to show waiting pop-up in Spreadsheet.
    * @returns {void}
    */
  def showWaitingPopUp(): scala.Unit = js.native
  /** This method is used to unwrap the selected range of cells in the Spreadsheet.
    * @param {any[]|string} Optional. If the range is specified, then it will update unwrap in the specified range else it will use the current selected range.
    * @returns {void}
    */
  def unWrapText(): scala.Unit = js.native
  def unWrapText(range: java.lang.String): scala.Unit = js.native
  def unWrapText(range: js.Array[_]): scala.Unit = js.native
  /** This method is used to perform the undo action in Spreadsheet.
    * @returns {void}
    */
  def undo(): scala.Unit = js.native
  /** This method is used to unfreeze the frozen rows and columns in the Spreadsheet.
    * @returns {void}
    */
  def unfreezePanes(): scala.Unit = js.native
  /** This method is used to unhide the sheet based on specified sheet name or sheet index.
    * @param {string|number} Pass the sheet name or index that you want to unhide.
    * @returns {void}
    */
  def unhideSheet(sheetInfo: java.lang.String): scala.Unit = js.native
  def unhideSheet(sheetInfo: scala.Double): scala.Unit = js.native
  /** This method is used to unmerge the selected range of cells in the Spreadsheet.
    * @param {string} Optional. If the range is specified, then it will un merge the specified range else it will use the current selected range.
    * @returns {void}
    */
  def unmergeCells(): scala.Unit = js.native
  def unmergeCells(range: java.lang.String): scala.Unit = js.native
  /** This method is used to update the data for the specified range of cells in the Spreadsheet.
    * @param {any} Pass the cells data that you want to update.
    * @param {any[]|string} Optional. If range is specified, it will update data for the specified range  else it will use the current selected range.
    * @returns {void}
    */
  def updateData(data: js.Any): scala.Unit = js.native
  def updateData(data: js.Any, range: java.lang.String): scala.Unit = js.native
  def updateData(data: js.Any, range: js.Array[_]): scala.Unit = js.native
  /** This method is used to update the formula bar in the Spreadsheet.
    * @returns {void}
    */
  def updateFormulaBar(): scala.Unit = js.native
  /** This method is used to update the range of cells based on the specified settings which we want to update in the Spreadsheet.
    * @param {number} Pass the sheet index that you want to update.
    * @param {any} Pass the dataSource, startCell and showHeader values as settings.
    * @returns {void}
    */
  def updateRange(sheetIdx: scala.Double, settings: js.Any): scala.Unit = js.native
  /** This method is used to update the details for custom undo and redo operations.
    * @param {any} Pass the details to update undo and redo collection
    * @returns {void}
    */
  def updateUndoRedoCollection(details: js.Any): scala.Unit = js.native
  /** This method is used to update the unique data for the specified range of cells in Spreadsheet.
    * @param {any} Pass the  data that you want to update in the particular range
    * @param {any[]|string} Optional. If range is specified, it will update data for the specified range else it will use the current selected range.
    * @param {any} Optional. It specifies whether to skip element processing or not.
    * @returns {void}
    */
  def updateUniqueData(data: js.Any): scala.Unit = js.native
  def updateUniqueData(data: js.Any, range: java.lang.String): scala.Unit = js.native
  def updateUniqueData(data: js.Any, range: java.lang.String, skipCell: js.Any): scala.Unit = js.native
  def updateUniqueData(data: js.Any, range: js.Array[_]): scala.Unit = js.native
  def updateUniqueData(data: js.Any, range: js.Array[_], skipCell: js.Any): scala.Unit = js.native
  /** This method is used to wrap the selected range of cells in the Spreadsheet.
    * @param {any[]|string} Optional. If the range is specified, then it will update wrap in the specified  range else it will use the current selected range.
    * @returns {void}
    */
  def wrapText(): scala.Unit = js.native
  def wrapText(range: java.lang.String): scala.Unit = js.native
  def wrapText(range: js.Array[_]): scala.Unit = js.native
}

@JSGlobal("ej.Spreadsheet")
@js.native
object Spreadsheet extends js.Object {
  var Locale: js.Any = js.native
  var fn: ejDotWebDotAllLib.ejNs.Spreadsheet = js.native
}

