package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltAssociation extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Association type. */
  var association: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. Used for generating recommendations. */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum allowed maturity rating of returned recommendations. Books with a higher maturity rating are filtered out. */
  var maxAllowedMaturityRating: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** String to identify the originator of this request. */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /** ID of the source volume. */
  var volumeId: java.lang.String
}

object Anon_AltAssociation {
  @scala.inline
  def apply(
    volumeId: java.lang.String,
    alt: java.lang.String = null,
    association: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    locale: java.lang.String = null,
    maxAllowedMaturityRating: java.lang.String = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    source: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltAssociation = {
    val __obj = js.Dynamic.literal(volumeId = volumeId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (association != null) __obj.updateDynamic("association")(association)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxAllowedMaturityRating != null) __obj.updateDynamic("maxAllowedMaturityRating")(maxAllowedMaturityRating)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (source != null) __obj.updateDynamic("source")(source)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltAssociation]
  }
}

