package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var blockingRuleId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var blockingTriggerId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  var firingRuleId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var firingTriggerId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var liveOnly: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var notes: js.UndefOr[java.lang.String] = js.undefined
  var parameter: js.UndefOr[js.Array[Parameter]] = js.undefined
  var parentFolderId: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var paused: js.UndefOr[scala.Boolean] = js.undefined
  var priority: js.UndefOr[Parameter] = js.undefined
  var scheduleEndMs: js.UndefOr[java.lang.String] = js.undefined
  var scheduleStartMs: js.UndefOr[java.lang.String] = js.undefined
  var setupTag: js.UndefOr[js.Array[SetupTag]] = js.undefined
  var tagFiringOption: js.UndefOr[java.lang.String] = js.undefined
  var tagId: js.UndefOr[java.lang.String] = js.undefined
  var tagManagerUrl: js.UndefOr[java.lang.String] = js.undefined
  var teardownTag: js.UndefOr[js.Array[TeardownTag]] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var workspaceId: js.UndefOr[java.lang.String] = js.undefined
}

object Tag {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    blockingRuleId: js.Array[java.lang.String] = null,
    blockingTriggerId: js.Array[java.lang.String] = null,
    containerId: java.lang.String = null,
    fingerprint: java.lang.String = null,
    firingRuleId: js.Array[java.lang.String] = null,
    firingTriggerId: js.Array[java.lang.String] = null,
    liveOnly: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    notes: java.lang.String = null,
    parameter: js.Array[Parameter] = null,
    parentFolderId: java.lang.String = null,
    path: java.lang.String = null,
    paused: js.UndefOr[scala.Boolean] = js.undefined,
    priority: Parameter = null,
    scheduleEndMs: java.lang.String = null,
    scheduleStartMs: java.lang.String = null,
    setupTag: js.Array[SetupTag] = null,
    tagFiringOption: java.lang.String = null,
    tagId: java.lang.String = null,
    tagManagerUrl: java.lang.String = null,
    teardownTag: js.Array[TeardownTag] = null,
    `type`: java.lang.String = null,
    workspaceId: java.lang.String = null
  ): Tag = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (blockingRuleId != null) __obj.updateDynamic("blockingRuleId")(blockingRuleId)
    if (blockingTriggerId != null) __obj.updateDynamic("blockingTriggerId")(blockingTriggerId)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (firingRuleId != null) __obj.updateDynamic("firingRuleId")(firingRuleId)
    if (firingTriggerId != null) __obj.updateDynamic("firingTriggerId")(firingTriggerId)
    if (!js.isUndefined(liveOnly)) __obj.updateDynamic("liveOnly")(liveOnly)
    if (name != null) __obj.updateDynamic("name")(name)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (parameter != null) __obj.updateDynamic("parameter")(parameter)
    if (parentFolderId != null) __obj.updateDynamic("parentFolderId")(parentFolderId)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(paused)) __obj.updateDynamic("paused")(paused)
    if (priority != null) __obj.updateDynamic("priority")(priority)
    if (scheduleEndMs != null) __obj.updateDynamic("scheduleEndMs")(scheduleEndMs)
    if (scheduleStartMs != null) __obj.updateDynamic("scheduleStartMs")(scheduleStartMs)
    if (setupTag != null) __obj.updateDynamic("setupTag")(setupTag)
    if (tagFiringOption != null) __obj.updateDynamic("tagFiringOption")(tagFiringOption)
    if (tagId != null) __obj.updateDynamic("tagId")(tagId)
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl)
    if (teardownTag != null) __obj.updateDynamic("teardownTag")(teardownTag)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId)
    __obj.asInstanceOf[Tag]
  }
}

