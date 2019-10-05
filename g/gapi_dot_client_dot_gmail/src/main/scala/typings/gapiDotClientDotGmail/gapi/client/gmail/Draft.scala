package typings.gapiDotClientDotGmail.gapi.client.gmail

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Draft extends js.Object {
  /** The immutable ID of the draft. */
  var id: js.UndefOr[String] = js.undefined
  /** The message content of the draft. */
  var message: js.UndefOr[Message] = js.undefined
}

object Draft {
  @scala.inline
  def apply(id: String = null, message: Message = null): Draft = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (message != null) __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Draft]
  }
}

