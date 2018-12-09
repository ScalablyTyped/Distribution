package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client")
@js.native
object clientNsMembers extends js.Object {
  val spreadsheets: gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs.SpreadsheetsResource = js.native
  /** Load Google Sheets API v4 */
  def load(
    name: gapiDotClientDotSheetsLib.gapiDotClientDotSheetsLibStrings.sheets,
    version: gapiDotClientDotSheetsLib.gapiDotClientDotSheetsLibStrings.v4
  ): js.Thenable[scala.Unit] = js.native
  def load(
    name: gapiDotClientDotSheetsLib.gapiDotClientDotSheetsLibStrings.sheets,
    version: gapiDotClientDotSheetsLib.gapiDotClientDotSheetsLibStrings.v4,
    callback: js.Function0[_]
  ): scala.Unit = js.native
}

