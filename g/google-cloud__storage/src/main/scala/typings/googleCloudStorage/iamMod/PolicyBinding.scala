package typings.googleCloudStorage.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PolicyBinding extends js.Object {
  var condition: js.UndefOr[Expr] = js.undefined
  var members: js.Array[String]
  var role: String
}

object PolicyBinding {
  @scala.inline
  def apply(members: js.Array[String], role: String, condition: Expr = null): PolicyBinding = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    if (condition != null) __obj.updateDynamic("condition")(condition.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyBinding]
  }
}

