package typings
package gapiDotClientDotBooksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_LayerIdSourceMaxResultsPrettyPrint extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** The content version for the requested volume. */
  var contentVersion: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The layer ID to limit annotation by. */
  var layerId: js.UndefOr[java.lang.String] = js.undefined
  /** The layer ID(s) to limit annotation by. */
  var layerIds: js.UndefOr[java.lang.String] = js.undefined
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
  /** RFC 3339 timestamp to restrict to items updated prior to this timestamp (exclusive). */
  var updatedMax: js.UndefOr[java.lang.String] = js.undefined
  /** RFC 3339 timestamp to restrict to items updated since this timestamp (inclusive). */
  var updatedMin: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
  /** The volume to restrict annotations to. */
  var volumeId: js.UndefOr[java.lang.String] = js.undefined
}

