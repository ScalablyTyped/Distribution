package typings.gapiClientTasks

import typings.gapiClientTasks.gapi.client.tasks.Task
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonParent extends js.Object {
  /** Data format for the response. */
  var alt: js.UndefOr[String] = js.undefined
  /** Selector specifying which fields to include in a partial response. */
  var fields: js.UndefOr[String] = js.undefined
  /** API key. Your API key identifies your project and provides you with API access, quota, and reports. Required unless you provide an OAuth 2.0 token. */
  var key: js.UndefOr[String] = js.undefined
  /** OAuth 2.0 token for the current user. */
  var oauth_token: js.UndefOr[String] = js.undefined
  /** Parent task identifier. If the task is created at the top level, this parameter is omitted. Optional. */
  var parent: js.UndefOr[String] = js.undefined
  /** Returns response with indentations and line breaks. */
  var prettyPrint: js.UndefOr[Boolean] = js.undefined
  /** Previous sibling task identifier. If the task is created at the first position among its siblings, this parameter is omitted. Optional. */
  var previous: js.UndefOr[String] = js.undefined
  /** An opaque string that represents a user for quota purposes. Must not exceed 40 characters. */
  var quotaUser: js.UndefOr[String] = js.undefined
  /** Request body */
  var resource: Task
  /** Task list identifier. */
  var tasklist: String
  /** Deprecated. Please use quotaUser instead. */
  var userIp: js.UndefOr[String] = js.undefined
}

object AnonParent {
  @scala.inline
  def apply(
    resource: Task,
    tasklist: String,
    alt: String = null,
    fields: String = null,
    key: String = null,
    oauth_token: String = null,
    parent: String = null,
    prettyPrint: js.UndefOr[Boolean] = js.undefined,
    previous: String = null,
    quotaUser: String = null,
    userIp: String = null
  ): AnonParent = {
    val __obj = js.Dynamic.literal(resource = resource.asInstanceOf[js.Any], tasklist = tasklist.asInstanceOf[js.Any])
    if (alt != null) __obj.updateDynamic("alt")(alt.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (oauth_token != null) __obj.updateDynamic("oauth_token")(oauth_token.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (!js.isUndefined(prettyPrint)) __obj.updateDynamic("prettyPrint")(prettyPrint.asInstanceOf[js.Any])
    if (previous != null) __obj.updateDynamic("previous")(previous.asInstanceOf[js.Any])
    if (quotaUser != null) __obj.updateDynamic("quotaUser")(quotaUser.asInstanceOf[js.Any])
    if (userIp != null) __obj.updateDynamic("userIp")(userIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonParent]
  }
}

