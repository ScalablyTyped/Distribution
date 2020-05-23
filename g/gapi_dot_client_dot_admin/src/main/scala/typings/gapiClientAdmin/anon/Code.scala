package typings.gapiClientAdmin.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Code extends js.Object {
  /** Machine readable code / warning type. */
  var code: js.UndefOr[String] = js.undefined
  /** Key-Value pairs to give detailed information on the warning. */
  var data: js.UndefOr[js.Array[Key]] = js.undefined
  /** Human readable message for the warning. */
  var message: js.UndefOr[String] = js.undefined
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

