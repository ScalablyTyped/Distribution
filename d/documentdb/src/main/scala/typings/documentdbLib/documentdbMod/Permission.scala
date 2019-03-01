package typings
package documentdbLib.documentdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends UniqueId {
  /** The mode of the permission */
  var permissionMode: PermissionMode
  /** The link of the resource that the permission will be applied to. */
  var resource: java.lang.String
}

object Permission {
  @scala.inline
  def apply(id: java.lang.String, permissionMode: PermissionMode, resource: java.lang.String): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("permissionMode")(permissionMode)
    __obj.updateDynamic("resource")(resource)
    __obj.asInstanceOf[Permission]
  }
}

