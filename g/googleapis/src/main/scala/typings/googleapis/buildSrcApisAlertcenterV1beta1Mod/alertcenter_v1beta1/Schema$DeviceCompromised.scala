package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mobile device compromised alert. Derived from audit logs.
  */
@js.native
trait Schema$DeviceCompromised extends js.Object {
  /**
    * The email of the user this alert was created for.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Required. The list of security events.
    */
  var events: js.UndefOr[js.Array[Schema$DeviceCompromisedSecurityDetail]] = js.native
}

object Schema$DeviceCompromised {
  @scala.inline
  def apply(email: String = null, events: js.Array[Schema$DeviceCompromisedSecurityDetail] = null): Schema$DeviceCompromised = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DeviceCompromised]
  }
}

