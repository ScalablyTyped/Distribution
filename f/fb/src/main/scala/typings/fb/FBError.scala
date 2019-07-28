package typings.fb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FBError extends js.Object {
  var code: Double
  var error_subcode: js.UndefOr[Double] = js.undefined
  var error_user_msg: js.UndefOr[String] = js.undefined
  var error_user_title: js.UndefOr[String] = js.undefined
  var fbtrace_id: String
  var message: String
  var `type`: String
}

object FBError {
  @scala.inline
  def apply(
    code: Double,
    fbtrace_id: String,
    message: String,
    `type`: String,
    error_subcode: Int | Double = null,
    error_user_msg: String = null,
    error_user_title: String = null
  ): FBError = {
    val __obj = js.Dynamic.literal(code = code, fbtrace_id = fbtrace_id, message = message)
    __obj.updateDynamic("type")(`type`)
    if (error_subcode != null) __obj.updateDynamic("error_subcode")(error_subcode.asInstanceOf[js.Any])
    if (error_user_msg != null) __obj.updateDynamic("error_user_msg")(error_user_msg)
    if (error_user_title != null) __obj.updateDynamic("error_user_title")(error_user_title)
    __obj.asInstanceOf[FBError]
  }
}

