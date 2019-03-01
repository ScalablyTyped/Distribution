package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Folder extends js.Object {
  /** GTM Account ID. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** GTM Container ID. */
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  /** The fingerprint of the GTM Folder as computed at storage time. This value is recomputed whenever the folder is modified. */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** The Folder ID uniquely identifies the GTM Folder. */
  var folderId: js.UndefOr[java.lang.String] = js.undefined
  /** Folder display name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** User notes on how to apply this folder in the container. */
  var notes: js.UndefOr[java.lang.String] = js.undefined
  /** GTM Folder's API relative path. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[java.lang.String] = js.undefined
  /** GTM Workspace ID. */
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

