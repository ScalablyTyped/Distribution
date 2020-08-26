package typings.eslint.mod.ESLint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeprecatedRuleUse extends js.Object {
  var replacedBy: js.Array[String] = js.native
  var ruleId: String = js.native
}

object DeprecatedRuleUse {
  @scala.inline
  def apply(replacedBy: js.Array[String], ruleId: String): DeprecatedRuleUse = {
    val __obj = js.Dynamic.literal(replacedBy = replacedBy.asInstanceOf[js.Any], ruleId = ruleId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeprecatedRuleUse]
  }
  @scala.inline
  implicit class DeprecatedRuleUseOps[Self <: DeprecatedRuleUse] (val x: Self) extends AnyVal {
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
    def setReplacedByVarargs(value: String*): Self = this.set("replacedBy", js.Array(value :_*))
    @scala.inline
    def setReplacedBy(value: js.Array[String]): Self = this.set("replacedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setRuleId(value: String): Self = this.set("ruleId", value.asInstanceOf[js.Any])
  }
  
}

