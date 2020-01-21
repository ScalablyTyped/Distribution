package typings.googleAppsScript.GoogleAppsScript.Classroom.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GlobalPermission extends js.Object {
  var permission: js.UndefOr[String] = js.undefined
}

object GlobalPermission {
  @scala.inline
  def apply(permission: String = null): GlobalPermission = {
    val __obj = js.Dynamic.literal()
    if (permission != null) __obj.updateDynamic("permission")(permission.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalPermission]
  }
}

