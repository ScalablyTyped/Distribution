package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.ApplyValidationResults
import typings.devextreme.anon.BrokenRule
import typings.devextreme.mod.DevExpress.DOMComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxValidatorOptions extends DOMComponentOptions[dxValidator] {
  /** @name dxValidator.Options.adapter */
  var adapter: js.UndefOr[ApplyValidationResults] = js.native
  /** @name dxValidator.Options.name */
  var name: js.UndefOr[String] = js.native
  /** @name dxValidator.Options.onValidated */
  var onValidated: js.UndefOr[js.Function1[/* validatedInfo */ BrokenRule, _]] = js.native
  /** @name dxValidator.Options.validationGroup */
  var validationGroup: js.UndefOr[String] = js.native
  /** @name dxValidator.Options.validationRules */
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.native
}

object dxValidatorOptions {
  @scala.inline
  def apply(): dxValidatorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxValidatorOptions]
  }
  @scala.inline
  implicit class dxValidatorOptionsOps[Self <: dxValidatorOptions] (val x: Self) extends AnyVal {
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
    def setAdapter(value: ApplyValidationResults): Self = this.set("adapter", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdapter: Self = this.set("adapter", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setOnValidated(value: /* validatedInfo */ BrokenRule => _): Self = this.set("onValidated", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnValidated: Self = this.set("onValidated", js.undefined)
    @scala.inline
    def setValidationGroup(value: String): Self = this.set("validationGroup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationGroup: Self = this.set("validationGroup", js.undefined)
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
  }
  
}

