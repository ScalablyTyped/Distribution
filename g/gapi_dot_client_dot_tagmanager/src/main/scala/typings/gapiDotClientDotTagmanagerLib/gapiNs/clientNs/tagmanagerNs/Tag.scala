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

