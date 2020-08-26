package typings.gapiClientAndroidmanagement.gapi.client.androidmanagement

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationPermission extends js.Object {
  /** A longer description of the permission, giving more details of what it affects. Localized. */
  var description: js.UndefOr[String] = js.native
  /** The name of the permission. Localized. */
  var name: js.UndefOr[String] = js.native
  /** An opaque string uniquely identifying the permission. Not localized. */
  var permissionId: js.UndefOr[String] = js.native
}

object ApplicationPermission {
  @scala.inline
  def apply(): ApplicationPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplicationPermission]
  }
  @scala.inline
  implicit class ApplicationPermissionOps[Self <: ApplicationPermission] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPermissionId(value: String): Self = this.set("permissionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermissionId: Self = this.set("permissionId", js.undefined)
  }
  
}

