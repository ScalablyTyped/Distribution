package typings
package gapiDotClientDotContentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Acknowledged extends js.Object {
  /**
    * Obtains orders that match the acknowledgement status. When set to true, obtains orders that have been acknowledged. When false, obtains orders that
    * have not been acknowledged.
    * We recommend using this filter set to false, in conjunction with the acknowledge call, such that only un-acknowledged orders are returned.
    */
  var acknowledged: js.UndefOr[scala.Boolean] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The maximum number of orders to return in the response, used for paging. The default value is 25 orders per page, and the maximum allowed value is 250
    * orders per page.
    * Known issue: All List calls will return all Orders without limit regardless of the value of this field.
    */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** The ID of the managing account. */
  var merchantId: java.lang.String
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The ordering of the returned list. The only supported value are placedDate desc and placedDate asc for now, which returns orders sorted by placement
    * date. "placedDate desc" stands for listing orders by placement date, from oldest to most recent. "placedDate asc" stands for listing orders by
    * placement date, from most recent to oldest. In future releases we'll support other sorting criteria.
    */
  var orderBy: js.UndefOr[java.lang.String] = js.undefined
  /** The token returned by the previous request. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Obtains orders placed before this date (exclusively), in ISO 8601 format. */
  var placedDateEnd: js.UndefOr[java.lang.String] = js.undefined
  /** Obtains orders placed after this date (inclusively), in ISO 8601 format. */
  var placedDateStart: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Obtains orders that match any of the specified statuses. Multiple values can be specified with comma separation. Additionally, please note that active
    * is a shortcut for pendingShipment and partiallyShipped, and completed is a shortcut for shipped , partiallyDelivered, delivered, partiallyReturned,
    * returned, and canceled.
    */
  var statuses: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Acknowledged {
  @scala.inline
  def apply(
    merchantId: java.lang.String,
    acknowledged: js.UndefOr[scala.Boolean] = js.undefined,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    orderBy: java.lang.String = null,
    pageToken: java.lang.String = null,
    placedDateEnd: java.lang.String = null,
    placedDateStart: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    statuses: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_Acknowledged = {
    val __obj = js.Dynamic.literal(merchantId = merchantId)
    if (!js.isUndefined(acknowledged)) __obj.updateDynamic("acknowledged")(acknowledged)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (placedDateEnd != null) __obj.updateDynamic("placedDateEnd")(placedDateEnd)
    if (placedDateStart != null) __obj.updateDynamic("placedDateStart")(placedDateStart)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (statuses != null) __obj.updateDynamic("statuses")(statuses)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_Acknowledged]
  }
}

