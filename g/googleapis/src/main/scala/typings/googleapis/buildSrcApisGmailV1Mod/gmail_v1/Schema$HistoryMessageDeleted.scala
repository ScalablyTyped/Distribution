package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$HistoryMessageDeleted extends js.Object {
  var message: js.UndefOr[Schema$Message] = js.native
}

object Schema$HistoryMessageDeleted {
  @scala.inline
  def apply(message: Schema$Message = null): Schema$HistoryMessageDeleted = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$HistoryMessageDeleted]
  }
}

