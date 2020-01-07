package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$HistoryLabelRemoved extends js.Object {
  /**
    * Label IDs removed from the message.
    */
  var labelIds: js.UndefOr[js.Array[String]] = js.native
  var message: js.UndefOr[Schema$Message] = js.native
}

object Schema$HistoryLabelRemoved {
  @scala.inline
  def apply(labelIds: js.Array[String] = null, message: Schema$Message = null): Schema$HistoryLabelRemoved = {
    val __obj = js.Dynamic.literal()
    if (labelIds != null) __obj.updateDynamic("labelIds")(labelIds.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HistoryLabelRemoved]
  }
}

