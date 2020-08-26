package typings.devextreme.anon

import typings.devextreme.devextremeStrings.invalid
import typings.devextreme.devextremeStrings.pending
import typings.devextreme.devextremeStrings.valid
import typings.devextreme.mod.DevExpress.ui.AsyncRule
import typings.devextreme.mod.DevExpress.ui.CompareRule
import typings.devextreme.mod.DevExpress.ui.CustomRule
import typings.devextreme.mod.DevExpress.ui.EmailRule
import typings.devextreme.mod.DevExpress.ui.NumericRule
import typings.devextreme.mod.DevExpress.ui.PatternRule
import typings.devextreme.mod.DevExpress.ui.RangeRule
import typings.devextreme.mod.DevExpress.ui.RequiredRule
import typings.devextreme.mod.DevExpress.ui.StringLengthRule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokenRule extends js.Object {
  var brokenRule: js.UndefOr[
    RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
  ] = js.native
  var brokenRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.native
  var isValid: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var status: js.UndefOr[valid | invalid | pending] = js.native
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.native
  var value: js.UndefOr[js.Any] = js.native
}

object BrokenRule {
  @scala.inline
  def apply(): BrokenRule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrokenRule]
  }
  @scala.inline
  implicit class BrokenRuleOps[Self <: BrokenRule] (val x: Self) extends AnyVal {
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
    def setBrokenRule(
      value: RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ): Self = this.set("brokenRule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrokenRule: Self = this.set("brokenRule", js.undefined)
    @scala.inline
    def setBrokenRulesVarargs(
      value: (RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule)*
    ): Self = this.set("brokenRules", js.Array(value :_*))
    @scala.inline
    def setBrokenRules(
      value: js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ]
    ): Self = this.set("brokenRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBrokenRules: Self = this.set("brokenRules", js.undefined)
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStatus(value: valid | invalid | pending): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setValidationRulesVarargs(
      value: (RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule)*
    ): Self = this.set("validationRules", js.Array(value :_*))
    @scala.inline
    def setValidationRules(
      value: js.Array[
          RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
        ]
    ): Self = this.set("validationRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationRules: Self = this.set("validationRules", js.undefined)
    @scala.inline
    def setValue(value: js.Any): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

