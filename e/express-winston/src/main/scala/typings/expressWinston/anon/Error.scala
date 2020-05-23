package typings.expressWinston.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error extends js.Object {
  var error: js.UndefOr[String] = js.undefined
  var success: js.UndefOr[String] = js.undefined
  var warn: js.UndefOr[String] = js.undefined
}

object Error {
  @scala.inline
  def apply(error: String = null, success: String = null, warn: String = null): Error = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(success.asInstanceOf[js.Any])
    if (warn != null) __obj.updateDynamic("warn")(warn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error]
  }
}

