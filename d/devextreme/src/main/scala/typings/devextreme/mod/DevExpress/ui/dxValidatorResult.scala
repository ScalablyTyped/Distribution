package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.invalid
import typings.devextreme.devextremeStrings.pending
import typings.devextreme.devextremeStrings.valid
import typings.devextreme.mod._Global_.JQueryPromise
import typings.devextreme.mod._Global_.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxValidatorResult extends js.Object {
  /** @name dxValidatorResult.brokenRule */
  var brokenRule: js.UndefOr[
    RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
  ] = js.undefined
  /** @name dxValidatorResult.brokenRules */
  var brokenRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.undefined
  /** @name dxValidatorResult.complete */
  var complete: js.UndefOr[Promise[dxValidatorResult] | JQueryPromise[dxValidatorResult]] = js.undefined
  /** @name dxValidatorResult.isValid */
  var isValid: js.UndefOr[Boolean] = js.undefined
  /** @name dxValidatorResult.pendingRules */
  var pendingRules: js.UndefOr[js.Array[AsyncRule]] = js.undefined
  /** @name dxValidatorResult.status */
  var status: js.UndefOr[valid | invalid | pending] = js.undefined
  /** @name dxValidatorResult.validationRules */
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.undefined
  /** @name dxValidatorResult.value */
  var value: js.UndefOr[js.Any] = js.undefined
}

object dxValidatorResult {
  @scala.inline
  def apply(
    brokenRule: RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule = null,
    brokenRules: js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ] = null,
    complete: Promise[dxValidatorResult] | JQueryPromise[dxValidatorResult] = null,
    isValid: js.UndefOr[Boolean] = js.undefined,
    pendingRules: js.Array[AsyncRule] = null,
    status: valid | invalid | pending = null,
    validationRules: js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ] = null,
    value: js.Any = null
  ): dxValidatorResult = {
    val __obj = js.Dynamic.literal()
    if (brokenRule != null) __obj.updateDynamic("brokenRule")(brokenRule.asInstanceOf[js.Any])
    if (brokenRules != null) __obj.updateDynamic("brokenRules")(brokenRules.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.asInstanceOf[js.Any])
    if (pendingRules != null) __obj.updateDynamic("pendingRules")(pendingRules.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxValidatorResult]
  }
}

