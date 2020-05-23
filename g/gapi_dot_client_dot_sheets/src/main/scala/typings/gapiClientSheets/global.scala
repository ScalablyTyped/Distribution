package typings.gapiClientSheets

import typings.gapiClientSheets.gapi.client.sheets.SpreadsheetsResource
import typings.gapiClientSheets.gapiClientSheetsStrings.sheets
import typings.gapiClientSheets.gapiClientSheetsStrings.v4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object global extends js.Object {
  @js.native
  object gapi extends js.Object {
    @js.native
    object client extends js.Object {
      /** Load Google Sheets API v4 */
      def load(name: sheets, version: v4): js.Thenable[Unit] = js.native
      def load(name: sheets, version: v4, callback: js.Function0[_]): Unit = js.native
      @js.native
      object sheets extends js.Object {
        val spreadsheets: SpreadsheetsResource = js.native
      }
      
    }
    
  }
  
}

