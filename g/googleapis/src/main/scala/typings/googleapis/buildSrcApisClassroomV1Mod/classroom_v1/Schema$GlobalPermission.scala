package typings.googleapis.buildSrcApisClassroomV1Mod.classroom_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Global user permission description.
  */
@js.native
trait Schema$GlobalPermission extends js.Object {
  /**
    * Permission value.
    */
  var permission: js.UndefOr[String] = js.native
}

object Schema$GlobalPermission {
  @scala.inline
  def apply(permission: String = null): Schema$GlobalPermission = {
    val __obj = js.Dynamic.literal()
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GlobalPermission]
  }
}

