package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GameRequestDialogResponse extends DialogResponse {
  var request: java.lang.String
  var to: js.Array[java.lang.String]
}

object GameRequestDialogResponse {
  @scala.inline
  def apply(
    request: java.lang.String,
    to: js.Array[java.lang.String],
    error_code: scala.Int | scala.Double = null,
    error_message: java.lang.String = null
  ): GameRequestDialogResponse = {
    val __obj = js.Dynamic.literal(request = request, to = to)
    if (error_code != null) __obj.updateDynamic("error_code")(error_code.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message)
    __obj.asInstanceOf[GameRequestDialogResponse]
  }
}

