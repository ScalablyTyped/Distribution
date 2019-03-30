package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuiltInVariable extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var workspaceId: js.UndefOr[java.lang.String] = js.undefined
}

object BuiltInVariable {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    containerId: java.lang.String = null,
    name: java.lang.String = null,
    path: java.lang.String = null,
    `type`: java.lang.String = null,
    workspaceId: java.lang.String = null
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

