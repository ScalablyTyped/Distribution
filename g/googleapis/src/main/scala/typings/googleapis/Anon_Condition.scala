package typings.googleapis

import typings.googleapis.buildSrcApisStorageV1Mod.storage_v1.Schema$Expr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Condition extends js.Object {
  var condition: js.UndefOr[Schema$Expr] = js.native
  var members: js.UndefOr[js.Array[String]] = js.native
  var role: js.UndefOr[String] = js.native
}

object Anon_Condition {
  @scala.inline
  def apply(condition: Schema$Expr = null, members: js.Array[String] = null, role: String = null): Anon_Condition = {
    val __obj = js.Dynamic.literal()
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    if (members != null) __obj.updateDynamic("members")(members.asInstanceOf[js.Any])
    if (role != null) __obj.updateDynamic("role")(role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Condition]
  }
}

