package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarGet extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * How dates, times, and durations should be represented in the output. This
    * is ignored if value_render_option is FORMATTED_VALUE. The default
    * dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
    */
  var dateTimeRenderOption: js.UndefOr[String] = js.native
  /**
    * The major dimension that results should use.  For example, if the
    * spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`, then requesting
    * `range=A1:B2,majorDimension=ROWS` will return `[[1,2],[3,4]]`, whereas
    * requesting `range=A1:B2,majorDimension=COLUMNS` will return
    * `[[1,3],[2,4]]`.
    */
  var majorDimension: js.UndefOr[String] = js.native
  /**
    * The A1 notation of the values to retrieve.
    */
  var range: js.UndefOr[String] = js.native
  /**
    * The ID of the spreadsheet to retrieve data from.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  /**
    * How values should be represented in the output. The default render option
    * is ValueRenderOption.FORMATTED_VALUE.
    */
  var valueRenderOption: js.UndefOr[String] = js.native
}

