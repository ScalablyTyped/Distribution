package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDownload extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Restrict to volumes by download availability. */
  var download: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** Filter search results. */
  var filter: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** Restrict results to books with this language code. */
  var langRestrict: js.UndefOr[String] = js.undefined
  /** Restrict search to this user's library. */
  var libraryRestrict: js.UndefOr[String] = js.undefined
  /** The maximum allowed maturity rating of returned recommendations. Books with a higher maturity rating are filtered out. */
  var maxAllowedMaturityRating: js.UndefOr[String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Sort search results. */
  var orderBy: js.UndefOr[String] = js.undefined
  /** Restrict and brand results for partner ID. */
  var partner: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Restrict to books or magazines. */
  var printType: js.UndefOr[String] = js.undefined
  /** Restrict information returned to a set of selected fields. */
  var projection: js.UndefOr[String] = js.undefined
  /** Full-text search query string. */
  var q: String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Set to true to show books available for preorder. Defaults to false. */
  var showPreorders: js.UndefOr[Boolean] = js.undefined
  /** String to identify the originator of this request. */
  var source: js.UndefOr[String] = js.undefined
  /** Index of the first result to return (starts at 0) */
  var startIndex: js.UndefOr[Double] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
}

object AnonDownload {
  @scala.inline
  def apply(
    q: String,
    alt: String = null,
    download: String = null,
    fields: String = null,
    filter: String = null,
    key: String = null,
    langRestrict: String = null,
    libraryRestrict: String = null,
    maxAllowedMaturityRating: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    orderBy: String = null,
    partner: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    printType: String = null,
    projection: String = null,
    quotaUser: String = null,
    showPreorders: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    startIndex: Int | Double = null,
    userIp: String = null
  ): AnonDownload = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (download != null) __obj.updateDynamic("download")(download.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(filter.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (langRestrict != null) __obj.updateDynamic("langRestrict")(langRestrict.asInstanceOf[js.Any])
    if (libraryRestrict != null) __obj.updateDynamic("libraryRestrict")(libraryRestrict.asInstanceOf[js.Any])
    if (maxAllowedMaturityRating != null) __obj.updateDynamic("maxAllowedMaturityRating")(maxAllowedMaturityRating.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy.asInstanceOf[js.Any])
    if (partner != null) __obj.updateDynamic("partner")(partner.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (printType != null) __obj.updateDynamic("printType")(printType.asInstanceOf[js.Any])
    if (projection != null) __obj.updateDynamic("projection")(projection.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(showPreorders)) __obj.updateDynamic("showPreorders")(showPreorders.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDownload]
  }
}

