package typings.gapiDotClientDotSheets.gapiNs.clientNs

import typings.gapiDotClientDotSheets.gapiDotClientDotSheetsStrings.sheets
import typings.gapiDotClientDotSheets.gapiDotClientDotSheetsStrings.v4
import typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs.SpreadsheetsResource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object ^ extends js.Object {
  val spreadsheets: SpreadsheetsResource = js.native
  /** Load Google Sheets API v4 */
  def load(name: sheets, version: v4): js.Thenable[Unit] = js.native
  def load(name: sheets, version: v4, callback: js.Function0[_]): Unit = js.native
}

