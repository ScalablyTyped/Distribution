package typings.easyRbac

import typings.easyRbac.mod.RoleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCan extends js.Object {
  var can: js.Array[String | RoleObject]
  var inherits: js.UndefOr[js.Array[String]] = js.undefined
}

object AnonCan {
  @scala.inline
  def apply(can: js.Array[String | RoleObject], inherits: js.Array[String] = null): AnonCan = {
    val __obj = js.Dynamic.literal(can = can.asInstanceOf[js.Any])
    if (inherits != null) __obj.updateDynamic("inherits")(inherits.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCan]
  }
}

