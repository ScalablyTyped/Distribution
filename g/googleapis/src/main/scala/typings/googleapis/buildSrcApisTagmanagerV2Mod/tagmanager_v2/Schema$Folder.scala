package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Folder.
  */
@js.native
trait Schema$Folder extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * The fingerprint of the GTM Folder as computed at storage time. This value
    * is recomputed whenever the folder is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * The Folder ID uniquely identifies the GTM Folder.
    */
  var folderId: js.UndefOr[String] = js.native
  /**
    * Folder display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * User notes on how to apply this folder in the container.
    */
  var notes: js.UndefOr[String] = js.native
  /**
    * GTM Folder&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Auto generated link to the tag manager UI
    */
  var tagManagerUrl: js.UndefOr[String] = js.native
  /**
    * GTM Workspace ID.
    */
  var workspaceId: js.UndefOr[String] = js.native
}

object Schema$Folder {
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
  ): Schema$Folder = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (folderId != null) __obj.updateDynamic("folderId")(folderId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl.asInstanceOf[js.Any])
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Folder]
  }
}

