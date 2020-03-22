package typings.gapiClientAdexchangebuyer2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonOauthtoken extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var $Dotxgafv: js.UndefOr[String] = js.native
  /** OAuth access token. */
  var access_token: js.UndefOr[String] = js.native
  /**
    * The account to list the creatives from.
    * Specify "-" to list all creatives the current user has access to.
    */
  var accountId: String = js.native
  /** Data format for response. */
  var alt: js.UndefOr[String] = js.native
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[String] = js.native
  /** JSONP */
  var callback: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * Requested page size. The server may return fewer creatives than requested
    * (due to timeout constraint) even if more are available via another call.
    * If unspecified, server will pick an appropriate default.
    * Acceptable values are 1 to 1000, inclusive.
    */
  var pageSize: js.UndefOr[Double] = js.native
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of
    * ListCreativesResponse.next_page_token
    * returned from the previous call to 'ListCreatives' method.
    */
  var pageToken: js.UndefOr[String] = js.native
  /** Pretty-print response. */
  var pp: js.UndefOr[Boolean] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * An optional query string to filter creatives. If no filter is specified,
    * all active creatives will be returned.
    * Supported queries are:
    * <ul>
    * <li>accountId=<i>account_id_string</i>
    * <li>creativeId=<i>creative_id_string</i>
    * <li>dealsStatus: {approved, conditionally_approved, disapproved,
    * not_checked}
    * <li>openAuctionStatus: {approved, conditionally_approved, disapproved,
    * not_checked}
    * <li>attribute: {a numeric attribute from the list of attributes}
    * <li>disapprovalReason: {a reason from
    * DisapprovalReason
    * </ul>
    * Example: 'accountId=12345 AND (dealsStatus:disapproved AND
    * disapprovalReason:unacceptable_content) OR attribute:47'
    */
  var query: js.UndefOr[String] = js.native
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[String] = js.native
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[String] = js.native
}

