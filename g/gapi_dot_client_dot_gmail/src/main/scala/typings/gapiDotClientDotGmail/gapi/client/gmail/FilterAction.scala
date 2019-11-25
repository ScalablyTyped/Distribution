package typings.gapiDotClientDotGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterAction extends js.Object {
  /** List of labels to add to the message. */
  var addLabelIds: js.UndefOr[js.Array[String]] = js.undefined
  /** Email address that the message should be forwarded to. */
  var forward: js.UndefOr[String] = js.undefined
  /** List of labels to remove from the message. */
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
    if (addLabelIds != null) __obj.updateDynamic("addLabelIds")(addLabelIds.asInstanceOf[js.Any])
    if (forward != null) __obj.updateDynamic("forward")(forward.asInstanceOf[js.Any])
    if (removeLabelIds != null) __obj.updateDynamic("removeLabelIds")(removeLabelIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterAction]
  }
}

