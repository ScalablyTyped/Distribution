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

