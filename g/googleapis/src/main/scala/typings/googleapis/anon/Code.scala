package typings.googleapis.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Code extends js.Object {
  var code: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Array[Key]] = js.native
  var message: js.UndefOr[String] = js.native
}

object Code {
  @scala.inline
  def apply(code: String = null, data: js.Array[Key] = null, message: String = null): Code = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
}

