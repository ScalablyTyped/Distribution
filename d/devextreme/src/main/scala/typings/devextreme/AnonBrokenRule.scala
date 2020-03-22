package typings.devextreme

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

trait AnonBrokenRule extends js.Object {
  var brokenRule: js.UndefOr[
    RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
  ] = js.undefined
  var brokenRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.undefined
  var isValid: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var status: js.UndefOr[valid | invalid | pending] = js.undefined
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object AnonBrokenRule {
  @scala.inline
  def apply(
    brokenRule: RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule = null,
    brokenRules: js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ] = null,
    isValid: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    status: valid | invalid | pending = null,
    validationRules: js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ] = null,
    value: js.Any = null
  ): AnonBrokenRule = {
    val __obj = js.Dynamic.literal()
    if (brokenRule != null) __obj.updateDynamic("brokenRule")(brokenRule.asInstanceOf[js.Any])
    if (brokenRules != null) __obj.updateDynamic("brokenRules")(brokenRules.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBrokenRule]
  }
}

