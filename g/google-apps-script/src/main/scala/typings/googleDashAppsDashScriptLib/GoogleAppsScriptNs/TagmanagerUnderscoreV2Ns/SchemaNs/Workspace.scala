package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Workspace extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var tagManagerUrl: js.UndefOr[java.lang.String] = js.undefined
  var workspaceId: js.UndefOr[java.lang.String] = js.undefined
}

object Workspace {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    containerId: java.lang.String = null,
    description: java.lang.String = null,
    fingerprint: java.lang.String = null,
    name: java.lang.String = null,
    path: java.lang.String = null,
    tagManagerUrl: java.lang.String = null,
    workspaceId: java.lang.String = null
  ): Workspace = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (description != null) __obj.updateDynamic("description")(description)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl)
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId)
    __obj.asInstanceOf[Workspace]
  }
}

