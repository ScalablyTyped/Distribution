package typings.googleDashAppsDashScript.GoogleAppsScript.TagManager.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Variable extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var containerId: js.UndefOr[String] = js.undefined
  var disablingTriggerId: js.UndefOr[js.Array[String]] = js.undefined
  var enablingTriggerId: js.UndefOr[js.Array[String]] = js.undefined
  var fingerprint: js.UndefOr[String] = js.undefined
  var formatValue: js.UndefOr[VariableFormatValue] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var notes: js.UndefOr[String] = js.undefined
  var parameter: js.UndefOr[js.Array[Parameter]] = js.undefined
  var parentFolderId: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var scheduleEndMs: js.UndefOr[String] = js.undefined
  var scheduleStartMs: js.UndefOr[String] = js.undefined
  var tagManagerUrl: js.UndefOr[String] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var variableId: js.UndefOr[String] = js.undefined
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
    formatValue: VariableFormatValue = null,
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
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (disablingTriggerId != null) __obj.updateDynamic("disablingTriggerId")(disablingTriggerId.asInstanceOf[js.Any])
    if (enablingTriggerId != null) __obj.updateDynamic("enablingTriggerId")(enablingTriggerId.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (formatValue != null) __obj.updateDynamic("formatValue")(formatValue.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    if (parameter != null) __obj.updateDynamic("parameter")(parameter.asInstanceOf[js.Any])
    if (parentFolderId != null) __obj.updateDynamic("parentFolderId")(parentFolderId.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (scheduleEndMs != null) __obj.updateDynamic("scheduleEndMs")(scheduleEndMs.asInstanceOf[js.Any])
    if (scheduleStartMs != null) __obj.updateDynamic("scheduleStartMs")(scheduleStartMs.asInstanceOf[js.Any])
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (variableId != null) __obj.updateDynamic("variableId")(variableId.asInstanceOf[js.Any])
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Variable]
  }
}

