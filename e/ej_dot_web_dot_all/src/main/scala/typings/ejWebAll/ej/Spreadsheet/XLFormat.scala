package typings.ejWebAll.ej.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XLFormat extends js.Object {
  
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
  def createTable(tableObject: TableOptions, range: js.Array[_]): String = js.native
  
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
  def getBorderFromHashCode(code: String, isComplete: Boolean): js.Any = js.native
  
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
  def removeStyle(range: js.Array[_], options: FormatOptions): Unit = js.native
  
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
  def updateDecimalPlaces(`type`: String, range: js.Array[_]): Unit = js.native
  
  /** This method is used to update the format for the selected range of cells in the Spreadsheet.
    * @param {Spreadsheet.BorderOptions} Pass Object BorderOptions.
    * @param {any[]} Optional. If the range is specified, then it will update format in the specified range else it will use the current selected range.
    * @returns {void}
    */
  def updateFormat(formatObj: BorderOptions, range: js.Array[_]): Unit = js.native
  
  /** This method is used to update the unique format for selected range of cells in the Spreadsheet.
    * @param {string} Pass the unique format class.
    * @param {any[]} Optional. If the range is specified, then it will update format in the specified range else it will use the current selected range.
    * @returns {void}
    */
  def updateUniqueFormat(formatClass: String, range: js.Array[_]): Unit = js.native
}
