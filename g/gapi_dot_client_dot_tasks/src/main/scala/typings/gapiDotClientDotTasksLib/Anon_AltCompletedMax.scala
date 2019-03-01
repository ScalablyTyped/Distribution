package typings
package gapiDotClientDotTasksLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltCompletedMax extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Upper bound for a task's completion date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by completion date. */
  var completedMax: js.UndefOr[java.lang.String] = js.undefined
  /** Lower bound for a task's completion date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by completion date. */
  var completedMin: js.UndefOr[java.lang.String] = js.undefined
  /** Upper bound for a task's due date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by due date. */
  var dueMax: js.UndefOr[java.lang.String] = js.undefined
  /** Lower bound for a task's due date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by due date. */
  var dueMin: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** Maximum number of task lists returned on one page. Optional. The default is 100. */
  var maxResults: js.UndefOr[java.lang.String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Token specifying the result page to return. Optional. */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /** Flag indicating whether completed tasks are returned in the result. Optional. The default is True. */
  var showCompleted: js.UndefOr[scala.Boolean] = js.undefined
  /** Flag indicating whether deleted tasks are returned in the result. Optional. The default is False. */
  var showDeleted: js.UndefOr[scala.Boolean] = js.undefined
  /** Flag indicating whether hidden tasks are returned in the result. Optional. The default is False. */
  var showHidden: js.UndefOr[scala.Boolean] = js.undefined
  /** Task list identifier. */
  var tasklist: java.lang.String
  /**
    * Lower bound for a task's last modification time (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by last modification
    * time.
    */
  var updatedMin: js.UndefOr[java.lang.String] = js.undefined
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltCompletedMax {
  @scala.inline
  def apply(
    tasklist: java.lang.String,
    alt: java.lang.String = null,
    completedMax: java.lang.String = null,
    completedMin: java.lang.String = null,
    dueMax: java.lang.String = null,
    dueMin: java.lang.String = null,
    fields: java.lang.String = null,
    key: java.lang.String = null,
    maxResults: java.lang.String = null,
    oauth_token: java.lang.String = null,
    pageToken: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    showCompleted: js.UndefOr[scala.Boolean] = js.undefined,
    showDeleted: js.UndefOr[scala.Boolean] = js.undefined,
    showHidden: js.UndefOr[scala.Boolean] = js.undefined,
    updatedMin: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltCompletedMax = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("tasklist")(tasklist)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (completedMax != null) __obj.updateDynamic("completedMax")(completedMax)
    if (completedMin != null) __obj.updateDynamic("completedMin")(completedMin)
    if (dueMax != null) __obj.updateDynamic("dueMax")(dueMax)
    if (dueMin != null) __obj.updateDynamic("dueMin")(dueMin)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (key != null) __obj.updateDynamic("key")(key)
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (!js.isUndefined(showCompleted)) __obj.updateDynamic("showCompleted")(showCompleted)
    if (!js.isUndefined(showDeleted)) __obj.updateDynamic("showDeleted")(showDeleted)
    if (!js.isUndefined(showHidden)) __obj.updateDynamic("showHidden")(showHidden)
    if (updatedMin != null) __obj.updateDynamic("updatedMin")(updatedMin)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltCompletedMax]
  }
}

