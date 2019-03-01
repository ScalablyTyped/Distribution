package typings
package gapiDotClientDotLicensingLib.gapiNs.clientNs.licensingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LicenseAssignmentInsert extends js.Object {
  /** Email id of the user */
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

object LicenseAssignmentInsert {
  @scala.inline
  def apply(userId: java.lang.String = null): LicenseAssignmentInsert = {
    val __obj = js.Dynamic.literal()
    if (userId != null) __obj.updateDynamic("userId")(userId)
    __obj.asInstanceOf[LicenseAssignmentInsert]
  }
}

