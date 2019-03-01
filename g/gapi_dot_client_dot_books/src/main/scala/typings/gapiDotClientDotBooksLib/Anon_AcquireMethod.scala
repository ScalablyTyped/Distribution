package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AcquireMethod extends js.Object {
  /** How the book was acquired */
  var acquireMethod: js.UndefOr[java.lang.String] = js.undefined
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** ISO-3166-1 code to override the IP-based location. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** ISO-639-1 language and ISO-3166-1 country code. Ex:'en_US'. Used for generating recommendations. */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** The processing state of the user uploaded volumes to be returned. Applicable only if the UPLOADED is specified in the acquireMethod. */
  var processingState: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** String to identify the originator of this request. */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /** Index of the first result to return (starts at 0) */
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AcquireMethod {
  @scala.inline
  def apply(
    acquireMethod: java.lang.String = null,
    alt: java.lang.String = null,
    country: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    locale: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    processingState: java.lang.String = null,
    quotaUser: java.lang.String = null,
    source: java.lang.String = null,
    startIndex: scala.Int | scala.Double = null,
    userIp: java.lang.String = null
  ): Anon_AcquireMethod = {
    val __obj = js.Dynamic.literal()
    if (acquireMethod != null) __obj.updateDynamic("acquireMethod")(acquireMethod)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (country != null) __obj.updateDynamic("country")(country)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (processingState != null) __obj.updateDynamic("processingState")(processingState)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (source != null) __obj.updateDynamic("source")(source)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AcquireMethod]
  }
}

