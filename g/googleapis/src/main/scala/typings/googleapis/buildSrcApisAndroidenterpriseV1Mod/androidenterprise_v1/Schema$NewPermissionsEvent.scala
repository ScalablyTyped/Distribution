package typings.googleapis.buildSrcApisAndroidenterpriseV1Mod.androidenterprise_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An event generated when new permissions are added to an app.
  */
@js.native
trait Schema$NewPermissionsEvent extends js.Object {
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

object Schema$NewPermissionsEvent {
  @scala.inline
  def apply(
    approvedPermissions: js.Array[String] = null,
    productId: String = null,
    requestedPermissions: js.Array[String] = null
  ): Schema$NewPermissionsEvent = {
    val __obj = js.Dynamic.literal()
    if (approvedPermissions != null) __obj.updateDynamic("approvedPermissions")(approvedPermissions.asInstanceOf[js.Any])
    if (productId != null) __obj.updateDynamic("productId")(productId.asInstanceOf[js.Any])
    if (requestedPermissions != null) __obj.updateDynamic("requestedPermissions")(requestedPermissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$NewPermissionsEvent]
  }
}

