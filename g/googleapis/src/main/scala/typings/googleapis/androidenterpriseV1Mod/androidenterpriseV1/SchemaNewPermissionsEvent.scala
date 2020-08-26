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
  def apply(): SchemaNewPermissionsEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaNewPermissionsEvent]
  }
  @scala.inline
  implicit class SchemaNewPermissionsEventOps[Self <: SchemaNewPermissionsEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApprovedPermissionsVarargs(value: String*): Self = this.set("approvedPermissions", js.Array(value :_*))
    @scala.inline
    def setApprovedPermissions(value: js.Array[String]): Self = this.set("approvedPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovedPermissions: Self = this.set("approvedPermissions", js.undefined)
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    @scala.inline
    def setRequestedPermissionsVarargs(value: String*): Self = this.set("requestedPermissions", js.Array(value :_*))
    @scala.inline
    def setRequestedPermissions(value: js.Array[String]): Self = this.set("requestedPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequestedPermissions: Self = this.set("requestedPermissions", js.undefined)
  }
  
}

