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
  /** A rule that failed to pass the check. Contains the first item from the brokenRules array. */
  var brokenRule: js.UndefOr[
    RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
  ] = js.undefined
  /** An array of the validationRules that failed to pass the check. */
  var brokenRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.undefined
  /** A promise that is fulfilled when all async rules are validated. */
  var complete: js.UndefOr[Promise[dxValidatorResult] | JQueryPromise[dxValidatorResult]] = js.undefined
  /** Indicates whether all the checked rules are satisfied. */
  var isValid: js.UndefOr[Boolean] = js.undefined
  /** An array of async rules whose promises are not fulfilled or rejected. Contains items only when the status is "pending". */
  var pendingRules: js.UndefOr[js.Array[AsyncRule]] = js.undefined
  /** Indicates the validation status. */
  var status: js.UndefOr[valid | invalid | pending] = js.undefined
  /** Validation rules specified for the Validator. */
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.undefined
  /** The value being validated. */
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

