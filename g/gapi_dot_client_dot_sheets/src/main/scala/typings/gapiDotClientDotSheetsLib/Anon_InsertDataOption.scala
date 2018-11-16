package typings
package gapiDotClientDotSheetsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_InsertDataOption extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Determines if the update response should include the values
                   * of the cells that were appended. By default, responses
                   * do not include the updated values.
                   */
  var includeValuesInResponse: js.UndefOr[scala.Boolean] = js.undefined
  /** How the input data should be inserted. */
  var insertDataOption: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The A1 notation of a range to search for a logical table of data.
                   * Values will be appended after the last row of the table.
                   */
  var range: java.lang.String
  /**
                   * Determines how dates, times, and durations in the response should be
                   * rendered. This is ignored if response_value_render_option is
                   * FORMATTED_VALUE.
                   * The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
                   */
  var responseDateTimeRenderOption: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * Determines how values in the response should be rendered.
                   * The default render option is ValueRenderOption.FORMATTED_VALUE.
                   */
  var responseValueRenderOption: js.UndefOr[java.lang.String] = js.undefined
  /** The ID of the spreadsheet to update. */
  var spreadsheetId: java.lang.String
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
  /** How the input data should be interpreted. */
  var valueInputOption: js.UndefOr[java.lang.String] = js.undefined
}

