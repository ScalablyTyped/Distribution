package typings
package gapiDotClientDotContentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxResultsPrettyPrintPageToken extends js.Object {
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

