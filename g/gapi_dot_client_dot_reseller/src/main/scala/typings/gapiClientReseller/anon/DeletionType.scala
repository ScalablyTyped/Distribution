package typings.gapiClientReseller.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletionType extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /**
    * Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a
    * key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    */
  var customerId: String = js.native
  /** The deletionType query string enables the cancellation, downgrade, or suspension of a subscription. */
  var deletionType: String = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * This is a required property. The subscriptionId is the subscription identifier and is unique for each customer. Since a subscriptionId changes when a
    * subscription is updated, we recommend to not use this ID as a key for persistent data. And the subscriptionId can be found using the retrieve all
    * reseller subscriptions method.
    */
  var subscriptionId: String = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object DeletionType {
  @scala.inline
  def apply(customerId: String, deletionType: String, subscriptionId: String): DeletionType = {
    val __obj = js.Dynamic.literal(customerId = customerId.asInstanceOf[js.Any], deletionType = deletionType.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletionType]
  }
  @scala.inline
  implicit class DeletionTypeOps[Self <: DeletionType] (val x: Self) extends AnyVal {
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
    def setCustomerId(value: String): Self = this.set("customerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletionType(value: String): Self = this.set("deletionType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubscriptionId(value: String): Self = this.set("subscriptionId", value.asInstanceOf[js.Any])
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
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
  
}

