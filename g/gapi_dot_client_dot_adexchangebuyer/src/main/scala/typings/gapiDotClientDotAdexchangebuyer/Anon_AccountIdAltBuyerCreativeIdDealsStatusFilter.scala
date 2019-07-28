package typings.gapiDotClientDotAdexchangebuyer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccountIdAltBuyerCreativeIdDealsStatusFilter extends js.Object {
  /** When specified, only creatives for the given account ids are returned. */
  var accountId: js.UndefOr[Double] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** When specified, only creatives for the given buyer creative ids are returned. */
  var buyerCreativeId: js.UndefOr[String] = js.undefined
  /** When specified, only creatives having the given deals status are returned. */
  var dealsStatusFilter: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** Maximum number of entries returned on one result page. If not set, the default is 100. Optional. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** When specified, only creatives having the given open auction status are returned. */
  var openAuctionStatusFilter: js.UndefOr[String] = js.undefined
  /**
    * A continuation token, used to page through ad clients. To retrieve the next page, set this parameter to the value of "nextPageToken" from the previous
    * response. Optional.
    */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_AccountIdAltBuyerCreativeIdDealsStatusFilter {
  @scala.inline
  def apply(
    accountId: Int | Double = null,
    alt: String = null,
    buyerCreativeId: String = null,
    dealsStatusFilter: String = null,
    fields: String = null,
    key: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    openAuctionStatusFilter: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): Anon_AccountIdAltBuyerCreativeIdDealsStatusFilter = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (buyerCreativeId != null) __obj.updateDynamic("buyerCreativeId")(buyerCreativeId)
    if (dealsStatusFilter != null) __obj.updateDynamic("dealsStatusFilter")(dealsStatusFilter)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (openAuctionStatusFilter != null) __obj.updateDynamic("openAuctionStatusFilter")(openAuctionStatusFilter)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AccountIdAltBuyerCreativeIdDealsStatusFilter]
  }
}

