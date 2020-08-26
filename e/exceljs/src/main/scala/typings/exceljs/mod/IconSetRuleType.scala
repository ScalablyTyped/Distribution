package typings.exceljs.mod

import typings.exceljs.exceljsStrings.iconSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconSetRuleType
  extends ConditionalFormattingBaseRule
     with ConditionalFormattingRule {
  var cfvo: js.UndefOr[js.Array[Cvfo]] = js.native
  var custom: js.UndefOr[Boolean] = js.native
  var iconSet: js.UndefOr[IconSetTypes] = js.native
  var reverse: js.UndefOr[Boolean] = js.native
  var showValue: js.UndefOr[Boolean] = js.native
  var `type`: iconSet = js.native
}

object IconSetRuleType {
  @scala.inline
  def apply(priority: Double, `type`: iconSet): IconSetRuleType = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconSetRuleType]
  }
  @scala.inline
  implicit class IconSetRuleTypeOps[Self <: IconSetRuleType] (val x: Self) extends AnyVal {
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
    def setType(value: iconSet): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setCfvoVarargs(value: Cvfo*): Self = this.set("cfvo", js.Array(value :_*))
    @scala.inline
    def setCfvo(value: js.Array[Cvfo]): Self = this.set("cfvo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCfvo: Self = this.set("cfvo", js.undefined)
    @scala.inline
    def setCustom(value: Boolean): Self = this.set("custom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustom: Self = this.set("custom", js.undefined)
    @scala.inline
    def setIconSet(value: IconSetTypes): Self = this.set("iconSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconSet: Self = this.set("iconSet", js.undefined)
    @scala.inline
    def setReverse(value: Boolean): Self = this.set("reverse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverse: Self = this.set("reverse", js.undefined)
    @scala.inline
    def setShowValue(value: Boolean): Self = this.set("showValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowValue: Self = this.set("showValue", js.undefined)
  }
  
}

