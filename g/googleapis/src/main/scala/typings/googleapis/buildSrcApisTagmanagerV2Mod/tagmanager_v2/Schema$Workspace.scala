package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Container Workspace.
  */
@js.native
trait Schema$Workspace extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * Workspace description.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The fingerprint of the GTM Workspace as computed at storage time. This
    * value is recomputed whenever the workspace is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * Workspace display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * GTM Workspace&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Auto generated link to the tag manager UI
    */
  var tagManagerUrl: js.UndefOr[String] = js.native
  /**
    * The Workspace ID uniquely identifies the GTM Workspace.
    */
  var workspaceId: js.UndefOr[String] = js.native
}

object Schema$Workspace {
  @scala.inline
  def apply(
    accountId: String = null,
    containerId: String = null,
    description: String = null,
    fingerprint: String = null,
    name: String = null,
    path: String = null,
    tagManagerUrl: String = null,
    workspaceId: String = null
  ): Schema$Workspace = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl.asInstanceOf[js.Any])
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Workspace]
  }
}

