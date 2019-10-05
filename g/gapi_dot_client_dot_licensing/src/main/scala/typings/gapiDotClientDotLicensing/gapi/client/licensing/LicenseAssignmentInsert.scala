package typings.gapiDotClientDotLicensing.gapi.client.licensing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseAssignmentInsert extends js.Object {
  /** Email id of the user */
  var userId: js.UndefOr[String] = js.undefined
}

object LicenseAssignmentInsert {
  @scala.inline
  def apply(userId: String = null): LicenseAssignmentInsert = {
    val __obj = js.Dynamic.literal()
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[LicenseAssignmentInsert]
  }
}

