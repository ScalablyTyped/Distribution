package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when new permissions are added to an app.
  */
@js.native
trait SchemaNewPermissionsEvent extends js.Object {
  /**
    * The set of permissions that the enterprise admin has already approved for
    * this application. Use Permissions.Get on the EMM API to retrieve details
    * about these permissions.
    */
  var approvedPermissions: js.UndefOr[js.Array[String]] = js.native
  /**
    * The id of the product (e.g. &quot;app:com.google.android.gm&quot;) for
    * which new permissions were added. This field will always be present.
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The set of permissions that the app is currently requesting. Use
    * Permissions.Get on the EMM API to retrieve details about these
    * permissions.
    */
  var requestedPermissions: js.UndefOr[js.Array[String]] = js.native
}

object SchemaNewPermissionsEvent {
  @scala.inline
  def apply(
    approvedPermissions: js.Array[String] = null,
    productId: String = null,
    requestedPermissions: js.Array[String] = null
  ): SchemaNewPermissionsEvent = {
    val __obj = js.Dynamic.literal()
    if (approvedPermissions != null) __obj.updateDynamic("approvedPermissions")(approvedPermissions.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (requestedPermissions != null) __obj.updateDynamic("requestedPermissions")(requestedPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaNewPermissionsEvent]
  }
}

