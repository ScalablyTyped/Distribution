package typings.googleapis.buildSrcApisGmailV1Mod.gmail_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A draft email in the user&#39;s mailbox.
  */
@js.native
trait Schema$Draft extends js.Object {
  /**
    * The immutable ID of the draft.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The message content of the draft.
    */
  var message: js.UndefOr[Schema$Message] = js.native
}

object Schema$Draft {
  @scala.inline
  def apply(id: String = null, message: Schema$Message = null): Schema$Draft = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Draft]
  }
}

