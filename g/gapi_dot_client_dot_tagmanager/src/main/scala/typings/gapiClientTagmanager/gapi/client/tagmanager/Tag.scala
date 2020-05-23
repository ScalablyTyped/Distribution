package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /** GTM Account ID. */
  var accountId: js.UndefOr[String] = js.undefined
  /** Blocking rule IDs. If any of the listed rules evaluate to true, the tag will not fire. */
  var blockingRuleId: js.UndefOr[js.Array[String]] = js.undefined
  /** Blocking trigger IDs. If any of the listed triggers evaluate to true, the tag will not fire. */
  var blockingTriggerId: js.UndefOr[js.Array[String]] = js.undefined
  /** GTM Container ID. */
  var containerId: js.UndefOr[String] = js.undefined
  /** The fingerprint of the GTM Tag as computed at storage time. This value is recomputed whenever the tag is modified. */
  var fingerprint: js.UndefOr[String] = js.undefined
  /** Firing rule IDs. A tag will fire when any of the listed rules are true and all of its blockingRuleIds (if any specified) are false. */
  var firingRuleId: js.UndefOr[js.Array[String]] = js.undefined
  /** Firing trigger IDs. A tag will fire when any of the listed triggers are true and all of its blockingTriggerIds (if any specified) are false. */
  var firingTriggerId: js.UndefOr[js.Array[String]] = js.undefined
  /** If set to true, this tag will only fire in the live environment (e.g. not in preview or debug mode). */
  var liveOnly: js.UndefOr[Boolean] = js.undefined
  /** Tag display name. */
  var name: js.UndefOr[String] = js.undefined
  /** User notes on how to apply this tag in the container. */
  var notes: js.UndefOr[String] = js.undefined
  /** The tag's parameters. */
  var parameter: js.UndefOr[js.Array[Parameter]] = js.undefined
  /** Parent folder id. */
  var parentFolderId: js.UndefOr[String] = js.undefined
  /** GTM Tag's API relative path. */
  var path: js.UndefOr[String] = js.undefined
  /**
    * User defined numeric priority of the tag. Tags are fired asynchronously in order of priority. Tags with higher numeric value fire first. A tag's
    * priority can be a positive or negative value. The default value is 0.
    */
  var priority: js.UndefOr[Parameter] = js.undefined
  /** The end timestamp in milliseconds to schedule a tag. */
  var scheduleEndMs: js.UndefOr[String] = js.undefined
  /** The start timestamp in milliseconds to schedule a tag. */
  var scheduleStartMs: js.UndefOr[String] = js.undefined
  /** The list of setup tags. Currently we only allow one. */
  var setupTag: js.UndefOr[js.Array[SetupTag]] = js.undefined
  /** Option to fire this tag. */
  var tagFiringOption: js.UndefOr[String] = js.undefined
  /** The Tag ID uniquely identifies the GTM Tag. */
  var tagId: js.UndefOr[String] = js.undefined
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  /** The list of teardown tags. Currently we only allow one. */
  var teardownTag: js.UndefOr[js.Array[TeardownTag]] = js.undefined
  /** GTM Tag Type. */
  var `type`: js.UndefOr[String] = js.undefined
  /** GTM Workspace ID. */
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

