package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DialogResponse extends js.Object {
  var error_code: js.UndefOr[scala.Double] = js.undefined
  var error_message: js.UndefOr[java.lang.String] = js.undefined
}

object DialogResponse {
  @scala.inline
  def apply(error_code: scala.Int | scala.Double = null, error_message: java.lang.String = null): DialogResponse = {
    val __obj = js.Dynamic.literal()
    if (error_code != null) __obj.updateDynamic("error_code")(error_code.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message)
    __obj.asInstanceOf[DialogResponse]
  }
}

