package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopySheetToAnotherSpreadsheetRequest extends js.Object {
  var destinationSpreadsheetId: js.UndefOr[java.lang.String] = js.undefined
}

object CopySheetToAnotherSpreadsheetRequest {
  @scala.inline
  def apply(destinationSpreadsheetId: java.lang.String = null): CopySheetToAnotherSpreadsheetRequest = {
    val __obj = js.Dynamic.literal()
    if (destinationSpreadsheetId != null) __obj.updateDynamic("destinationSpreadsheetId")(destinationSpreadsheetId)
    __obj.asInstanceOf[CopySheetToAnotherSpreadsheetRequest]
  }
}

