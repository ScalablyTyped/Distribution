package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltCountryFields extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** ISO-3166-1 code to override the IP-based location. */
  var country: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** Set to true to include non-comics series. Defaults to false. */
  var includeNonComicsSeries: js.UndefOr[scala.Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Brand results for partner ID. */
  var partner: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** Restrict information returned to a set of selected fields. */
  var projection: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** String to identify the originator of this request. */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  var user_library_consistent_read: js.UndefOr[scala.Boolean] = js.undefined
  /** ID of volume to retrieve. */
  var volumeId: java.lang.String
}

object Anon_AltCountryFields {
  @scala.inline
  def apply(
    volumeId: java.lang.String,
    alt: java.lang.String = null,
    country: java.lang.String = null,
    fields: java.lang.String = null,
    includeNonComicsSeries: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    partner: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    projection: java.lang.String = null,
    quotaUser: java.lang.String = null,
    source: java.lang.String = null,
    userIp: java.lang.String = null,
    user_library_consistent_read: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AltCountryFields = {
    val __obj = js.Dynamic.literal(volumeId = volumeId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (country != null) __obj.updateDynamic("country")(country)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(includeNonComicsSeries)) __obj.updateDynamic("includeNonComicsSeries")(includeNonComicsSeries)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (partner != null) __obj.updateDynamic("partner")(partner)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (projection != null) __obj.updateDynamic("projection")(projection)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (source != null) __obj.updateDynamic("source")(source)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    if (!js.isUndefined(user_library_consistent_read)) __obj.updateDynamic("user_library_consistent_read")(user_library_consistent_read)
    __obj.asInstanceOf[Anon_AltCountryFields]
  }
}

