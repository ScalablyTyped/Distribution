package typings.exceljs.exceljsMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("exceljs", "Workbook")
@js.native
class Workbook () extends js.Object {
  var created: Date = js.native
  var creator: String = js.native
  /**
  	 * csv file format operations
  	 */
  val csv: Csv = js.native
  var lastModifiedBy: String = js.native
  var lastPrinted: Date = js.native
  var modified: Date = js.native
  var properties: WorkbookProperties = js.native
  /**
  	 * The Workbook views controls how many separate windows Excel will open when viewing the workbook.
  	 */
  var views: js.Array[WorkbookView] = js.native
  /**
  	 * The list of worksheets added to this workbook
  	 */
  var worksheets: js.Array[Worksheet] = js.native
  /**
  	 * xlsx file format operations
  	 */
  val xlsx: Xlsx = js.native
  /**
  	 * Add Image to Workbook and return the id
  	 */
  def addImage(img: Image): String = js.native
  /**
  	 * Add a new worksheet and return a reference to it
  	 */
  def addWorksheet(name: String): Worksheet = js.native
  def addWorksheet(name: String, options: AddWorksheetOptions): Worksheet = js.native
  /**
  	 * Commit a completed workbook to stream and close the stream
  	 */
  def commit(): js.Promise[Unit] = js.native
  /**
  	 * Iterate over all sheets.
  	 *
  	 * Note: `workbook.worksheets.forEach` will still work but this is better.
  	 */
  def eachSheet(callback: js.Function2[/* worksheet */ Worksheet, /* id */ Double, Unit]): Unit = js.native
  def getWorksheet(indexOrName: String): Worksheet = js.native
  /**
  	 * fetch sheet by name or id
  	 */
  def getWorksheet(indexOrName: Double): Worksheet = js.native
}

