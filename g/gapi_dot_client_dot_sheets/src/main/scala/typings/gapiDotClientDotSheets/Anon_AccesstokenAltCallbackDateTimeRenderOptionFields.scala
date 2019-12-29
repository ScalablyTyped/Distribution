package typings.gapiDotClientDotSheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AccesstokenAltCallbackDateTimeRenderOptionFields extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /**
    * How dates, times, and durations should be represented in the output.
    * This is ignored if value_render_option is
    * FORMATTED_VALUE.
    * The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
    */
  var dateTimeRenderOption: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /**
    * The major dimension that results should use.
    *
    * For example, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`,
    * then requesting `range=A1:B2,majorDimension=ROWS` will return
    * `[[1,2],[3,4]]`,
    * whereas requesting `range=A1:B2,majorDimension=COLUMNS` will return
    * `[[1,3],[2,4]]`.
    */
  var majorDimension: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** The A1 notation of the values to retrieve. */
  var range: String = js.native
  /** The ID of the spreadsheet to retrieve data from. */
  var spreadsheetId: String = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
  /**
    * How values should be represented in the output.
    * The default render option is ValueRenderOption.FORMATTED_VALUE.
    */
  var valueRenderOption: js.UndefOr[String] = js.native
}

