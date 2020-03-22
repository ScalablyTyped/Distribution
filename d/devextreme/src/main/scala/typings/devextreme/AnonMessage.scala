package typings.devextreme

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMessage extends js.Object {
  var message: js.UndefOr[String] = js.undefined
}

object AnonMessage {
  @scala.inline
  def apply(message: String = null): AnonMessage = {
    val __obj = js.Dynamic.literal()
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMessage]
  }
}

