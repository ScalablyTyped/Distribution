package typings.gapiDotClientDotAdexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeStatusId extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /** Account ID of the buyer. */
  var accountId: String = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /**
    * The ID of the creative status for which to retrieve a breakdown by detail.
    * See
    * [creative-status-codes](https://developers.google.com/ad-exchange/rtb/downloads/creative-status-codes).
    * Details are only available for statuses 10, 14, 15, 17, 18, 19, 86, and 87.
    */
  var creativeStatusId: Double = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** The ID of the filter set to apply. */
  var filterSetId: String = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * Requested page size. The server may return fewer results than requested.
    * If unspecified, the server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of
    * ListCreativeStatusBreakdownByDetailResponse.nextPageToken
    * returned from the previous call to the
    * accounts.filterSets.filteredBids.details.list
    * method.
    */
  var pageToken: js.UndefOr[String] = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

