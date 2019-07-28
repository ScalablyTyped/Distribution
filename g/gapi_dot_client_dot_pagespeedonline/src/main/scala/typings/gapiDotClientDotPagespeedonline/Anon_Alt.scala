package typings.gapiDotClientDotPagespeedonline

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Alt extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Indicates if third party resources should be filtered out before PageSpeed analysis. */
  var filter_third_party_resources: js.UndefOr[Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** The locale used to localize formatted results */
  var locale: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** A PageSpeed rule to run; if none are given, all rules are run */
  var rule: js.UndefOr[String] = js.undefined
  /** Indicates if binary data containing a screenshot should be included */
  var screenshot: js.UndefOr[Boolean] = js.undefined
  /** The analysis strategy to use */
  var strategy: js.UndefOr[String] = js.undefined
  /** The URL to fetch and analyze */
  var url: String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object Anon_Alt {
  @scala.inline
  def apply(
    url: String,
    alt: String = null,
    fields: String = null,
    filter_third_party_resources: js.UndefOr[Boolean] = js.undefined,
    key: String = null,
    locale: String = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    rule: String = null,
    screenshot: js.UndefOr[Boolean] = js.undefined,
    strategy: String = null,
    userIp: String = null
  ): Anon_Alt = {
    val __obj = js.Dynamic.literal(url = url)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(filter_third_party_resources)) __obj.updateDynamic("filter_third_party_resources")(filter_third_party_resources)
    if (key != null) __obj.updateDynamic("key")(key)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (rule != null) __obj.updateDynamic("rule")(rule)
    if (!js.isUndefined(screenshot)) __obj.updateDynamic("screenshot")(screenshot)
    if (strategy != null) __obj.updateDynamic("strategy")(strategy)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_Alt]
  }
}

