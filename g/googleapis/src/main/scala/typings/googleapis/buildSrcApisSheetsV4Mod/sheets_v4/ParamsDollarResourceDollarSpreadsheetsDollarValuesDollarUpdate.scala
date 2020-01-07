package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarSpreadsheetsDollarValuesDollarUpdate extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Determines if the update response should include the values of the cells
    * that were updated. By default, responses do not include the updated
    * values. If the range to write was larger than than the range actually
    * written, the response will include all values in the requested range
    * (excluding trailing empty rows and columns).
    */
  var includeValuesInResponse: js.UndefOr[Boolean] = js.native
  /**
    * The A1 notation of the values to update.
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
    * DateTimeRenderOption.SERIAL_NUMBER.
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

