package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Workspace extends js.Object {
  /** GTM Account ID. */
  var accountId: js.UndefOr[String] = js.undefined
  /** GTM Container ID. */
  var containerId: js.UndefOr[String] = js.undefined
  /** Workspace description. */
  var description: js.UndefOr[String] = js.undefined
  /** The fingerprint of the GTM Workspace as computed at storage time. This value is recomputed whenever the workspace is modified. */
  var fingerprint: js.UndefOr[String] = js.undefined
  /** Workspace display name. */
  var name: js.UndefOr[String] = js.undefined
  /** GTM Workspace's API relative path. */
  var path: js.UndefOr[String] = js.undefined
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  /** The Workspace ID uniquely identifies the GTM Workspace. */
  var workspaceId: js.UndefOr[String] = js.undefined
}

object Workspace {
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

