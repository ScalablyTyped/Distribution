package typings.fundamentalReact.anon

import typings.react.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined react.react.WeakValidationMap<fundamental-react.fundamental-react/lib/Switch/Switch.SwitchProps> */
trait WeakValidationMapSwitchPr extends js.Object {
  var checked: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var className: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var compact: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var disableStyles: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var disabled: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
  var id: js.UndefOr[Validator[js.UndefOr[Null | String]]] = js.undefined
  var inputProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.undefined
  var internalLabels: js.UndefOr[Validator[js.UndefOr[Checked | Null]]] = js.undefined
  var labelProps: js.UndefOr[Validator[js.UndefOr[_ | Null]]] = js.undefined
  var onChange: js.UndefOr[Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]]] = js.undefined
  var semantic: js.UndefOr[Validator[js.UndefOr[Boolean | Null]]] = js.undefined
}

object WeakValidationMapSwitchPr {
  @scala.inline
  def apply(
    checked: Validator[js.UndefOr[Boolean | Null]] = null,
    className: Validator[js.UndefOr[Null | String]] = null,
    compact: Validator[js.UndefOr[Boolean | Null]] = null,
    disableStyles: Validator[js.UndefOr[Boolean | Null]] = null,
    disabled: Validator[js.UndefOr[Boolean | Null]] = null,
    id: Validator[js.UndefOr[Null | String]] = null,
    inputProps: Validator[js.UndefOr[_ | Null]] = null,
    internalLabels: Validator[js.UndefOr[Checked | Null]] = null,
    labelProps: Validator[js.UndefOr[_ | Null]] = null,
    onChange: Validator[js.UndefOr[(js.Function1[/* repeated */ _, _]) | Null]] = null,
    semantic: Validator[js.UndefOr[Boolean | Null]] = null
  ): WeakValidationMapSwitchPr = {
    val __obj = js.Dynamic.literal()
    if (checked != null) __obj.updateDynamic("checked")(checked.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (disableStyles != null) __obj.updateDynamic("disableStyles")(disableStyles.asInstanceOf[js.Any])
    if (disabled != null) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (inputProps != null) __obj.updateDynamic("inputProps")(inputProps.asInstanceOf[js.Any])
    if (internalLabels != null) __obj.updateDynamic("internalLabels")(internalLabels.asInstanceOf[js.Any])
    if (labelProps != null) __obj.updateDynamic("labelProps")(labelProps.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(onChange.asInstanceOf[js.Any])
    if (semantic != null) __obj.updateDynamic("semantic")(semantic.asInstanceOf[js.Any])
    __obj.asInstanceOf[WeakValidationMapSwitchPr]
  }
}

