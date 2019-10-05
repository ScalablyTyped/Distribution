package typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Folder extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var containerId: js.UndefOr[String] = js.undefined
  var fingerprint: js.UndefOr[String] = js.undefined
  var folderId: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  var workspaceId: js.UndefOr[String] = js.undefined
}

object Folder {
  @scala.inline
  def apply(
    accountId: String = null,
    containerId: String = null,
    fingerprint: String = null,
    folderId: String = null,
    name: String = null,
    notes: String = null,
    path: String = null,
    tagManagerUrl: String = null,
    workspaceId: String = null
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

