package typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltInVariable extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var containerId: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var workspaceId: js.UndefOr[String] = js.undefined
}

object BuiltInVariable {
  @scala.inline
  def apply(
    accountId: String = null,
    containerId: String = null,
    name: String = null,
    path: String = null,
    `type`: String = null,
    workspaceId: String = null
  ): BuiltInVariable = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId)
    __obj.asInstanceOf[BuiltInVariable]
  }
}

