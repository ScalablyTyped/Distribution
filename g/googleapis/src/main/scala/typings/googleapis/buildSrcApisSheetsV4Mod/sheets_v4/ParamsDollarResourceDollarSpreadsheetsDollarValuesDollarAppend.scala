package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarAppend extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Determines if the update response should include the values of the cells
    * that were appended. By default, responses do not include the updated
    * values.
    */
  var includeValuesInResponse: js.UndefOr[Boolean] = js.native
  /**
    * How the input data should be inserted.
    */
  var insertDataOption: js.UndefOr[String] = js.native
  /**
    * The A1 notation of a range to search for a logical table of data. Values
    * will be appended after the last row of the table.
    */
  var range: js.UndefOr[String] = js.native
  /**
    * Request body metadata
    */
  var requestBody: js.UndefOr[Schema$ValueRange] = js.native
  /**
    * Determines how dates, times, and durations in the response should be
    * rendered. This is ignored if response_value_render_option is
    * FORMATTED_VALUE. The default dateTime render option is
    * [DateTimeRenderOption.SERIAL_NUMBER].
    */
  var responseDateTimeRenderOption: js.UndefOr[String] = js.native
  /**
    * Determines how values in the response should be rendered. The default
    * render option is ValueRenderOption.FORMATTED_VALUE.
    */
  var responseValueRenderOption: js.UndefOr[String] = js.native
  /**
    * The ID of the spreadsheet to update.
    */
  var spreadsheetId: js.UndefOr[String] = js.native
  /**
    * How the input data should be interpreted.
    */
  var valueInputOption: js.UndefOr[String] = js.native
}

