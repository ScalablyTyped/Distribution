package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltDownload extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Restrict to volumes by download availability. */
  var download: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Filter search results. */
  var filter: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Restrict results to books with this language code. */
  var langRestrict: js.UndefOr[java.lang.String] = js.undefined
  /** Restrict search to this user's library. */
  var libraryRestrict: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum allowed maturity rating of returned recommendations. Books with a higher maturity rating are filtered out. */
  var maxAllowedMaturityRating: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Sort search results. */
  var orderBy: js.UndefOr[java.lang.String] = js.undefined
  /** Restrict and brand results for partner ID. */
  var partner: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Restrict to books or magazines. */
  var printType: js.UndefOr[java.lang.String] = js.undefined
  /** Restrict information returned to a set of selected fields. */
  var projection: js.UndefOr[java.lang.String] = js.undefined
  /** Full-text search query string. */
  var q: java.lang.String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Set to true to show books available for preorder. Defaults to false. */
  var showPreorders: js.UndefOr[scala.Boolean] = js.undefined
  /** String to identify the originator of this request. */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /** Index of the first result to return (starts at 0) */
  var startIndex: js.UndefOr[scala.Double] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltDownload {
  @scala.inline
  def apply(
    q: java.lang.String,
    alt: java.lang.String = null,
    download: java.lang.String = null,
    fields: java.lang.String = null,
    filter: java.lang.String = null,
    key: java.lang.String = null,
    langRestrict: java.lang.String = null,
    libraryRestrict: java.lang.String = null,
    maxAllowedMaturityRating: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    orderBy: java.lang.String = null,
    partner: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    printType: java.lang.String = null,
    projection: java.lang.String = null,
    quotaUser: java.lang.String = null,
    showPreorders: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null,
    startIndex: scala.Int | scala.Double = null,
    userIp: java.lang.String = null
  ): Anon_AltDownload = {
    val __obj = js.Dynamic.literal(q = q)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (download != null) __obj.updateDynamic("download")(download)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (filter != null) __obj.updateDynamic("filter")(filter)
    if (key != null) __obj.updateDynamic("key")(key)
    if (langRestrict != null) __obj.updateDynamic("langRestrict")(langRestrict)
    if (libraryRestrict != null) __obj.updateDynamic("libraryRestrict")(libraryRestrict)
    if (maxAllowedMaturityRating != null) __obj.updateDynamic("maxAllowedMaturityRating")(maxAllowedMaturityRating)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy)
    if (partner != null) __obj.updateDynamic("partner")(partner)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (printType != null) __obj.updateDynamic("printType")(printType)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (!js.isUndefined(showPreorders)) __obj.updateDynamic("showPreorders")(showPreorders)
    if (source != null) __obj.updateDynamic("source")(source)
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltDownload]
  }
}

