package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProductPermissions extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#productPermissions". */
  var kind: js.UndefOr[String] = js.native
  /** The permissions required by the app. */
  var permission: js.UndefOr[js.Array[ProductPermission]] = js.native
  /** The ID of the app that the permissions relate to, e.g. "app:com.google.android.gm". */
  var productId: js.UndefOr[String] = js.native
}

object ProductPermissions {
  @scala.inline
  def apply(): ProductPermissions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProductPermissions]
  }
  @scala.inline
  implicit class ProductPermissionsOps[Self <: ProductPermissions] (val x: Self) extends AnyVal {
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
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setPermissionVarargs(value: ProductPermission*): Self = this.set("permission", js.Array(value :_*))
    @scala.inline
    def setPermission(value: js.Array[ProductPermission]): Self = this.set("permission", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermission: Self = this.set("permission", js.undefined)
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
  }
  
}

