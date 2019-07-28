package typings.gapiDotClientDotBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltFieldsKeyLocaleMaxResults extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. Used for generating recommendations. */
  var locale: js.UndefOr[String] = js.undefined
  /** Maximum number of results to return. */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** The processing state of the user uploaded volumes to be returned. */
  var processingState: js.UndefOr[String] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** String to identify the originator of this request. */
  var source: js.UndefOr[String] = js.undefined
  /** Index of the first result to return (starts at 0) */
  var startIndex: js.UndefOr[Double] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /** The ids of the volumes to be returned. If not specified all that match the processingState are returned. */
  var volumeId: js.UndefOr[String] = js.undefined
}

object Anon_AltFieldsKeyLocaleMaxResults {
  @scala.inline
  def apply(
    alt: String = null,
    fields: String = null,
    key: String = null,
    locale: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    processingState: String = null,
    quotaUser: String = null,
    source: String = null,
    startIndex: Int | Double = null,
    userIp: String = null,
    volumeId: String = null
  ): Anon_AltFieldsKeyLocaleMaxResults = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
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
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId)
    __obj.asInstanceOf[Anon_AltFieldsKeyLocaleMaxResults]
  }
}

