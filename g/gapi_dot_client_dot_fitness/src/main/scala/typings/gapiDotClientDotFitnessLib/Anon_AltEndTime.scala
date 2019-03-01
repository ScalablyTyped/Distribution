package typings
package gapiDotClientDotFitnessLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltEndTime extends js.Object {
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

object Anon_AltEndTime {
  @scala.inline
  def apply(
    userId: java.lang.String,
    alt: java.lang.String = null,
    endTime: java.lang.String = null,
    fields: java.lang.String = null,
    includeDeleted: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    startTime: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltEndTime = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("userId")(userId)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(includeDeleted)) __obj.updateDynamic("includeDeleted")(includeDeleted)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltEndTime]
  }
}

