package typings.googleSpreadsheet.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-spreadsheet", "GoogleSpreadsheetRow")
@js.native
class GoogleSpreadsheetRow protected ()
  extends /**
  * @description
  * This represents the properties that get loaded using the header row
  */
/* x */ StringDictionary[js.Any] {
  def this(parentSheet: GoogleSpreadsheetWorksheet, rowNumber: Double, data: js.Any) = this()
  /**
    * @description
    * full A1 formatted range of this row
    * - includes the worksheet name, ex: "sheet1!A5:D5"
    */
  var a1Range: String = js.native
  /**
    * @description
    * row number in the worksheet
    * - NOT 0 indexed, starts at 1
    */
  var rowIndex: Double = js.native
  /**
    * @description
    * delete this row
    */
  def delete(): js.Promise[Unit] = js.native
  /**
    * @description
    * save any updates made to cell values in this row
    */
  def save(): js.Promise[Unit] = js.native
}

