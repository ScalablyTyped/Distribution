package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateOfferDialogResponse extends DialogResponse {
  var id: java.lang.String
  var success: scala.Boolean
}

object CreateOfferDialogResponse {
  @scala.inline
  def apply(
    id: java.lang.String,
    success: scala.Boolean,
    error_code: scala.Int | scala.Double = null,
    error_message: java.lang.String = null
  ): CreateOfferDialogResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("success")(success)
    if (error_code != null) __obj.updateDynamic("error_code")(error_code.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message)
    __obj.asInstanceOf[CreateOfferDialogResponse]
  }
}

