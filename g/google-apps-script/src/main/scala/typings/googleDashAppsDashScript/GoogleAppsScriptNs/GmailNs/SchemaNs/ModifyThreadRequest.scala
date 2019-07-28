package typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyThreadRequest extends js.Object {
  var addLabelIds: js.UndefOr[js.Array[String]] = js.undefined
  var removeLabelIds: js.UndefOr[js.Array[String]] = js.undefined
}

object ModifyThreadRequest {
  @scala.inline
  def apply(addLabelIds: js.Array[String] = null, removeLabelIds: js.Array[String] = null): ModifyThreadRequest = {
    val __obj = js.Dynamic.literal()
    if (addLabelIds != null) __obj.updateDynamic("addLabelIds")(addLabelIds)
    if (removeLabelIds != null) __obj.updateDynamic("removeLabelIds")(removeLabelIds)
    __obj.asInstanceOf[ModifyThreadRequest]
  }
}

