package typings.googleAppsScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var blockingRuleId: js.UndefOr[js.Array[String]] = js.undefined
  var blockingTriggerId: js.UndefOr[js.Array[String]] = js.undefined
  var containerId: js.UndefOr[String] = js.undefined
  var fingerprint: js.UndefOr[String] = js.undefined
  var firingRuleId: js.UndefOr[js.Array[String]] = js.undefined
  var firingTriggerId: js.UndefOr[js.Array[String]] = js.undefined
  var liveOnly: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
  var parameter: js.UndefOr[js.Array[Parameter]] = js.undefined
  var parentFolderId: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var paused: js.UndefOr[Boolean] = js.undefined
  var priority: js.UndefOr[Parameter] = js.undefined
  var scheduleEndMs: js.UndefOr[String] = js.undefined
  var scheduleStartMs: js.UndefOr[String] = js.undefined
  var setupTag: js.UndefOr[js.Array[SetupTag]] = js.undefined
  var tagFiringOption: js.UndefOr[String] = js.undefined
  var tagId: js.UndefOr[String] = js.undefined
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  var teardownTag: js.UndefOr[js.Array[TeardownTag]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var workspaceId: js.UndefOr[String] = js.undefined
}

object Tag {
  @scala.inline
  def apply(
    accountId: String = null,
    blockingRuleId: js.Array[String] = null,
    blockingTriggerId: js.Array[String] = null,
    containerId: String = null,
    fingerprint: String = null,
    firingRuleId: js.Array[String] = null,
    firingTriggerId: js.Array[String] = null,
    liveOnly: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    notes: String = null,
    parameter: js.Array[Parameter] = null,
    parentFolderId: String = null,
    path: String = null,
    paused: js.UndefOr[Boolean] = js.undefined,
    priority: Parameter = null,
    scheduleEndMs: String = null,
    scheduleStartMs: String = null,
    setupTag: js.Array[SetupTag] = null,
    tagFiringOption: String = null,
    tagId: String = null,
    tagManagerUrl: String = null,
    teardownTag: js.Array[TeardownTag] = null,
    `type`: String = null,
    workspaceId: String = null
  ): Tag = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (blockingRuleId != null) __obj.updateDynamic("blockingRuleId")(blockingRuleId.asInstanceOf[js.Any])
    if (blockingTriggerId != null) __obj.updateDynamic("blockingTriggerId")(blockingTriggerId.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (firingRuleId != null) __obj.updateDynamic("firingRuleId")(firingRuleId.asInstanceOf[js.Any])
    if (firingTriggerId != null) __obj.updateDynamic("firingTriggerId")(firingTriggerId.asInstanceOf[js.Any])
    if (!js.isUndefined(liveOnly)) __obj.updateDynamic("liveOnly")(liveOnly.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    if (parentFolderId != null) __obj.updateDynamic("parentFolderId")(parentFolderId.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused.get.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (scheduleEndMs != null) __obj.updateDynamic("scheduleEndMs")(scheduleEndMs.asInstanceOf[js.Any])
    if (scheduleStartMs != null) __obj.updateDynamic("scheduleStartMs")(scheduleStartMs.asInstanceOf[js.Any])
    if (setupTag != null) __obj.updateDynamic("setupTag")(setupTag.asInstanceOf[js.Any])
    if (tagFiringOption != null) __obj.updateDynamic("tagFiringOption")(tagFiringOption.asInstanceOf[js.Any])
    if (tagId != null) __obj.updateDynamic("tagId")(tagId.asInstanceOf[js.Any])
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl.asInstanceOf[js.Any])
    if (teardownTag != null) __obj.updateDynamic("teardownTag")(teardownTag.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tag]
  }
}

