package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareDialogResponse extends DialogResponse {
  var post_id: java.lang.String
}

object ShareDialogResponse {
  @scala.inline
  def apply(
    post_id: java.lang.String,
    error_code: scala.Int | scala.Double = null,
    error_message: java.lang.String = null
  ): ShareDialogResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("post_id")(post_id)
    if (error_code != null) __obj.updateDynamic("error_code")(error_code.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message)
    __obj.asInstanceOf[ShareDialogResponse]
  }
}

