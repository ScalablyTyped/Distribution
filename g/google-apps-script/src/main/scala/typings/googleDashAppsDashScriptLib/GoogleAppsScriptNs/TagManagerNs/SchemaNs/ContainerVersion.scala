package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerVersion extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.undefined
  var container: js.UndefOr[Container] = js.undefined
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  var containerVersionId: js.UndefOr[java.lang.String] = js.undefined
  var customTemplate: js.UndefOr[js.Array[CustomTemplate]] = js.undefined
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  var description: js.UndefOr[java.lang.String] = js.undefined
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  var folder: js.UndefOr[js.Array[Folder]] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var tag: js.UndefOr[js.Array[Tag]] = js.undefined
  var tagManagerUrl: js.UndefOr[java.lang.String] = js.undefined
  var trigger: js.UndefOr[js.Array[Trigger]] = js.undefined
  var variable: js.UndefOr[js.Array[Variable]] = js.undefined
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
    customTemplate: js.Array[CustomTemplate] = null,
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
    if (customTemplate != null) __obj.updateDynamic("customTemplate")(customTemplate)
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

