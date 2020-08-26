package typings.exceljs.mod

import typings.exceljs.exceljsStrings.top10
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Top10RuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  var bottom: Boolean = js.native
  var percent: Boolean = js.native
  var rank: Double = js.native
  var `type`: top10 = js.native
}

object Top10RuleType {
  @scala.inline
  def apply(bottom: Boolean, percent: Boolean, priority: Double, rank: Double, `type`: top10): Top10RuleType = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], percent = percent.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], rank = rank.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Top10RuleType]
  }
  @scala.inline
  implicit class Top10RuleTypeOps[Self <: Top10RuleType] (val x: Self) extends AnyVal {
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
    def setBottom(value: Boolean): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercent(value: Boolean): Self = this.set("percent", value.asInstanceOf[js.Any])
    @scala.inline
    def setRank(value: Double): Self = this.set("rank", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: top10): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

