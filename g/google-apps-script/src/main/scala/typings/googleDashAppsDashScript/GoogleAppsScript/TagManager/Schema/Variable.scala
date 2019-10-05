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
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (disablingTriggerId != null) __obj.updateDynamic("disablingTriggerId")(disablingTriggerId)
    if (enablingTriggerId != null) __obj.updateDynamic("enablingTriggerId")(enablingTriggerId)
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint)
    if (formatValue != null) __obj.updateDynamic("formatValue")(formatValue)
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

