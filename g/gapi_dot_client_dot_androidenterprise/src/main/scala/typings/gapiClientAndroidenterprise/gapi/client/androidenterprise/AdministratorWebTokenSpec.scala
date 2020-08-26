package typings.gapiClientAndroidenterprise.gapi.client.androidenterprise

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdministratorWebTokenSpec extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#administratorWebTokenSpec". */
  var kind: js.UndefOr[String] = js.native
  /** The URI of the parent frame hosting the iframe. To prevent XSS, the iframe may not be hosted at other URIs. This URI must be https. */
  var parent: js.UndefOr[String] = js.native
  /**
    * The list of permissions the admin is granted within the iframe. The admin will only be allowed to view an iframe if they have all of the permissions
    * associated with it. The only valid value is "approveApps" that will allow the admin to access the iframe in "approve" mode.
    */
  var permission: js.UndefOr[js.Array[String]] = js.native
}

object AdministratorWebTokenSpec {
  @scala.inline
  def apply(): AdministratorWebTokenSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdministratorWebTokenSpec]
  }
  @scala.inline
  implicit class AdministratorWebTokenSpecOps[Self <: AdministratorWebTokenSpec] (val x: Self) extends AnyVal {
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
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setPermissionVarargs(value: String*): Self = this.set("permission", js.Array(value :_*))
    @scala.inline
    def setPermission(value: js.Array[String]): Self = this.set("permission", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermission: Self = this.set("permission", js.undefined)
  }
  
}

