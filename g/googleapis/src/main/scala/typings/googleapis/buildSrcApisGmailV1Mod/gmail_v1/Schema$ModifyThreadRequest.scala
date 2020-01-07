package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ModifyThreadRequest extends js.Object {
  /**
    * A list of IDs of labels to add to this thread.
    */
  var addLabelIds: js.UndefOr[js.Array[String]] = js.native
  /**
    * A list of IDs of labels to remove from this thread.
    */
  var removeLabelIds: js.UndefOr[js.Array[String]] = js.native
}

object Schema$ModifyThreadRequest {
  @scala.inline
  def apply(addLabelIds: js.Array[String] = null, removeLabelIds: js.Array[String] = null): Schema$ModifyThreadRequest = {
    val __obj = js.Dynamic.literal()
    if (addLabelIds != null) __obj.updateDynamic("addLabelIds")(addLabelIds.asInstanceOf[js.Any])
    if (removeLabelIds != null) __obj.updateDynamic("removeLabelIds")(removeLabelIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ModifyThreadRequest]
  }
}

