package typings
package gapiDotClientDotAndroidenterpriseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltApproved extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies whether to search among all products (false) or among only products that have been approved (true). Only "true" is supported, and should be
    * specified.
    */
  var approved: js.UndefOr[scala.Boolean] = js.undefined
  /** The ID of the enterprise. */
  var enterpriseId: java.lang.String
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The BCP47 tag for the user's preferred language (e.g. "en-US", "de"). Results are returned in the language best matching the preferred language. */
  var language: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Specifies the maximum number of products that can be returned per request. If not specified, uses a default value of 100, which is also the maximum
    * retrievable within a single response.
    */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The search query as typed in the Google Play store search box. If omitted, all approved apps will be returned (using the pagination parameters),
    * including apps that are not available in the store (e.g. unpublished apps).
    */
  var query: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A pagination token is contained in a request''s response when there are more products. The token can be used in a subsequent request to obtain more
    * products, and so forth. This parameter cannot be used in the initial request.
    */
  var token: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltApproved {
  @scala.inline
  def apply(
    enterpriseId: java.lang.String,
    alt: java.lang.String = null,
    approved: js.UndefOr[scala.Boolean] = js.undefined,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    language: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    query: java.lang.String = null,
    quotaUser: java.lang.String = null,
    token: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltApproved = {
    val __obj = js.Dynamic.literal(enterpriseId = enterpriseId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (!js.isUndefined(approved)) __obj.updateDynamic("approved")(approved)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (language != null) __obj.updateDynamic("language")(language)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (query != null) __obj.updateDynamic("query")(query)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (token != null) __obj.updateDynamic("token")(token)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltApproved]
  }
}

