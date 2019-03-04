package typings
package facebookDashJsDashSdkLib.facebookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstantExperiencesAdsDialogResponse extends DialogResponse {
  var id: java.lang.String
  var success: scala.Boolean
}

object InstantExperiencesAdsDialogResponse {
  @scala.inline
  def apply(
    id: java.lang.String,
    success: scala.Boolean,
    error_code: scala.Int | scala.Double = null,
    error_message: java.lang.String = null
  ): InstantExperiencesAdsDialogResponse = {
    val __obj = js.Dynamic.literal(id = id, success = success)
    if (error_code != null) __obj.updateDynamic("error_code")(error_code.asInstanceOf[js.Any])
    if (error_message != null) __obj.updateDynamic("error_message")(error_message)
    __obj.asInstanceOf[InstantExperiencesAdsDialogResponse]
  }
}

