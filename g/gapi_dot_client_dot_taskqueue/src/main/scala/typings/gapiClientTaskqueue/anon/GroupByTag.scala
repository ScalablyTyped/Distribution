package typings.gapiClientTaskqueue.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupByTag extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.native
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.native
  /** When true, all returned tasks will have the same tag */
  var groupByTag: js.UndefOr[Boolean] = js.native
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.native
  /** The lease in seconds. */
  var leaseSecs: Double = js.native
  /** The number of tasks to lease. */
  var numTasks: Double = js.native
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.native
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.native
  /** The project under which the queue lies. */
  var project: String = js.native
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[String] = js.native
  /**
    * The tag allowed for tasks in the response. Must only be specified if group_by_tag is true. If group_by_tag is true and tag is not specified the tag
    * will be that of the oldest task by eta, i.e. the first available tag
    */
  var tag: js.UndefOr[String] = js.native
  /** The taskqueue to lease a task from. */
  var taskqueue: String = js.native
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[String] = js.native
}

object GroupByTag {
  @scala.inline
  def apply(leaseSecs: Double, numTasks: Double, project: String, taskqueue: String): GroupByTag = {
    val __obj = js.Dynamic.literal(leaseSecs = leaseSecs.asInstanceOf[js.Any], numTasks = numTasks.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], taskqueue = taskqueue.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupByTag]
  }
  @scala.inline
  implicit class GroupByTagOps[Self <: GroupByTag] (val x: Self) extends AnyVal {
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
    def setLeaseSecs(value: Double): Self = this.set("leaseSecs", value.asInstanceOf[js.Any])
    @scala.inline
    def setNumTasks(value: Double): Self = this.set("numTasks", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskqueue(value: String): Self = this.set("taskqueue", value.asInstanceOf[js.Any])
    @scala.inline
    def setAlt(value: String): Self = this.set("alt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlt: Self = this.set("alt", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setGroupByTag(value: Boolean): Self = this.set("groupByTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupByTag: Self = this.set("groupByTag", js.undefined)
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setOauth_token(value: String): Self = this.set("oauth_token", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOauth_token: Self = this.set("oauth_token", js.undefined)
    @scala.inline
    def setPrettyPrint(value: Boolean): Self = this.set("prettyPrint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyPrint: Self = this.set("prettyPrint", js.undefined)
    @scala.inline
    def setQuotaUser(value: String): Self = this.set("quotaUser", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuotaUser: Self = this.set("quotaUser", js.undefined)
    @scala.inline
    def setTag(value: String): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTag: Self = this.set("tag", js.undefined)
    @scala.inline
    def setUserIp(value: String): Self = this.set("userIp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserIp: Self = this.set("userIp", js.undefined)
  }
  
}

