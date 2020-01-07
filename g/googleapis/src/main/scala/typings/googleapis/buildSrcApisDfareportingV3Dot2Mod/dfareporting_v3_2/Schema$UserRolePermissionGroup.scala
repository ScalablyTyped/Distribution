package typings.googleapis.buildSrcApisDfareportingV3Dot2Mod.dfareporting_v3_2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a grouping of related user role permissions.
  */
@js.native
trait Schema$UserRolePermissionGroup extends js.Object {
  /**
    * ID of this user role permission.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Identifies what kind of resource this is. Value: the fixed string
    * &quot;dfareporting#userRolePermissionGroup&quot;.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Name of this user role permission group.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$UserRolePermissionGroup {
  @scala.inline
  def apply(id: String = null, kind: String = null, name: String = null): Schema$UserRolePermissionGroup = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UserRolePermissionGroup]
  }
}

