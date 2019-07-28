package typings.googleDashAppsDashScript.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterAction extends js.Object {
  var addLabelIds: js.UndefOr[js.Array[String]] = js.undefined
  var forward: js.UndefOr[String] = js.undefined
  var removeLabelIds: js.UndefOr[js.Array[String]] = js.undefined
}

object FilterAction {
  @scala.inline
  def apply(
    addLabelIds: js.Array[String] = null,
    forward: String = null,
    removeLabelIds: js.Array[String] = null
  ): FilterAction = {
    val __obj = js.Dynamic.literal()
    if (addLabelIds != null) __obj.updateDynamic("addLabelIds")(addLabelIds)
    if (forward != null) __obj.updateDynamic("forward")(forward)
    if (removeLabelIds != null) __obj.updateDynamic("removeLabelIds")(removeLabelIds)
    __obj.asInstanceOf[FilterAction]
  }
}

