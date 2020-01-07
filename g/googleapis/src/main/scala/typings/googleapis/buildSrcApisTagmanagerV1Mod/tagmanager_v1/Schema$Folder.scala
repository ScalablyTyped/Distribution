package typings.googleapis.buildSrcApisTagmanagerV1Mod.tagmanager_v1

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
}

object Schema$Folder {
  @scala.inline
  def apply(
    accountId: String = null,
    containerId: String = null,
    fingerprint: String = null,
    folderId: String = null,
    name: String = null
  ): Schema$Folder = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (folderId != null) __obj.updateDynamic("folderId")(folderId.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Folder]
  }
}

