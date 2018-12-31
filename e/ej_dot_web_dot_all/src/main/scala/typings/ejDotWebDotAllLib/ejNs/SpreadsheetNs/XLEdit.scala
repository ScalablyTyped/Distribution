package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLEdit extends js.Object {
  /** This method is used to calculate formulas in the specified sheet.
    * @param {number} Optional. If sheet index is specified, then it will calculate formulas in the specified sheet only else it will calculate formulas in all sheets.
    * @returns {void}
    */
  def calcNow(sheetIdx: scala.Double): scala.Unit = js.native
  /** This method is used to edit a particular cell based on the row index and column index in the Spreadsheet.
    * @param {number} Pass the row index to edit particular cell.
    * @param {number} Pass the column index to edit particular cell.
    * @param {boolean} Pass {{'`true`' | markdownify}}, if you want to maintain previous cell value.
    * @returns {void}
    */
  def editCell(rowIdx: scala.Double, colIdx: scala.Double, oldData: scala.Boolean): scala.Unit = js.native
  /** This method is used to get the column index with specified field value in Spreadsheet.
    * @param {string} Pass the column field value
    * @returns {void}
    */
  def getColumnIndexByField(field: java.lang.String): scala.Unit = js.native
  /** This method is used to get the property value of particular cell, based on the row and column index in the Spreadsheet.
    * @param {number} Pass the row index to get the property value.
    * @param {number} Pass the column index to get the property value.
    * @param {string} Optional. Pass the property name that you want("value", "value2", "type", "cFormatRule", "range", "thousandSeparator", "rule", "format", "border", "picture",
    * "chart", "calcValue", "align", "hyperlink", "formats", "borders", "tformats", "tborders", "isFilterHeader",  "filterState", "tableName", "comment", "formatStr", "decimalPlaces",
    * "cellType").
    * @param {number} Optional. Pass the index of the sheet.
    * @returns {any|string|any[]}
    */
  def getPropertyValue(rowIdx: scala.Double, colIdx: scala.Double, prop: java.lang.String, sheetIdx: scala.Double): js.Any | java.lang.String | js.Array[_] = js.native
  /** This method is used to get the property value in specified cell in Spreadsheet.
    * @param {HTMLElement} Pass the cell element to get property value.
    * @param {string} Pass the property name that you want ("value", "value2", "type", "cFormatRule", "range", "thousandSeparator", "rule", "format", "border", "picture", "chart",
    * "calcValue", "align", "hyperlink", "formats", "borders", "tformats", "tborders", "isFilterHeader", "filterState", "tableName", "comment", "formatStr", "decimalPlaces",
    * "cellType").
    * @param {number} Pass the index of sheet.
    * @returns {any|string|any[]}
    */
  def getPropertyValueByElem(elem: stdLib.HTMLElement, property: java.lang.String, sheetIdx: scala.Double): js.Any | java.lang.String | js.Array[_] = js.native
  /** This method is used to save the edited cell value in the Spreadsheet.
    * @returns {void}
    */
  def saveCell(): scala.Unit = js.native
  /** This method is used to update a particular cell value in the Spreadsheet.
    * @param {any} Pass row index and column index of the cell.
    * @param {string|number} Pass the cell value.
    * @returns {void}
    */
  def updateCell(cell: js.Any, value: java.lang.String): scala.Unit = js.native
  def updateCell(cell: js.Any, value: scala.Double): scala.Unit = js.native
  /** This method is used to update a particular cell value and its format in the Spreadsheet.
    * @param {any} Pass row index and column index of the cell.
    * @param {string|number} Pass the cell value.
    * @param {string} Pass the class name to update format.
    * @param {number} Pass sheet index.
    * @returns {void}
    */
  def updateCellValue(cellIdx: js.Any, `val`: java.lang.String, formatClass: java.lang.String, sheetIdx: scala.Double): scala.Unit = js.native
  def updateCellValue(cellIdx: js.Any, `val`: scala.Double, formatClass: java.lang.String, sheetIdx: scala.Double): scala.Unit = js.native
  /** This method is used to update a particular cell value and its format in the Spreadsheet.
    * @param {string} Pass the range.
    * @param {string|number} Pass the cell value.
    * @param {string} Pass the class name to update format.
    * @param {number} Pass sheet index.
    * @returns {void}
    */
  def updateValue(
    aRange: java.lang.String,
    `val`: java.lang.String,
    formatClass: java.lang.String,
    sheetIdx: scala.Double
  ): scala.Unit = js.native
  def updateValue(
    aRange: java.lang.String,
    `val`: scala.Double,
    formatClass: java.lang.String,
    sheetIdx: scala.Double
  ): scala.Unit = js.native
}

