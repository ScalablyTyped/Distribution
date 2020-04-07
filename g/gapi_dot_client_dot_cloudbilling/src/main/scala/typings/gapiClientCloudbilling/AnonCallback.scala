package typings.gapiClientCloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCallback extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.undefined
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[String] = js.undefined
  /**
    * The ISO 4217 currency code for the pricing info in the response proto.
    * Will use the conversion rate as of start_time.
    * Optional. If not specified USD will be used.
    */
  var currencyCode: js.UndefOr[String] = js.undefined
  /**
    * Optional exclusive end time of the time range for which the pricing
    * versions will be returned. Timestamps in the future are not allowed.
    * Maximum allowable time range is 1 month (31 days). Time range as a whole
    * is optional. If not specified, the latest pricing will be returned (up to
    * 12 hours old at most).
    */
  var endTime: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Requested page size. Defaults to 5000. */
  var pageSize: js.UndefOr[Double] = js.undefined
  /**
    * A token identifying a page of results to return. This should be a
    * `next_page_token` value returned from a previous `ListSkus`
    * call. If unspecified, the first page of results is returned.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /**
    * The name of the service.
    * Example: "services/DA34-426B-A397"
    */
  var parent: String
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * Optional inclusive start time of the time range for which the pricing
    * versions will be returned. Timestamps in the future are not allowed.
    * Maximum allowable time range is 1 month (31 days). Time range as a whole
    * is optional. If not specified, the latest pricing will be returned (up to
    * 12 hours old at most).
    */
  var startTime: js.UndefOr[String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.undefined
}

object AnonCallback {
  @scala.inline
  def apply(
    parent: String,
    $Dotxgafv: String = null,
    access_token: String = null,
    alt: String = null,
    bearer_token: String = null,
    callback: String = null,
    currencyCode: String = null,
    endTime: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    pageSize: Int | Double = null,
    pageToken: String = null,
    pp: js.UndefOr[Boolean] = js.undefined,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    startTime: String = null,
    uploadType: String = null,
    upload_protocol: String = null
  ): AnonCallback = {
    val __obj = js.Dynamic.literal(parent = parent.asInstanceOf[js.Any])
    if ($Dotxgafv != null) __obj.updateDynamic("$.xgafv")($Dotxgafv.asInstanceOf[js.Any])
    if (access_token != null) __obj.updateDynamic("access_token")(access_token.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token.asInstanceOf[js.Any])
    if (callback != null) __obj.updateDynamic("callback")(callback.asInstanceOf[js.Any])
    if (currencyCode != null) __obj.updateDynamic("currencyCode")(currencyCode.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType.asInstanceOf[js.Any])
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCallback]
  }
}

