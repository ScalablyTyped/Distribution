package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerVersion extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var builtInVariable: js.UndefOr[js.Array[BuiltInVariable]] = js.undefined
  var container: js.UndefOr[Container] = js.undefined
  var containerId: js.UndefOr[String] = js.undefined
  var containerVersionId: js.UndefOr[String] = js.undefined
  var customTemplate: js.UndefOr[js.Array[CustomTemplate]] = js.undefined
  var deleted: js.UndefOr[Boolean] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var fingerprint: js.UndefOr[String] = js.undefined
  var folder: js.UndefOr[js.Array[Folder]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var tag: js.UndefOr[js.Array[Tag]] = js.undefined
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  var trigger: js.UndefOr[js.Array[Trigger]] = js.undefined
  var variable: js.UndefOr[js.Array[Variable]] = js.undefined
  var zone: js.UndefOr[js.Array[Zone]] = js.undefined
}

object ContainerVersion {
  @scala.inline
  def apply(
    accountId: String = null,
    builtInVariable: js.Array[BuiltInVariable] = null,
    container: Container = null,
    containerId: String = null,
    containerVersionId: String = null,
    customTemplate: js.Array[CustomTemplate] = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    description: String = null,
    fingerprint: String = null,
    folder: js.Array[Folder] = null,
    name: String = null,
    path: String = null,
    tag: js.Array[Tag] = null,
    tagManagerUrl: String = null,
    trigger: js.Array[Trigger] = null,
    variable: js.Array[Variable] = null,
    zone: js.Array[Zone] = null
  ): ContainerVersion = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (builtInVariable != null) __obj.updateDynamic("builtInVariable")(builtInVariable.asInstanceOf[js.Any])
    if (container != null) __obj.updateDynamic("container")(container.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (containerVersionId != null) __obj.updateDynamic("containerVersionId")(containerVersionId.asInstanceOf[js.Any])
    if (customTemplate != null) __obj.updateDynamic("customTemplate")(customTemplate.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (folder != null) __obj.updateDynamic("folder")(folder.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl.asInstanceOf[js.Any])
    if (trigger != null) __obj.updateDynamic("trigger")(trigger.asInstanceOf[js.Any])
    if (variable != null) __obj.updateDynamic("variable")(variable.asInstanceOf[js.Any])
    if (zone != null) __obj.updateDynamic("zone")(zone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerVersion]
  }
}

