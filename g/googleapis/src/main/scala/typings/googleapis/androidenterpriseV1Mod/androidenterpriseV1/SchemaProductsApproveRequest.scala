package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaProductsApproveRequest extends js.Object {
  /**
    * The approval URL that was shown to the user. Only the permissions shown
    * to the user with that URL will be accepted, which may not be the
    * product&#39;s entire set of permissions. For example, the URL may only
    * display new permissions from an update after the product was approved, or
    * not include new permissions if the product was updated since the URL was
    * generated.
    */
  var approvalUrlInfo: js.UndefOr[SchemaApprovalUrlInfo] = js.native
  /**
    * Sets how new permission requests for the product are handled.
    * &quot;allPermissions&quot; automatically approves all current and future
    * permissions for the product. &quot;currentPermissionsOnly&quot; approves
    * the current set of permissions for the product, but any future
    * permissions added through updates will require manual reapproval. If not
    * specified, only the current set of permissions will be approved.
    */
  var approvedPermissions: js.UndefOr[String] = js.native
}

object SchemaProductsApproveRequest {
  @scala.inline
  def apply(approvalUrlInfo: SchemaApprovalUrlInfo = null, approvedPermissions: String = null): SchemaProductsApproveRequest = {
    val __obj = js.Dynamic.literal()
    if (approvalUrlInfo != null) __obj.updateDynamic("approvalUrlInfo")(approvalUrlInfo.asInstanceOf[js.Any])
    if (approvedPermissions != null) __obj.updateDynamic("approvedPermissions")(approvedPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaProductsApproveRequest]
  }
}

