package typings.gapiDotClientDotSheets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccesstokenAltCallbackDateTimeRenderOption extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  /**
    * How dates, times, and durations should be represented in the output.
    * This is ignored if value_render_option is
    * FORMATTED_VALUE.
    * The default dateTime render option is [DateTimeRenderOption.SERIAL_NUMBER].
    */
  var dateTimeRenderOption: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /**
    * The major dimension that results should use.
    *
    * For example, if the spreadsheet data is: `A1=1,B1=2,A2=3,B2=4`,
    * then requesting `range=A1:B2,majorDimension=ROWS` will return
    * `[[1,2],[3,4]]`,
    * whereas requesting `range=A1:B2,majorDimension=COLUMNS` will return
    * `[[1,3],[2,4]]`.
    */
  var majorDimension: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** The A1 notation of the values to retrieve. */
  var ranges: js.UndefOr[String | js.Array[String]] = js.undefined
  /** The ID of the spreadsheet to retrieve data from. */
  var spreadsheetId: String
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
  /**
    * How values should be represented in the output.
    * The default render option is ValueRenderOption.FORMATTED_VALUE.
    */
  var valueRenderOption: js.UndefOr[String] = js.undefined
}

object Anon_AccesstokenAltCallbackDateTimeRenderOption {
  @scala.inline
  def apply(
    spreadsheetId: String,
    `$.xgafv`: String = null,
    access_token: String = null,
    alt: String = null,
    callback: String = null,
    dateTimeRenderOption: String = null,
    fields: String = null,
    key: String = null,
    majorDimension: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    ranges: String | js.Array[String] = null,
    uploadType: String = null,
    upload_protocol: String = null,
    valueRenderOption: String = null
  ): Anon_AccesstokenAltCallbackDateTimeRenderOption = {
    val __obj = js.Dynamic.literal(spreadsheetId = spreadsheetId)
    if (`$.xgafv` != null) __obj.updateDynamic("$.xgafv")(`$.xgafv`)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (dateTimeRenderOption != null) __obj.updateDynamic("dateTimeRenderOption")(dateTimeRenderOption)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (majorDimension != null) __obj.updateDynamic("majorDimension")(majorDimension)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (ranges != null) __obj.updateDynamic("ranges")(ranges.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType)
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol)
    if (valueRenderOption != null) __obj.updateDynamic("valueRenderOption")(valueRenderOption)
    __obj.asInstanceOf[Anon_AccesstokenAltCallbackDateTimeRenderOption]
  }
}

