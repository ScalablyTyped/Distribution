package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltInVariable extends js.Object {
  /** GTM Account ID. */
  var accountId: js.UndefOr[String] = js.undefined
  /** GTM Container ID. */
  var containerId: js.UndefOr[String] = js.undefined
  /** Name of the built-in variable to be used to refer to the built-in variable. */
  var name: js.UndefOr[String] = js.undefined
  /** GTM BuiltInVariable's API relative path. */
  var path: js.UndefOr[String] = js.undefined
  /** Type of built-in variable. */
  var `type`: js.UndefOr[String] = js.undefined
  /** GTM Workspace ID. */
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

