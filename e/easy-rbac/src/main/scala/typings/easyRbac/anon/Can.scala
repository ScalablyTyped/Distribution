package typings.easyRbac.anon

import typings.easyRbac.mod.RoleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Can extends js.Object {
  var can: js.Array[String | RoleObject]
  var inherits: js.UndefOr[js.Array[String]] = js.undefined
}

object Can {
  @scala.inline
  def apply(can: js.Array[String | RoleObject], inherits: js.Array[String] = null): Can = {
    val __obj = js.Dynamic.literal(can = can.asInstanceOf[js.Any])
    if (inherits != null) __obj.updateDynamic("inherits")(inherits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Can]
  }
}

