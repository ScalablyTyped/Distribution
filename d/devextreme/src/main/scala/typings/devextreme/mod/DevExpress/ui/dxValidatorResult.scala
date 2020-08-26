package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.invalid
import typings.devextreme.devextremeStrings.pending
import typings.devextreme.devextremeStrings.valid
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxValidatorResult extends js.Object {
  /** @name dxValidatorResult.brokenRule */
  var brokenRule: js.UndefOr[
    RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
  ] = js.native
  /** @name dxValidatorResult.brokenRules */
  var brokenRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.native
  /** @name dxValidatorResult.complete */
  var complete: js.UndefOr[Promise[dxValidatorResult] | JQueryPromise[dxValidatorResult]] = js.native
  /** @name dxValidatorResult.isValid */
  var isValid: js.UndefOr[Boolean] = js.native
  /** @name dxValidatorResult.pendingRules */
  var pendingRules: js.UndefOr[js.Array[AsyncRule]] = js.native
  /** @name dxValidatorResult.status */
  var status: js.UndefOr[valid | invalid | pending] = js.native
  /** @name dxValidatorResult.validationRules */
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.native
  /** @name dxValidatorResult.value */
  var value: js.UndefOr[js.Any] = js.native
}

object dxValidatorResult {
  @scala.inline
  def apply(): dxValidatorResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxValidatorResult]
  }
  @scala.inline
  implicit class dxValidatorResultOps[Self <: dxValidatorResult] (val x: Self) extends AnyVal {
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
    def setComplete(value: Promise[dxValidatorResult] | JQueryPromise[dxValidatorResult]): Self = this.set("complete", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsValid: Self = this.set("isValid", js.undefined)
    @scala.inline
    def setPendingRulesVarargs(value: AsyncRule*): Self = this.set("pendingRules", js.Array(value :_*))
    @scala.inline
    def setPendingRules(value: js.Array[AsyncRule]): Self = this.set("pendingRules", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingRules: Self = this.set("pendingRules", js.undefined)
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

