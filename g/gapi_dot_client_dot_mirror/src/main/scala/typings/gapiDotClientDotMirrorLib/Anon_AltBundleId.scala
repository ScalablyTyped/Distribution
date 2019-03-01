package typings
package gapiDotClientDotMirrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltBundleId extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** If provided, only items with the given bundleId will be returned. */
  var bundleId: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** If true, tombstone records for deleted items will be returned. */
  var includeDeleted: js.UndefOr[scala.Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The maximum number of items to include in the response, used for paging. */
  var maxResults: js.UndefOr[scala.Double] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Controls the order in which timeline items are returned. */
  var orderBy: js.UndefOr[java.lang.String] = js.undefined
  /** Token for the page of results to return. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** If true, only pinned items will be returned. */
  var pinnedOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** If provided, only items with the given sourceItemId will be returned. */
  var sourceItemId: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltBundleId {
  @scala.inline
  def apply(
    alt: java.lang.String = null,
    bundleId: java.lang.String = null,
    fields: java.lang.String = null,
    includeDeleted: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    maxResults: scala.Int | scala.Double = null,
    oauth_token: java.lang.String = null,
    orderBy: java.lang.String = null,
    pageToken: java.lang.String = null,
    pinnedOnly: js.UndefOr[scala.Boolean] = js.undefined,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    sourceItemId: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltBundleId = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (bundleId != null) __obj.updateDynamic("bundleId")(bundleId)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(includeDeleted)) __obj.updateDynamic("includeDeleted")(includeDeleted)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (orderBy != null) __obj.updateDynamic("orderBy")(orderBy)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(pinnedOnly)) __obj.updateDynamic("pinnedOnly")(pinnedOnly)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (sourceItemId != null) __obj.updateDynamic("sourceItemId")(sourceItemId)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltBundleId]
  }
}

