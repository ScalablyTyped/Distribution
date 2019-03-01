package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltContentVersion extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The content version for the requested volume. */
  var contentVersion: java.lang.String
  /** The end offset to end retrieving data from. */
  var endOffset: js.UndefOr[java.lang.String] = js.undefined
  /** The end position to end retrieving data from. */
  var endPosition: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The ID for the layer to get the annotations. */
  var layerId: java.lang.String
  /** The locale information for the data. ISO-639-1 language and ISO-3166-1 country code. Ex: 'en_US'. */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of results to return */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** The value of the nextToken from the previous page. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Set to true to return deleted annotations. updatedMin must be in the request to use this. Defaults to false. */
  var showDeleted: js.UndefOr[scala.Boolean] = js.undefined
  /** String to identify the originator of this request. */
  var source: js.UndefOr[java.lang.String] = js.undefined
  /** The start offset to start retrieving data from. */
  var startOffset: js.UndefOr[java.lang.String] = js.undefined
  /** The start position to start retrieving data from. */
  var startPosition: js.UndefOr[java.lang.String] = js.undefined
  /** RFC 3339 timestamp to restrict to items updated prior to this timestamp (exclusive). */
  var updatedMax: js.UndefOr[java.lang.String] = js.undefined
  /** RFC 3339 timestamp to restrict to items updated since this timestamp (inclusive). */
  var updatedMin: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /** The version of the volume annotations that you are requesting. */
  var volumeAnnotationsVersion: js.UndefOr[java.lang.String] = js.undefined
  /** The volume to retrieve annotations for. */
  var volumeId: java.lang.String
}

object Anon_AltContentVersion {
  @scala.inline
  def apply(
    contentVersion: java.lang.String,
    layerId: java.lang.String,
    volumeId: java.lang.String,
    alt: java.lang.String = null,
    endOffset: java.lang.String = null,
    endPosition: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    locale: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    showDeleted: js.UndefOr[scala.Boolean] = js.undefined,
    source: java.lang.String = null,
    startOffset: java.lang.String = null,
    startPosition: java.lang.String = null,
    updatedMax: java.lang.String = null,
    updatedMin: java.lang.String = null,
    userIp: java.lang.String = null,
    volumeAnnotationsVersion: java.lang.String = null
  ): Anon_AltContentVersion = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("contentVersion")(contentVersion)
    __obj.updateDynamic("layerId")(layerId)
    __obj.updateDynamic("volumeId")(volumeId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (endOffset != null) __obj.updateDynamic("endOffset")(endOffset)
    if (endPosition != null) __obj.updateDynamic("endPosition")(endPosition)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (!js.isUndefined(showDeleted)) __obj.updateDynamic("showDeleted")(showDeleted)
    if (source != null) __obj.updateDynamic("source")(source)
    if (startOffset != null) __obj.updateDynamic("startOffset")(startOffset)
    if (startPosition != null) __obj.updateDynamic("startPosition")(startPosition)
    if (updatedMax != null) __obj.updateDynamic("updatedMax")(updatedMax)
    if (updatedMin != null) __obj.updateDynamic("updatedMin")(updatedMin)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    if (volumeAnnotationsVersion != null) __obj.updateDynamic("volumeAnnotationsVersion")(volumeAnnotationsVersion)
    __obj.asInstanceOf[Anon_AltContentVersion]
  }
}

