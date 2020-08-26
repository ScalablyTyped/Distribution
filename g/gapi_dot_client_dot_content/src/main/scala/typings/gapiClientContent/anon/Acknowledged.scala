package typings.gapiClientContent.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acknowledged extends js.Object {
  /**
    * Obtains orders that match the acknowledgement status. When set to true, obtains orders that have been acknowledged. When false, obtains orders that
    * have not been acknowledged.
    * We recommend using this filter set to false, in conjunction with the acknowledge call, such that only un-acknowledged orders are returned.
    */
  var acknowledged: js.UndefOr[Boolean] = js.native
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /**
    * The maximum number of orders to return in the response, used for paging. The default value is 25 orders per page, and the maximum allowed value is 250
    * orders per page.
    * Known issue: All List calls will return all Orders without limit regardless of the value of this field.
    */
  var maxResults: js.UndefOr[Double] = js.native
  /** The ID of the managing account. */
  var merchantId: String = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /**
    * The ordering of the returned list. The only supported value are placedDate desc and placedDate asc for now, which returns orders sorted by placement
    * date. "placedDate desc" stands for listing orders by placement date, from oldest to most recent. "placedDate asc" stands for listing orders by
    * placement date, from most recent to oldest. In future releases we'll support other sorting criteria.
    */
  var orderBy: js.UndefOr[String] = js.native
  /** The token returned by the previous request. */
  var pageToken: js.UndefOr[String] = js.native
  /** Obtains orders placed before this date (exclusively), in ISO 8601 format. */
  var placedDateEnd: js.UndefOr[String] = js.native
  /** Obtains orders placed after this date (inclusively), in ISO 8601 format. */
  var placedDateStart: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * Obtains orders that match any of the specified statuses. Multiple values can be specified with comma separation. Additionally, please note that active
    * is a shortcut for pendingShipment and partiallyShipped, and completed is a shortcut for shipped , partiallyDelivered, delivered, partiallyReturned,
    * returned, and canceled.
    */
  var statuses: js.UndefOr[String] = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object Acknowledged {
  @scala.inline
  def apply(merchantId: String): Acknowledged = {
    val __obj = js.Dynamic.literal(merchantId = merchantId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Acknowledged]
  }
  @scala.inline
  implicit class AcknowledgedOps[Self <: Acknowledged] (val x: Self) extends AnyVal {
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
    def setMerchantId(value: String): Self = this.set("merchantId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAcknowledged(value: Boolean): Self = this.set("acknowledged", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAcknowledged: Self = this.set("acknowledged", js.undefined)
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMaxResults(value: Double): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setOrderBy(value: String): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPlacedDateEnd(value: String): Self = this.set("placedDateEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacedDateEnd: Self = this.set("placedDateEnd", js.undefined)
    @scala.inline
    def setPlacedDateStart(value: String): Self = this.set("placedDateStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacedDateStart: Self = this.set("placedDateStart", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setStatuses(value: String): Self = this.set("statuses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatuses: Self = this.set("statuses", js.undefined)
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
  
}

