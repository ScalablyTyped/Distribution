package typings.gapiDotClientDotTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  /** GTM Account ID. */
  var accountId: js.UndefOr[String] = js.undefined
  /** GTM Container ID. */
  var containerId: js.UndefOr[String] = js.undefined
  /**
    * For mobile containers only: A list of trigger IDs for disabling conditional variables; the variable is enabled if one of the enabling trigger is true
    * while all the disabling trigger are false. Treated as an unordered set.
    */
  var disablingTriggerId: js.UndefOr[js.Array[String]] = js.undefined
  /**
    * For mobile containers only: A list of trigger IDs for enabling conditional variables; the variable is enabled if one of the enabling triggers is true
    * while all the disabling triggers are false. Treated as an unordered set.
    */
  var enablingTriggerId: js.UndefOr[js.Array[String]] = js.undefined
  /** The fingerprint of the GTM Variable as computed at storage time. This value is recomputed whenever the variable is modified. */
  var fingerprint: js.UndefOr[String] = js.undefined
  /** Variable display name. */
  var name: js.UndefOr[String] = js.undefined
  /** User notes on how to apply this variable in the container. */
  var notes: js.UndefOr[String] = js.undefined
  /** The variable's parameters. */
  var parameter: js.UndefOr[js.Array[Parameter]] = js.undefined
  /** Parent folder id. */
  var parentFolderId: js.UndefOr[String] = js.undefined
  /** GTM Variable's API relative path. */
  var path: js.UndefOr[String] = js.undefined
  /** The end timestamp in milliseconds to schedule a variable. */
  var scheduleEndMs: js.UndefOr[String] = js.undefined
  /** The start timestamp in milliseconds to schedule a variable. */
  var scheduleStartMs: js.UndefOr[String] = js.undefined
  /** Auto generated link to the tag manager UI */
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  /** GTM Variable Type. */
  var `type`: js.UndefOr[String] = js.undefined
  /** The Variable ID uniquely identifies the GTM Variable. */
  var variableId: js.UndefOr[String] = js.undefined
  /** GTM Workspace ID. */
  var workspaceId: js.UndefOr[String] = js.undefined
}

object Variable {
  @scala.inline
  def apply(
    accountId: String = null,
    containerId: String = null,
    disablingTriggerId: js.Array[String] = null,
    enablingTriggerId: js.Array[String] = null,
    fingerprint: String = null,
    name: String = null,
    notes: String = null,
    parameter: js.Array[Parameter] = null,
    parentFolderId: String = null,
    path: String = null,
    scheduleEndMs: String = null,
    scheduleStartMs: String = null,
    tagManagerUrl: String = null,
    `type`: String = null,
    variableId: String = null,
    workspaceId: String = null
  ): Variable = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (disablingTriggerId != null) __obj.updateDynamic("disablingTriggerId")(disablingTriggerId)
    if (enablingTriggerId != null) __obj.updateDynamic("enablingTriggerId")(enablingTriggerId)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (name != null) __obj.updateDynamic("name")(name)
    if (notes != null) __obj.updateDynamic("notes")(notes)
    if (parameter != null) __obj.updateDynamic("parameter")(parameter)
    if (parentFolderId != null) __obj.updateDynamic("parentFolderId")(parentFolderId)
    if (path != null) __obj.updateDynamic("path")(path)
    if (scheduleEndMs != null) __obj.updateDynamic("scheduleEndMs")(scheduleEndMs)
    if (scheduleStartMs != null) __obj.updateDynamic("scheduleStartMs")(scheduleStartMs)
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (variableId != null) __obj.updateDynamic("variableId")(variableId)
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId)
    __obj.asInstanceOf[Variable]
  }
}

