package typings
package gapiDotClientDotTagmanagerLib.gapiNs.clientNs.tagmanagerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  /** GTM Account ID. */
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  /** GTM Container ID. */
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * For mobile containers only: A list of trigger IDs for disabling conditional variables; the variable is enabled if one of the enabling trigger is true
    * while all the disabling trigger are false. Treated as an unordered set.
    */
  var disablingTriggerId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * For mobile containers only: A list of trigger IDs for enabling conditional variables; the variable is enabled if one of the enabling triggers is true
    * while all the disabling triggers are false. Treated as an unordered set.
    */
  var enablingTriggerId: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The fingerprint of the GTM Variable as computed at storage time. This value is recomputed whenever the variable is modified. */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /** Variable display name. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** User notes on how to apply this variable in the container. */
  var notes: js.UndefOr[java.lang.String] = js.undefined
  /** The variable's parameters. */
  var parameter: js.UndefOr[js.Array[Parameter]] = js.undefined
  /** Parent folder id. */
  var parentFolderId: js.UndefOr[java.lang.String] = js.undefined
  /** GTM Variable's API relative path. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** The end timestamp in milliseconds to schedule a variable. */
  var scheduleEndMs: js.UndefOr[java.lang.String] = js.undefined
  /** The start timestamp in milliseconds to schedule a variable. */
  var scheduleStartMs: js.UndefOr[java.lang.String] = js.undefined
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[java.lang.String] = js.undefined
  /** GTM Variable Type. */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /** The Variable ID uniquely identifies the GTM Variable. */
  var variableId: js.UndefOr[java.lang.String] = js.undefined
  /** GTM Workspace ID. */
  var workspaceId: js.UndefOr[java.lang.String] = js.undefined
}

