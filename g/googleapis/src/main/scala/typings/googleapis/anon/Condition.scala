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
  def apply(): Condition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Condition]
  }
  @scala.inline
  implicit class ConditionOps[Self <: Condition] (val x: Self) extends AnyVal {
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
    def setCondition(value: SchemaExpr): Self = this.set("condition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCondition: Self = this.set("condition", js.undefined)
    @scala.inline
    def setMembersVarargs(value: String*): Self = this.set("members", js.Array(value :_*))
    @scala.inline
    def setMembers(value: js.Array[String]): Self = this.set("members", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMembers: Self = this.set("members", js.undefined)
    @scala.inline
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRole: Self = this.set("role", js.undefined)
  }
  
}

