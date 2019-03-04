package typings
package gapiDotClientDotWebmastersLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltCategory extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The crawl error category. For example: serverError. If not specified, returns results for all categories. */
  var category: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** If true, returns only the latest crawl error counts. */
  var latestCountsOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** The user agent type (platform) that made the request. For example: web. If not specified, returns results for all platforms. */
  var platform: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** The site's URL, including protocol. For example: http://www.example.com/ */
  var siteUrl: java.lang.String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltCategory {
  @scala.inline
  def apply(
    siteUrl: java.lang.String,
    alt: java.lang.String = null,
    category: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    latestCountsOnly: js.UndefOr[scala.Boolean] = js.undefined,
    oauth_token: java.lang.String = null,
    platform: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltCategory = {
    val __obj = js.Dynamic.literal(siteUrl = siteUrl)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (category != null) __obj.updateDynamic("category")(category)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (!js.isUndefined(latestCountsOnly)) __obj.updateDynamic("latestCountsOnly")(latestCountsOnly)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltCategory]
  }
}

