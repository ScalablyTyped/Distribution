package typings.googleAppsScript.GoogleAppsScript.Gmail.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchModifyMessagesRequest extends js.Object {
  var addLabelIds: js.UndefOr[js.Array[String]] = js.undefined
  var ids: js.UndefOr[js.Array[String]] = js.undefined
  var removeLabelIds: js.UndefOr[js.Array[String]] = js.undefined
}

object BatchModifyMessagesRequest {
  @scala.inline
  def apply(
    addLabelIds: js.Array[String] = null,
    ids: js.Array[String] = null,
    removeLabelIds: js.Array[String] = null
  ): BatchModifyMessagesRequest = {
    val __obj = js.Dynamic.literal()
    if (addLabelIds != null) __obj.updateDynamic("addLabelIds")(addLabelIds.asInstanceOf[js.Any])
    if (ids != null) __obj.updateDynamic("ids")(ids.asInstanceOf[js.Any])
    if (removeLabelIds != null) __obj.updateDynamic("removeLabelIds")(removeLabelIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchModifyMessagesRequest]
  }
}

