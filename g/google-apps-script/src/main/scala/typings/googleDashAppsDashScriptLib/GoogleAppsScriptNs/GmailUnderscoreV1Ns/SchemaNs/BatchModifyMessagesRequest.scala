package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.GmailUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchModifyMessagesRequest extends js.Object {
  var addLabelIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var ids: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var removeLabelIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object BatchModifyMessagesRequest {
  @scala.inline
  def apply(
    addLabelIds: js.Array[java.lang.String] = null,
    ids: js.Array[java.lang.String] = null,
    removeLabelIds: js.Array[java.lang.String] = null
  ): BatchModifyMessagesRequest = {
    val __obj = js.Dynamic.literal()
    if (addLabelIds != null) __obj.updateDynamic("addLabelIds")(addLabelIds)
    if (ids != null) __obj.updateDynamic("ids")(ids)
    if (removeLabelIds != null) __obj.updateDynamic("removeLabelIds")(removeLabelIds)
    __obj.asInstanceOf[BatchModifyMessagesRequest]
  }
}

