package typings.gapiClientSheets.anon

import typings.gapiClientSheets.gapi.client.sheets.ValueRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResponseDateTimeRenderOption extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /**
    * Determines if the update response should include the values
    * of the cells that were updated. By default, responses
    * do not include the updated values.
    * If the range to write was larger than the range actually written, the
    * response includes all values in the requested range (excluding trailing
    * empty rows and columns).
    */
  var includeValuesInResponse: js.UndefOr[Boolean] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** The A1 notation of the values to update. */
  var range: String = js.native
  /** Request body */
  var resource: ValueRange = js.native
  /**
    * Determines how dates, times, and durations in the response should be
    * rendered. This is ignored if response_value_render_option is
    * FORMATTED_VALUE.
    * The default dateTime render option is
    * DateTimeRenderOption.SERIAL_NUMBER.
    */
  var responseDateTimeRenderOption: js.UndefOr[String] = js.native
  /**
    * Determines how values in the response should be rendered.
    * The default render option is ValueRenderOption.FORMATTED_VALUE.
    */
  var responseValueRenderOption: js.UndefOr[String] = js.native
  /** The ID of the spreadsheet to update. */
  var spreadsheetId: String = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
  /** How the input data should be interpreted. */
  var valueInputOption: js.UndefOr[String] = js.native
}

object ResponseDateTimeRenderOption {
  @scala.inline
  def apply(range: String, resource: ValueRange, spreadsheetId: String): ResponseDateTimeRenderOption = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], spreadsheetId = spreadsheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseDateTimeRenderOption]
  }
  @scala.inline
  implicit class ResponseDateTimeRenderOptionOps[Self <: ResponseDateTimeRenderOption] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRange(value: String): Self = this.set("range", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: ValueRange): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpreadsheetId(value: String): Self = this.set("spreadsheetId", value.asInstanceOf[js.Any])
    @scala.inline
    def set$Dotxgafv(value: String): Self = this.set("$.xgafv", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$Dotxgafv: Self = this.set("$.xgafv", js.undefined)
    @scala.inline
    def setAccess_token(value: String): Self = this.set("access_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccess_token: Self = this.set("access_token", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setCallback(value: String): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setIncludeValuesInResponse(value: Boolean): Self = this.set("includeValuesInResponse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeValuesInResponse: Self = this.set("includeValuesInResponse", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setResponseDateTimeRenderOption(value: String): Self = this.set("responseDateTimeRenderOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseDateTimeRenderOption: Self = this.set("responseDateTimeRenderOption", js.undefined)
    @scala.inline
    def setResponseValueRenderOption(value: String): Self = this.set("responseValueRenderOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseValueRenderOption: Self = this.set("responseValueRenderOption", js.undefined)
    @scala.inline
    def setUploadType(value: String): Self = this.set("uploadType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadType: Self = this.set("uploadType", js.undefined)
    @scala.inline
    def setUpload_protocol(value: String): Self = this.set("upload_protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpload_protocol: Self = this.set("upload_protocol", js.undefined)
    @scala.inline
    def setValueInputOption(value: String): Self = this.set("valueInputOption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValueInputOption: Self = this.set("valueInputOption", js.undefined)
  }
  
}

