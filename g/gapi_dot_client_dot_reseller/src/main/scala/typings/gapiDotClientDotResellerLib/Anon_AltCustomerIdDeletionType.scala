package typings
package gapiDotClientDotResellerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltCustomerIdDeletionType extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a
    * key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    */
  var customerId: java.lang.String
  /** The deletionType query string enables the cancellation, downgrade, or suspension of a subscription. */
  var deletionType: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This is a required property. The subscriptionId is the subscription identifier and is unique for each customer. Since a subscriptionId changes when a
    * subscription is updated, we recommend to not use this ID as a key for persistent data. And the subscriptionId can be found using the retrieve all
    * reseller subscriptions method.
    */
  var subscriptionId: java.lang.String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltCustomerIdDeletionType {
  @scala.inline
  def apply(
    customerId: java.lang.String,
    deletionType: java.lang.String,
    subscriptionId: java.lang.String,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltCustomerIdDeletionType = {
    val __obj = js.Dynamic.literal(customerId = customerId, deletionType = deletionType, subscriptionId = subscriptionId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltCustomerIdDeletionType]
  }
}

