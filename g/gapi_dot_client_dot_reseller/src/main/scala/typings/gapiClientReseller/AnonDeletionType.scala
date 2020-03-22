package typings.gapiClientReseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeletionType extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /**
    * Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a
    * key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    */
  var customerId: String
  /** The deletionType query string enables the cancellation, downgrade, or suspension of a subscription. */
  var deletionType: String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /**
    * This is a required property. The subscriptionId is the subscription identifier and is unique for each customer. Since a subscriptionId changes when a
    * subscription is updated, we recommend to not use this ID as a key for persistent data. And the subscriptionId can be found using the retrieve all
    * reseller subscriptions method.
    */
  var subscriptionId: String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object AnonDeletionType {
  @scala.inline
  def apply(
    customerId: String,
    deletionType: String,
    subscriptionId: String,
    alt: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): AnonDeletionType = {
    val __obj = js.Dynamic.literal(customerId = customerId.asInstanceOf[js.Any], deletionType = deletionType.asInstanceOf[js.Any], subscriptionId = subscriptionId.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeletionType]
  }
}

