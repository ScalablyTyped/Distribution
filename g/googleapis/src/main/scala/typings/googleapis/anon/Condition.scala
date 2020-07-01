package typings.googleapis.anon

import typings.googleapis.storageV1Mod.storageV1.SchemaExpr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Condition extends js.Object {
  var condition: js.UndefOr[SchemaExpr] = js.native
  var members: js.UndefOr[js.Array[String]] = js.native
  var role: js.UndefOr[String] = js.native
}

object Condition {
  @scala.inline
  def apply(condition: SchemaExpr = null, members: js.Array[String] = null, role: String = null): Condition = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

