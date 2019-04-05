package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterAction extends js.Object {
  var addLabelIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var forward: js.UndefOr[java.lang.String] = js.undefined
  var removeLabelIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object FilterAction {
  @scala.inline
  def apply(
    addLabelIds: js.Array[java.lang.String] = null,
    forward: java.lang.String = null,
    removeLabelIds: js.Array[java.lang.String] = null
  ): FilterAction = {
    val __obj = js.Dynamic.literal()
    if (addLabelIds != null) __obj.updateDynamic("addLabelIds")(addLabelIds)
    if (forward != null) __obj.updateDynamic("forward")(forward)
    if (removeLabelIds != null) __obj.updateDynamic("removeLabelIds")(removeLabelIds)
    __obj.asInstanceOf[FilterAction]
  }
}

