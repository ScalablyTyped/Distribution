package typings
package gapiDotClientDotAdexchangebuyer2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccesstokenAccountIdAltBearertokenCallbackFieldsKey extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The account to list the creatives from.
    * Specify "-" to list all creatives the current user has access to.
    */
  var accountId: java.lang.String
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Requested page size. The server may return fewer creatives than requested
    * (due to timeout constraint) even if more are available via another call.
    * If unspecified, server will pick an appropriate default.
    * Acceptable values are 1 to 1000, inclusive.
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of
    * ListCreativesResponse.next_page_token
    * returned from the previous call to 'ListCreatives' method.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
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
  var query: js.UndefOr[java.lang.String] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}

