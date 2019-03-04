package typings
package gapiDotClientDotAdexchangebuyer2Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeIdFields extends js.Object {
  /** V1 error format. */
  @JSName("$.xgafv")
  var `$.xgafv`: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth access token. */
  var access_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The account to list the associations from.
    * Specify "-" to list all creatives the current user has access to.
    */
  var accountId: java.lang.String
  /** Data format for response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth bearer token. */
  var bearer_token: js.UndefOr[java.lang.String] = js.undefined
  /** JSONP */
  var callback: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The creative ID to list the associations from.
    * Specify "-" to list all creatives under the above account.
    */
  var creativeId: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Requested page size. Server may return fewer associations than requested.
    * If unspecified, server will pick an appropriate default.
    */
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * A token identifying a page of results the server should return.
    * Typically, this is the value of
    * ListDealAssociationsResponse.next_page_token
    * returned from the previous call to 'ListDealAssociations' method.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Pretty-print response. */
  var pp: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An optional query string to filter deal associations. If no filter is
    * specified, all associations will be returned.
    * Supported queries are:
    * <ul>
    * <li>accountId=<i>account_id_string</i>
    * <li>creativeId=<i>creative_id_string</i>
    * <li>dealsId=<i>deals_id_string</i>
    * <li>dealsStatus:{approved, conditionally_approved, disapproved,
    * not_checked}
    * <li>openAuctionStatus:{approved, conditionally_approved, disapproved,
    * not_checked}
    * </ul>
    * Example: 'dealsId=12345 AND dealsStatus:disapproved'
    */
  var query: js.UndefOr[java.lang.String] = js.undefined
  /** Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters. */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Legacy upload protocol for media (e.g. "media", "multipart"). */
  var uploadType: js.UndefOr[java.lang.String] = js.undefined
  /** Upload protocol for media (e.g. "raw", "multipart"). */
  var upload_protocol: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeIdFields {
  @scala.inline
  def apply(
    accountId: java.lang.String,
    creativeId: java.lang.String,
    `$.xgafv`: java.lang.String = null,
    access_token: java.lang.String = null,
    alt: java.lang.String = null,
    bearer_token: java.lang.String = null,
    callback: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    pageSize: scala.Int | scala.Double = null,
    pageToken: java.lang.String = null,
    pp: js.UndefOr[scala.Boolean] = js.undefined,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    query: java.lang.String = null,
    quotaUser: java.lang.String = null,
    uploadType: java.lang.String = null,
    upload_protocol: java.lang.String = null
  ): Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeIdFields = {
    val __obj = js.Dynamic.literal(accountId = accountId, creativeId = creativeId)
    if (`$.xgafv` != null) __obj.updateDynamic("$.xgafv")(`$.xgafv`)
    if (access_token != null) __obj.updateDynamic("access_token")(access_token)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (bearer_token != null) __obj.updateDynamic("bearer_token")(bearer_token)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(pp)) __obj.updateDynamic("pp")(pp)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (query != null) __obj.updateDynamic("query")(query)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (uploadType != null) __obj.updateDynamic("uploadType")(uploadType)
    if (upload_protocol != null) __obj.updateDynamic("upload_protocol")(upload_protocol)
    __obj.asInstanceOf[Anon_AccesstokenAccountIdAltBearertokenCallbackCreativeIdFields]
  }
}

