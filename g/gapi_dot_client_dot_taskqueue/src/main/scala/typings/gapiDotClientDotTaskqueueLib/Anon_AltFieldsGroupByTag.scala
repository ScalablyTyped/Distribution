package typings
package gapiDotClientDotTaskqueueLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AltFieldsGroupByTag extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[java.lang.String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[java.lang.String] = js.undefined
  /** When true, all returned tasks will have the same tag */
  var groupByTag: js.UndefOr[scala.Boolean] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[java.lang.String] = js.undefined
  /** The lease in seconds. */
  var leaseSecs: scala.Double
  /** The number of tasks to lease. */
  var numTasks: scala.Double
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[java.lang.String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[scala.Boolean] = js.undefined
  /** The project under which the queue lies. */
  var project: java.lang.String
  /**
    * Available to use for quota purposes for server-side applications. Can be any arbitrary string assigned to a user, but should not exceed 40 characters.
    * Overrides userIp if both are provided.
    */
  var quotaUser: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The tag allowed for tasks in the response. Must only be specified if group_by_tag is true. If group_by_tag is true and tag is not specified the tag
    * will be that of the oldest task by eta, i.e. the first available tag
    */
  var tag: js.UndefOr[java.lang.String] = js.undefined
  /** The taskqueue to lease a task from. */
  var taskqueue: java.lang.String
  /** IP address of the site where the request originates. Use this if you want to enforce per-user limits. */
  var userIp: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AltFieldsGroupByTag {
  @scala.inline
  def apply(
    leaseSecs: scala.Double,
    numTasks: scala.Double,
    project: java.lang.String,
    taskqueue: java.lang.String,
    alt: java.lang.String = null,
    fields: java.lang.String = null,
    groupByTag: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String = null,
    oauth_token: java.lang.String = null,
    prettyPrint: js.UndefOr[scala.Boolean] = js.undefined,
    quotaUser: java.lang.String = null,
    tag: java.lang.String = null,
    userIp: java.lang.String = null
  ): Anon_AltFieldsGroupByTag = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("leaseSecs")(leaseSecs)
    __obj.updateDynamic("numTasks")(numTasks)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("taskqueue")(taskqueue)
    if (alt != null) __obj.updateDynamic("alt")(alt)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (!js.isUndefined(groupByTag)) __obj.updateDynamic("groupByTag")(groupByTag)
    if (key != null) __obj.updateDynamic("key")(key)
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token)
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint)
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (userIp != null) __obj.updateDynamic("userIp")(userIp)
    __obj.asInstanceOf[Anon_AltFieldsGroupByTag]
  }
}

