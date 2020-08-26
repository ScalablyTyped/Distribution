package typings.exceljs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConditionalFormattingOptions extends js.Object {
  var ref: String = js.native
  var rules: js.Array[ConditionalFormattingRule] = js.native
}

object ConditionalFormattingOptions {
  @scala.inline
  def apply(ref: String, rules: js.Array[ConditionalFormattingRule]): ConditionalFormattingOptions = {
    val __obj = js.Dynamic.literal(ref = ref.asInstanceOf[js.Any], rules = rules.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConditionalFormattingOptions]
  }
  @scala.inline
  implicit class ConditionalFormattingOptionsOps[Self <: ConditionalFormattingOptions] (val x: Self) extends AnyVal {
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
    def setRef(value: String): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setRulesVarargs(value: ConditionalFormattingRule*): Self = this.set("rules", js.Array(value :_*))
    @scala.inline
    def setRules(value: js.Array[ConditionalFormattingRule]): Self = this.set("rules", value.asInstanceOf[js.Any])
  }
  
}

