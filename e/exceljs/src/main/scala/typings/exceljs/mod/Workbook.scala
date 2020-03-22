package typings.exceljs.mod

import typings.exceljs.PartialAddWorksheetOption
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("exceljs", "Workbook")
@js.native
class Workbook () extends js.Object {
  /**
  	 * Workbook calculation Properties
  	 */
  var calcProperties: CalculationProperties = js.native
  var created: Date = js.native
  var creator: String = js.native
  /**
  	 * csv file format operations
  	 */
  val csv: Csv = js.native
  val definedNames: DefinedNames = js.native
  var lastModifiedBy: String = js.native
  var lastPrinted: Date = js.native
  var model: WorkbookModel = js.native
  var modified: Date = js.native
  val nextId: Double = js.native
  var properties: WorkbookProperties = js.native
  /**
  	 * The Workbook views controls how many separate windows Excel will open when viewing the workbook.
  	 */
  var views: js.Array[WorkbookView] = js.native
  /**
  	 * return a clone of worksheets in order
  	 */
  var worksheets: js.Array[Worksheet] = js.native
  /**
  	 * xlsx file format operations
  	 */
  val xlsx: Xlsx = js.native
  /**
  	 * Add Image to Workbook and return the id
  	 */
  def addImage(img: Image): Double = js.native
  /**
  	 * Add a new worksheet and return a reference to it
  	 */
  def addWorksheet(): Worksheet = js.native
  def addWorksheet(name: String): Worksheet = js.native
  def addWorksheet(name: String, options: PartialAddWorksheetOption): Worksheet = js.native
  def clearThemes(): Unit = js.native
  /**
  	 * Iterate over all sheets.
  	 *
  	 * Note: `workbook.worksheets.forEach` will still work but this is better.
  	 */
  def eachSheet(callback: js.Function2[/* worksheet */ Worksheet, /* id */ Double, Unit]): Unit = js.native
  def getImage(id: Double): Image = js.native
  def getWorksheet(indexOrName: String): Worksheet = js.native
  /**
  	 * fetch sheet by name or id
  	 */
  def getWorksheet(indexOrName: Double): Worksheet = js.native
  def removeWorksheet(indexOrName: String): Unit = js.native
  def removeWorksheet(indexOrName: Double): Unit = js.native
  def removeWorksheetEx(worksheet: Worksheet): Unit = js.native
}

