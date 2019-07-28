package typings.gapiDotClientDotReseller

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltCustomerAuthTokenCustomerId extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /**
    * The customerAuthToken query string is required when creating a resold account that transfers a direct customer's subscription or transfers another
    * reseller customer's subscription to your reseller management. This is a hexadecimal authentication token needed to complete the subscription transfer.
    * For more information, see the administrator help center.
    */
  var customerAuthToken: js.UndefOr[String] = js.undefined
  /**
    * Either the customer's primary domain name or the customer's unique identifier. If using the domain name, we do not recommend using a customerId as a
    * key for persistent data. If the domain name for a customerId is changed, the Google system automatically updates.
    */
  var customerId: String
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
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_AltCustomerAuthTokenCustomerId {
  @scala.inline
  def apply(
    customerId: String,
    alt: String = null,
    customerAuthToken: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    userIp: String = null
  ): Anon_AltCustomerAuthTokenCustomerId = {
    val __obj = js.Dynamic.literal(customerId = customerId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (customerAuthToken != null) __obj.updateDynamic("customerAuthToken")(customerAuthToken)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltCustomerAuthTokenCustomerId]
  }
}

