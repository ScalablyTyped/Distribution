package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("exceljs", "Workbook")
@js.native
class Workbook () extends js.Object {
  var created: stdLib.Date = js.native
  var creator: java.lang.String = js.native
  /**
  	 * csv file format operations
  	 */
  val csv: Csv = js.native
  var lastModifiedBy: java.lang.String = js.native
  var lastPrinted: stdLib.Date = js.native
  var modified: stdLib.Date = js.native
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
  def addImage(img: Image): java.lang.String = js.native
  /**
  	 * Add a new worksheet and return a reference to it
  	 */
  def addWorksheet(name: java.lang.String): Worksheet = js.native
  def addWorksheet(name: java.lang.String, options: AddWorksheetOptions): Worksheet = js.native
  /**
  	 * Commit a completed workbook to stream and close the stream
  	 */
  def commit(): js.Promise[scala.Unit] = js.native
  /**
  	 * Iterate over all sheets.
  	 *
  	 * Note: `workbook.worksheets.forEach` will still work but this is better.
  	 */
  def eachSheet(callback: js.Function2[/* worksheet */ Worksheet, /* id */ scala.Double, scala.Unit]): scala.Unit = js.native
  def getWorksheet(indexOrName: java.lang.String): Worksheet = js.native
  /**
  	 * fetch sheet by name or id
  	 */
  def getWorksheet(indexOrName: scala.Double): Worksheet = js.native
}

