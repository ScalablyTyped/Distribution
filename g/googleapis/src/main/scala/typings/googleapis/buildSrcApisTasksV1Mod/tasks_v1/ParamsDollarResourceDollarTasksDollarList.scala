package typings.googleapis.buildSrcApisTasksV1Mod.tasks_v1

import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.Compute
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.JWT
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.OAuth2Client
import typings.googleDashAuthDashLibrary.googleDashAuthDashLibraryMod.UserRefreshClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParamsDollarResourceDollarTasksDollarList extends StandardParameters {
  /**
    * Auth client or API Key for the request
    */
  var auth: js.UndefOr[String | OAuth2Client | JWT | Compute | UserRefreshClient] = js.native
  /**
    * Upper bound for a task's completion date (as a RFC 3339 timestamp) to
    * filter by. Optional. The default is not to filter by completion date.
    */
  var completedMax: js.UndefOr[String] = js.native
  /**
    * Lower bound for a task's completion date (as a RFC 3339 timestamp) to
    * filter by. Optional. The default is not to filter by completion date.
    */
  var completedMin: js.UndefOr[String] = js.native
  /**
    * Upper bound for a task's due date (as a RFC 3339 timestamp) to filter by.
    * Optional. The default is not to filter by due date.
    */
  var dueMax: js.UndefOr[String] = js.native
  /**
    * Lower bound for a task's due date (as a RFC 3339 timestamp) to filter by.
    * Optional. The default is not to filter by due date.
    */
  var dueMin: js.UndefOr[String] = js.native
  /**
    * Maximum number of task lists returned on one page. Optional. The default
    * is 20 (max allowed: 100).
    */
  var maxResults: js.UndefOr[String] = js.native
  /**
    * Token specifying the result page to return. Optional.
    */
  var pageToken: js.UndefOr[String] = js.native
  /**
    * Flag indicating whether completed tasks are returned in the result.
    * Optional. The default is True.
    */
  var showCompleted: js.UndefOr[Boolean] = js.native
  /**
    * Flag indicating whether deleted tasks are returned in the result.
    * Optional. The default is False.
    */
  var showDeleted: js.UndefOr[Boolean] = js.native
  /**
    * Flag indicating whether hidden tasks are returned in the result.
    * Optional. The default is False.
    */
  var showHidden: js.UndefOr[Boolean] = js.native
  /**
    * Task list identifier.
    */
  var tasklist: js.UndefOr[String] = js.native
  /**
    * Lower bound for a task's last modification time (as a RFC 3339 timestamp)
    * to filter by. Optional. The default is not to filter by last modification
    * time.
    */
  var updatedMin: js.UndefOr[String] = js.native
}

object ParamsDollarResourceDollarTasksDollarList {
  @scala.inline
  def apply(
    alt: String = null,
    auth: String | OAuth2Client | JWT | Compute | UserRefreshClient = null,
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
    tasklist: String = null,
    updatedMin: String = null,
    userIp: String = null
  ): ParamsDollarResourceDollarTasksDollarList = {
    val __obj = js.Dynamic.literal()
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (auth != null) __obj.updateDynamic("auth")(auth.asInstanceOf[js.Any])
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
    if (tasklist != null) __obj.updateDynamic("tasklist")(tasklist.asInstanceOf[js.Any])
    if (updatedMin != null) __obj.updateDynamic("updatedMin")(updatedMin.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParamsDollarResourceDollarTasksDollarList]
  }
}

