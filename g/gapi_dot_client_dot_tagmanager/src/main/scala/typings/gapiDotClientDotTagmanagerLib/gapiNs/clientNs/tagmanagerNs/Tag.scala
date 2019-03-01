package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tag extends js.Object {
  /** GTM Account ID. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** Blocking rule IDs. If any of the listed rules evaluate to true, the tag will not fire. */
  var blockingRuleId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Blocking trigger IDs. If any of the listed triggers evaluate to true, the tag will not fire. */
  var blockingTriggerId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** GTM Container ID. */
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  /** The fingerprint of the GTM Tag as computed at storage time. This value is recomputed whenever the tag is modified. */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** Firing rule IDs. A tag will fire when any of the listed rules are true and all of its blockingRuleIds (if any specified) are false. */
  var firingRuleId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Firing trigger IDs. A tag will fire when any of the listed triggers are true and all of its blockingTriggerIds (if any specified) are false. */
  var firingTriggerId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** If set to true, this tag will only fire in the live environment (e.g. not in preview or debug mode). */
  var liveOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** Tag display name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** User notes on how to apply this tag in the container. */
  var notes: js.UndefOr[java.lang.String] = js.undefined
  /** The tag's parameters. */
  var parameter: js.UndefOr[js.Array[Parameter]] = js.undefined
  /** Parent folder id. */
  var parentFolderId: js.UndefOr[java.lang.String] = js.undefined
  /** GTM Tag's API relative path. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /**
    * User defined numeric priority of the tag. Tags are fired asynchronously in order of priority. Tags with higher numeric value fire first. A tag's
    * priority can be a positive or negative value. The default value is 0.
    */
  var priority: js.UndefOr[Parameter] = js.undefined
  /** The end timestamp in milliseconds to schedule a tag. */
  var scheduleEndMs: js.UndefOr[java.lang.String] = js.undefined
  /** The start timestamp in milliseconds to schedule a tag. */
  var scheduleStartMs: js.UndefOr[java.lang.String] = js.undefined
  /** The list of setup tags. Currently we only allow one. */
  var setupTag: js.UndefOr[js.Array[SetupTag]] = js.undefined
  /** Option to fire this tag. */
  var tagFiringOption: js.UndefOr[java.lang.String] = js.undefined
  /** The Tag ID uniquely identifies the GTM Tag. */
  var tagId: js.UndefOr[java.lang.String] = js.undefined
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The list of teardown tags. Currently we only allow one. */
  var teardownTag: js.UndefOr[js.Array[TeardownTag]] = js.undefined
  /** GTM Tag Type. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** GTM Workspace ID. */
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

