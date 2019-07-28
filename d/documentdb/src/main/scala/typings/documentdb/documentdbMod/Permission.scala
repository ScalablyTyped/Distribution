package typings.documentdb.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends UniqueId {
  /** The mode of the permission */
  var permissionMode: PermissionMode
  /** The link of the resource that the permission will be applied to. */
  var resource: String
}

object Permission {
  @scala.inline
  def apply(id: String, permissionMode: PermissionMode, resource: String): Permission = {
    val __obj = js.Dynamic.literal(id = id, permissionMode = permissionMode, resource = resource)
  
    __obj.asInstanceOf[Permission]
  }
}

