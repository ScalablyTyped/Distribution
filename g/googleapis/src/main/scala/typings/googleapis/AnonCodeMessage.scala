package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonCodeMessage extends js.Object {
  var code: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
}

object AnonCodeMessage {
  @scala.inline
  def apply(code: String = null, message: String = null): AnonCodeMessage = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCodeMessage]
  }
}

