package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.invalid
import typings.devextreme.devextremeStrings.pending
import typings.devextreme.devextremeStrings.valid
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxValidationGroupResult extends js.Object {
  /** @name dxValidationGroupResult.brokenRules */
  var brokenRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.undefined
  /** @name dxValidationGroupResult.complete */
  var complete: js.UndefOr[Promise[dxValidationGroupResult] | JQueryPromise[dxValidationGroupResult]] = js.undefined
  /** @name dxValidationGroupResult.isValid */
  var isValid: js.UndefOr[Boolean] = js.undefined
  /** @name dxValidationGroupResult.status */
  var status: js.UndefOr[valid | invalid | pending] = js.undefined
  /** @name dxValidationGroupResult.validators */
  var validators: js.UndefOr[js.Array[_]] = js.undefined
}

object dxValidationGroupResult {
  @scala.inline
  def apply(
    brokenRules: js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ] = null,
    complete: Promise[dxValidationGroupResult] | JQueryPromise[dxValidationGroupResult] = null,
    isValid: js.UndefOr[Boolean] = js.undefined,
    status: valid | invalid | pending = null,
    validators: js.Array[_] = null
  ): dxValidationGroupResult = {
    val __obj = js.Dynamic.literal()
    if (brokenRules != null) __obj.updateDynamic("brokenRules")(brokenRules.asInstanceOf[js.Any])
    if (complete != null) __obj.updateDynamic("complete")(complete.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.get.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (validators != null) __obj.updateDynamic("validators")(validators.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxValidationGroupResult]
  }
}

