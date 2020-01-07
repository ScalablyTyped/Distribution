package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Alerts for user account warning events.
  */
@js.native
trait Schema$AccountWarning extends js.Object {
  /**
    * Required. The email of the user that this event belongs to.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Optional. Details of the login action associated with the warning event.
    * This is only available for:  * Suspicious login * Suspicious login (less
    * secure app) * Suspicious programmatic login * User suspended (suspicious
    * activity)
    */
  var loginDetails: js.UndefOr[Schema$LoginDetails] = js.native
}

object Schema$AccountWarning {
  @scala.inline
  def apply(email: String = null, loginDetails: Schema$LoginDetails = null): Schema$AccountWarning = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (loginDetails != null) __obj.updateDynamic("loginDetails")(loginDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AccountWarning]
  }
}

