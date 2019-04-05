package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Folder extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  var folderId: js.UndefOr[java.lang.String] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var notes: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var tagManagerUrl: js.UndefOr[java.lang.String] = js.undefined
  var workspaceId: js.UndefOr[java.lang.String] = js.undefined
}

object Folder {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    containerId: java.lang.String = null,
    fingerprint: java.lang.String = null,
    folderId: java.lang.String = null,
    name: java.lang.String = null,
    notes: java.lang.String = null,
    path: java.lang.String = null,
    tagManagerUrl: java.lang.String = null,
    workspaceId: java.lang.String = null
  ): Folder = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (folderId != null) __obj.updateDynamic("folderId")(folderId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (path != null) __obj.updateDynamic("path")(path)
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl)
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId)
    __obj.asInstanceOf[Folder]
  }
}

