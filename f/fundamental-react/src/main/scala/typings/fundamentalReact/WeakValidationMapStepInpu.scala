package typings.fundamentalReact

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/StepInput/StepInput.StepInputProps> */
trait WeakValidationMapStepInpu extends js.Object {
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var localizedText: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.undefined
  var placeholder: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var readOnly: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var validationState: js.UndefOr[Validator[js.UndefOr[AnonState | Null]]] = js.undefined
  var value: js.UndefOr[Validator[js.UndefOr[Double | Null]]] = js.undefined
}

object WeakValidationMapStepInpu {
  @scala.inline
  def apply(
    className: Validator[js.UndefOr[Null | String]] = null,
    disableStyles: Validator[js.UndefOr[Boolean | Null]] = null,
    disabled: Validator[js.UndefOr[Boolean | Null]] = null,
    localizedText: Validator[js.UndefOr[_ | Null]] = null,
    placeholder: Validator[js.UndefOr[Null | String]] = null,
    readOnly: Validator[js.UndefOr[Boolean | Null]] = null,
    validationState: Validator[js.UndefOr[AnonState | Null]] = null,
    value: Validator[js.UndefOr[Double | Null]] = null
  ): WeakValidationMapStepInpu = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (disableStyles != null) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (localizedText != null) __obj.updateDynamic("localizedText")(localizedText.asInstanceOf[js.Any])
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (readOnly != null) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (validationState != null) __obj.updateDynamic("validationState")(validationState.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapStepInpu]
  }
}

