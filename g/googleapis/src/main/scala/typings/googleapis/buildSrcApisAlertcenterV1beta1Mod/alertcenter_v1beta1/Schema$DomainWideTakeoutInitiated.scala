package typings.googleapis.buildSrcApisAlertcenterV1beta1Mod.alertcenter_v1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A takeout operation for the entire domain was initiated by an admin.
  * Derived from audit logs.
  */
@js.native
trait Schema$DomainWideTakeoutInitiated extends js.Object {
  /**
    * The email of the admin who initiated the takeout.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * The takeout request ID.
    */
  var takeoutRequestId: js.UndefOr[String] = js.native
}

object Schema$DomainWideTakeoutInitiated {
  @scala.inline
  def apply(email: String = null, takeoutRequestId: String = null): Schema$DomainWideTakeoutInitiated = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (takeoutRequestId != null) __obj.updateDynamic("takeoutRequestId")(takeoutRequestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$DomainWideTakeoutInitiated]
  }
}

