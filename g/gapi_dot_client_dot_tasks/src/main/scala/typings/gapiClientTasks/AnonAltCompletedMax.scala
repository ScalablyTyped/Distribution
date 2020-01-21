package typings.gapiClientTasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAltCompletedMax extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Upper bound for a task's completion date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by completion date. */
  var completedMax: js.UndefOr[String] = js.undefined
  /** Lower bound for a task's completion date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by completion date. */
  var completedMin: js.UndefOr[String] = js.undefined
  /** Upper bound for a task's due date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by due date. */
  var dueMax: js.UndefOr[String] = js.undefined
  /** Lower bound for a task's due date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by due date. */
  var dueMin: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** Maximum number of task lists returned on one page. Optional. The default is 20 (max allowed: 100). */
  var maxResults: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Token specifying the result page to return. Optional. */
  var pageToken: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Flag indicating whether completed tasks are returned in the result. Optional. The default is True. */
  var showCompleted: js.UndefOr[Boolean] = js.undefined
  /** Flag indicating whether deleted tasks are returned in the result. Optional. The default is False. */
  var showDeleted: js.UndefOr[Boolean] = js.undefined
  /** Flag indicating whether hidden tasks are returned in the result. Optional. The default is False. */
  var showHidden: js.UndefOr[Boolean] = js.undefined
  /** Task list identifier. */
  var tasklist: String
  /**
    * Lower bound for a task's last modification time (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by last modification
    * time.
    */
  var updatedMin: js.UndefOr[String] = js.undefined
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.undefined
}

object AnonAltCompletedMax {
  @scala.inline
  def apply(
    tasklist: String,
    alt: String = null,
    completedMax: String = null,
    completedMin: String = null,
    dueMax: String = null,
    dueMin: String = null,
    fields: String = null,
    key: String = null,
    maxResults: String = null,
    oauth_token: String = null,
    pageToken: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    quotaUser: String = null,
    showCompleted: js.UndefOr[Boolean] = js.undefined,
    showDeleted: js.UndefOr[Boolean] = js.undefined,
    showHidden: js.UndefOr[Boolean] = js.undefined,
    updatedMin: String = null,
    userIp: String = null
  ): AnonAltCompletedMax = {
    val __obj = js.Dynamic.literal(tasklist = tasklist.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (completedMax != null) __obj.updateDynamic("completedMax")(completedMax.asInstanceOf[js.Any])
    if (completedMin != null) __obj.updateDynamic("completedMin")(completedMin.asInstanceOf[js.Any])
    if (dueMax != null) __obj.updateDynamic("dueMax")(dueMax.asInstanceOf[js.Any])
    if (dueMin != null) __obj.updateDynamic("dueMin")(dueMin.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (!js.isUndefined(showCompleted)) __obj.updateDynamic("showCompleted")(showCompleted.asInstanceOf[js.Any])
    if (!js.isUndefined(showDeleted)) __obj.updateDynamic("showDeleted")(showDeleted.asInstanceOf[js.Any])
    if (!js.isUndefined(showHidden)) __obj.updateDynamic("showHidden")(showHidden.asInstanceOf[js.Any])
    if (updatedMin != null) __obj.updateDynamic("updatedMin")(updatedMin.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAltCompletedMax]
  }
}

