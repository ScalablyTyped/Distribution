package typings.gapiClientTasks.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CompletedMax extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** Upper bound for a task's completion date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by completion date. */
  var completedMax: js.UndefOr[String] = js.native
  /** Lower bound for a task's completion date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by completion date. */
  var completedMin: js.UndefOr[String] = js.native
  /** Upper bound for a task's due date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by due date. */
  var dueMax: js.UndefOr[String] = js.native
  /** Lower bound for a task's due date (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by due date. */
  var dueMin: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** Maximum number of task lists returned on one page. Optional. The default is 20 (max allowed: 100). */
  var maxResults: js.UndefOr[String] = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Token specifying the result page to return. Optional. */
  var pageToken: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.native
  /** Flag indicating whether completed tasks are returned in the result. Optional. The default is True. */
  var showCompleted: js.UndefOr[Boolean] = js.native
  /** Flag indicating whether deleted tasks are returned in the result. Optional. The default is False. */
  var showDeleted: js.UndefOr[Boolean] = js.native
  /** Flag indicating whether hidden tasks are returned in the result. Optional. The default is False. */
  var showHidden: js.UndefOr[Boolean] = js.native
  /** Task list identifier. */
  var tasklist: String = js.native
  /**
    * Lower bound for a task's last modification time (as a RFC 3339 timestamp) to filter by. Optional. The default is not to filter by last modification
    * time.
    */
  var updatedMin: js.UndefOr[String] = js.native
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.native
}

object CompletedMax {
  @scala.inline
  def apply(tasklist: String): CompletedMax = {
    val __obj = js.Dynamic.literal(tasklist = tasklist.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletedMax]
  }
  @scala.inline
  implicit class CompletedMaxOps[Self <: CompletedMax] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setTasklist(value: String): Self = this.set("tasklist", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setCompletedMax(value: String): Self = this.set("completedMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletedMax: Self = this.set("completedMax", js.undefined)
    @scala.inline
    def setCompletedMin(value: String): Self = this.set("completedMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompletedMin: Self = this.set("completedMin", js.undefined)
    @scala.inline
    def setDueMax(value: String): Self = this.set("dueMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDueMax: Self = this.set("dueMax", js.undefined)
    @scala.inline
    def setDueMin(value: String): Self = this.set("dueMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDueMin: Self = this.set("dueMin", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setMaxResults(value: String): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setPageToken(value: String): Self = this.set("pageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageToken: Self = this.set("pageToken", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setShowCompleted(value: Boolean): Self = this.set("showCompleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCompleted: Self = this.set("showCompleted", js.undefined)
    @scala.inline
    def setShowDeleted(value: Boolean): Self = this.set("showDeleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowDeleted: Self = this.set("showDeleted", js.undefined)
    @scala.inline
    def setShowHidden(value: Boolean): Self = this.set("showHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHidden: Self = this.set("showHidden", js.undefined)
    @scala.inline
    def setUpdatedMin(value: String): Self = this.set("updatedMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedMin: Self = this.set("updatedMin", js.undefined)
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
  
}

