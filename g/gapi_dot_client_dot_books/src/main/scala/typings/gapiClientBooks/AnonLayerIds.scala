package typings.gapiClientBooks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLayerIds extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** The content version for the requested volume. */
  var contentVersion: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** The layer ID to limit annotation by. */
  var layerId: js.UndefOr[String] = js.undefined
  /** The layer ID(s) to limit annotation by. */
  var layerIds: js.UndefOr[String] = js.undefined
  /** Maximum number of results to return */
  var maxResults: js.UndefOr[Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** The value of the nextToken from the previous page. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Set to true to return deleted annotations. updatedMin must be in the request to use this. Defaults to false. */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
  /** String to identify the originator of this request. */
  var source: js.UndefOr[String] = js.undefined
  /** RFC 3339 timestamp to restrict to items updated prior to this timestamp (exclusive). */
  var updatedMax: js.UndefOr[String] = js.undefined
  /** RFC 3339 timestamp to restrict to items updated since this timestamp (inclusive). */
  var updatedMin: js.UndefOr[String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.undefined
  /** The volume to restrict annotations to. */
  var volumeId: js.UndefOr[String] = js.undefined
}

object AnonLayerIds {
  @scala.inline
  def apply(
    alt: String = null,
    contentVersion: String = null,
    fields: String = null,
    key: String = null,
    layerId: String = null,
    layerIds: String = null,
    maxResults: Int | Double = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    showDeleted: js.UndefOr[Boolean] = js.undefined,
    source: String = null,
    updatedMax: String = null,
    updatedMin: String = null,
    userIp: String = null,
    volumeId: String = null
  ): AnonLayerIds = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (contentVersion != null) __obj.updateDynamic("contentVersion")(contentVersion.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (layerIds != null) __obj.updateDynamic("layerIds")(layerIds.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(showDeleted)) __obj.updateDynamic("showDeleted")(showDeleted.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (updatedMax != null) __obj.updateDynamic("updatedMax")(updatedMax.asInstanceOf[js.Any])
    if (updatedMin != null) __obj.updateDynamic("updatedMin")(updatedMin.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLayerIds]
  }
}

