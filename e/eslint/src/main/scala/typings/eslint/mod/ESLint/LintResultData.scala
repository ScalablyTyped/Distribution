package typings.eslint.mod.ESLint

import org.scalablytyped.runtime.StringDictionary
import typings.eslint.mod.Rule.RuleMetaData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LintResultData extends js.Object {
  var rulesMeta: StringDictionary[RuleMetaData] = js.native
}

object LintResultData {
  @scala.inline
  def apply(rulesMeta: StringDictionary[RuleMetaData]): LintResultData = {
    val __obj = js.Dynamic.literal(rulesMeta = rulesMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[LintResultData]
  }
  @scala.inline
  implicit class LintResultDataOps[Self <: LintResultData] (val x: Self) extends AnyVal {
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
    def setRulesMeta(value: StringDictionary[RuleMetaData]): Self = this.set("rulesMeta", value.asInstanceOf[js.Any])
  }
  
}

