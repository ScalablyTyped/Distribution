package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeMessage extends js.Object {
  var code: js.UndefOr[String] = js.native
  var message: js.UndefOr[String] = js.native
}

object CodeMessage {
  @scala.inline
  def apply(code: String = null, message: String = null): CodeMessage = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeMessage]
  }
}

