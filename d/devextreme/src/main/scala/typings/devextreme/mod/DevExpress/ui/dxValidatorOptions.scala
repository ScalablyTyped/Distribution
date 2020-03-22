package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonApplyValidationResults
import typings.devextreme.AnonBrokenRule
import typings.devextreme.AnonElement
import typings.devextreme.AnonModel
import typings.devextreme.AnonName
import typings.devextreme.mod.DevExpress.DOMComponentOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxValidatorOptions extends DOMComponentOptions[dxValidator] {
  /** An object that specifies what and when to validate, and how to apply the validation result. */
  var adapter: js.UndefOr[AnonApplyValidationResults] = js.undefined
  /** Specifies the editor name to be used in the validation default messages. */
  var name: js.UndefOr[String] = js.undefined
  /** A function that is executed after a value is validated. */
  var onValidated: js.UndefOr[js.Function1[/* validatedInfo */ AnonBrokenRule, _]] = js.undefined
  /** Specifies the validation group the editor will be related to. */
  var validationGroup: js.UndefOr[String] = js.undefined
  /** An array of validation rules to be checked for the editor with which the dxValidator object is associated. */
  var validationRules: js.UndefOr[
    js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ]
  ] = js.undefined
}

object dxValidatorOptions {
  @scala.inline
  def apply(
    adapter: AnonApplyValidationResults = null,
    bindingOptions: js.Any = null,
    elementAttr: js.Any = null,
    height: Double | String | (js.Function0[Double | String]) = null,
    name: String = null,
    onDisposing: /* e */ AnonModel[dxValidator] => _ = null,
    onInitialized: /* e */ AnonElement[dxValidator] => _ = null,
    onOptionChanged: /* e */ AnonName[dxValidator] => _ = null,
    onValidated: /* validatedInfo */ AnonBrokenRule => _ = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    validationGroup: String = null,
    validationRules: js.Array[
      RequiredRule | NumericRule | RangeRule | StringLengthRule | CustomRule | CompareRule | PatternRule | EmailRule | AsyncRule
    ] = null,
    width: Double | String | (js.Function0[Double | String]) = null
  ): dxValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onValidated != null) __obj.updateDynamic("onValidated")(js.Any.fromFunction1(onValidated))
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (validationGroup != null) __obj.updateDynamic("validationGroup")(validationGroup.asInstanceOf[js.Any])
    if (validationRules != null) __obj.updateDynamic("validationRules")(validationRules.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxValidatorOptions]
  }
}

