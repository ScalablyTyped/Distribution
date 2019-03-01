package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerVersion extends js.Object {
  /** GTM Account ID. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** The built-in variables in the container that this version was taken from. */
  var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.undefined
  /** The container that this version was taken from. */
  var container: js.UndefOr[Container] = js.undefined
  /** GTM Container ID. */
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  /** The Container Version ID uniquely identifies the GTM Container Version. */
  var containerVersionId: js.UndefOr[java.lang.String] = js.undefined
  /** A value of true indicates this container version has been deleted. */
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  /** Container version description. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** The fingerprint of the GTM Container Version as computed at storage time. This value is recomputed whenever the container version is modified. */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** The folders in the container that this version was taken from. */
  var folder: js.UndefOr[js.Array[Folder]] = js.undefined
  /** Container version display name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** GTM ContainerVersions's API relative path. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** The tags in the container that this version was taken from. */
  var tag: js.UndefOr[js.Array[Tag]] = js.undefined
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The triggers in the container that this version was taken from. */
  var trigger: js.UndefOr[js.Array[Trigger]] = js.undefined
  /** The variables in the container that this version was taken from. */
  var variable: js.UndefOr[js.Array[Variable]] = js.undefined
  /** The zones in the container that this version was taken from. */
  var zone: js.UndefOr[js.Array[Zone]] = js.undefined
}

object ContainerVersion {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    builtInVariable: js.Array[BuiltInVariable] = null,
    container: Container = null,
    containerId: java.lang.String = null,
    containerVersionId: java.lang.String = null,
    deleted: js.UndefOr[scala.Boolean] = js.undefined,
    description: java.lang.String = null,
    fingerprint: java.lang.String = null,
    folder: js.Array[Folder] = null,
    name: java.lang.String = null,
    path: java.lang.String = null,
    tag: js.Array[Tag] = null,
    tagManagerUrl: java.lang.String = null,
    trigger: js.Array[Trigger] = null,
    variable: js.Array[Variable] = null,
    zone: js.Array[Zone] = null
  ): ContainerVersion = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (builtInVariable != null) __obj.updateDynamic("builtInVariable")(builtInVariable)
    if (container != null) __obj.updateDynamic("container")(container)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (containerVersionId != null) __obj.updateDynamic("containerVersionId")(containerVersionId)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (description != null) __obj.updateDynamic("description")(description)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (folder != null) __obj.updateDynamic("folder")(folder)
    if (name != null) __obj.updateDynamic("name")(name)
    if (path != null) __obj.updateDynamic("path")(path)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (variable != null) __obj.updateDynamic("variable")(variable)
    if (zone != null) __obj.updateDynamic("zone")(zone)
    __obj.asInstanceOf[ContainerVersion]
  }
}

