package typings.gapiDotClientDotGmail.gapiNs.clientNs.gmailNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDeleteMessagesRequest extends js.Object {
  /** The IDs of the messages to delete. */
  var ids: js.UndefOr[js.Array[String]] = js.undefined
}

object BatchDeleteMessagesRequest {
  @scala.inline
  def apply(ids: js.Array[String] = null): BatchDeleteMessagesRequest = {
    val __obj = js.Dynamic.literal()
    if (ids != null) __obj.updateDynamic("ids")(ids)
    __obj.asInstanceOf[BatchDeleteMessagesRequest]
  }
}

