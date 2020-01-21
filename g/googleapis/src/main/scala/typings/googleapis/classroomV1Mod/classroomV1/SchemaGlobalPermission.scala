package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Global user permission description.
  */
@js.native
trait SchemaGlobalPermission extends js.Object {
  /**
    * Permission value.
    */
  var permission: js.UndefOr[String] = js.native
}

object SchemaGlobalPermission {
  @scala.inline
  def apply(permission: String = null): SchemaGlobalPermission = {
    val __obj = js.Dynamic.literal()
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGlobalPermission]
  }
}

