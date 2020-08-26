package typings.googleCloudStorage.iamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PolicyBinding extends js.Object {
  var condition: js.UndefOr[Expr] = js.native
  var members: js.Array[String] = js.native
  var role: String = js.native
}

object PolicyBinding {
  @scala.inline
  def apply(members: js.Array[String], role: String): PolicyBinding = {
    val __obj = js.Dynamic.literal(members = members.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[PolicyBinding]
  }
  @scala.inline
  implicit class PolicyBindingOps[Self <: PolicyBinding] (val x: Self) extends AnyVal {
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
    def setMembersVarargs(value: String*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[String]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def setCondition(value: Expr): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
  }
  
}

