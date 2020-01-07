package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The details of the login action.
  */
@js.native
trait Schema$LoginDetails extends js.Object {
  /**
    * Optional. The human-readable IP address (for example, `11.22.33.44`) that
    * is associated with the warning event.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * Optional. The successful login time that is associated with the warning
    * event. This will not be present for blocked login attempts.
    */
  var loginTime: js.UndefOr[String] = js.native
}

object Schema$LoginDetails {
  @scala.inline
  def apply(ipAddress: String = null, loginTime: String = null): Schema$LoginDetails = {
    val __obj = js.Dynamic.literal()
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (loginTime != null) __obj.updateDynamic("loginTime")(loginTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LoginDetails]
  }
}

