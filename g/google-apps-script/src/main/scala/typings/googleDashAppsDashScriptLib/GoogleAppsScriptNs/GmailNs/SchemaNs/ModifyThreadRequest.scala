package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyThreadRequest extends js.Object {
  var addLabelIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var removeLabelIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ModifyThreadRequest {
  @scala.inline
  def apply(addLabelIds: js.Array[java.lang.String] = null, removeLabelIds: js.Array[java.lang.String] = null): ModifyThreadRequest = {
    val __obj = js.Dynamic.literal()
    if (addLabelIds != null) __obj.updateDynamic("addLabelIds")(addLabelIds)
    if (removeLabelIds != null) __obj.updateDynamic("removeLabelIds")(removeLabelIds)
    __obj.asInstanceOf[ModifyThreadRequest]
  }
}

