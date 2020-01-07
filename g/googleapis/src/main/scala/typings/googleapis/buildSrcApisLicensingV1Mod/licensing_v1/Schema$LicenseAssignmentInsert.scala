package typings.googleapis.buildSrcApisLicensingV1Mod.licensing_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Template for LicenseAssignment Insert request
  */
@js.native
trait Schema$LicenseAssignmentInsert extends js.Object {
  /**
    * Email id of the user
    */
  var userId: js.UndefOr[String] = js.native
}

object Schema$LicenseAssignmentInsert {
  @scala.inline
  def apply(userId: String = null): Schema$LicenseAssignmentInsert = {
    val __obj = js.Dynamic.literal()
    if (userId != null) __obj.updateDynamic("userId")(userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LicenseAssignmentInsert]
  }
}

