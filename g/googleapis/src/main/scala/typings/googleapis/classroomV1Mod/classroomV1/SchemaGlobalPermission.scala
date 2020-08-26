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
  def apply(): SchemaGlobalPermission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGlobalPermission]
  }
  @scala.inline
  implicit class SchemaGlobalPermissionOps[Self <: SchemaGlobalPermission] (val x: Self) extends AnyVal {
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
    def setPermission(value: String): Self = this.set("permission", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePermission: Self = this.set("permission", js.undefined)
  }
  
}

