package typings
package gapiDotClientDotFitnessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Anon_StartTime extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** An RFC3339 timestamp. Only sessions ending between the start and end times will be included in the response. */
  var endTime: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * If true, deleted sessions will be returned. When set to true, sessions returned in this response will only have an ID and will not have any other
                   * fields.
                   */
  var includeDeleted: js.UndefOr[scala.Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /**
                   * The continuation token, which is used to page through large result sets. To get the next page of results, set this parameter to the value of
                   * nextPageToken from the previous response.
                   */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
                   * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
                   * Overrides userIp if both are provided.
                   */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** An RFC3339 timestamp. Only sessions ending between the start and end times will be included in the response. */
  var startTime: js.UndefOr[java.lang.String] = js.undefined
  /** List sessions for the person identified. Use me to indicate the authenticated user. Only me is supported at this time. */
  var userId: java.lang.String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

