package typings
package ejDotWebDotAllLib.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XLFormat extends js.Object {
  /** This method is used to add the custom Date &amp; Time format and recognize it as a preferred pattern in spreadsheet.
    * @param {string} Pass the name for custom format.
    * @param {string} Pass the custom format string.
    * @param {string} Pass the type for custom format.
    * @returns {void}
    */
  def addCustomFormatSpecifier(name: java.lang.String, formatSpecifier: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  /** This method is used to add the font to the Ribbon font family dropdown.
    * @param {string} Font name which needs to add into the font family option.
    * @returns {void}
    */
  def addFontFamily(fontName: java.lang.String): scala.Unit = js.native
  /** This method is used to add the new custom cell style in spreadsheet.
    * @param {string} Pass the style name.
    * @param {any} Pass the format object.
    * @returns {void}
    */
  def addNewCustomStyle(styleName: java.lang.String, options: js.Any): scala.Unit = js.native
  /** This method is used to apply the custom cell style in the specified range.
    * @param {string} Pass the style name.
    * @param {string} Pass the range to applied.
    * @returns {void}
    */
  def applyCustomCellStyle(styleName: java.lang.String, range: java.lang.String): scala.Unit = js.native
  /** This method is used to convert table range to normal range.
    * @param {any} Pass the sheet index and table id.
    * @returns {void}
    */
  def convertToRange(options: js.Any): scala.Unit = js.native
  /** This method is used to create a table for the selected range of cells in the Spreadsheet.
    * @param {any} Pass the table object.
    * @param {string|any[]} Optional. If the range is specified, then it will create table in the specified range else it will use the current selected range.
    * @returns {string}
    */
  def createTable(tableObject: js.Any, range: java.lang.String): java.lang.String = js.native
  def createTable(tableObject: js.Any, range: js.Array[_]): java.lang.String = js.native
  /** This method is used to delete the added custom cell style in spreadsheet.
    * @param {string} Pass the cell style name
    * @returns {void}
    */
  def deleteCustomStyle(styleName: java.lang.String): scala.Unit = js.native
  /** This method is used to set format style and values in a cell or range of cells.
    * @param {any} Pass the formatObject which contains style, type, format, groupSeparator and decimalPlaces.
    * @param {string} Pass the range to format cells.
    * @returns {void}
    */
  def format(formatObj: js.Any, range: java.lang.String): scala.Unit = js.native
  /** This method is used to get the border from hashcode in the Spreadsheet.
    * @param {string} Pass the border hashcode.
    * @param {boolean} Optional. pass `true` to get the complete border object
    * @returns {any}
    */
  def getBorderFromHashCode(code: java.lang.String, isComplete: scala.Boolean): js.Any = js.native
  /** This method is used to get the format class in spreadsheet.
    * @param {string} Pass the style name.
    * @param {boolean} Optional. Pass true to get the border class.
    * @returns {void}
    */
  def getFormatClass(classname: java.lang.String, isborder: scala.Boolean): scala.Unit = js.native
  /** This method is used to get the format from the given hashcode in spreadsheet.
    * @param {string} Pass the hashcode.
    * @returns {void}
    */
  def getFormatFromHashCode(hashCode: java.lang.String): scala.Unit = js.native
  /** This method is used to get the hashcode from the given style object in spreadsheet.
    * @param {any} Pass the style object that you want to get the hashcode.
    * @returns {void}
    */
  def getFormatHashCode(style: js.Any): scala.Unit = js.native
  /** This method is used to get the format as array from the given specified range in spreadsheet.
    * @param {string} Pass the range.
    * @returns {void}
    */
  def getHashCodeClassAsArray(range: java.lang.String): scala.Unit = js.native
  /** This method is used to modify the added custom cell style in spreadsheet.
    * @param {string} pass the old style name
    * @param {any} pass the format object to be modified
    * @param {string} pass the new style name
    * @returns {void}
    */
  def modifyCustomStyle(oldStyleName: java.lang.String, options: js.Any, newStyleName: java.lang.String): scala.Unit = js.native
  /** This method is used to remove the font from the Ribbon font family dropdown.
    * @param {string} Font name which needs to remove from the font family drop down.
    * @returns {void}
    */
  def removeFontFamily(fontName: java.lang.String): scala.Unit = js.native
  def removeStyle(range: java.lang.String, options: js.Any): scala.Unit = js.native
  /** This method is used to remove the style in the specified range.
    * @param {any[]|string} Pass the cell range .
    * @param {any} Optional. Pass the options for which the style gets removed.
    * @returns {void}
    */
  def removeStyle(range: js.Array[_], options: js.Any): scala.Unit = js.native
  /** This method is used to remove table with specified tableId in the Spreadsheet.
    * @param {number} Pass the tableId that you want to remove.
    * @returns {void}
    */
  def removeTable(tableId: scala.Double): scala.Unit = js.native
  /** This method is used to update the decimal places for numeric value for the selected range of cells in the Spreadsheet.
    * @param {string} Pass the decimal places type in IncreaseDecimal/DecreaseDecimal.
    * @param {string|any[]} Pass the range.
    * @returns {void}
    */
  def updateDecimalPlaces(`type`: java.lang.String, range: java.lang.String): scala.Unit = js.native
  def updateDecimalPlaces(`type`: java.lang.String, range: js.Array[_]): scala.Unit = js.native
  /** This method is used to update the format for the selected range of cells in the Spreadsheet.
    * @param {any} Pass the format object that you want to update.
    * @param {any[]} Optional. If the range is specified, then it will update format in the specified range else it will use the current selected range.
    * @returns {void}
    */
  def updateFormat(formatObj: js.Any, range: js.Array[_]): scala.Unit = js.native
  /** This method is used to update the unique format for selected range of cells in the Spreadsheet.
    * @param {string} Pass the unique format class.
    * @param {any[]} Optional. If the range is specified, then it will update format in the specified range else it will use the current selected range.
    * @returns {void}
    */
  def updateUniqueFormat(formatClass: java.lang.String, range: js.Array[_]): scala.Unit = js.native
}

