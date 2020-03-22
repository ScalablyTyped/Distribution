package typings.gapiClientCloudbilling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCallback extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /**
    * The ISO 4217 currency code for the pricing info in the response proto.
    * Will use the conversion rate as of start_time.
    * Optional. If not specified USD will be used.
    */
  var currencyCode: js.UndefOr[String] = js.native
  /**
    * Optional exclusive end time of the time range for which the pricing
    * versions will be returned. Timestamps in the future are not allowed.
    * Maximum allowable time range is 1 month (31 days). Time range as a whole
    * is optional. If not specified, the latest pricing will be returned (up to
    * 12 hours old at most).
    */
  var endTime: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Requested page size. Defaults to 5000. */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results to return. This should be a
    * `next_page_token` value returned from a previous `ListSkus`
    * call. If unspecified, the first page of results is returned.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * The name of the service.
    * Example: "services/DA34-426B-A397"
    */
  var parent: String = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * Optional inclusive start time of the time range for which the pricing
    * versions will be returned. Timestamps in the future are not allowed.
    * Maximum allowable time range is 1 month (31 days). Time range as a whole
    * is optional. If not specified, the latest pricing will be returned (up to
    * 12 hours old at most).
    */
  var startTime: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

