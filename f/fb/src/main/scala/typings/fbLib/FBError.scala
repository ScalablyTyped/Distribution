package typings
package fbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FBError extends js.Object {
  var code: scala.Double
  var error_subcode: js.UndefOr[scala.Double] = js.undefined
  var error_user_msg: js.UndefOr[java.lang.String] = js.undefined
  var error_user_title: js.UndefOr[java.lang.String] = js.undefined
  var fbtrace_id: java.lang.String
  var message: java.lang.String
  var `type`: java.lang.String
}

object FBError {
  @scala.inline
  def apply(
    code: scala.Double,
    fbtrace_id: java.lang.String,
    message: java.lang.String,
    `type`: java.lang.String,
    error_subcode: scala.Int | scala.Double = null,
    error_user_msg: java.lang.String = null,
    error_user_title: java.lang.String = null
  ): FBError = {
    val __obj = js.Dynamic.literal(code = code, fbtrace_id = fbtrace_id, message = message)
    __obj.updateDynamic("type")(`type`)
    if (error_subcode != null) __obj.updateDynamic("error_subcode")(error_subcode.asInstanceOf[js.Any])
    if (error_user_msg != null) __obj.updateDynamic("error_user_msg")(error_user_msg)
    if (error_user_title != null) __obj.updateDynamic("error_user_title")(error_user_title)
    __obj.asInstanceOf[FBError]
  }
}

