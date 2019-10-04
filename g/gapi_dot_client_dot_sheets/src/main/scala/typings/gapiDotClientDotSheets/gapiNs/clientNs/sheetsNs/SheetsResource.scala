package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import typings.gapiDotClientDotSheets.Anon_AccesstokenAltCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SheetsResource extends js.Object {
  /**
    * Copies a single sheet from a spreadsheet to another spreadsheet.
    * Returns the properties of the newly created sheet.
    */
  def copyTo(request: Anon_AccesstokenAltCallback): typings.gapiDotClient.gapiNs.clientNs.Request[SheetProperties]
}

object SheetsResource {
  @scala.inline
  def apply(
    copyTo: Anon_AccesstokenAltCallback => typings.gapiDotClient.gapiNs.clientNs.Request[SheetProperties]
  ): SheetsResource = {
    val __obj = js.Dynamic.literal(copyTo = js.Any.fromFunction1(copyTo))
  
    __obj.asInstanceOf[SheetsResource]
  }
}

