package typings.documentdb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends UniqueId {
  /** The mode of the permission */
  var permissionMode: PermissionMode = js.native
  /** The link of the resource that the permission will be applied to. */
  var resource: String = js.native
}

object Permission {
  @scala.inline
  def apply(id: String, permissionMode: PermissionMode, resource: String): Permission = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], permissionMode = permissionMode.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
  @scala.inline
  implicit class PermissionOps[Self <: Permission] (val x: Self) extends AnyVal {
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
    def setPermissionMode(value: PermissionMode): Self = this.set("permissionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
  }
  
}

