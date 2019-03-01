package typings
package gapiDotClientDotGmailLib.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterAction extends js.Object {
  /** List of labels to add to the message. */
  var addLabelIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** Email address that the message should be forwarded to. */
  var forward: js.UndefOr[java.lang.String] = js.undefined
  /** List of labels to remove from the message. */
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

