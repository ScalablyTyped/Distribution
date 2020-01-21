package typings.gapiClientSheets.gapi.client

import typings.gapiClientSheets.gapiClientSheetsStrings.v4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.load")
@js.native
object load extends js.Object {
  /** Load Google Sheets API v4 */
  def apply(name: typings.gapiClientSheets.gapiClientSheetsStrings.sheets, version: v4): js.Thenable[Unit] = js.native
  def apply(
    name: typings.gapiClientSheets.gapiClientSheetsStrings.sheets,
    version: v4,
    callback: js.Function0[_]
  ): Unit = js.native
}

